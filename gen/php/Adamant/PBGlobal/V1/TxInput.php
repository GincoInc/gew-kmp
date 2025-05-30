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
     * Generated from protobuf field <code>uint32 tx_input_index = 5 [json_name = "txInputIndex"];</code>
     */
    protected $tx_input_index = 0;
    /**
     * Generated from protobuf field <code>string address = 6 [json_name = "address"];</code>
     */
    protected $address = '';
    /**
     * Generated from protobuf field <code>string witness_script = 7 [json_name = "witnessScript"];</code>
     */
    protected $witness_script = '';
    /**
     * Generated from protobuf field <code>uint32 n_sequence = 8 [json_name = "nSequence"];</code>
     */
    protected $n_sequence = 0;
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 9 [json_name = "addressType"];</code>
     */
    protected $address_type = 0;

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
     *     @type int $tx_input_index
     *     @type string $address
     *     @type string $witness_script
     *     @type int $n_sequence
     *     @type int $address_type
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

    /**
     * Generated from protobuf field <code>uint32 tx_input_index = 5 [json_name = "txInputIndex"];</code>
     * @return int
     */
    public function getTxInputIndex()
    {
        return $this->tx_input_index;
    }

    /**
     * Generated from protobuf field <code>uint32 tx_input_index = 5 [json_name = "txInputIndex"];</code>
     * @param int $var
     * @return $this
     */
    public function setTxInputIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->tx_input_index = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string address = 6 [json_name = "address"];</code>
     * @return string
     */
    public function getAddress()
    {
        return $this->address;
    }

    /**
     * Generated from protobuf field <code>string address = 6 [json_name = "address"];</code>
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
     * Generated from protobuf field <code>string witness_script = 7 [json_name = "witnessScript"];</code>
     * @return string
     */
    public function getWitnessScript()
    {
        return $this->witness_script;
    }

    /**
     * Generated from protobuf field <code>string witness_script = 7 [json_name = "witnessScript"];</code>
     * @param string $var
     * @return $this
     */
    public function setWitnessScript($var)
    {
        GPBUtil::checkString($var, True);
        $this->witness_script = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 n_sequence = 8 [json_name = "nSequence"];</code>
     * @return int
     */
    public function getNSequence()
    {
        return $this->n_sequence;
    }

    /**
     * Generated from protobuf field <code>uint32 n_sequence = 8 [json_name = "nSequence"];</code>
     * @param int $var
     * @return $this
     */
    public function setNSequence($var)
    {
        GPBUtil::checkUint32($var);
        $this->n_sequence = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 9 [json_name = "addressType"];</code>
     * @return int
     */
    public function getAddressType()
    {
        return $this->address_type;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 9 [json_name = "addressType"];</code>
     * @param int $var
     * @return $this
     */
    public function setAddressType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\AddressType::class);
        $this->address_type = $var;

        return $this;
    }

}

