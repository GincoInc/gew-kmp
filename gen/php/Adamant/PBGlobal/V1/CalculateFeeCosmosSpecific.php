<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of Cosmos specific fields of CalculateFee
 *
 * Generated from protobuf message <code>adamant.global.v1.CalculateFeeCosmosSpecific</code>
 */
class CalculateFeeCosmosSpecific extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.CosmosMsgType type = 1 [json_name = "type"];</code>
     */
    protected $type = 0;
    /**
     * Generated from protobuf field <code>string memo = 2 [json_name = "memo"];</code>
     */
    protected $memo = '';
    /**
     * Generated from protobuf field <code>double gas_adjustment = 3 [json_name = "gasAdjustment"];</code>
     */
    protected $gas_adjustment = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $type
     *     @type string $memo
     *     @type float $gas_adjustment
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.CosmosMsgType type = 1 [json_name = "type"];</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.CosmosMsgType type = 1 [json_name = "type"];</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\CosmosMsgType::class);
        $this->type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string memo = 2 [json_name = "memo"];</code>
     * @return string
     */
    public function getMemo()
    {
        return $this->memo;
    }

    /**
     * Generated from protobuf field <code>string memo = 2 [json_name = "memo"];</code>
     * @param string $var
     * @return $this
     */
    public function setMemo($var)
    {
        GPBUtil::checkString($var, True);
        $this->memo = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double gas_adjustment = 3 [json_name = "gasAdjustment"];</code>
     * @return float
     */
    public function getGasAdjustment()
    {
        return $this->gas_adjustment;
    }

    /**
     * Generated from protobuf field <code>double gas_adjustment = 3 [json_name = "gasAdjustment"];</code>
     * @param float $var
     * @return $this
     */
    public function setGasAdjustment($var)
    {
        GPBUtil::checkDouble($var);
        $this->gas_adjustment = $var;

        return $this;
    }

}
