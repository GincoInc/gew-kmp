// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

package java.adamant.global.v1;

public interface BalanceSnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.BalanceSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 1 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: TotalBalanceByCoin
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.TotalBalanceByCoin&gt; total_balances = 2 [json_name = "totalBalances", (.validate.rules) = { ... }</code>
   */
  int getTotalBalancesCount();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: TotalBalanceByCoin
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.TotalBalanceByCoin&gt; total_balances = 2 [json_name = "totalBalances", (.validate.rules) = { ... }</code>
   */
  boolean containsTotalBalances(
      int key);
  /**
   * Use {@link #getTotalBalancesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.adamant.global.v1.TotalBalanceByCoin>
  getTotalBalances();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: TotalBalanceByCoin
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.TotalBalanceByCoin&gt; total_balances = 2 [json_name = "totalBalances", (.validate.rules) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.adamant.global.v1.TotalBalanceByCoin>
  getTotalBalancesMap();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: TotalBalanceByCoin
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.TotalBalanceByCoin&gt; total_balances = 2 [json_name = "totalBalances", (.validate.rules) = { ... }</code>
   */

  java.adamant.global.v1.TotalBalanceByCoin getTotalBalancesOrDefault(
      int key,
      java.adamant.global.v1.TotalBalanceByCoin defaultValue);
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: TotalBalanceByCoin
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.TotalBalanceByCoin&gt; total_balances = 2 [json_name = "totalBalances", (.validate.rules) = { ... }</code>
   */

  java.adamant.global.v1.TotalBalanceByCoin getTotalBalancesOrThrow(
      int key);

  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: Rate
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.Rate&gt; rates = 3 [json_name = "rates", (.validate.rules) = { ... }</code>
   */
  int getRatesCount();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: Rate
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.Rate&gt; rates = 3 [json_name = "rates", (.validate.rules) = { ... }</code>
   */
  boolean containsRates(
      int key);
  /**
   * Use {@link #getRatesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.adamant.global.v1.Rate>
  getRates();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: Rate
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.Rate&gt; rates = 3 [json_name = "rates", (.validate.rules) = { ... }</code>
   */
  java.util.Map<java.lang.Integer, java.adamant.global.v1.Rate>
  getRatesMap();
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: Rate
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.Rate&gt; rates = 3 [json_name = "rates", (.validate.rules) = { ... }</code>
   */

  java.adamant.global.v1.Rate getRatesOrDefault(
      int key,
      java.adamant.global.v1.Rate defaultValue);
  /**
   * <pre>
   * map&lt;k, v&gt; ... k: enum number of Coin / v: Rate
   * </pre>
   *
   * <code>map&lt;uint32, .adamant.global.v1.Rate&gt; rates = 3 [json_name = "rates", (.validate.rules) = { ... }</code>
   */

  java.adamant.global.v1.Rate getRatesOrThrow(
      int key);
}