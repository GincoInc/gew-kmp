// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ForwardingThresholdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ForwardingThreshold)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for coin.
   */
  int getCoinValue();
  /**
   * <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The coin.
   */
  gincoinc.global.v1.Enum.Coin getCoin();

  /**
   * <code>double fee_rate = 2 [json_name = "feeRate"];</code>
   * @return The feeRate.
   */
  double getFeeRate();

  /**
   * <code>double value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  double getValue();
}
