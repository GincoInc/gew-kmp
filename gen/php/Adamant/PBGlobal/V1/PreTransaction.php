<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of pre transaction
 *
 * Generated from protobuf message <code>adamant.global.v1.PreTransaction</code>
 */
class PreTransaction extends \Google\Protobuf\Internal\Message
{
    /**
     * id
     *
     * Generated from protobuf field <code>string pre_transaction_id = 1 [json_name = "preTransactionId"];</code>
     */
    protected $pre_transaction_id = '';
    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 2 [json_name = "ownerId"];</code>
     */
    protected $owner_id = '';
    /**
     * external withdrawal id
     *
     * Generated from protobuf field <code>string external_id = 3 [json_name = "externalId"];</code>
     */
    protected $external_id = '';
    /**
     * The type of coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 5 [json_name = "network"];</code>
     */
    protected $network = 0;
    /**
     * Details about recipients
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionDetail details = 6 [json_name = "details"];</code>
     */
    private $details;
    /**
     * The state of pre-transaction
     *
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionState state = 7 [json_name = "state"];</code>
     */
    protected $state = 0;
    /**
     * transaction id for which pre-transaction is used
     *
     * Generated from protobuf field <code>string transaction_id = 8 [json_name = "transactionId"];</code>
     */
    protected $transaction_id = '';
    /**
     * the time at which the pre transaction was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
     */
    protected $create_time = null;
    /**
     * the time at which the pre transaction was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $pre_transaction_id
     *           id
     *     @type string $owner_id
     *           organization id
     *     @type string $external_id
     *           external withdrawal id
     *     @type int $coin
     *           The type of coin
     *     @type int $network
     *           Network
     *     @type array<\Adamant\PBGlobal\V1\PreTransactionDetail>|\Google\Protobuf\Internal\RepeatedField $details
     *           Details about recipients
     *     @type int $state
     *           The state of pre-transaction
     *     @type string $transaction_id
     *           transaction id for which pre-transaction is used
     *     @type \Google\Protobuf\Timestamp $create_time
     *           the time at which the pre transaction was created
     *     @type \Google\Protobuf\Timestamp $update_time
     *           the time at which the pre transaction was updated
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string pre_transaction_id = 1 [json_name = "preTransactionId"];</code>
     * @return string
     */
    public function getPreTransactionId()
    {
        return $this->pre_transaction_id;
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string pre_transaction_id = 1 [json_name = "preTransactionId"];</code>
     * @param string $var
     * @return $this
     */
    public function setPreTransactionId($var)
    {
        GPBUtil::checkString($var, True);
        $this->pre_transaction_id = $var;

        return $this;
    }

    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 2 [json_name = "ownerId"];</code>
     * @return string
     */
    public function getOwnerId()
    {
        return $this->owner_id;
    }

    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 2 [json_name = "ownerId"];</code>
     * @param string $var
     * @return $this
     */
    public function setOwnerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->owner_id = $var;

        return $this;
    }

    /**
     * external withdrawal id
     *
     * Generated from protobuf field <code>string external_id = 3 [json_name = "externalId"];</code>
     * @return string
     */
    public function getExternalId()
    {
        return $this->external_id;
    }

    /**
     * external withdrawal id
     *
     * Generated from protobuf field <code>string external_id = 3 [json_name = "externalId"];</code>
     * @param string $var
     * @return $this
     */
    public function setExternalId($var)
    {
        GPBUtil::checkString($var, True);
        $this->external_id = $var;

        return $this;
    }

    /**
     * The type of coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * The type of coin
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
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
     * Network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 5 [json_name = "network"];</code>
     * @return int
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * Network
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 5 [json_name = "network"];</code>
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
     * Details about recipients
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionDetail details = 6 [json_name = "details"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDetails()
    {
        return $this->details;
    }

    /**
     * Details about recipients
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.PreTransactionDetail details = 6 [json_name = "details"];</code>
     * @param array<\Adamant\PBGlobal\V1\PreTransactionDetail>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDetails($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\PreTransactionDetail::class);
        $this->details = $arr;

        return $this;
    }

    /**
     * The state of pre-transaction
     *
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionState state = 7 [json_name = "state"];</code>
     * @return int
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * The state of pre-transaction
     *
     * Generated from protobuf field <code>.adamant.global.v1.PreTransactionState state = 7 [json_name = "state"];</code>
     * @param int $var
     * @return $this
     */
    public function setState($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\PreTransactionState::class);
        $this->state = $var;

        return $this;
    }

    /**
     * transaction id for which pre-transaction is used
     *
     * Generated from protobuf field <code>string transaction_id = 8 [json_name = "transactionId"];</code>
     * @return string
     */
    public function getTransactionId()
    {
        return $this->transaction_id;
    }

    /**
     * transaction id for which pre-transaction is used
     *
     * Generated from protobuf field <code>string transaction_id = 8 [json_name = "transactionId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTransactionId($var)
    {
        GPBUtil::checkString($var, True);
        $this->transaction_id = $var;

        return $this;
    }

    /**
     * the time at which the pre transaction was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
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
     * the time at which the pre transaction was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
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
     * the time at which the pre transaction was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
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
     * the time at which the pre transaction was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
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
