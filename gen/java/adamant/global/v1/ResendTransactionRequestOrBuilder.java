// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ResendTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ResendTransactionRequest)
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
   * <code>string transaction_id = 2 [json_name = "transactionId", (.validate.rules) = { ... }</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transaction_id = 2 [json_name = "transactionId", (.validate.rules) = { ... }</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();

  /**
   * <code>.adamant.global.v1.ExecutorType executor_type = 3 [json_name = "executorType"];</code>
   * @return The enum numeric value on the wire for executorType.
   */
  int getExecutorTypeValue();
  /**
   * <code>.adamant.global.v1.ExecutorType executor_type = 3 [json_name = "executorType"];</code>
   * @return The executorType.
   */
  adamant.global.v1.Enum.ExecutorType getExecutorType();
}