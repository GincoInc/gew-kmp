<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListSubstrateChildAddressesResponse</code>
 */
class ListSubstrateChildAddressesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SubstrateChildAddress substrate_child_addresses = 1 [json_name = "substrateChildAddresses"];</code>
     */
    private $substrate_child_addresses;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\SubstrateChildAddress>|\Google\Protobuf\Internal\RepeatedField $substrate_child_addresses
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SubstrateChildAddress substrate_child_addresses = 1 [json_name = "substrateChildAddresses"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSubstrateChildAddresses()
    {
        return $this->substrate_child_addresses;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SubstrateChildAddress substrate_child_addresses = 1 [json_name = "substrateChildAddresses"];</code>
     * @param array<\Adamant\PBGlobal\V1\SubstrateChildAddress>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSubstrateChildAddresses($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\SubstrateChildAddress::class);
        $this->substrate_child_addresses = $arr;

        return $this;
    }

}
