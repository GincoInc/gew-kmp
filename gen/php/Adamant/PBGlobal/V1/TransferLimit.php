<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of transfer limit
 *
 * Generated from protobuf message <code>adamant.global.v1.TransferLimit</code>
 */
class TransferLimit extends \Google\Protobuf\Internal\Message
{
    /**
     * id
     *
     * Generated from protobuf field <code>string transfer_limit_id = 1 [json_name = "transferLimitId"];</code>
     */
    protected $transfer_limit_id = '';
    /**
     * name
     *
     * Generated from protobuf field <code>string name = 2 [json_name = "name"];</code>
     */
    protected $name = '';
    /**
     * coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 12 [json_name = "network"];</code>
     */
    protected $network = 0;
    /**
     * The hourly limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 hourly_limit = 4 [json_name = "hourlyLimit"];</code>
     */
    protected $hourly_limit = 0;
    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 daily_limit = 5 [json_name = "dailyLimit"];</code>
     */
    protected $daily_limit = 0;
    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 one_time_limit = 6 [json_name = "oneTimeLimit"];</code>
     */
    protected $one_time_limit = 0;
    /**
     * The proposal about updating the transfer limit
     *
     * Generated from protobuf field <code>.adamant.global.v1.TransferLimitProposal proposal = 7 [json_name = "proposal"];</code>
     */
    protected $proposal = null;
    /**
     * The flag which indicates the transfer limit is reviewed or not
     *
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     */
    protected $is_reviewed = false;
    /**
     * the time at which the whitelist was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
     */
    protected $create_time = null;
    /**
     * the time at which the whitelist was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $transfer_limit_id
     *           id
     *     @type string $name
     *           name
     *     @type int $coin
     *           coin
     *     @type int $network
     *           network
     *     @type int|string $hourly_limit
     *           The hourly limit of amount which the wallet can transfer (in JPY)
     *     @type int|string $daily_limit
     *           The daily limit of amount which the wallet can transfer (in JPY)
     *     @type int|string $one_time_limit
     *           The daily limit of amount which the wallet can transfer (in JPY)
     *     @type \Adamant\PBGlobal\V1\TransferLimitProposal $proposal
     *           The proposal about updating the transfer limit
     *     @type bool $is_reviewed
     *           The flag which indicates the transfer limit is reviewed or not
     *     @type \Google\Protobuf\Timestamp $create_time
     *           the time at which the whitelist was created
     *     @type \Google\Protobuf\Timestamp $update_time
     *           the time at which the whitelist was updated
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string transfer_limit_id = 1 [json_name = "transferLimitId"];</code>
     * @return string
     */
    public function getTransferLimitId()
    {
        return $this->transfer_limit_id;
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string transfer_limit_id = 1 [json_name = "transferLimitId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTransferLimitId($var)
    {
        GPBUtil::checkString($var, True);
        $this->transfer_limit_id = $var;

        return $this;
    }

    /**
     * name
     *
     * Generated from protobuf field <code>string name = 2 [json_name = "name"];</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * name
     *
     * Generated from protobuf field <code>string name = 2 [json_name = "name"];</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin"];</code>
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
     * network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 12 [json_name = "network"];</code>
     * @return int
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 12 [json_name = "network"];</code>
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
     * The hourly limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 hourly_limit = 4 [json_name = "hourlyLimit"];</code>
     * @return int|string
     */
    public function getHourlyLimit()
    {
        return $this->hourly_limit;
    }

    /**
     * The hourly limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 hourly_limit = 4 [json_name = "hourlyLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setHourlyLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->hourly_limit = $var;

        return $this;
    }

    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 daily_limit = 5 [json_name = "dailyLimit"];</code>
     * @return int|string
     */
    public function getDailyLimit()
    {
        return $this->daily_limit;
    }

    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 daily_limit = 5 [json_name = "dailyLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setDailyLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->daily_limit = $var;

        return $this;
    }

    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 one_time_limit = 6 [json_name = "oneTimeLimit"];</code>
     * @return int|string
     */
    public function getOneTimeLimit()
    {
        return $this->one_time_limit;
    }

    /**
     * The daily limit of amount which the wallet can transfer (in JPY)
     *
     * Generated from protobuf field <code>int64 one_time_limit = 6 [json_name = "oneTimeLimit"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setOneTimeLimit($var)
    {
        GPBUtil::checkInt64($var);
        $this->one_time_limit = $var;

        return $this;
    }

    /**
     * The proposal about updating the transfer limit
     *
     * Generated from protobuf field <code>.adamant.global.v1.TransferLimitProposal proposal = 7 [json_name = "proposal"];</code>
     * @return \Adamant\PBGlobal\V1\TransferLimitProposal|null
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
     * The proposal about updating the transfer limit
     *
     * Generated from protobuf field <code>.adamant.global.v1.TransferLimitProposal proposal = 7 [json_name = "proposal"];</code>
     * @param \Adamant\PBGlobal\V1\TransferLimitProposal $var
     * @return $this
     */
    public function setProposal($var)
    {
        GPBUtil::checkMessage($var, \Adamant\PBGlobal\V1\TransferLimitProposal::class);
        $this->proposal = $var;

        return $this;
    }

    /**
     * The flag which indicates the transfer limit is reviewed or not
     *
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     * @return bool
     */
    public function getIsReviewed()
    {
        return $this->is_reviewed;
    }

    /**
     * The flag which indicates the transfer limit is reviewed or not
     *
     * Generated from protobuf field <code>bool is_reviewed = 8 [json_name = "isReviewed"];</code>
     * @param bool $var
     * @return $this
     */
    public function setIsReviewed($var)
    {
        GPBUtil::checkBool($var);
        $this->is_reviewed = $var;

        return $this;
    }

    /**
     * the time at which the whitelist was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
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
     * the time at which the whitelist was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
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
     * the time at which the whitelist was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
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
     * the time at which the whitelist was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
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

