// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListAddressesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListAddressesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  java.util.List<adamant.global.v1.Model.Address> 
      getAddressesList();
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  adamant.global.v1.Model.Address getAddresses(int index);
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  int getAddressesCount();
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  java.util.List<? extends adamant.global.v1.Model.AddressOrBuilder> 
      getAddressesOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.Address addresses = 1;</code>
   */
  adamant.global.v1.Model.AddressOrBuilder getAddressesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
