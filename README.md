# gew-protobuf

## Required

```
brew install prototool
```

```
GO111MODULE=off go get -d github.com/envoyproxy/protoc-gen-validate
cd $GOPATH/src/github.com/envoyproxy/protoc-gen-validate
git checkout v0.2.0-java
make build
```

```
go get -d -u github.com/golang/protobuf/protoc-gen-go
go install github.com/golang/protobuf/protoc-gen-go
```

## Usage

See Makefile
