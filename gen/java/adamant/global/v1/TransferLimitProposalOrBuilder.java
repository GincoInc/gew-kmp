// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

public interface TransferLimitProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.TransferLimitProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string requester_account_id = 1 [json_name = "requesterAccountId"];</code>
   * @return The requesterAccountId.
   */
  java.lang.String getRequesterAccountId();
  /**
   * <code>string requester_account_id = 1 [json_name = "requesterAccountId"];</code>
   * @return The bytes for requesterAccountId.
   */
  com.google.protobuf.ByteString
      getRequesterAccountIdBytes();

  /**
   * <code>string requester_name = 2 [json_name = "requesterName"];</code>
   * @return The requesterName.
   */
  java.lang.String getRequesterName();
  /**
   * <code>string requester_name = 2 [json_name = "requesterName"];</code>
   * @return The bytes for requesterName.
   */
  com.google.protobuf.ByteString
      getRequesterNameBytes();

  /**
   * <code>string approver_account_id = 3 [json_name = "approverAccountId"];</code>
   * @return The approverAccountId.
   */
  java.lang.String getApproverAccountId();
  /**
   * <code>string approver_account_id = 3 [json_name = "approverAccountId"];</code>
   * @return The bytes for approverAccountId.
   */
  com.google.protobuf.ByteString
      getApproverAccountIdBytes();

  /**
   * <code>string approver_name = 4 [json_name = "approverName"];</code>
   * @return The approverName.
   */
  java.lang.String getApproverName();
  /**
   * <code>string approver_name = 4 [json_name = "approverName"];</code>
   * @return The bytes for approverName.
   */
  com.google.protobuf.ByteString
      getApproverNameBytes();

  /**
   * <code>int64 proposed_hourly_limit = 5 [json_name = "proposedHourlyLimit"];</code>
   * @return The proposedHourlyLimit.
   */
  long getProposedHourlyLimit();

  /**
   * <code>int64 proposed_daily_limit = 6 [json_name = "proposedDailyLimit"];</code>
   * @return The proposedDailyLimit.
   */
  long getProposedDailyLimit();

  /**
   * <code>int64 proposed_one_time_limit = 7 [json_name = "proposedOneTimeLimit"];</code>
   * @return The proposedOneTimeLimit.
   */
  long getProposedOneTimeLimit();

  /**
   * <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
   * @return The isReviewed.
   */
  boolean getIsReviewed();
}