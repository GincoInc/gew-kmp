// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface GetSignerPubKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.GetSignerPubKeyRequest)
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
   * <code>string key_id = 2 [json_name = "keyId", (.validate.rules) = { ... }</code>
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   * <code>string key_id = 2 [json_name = "keyId", (.validate.rules) = { ... }</code>
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString
      getKeyIdBytes();
}
