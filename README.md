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

### Run

```
docker-compose up -d
```

### CUI

```
make evans
```

### Updates for internal cci access (preparation steps remain same)

```
# Add below values in config.toml

internal = true
certFile = "/root/certs/tls.crt"
```

```
# Add below volume in docker-compose-internal.yml

- "./certs/tls.crt:/root/certs/tls.crt"
```

```
# Use update teller image in docker-compose-internal.yml

image: ginco/teller:v2.68.0
```