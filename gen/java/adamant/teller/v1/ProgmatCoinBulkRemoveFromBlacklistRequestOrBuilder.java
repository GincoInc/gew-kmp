// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

package adamant.teller.v1;

public interface ProgmatCoinBulkRemoveFromBlacklistRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest)
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
   * <code>uint64 fee_rate = 2 [json_name = "feeRate"];</code>
   * @return The feeRate.
   */
  long getFeeRate();

  /**
   * <code>string contract_address = 3 [json_name = "contractAddress", (.validate.rules) = { ... }</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>string contract_address = 3 [json_name = "contractAddress", (.validate.rules) = { ... }</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <code>string utils_address = 4 [json_name = "utilsAddress", (.validate.rules) = { ... }</code>
   * @return The utilsAddress.
   */
  java.lang.String getUtilsAddress();
  /**
   * <code>string utils_address = 4 [json_name = "utilsAddress", (.validate.rules) = { ... }</code>
   * @return The bytes for utilsAddress.
   */
  com.google.protobuf.ByteString
      getUtilsAddressBytes();

  /**
   * <code>repeated string addresses = 5 [json_name = "addresses", (.validate.rules) = { ... }</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 5 [json_name = "addresses", (.validate.rules) = { ... }</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 5 [json_name = "addresses", (.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 5 [json_name = "addresses", (.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}