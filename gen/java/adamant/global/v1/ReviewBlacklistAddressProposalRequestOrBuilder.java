// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ReviewBlacklistAddressProposalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ReviewBlacklistAddressProposalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string blacklist_address_id = 1 [json_name = "blacklistAddressId", (.validate.rules) = { ... }</code>
   * @return The blacklistAddressId.
   */
  java.lang.String getBlacklistAddressId();
  /**
   * <code>string blacklist_address_id = 1 [json_name = "blacklistAddressId", (.validate.rules) = { ... }</code>
   * @return The bytes for blacklistAddressId.
   */
  com.google.protobuf.ByteString
      getBlacklistAddressIdBytes();

  /**
   * <code>bool approve = 2 [json_name = "approve"];</code>
   * @return The approve.
   */
  boolean getApprove();
}
