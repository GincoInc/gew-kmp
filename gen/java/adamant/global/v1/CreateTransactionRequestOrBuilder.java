// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface CreateTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.CreateTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
   * @return The walletId.
   */
  java.lang.String getWalletId();
  /**
   * <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = { ... }</code>
   * @return The bytes for walletId.
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  /**
   * <code>uint64 fee_rate = 2 [json_name = "feeRate"];</code>
   * @return The feeRate.
   */
  long getFeeRate();

  /**
   * <code>repeated .adamant.global.v1.RequestTxOutput tx_outputs = 3 [json_name = "txOutputs"];</code>
   */
  java.util.List<adamant.global.v1.Model.RequestTxOutput> 
      getTxOutputsList();
  /**
   * <code>repeated .adamant.global.v1.RequestTxOutput tx_outputs = 3 [json_name = "txOutputs"];</code>
   */
  adamant.global.v1.Model.RequestTxOutput getTxOutputs(int index);
  /**
   * <code>repeated .adamant.global.v1.RequestTxOutput tx_outputs = 3 [json_name = "txOutputs"];</code>
   */
  int getTxOutputsCount();
  /**
   * <code>repeated .adamant.global.v1.RequestTxOutput tx_outputs = 3 [json_name = "txOutputs"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.RequestTxOutputOrBuilder> 
      getTxOutputsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.RequestTxOutput tx_outputs = 3 [json_name = "txOutputs"];</code>
   */
  adamant.global.v1.Model.RequestTxOutputOrBuilder getTxOutputsOrBuilder(
      int index);

  /**
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>uint32 destination_tag = 5 [json_name = "destinationTag"];</code>
   * @return The destinationTag.
   */
  int getDestinationTag();

  /**
   * <code>uint64 memo_id = 6 [json_name = "memoId", jstype = JS_STRING];</code>
   * @return The memoId.
   */
  long getMemoId();

  /**
   * <code>string string_value = 7 [json_name = "stringValue"];</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <code>string string_value = 7 [json_name = "stringValue"];</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>.adamant.global.v1.CreateTransactionSubstrateSpecific substrate_specific = 8 [json_name = "substrateSpecific"];</code>
   * @return Whether the substrateSpecific field is set.
   */
  boolean hasSubstrateSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSubstrateSpecific substrate_specific = 8 [json_name = "substrateSpecific"];</code>
   * @return The substrateSpecific.
   */
  adamant.global.v1.Model.CreateTransactionSubstrateSpecific getSubstrateSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSubstrateSpecific substrate_specific = 8 [json_name = "substrateSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionSubstrateSpecificOrBuilder getSubstrateSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionWalletConnectSpecific wallet_connect_specific = 9 [json_name = "walletConnectSpecific"];</code>
   * @return Whether the walletConnectSpecific field is set.
   */
  boolean hasWalletConnectSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionWalletConnectSpecific wallet_connect_specific = 9 [json_name = "walletConnectSpecific"];</code>
   * @return The walletConnectSpecific.
   */
  adamant.global.v1.Model.CreateTransactionWalletConnectSpecific getWalletConnectSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionWalletConnectSpecific wallet_connect_specific = 9 [json_name = "walletConnectSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionWalletConnectSpecificOrBuilder getWalletConnectSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionNemSpecific nem_specific = 10 [json_name = "nemSpecific"];</code>
   * @return Whether the nemSpecific field is set.
   */
  boolean hasNemSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionNemSpecific nem_specific = 10 [json_name = "nemSpecific"];</code>
   * @return The nemSpecific.
   */
  adamant.global.v1.Model.CreateTransactionNemSpecific getNemSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionNemSpecific nem_specific = 10 [json_name = "nemSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionNemSpecificOrBuilder getNemSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionIOSTSpecific iost_specific = 11 [json_name = "iostSpecific"];</code>
   * @return Whether the iostSpecific field is set.
   */
  boolean hasIostSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionIOSTSpecific iost_specific = 11 [json_name = "iostSpecific"];</code>
   * @return The iostSpecific.
   */
  adamant.global.v1.Model.CreateTransactionIOSTSpecific getIostSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionIOSTSpecific iost_specific = 11 [json_name = "iostSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionIOSTSpecificOrBuilder getIostSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionSymbolSpecific xym_specific = 12 [json_name = "xymSpecific"];</code>
   * @return Whether the xymSpecific field is set.
   */
  boolean hasXymSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSymbolSpecific xym_specific = 12 [json_name = "xymSpecific"];</code>
   * @return The xymSpecific.
   */
  adamant.global.v1.Model.CreateTransactionSymbolSpecific getXymSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSymbolSpecific xym_specific = 12 [json_name = "xymSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionSymbolSpecificOrBuilder getXymSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionEthereumSpecific ethereum_specific = 13 [json_name = "ethereumSpecific"];</code>
   * @return Whether the ethereumSpecific field is set.
   */
  boolean hasEthereumSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionEthereumSpecific ethereum_specific = 13 [json_name = "ethereumSpecific"];</code>
   * @return The ethereumSpecific.
   */
  adamant.global.v1.Model.CreateTransactionEthereumSpecific getEthereumSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionEthereumSpecific ethereum_specific = 13 [json_name = "ethereumSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionEthereumSpecificOrBuilder getEthereumSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionCosmosSpecific cosmos_specific = 14 [json_name = "cosmosSpecific"];</code>
   * @return Whether the cosmosSpecific field is set.
   */
  boolean hasCosmosSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionCosmosSpecific cosmos_specific = 14 [json_name = "cosmosSpecific"];</code>
   * @return The cosmosSpecific.
   */
  adamant.global.v1.Model.CreateTransactionCosmosSpecific getCosmosSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionCosmosSpecific cosmos_specific = 14 [json_name = "cosmosSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionCosmosSpecificOrBuilder getCosmosSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionAlgorandSpecific algorand_specific = 15 [json_name = "algorandSpecific"];</code>
   * @return Whether the algorandSpecific field is set.
   */
  boolean hasAlgorandSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAlgorandSpecific algorand_specific = 15 [json_name = "algorandSpecific"];</code>
   * @return The algorandSpecific.
   */
  adamant.global.v1.Model.CreateTransactionAlgorandSpecific getAlgorandSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAlgorandSpecific algorand_specific = 15 [json_name = "algorandSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionAlgorandSpecificOrBuilder getAlgorandSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionHederaSpecific hedera_specific = 16 [json_name = "hederaSpecific"];</code>
   * @return Whether the hederaSpecific field is set.
   */
  boolean hasHederaSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionHederaSpecific hedera_specific = 16 [json_name = "hederaSpecific"];</code>
   * @return The hederaSpecific.
   */
  adamant.global.v1.Model.CreateTransactionHederaSpecific getHederaSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionHederaSpecific hedera_specific = 16 [json_name = "hederaSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionHederaSpecificOrBuilder getHederaSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionSolanaSpecific solana_specific = 17 [json_name = "solanaSpecific"];</code>
   * @return Whether the solanaSpecific field is set.
   */
  boolean hasSolanaSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSolanaSpecific solana_specific = 17 [json_name = "solanaSpecific"];</code>
   * @return The solanaSpecific.
   */
  adamant.global.v1.Model.CreateTransactionSolanaSpecific getSolanaSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSolanaSpecific solana_specific = 17 [json_name = "solanaSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionSolanaSpecificOrBuilder getSolanaSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionAptosSpecific aptos_specific = 19 [json_name = "aptosSpecific"];</code>
   * @return Whether the aptosSpecific field is set.
   */
  boolean hasAptosSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAptosSpecific aptos_specific = 19 [json_name = "aptosSpecific"];</code>
   * @return The aptosSpecific.
   */
  adamant.global.v1.Model.CreateTransactionAptosSpecific getAptosSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAptosSpecific aptos_specific = 19 [json_name = "aptosSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionAptosSpecificOrBuilder getAptosSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionAvalancheSpecific avalanche_specific = 20 [json_name = "avalancheSpecific"];</code>
   * @return Whether the avalancheSpecific field is set.
   */
  boolean hasAvalancheSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAvalancheSpecific avalanche_specific = 20 [json_name = "avalancheSpecific"];</code>
   * @return The avalancheSpecific.
   */
  adamant.global.v1.Model.CreateTransactionAvalancheSpecific getAvalancheSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionAvalancheSpecific avalanche_specific = 20 [json_name = "avalancheSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionAvalancheSpecificOrBuilder getAvalancheSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionNFTSpecific nft_specific = 22 [json_name = "nftSpecific"];</code>
   * @return Whether the nftSpecific field is set.
   */
  boolean hasNftSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionNFTSpecific nft_specific = 22 [json_name = "nftSpecific"];</code>
   * @return The nftSpecific.
   */
  adamant.global.v1.Model.CreateTransactionNFTSpecific getNftSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionNFTSpecific nft_specific = 22 [json_name = "nftSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionNFTSpecificOrBuilder getNftSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionTonSpecific ton_specific = 23 [json_name = "tonSpecific"];</code>
   * @return Whether the tonSpecific field is set.
   */
  boolean hasTonSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionTonSpecific ton_specific = 23 [json_name = "tonSpecific"];</code>
   * @return The tonSpecific.
   */
  adamant.global.v1.Model.CreateTransactionTonSpecific getTonSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionTonSpecific ton_specific = 23 [json_name = "tonSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionTonSpecificOrBuilder getTonSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.UtxoSpecific utxo_specific = 18 [json_name = "utxoSpecific"];</code>
   * @return Whether the utxoSpecific field is set.
   */
  boolean hasUtxoSpecific();
  /**
   * <code>.adamant.global.v1.UtxoSpecific utxo_specific = 18 [json_name = "utxoSpecific"];</code>
   * @return The utxoSpecific.
   */
  adamant.global.v1.UtxoSpecific getUtxoSpecific();
  /**
   * <code>.adamant.global.v1.UtxoSpecific utxo_specific = 18 [json_name = "utxoSpecific"];</code>
   */
  adamant.global.v1.UtxoSpecificOrBuilder getUtxoSpecificOrBuilder();

  /**
   * <code>.adamant.global.v1.CreateTransactionSuiSpecific sui_specific = 24 [json_name = "suiSpecific"];</code>
   * @return Whether the suiSpecific field is set.
   */
  boolean hasSuiSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSuiSpecific sui_specific = 24 [json_name = "suiSpecific"];</code>
   * @return The suiSpecific.
   */
  adamant.global.v1.Model.CreateTransactionSuiSpecific getSuiSpecific();
  /**
   * <code>.adamant.global.v1.CreateTransactionSuiSpecific sui_specific = 24 [json_name = "suiSpecific"];</code>
   */
  adamant.global.v1.Model.CreateTransactionSuiSpecificOrBuilder getSuiSpecificOrBuilder();

  /**
   * <code>optional string pre_transaction_id = 21 [json_name = "preTransactionId", (.validate.rules) = { ... }</code>
   * @return Whether the preTransactionId field is set.
   */
  boolean hasPreTransactionId();
  /**
   * <code>optional string pre_transaction_id = 21 [json_name = "preTransactionId", (.validate.rules) = { ... }</code>
   * @return The preTransactionId.
   */
  java.lang.String getPreTransactionId();
  /**
   * <code>optional string pre_transaction_id = 21 [json_name = "preTransactionId", (.validate.rules) = { ... }</code>
   * @return The bytes for preTransactionId.
   */
  com.google.protobuf.ByteString
      getPreTransactionIdBytes();
}
