export GO111MODULE=on
BIN := $(abspath ./bin)
GO_ENV ?= GOBIN=$(BIN)

BUF_VERSION := 1.3.1
UNAME_S := $(shell uname -s)
UNAME_M := $(shell uname -m)

ifeq ($(UNAME_S), Darwin)
	SED_COMMAND ?= sed -i '' -e
else
	SED_COMMAND ?= sed -i -e
endif

$(BIN)/buf:
	test -f $(BIN)/buf || $(GO_ENV) go install github.com/bufbuild/buf/cmd/buf@v1.8
$(BIN)/protodep:
	test -f $(BIN)/protodep || $(GO_ENV) go install github.com/stormcat24/protodep@v0.1.7
$(BIN)/protoc-gen-go:
	test -f $(BIN)/protoc-gen-go || $(GO_ENV) go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.28.0
$(BIN)/protoc-gen-go-grpc:
	test -f $(BIN)/protoc-gen-go-grpc || $(GO_ENV) go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.2.0
$(BIN)/protoc-gen-validate:
	test -f $(BIN)/protoc-gen-validate || $(GO_ENV) go install github.com/envoyproxy/protoc-gen-validate@v0.6.12
$(BIN)/evans:
	test -f $(BIN)/evans || $(GO_ENV) go install github.com/ktr0731/evans@v0.10.9

.PHONY: vendor
vendor:
	go mod vendor

.PHONY: tidy
tidy:
	go mod tidy

.PHONY: generate
generate: $(BIN)/buf $(BIN)/protoc-gen-go $(BIN)/protoc-gen-go-grpc $(BIN)/protoc-gen-validate
	@rm -r ./gen || :
	$(BIN)/buf generate --path ./api/proto/gincoinc
	$(BIN)/buf generate --path ./api/proto/validate --template buf.gen-py.yaml
	sh ./scripts/fix_import_py.sh

.PHONY: protodep-up
protodep-up: SSH_KEY ?= github_id_rsa
protodep-up: $(BIN)/protodep
	@$(BIN)/protodep up -f --identity-file=$(SSH_KEY)
	find ./api/proto/gincoinc -type f | xargs $(SED_COMMAND) 's/GincoInc\/protobuf\/gen\/go/GincoInc\/gew-kmp\/gen/g'

.PHONY: evans
evans: $(BIN)/evans
	@cd ./api/proto && $(BIN)/evans --path=./../../vendor --path=. --port 50051 --package adamant.teller.v1 --service TellerAPI ./gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

breaking:
	$(BIN)/buf breaking --against "https://github.com/GincoInc/gew-kmp.git#branch=master"
