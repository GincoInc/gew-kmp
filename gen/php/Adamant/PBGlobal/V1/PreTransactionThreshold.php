<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of PreTransactionThreshold
 *
 * Generated from protobuf message <code>adamant.global.v1.PreTransactionThreshold</code>
 */
class PreTransactionThreshold extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string pre_transaction_threshold_id = 1 [json_name = "preTransactionThresholdId"];</code>
     */
    protected $pre_transaction_threshold_id = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 3 [json_name = "network"];</code>
     */
    protected $network = 0;
    /**
     * Generated from protobuf field <code>double value = 4 [json_name = "value"];</code>
     */
    protected $value = 0.0;
    /**
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionThresholdProposal proposal = 5 [json_name = "proposal"];</code>
     */
    protected $proposal = null;
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
     */
    protected $create_time = null;
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $pre_transaction_threshold_id
     *     @type int $coin
     *     @type int $network
     *     @type float $value
     *     @type \Adamant\PBGlobal\V1\PreTransactionThresholdProposal $proposal
     *     @type \Google\Protobuf\Timestamp $create_time
     *     @type \Google\Protobuf\Timestamp $update_time
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string pre_transaction_threshold_id = 1 [json_name = "preTransactionThresholdId"];</code>
     * @return string
     */
    public function getPreTransactionThresholdId()
    {
        return $this->pre_transaction_threshold_id;
    }

    /**
     * Generated from protobuf field <code>string pre_transaction_threshold_id = 1 [json_name = "preTransactionThresholdId"];</code>
     * @param string $var
     * @return $this
     */
    public function setPreTransactionThresholdId($var)
    {
        GPBUtil::checkString($var, True);
        $this->pre_transaction_threshold_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin"];</code>
     * @param int $var
     * @return $this
     */
    public function setCoin($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\Coin::class);
        $this->coin = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 3 [json_name = "network"];</code>
     * @return int
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 3 [json_name = "network"];</code>
     * @param int $var
     * @return $this
     */
    public function setNetwork($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\Network::class);
        $this->network = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double value = 4 [json_name = "value"];</code>
     * @return float
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>double value = 4 [json_name = "value"];</code>
     * @param float $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkDouble($var);
        $this->value = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionThresholdProposal proposal = 5 [json_name = "proposal"];</code>
     * @return \Adamant\PBGlobal\V1\PreTransactionThresholdProposal|null
     */
    public function getProposal()
    {
        return $this->proposal;
    }

    public function hasProposal()
    {
        return isset($this->proposal);
    }

    public function clearProposal()
    {
        unset($this->proposal);
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionThresholdProposal proposal = 5 [json_name = "proposal"];</code>
     * @param \Adamant\PBGlobal\V1\PreTransactionThresholdProposal $var
     * @return $this
     */
    public function setProposal($var)
    {
        GPBUtil::checkMessage($var, \Adamant\PBGlobal\V1\PreTransactionThresholdProposal::class);
        $this->proposal = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    public function hasCreateTime()
    {
        return isset($this->create_time);
    }

    public function clearCreateTime()
    {
        unset($this->create_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    public function hasUpdateTime()
    {
        return isset($this->update_time);
    }

    public function clearUpdateTime()
    {
        unset($this->update_time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setUpdateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->update_time = $var;

        return $this;
    }

}
