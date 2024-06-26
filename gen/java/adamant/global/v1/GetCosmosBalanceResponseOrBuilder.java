// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface GetCosmosBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.GetCosmosBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adamant.global.v1.CosmosDelegation delegations = 1 [json_name = "delegations"];</code>
   */
  java.util.List<adamant.global.v1.Model.CosmosDelegation> 
      getDelegationsList();
  /**
   * <code>repeated .adamant.global.v1.CosmosDelegation delegations = 1 [json_name = "delegations"];</code>
   */
  adamant.global.v1.Model.CosmosDelegation getDelegations(int index);
  /**
   * <code>repeated .adamant.global.v1.CosmosDelegation delegations = 1 [json_name = "delegations"];</code>
   */
  int getDelegationsCount();
  /**
   * <code>repeated .adamant.global.v1.CosmosDelegation delegations = 1 [json_name = "delegations"];</code>
   */
  java.util.List<? extends adamant.global.v1.Model.CosmosDelegationOrBuilder> 
      getDelegationsOrBuilderList();
  /**
   * <code>repeated .adamant.global.v1.CosmosDelegation delegations = 1 [json_name = "delegations"];</code>
   */
  adamant.global.v1.Model.CosmosDelegationOrBuilder getDelegationsOrBuilder(
      int index);

  /**
   * <code>double available = 2 [json_name = "available"];</code>
   * @return The available.
   */
  double getAvailable();

  /**
   * <code>double reward = 3 [json_name = "reward"];</code>
   * @return The reward.
   */
  double getReward();

  /**
   * <code>double unbonding = 4 [json_name = "unbonding"];</code>
   * @return The unbonding.
   */
  double getUnbonding();
}
