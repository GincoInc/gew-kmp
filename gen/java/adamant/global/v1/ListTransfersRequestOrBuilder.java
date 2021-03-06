// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListTransfersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListTransfersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *The id of wallet
   * </pre>
   *
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getWalletId();
  /**
   * <pre>
   *The id of wallet
   * </pre>
   *
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  /**
   * <pre>
   *indicate how many objects to return in a single response
   * </pre>
   *
   * <code>uint32 page_size = 2 [(.validate.rules) = { ... }</code>
   */
  int getPageSize();

  /**
   * <pre>
   *retrieve the next page
   * </pre>
   *
   * <code>string page_token = 3 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   *retrieve the next page
   * </pre>
   *
   * <code>string page_token = 3 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
