// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListSymbolChildAddressesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListSymbolChildAddressesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.SymbolChildAddress symbol_child_addresses = 1 [json_name = "symbolChildAddresses"];</code>
   */
  java.util.List<adamant.global.v1.Model.SymbolChildAddress> 
      getSymbolChildAddressesList();
  /**
   * <code>repeated .adamant.global.v1.SymbolChildAddress symbol_child_addresses = 1 [json_name = "symbolChildAddresses"];</code>
   */
  adamant.global.v1.Model.SymbolChildAddress getSymbolChildAddresses(int index);
  /**
   * <code>repeated .adamant.global.v1.SymbolChildAddress symbol_child_addresses = 1 [json_name = "symbolChildAddresses"];</code>
   */
  int getSymbolChildAddressesCount();
  /**
   * <code>repeated .adamant.global.v1.SymbolChildAddress symbol_child_addresses = 1 [json_name = "symbolChildAddresses"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.SymbolChildAddressOrBuilder> 
      getSymbolChildAddressesOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.SymbolChildAddress symbol_child_addresses = 1 [json_name = "symbolChildAddresses"];</code>
   */
  adamant.global.v1.Model.SymbolChildAddressOrBuilder getSymbolChildAddressesOrBuilder(
      int index);
}
