<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

namespace Adamant\Teller\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.teller.v1.ListHotFeeDepositAddressesResponse</code>
 */
class ListHotFeeDepositAddressesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     */
    private $fee_deposit_addresses;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Adamant\PBGlobal\V1\FeeDepositAddress>|\Google\Protobuf\Internal\RepeatedField $fee_deposit_addresses
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\Teller\V1\Adamanttellerv1\TellerApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFeeDepositAddresses()
    {
        return $this->fee_deposit_addresses;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.FeeDepositAddress fee_deposit_addresses = 1 [json_name = "feeDepositAddresses"];</code>
     * @param array<\Adamant\PBGlobal\V1\FeeDepositAddress>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFeeDepositAddresses($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\FeeDepositAddress::class);
        $this->fee_deposit_addresses = $arr;

        return $this;
    }

}

