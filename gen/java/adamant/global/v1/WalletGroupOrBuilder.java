// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

public interface WalletGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.WalletGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wallet_group_id = 1 [json_name = "walletGroupId"];</code>
   * @return The walletGroupId.
   */
  java.lang.String getWalletGroupId();
  /**
   * <code>string wallet_group_id = 1 [json_name = "walletGroupId"];</code>
   * @return The bytes for walletGroupId.
   */
  com.google.protobuf.ByteString
      getWalletGroupIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin"];</code>
   * @return The enum numeric value on the wire for coin.
   */
  int getCoinValue();
  /**
   * <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin"];</code>
   * @return The coin.
   */
  java.gincoinc.global.v1.Coin getCoin();

  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 4 [json_name = "wallets"];</code>
   */
  java.util.List<java.adamant.global.v1.Wallet> 
      getWalletsList();
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 4 [json_name = "wallets"];</code>
   */
  java.adamant.global.v1.Wallet getWallets(int index);
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 4 [json_name = "wallets"];</code>
   */
  int getWalletsCount();
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 4 [json_name = "wallets"];</code>
   */
  java.util.List<? extends java.adamant.global.v1.WalletOrBuilder> 
      getWalletsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.Wallet wallets = 4 [json_name = "wallets"];</code>
   */
  java.adamant.global.v1.WalletOrBuilder getWalletsOrBuilder(
      int index);

  /**
   * <code>bool watch_only = 7 [json_name = "watchOnly"];</code>
   * @return The watchOnly.
   */
  boolean getWatchOnly();

  /**
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 5 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 6 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}