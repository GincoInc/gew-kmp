<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of fiat rate
 *
 * Generated from protobuf message <code>adamant.global.v1.Rate</code>
 */
class Rate extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 1 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>double jpy = 2 [json_name = "jpy"];</code>
     */
    protected $jpy = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $coin
     *     @type float $jpy
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
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
     * Generated from protobuf field <code>double jpy = 2 [json_name = "jpy"];</code>
     * @return float
     */
    public function getJpy()
    {
        return $this->jpy;
    }

    /**
     * Generated from protobuf field <code>double jpy = 2 [json_name = "jpy"];</code>
     * @param float $var
     * @return $this
     */
    public function setJpy($var)
    {
        GPBUtil::checkDouble($var);
        $this->jpy = $var;

        return $this;
    }

}
