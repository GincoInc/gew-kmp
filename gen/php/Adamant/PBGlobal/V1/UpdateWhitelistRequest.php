<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.UpdateWhitelistRequest</code>
 */
class UpdateWhitelistRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string whitelist_id = 1 [json_name = "whitelistId", (.validate.rules) = {</code>
     */
    protected $whitelist_id = '';
    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin", (.validate.rules) = {</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>repeated string address_ids = 4 [json_name = "addressIds", (.validate.rules) = {</code>
     */
    private $address_ids;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $whitelist_id
     *     @type string $name
     *     @type int $coin
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $address_ids
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string whitelist_id = 1 [json_name = "whitelistId", (.validate.rules) = {</code>
     * @return string
     */
    public function getWhitelistId()
    {
        return $this->whitelist_id;
    }

    /**
     * Generated from protobuf field <code>string whitelist_id = 1 [json_name = "whitelistId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setWhitelistId($var)
    {
        GPBUtil::checkString($var, True);
        $this->whitelist_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 2 [json_name = "name", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin", (.validate.rules) = {</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 3 [json_name = "coin", (.validate.rules) = {</code>
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
     * Generated from protobuf field <code>repeated string address_ids = 4 [json_name = "addressIds", (.validate.rules) = {</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getAddressIds()
    {
        return $this->address_ids;
    }

    /**
     * Generated from protobuf field <code>repeated string address_ids = 4 [json_name = "addressIds", (.validate.rules) = {</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setAddressIds($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->address_ids = $arr;

        return $this;
    }

}

