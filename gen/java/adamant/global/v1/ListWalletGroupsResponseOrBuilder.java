// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package java.adamant.global.v1;

public interface ListWalletGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListWalletGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.WalletGroup wallet_groups = 1 [json_name = "walletGroups"];</code>
   */
  java.util.List<java.adamant.global.v1.WalletGroup> 
      getWalletGroupsList();
  /**
   * <code>repeated .adamant.global.v1.WalletGroup wallet_groups = 1 [json_name = "walletGroups"];</code>
   */
  java.adamant.global.v1.WalletGroup getWalletGroups(int index);
  /**
   * <code>repeated .adamant.global.v1.WalletGroup wallet_groups = 1 [json_name = "walletGroups"];</code>
   */
  int getWalletGroupsCount();
  /**
   * <code>repeated .adamant.global.v1.WalletGroup wallet_groups = 1 [json_name = "walletGroups"];</code>
   */
  java.util.List<? extends java.adamant.global.v1.WalletGroupOrBuilder> 
      getWalletGroupsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.WalletGroup wallet_groups = 1 [json_name = "walletGroups"];</code>
   */
  java.adamant.global.v1.WalletGroupOrBuilder getWalletGroupsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}