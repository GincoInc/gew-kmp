// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListWhitelistsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListWhitelistsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.Whitelist whitelists = 1 [json_name = "whitelists"];</code>
   */
  java.util.List<adamant.global.v1.Model.Whitelist> 
      getWhitelistsList();
  /**
   * <code>repeated .adamant.global.v1.Whitelist whitelists = 1 [json_name = "whitelists"];</code>
   */
  adamant.global.v1.Model.Whitelist getWhitelists(int index);
  /**
   * <code>repeated .adamant.global.v1.Whitelist whitelists = 1 [json_name = "whitelists"];</code>
   */
  int getWhitelistsCount();
  /**
   * <code>repeated .adamant.global.v1.Whitelist whitelists = 1 [json_name = "whitelists"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.WhitelistOrBuilder> 
      getWhitelistsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.Whitelist whitelists = 1 [json_name = "whitelists"];</code>
   */
  adamant.global.v1.Model.WhitelistOrBuilder getWhitelistsOrBuilder(
      int index);
}
