// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ValidateAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ValidateAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of coin
   * </pre>
   *
   * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
   */
  int getCoinValue();
  /**
   * <pre>
   * The type of coin
   * </pre>
   *
   * <code>.gincoinc.global.v1.Coin coin = 1 [(.validate.rules) = { ... }</code>
   */
  gincoinc.global.v1.Enum.Coin getCoin();

  /**
   * <pre>
   * The address string to be validated
   * </pre>
   *
   * <code>string address = 2 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The address string to be validated
   * </pre>
   *
   * <code>string address = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}