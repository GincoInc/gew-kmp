export GO111MODULE=on

vendor:
	go mod vendor

tidy:
	go mod tidy

generate:
	@protodep up -f
	@rm -r ./api/proto/gincoinc
	@mv -f ./vendor/gincoinc ./api/proto
	@cd ./api/proto && prototool generate

evans:
	@cd ./api/proto && evans --path=./../../vendor --path=. --port 50051 --package adamant.teller.v1 --service TellerAPI ./gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto
