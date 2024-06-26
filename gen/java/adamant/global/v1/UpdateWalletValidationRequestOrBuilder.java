// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface UpdateWalletValidationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.UpdateWalletValidationRequest)
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
   * <code>repeated string new_validator_ids = 2 [json_name = "newValidatorIds", (.validate.rules) = { ... }</code>
   * @return A list containing the newValidatorIds.
   */
  java.util.List<java.lang.String>
      getNewValidatorIdsList();
  /**
   * <code>repeated string new_validator_ids = 2 [json_name = "newValidatorIds", (.validate.rules) = { ... }</code>
   * @return The count of newValidatorIds.
   */
  int getNewValidatorIdsCount();
  /**
   * <code>repeated string new_validator_ids = 2 [json_name = "newValidatorIds", (.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The newValidatorIds at the given index.
   */
  java.lang.String getNewValidatorIds(int index);
  /**
   * <code>repeated string new_validator_ids = 2 [json_name = "newValidatorIds", (.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the newValidatorIds at the given index.
   */
  com.google.protobuf.ByteString
      getNewValidatorIdsBytes(int index);

  /**
   * <code>uint32 new_required_approval_count = 3 [json_name = "newRequiredApprovalCount"];</code>
   * @return The newRequiredApprovalCount.
   */
  int getNewRequiredApprovalCount();
}
