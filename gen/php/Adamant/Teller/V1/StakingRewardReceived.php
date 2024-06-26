<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/teller/v1/adamanttellerv1/event.proto

namespace Adamant\Teller\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.teller.v1.StakingRewardReceived</code>
 */
class StakingRewardReceived extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string event_id = 1 [json_name = "eventId"];</code>
     */
    protected $event_id = '';
    /**
     * Generated from protobuf field <code>string validator_id = 2 [json_name = "validatorId"];</code>
     */
    protected $validator_id = '';
    /**
     * Generated from protobuf field <code>double value = 3 [json_name = "value"];</code>
     */
    protected $value = 0.0;
    /**
     * Generated from protobuf field <code>string string_value = 4 [json_name = "stringValue"];</code>
     */
    protected $string_value = '';
    /**
     * Generated from protobuf field <code>string tx_id = 5 [json_name = "txId"];</code>
     */
    protected $tx_id = '';
    /**
     * Generated from protobuf field <code>uint32 tx_index = 6 [json_name = "txIndex"];</code>
     */
    protected $tx_index = 0;
    /**
     * Generated from protobuf field <code>string wallet_id = 7 [json_name = "walletId"];</code>
     */
    protected $wallet_id = '';
    /**
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
     */
    protected $address = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 9 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp time = 10 [json_name = "time"];</code>
     */
    protected $time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $event_id
     *     @type string $validator_id
     *     @type float $value
     *     @type string $string_value
     *     @type string $tx_id
     *     @type int $tx_index
     *     @type string $wallet_id
     *     @type string $address
     *     @type int $coin
     *     @type \Google\Protobuf\Timestamp $time
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\Teller\V1\Adamanttellerv1\Event::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string event_id = 1 [json_name = "eventId"];</code>
     * @return string
     */
    public function getEventId()
    {
        return $this->event_id;
    }

    /**
     * Generated from protobuf field <code>string event_id = 1 [json_name = "eventId"];</code>
     * @param string $var
     * @return $this
     */
    public function setEventId($var)
    {
        GPBUtil::checkString($var, True);
        $this->event_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string validator_id = 2 [json_name = "validatorId"];</code>
     * @return string
     */
    public function getValidatorId()
    {
        return $this->validator_id;
    }

    /**
     * Generated from protobuf field <code>string validator_id = 2 [json_name = "validatorId"];</code>
     * @param string $var
     * @return $this
     */
    public function setValidatorId($var)
    {
        GPBUtil::checkString($var, True);
        $this->validator_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double value = 3 [json_name = "value"];</code>
     * @return float
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>double value = 3 [json_name = "value"];</code>
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
     * Generated from protobuf field <code>string string_value = 4 [json_name = "stringValue"];</code>
     * @return string
     */
    public function getStringValue()
    {
        return $this->string_value;
    }

    /**
     * Generated from protobuf field <code>string string_value = 4 [json_name = "stringValue"];</code>
     * @param string $var
     * @return $this
     */
    public function setStringValue($var)
    {
        GPBUtil::checkString($var, True);
        $this->string_value = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string tx_id = 5 [json_name = "txId"];</code>
     * @return string
     */
    public function getTxId()
    {
        return $this->tx_id;
    }

    /**
     * Generated from protobuf field <code>string tx_id = 5 [json_name = "txId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTxId($var)
    {
        GPBUtil::checkString($var, True);
        $this->tx_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_index = 6 [json_name = "txIndex"];</code>
     * @return int
     */
    public function getTxIndex()
    {
        return $this->tx_index;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_index = 6 [json_name = "txIndex"];</code>
     * @param int $var
     * @return $this
     */
    public function setTxIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->tx_index = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 7 [json_name = "walletId"];</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 7 [json_name = "walletId"];</code>
     * @param string $var
     * @return $this
     */
    public function setWalletId($var)
    {
        GPBUtil::checkString($var, True);
        $this->wallet_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
     * @return string
     */
    public function getAddress()
    {
        return $this->address;
    }

    /**
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
     * @param string $var
     * @return $this
     */
    public function setAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->address = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 9 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 9 [json_name = "coin"];</code>
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
     * Generated from protobuf field <code>.google.protobuf.Timestamp time = 10 [json_name = "time"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getTime()
    {
        return $this->time;
    }

    public function hasTime()
    {
        return isset($this->time);
    }

    public function clearTime()
    {
        unset($this->time);
    }

    /**
     * Generated from protobuf field <code>.google.protobuf.Timestamp time = 10 [json_name = "time"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->time = $var;

        return $this;
    }

}

