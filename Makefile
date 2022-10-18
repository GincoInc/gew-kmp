export GO111MODULE=on
BIN := $(abspath ./bin)
GO_ENV ?= GOBIN=$(BIN)

$(BIN)/buf:
	test -f $(BIN)/buf || $(GO_ENV) go install github.com/bufbuild/buf/cmd/buf@v1.3.1
$(BIN)/protodep:
	test -f $(BIN)/protodep || $(GO_ENV) go install github.com/stormcat24/protodep@v0.1.7
$(BIN)/protoc-gen-go:
	test -f $(BIN)/protoc-gen-go || $(GO_ENV) go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.28.0
$(BIN)/protoc-gen-validate:
	test -f $(BIN)/protoc-gen-validate || $(GO_ENV) go install github.com/envoyproxy/protoc-gen-validate@v0.6.0
$(BIN)/evans:
	test -f $(BIN)/evans || $(GO_ENV) go install github.com/ktr0731/evans@v0.10.9

.PHONY: vendor
vendor:
	go mod vendor

.PHONY: tidy
tidy:
	go mod tidy

.PHONY: generate
generate: $(BIN)/buf $(BIN)/protoc-gen-go $(BIN)/protoc-gen-validate
	@rm -r ./gen || :
	$(BIN)/buf generate --path ./api/proto/gincoinc

.PHONY: protodep-up
protodep-up: SSH_KEY ?= github_id_rsa
protodep-up: $(BIN)/protodep
	@$(BIN)/protodep up -f --identity-file=$(SSH_KEY)
	find ./api/proto/gincoinc -type f | xargs sed -i '' -e 's/GincoInc\/protobuf\/gen\/go/GincoInc\/gew-kmp\/gen/g'

.PHONY: evans
evans: $(BIN)/evans
	@cd ./api/proto && $(BIN)/evans --path=./../../vendor --path=. --port 50051 --package adamant.teller.v1 --service TellerAPI ./gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto
