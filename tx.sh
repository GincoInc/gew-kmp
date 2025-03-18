grpcurl -plaintext -d '{
  "wallet_id": "d4251274-3b56-4f43-8a77-091f89a17438",
  "address": "0xd122d89f7cccaadbfa85f49a7ee5fafaaab9716ba9ad3263ce13776c4b511fef",
  "string_value": "0",
  "sui_specific": {
    "send_all": true
  }
}' \
localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction
