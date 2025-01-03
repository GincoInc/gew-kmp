<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The NFT wallet model
 *
 * Generated from protobuf message <code>adamant.global.v1.NFTWallet</code>
 */
class NFTWallet extends \Google\Protobuf\Internal\Message
{
    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 1 [json_name = "ownerId"];</code>
     */
    protected $owner_id = '';
    /**
     * id
     *
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
     */
    protected $wallet_id = '';
    /**
     * name
     *
     * Generated from protobuf field <code>string name = 3 [json_name = "name"];</code>
     */
    protected $name = '';
    /**
     * The type of asset
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * type
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 5 [json_name = "walletType"];</code>
     */
    protected $wallet_type = 0;
    /**
     * type of address
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 6 [json_name = "addressType"];</code>
     */
    protected $address_type = 0;
    /**
     * state
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletState state = 7 [json_name = "state"];</code>
     */
    protected $state = 0;
    /**
     * address
     *
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
     */
    protected $address = '';
    /**
     * nft ownership
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.NFTOwnership nft_ownerships = 9 [json_name = "nftOwnerships"];</code>
     */
    private $nft_ownerships;
    /**
     * the time at which the wallet was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
     */
    protected $create_time = null;
    /**
     * the time at which the wallet was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $owner_id
     *           organization id
     *     @type string $wallet_id
     *           id
     *     @type string $name
     *           name
     *     @type int $coin
     *           The type of asset
     *     @type int $wallet_type
     *           type
     *     @type int $address_type
     *           type of address
     *     @type int $state
     *           state
     *     @type string $address
     *           address
     *     @type array<\Adamant\PBGlobal\V1\NFTOwnership>|\Google\Protobuf\Internal\RepeatedField $nft_ownerships
     *           nft ownership
     *     @type \Google\Protobuf\Timestamp $create_time
     *           the time at which the wallet was created
     *     @type \Google\Protobuf\Timestamp $update_time
     *           the time at which the wallet was updated
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 1 [json_name = "ownerId"];</code>
     * @return string
     */
    public function getOwnerId()
    {
        return $this->owner_id;
    }

    /**
     * organization id
     *
     * Generated from protobuf field <code>string owner_id = 1 [json_name = "ownerId"];</code>
     * @param string $var
     * @return $this
     */
    public function setOwnerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->owner_id = $var;

        return $this;
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * id
     *
     * Generated from protobuf field <code>string wallet_id = 2 [json_name = "walletId"];</code>
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
     * name
     *
     * Generated from protobuf field <code>string name = 3 [json_name = "name"];</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * name
     *
     * Generated from protobuf field <code>string name = 3 [json_name = "name"];</code>
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
     * The type of asset
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * The type of asset
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 4 [json_name = "coin"];</code>
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
     * type
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 5 [json_name = "walletType"];</code>
     * @return int
     */
    public function getWalletType()
    {
        return $this->wallet_type;
    }

    /**
     * type
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletType wallet_type = 5 [json_name = "walletType"];</code>
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
     * type of address
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 6 [json_name = "addressType"];</code>
     * @return int
     */
    public function getAddressType()
    {
        return $this->address_type;
    }

    /**
     * type of address
     *
     * Generated from protobuf field <code>.gincoinc.global.v1.AddressType address_type = 6 [json_name = "addressType"];</code>
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
     * state
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletState state = 7 [json_name = "state"];</code>
     * @return int
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * state
     *
     * Generated from protobuf field <code>.adamant.global.v1.WalletState state = 7 [json_name = "state"];</code>
     * @param int $var
     * @return $this
     */
    public function setState($var)
    {
        GPBUtil::checkEnum($var, \Adamant\PBGlobal\V1\WalletState::class);
        $this->state = $var;

        return $this;
    }

    /**
     * address
     *
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
     * @return string
     */
    public function getAddress()
    {
        return $this->address;
    }

    /**
     * address
     *
     * Generated from protobuf field <code>string address = 8 [json_name = "address"];</code>
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
     * nft ownership
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.NFTOwnership nft_ownerships = 9 [json_name = "nftOwnerships"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getNftOwnerships()
    {
        return $this->nft_ownerships;
    }

    /**
     * nft ownership
     *
     * Generated from protobuf field <code>repeated .adamant.global.v1.NFTOwnership nft_ownerships = 9 [json_name = "nftOwnerships"];</code>
     * @param array<\Adamant\PBGlobal\V1\NFTOwnership>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setNftOwnerships($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\NFTOwnership::class);
        $this->nft_ownerships = $arr;

        return $this;
    }

    /**
     * the time at which the wallet was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    public function hasCreateTime()
    {
        return isset($this->create_time);
    }

    public function clearCreateTime()
    {
        unset($this->create_time);
    }

    /**
     * the time at which the wallet was created
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 10 [json_name = "createTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;

        return $this;
    }

    /**
     * the time at which the wallet was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    public function hasUpdateTime()
    {
        return isset($this->update_time);
    }

    public function clearUpdateTime()
    {
        unset($this->update_time);
    }

    /**
     * the time at which the wallet was updated
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 11 [json_name = "updateTime"];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setUpdateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->update_time = $var;

        return $this;
    }

}

