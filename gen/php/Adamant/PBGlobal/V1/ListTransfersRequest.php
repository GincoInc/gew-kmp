<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListTransfersRequest</code>
 */
class ListTransfersRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The id of wallet
     *
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     */
    protected $wallet_id = '';
    /**
     * indicate how many objects to return in a single response
     *
     * Generated from protobuf field <code>uint32 page_size = 2 [json_name = "pageSize", (.validate.rules) = {</code>
     */
    protected $page_size = 0;
    /**
     * retrieve the next page
     *
     * Generated from protobuf field <code>string page_token = 3 [json_name = "pageToken", (.validate.rules) = {</code>
     */
    protected $page_token = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $wallet_id
     *           The id of wallet
     *     @type int $page_size
     *           indicate how many objects to return in a single response
     *     @type string $page_token
     *           retrieve the next page
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * The id of wallet
     *
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * The id of wallet
     *
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setWalletId($var)
    {
        GPBUtil::checkString($var, True);
        $this->wallet_id = $var;

        return $this;
    }

    /**
     * indicate how many objects to return in a single response
     *
     * Generated from protobuf field <code>uint32 page_size = 2 [json_name = "pageSize", (.validate.rules) = {</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * indicate how many objects to return in a single response
     *
     * Generated from protobuf field <code>uint32 page_size = 2 [json_name = "pageSize", (.validate.rules) = {</code>
     * @param int $var
     * @return $this
     */
    public function setPageSize($var)
    {
        GPBUtil::checkUint32($var);
        $this->page_size = $var;

        return $this;
    }

    /**
     * retrieve the next page
     *
     * Generated from protobuf field <code>string page_token = 3 [json_name = "pageToken", (.validate.rules) = {</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * retrieve the next page
     *
     * Generated from protobuf field <code>string page_token = 3 [json_name = "pageToken", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->page_token = $var;

        return $this;
    }

}

