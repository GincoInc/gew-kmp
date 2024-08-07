<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.FlushBalanceResponse</code>
 */
class FlushBalanceResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1 [json_name = "flushedAddresses"];</code>
     */
    private $flushed_addresses;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\FlushedAddress>|\Google\Protobuf\Internal\RepeatedField $flushed_addresses
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1 [json_name = "flushedAddresses"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFlushedAddresses()
    {
        return $this->flushed_addresses;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1 [json_name = "flushedAddresses"];</code>
     * @param array<\Adamant\PBGlobal\V1\FlushedAddress>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFlushedAddresses($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\FlushedAddress::class);
        $this->flushed_addresses = $arr;

        return $this;
    }

}

