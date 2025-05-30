// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListAuditLogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListAuditLogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
   * @return The enum numeric value on the wire for auditLogGroup.
   */
  int getAuditLogGroupValue();
  /**
   * <code>.adamant.global.v1.AuditLogGroup audit_log_group = 1 [json_name = "auditLogGroup"];</code>
   * @return The auditLogGroup.
   */
  adamant.global.v1.Enum.AuditLogGroup getAuditLogGroup();

  /**
   * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <code>string account_id = 2 [json_name = "accountId", (.validate.rules) = { ... }</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>uint32 page_size = 3 [json_name = "pageSize", (.validate.rules) = { ... }</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.validate.rules) = { ... }</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <code>optional .google.protobuf.Timestamp start_event_time = 5 [json_name = "startEventTime"];</code>
   * @return Whether the startEventTime field is set.
   */
  boolean hasStartEventTime();
  /**
   * <code>optional .google.protobuf.Timestamp start_event_time = 5 [json_name = "startEventTime"];</code>
   * @return The startEventTime.
   */
  com.google.protobuf.Timestamp getStartEventTime();
  /**
   * <code>optional .google.protobuf.Timestamp start_event_time = 5 [json_name = "startEventTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartEventTimeOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp end_event_time = 6 [json_name = "endEventTime"];</code>
   * @return Whether the endEventTime field is set.
   */
  boolean hasEndEventTime();
  /**
   * <code>optional .google.protobuf.Timestamp end_event_time = 6 [json_name = "endEventTime"];</code>
   * @return The endEventTime.
   */
  com.google.protobuf.Timestamp getEndEventTime();
  /**
   * <code>optional .google.protobuf.Timestamp end_event_time = 6 [json_name = "endEventTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndEventTimeOrBuilder();
}
