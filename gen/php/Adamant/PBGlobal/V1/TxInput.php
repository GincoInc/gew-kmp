<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of transaction input
 *
 * Generated from protobuf message <code>adamant.global.v1.TxInput</code>
 */
class TxInput extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
     */
    protected $tx_id = '';
    /**
     * Generated from protobuf field <code>uint32 tx_index = 2 [json_name = "txIndex"];</code>
     */
    protected $tx_index = 0;
    /**
     * Generated from protobuf field <code>double value = 3 [json_name = "value"];</code>
     */
    protected $value = 0.0;
    /**
     * Generated from protobuf field <code>string string_value = 4 [json_name = "stringValue"];</code>
     */
    protected $string_value = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $tx_id
     *     @type int $tx_index
     *     @type float $value
     *     @type string $string_value
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
     * @return string
     */
    public function getTxId()
    {
        return $this->tx_id;
    }

    /**
     * Generated from protobuf field <code>string tx_id = 1 [json_name = "txId"];</code>
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
     * Generated from protobuf field <code>uint32 tx_index = 2 [json_name = "txIndex"];</code>
     * @return int
     */
    public function getTxIndex()
    {
        return $this->tx_index;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_index = 2 [json_name = "txIndex"];</code>
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

}

