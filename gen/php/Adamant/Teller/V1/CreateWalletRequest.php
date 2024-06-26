<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

namespace Adamant\Teller\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>adamant.teller.v1.CreateWalletRequest</code>
 */
class CreateWalletRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string wallet_name = 1 [json_name = "walletName", (.validate.rules) = {</code>
     */
    protected $wallet_name = '';
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = {</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>optional .gincoinc.global.v1.Network network = 7 [json_name = "network", (.validate.rules) = {</code>
     */
    protected $network = null;
    /**
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 3 [json_name = "walletType", (.validate.rules) = {</code>
     */
    protected $wallet_type = 0;
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 4 [json_name = "addressType", (.validate.rules) = {</code>
     */
    protected $address_type = 0;
    /**
     * required when create receive only wallet
     *
     * Generated from protobuf field <code>string destination_wallet_id = 5 [json_name = "destinationWalletId", (.validate.rules) = {</code>
     */
    protected $destination_wallet_id = '';
    /**
     * optional
     *
     * Generated from protobuf field <code>string inherit_wallet_id = 6 [json_name = "inheritWalletId", (.validate.rules) = {</code>
     */
    protected $inherit_wallet_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $wallet_name
     *     @type int $coin
     *     @type int $network
     *     @type int $wallet_type
     *     @type int $address_type
     *     @type string $destination_wallet_id
     *           required when create receive only wallet
     *     @type string $inherit_wallet_id
     *           optional
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\Teller\V1\Adamanttellerv1\TellerApi::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string wallet_name = 1 [json_name = "walletName", (.validate.rules) = {</code>
     * @return string
     */
    public function getWalletName()
    {
        return $this->wallet_name;
    }

    /**
     * Generated from protobuf field <code>string wallet_name = 1 [json_name = "walletName", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setWalletName($var)
    {
        GPBUtil::checkString($var, True);
        $this->wallet_name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = {</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 2 [json_name = "coin", (.validate.rules) = {</code>
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
     * Generated from protobuf field <code>optional .gincoinc.global.v1.Network network = 7 [json_name = "network", (.validate.rules) = {</code>
     * @return int
     */
    public function getNetwork()
    {
        return isset($this->network) ? $this->network : 0;
    }

    public function hasNetwork()
    {
        return isset($this->network);
    }

    public function clearNetwork()
    {
        unset($this->network);
    }

    /**
     * Generated from protobuf field <code>optional .gincoinc.global.v1.Network network = 7 [json_name = "network", (.validate.rules) = {</code>
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
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 3 [json_name = "walletType", (.validate.rules) = {</code>
     * @return int
     */
    public function getWalletType()
    {
        return $this->wallet_type;
    }

    /**
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 3 [json_name = "walletType", (.validate.rules) = {</code>
     * @param int $var
     * @return $this
     */
    public function setWalletType($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\WalletType::class);
        $this->wallet_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 4 [json_name = "addressType", (.validate.rules) = {</code>
     * @return int
     */
    public function getAddressType()
    {
        return $this->address_type;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 4 [json_name = "addressType", (.validate.rules) = {</code>
     * @param int $var
     * @return $this
     */
    public function setAddressType($var)
    {
        GPBUtil::checkEnum($var, \Gincoinc\PBGlobal\V1\AddressType::class);
        $this->address_type = $var;

        return $this;
    }

    /**
     * required when create receive only wallet
     *
     * Generated from protobuf field <code>string destination_wallet_id = 5 [json_name = "destinationWalletId", (.validate.rules) = {</code>
     * @return string
     */
    public function getDestinationWalletId()
    {
        return $this->destination_wallet_id;
    }

    /**
     * required when create receive only wallet
     *
     * Generated from protobuf field <code>string destination_wallet_id = 5 [json_name = "destinationWalletId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setDestinationWalletId($var)
    {
        GPBUtil::checkString($var, True);
        $this->destination_wallet_id = $var;

        return $this;
    }

    /**
     * optional
     *
     * Generated from protobuf field <code>string inherit_wallet_id = 6 [json_name = "inheritWalletId", (.validate.rules) = {</code>
     * @return string
     */
    public function getInheritWalletId()
    {
        return $this->inherit_wallet_id;
    }

    /**
     * optional
     *
     * Generated from protobuf field <code>string inherit_wallet_id = 6 [json_name = "inheritWalletId", (.validate.rules) = {</code>
     * @param string $var
     * @return $this
     */
    public function setInheritWalletId($var)
    {
        GPBUtil::checkString($var, True);
        $this->inherit_wallet_id = $var;

        return $this;
    }

}

