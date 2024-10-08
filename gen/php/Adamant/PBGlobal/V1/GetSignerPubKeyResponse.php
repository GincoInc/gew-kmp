<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.GetSignerPubKeyResponse</code>
 */
class GetSignerPubKeyResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    protected $pub_key = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $pub_key
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return string
     */
    public function getPubKey()
    {
        return $this->pub_key;
    }

    /**
     * Generated from protobuf field <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param string $var
     * @return $this
     */
    public function setPubKey($var)
    {
        GPBUtil::checkString($var, True);
        $this->pub_key = $var;

        return $this;
    }

}

