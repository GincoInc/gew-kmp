// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface ListBalanceSnapshotsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.ListBalanceSnapshotsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.BalanceSnapshot balance_snapshots = 1 [json_name = "balanceSnapshots"];</code>
   */
  java.util.List<adamant.global.v1.Model.BalanceSnapshot> 
      getBalanceSnapshotsList();
  /**
   * <code>repeated .adamant.global.v1.BalanceSnapshot balance_snapshots = 1 [json_name = "balanceSnapshots"];</code>
   */
  adamant.global.v1.Model.BalanceSnapshot getBalanceSnapshots(int index);
  /**
   * <code>repeated .adamant.global.v1.BalanceSnapshot balance_snapshots = 1 [json_name = "balanceSnapshots"];</code>
   */
  int getBalanceSnapshotsCount();
  /**
   * <code>repeated .adamant.global.v1.BalanceSnapshot balance_snapshots = 1 [json_name = "balanceSnapshots"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.BalanceSnapshotOrBuilder> 
      getBalanceSnapshotsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.BalanceSnapshot balance_snapshots = 1 [json_name = "balanceSnapshots"];</code>
   */
  adamant.global.v1.Model.BalanceSnapshotOrBuilder getBalanceSnapshotsOrBuilder(
      int index);
}
