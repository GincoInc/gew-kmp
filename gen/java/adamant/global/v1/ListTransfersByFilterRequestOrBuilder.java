// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListTransfersByFilterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListTransfersByFilterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.adamant.global.v1.ListFilterType filter_type = 1 [(.validate.rules) = { ... }</code>
   */
  int getFilterTypeValue();
  /**
   * <code>.adamant.global.v1.ListFilterType filter_type = 1 [(.validate.rules) = { ... }</code>
   */
  adamant.global.v1.Enum.ListFilterType getFilterType();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string transfer_id = 2;</code>
   */
  java.lang.String getTransferId();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string transfer_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getTransferIdBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string wallet_id = 13;</code>
   */
  java.lang.String getWalletId();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string wallet_id = 13;</code>
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string wallet_name = 3 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getWalletName();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string wallet_name = 3 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getWalletNameBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string address_name = 4 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getAddressName();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string address_name = 4 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getAddressNameBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string address = 5;</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string address = 5;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string txid = 6;</code>
   */
  java.lang.String getTxid();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string txid = 6;</code>
   */
  com.google.protobuf.ByteString
      getTxidBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>bool watch_only = 12;</code>
   */
  boolean getWatchOnly();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.gincoinc.global.v1.Coin coin = 7 [(.validate.rules) = { ... }</code>
   */
  int getCoinValue();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.gincoinc.global.v1.Coin coin = 7 [(.validate.rules) = { ... }</code>
   */
  gincoinc.global.v1.Enum.Coin getCoin();

  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 8;</code>
   */
  java.util.List<adamant.global.v1.Enum.WalletType> getWalletTypeList();
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 8;</code>
   */
  int getWalletTypeCount();
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 8;</code>
   */
  adamant.global.v1.Enum.WalletType getWalletType(int index);
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 8;</code>
   */
  java.util.List<java.lang.Integer>
  getWalletTypeValueList();
  /**
   * <code>repeated .adamant.global.v1.WalletType wallet_type = 8;</code>
   */
  int getWalletTypeValue(int index);

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.gincoinc.global.v1.TransferType transfer_type = 9 [(.validate.rules) = { ... }</code>
   */
  int getTransferTypeValue();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.gincoinc.global.v1.TransferType transfer_type = 9 [(.validate.rules) = { ... }</code>
   */
  gincoinc.global.v1.Enum.TransferType getTransferType();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>uint32 page_size = 10 [(.validate.rules) = { ... }</code>
   */
  int getPageSize();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string page_token = 11 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>string page_token = 11 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 15;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 15;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 15;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
