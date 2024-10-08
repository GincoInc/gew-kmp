<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.CreateContractCreationTransactionRequest</code>
 */
class CreateContractCreationTransactionRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     */
    protected $wallet_id = '';
    /**
     * Generated from protobuf field <code>uint64 fee_rate = 2 [json_name = "feeRate"];</code>
     */
    protected $fee_rate = 0;
    /**
     * Generated from protobuf field <code>string bytecode = 3 [json_name = "bytecode"];</code>
     */
    protected $bytecode = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.ContractCreationType contract_creation_type = 4 [json_name = "contractCreationType", (.validate.rules) = {</code>
     */
    protected $contract_creation_type = 0;
    /**
     * Generated from protobuf field <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = {</code>
     */
    protected $contract_address = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $wallet_id
     *     @type int|string $fee_rate
     *     @type string $bytecode
     *     @type int $contract_creation_type
     *     @type string $contract_address
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
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
     * Generated from protobuf field <code>uint64 fee_rate = 2 [json_name = "feeRate"];</code>
     * @return int|string
     */
    public function getFeeRate()
    {
        return $this->fee_rate;
    }

    /**
     * Generated from protobuf field <code>uint64 fee_rate = 2 [json_name = "feeRate"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setFeeRate($var)
    {
        GPBUtil::checkUint64($var);
        $this->fee_rate = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string bytecode = 3 [json_name = "bytecode"];</code>
     * @return string
     */
    public function getBytecode()
    {
        return $this->bytecode;
    }

    /**
     * Generated from protobuf field <code>string bytecode = 3 [json_name = "bytecode"];</code>
     * @param string $var
     * @return $this
     */
    public function setBytecode($var)
    {
        GPBUtil::checkString($var, True);
        $this->bytecode = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.ContractCreationType contract_creation_type = 4 [json_name = "contractCreationType", (.validate.rules) = {</code>
     * @return int
     */
    public function getContractCreationType()
    {
        return $this->contract_creation_type;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.ContractCreationType contract_creation_type = 4 [json_name = "contractCreationType", (.validate.rules) = {</code>
     * @param int $var
     * @return $this
     */
    public function setContractCreationType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\ContractCreationType::class);
        $this->contract_creation_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = {</code>
     * @return string
     */
    public function getContractAddress()
    {
        return isset($this->contract_address) ? $this->contract_address : '';
    }

    public function hasContractAddress()
    {
        return isset($this->contract_address);
    }

    public function clearContractAddress()
    {
        unset($this->contract_address);
    }

    /**
     * Generated from protobuf field <code>optional string contract_address = 5 [json_name = "contractAddress", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setContractAddress($var)
    {
        GPBUtil::checkString($var, True);
        $this->contract_address = $var;

        return $this;
    }

}

