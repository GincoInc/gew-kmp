<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of total balace
 *
 * Generated from protobuf message <code>adamant.global.v1.TotalBalance</code>
 */
class TotalBalance extends \Google\Protobuf\Internal\Message
{
    /**
     * map<k, v> ... k: enum number of Coin / v: TotalBalanceByCoin
     *
     * Generated from protobuf field <code>map<uint32, .adamant.global.v1.TotalBalanceByCoin> total_balances = 1 [json_name = "totalBalances", (.validate.rules) = {</code>
     */
    private $total_balances;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array|\Google\Protobuf\Internal\MapField $total_balances
     *           map<k, v> ... k: enum number of Coin / v: TotalBalanceByCoin
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * map<k, v> ... k: enum number of Coin / v: TotalBalanceByCoin
     *
     * Generated from protobuf field <code>map<uint32, .adamant.global.v1.TotalBalanceByCoin> total_balances = 1 [json_name = "totalBalances", (.validate.rules) = {</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getTotalBalances()
    {
        return $this->total_balances;
    }

    /**
     * map<k, v> ... k: enum number of Coin / v: TotalBalanceByCoin
     *
     * Generated from protobuf field <code>map<uint32, .adamant.global.v1.TotalBalanceByCoin> total_balances = 1 [json_name = "totalBalances", (.validate.rules) = {</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setTotalBalances($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::UINT32, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\TotalBalanceByCoin::class);
        $this->total_balances = $arr;

        return $this;
    }

}
