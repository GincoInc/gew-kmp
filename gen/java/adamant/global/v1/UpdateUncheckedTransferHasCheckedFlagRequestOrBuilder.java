// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package java.adamant.global.v1;

public interface UpdateUncheckedTransferHasCheckedFlagRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.UpdateUncheckedTransferHasCheckedFlagRequest)
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
   * <code>string unchecked_transfer_id = 2 [json_name = "uncheckedTransferId", (.validate.rules) = { ... }</code>
   * @return The uncheckedTransferId.
   */
  java.lang.String getUncheckedTransferId();
  /**
   * <code>string unchecked_transfer_id = 2 [json_name = "uncheckedTransferId", (.validate.rules) = { ... }</code>
   * @return The bytes for uncheckedTransferId.
   */
  com.google.protobuf.ByteString
      getUncheckedTransferIdBytes();
}