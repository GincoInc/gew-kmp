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
cp configs/postbox/config.toml.example configs/postbox/config.toml

# Set .env
cp envs/teller/.env.example envs/teller/.env
cp envs/postbox/.env.example envs/postbox/.env
```

### Run

```
docker-compose up -d
```

### CUI

```
# Install
brew tap ktr0731/evans
brew install evans

make evans
```
