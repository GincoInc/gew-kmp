// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface CreateWalletRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.CreateWalletRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wallet_name = 1 [json_name = "walletName", (.validate.rules) = { ... }</code>
   * @return The walletName.
   */
  java.lang.String getWalletName();
  /**
   * <code>string wallet_name = 1 [json_name = "walletName", (.validate.rules) = { ... }</code>
   * @return The bytes for walletName.
   */
  com.google.protobuf.ByteString
      getWalletNameBytes();

  /**
   * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for coin.
   */
  int getCoinValue();
  /**
   * <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = { ... }</code>
   * @return The coin.
   */
  gincoinc.global.v1.Enum.Coin getCoin();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>optional .gincoinc.global.v1.Network network = 13 [json_name = "network", (.validate.rules) = { ... }</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>optional .gincoinc.global.v1.Network network = 13 [json_name = "network", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>optional .gincoinc.global.v1.Network network = 13 [json_name = "network", (.validate.rules) = { ... }</code>
   * @return The network.
   */
  gincoinc.global.v1.Enum.Network getNetwork();

  /**
   * <code>.adamant.global.v1.WalletType wallet_type = 3 [json_name = "walletType", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for walletType.
   */
  int getWalletTypeValue();
  /**
   * <code>.adamant.global.v1.WalletType wallet_type = 3 [json_name = "walletType", (.validate.rules) = { ... }</code>
   * @return The walletType.
   */
  adamant.global.v1.Enum.WalletType getWalletType();

  /**
   * <code>.gincoinc.global.v1.AddressType address_type = 4 [json_name = "addressType", (.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for addressType.
   */
  int getAddressTypeValue();
  /**
   * <code>.gincoinc.global.v1.AddressType address_type = 4 [json_name = "addressType", (.validate.rules) = { ... }</code>
   * @return The addressType.
   */
  gincoinc.global.v1.Enum.AddressType getAddressType();

  /**
   * <pre>
   * and must be m &lt;= n
   * </pre>
   *
   * <code>uint32 m = 5 [json_name = "m", (.validate.rules) = { ... }</code>
   * @return The m.
   */
  int getM();

  /**
   * <code>uint32 n = 6 [json_name = "n", (.validate.rules) = { ... }</code>
   * @return The n.
   */
  int getN();

  /**
   * <code>repeated string members = 7 [json_name = "members", (.validate.rules) = { ... }</code>
   * @return A list containing the members.
   */
  java.util.List<java.lang.String>
      getMembersList();
  /**
   * <code>repeated string members = 7 [json_name = "members", (.validate.rules) = { ... }</code>
   * @return The count of members.
   */
  int getMembersCount();
  /**
   * <code>repeated string members = 7 [json_name = "members", (.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The members at the given index.
   */
  java.lang.String getMembers(int index);
  /**
   * <code>repeated string members = 7 [json_name = "members", (.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the members at the given index.
   */
  com.google.protobuf.ByteString
      getMembersBytes(int index);

  /**
   * <code>uint32 required_approval_count = 10 [json_name = "requiredApprovalCount"];</code>
   * @return The requiredApprovalCount.
   */
  int getRequiredApprovalCount();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string policy_id = 8 [json_name = "policyId", (.validate.rules) = { ... }</code>
   * @return The policyId.
   */
  java.lang.String getPolicyId();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string policy_id = 8 [json_name = "policyId", (.validate.rules) = { ... }</code>
   * @return The bytes for policyId.
   */
  com.google.protobuf.ByteString
      getPolicyIdBytes();

  /**
   * <pre>
   * required when create receive only wallet
   * </pre>
   *
   * <code>string destination_wallet_id = 9 [json_name = "destinationWalletId", (.validate.rules) = { ... }</code>
   * @return The destinationWalletId.
   */
  java.lang.String getDestinationWalletId();
  /**
   * <pre>
   * required when create receive only wallet
   * </pre>
   *
   * <code>string destination_wallet_id = 9 [json_name = "destinationWalletId", (.validate.rules) = { ... }</code>
   * @return The bytes for destinationWalletId.
   */
  com.google.protobuf.ByteString
      getDestinationWalletIdBytes();

  /**
   * <code>bool watch_only = 11 [json_name = "watchOnly"];</code>
   * @return The watchOnly.
   */
  boolean getWatchOnly();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string inherit_wallet_id = 12 [json_name = "inheritWalletId", (.validate.rules) = { ... }</code>
   * @return The inheritWalletId.
   */
  java.lang.String getInheritWalletId();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string inherit_wallet_id = 12 [json_name = "inheritWalletId", (.validate.rules) = { ... }</code>
   * @return The bytes for inheritWalletId.
   */
  com.google.protobuf.ByteString
      getInheritWalletIdBytes();
}
