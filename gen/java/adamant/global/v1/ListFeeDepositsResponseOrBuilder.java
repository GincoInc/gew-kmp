// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListFeeDepositsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListFeeDepositsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  java.util.List<adamant.global.v1.Model.FeeDepositAddress> 
      getFeeDepositAddressesList();
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  adamant.global.v1.Model.FeeDepositAddress getFeeDepositAddresses(int index);
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  int getFeeDepositAddressesCount();
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.FeeDepositAddressOrBuilder> 
      getFeeDepositAddressesOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
   */
  adamant.global.v1.Model.FeeDepositAddressOrBuilder getFeeDepositAddressesOrBuilder(
      int index);
}