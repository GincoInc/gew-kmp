# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [gincoinc/global/v1/gincoincglobalv1/enum.proto](#gincoinc/global/v1/gincoincglobalv1/enum.proto)
  
    - [AddressType](#gincoinc.global.v1.AddressType)
    - [Coin](#gincoinc.global.v1.Coin)
    - [Network](#gincoinc.global.v1.Network)
    - [TransactionState](#gincoinc.global.v1.TransactionState)
    - [TransferType](#gincoinc.global.v1.TransferType)
    - [UTXOState](#gincoinc.global.v1.UTXOState)
  
  
  

- [gincoinc/global/v1/gincoincglobalv1/model.proto](#gincoinc/global/v1/gincoincglobalv1/model.proto)
    - [TransactionUpdateEvent](#gincoinc.global.v1.TransactionUpdateEvent)
  
  
  
  

- [gincoinc/adamant/global/v1/adamantglobalv1/enum.proto](#gincoinc/adamant/global/v1/adamantglobalv1/enum.proto)
  
    - [AccountType](#adamant.global.v1.AccountType)
    - [AddressState](#adamant.global.v1.AddressState)
    - [NotificationType](#adamant.global.v1.NotificationType)
    - [PolicyType](#adamant.global.v1.PolicyType)
    - [ResourceType](#adamant.global.v1.ResourceType)
    - [RoleType](#adamant.global.v1.RoleType)
    - [TokenType](#adamant.global.v1.TokenType)
    - [TransactionState](#adamant.global.v1.TransactionState)
    - [UserState](#adamant.global.v1.UserState)
    - [WalletState](#adamant.global.v1.WalletState)
    - [WalletType](#adamant.global.v1.WalletType)
  
  
  

- [gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto](#gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto)
    - [ApproveLabeledAddressRequest](#adamant.global.v1.ApproveLabeledAddressRequest)
    - [ApproveTransactionRequest](#adamant.global.v1.ApproveTransactionRequest)
    - [ApproveTransferLimitRequest](#adamant.global.v1.ApproveTransferLimitRequest)
    - [ApproveWalletRequest](#adamant.global.v1.ApproveWalletRequest)
    - [ArchiveWalletRequest](#adamant.global.v1.ArchiveWalletRequest)
    - [CalculateFeeRequest](#adamant.global.v1.CalculateFeeRequest)
    - [CalculateFeeResponse](#adamant.global.v1.CalculateFeeResponse)
    - [CancelTransactionRequest](#adamant.global.v1.CancelTransactionRequest)
    - [CancelWalletRequest](#adamant.global.v1.CancelWalletRequest)
    - [CreateAddressRequest](#adamant.global.v1.CreateAddressRequest)
    - [CreateLabeledAddressRequest](#adamant.global.v1.CreateLabeledAddressRequest)
    - [CreatePolicyRequest](#adamant.global.v1.CreatePolicyRequest)
    - [CreateTransactionRequest](#adamant.global.v1.CreateTransactionRequest)
    - [CreateTransferLimitRequest](#adamant.global.v1.CreateTransferLimitRequest)
    - [CreateWalletRequest](#adamant.global.v1.CreateWalletRequest)
    - [CreateWhitelistRequest](#adamant.global.v1.CreateWhitelistRequest)
    - [DeleteLabeledAddressRequest](#adamant.global.v1.DeleteLabeledAddressRequest)
    - [DeletePolicyRequest](#adamant.global.v1.DeletePolicyRequest)
    - [DeleteTransferLimitRequest](#adamant.global.v1.DeleteTransferLimitRequest)
    - [DeleteWhitelistRequest](#adamant.global.v1.DeleteWhitelistRequest)
    - [GetAddressRequest](#adamant.global.v1.GetAddressRequest)
    - [GetLabeledAddressRequest](#adamant.global.v1.GetLabeledAddressRequest)
    - [GetMembersDeactivatabilitiesRequest](#adamant.global.v1.GetMembersDeactivatabilitiesRequest)
    - [GetMembersDeactivatabilitiesResponse](#adamant.global.v1.GetMembersDeactivatabilitiesResponse)
    - [GetNextHdAccountRequest](#adamant.global.v1.GetNextHdAccountRequest)
    - [GetNextHdAccountResponse](#adamant.global.v1.GetNextHdAccountResponse)
    - [GetPolicyRequest](#adamant.global.v1.GetPolicyRequest)
    - [GetSignInfoRequest](#adamant.global.v1.GetSignInfoRequest)
    - [GetSpendableBalanceRequest](#adamant.global.v1.GetSpendableBalanceRequest)
    - [GetSpendableBalanceResponse](#adamant.global.v1.GetSpendableBalanceResponse)
    - [GetTransactionRequest](#adamant.global.v1.GetTransactionRequest)
    - [GetTransferLimitRequest](#adamant.global.v1.GetTransferLimitRequest)
    - [GetWalletRequest](#adamant.global.v1.GetWalletRequest)
    - [GetWhitelistRequest](#adamant.global.v1.GetWhitelistRequest)
    - [ListAddressesRequest](#adamant.global.v1.ListAddressesRequest)
    - [ListAddressesResponse](#adamant.global.v1.ListAddressesResponse)
    - [ListLabeledAddressesRequest](#adamant.global.v1.ListLabeledAddressesRequest)
    - [ListLabeledAddressesResponse](#adamant.global.v1.ListLabeledAddressesResponse)
    - [ListPoliciesRequest](#adamant.global.v1.ListPoliciesRequest)
    - [ListPoliciesResponse](#adamant.global.v1.ListPoliciesResponse)
    - [ListRatesResponse](#adamant.global.v1.ListRatesResponse)
    - [ListSignInfoRequest](#adamant.global.v1.ListSignInfoRequest)
    - [ListSignInfoResponse](#adamant.global.v1.ListSignInfoResponse)
    - [ListTransactionsRequest](#adamant.global.v1.ListTransactionsRequest)
    - [ListTransactionsResponse](#adamant.global.v1.ListTransactionsResponse)
    - [ListTransferLimitsRequest](#adamant.global.v1.ListTransferLimitsRequest)
    - [ListTransferLimitsResponse](#adamant.global.v1.ListTransferLimitsResponse)
    - [ListTransfersRequest](#adamant.global.v1.ListTransfersRequest)
    - [ListTransfersResponse](#adamant.global.v1.ListTransfersResponse)
    - [ListWalletsRequest](#adamant.global.v1.ListWalletsRequest)
    - [ListWalletsResponse](#adamant.global.v1.ListWalletsResponse)
    - [ListWhitelistsRequest](#adamant.global.v1.ListWhitelistsRequest)
    - [ListWhitelistsResponse](#adamant.global.v1.ListWhitelistsResponse)
    - [RegisterKeyRequest](#adamant.global.v1.RegisterKeyRequest)
    - [SendTransactionRequest](#adamant.global.v1.SendTransactionRequest)
    - [SignTransactionRequest](#adamant.global.v1.SignTransactionRequest)
    - [UnArchiveWalletRequest](#adamant.global.v1.UnArchiveWalletRequest)
    - [UpdateLabeledAddressRequest](#adamant.global.v1.UpdateLabeledAddressRequest)
    - [UpdatePolicyRequest](#adamant.global.v1.UpdatePolicyRequest)
    - [UpdateTransferLimitRequest](#adamant.global.v1.UpdateTransferLimitRequest)
    - [UpdateWalletPolicyRequest](#adamant.global.v1.UpdateWalletPolicyRequest)
    - [UpdateWhitelistRequest](#adamant.global.v1.UpdateWhitelistRequest)
  
  
  
    - [GlobalAPI](#adamant.global.v1.GlobalAPI)
  

- [gincoinc/adamant/global/v1/adamantglobalv1/model.proto](#gincoinc/adamant/global/v1/adamantglobalv1/model.proto)
    - [Address](#adamant.global.v1.Address)
    - [AddressReview](#adamant.global.v1.AddressReview)
    - [Deactivatability](#adamant.global.v1.Deactivatability)
    - [Key](#adamant.global.v1.Key)
    - [LabeledAddress](#adamant.global.v1.LabeledAddress)
    - [Policy](#adamant.global.v1.Policy)
    - [Rate](#adamant.global.v1.Rate)
    - [SignInfo](#adamant.global.v1.SignInfo)
    - [SignTxInput](#adamant.global.v1.SignTxInput)
    - [Signature](#adamant.global.v1.Signature)
    - [SignedInfo](#adamant.global.v1.SignedInfo)
    - [Transaction](#adamant.global.v1.Transaction)
    - [TransactionMember](#adamant.global.v1.TransactionMember)
    - [Transfer](#adamant.global.v1.Transfer)
    - [TransferLimit](#adamant.global.v1.TransferLimit)
    - [TxInput](#adamant.global.v1.TxInput)
    - [TxOutput](#adamant.global.v1.TxOutput)
    - [Wallet](#adamant.global.v1.Wallet)
    - [WalletMember](#adamant.global.v1.WalletMember)
    - [Whitelist](#adamant.global.v1.Whitelist)
  
  
  
  

- [gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto](#gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto)
    - [CreateWalletRequest](#adamant.teller.v1.CreateWalletRequest)
    - [SignTransactionRequest](#adamant.teller.v1.SignTransactionRequest)
  
  
  
    - [TellerAPI](#adamant.teller.v1.TellerAPI)
  

- [Scalar Value Types](#scalar-value-types)



<a name="gincoinc/global/v1/gincoincglobalv1/enum.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/global/v1/gincoincglobalv1/enum.proto


 


<a name="gincoinc.global.v1.AddressType"></a>

### AddressType
AddressType is a type of address.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ADDRESS_TYPE_INVALID | 0 |  |
| ADDRESS_TYPE_P2SH | 1 |  |
| ADDRESS_TYPE_P2SH_P2WSH | 2 |  |
| ADDRESS_TYPE_P2WSH | 3 |  |



<a name="gincoinc.global.v1.Coin"></a>

### Coin
Coin is a type of crypto asset.

| Name | Number | Description |
| ---- | ------ | ----------- |
| COIN_INVALID | 0 |  |
| COIN_BTC | 1 |  |
| COIN_ETH | 2 |  |
| COIN_LTC | 3 |  |
| COIN_BCH | 4 |  |
| COIN_XRP | 5 |  |



<a name="gincoinc.global.v1.Network"></a>

### Network
Network is a type of blockchain network.

| Name | Number | Description |
| ---- | ------ | ----------- |
| NETWORK_INVALID | 0 |  |
| NETWORK_BITCOIN_MAINNET | 1 |  |
| NETWORK_BITCOIN_TESTNET | 2 |  |
| NETWORK_ETHEREUM_MAINNET | 3 |  |
| NETWORK_ETHEREUM_TESTNET | 4 |  |
| NETWORK_LITECOIN_MAINNET | 5 |  |
| NETWORK_LITECOIN_TESTNET | 6 |  |
| NETWORK_BITCOINCASH_MAINNET | 7 |  |
| NETWORK_BITCOINCASH_TESTNET | 8 |  |
| NETWORK_RIPPLE_MAINNET | 9 |  |
| NETWORK_RIPPLE_TESTNET | 10 |  |



<a name="gincoinc.global.v1.TransactionState"></a>

### TransactionState
TransactionState is a state of transaction.
SUBMITTED:  SendTx成功
PENDING:    Mempoolに入った
PROCESSING: ブロックに入った
CONFIRMED:  指定した承認数を超えた

| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSACTION_STATE_INVALID | 0 |  |
| TRANSACTION_STATE_SUBMITTED | 1 |  |
| TRANSACTION_STATE_PENDING | 2 |  |
| TRANSACTION_STATE_PROCESSING | 3 |  |
| TRANSACTION_STATE_CONFIRMED | 4 |  |



<a name="gincoinc.global.v1.TransferType"></a>

### TransferType
TransferType is a type of transaction.

| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSFER_TYPE_INVALID | 0 |  |
| TRANSFER_TYPE_SEND | 1 |  |
| TRANSFER_TYPE_RECEIVE | 2 |  |
| TRANSFER_TYPE_CHANGE | 3 |  |
| TRANSFER_TYPE_SELF | 4 |  |



<a name="gincoinc.global.v1.UTXOState"></a>

### UTXOState
UTXOState is a state of UTXO.

| Name | Number | Description |
| ---- | ------ | ----------- |
| UTXO_STATE_INVALID | 0 |  |
| UTXO_STATE_PENDING_UNSPENT | 1 |  |
| UTXO_STATE_UNSPENT | 2 |  |
| UTXO_STATE_PENDING_SPENT | 3 |  |
| UTXO_STATE_SPENT | 4 |  |


 

 

 



<a name="gincoinc/global/v1/gincoincglobalv1/model.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/global/v1/gincoincglobalv1/model.proto



<a name="gincoinc.global.v1.TransactionUpdateEvent"></a>

### TransactionUpdateEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| coin | [Coin](#gincoinc.global.v1.Coin) |  |  |
| tx_id | [string](#string) |  |  |
| tx_index | [uint32](#uint32) |  |  |
| value | [double](#double) |  |  |
| from_address | [string](#string) |  |  |
| to_address | [string](#string) |  |  |
| state | [TransactionState](#gincoinc.global.v1.TransactionState) |  |  |
| transfer_type | [TransferType](#gincoinc.global.v1.TransferType) |  |  |
| time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |





 

 

 

 



<a name="gincoinc/adamant/global/v1/adamantglobalv1/enum.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/adamant/global/v1/adamantglobalv1/enum.proto


 


<a name="adamant.global.v1.AccountType"></a>

### AccountType
-----------------------------------------------------------------------------
Account
-----------------------------------------------------------------------------

| Name | Number | Description |
| ---- | ------ | ----------- |
| ACCOUNT_TYPE_INVALID | 0 |  |
| ACCOUNT_TYPE_USER | 1 |  |
| ACCOUNT_TYPE_SERVICE_ACCOUNT | 2 |  |



<a name="adamant.global.v1.AddressState"></a>

### AddressState
AddressState is a state of address.
CREATING:         作成中
COMPLETED:        Address完成

| Name | Number | Description |
| ---- | ------ | ----------- |
| ADDRESS_STATE_INVALID | 0 |  |
| ADDRESS_STATE_CREATING | 1 |  |
| ADDRESS_STATE_COMPLETED | 2 |  |



<a name="adamant.global.v1.NotificationType"></a>

### NotificationType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NOTIFICATION_TYPE_INVALID | 0 |  |
| NOTIFICATION_TYPE_WALLET_SIGNER_APPROVE_REQUEST | 1 |  |
| NOTIFICATION_TYPE_WALLET_VALIDATOR_APPROVE_REQUEST | 2 |  |
| NOTIFICATION_TYPE_WALLET_ACTIVATE_FAILED | 3 |  |
| NOTIFICATION_TYPE_WALLET_CANCELLED | 4 |  |
| NOTIFICATION_TYPE_WALLET_COMPLETED | 5 |  |
| NOTIFICATION_TYPE_WALLET_FAILED | 6 |  |
| NOTIFICATION_TYPE_TRANSACTION_SIGNER_APPROVE_REQUEST | 7 |  |
| NOTIFICATION_TYPE_TRANSACTION_VALIDATOR_APPROVE_REQUEST | 8 |  |
| NOTIFICATION_TYPE_TRANSACTION_SUBMITTED | 9 |  |
| NOTIFICATION_TYPE_TRANSACTION_CANCELLED | 10 |  |
| NOTIFICATION_TYPE_TRANSFER_SEND_COMPLETED | 11 |  |
| NOTIFICATION_TYPE_TRANSFER_SEND_FAILED | 12 |  |
| NOTIFICATION_TYPE_TRANSFER_RECEIVE_COMPLETED | 13 |  |
| NOTIFICATION_TYPE_TRANSFER_RECEIVE_FAILED | 14 |  |



<a name="adamant.global.v1.PolicyType"></a>

### PolicyType
PolicyType is a type of policy.

| Name | Number | Description |
| ---- | ------ | ----------- |
| POLICY_TYPE_INVALID | 0 |  |
| POLICY_TYPE_HOT_WALLET_POLICY | 1 |  |
| POLICY_TYPE_COLD_WALLET_POLICY | 2 |  |



<a name="adamant.global.v1.ResourceType"></a>

### ResourceType
ResourceType is a target type of role

| Name | Number | Description |
| ---- | ------ | ----------- |
| RESOURCE_TYPE_INVALID | 0 |  |
| RESOURCE_TYPE_WALLET | 1 |  |
| RESOURCE_TYPE_ORGANIZATION | 2 |  |



<a name="adamant.global.v1.RoleType"></a>

### RoleType
Role is a type of role

| Name | Number | Description |
| ---- | ------ | ----------- |
| ROLE_TYPE_INVALID | 0 |  |
| ROLE_TYPE_ORG_MANAGER | 1 |  |
| ROLE_TYPE_ORG_SIGNER | 2 |  |
| ROLE_TYPE_ORG_VALIDATOR | 3 |  |
| ROLE_TYPE_ORG_VIEWER | 4 |  |
| ROLE_TYPE_ORG_DEVELOPER | 5 |  |
| ROLE_TYPE_HOT_WALLET_ADMIN | 10 |  |
| ROLE_TYPE_HOT_WALLET_VIEWER | 11 |  |



<a name="adamant.global.v1.TokenType"></a>

### TokenType
TokenType is a type of token.

| Name | Number | Description |
| ---- | ------ | ----------- |
| TOKEN_TYPE_INVALID | 0 |  |
| TOKEN_TYPE_LOGIN_TOKEN | 1 |  |
| TOKEN_TYPE_MAIL_TOKEN | 2 |  |
| TOKEN_TYPE_PASSWORD_RESET_TOKEN | 3 |  |
| TOKEN_TYPE_PASSWORD_UPDATE_TOKEN | 4 |  |
| TOKEN_TYPE_SIGNUP_TOKEN | 5 |  |



<a name="adamant.global.v1.TransactionState"></a>

### TransactionState
TransactionState is a state of transaction.
SIGNING:    署名中
SIGNED:     署名完了
REVIEWED:   =AUDITOR_REVIEWED
SUBMITTED:  SendTx成功
CANCELLED:    キャンセル

| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSACTION_STATE_INVALID | 0 |  |
| TRANSACTION_STATE_SIGNING | 1 |  |
| TRANSACTION_STATE_SIGNED | 2 |  |
| TRANSACTION_STATE_REVIEWED | 3 |  |
| TRANSACTION_STATE_SUBMITTED | 4 |  |
| TRANSACTION_STATE_CANCELLED | 5 |  |



<a name="adamant.global.v1.UserState"></a>

### UserState
UserState is a state of user.

| Name | Number | Description |
| ---- | ------ | ----------- |
| USER_STATE_INVALID | 0 |  |
| USER_STATE_UNCONFIRMED | 1 |  |
| USER_STATE_CONFIRMED | 2 |  |
| USER_STATE_DEACTIVATED | 3 |  |



<a name="adamant.global.v1.WalletState"></a>

### WalletState
WalletState is a state of wallet.
PROPOSED:         Wallet作成
KEY_REGISTERED:   鍵の登録
AUDITOR_REVIEWED: 監査役の承認済
ACTIVATING:       アクティベート中
ACTIVATED:        アクティベート完了
CREATING:         TX送信
COMPLETED:        Wallet完成
CANCELLED:        キャンセル済み
ARCHIVED:         アーカイブ済み

| Name | Number | Description |
| ---- | ------ | ----------- |
| WALLET_STATE_INVALID | 0 |  |
| WALLET_STATE_PROPOSED | 1 |  |
| WALLET_STATE_KEY_REGISTERED | 2 |  |
| WALLET_STATE_VALIDATOR_REVIEWED | 3 |  |
| WALLET_STATE_ACTIVATING | 4 |  |
| WALLET_STATE_ACTIVATED | 5 |  |
| WALLET_STATE_CREATING | 6 |  |
| WALLET_STATE_COMPLETED | 7 |  |
| WALLET_STATE_CANCELLED | 8 |  |
| WALLET_STATE_ARCHIVED | 9 |  |



<a name="adamant.global.v1.WalletType"></a>

### WalletType
WalletType is a type of wallet.

| Name | Number | Description |
| ---- | ------ | ----------- |
| WALLET_TYPE_INVALID | 0 |  |
| WALLET_TYPE_SELF_CUSTODY_HOT | 1 |  |
| WALLET_TYPE_SELF_CUSTODY_COLD | 2 | WALLET_TYPE_CUSTODY_HOT = 3; WALLET_TYPE_CUSTODY_COLD = 4; WALLET_TYPE_DECENTRAL_HOT = 5; WALLET_TYPE_DECENTRAL_COLD = 6; |


 

 

 



<a name="gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto



<a name="adamant.global.v1.ApproveLabeledAddressRequest"></a>

### ApproveLabeledAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| labeled_address_id | [string](#string) |  |  |






<a name="adamant.global.v1.ApproveTransactionRequest"></a>

### ApproveTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |






<a name="adamant.global.v1.ApproveTransferLimitRequest"></a>

### ApproveTransferLimitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limit_id | [string](#string) |  |  |






<a name="adamant.global.v1.ApproveWalletRequest"></a>

### ApproveWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.ArchiveWalletRequest"></a>

### ArchiveWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.CalculateFeeRequest"></a>

### CalculateFeeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| fee_rate | [int64](#int64) |  |  |
| tx_outputs | [TxOutput](#adamant.global.v1.TxOutput) | repeated |  |






<a name="adamant.global.v1.CalculateFeeResponse"></a>

### CalculateFeeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fee | [int64](#int64) |  |  |






<a name="adamant.global.v1.CancelTransactionRequest"></a>

### CancelTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |






<a name="adamant.global.v1.CancelWalletRequest"></a>

### CancelWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.CreateAddressRequest"></a>

### CreateAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.CreateLabeledAddressRequest"></a>

### CreateLabeledAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| address | [string](#string) |  |  |






<a name="adamant.global.v1.CreatePolicyRequest"></a>

### CreatePolicyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| is_base_policy | [bool](#bool) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| type | [PolicyType](#adamant.global.v1.PolicyType) |  |  |
| whitelist_id | [string](#string) |  |  |
| transfer_limit_id | [string](#string) |  |  |






<a name="adamant.global.v1.CreateTransactionRequest"></a>

### CreateTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| fee_rate | [int64](#int64) |  |  |
| tx_outputs | [TxOutput](#adamant.global.v1.TxOutput) | repeated |  |






<a name="adamant.global.v1.CreateTransferLimitRequest"></a>

### CreateTransferLimitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| hourly_limit | [int64](#int64) |  |  |
| daily_limit | [int64](#int64) |  |  |
| one_time_limit | [int64](#int64) |  |  |






<a name="adamant.global.v1.CreateWalletRequest"></a>

### CreateWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| wallet_type | [WalletType](#adamant.global.v1.WalletType) |  |  |
| address_type | [gincoinc.global.v1.AddressType](#gincoinc.global.v1.AddressType) |  |  |
| m | [uint32](#uint32) |  |  |
| n | [uint32](#uint32) |  |  |
| members | [string](#string) | repeated |  |
| policy_id | [string](#string) |  |  |






<a name="adamant.global.v1.CreateWhitelistRequest"></a>

### CreateWhitelistRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| address_ids | [string](#string) | repeated |  |






<a name="adamant.global.v1.DeleteLabeledAddressRequest"></a>

### DeleteLabeledAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| labeled_address_id | [string](#string) |  |  |






<a name="adamant.global.v1.DeletePolicyRequest"></a>

### DeletePolicyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policy_id | [string](#string) |  |  |






<a name="adamant.global.v1.DeleteTransferLimitRequest"></a>

### DeleteTransferLimitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limit_id | [string](#string) |  |  |






<a name="adamant.global.v1.DeleteWhitelistRequest"></a>

### DeleteWhitelistRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| whitelist_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetAddressRequest"></a>

### GetAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| address_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetLabeledAddressRequest"></a>

### GetLabeledAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| labeled_address_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetMembersDeactivatabilitiesRequest"></a>

### GetMembersDeactivatabilitiesRequest







<a name="adamant.global.v1.GetMembersDeactivatabilitiesResponse"></a>

### GetMembersDeactivatabilitiesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| deactivatabilities | [Deactivatability](#adamant.global.v1.Deactivatability) | repeated |  |






<a name="adamant.global.v1.GetNextHdAccountRequest"></a>

### GetNextHdAccountRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetNextHdAccountResponse"></a>

### GetNextHdAccountResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hd_account | [uint32](#uint32) |  |  |






<a name="adamant.global.v1.GetPolicyRequest"></a>

### GetPolicyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policy_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetSignInfoRequest"></a>

### GetSignInfoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |
| key_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetSpendableBalanceRequest"></a>

### GetSpendableBalanceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetSpendableBalanceResponse"></a>

### GetSpendableBalanceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_spendable_balance | [string](#string) |  |  |
| daily_spendable_balance | [string](#string) |  |  |
| hourly_spendable_balance | [string](#string) |  |  |
| one_time_spendable_balance | [string](#string) |  |  |






<a name="adamant.global.v1.GetTransactionRequest"></a>

### GetTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetTransferLimitRequest"></a>

### GetTransferLimitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limit_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetWalletRequest"></a>

### GetWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.GetWhitelistRequest"></a>

### GetWhitelistRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| whitelist_id | [string](#string) |  |  |






<a name="adamant.global.v1.ListAddressesRequest"></a>

### ListAddressesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| omit_change | [bool](#bool) |  |  |
| page_size | [uint32](#uint32) |  |  |
| page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListAddressesResponse"></a>

### ListAddressesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addresses | [Address](#adamant.global.v1.Address) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListLabeledAddressesRequest"></a>

### ListLabeledAddressesRequest







<a name="adamant.global.v1.ListLabeledAddressesResponse"></a>

### ListLabeledAddressesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addresses | [LabeledAddress](#adamant.global.v1.LabeledAddress) | repeated |  |






<a name="adamant.global.v1.ListPoliciesRequest"></a>

### ListPoliciesRequest







<a name="adamant.global.v1.ListPoliciesResponse"></a>

### ListPoliciesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policies | [Policy](#adamant.global.v1.Policy) | repeated |  |






<a name="adamant.global.v1.ListRatesResponse"></a>

### ListRatesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rates | [Rate](#adamant.global.v1.Rate) | repeated |  |






<a name="adamant.global.v1.ListSignInfoRequest"></a>

### ListSignInfoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |






<a name="adamant.global.v1.ListSignInfoResponse"></a>

### ListSignInfoResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sign_info_list | [SignInfo](#adamant.global.v1.SignInfo) | repeated |  |






<a name="adamant.global.v1.ListTransactionsRequest"></a>

### ListTransactionsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| page_size | [uint32](#uint32) |  |  |
| page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListTransactionsResponse"></a>

### ListTransactionsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transactions | [Transaction](#adamant.global.v1.Transaction) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListTransferLimitsRequest"></a>

### ListTransferLimitsRequest







<a name="adamant.global.v1.ListTransferLimitsResponse"></a>

### ListTransferLimitsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limits | [TransferLimit](#adamant.global.v1.TransferLimit) | repeated |  |






<a name="adamant.global.v1.ListTransfersRequest"></a>

### ListTransfersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| page_size | [uint32](#uint32) |  |  |
| page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListTransfersResponse"></a>

### ListTransfersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfers | [Transfer](#adamant.global.v1.Transfer) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListWalletsRequest"></a>

### ListWalletsRequest
TODO implement pagenation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [uint32](#uint32) |  |  |
| page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListWalletsResponse"></a>

### ListWalletsResponse
TODO implement pagenation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallets | [Wallet](#adamant.global.v1.Wallet) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="adamant.global.v1.ListWhitelistsRequest"></a>

### ListWhitelistsRequest







<a name="adamant.global.v1.ListWhitelistsResponse"></a>

### ListWhitelistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| whitelists | [Whitelist](#adamant.global.v1.Whitelist) | repeated |  |






<a name="adamant.global.v1.RegisterKeyRequest"></a>

### RegisterKeyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| pub_key | [string](#string) |  |  |
| hd_account | [uint32](#uint32) |  |  |






<a name="adamant.global.v1.SendTransactionRequest"></a>

### SendTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |






<a name="adamant.global.v1.SignTransactionRequest"></a>

### SignTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |
| key_id | [string](#string) |  |  |
| signed_info | [SignedInfo](#adamant.global.v1.SignedInfo) |  |  |






<a name="adamant.global.v1.UnArchiveWalletRequest"></a>

### UnArchiveWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |






<a name="adamant.global.v1.UpdateLabeledAddressRequest"></a>

### UpdateLabeledAddressRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| labeled_address_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| address | [string](#string) |  |  |






<a name="adamant.global.v1.UpdatePolicyRequest"></a>

### UpdatePolicyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policy_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| whitelist_id | [string](#string) |  |  |
| transfer_limit_id | [string](#string) |  |  |






<a name="adamant.global.v1.UpdateTransferLimitRequest"></a>

### UpdateTransferLimitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limit_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| hourly_limit | [int64](#int64) |  |  |
| daily_limit | [int64](#int64) |  |  |
| one_time_limit | [int64](#int64) |  |  |






<a name="adamant.global.v1.UpdateWalletPolicyRequest"></a>

### UpdateWalletPolicyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| policy_id | [string](#string) |  |  |






<a name="adamant.global.v1.UpdateWhitelistRequest"></a>

### UpdateWhitelistRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| whitelist_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |





 

 

 


<a name="adamant.global.v1.GlobalAPI"></a>

### GlobalAPI


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateWallet | [CreateWalletRequest](#adamant.global.v1.CreateWalletRequest) | [Wallet](#adamant.global.v1.Wallet) | Wallet |
| GetWallet | [GetWalletRequest](#adamant.global.v1.GetWalletRequest) | [Wallet](#adamant.global.v1.Wallet) |  |
| CancelWallet | [CancelWalletRequest](#adamant.global.v1.CancelWalletRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ArchiveWallet | [ArchiveWalletRequest](#adamant.global.v1.ArchiveWalletRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| UnArchiveWallet | [UnArchiveWalletRequest](#adamant.global.v1.UnArchiveWalletRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ListWallets | [ListWalletsRequest](#adamant.global.v1.ListWalletsRequest) | [ListWalletsResponse](#adamant.global.v1.ListWalletsResponse) |  |
| UpdateWalletPolicy | [UpdateWalletPolicyRequest](#adamant.global.v1.UpdateWalletPolicyRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ApproveWallet | [ApproveWalletRequest](#adamant.global.v1.ApproveWalletRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Review |
| ApproveTransaction | [ApproveTransactionRequest](#adamant.global.v1.ApproveTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CreateAddress | [CreateAddressRequest](#adamant.global.v1.CreateAddressRequest) | [Address](#adamant.global.v1.Address) | Address |
| GetAddress | [GetAddressRequest](#adamant.global.v1.GetAddressRequest) | [Address](#adamant.global.v1.Address) |  |
| ListAddresses | [ListAddressesRequest](#adamant.global.v1.ListAddressesRequest) | [ListAddressesResponse](#adamant.global.v1.ListAddressesResponse) |  |
| GetNextHdAccount | [GetNextHdAccountRequest](#adamant.global.v1.GetNextHdAccountRequest) | [GetNextHdAccountResponse](#adamant.global.v1.GetNextHdAccountResponse) | RegisterKey |
| RegisterKey | [RegisterKeyRequest](#adamant.global.v1.RegisterKeyRequest) | [Key](#adamant.global.v1.Key) |  |
| CreateTransaction | [CreateTransactionRequest](#adamant.global.v1.CreateTransactionRequest) | [Transaction](#adamant.global.v1.Transaction) | Transaction |
| SignTransaction | [SignTransactionRequest](#adamant.global.v1.SignTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| SendTransaction | [SendTransactionRequest](#adamant.global.v1.SendTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CancelTransaction | [CancelTransactionRequest](#adamant.global.v1.CancelTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| GetTransaction | [GetTransactionRequest](#adamant.global.v1.GetTransactionRequest) | [Transaction](#adamant.global.v1.Transaction) |  |
| ListTransactions | [ListTransactionsRequest](#adamant.global.v1.ListTransactionsRequest) | [ListTransactionsResponse](#adamant.global.v1.ListTransactionsResponse) |  |
| GetSignInfo | [GetSignInfoRequest](#adamant.global.v1.GetSignInfoRequest) | [SignInfo](#adamant.global.v1.SignInfo) | SignInfo |
| ListSignInfo | [ListSignInfoRequest](#adamant.global.v1.ListSignInfoRequest) | [ListSignInfoResponse](#adamant.global.v1.ListSignInfoResponse) |  |
| ListTransfers | [ListTransfersRequest](#adamant.global.v1.ListTransfersRequest) | [ListTransfersResponse](#adamant.global.v1.ListTransfersResponse) | Transfer |
| ListRates | [.google.protobuf.Empty](#google.protobuf.Empty) | [ListRatesResponse](#adamant.global.v1.ListRatesResponse) | Rate |
| CreateLabeledAddress | [CreateLabeledAddressRequest](#adamant.global.v1.CreateLabeledAddressRequest) | [LabeledAddress](#adamant.global.v1.LabeledAddress) | policy |
| GetLabeledAddress | [GetLabeledAddressRequest](#adamant.global.v1.GetLabeledAddressRequest) | [LabeledAddress](#adamant.global.v1.LabeledAddress) |  |
| ListLabeledAddresses | [ListLabeledAddressesRequest](#adamant.global.v1.ListLabeledAddressesRequest) | [ListLabeledAddressesResponse](#adamant.global.v1.ListLabeledAddressesResponse) |  |
| UpdateLabeledAddress | [UpdateLabeledAddressRequest](#adamant.global.v1.UpdateLabeledAddressRequest) | [LabeledAddress](#adamant.global.v1.LabeledAddress) |  |
| DeleteLabeledAddress | [DeleteLabeledAddressRequest](#adamant.global.v1.DeleteLabeledAddressRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ApproveLabeledAddress | [ApproveLabeledAddressRequest](#adamant.global.v1.ApproveLabeledAddressRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CreateWhitelist | [CreateWhitelistRequest](#adamant.global.v1.CreateWhitelistRequest) | [Whitelist](#adamant.global.v1.Whitelist) |  |
| GetWhitelist | [GetWhitelistRequest](#adamant.global.v1.GetWhitelistRequest) | [Whitelist](#adamant.global.v1.Whitelist) |  |
| ListWhitelists | [ListWhitelistsRequest](#adamant.global.v1.ListWhitelistsRequest) | [ListWhitelistsResponse](#adamant.global.v1.ListWhitelistsResponse) |  |
| UpdateWhitelist | [UpdateWhitelistRequest](#adamant.global.v1.UpdateWhitelistRequest) | [Whitelist](#adamant.global.v1.Whitelist) |  |
| DeleteWhitelist | [DeleteWhitelistRequest](#adamant.global.v1.DeleteWhitelistRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CreateTransferLimit | [CreateTransferLimitRequest](#adamant.global.v1.CreateTransferLimitRequest) | [TransferLimit](#adamant.global.v1.TransferLimit) |  |
| GetTransferLimit | [GetTransferLimitRequest](#adamant.global.v1.GetTransferLimitRequest) | [TransferLimit](#adamant.global.v1.TransferLimit) |  |
| ListTransferLimits | [ListTransferLimitsRequest](#adamant.global.v1.ListTransferLimitsRequest) | [ListTransferLimitsResponse](#adamant.global.v1.ListTransferLimitsResponse) |  |
| UpdateTransferLimit | [UpdateTransferLimitRequest](#adamant.global.v1.UpdateTransferLimitRequest) | [TransferLimit](#adamant.global.v1.TransferLimit) |  |
| DeleteTransferLimit | [DeleteTransferLimitRequest](#adamant.global.v1.DeleteTransferLimitRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ApproveTransferLimit | [ApproveTransferLimitRequest](#adamant.global.v1.ApproveTransferLimitRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CreatePolicy | [CreatePolicyRequest](#adamant.global.v1.CreatePolicyRequest) | [Policy](#adamant.global.v1.Policy) |  |
| GetPolicy | [GetPolicyRequest](#adamant.global.v1.GetPolicyRequest) | [Policy](#adamant.global.v1.Policy) |  |
| ListPolicies | [ListPoliciesRequest](#adamant.global.v1.ListPoliciesRequest) | [ListPoliciesResponse](#adamant.global.v1.ListPoliciesResponse) |  |
| UpdatePolicy | [UpdatePolicyRequest](#adamant.global.v1.UpdatePolicyRequest) | [Policy](#adamant.global.v1.Policy) |  |
| DeletePolicy | [DeletePolicyRequest](#adamant.global.v1.DeletePolicyRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| GetSpendableBalance | [GetSpendableBalanceRequest](#adamant.global.v1.GetSpendableBalanceRequest) | [GetSpendableBalanceResponse](#adamant.global.v1.GetSpendableBalanceResponse) | Utility |
| CalculateFee | [CalculateFeeRequest](#adamant.global.v1.CalculateFeeRequest) | [CalculateFeeResponse](#adamant.global.v1.CalculateFeeResponse) |  |
| GetMembersDeactivatabilities | [GetMembersDeactivatabilitiesRequest](#adamant.global.v1.GetMembersDeactivatabilitiesRequest) | [GetMembersDeactivatabilitiesResponse](#adamant.global.v1.GetMembersDeactivatabilitiesResponse) |  |

 



<a name="gincoinc/adamant/global/v1/adamantglobalv1/model.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/adamant/global/v1/adamantglobalv1/model.proto



<a name="adamant.global.v1.Address"></a>

### Address



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| address_id | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| address | [string](#string) |  |  |
| index | [uint32](#uint32) |  |  |
| balance | [string](#string) |  |  |
| state | [AddressState](#adamant.global.v1.AddressState) |  |  |
| address_type | [gincoinc.global.v1.AddressType](#gincoinc.global.v1.AddressType) |  |  |
| sequence_number | [uint32](#uint32) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.AddressReview"></a>

### AddressReview



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address_review_id | [string](#string) |  |  |
| requester_account_id | [string](#string) |  |  |
| requester_name | [string](#string) |  |  |
| approver_account_id | [string](#string) |  |  |
| approver_name | [string](#string) |  |  |
| address_is_reviewed | [bool](#bool) |  |  |






<a name="adamant.global.v1.Deactivatability"></a>

### Deactivatability



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_id | [string](#string) |  |  |
| deactivatable | [bool](#bool) |  |  |






<a name="adamant.global.v1.Key"></a>

### Key



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| account_id | [string](#string) |  |  |
| account_type | [AccountType](#adamant.global.v1.AccountType) |  |  |
| key_id | [string](#string) |  |  |






<a name="adamant.global.v1.LabeledAddress"></a>

### LabeledAddress



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| labeled_address_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| address | [string](#string) |  |  |
| proposed_address | [string](#string) |  |  |
| address_review | [AddressReview](#adamant.global.v1.AddressReview) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.Policy"></a>

### Policy



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policy_id | [string](#string) |  |  |
| policy_type | [PolicyType](#adamant.global.v1.PolicyType) |  |  |
| name | [string](#string) |  |  |
| is_base_policy | [bool](#bool) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| whitelist | [Whitelist](#adamant.global.v1.Whitelist) |  |  |
| transfer_limit | [TransferLimit](#adamant.global.v1.TransferLimit) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.Rate"></a>

### Rate



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| symbol | [string](#string) |  |  |
| jpy | [string](#string) |  |  |
| usd | [string](#string) |  |  |






<a name="adamant.global.v1.SignInfo"></a>

### SignInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |
| key_id | [string](#string) |  |  |
| hd_account | [uint32](#uint32) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| tx_id | [string](#string) |  |  |
| sign_message | [string](#string) |  |  |
| hd_change | [uint32](#uint32) |  |  |
| hd_index | [uint32](#uint32) |  |  |
| sign_tx_inputs | [SignTxInput](#adamant.global.v1.SignTxInput) | repeated |  |






<a name="adamant.global.v1.SignTxInput"></a>

### SignTxInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tx_input_index | [uint32](#uint32) |  |  |
| sign_message | [string](#string) |  |  |
| hd_change | [uint32](#uint32) |  |  |
| hd_index | [uint32](#uint32) |  |  |






<a name="adamant.global.v1.Signature"></a>

### Signature
Signature ...


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sign_index | [uint32](#uint32) |  |  |
| signature | [string](#string) |  |  |






<a name="adamant.global.v1.SignedInfo"></a>

### SignedInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| signatures | [Signature](#adamant.global.v1.Signature) | repeated |  |






<a name="adamant.global.v1.Transaction"></a>

### Transaction



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| tx_id | [string](#string) |  |  |
| address | [string](#string) |  |  |
| value | [string](#string) |  |  |
| fee | [string](#string) |  |  |
| state | [TransactionState](#adamant.global.v1.TransactionState) |  |  |
| signed_keys | [Key](#adamant.global.v1.Key) | repeated |  |
| tx_inputs | [TxInput](#adamant.global.v1.TxInput) | repeated |  |
| tx_outputs | [TxOutput](#adamant.global.v1.TxOutput) | repeated |  |
| members | [TransactionMember](#adamant.global.v1.TransactionMember) | repeated |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.TransactionMember"></a>

### TransactionMember



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_id | [string](#string) |  |  |
| account_type | [AccountType](#adamant.global.v1.AccountType) |  |  |
| name | [string](#string) |  |  |
| email | [string](#string) |  |  |
| role | [RoleType](#adamant.global.v1.RoleType) |  |  |
| signed | [bool](#bool) |  |  |






<a name="adamant.global.v1.Transfer"></a>

### Transfer
Transfer ...
TODO baseValue, stringValue, usdRateを入れるかどうか


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transfer_id | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| tx_id | [string](#string) |  |  |
| transfer_type | [gincoinc.global.v1.TransferType](#gincoinc.global.v1.TransferType) |  |  |
| value | [string](#string) |  |  |
| partner_wallet_id | [string](#string) |  |  |
| partner_address | [string](#string) |  |  |
| state | [gincoinc.global.v1.TransactionState](#gincoinc.global.v1.TransactionState) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.TransferLimit"></a>

### TransferLimit



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transfer_limit_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| hourly_limit | [int64](#int64) |  |  |
| daily_limit | [int64](#int64) |  |  |
| one_time_limit | [int64](#int64) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.TxInput"></a>

### TxInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tx_id | [string](#string) |  |  |
| tx_index | [uint32](#uint32) |  |  |
| value | [int64](#int64) |  |  |






<a name="adamant.global.v1.TxOutput"></a>

### TxOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address | [string](#string) |  |  |
| value | [int64](#int64) |  |  |
| is_change | [bool](#bool) |  |  |






<a name="adamant.global.v1.Wallet"></a>

### Wallet



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| wallet_type | [WalletType](#adamant.global.v1.WalletType) |  |  |
| address_type | [gincoinc.global.v1.AddressType](#gincoinc.global.v1.AddressType) |  |  |
| m | [uint32](#uint32) |  |  |
| n | [uint32](#uint32) |  |  |
| state | [WalletState](#adamant.global.v1.WalletState) |  |  |
| keys | [Key](#adamant.global.v1.Key) | repeated |  |
| members | [WalletMember](#adamant.global.v1.WalletMember) | repeated |  |
| balance | [string](#string) |  |  |
| address | [string](#string) |  |  |
| policy_id | [string](#string) |  |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="adamant.global.v1.WalletMember"></a>

### WalletMember



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_id | [string](#string) |  |  |
| account_type | [AccountType](#adamant.global.v1.AccountType) |  |  |
| name | [string](#string) |  |  |
| email | [string](#string) |  |  |
| role | [RoleType](#adamant.global.v1.RoleType) |  |  |
| is_key_registered | [bool](#bool) |  |  |






<a name="adamant.global.v1.Whitelist"></a>

### Whitelist



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| whitelist_id | [string](#string) |  |  |
| name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| addresses | [LabeledAddress](#adamant.global.v1.LabeledAddress) | repeated |  |
| create_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| update_time | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |





 

 

 

 



<a name="gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto



<a name="adamant.teller.v1.CreateWalletRequest"></a>

### CreateWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_name | [string](#string) |  |  |
| coin | [gincoinc.global.v1.Coin](#gincoinc.global.v1.Coin) |  |  |
| wallet_type | [adamant.global.v1.WalletType](#adamant.global.v1.WalletType) |  |  |
| address_type | [gincoinc.global.v1.AddressType](#gincoinc.global.v1.AddressType) |  |  |






<a name="adamant.teller.v1.SignTransactionRequest"></a>

### SignTransactionRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_id | [string](#string) |  |  |
| transaction_id | [string](#string) |  |  |





 

 

 


<a name="adamant.teller.v1.TellerAPI"></a>

### TellerAPI


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateWallet | [CreateWalletRequest](#adamant.teller.v1.CreateWalletRequest) | [.adamant.global.v1.Wallet](#adamant.global.v1.Wallet) | Wallet |
| GetWallet | [.adamant.global.v1.GetWalletRequest](#adamant.global.v1.GetWalletRequest) | [.adamant.global.v1.Wallet](#adamant.global.v1.Wallet) |  |
| ListWallets | [.adamant.global.v1.ListWalletsRequest](#adamant.global.v1.ListWalletsRequest) | [.adamant.global.v1.ListWalletsResponse](#adamant.global.v1.ListWalletsResponse) |  |
| GetSpendableBalance | [.adamant.global.v1.GetSpendableBalanceRequest](#adamant.global.v1.GetSpendableBalanceRequest) | [.adamant.global.v1.GetSpendableBalanceResponse](#adamant.global.v1.GetSpendableBalanceResponse) |  |
| CreateAddress | [.adamant.global.v1.CreateAddressRequest](#adamant.global.v1.CreateAddressRequest) | [.adamant.global.v1.Address](#adamant.global.v1.Address) | Address |
| GetAddress | [.adamant.global.v1.GetAddressRequest](#adamant.global.v1.GetAddressRequest) | [.adamant.global.v1.Address](#adamant.global.v1.Address) |  |
| ListAddresses | [.adamant.global.v1.ListAddressesRequest](#adamant.global.v1.ListAddressesRequest) | [.adamant.global.v1.ListAddressesResponse](#adamant.global.v1.ListAddressesResponse) |  |
| CreateTransaction | [.adamant.global.v1.CreateTransactionRequest](#adamant.global.v1.CreateTransactionRequest) | [.adamant.global.v1.Transaction](#adamant.global.v1.Transaction) | Transaction |
| SignTransaction | [SignTransactionRequest](#adamant.teller.v1.SignTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| SendTransaction | [.adamant.global.v1.SendTransactionRequest](#adamant.global.v1.SendTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| CancelTransaction | [.adamant.global.v1.CancelTransactionRequest](#adamant.global.v1.CancelTransactionRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| ListTransactions | [.adamant.global.v1.ListTransactionsRequest](#adamant.global.v1.ListTransactionsRequest) | [.adamant.global.v1.ListTransactionsResponse](#adamant.global.v1.ListTransactionsResponse) |  |
| ListTransfers | [.adamant.global.v1.ListTransfersRequest](#adamant.global.v1.ListTransfersRequest) | [.adamant.global.v1.ListTransfersResponse](#adamant.global.v1.ListTransfersResponse) | Transfer |
| CalculateFee | [.adamant.global.v1.CalculateFeeRequest](#adamant.global.v1.CalculateFeeRequest) | [.adamant.global.v1.CalculateFeeResponse](#adamant.global.v1.CalculateFeeResponse) | Utility |

 



## Scalar Value Types

| .proto Type | Notes | C++ Type | Java Type | Python Type |
| ----------- | ----- | -------- | --------- | ----------- |
| <a name="double" /> double |  | double | double | float |
| <a name="float" /> float |  | float | float | float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long |
| <a name="bool" /> bool |  | bool | boolean | boolean |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str |

