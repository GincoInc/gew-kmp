<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListUTXOsResponse</code>
 */
class ListUTXOsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.UTXO utxos = 1 [json_name = "utxos"];</code>
     */
    private $utxos;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\UTXO>|\Google\Protobuf\Internal\RepeatedField $utxos
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.UTXO utxos = 1 [json_name = "utxos"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getUtxos()
    {
        return $this->utxos;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.UTXO utxos = 1 [json_name = "utxos"];</code>
     * @param array<\Adamant\PBGlobal\V1\UTXO>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setUtxos($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\UTXO::class);
        $this->utxos = $arr;

        return $this;
    }

}

