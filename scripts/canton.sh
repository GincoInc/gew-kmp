#!/bin/bash

# =============================================================================
# Canton (CC) 送金スクリプト
# =============================================================================

# 通貨・ネットワーク
coin=87 # COIN_CC
# network=77 # Canton Testnet
network=76 # Canton Mainnet

# Canton Transaction Type
# 1: CANTON_TRANSACTION_TYPE_ONBOARDING
# 2: CANTON_TRANSACTION_TYPE_PREAPPROVAL
# 3: CANTON_TRANSACTION_TYPE_TRANSFER
# 4: CANTON_TRANSACTION_TYPE_WITHDRAW
# 5: CANTON_TRANSACTION_TYPE_BURN
canton_tx_type=3 # TRANSFER

# 環境ごとに変更する箇所 QA Testnet
# wallet_id=xxxxxxxx-xxxx-4xxx-xxxx-xxxxxxxxxxxx
# address=<送金先アドレス>
# value=1.0 # 送金額

# 環境ごとに変更する箇所 QA Mainnet
wallet_id=xxxxxxxx-xxxx-4xxx-xxxx-xxxxxxxxxxxx
address=<送金先アドレス>
# 制限額:xxx
value=1.0 # 送金額

# 複数宛先の場合
# address_2=<送金先アドレス2>
# value_2=1.0

# UTXO選択する場合 (ListUTXOs で取得した tx_id と vout を指定)
# utxo_tx_id=<tx_id>
# utxo_vout=0
# 複数UTXO選択する場合
# utxo_tx_id_2=<tx_id_2>
# utxo_vout_2=0

# CreatePreTransaction 実行後に変更
pre_transaction_id=xxxxxxxx-xxxx-4xxx-xxxx-xxxxxxxxxxxx
# UseCreateTransaction 実行後に変更
transaction_id=xxxxxxxx-xxxx-4xxx-xxxx-xxxxxxxxxxxx


# =============================================================================
# UTXO一覧取得
# =============================================================================
ListUTXOs() {
    echo "$(date +%H:%M:%S): ListUTXOs for wallet_id: $wallet_id"
    grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\"
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.ListUTXOs | jq .
}


# =============================================================================
# 事前送金申請
# =============================================================================

# 宛先が1つの場合
CreatePreTransaction() {
    external_id=$(uuidgen | tr A-Z a-z)
    echo "external_id: $external_id"

    pre_transaction_id=$(
    grpcurl -plaintext -d "{
        \"coin\": \"$coin\",
        \"network\": \"$network\",
        \"external_id\": \"$external_id\",
        \"details\": {
          \"address\": \"$address\",
          \"string_value\": \"$value\"
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreatePreTransaction | jq .preTransactionId
    )
    echo "$(date +%H:%M:%S): pre_transaction_id: $pre_transaction_id"
}

# 宛先が複数の場合
CreateMultiPreTransaction() {
    external_id=$(uuidgen | tr A-Z a-z)
    echo "external_id: $external_id"

    pre_transaction_id=$(
    grpcurl -plaintext -d "{
        \"coin\": \"$coin\",
        \"network\": \"$network\",
        \"external_id\": \"$external_id\",
        \"details\": [
          {
            \"address\": \"$address\",
            \"string_value\": \"$value\"
          },
          {
            \"address\": \"$address_2\",
            \"string_value\": \"$value_2\"
          }
        ]
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreatePreTransaction | jq .preTransactionId
    )
    echo "$(date +%H:%M:%S): pre_transaction_id: $pre_transaction_id"
}

# PreTransaction を使って CreateTransaction (UTXO選択なし)
UseCreateTransaction() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"pre_transaction_id\": \"$pre_transaction_id\",
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)

    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"
}

# PreTransaction を使って CreateTransaction (UTXO選択あり)
UseCreateTransactionWithUTXO() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"pre_transaction_id\": \"$pre_transaction_id\",
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        },
        \"utxo_specific\": {
          \"selected_utxos\": [
            {
              \"tx_id\": \"$utxo_tx_id\",
              \"vout\": $utxo_vout
            }
          ]
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)

    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"
}

# PreTransaction を使って CreateTransaction (複数UTXO選択あり)
UseCreateTransactionWithMultiUTXO() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"pre_transaction_id\": \"$pre_transaction_id\",
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        },
        \"utxo_specific\": {
          \"selected_utxos\": [
            {
              \"tx_id\": \"$utxo_tx_id\",
              \"vout\": $utxo_vout
            },
            {
              \"tx_id\": \"$utxo_tx_id_2\",
              \"vout\": $utxo_vout_2
            }
          ]
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)

    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"
}

# =============================================================================
# 署名・送信
# =============================================================================
SignSendTransaction() {
    sign_response=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SignTransaction | jq
    )
    echo "$(date +%H:%M:%S): sign_response: $sign_response"

    tx_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SendTransaction | jq .txId
    )
    echo "$(date +%H:%M:%S): tx_id: $tx_id"
}


# =============================================================================
# 以下オプション無効時の確認 (PreTransaction なし)
# =============================================================================

# 宛先が1つ・UTXO選択なし
Transfer() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"address\": \"$address\",
        \"string_value\": \"$value\",
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)
    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"

    sign_response=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SignTransaction | jq
    )
    echo "$(date +%H:%M:%S): sign_response: $sign_response"

    tx_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SendTransaction | jq .txId
    )
    echo "$(date +%H:%M:%S): tx_id: $tx_id"
}

# 複数宛先・UTXO選択なし
MultiTransfer() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"tx_outputs\": [
          {
            \"address\": \"$address\",
            \"string_value\": \"$value\"
          },
          {
            \"address\": \"$address_2\",
            \"string_value\": \"$value_2\"
          }
        ],
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)
    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"

    sign_response=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SignTransaction | jq
    )
    echo "$(date +%H:%M:%S): sign_response: $sign_response"

    tx_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SendTransaction | jq .txId
    )
    echo "$(date +%H:%M:%S): tx_id: $tx_id"
}

# 宛先が1つ・UTXO選択あり
TransferWithUTXO() {
    transaction_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"fee_rate\": 0,
        \"address\": \"$address\",
        \"string_value\": \"$value\",
        \"canton_specific\": {
          \"type\": \"$canton_tx_type\"
        },
        \"utxo_specific\": {
          \"selected_utxos\": [
            {
              \"tx_id\": \"$utxo_tx_id\",
              \"vout\": $utxo_vout
            }
          ]
        }
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.CreateTransaction | jq .transactionId)
    echo "$(date +%H:%M:%S): transaction_id: $transaction_id"

    sign_response=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SignTransaction | jq
    )
    echo "$(date +%H:%M:%S): sign_response: $sign_response"

    tx_id=$(grpcurl -plaintext -d "{
        \"wallet_id\": \"$wallet_id\",
        \"transaction_id\": $transaction_id
    }" \
    localhost:50051 adamant.teller.v1.TellerAPI.SendTransaction | jq .txId
    )
    echo "$(date +%H:%M:%S): tx_id: $tx_id"
}


######### 実行する関数 #########
# --- UTXO一覧取得 ---
# ListUTXOs

# --- 事前送金申請あり ---
# CreatePreTransaction
# CreateMultiPreTransaction

# UseCreateTransaction
# UseCreateTransactionWithUTXO
# UseCreateTransactionWithMultiUTXO

# SignSendTransaction

# --- 以下オプション無効時の確認 ---
# Transfer
# MultiTransfer
# TransferWithUTXO
