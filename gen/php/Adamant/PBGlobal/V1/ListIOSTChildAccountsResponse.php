<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.global.v1.ListIOSTChildAccountsResponse</code>
 */
class ListIOSTChildAccountsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.IOSTChildAccount iost_child_accounts = 1 [json_name = "iostChildAccounts"];</code>
     */
    private $iost_child_accounts;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\IOSTChildAccount>|\Google\Protobuf\Internal\RepeatedField $iost_child_accounts
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\GlobalApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.IOSTChildAccount iost_child_accounts = 1 [json_name = "iostChildAccounts"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getIostChildAccounts()
    {
        return $this->iost_child_accounts;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.IOSTChildAccount iost_child_accounts = 1 [json_name = "iostChildAccounts"];</code>
     * @param array<\Adamant\PBGlobal\V1\IOSTChildAccount>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setIostChildAccounts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\IOSTChildAccount::class);
        $this->iost_child_accounts = $arr;

        return $this;
    }

}
