// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface CreateEventTriggeredMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.CreateEventTriggeredMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.adamant.global.v1.EventTriggeredMessageType event_triggered_message_type = 1 [json_name = "eventTriggeredMessageType"];</code>
   * @return The enum numeric value on the wire for eventTriggeredMessageType.
   */
  int getEventTriggeredMessageTypeValue();
  /**
   * <code>.adamant.global.v1.EventTriggeredMessageType event_triggered_message_type = 1 [json_name = "eventTriggeredMessageType"];</code>
   * @return The eventTriggeredMessageType.
   */
  adamant.global.v1.Enum.EventTriggeredMessageType getEventTriggeredMessageType();

  /**
   * <code>string destination = 2 [json_name = "destination"];</code>
   * @return The destination.
   */
  java.lang.String getDestination();
  /**
   * <code>string destination = 2 [json_name = "destination"];</code>
   * @return The bytes for destination.
   */
  com.google.protobuf.ByteString
      getDestinationBytes();
}
