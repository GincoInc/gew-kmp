// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListTransactionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListTransactionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getWalletId();
  /**
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  /**
   * <code>uint32 page_size = 2 [(.validate.rules) = { ... }</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 3 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 3 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
