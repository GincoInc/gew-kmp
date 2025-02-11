<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.CreatePreTransactionThresholdRequest</code>
 */
class CreatePreTransactionThresholdRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     */
    protected $network = 0;
    /**
     * Generated from protobuf field <code>double value = 3 [json_name = "value"];</code>
     */
    protected $value = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $coin
     *     @type int $network
     *     @type float $value
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
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
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
     * @return int
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network"];</code>
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

}

