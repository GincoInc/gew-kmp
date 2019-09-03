# gew-protobuf

## Requirements
- Amazon DynamoDB
- Amazon S3
- AWS Key Management Service x 2

## Usage

### Preparation

```
# Set config.toml
cp configs/config.toml.example configs/config.toml

# Set .env
cp .env.example .env
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
