// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListNFTsByFilterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListNFTsByFilterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.adamant.global.v1.ListFilterType filter_type = 1 [json_name = "filterType", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for filterType.
   */
  int getFilterTypeValue();
  /**
   * <code>.adamant.global.v1.ListFilterType filter_type = 1 [json_name = "filterType", (.validate.rules) = { ... }</code>
   * @return The filterType.
   */
  adamant.global.v1.Enum.ListFilterType getFilterType();

  /**
   * <code>string wallet_id = 2 [json_name = "walletId"];</code>
   * @return The walletId.
   */
  java.lang.String getWalletId();
  /**
   * <code>string wallet_id = 2 [json_name = "walletId"];</code>
   * @return The bytes for walletId.
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  /**
   * <code>optional string token_id = 3 [json_name = "tokenId"];</code>
   * @return Whether the tokenId field is set.
   */
  boolean hasTokenId();
  /**
   * <code>optional string token_id = 3 [json_name = "tokenId"];</code>
   * @return The tokenId.
   */
  java.lang.String getTokenId();
  /**
   * <code>optional string token_id = 3 [json_name = "tokenId"];</code>
   * @return The bytes for tokenId.
   */
  com.google.protobuf.ByteString
      getTokenIdBytes();

  /**
   * <code>optional string token_name = 4 [json_name = "tokenName"];</code>
   * @return Whether the tokenName field is set.
   */
  boolean hasTokenName();
  /**
   * <code>optional string token_name = 4 [json_name = "tokenName"];</code>
   * @return The tokenName.
   */
  java.lang.String getTokenName();
  /**
   * <code>optional string token_name = 4 [json_name = "tokenName"];</code>
   * @return The bytes for tokenName.
   */
  com.google.protobuf.ByteString
      getTokenNameBytes();

  /**
   * <code>optional string metadata = 5 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>optional string metadata = 5 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  java.lang.String getMetadata();
  /**
   * <code>optional string metadata = 5 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  com.google.protobuf.ByteString
      getMetadataBytes();
}