<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.CreateBlacklistAddressRequest</code>
 */
class CreateBlacklistAddressRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string address = 1 [json_name = "address"];</code>
     */
    protected $address = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network", (.validate.rules) = {</code>
     */
    protected $network = 0;
    /**
     * Generated from protobuf field <code>optional string external_id = 3 [json_name = "externalId"];</code>
     */
    protected $external_id = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $address
     *     @type int $network
     *     @type string $external_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
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
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network", (.validate.rules) = {</code>
     * @return int
     */
    public function getNetwork()
    {
        return $this->network;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Network network = 2 [json_name = "network", (.validate.rules) = {</code>
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
     * Generated from protobuf field <code>optional string external_id = 3 [json_name = "externalId"];</code>
     * @return string
     */
    public function getExternalId()
    {
        return isset($this->external_id) ? $this->external_id : '';
    }

    public function hasExternalId()
    {
        return isset($this->external_id);
    }

    public function clearExternalId()
    {
        unset($this->external_id);
    }

    /**
     * Generated from protobuf field <code>optional string external_id = 3 [json_name = "externalId"];</code>
     * @param string $var
     * @return $this
     */
    public function setExternalId($var)
    {
        GPBUtil::checkString($var, True);
        $this->external_id = $var;

        return $this;
    }

}

