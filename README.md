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

### When running for internal cci

### Run

```
docker compose -f docker-compose-internal.yml up -d
```