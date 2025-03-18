grpcurl -plaintext -d '{
  "wallet_id": "8f773760-f747-4240-8970-29ab2de3db0f"
}' \
localhost:50051 adamant.teller.v1.TellerAPI.FlushBalance
