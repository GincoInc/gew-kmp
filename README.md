# gew-kmp

## Requirements

- Amazon DynamoDB
- Amazon S3
- AWS Key Management Service x 2

## Usage

### Preparation

```
# Set config.toml
cp configs/teller/config.toml.example configs/teller/config.toml

# Set .env
cp envs/teller/.env.example envs/teller/.env
```

### File permissions (teller v2.84.0 and later)

Since teller v2.84.0 the `ginco/teller` image runs as the unprivileged user uid 10001 / gid 10001, not as root.
Every file you bind-mount into the container must be readable by uid 10001, otherwise teller fails at startup:

- `configs/teller/config.toml` (`/root/configs/config.toml`)
- `certs/tls.crt` (`/root/certs/tls.crt`, `docker-compose.yml`)
- `certs/chain.crt` and `certs/client.key` (`/root/certs/...`, `docker-compose-mtls.yml`)

Configuration and certificates can be world-readable:

```
chmod 0644 configs/teller/config.toml certs/tls.crt certs/chain.crt
```

Keep the mTLS private key private, and let uid 10001 read it in one of these ways:

```
# owned by uid 10001, readable by its owner only
sudo chown 10001 certs/client.key && chmod 0400 certs/client.key

# or: group 10001, group-readable
sudo chgrp 10001 certs/client.key && chmod 0640 certs/client.key
```

A private key at mode 0600 owned by another host user can no longer be read.
With user-namespace remapping (userns-remap, rootless Docker, Podman) the container's uid and gid 10001 are other ids on
the host, so a file owned by host uid or gid 10001 is not readable. Give the private key to the host ids that container uid
and gid 10001 map to, as `/proc/<pid>/uid_map` and `gid_map` of a container process show (with one subordinate range: the
range's start plus 10001 for userns-remap, plus 10000 for rootless Docker, where container id 0 is your own user); with
Podman, `podman unshare chown 10001:10001 certs/client.key` does this for you. With rootless Docker or Podman and the
default mapping, you can instead keep the key at mode 0640 in your primary group (gid 0 in the container) and add
`group_add: ["0"]` to the `teller` service. Under remapping, `user: "0:0"` below is the namespace's root, not the host's.

Escape hatch: to keep the previous root behaviour without changing any file, add `user: "0:0"` to the `teller` service
(or pass `--user 0` to `docker run`):

```
services:
  teller:
    image: ginco/teller:v2.84.0
    user: "0:0"
```

`HOME` is no longer `/root`, so AWS credentials mounted at `/root/.aws` are not found.
Set the `AWS_*` variables in `envs/teller/.env` (as in `.env.example`) or set `AWS_SHARED_CREDENTIALS_FILE`.
teller does not write to the filesystem.

### Proxy

teller's connections to GEW (gRPC) and AWS honour the standard proxy environment variables
`HTTPS_PROXY`, `HTTP_PROXY` and `NO_PROXY` (or their lower-case forms). Since teller v2.84.0, webhook deliveries honour them too;
earlier versions always connected to the webhook endpoint directly. If these variables are set in teller's environment
for another purpose, list the webhook host in `NO_PROXY` to keep direct delivery.

### Run

```
docker-compose up -d
```

### CUI

```
make evans
```

### When running for internal cci

### Run

```
docker compose -f docker-compose-internal.yml up -d
```

## Upgrading to teller v2.84.0

Check the following before you move to `ginco/teller:v2.84.0`. teller's release notes have the details.

- **File permissions:** the image runs as uid 10001; see [File permissions](#file-permissions-teller-v2840-and-later).
- **`isPolkadotMigrationCompleted` is removed:** remove the key from your `config.toml`. teller always uses the post-migration Polkadot signing payload (the former `true` behaviour).
- **Unknown configuration keys** are logged at startup in one WARN line (`The configuration file has unknown keys...`) and otherwise ignored; a future major release will refuse to start with them.
- **`shutdownPeriodSeconds` takes whole seconds** (for example `30`). Other values still start teller with a WARN; a duration string such as `"30s"`, which earlier versions read as no wait, now gives that duration.
- **Webhook proxy:** see [Proxy](#proxy).
- **TellerAPI no longer has `SignBitcoinDelegation` and `ListBitcoinDelegationsByFilter`** (Babylon BTC staking retired from GEW). Calls fail with `Unimplemented`. The protos and generated clients in this repository no longer have them.
- **Error codes:** errors teller raised without a gRPC code are now returned as `Internal` instead of `Unknown`. A client that tells errors apart by `Unknown` should treat `Internal` the same way.
- **AWS:** teller uses aws-sdk-go-v2. Credentials, regions and permissions are unchanged, but when an AWS key pair is not set and `AWS_PROFILE` names a profile that does not exist, teller now fails to start; `AWS_ENDPOINT_URL*` is ignored. The S3 object `healthcheck` is written once at each start instead of every 30 seconds.
- **XRP token (RLUSD) payments:** let every pending XRP token payment be signed and sent before the upgrade. Some amounts are encoded differently from v2.84.0 on, and a pending payment of such an amount built before the upgrade cannot be completed after it.
- **Retired coins:** teller refuses to sign for BABY (and BTC staking actions), RYO, BERA, HBAR and the HTS tokens, MONA, XEM, XYM, ETC, ALGO and DOGE, which GEW has retired.
