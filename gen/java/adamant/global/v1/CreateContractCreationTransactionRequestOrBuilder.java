// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface CreateContractCreationTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.CreateContractCreationTransactionRequest)
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
   * <code>string bytecode = 3 [json_name = "bytecode"];</code>
   * @return The bytecode.
   */
  java.lang.String getBytecode();
  /**
   * <code>string bytecode = 3 [json_name = "bytecode"];</code>
   * @return The bytes for bytecode.
   */
  com.google.protobuf.ByteString
      getBytecodeBytes();

  /**
   * <code>.gincoinc.global.v1.ContractCreationType contract_creation_type = 4 [json_name = "contractCreationType", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for contractCreationType.
   */
  int getContractCreationTypeValue();
  /**
   * <code>.gincoinc.global.v1.ContractCreationType contract_creation_type = 4 [json_name = "contractCreationType", (.validate.rules) = { ... }</code>
   * @return The contractCreationType.
   */
  gincoinc.global.v1.Enum.ContractCreationType getContractCreationType();

  /**
   * <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = { ... }</code>
   * @return Whether the contractAddress field is set.
   */
  boolean hasContractAddress();
  /**
   * <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = { ... }</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = { ... }</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();
}
