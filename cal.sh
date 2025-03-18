grpcurl -plaintext -d '{
  "wallet_id": "8f773760-f747-4240-8970-29ab2de3db0f",
  "address": "0xa974b750e11de58c3f51f42fe76e16a1b5f1128a1aed264e46360fb3cae6ab66",
  "string_value": "100.0"
}' \
localhost:50051 adamant.teller.v1.TellerAPI.CalculateFee

