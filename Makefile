generate:
	@rm -r ./gen && prototool generate

protoDoc:
	protoc -I vendor/ --doc_out=./docs --doc_opt=markdown,README.md \
	vendor/gincoinc/global/v1/gincoincglobalv1/* \
	vendor/gincoinc/adamant/global/v1/adamantglobalv1/* \
	vendor/gincoinc/adamant/teller/v1/adamanttellerv1/* 
	protoc -I vendor/ --doc_out=./docs --doc_opt=html,index.html \
	vendor/gincoinc/global/v1/gincoincglobalv1/* \
	vendor/gincoinc/adamant/global/v1/adamantglobalv1/* \
	vendor/gincoinc/adamant/teller/v1/adamanttellerv1/*
