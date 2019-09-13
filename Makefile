generate:
	@protodep up -f
	@rm -r ./api/proto/gincoinc
	@mv -f ./vendor/gincoinc ./api/proto
	@rm -r ./gen && cd ./api/proto && prototool generate

evans:
	@cd ./api/proto && evans ./gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto --path=./../../vendor --port 50051 --package adamant.teller.v1 --service TellerAPI
