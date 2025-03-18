grpcurl -plaintext -d '{
  "wallet_id": "4b34f761-00e5-4a41-9b81-aeb61eda1445",
  "transaction_id": "efa1d5a3-b889-45ec-9352-8defce710b88"
}' \
localhost:50051 adamant.teller.v1.TellerAPI.GetTransaction

