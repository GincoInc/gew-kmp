// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

package adamant.teller.v1;

public interface ListColdFeeDepositAddressesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.teller.v1.ListColdFeeDepositAddressesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.CallerAddress caller_addresses = 1 [json_name = "callerAddresses"];</code>
   */
  java.util.List<adamant.global.v1.Model.CallerAddress> 
      getCallerAddressesList();
  /**
   * <code>repeated .adamant.global.v1.CallerAddress caller_addresses = 1 [json_name = "callerAddresses"];</code>
   */
  adamant.global.v1.Model.CallerAddress getCallerAddresses(int index);
  /**
   * <code>repeated .adamant.global.v1.CallerAddress caller_addresses = 1 [json_name = "callerAddresses"];</code>
   */
  int getCallerAddressesCount();
  /**
   * <code>repeated .adamant.global.v1.CallerAddress caller_addresses = 1 [json_name = "callerAddresses"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.CallerAddressOrBuilder> 
      getCallerAddressesOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.CallerAddress caller_addresses = 1 [json_name = "callerAddresses"];</code>
   */
  adamant.global.v1.Model.CallerAddressOrBuilder getCallerAddressesOrBuilder(
      int index);
}
