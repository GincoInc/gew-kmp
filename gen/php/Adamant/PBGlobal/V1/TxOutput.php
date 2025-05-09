<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of transaction output
 *
 * Generated from protobuf message <code>adamant.global.v1.TxOutput</code>
 */
class TxOutput extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string address = 1 [json_name = "address"];</code>
     */
    protected $address = '';
    /**
     * Generated from protobuf field <code>double value = 2 [json_name = "value"];</code>
     */
    protected $value = 0.0;
    /**
     * Generated from protobuf field <code>string string_value = 3 [json_name = "stringValue"];</code>
     */
    protected $string_value = '';
    /**
     * Generated from protobuf field <code>bool is_change = 4 [json_name = "isChange"];</code>
     */
    protected $is_change = false;
    /**
     * Generated from protobuf field <code>uint32 tx_output_index = 5 [json_name = "txOutputIndex"];</code>
     */
    protected $tx_output_index = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $address
     *     @type float $value
     *     @type string $string_value
     *     @type bool $is_change
     *     @type int $tx_output_index
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string address = 1 [json_name = "address"];</code>
     * @return string
     */
    public function getAddress()
    {
        return $this->address;
    }

    /**
     * Generated from protobuf field <code>string address = 1 [json_name = "address"];</code>
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
     * Generated from protobuf field <code>double value = 2 [json_name = "value"];</code>
     * @return float
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>double value = 2 [json_name = "value"];</code>
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
     * Generated from protobuf field <code>string string_value = 3 [json_name = "stringValue"];</code>
     * @return string
     */
    public function getStringValue()
    {
        return $this->string_value;
    }

    /**
     * Generated from protobuf field <code>string string_value = 3 [json_name = "stringValue"];</code>
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
     * Generated from protobuf field <code>bool is_change = 4 [json_name = "isChange"];</code>
     * @return bool
     */
    public function getIsChange()
    {
        return $this->is_change;
    }

    /**
     * Generated from protobuf field <code>bool is_change = 4 [json_name = "isChange"];</code>
     * @param bool $var
     * @return $this
     */
    public function setIsChange($var)
    {
        GPBUtil::checkBool($var);
        $this->is_change = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_output_index = 5 [json_name = "txOutputIndex"];</code>
     * @return int
     */
    public function getTxOutputIndex()
    {
        return $this->tx_output_index;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_output_index = 5 [json_name = "txOutputIndex"];</code>
     * @param int $var
     * @return $this
     */
    public function setTxOutputIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->tx_output_index = $var;

        return $this;
    }

}

