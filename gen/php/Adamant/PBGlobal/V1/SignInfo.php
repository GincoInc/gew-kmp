<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/global/v1/adamantglobalv1/model.proto

namespace Adamant\PBGlobal\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The model of information about signing
 *
 * Generated from protobuf message <code>adamant.global.v1.SignInfo</code>
 */
class SignInfo extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId"];</code>
     */
    protected $wallet_id = '';
    /**
     * Generated from protobuf field <code>string transaction_id = 2 [json_name = "transactionId"];</code>
     */
    protected $transaction_id = '';
    /**
     * Generated from protobuf field <code>string key_id = 3 [json_name = "keyId"];</code>
     */
    protected $key_id = '';
    /**
     * Generated from protobuf field <code>uint32 hd_account = 4 [json_name = "hdAccount"];</code>
     */
    protected $hd_account = 0;
    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 5 [json_name = "coin"];</code>
     */
    protected $coin = 0;
    /**
     * Generated from protobuf field <code>string tx_id = 6 [json_name = "txId"];</code>
     */
    protected $tx_id = '';
    /**
     * Generated from protobuf field <code>uint32 sign_index = 11 [json_name = "signIndex"];</code>
     */
    protected $sign_index = 0;
    /**
     * Generated from protobuf field <code>string sign_message = 7 [json_name = "signMessage"];</code>
     */
    protected $sign_message = '';
    /**
     * Generated from protobuf field <code>uint32 hd_change = 8 [json_name = "hdChange"];</code>
     */
    protected $hd_change = 0;
    /**
     * Generated from protobuf field <code>uint32 hd_index = 9 [json_name = "hdIndex"];</code>
     */
    protected $hd_index = 0;
    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SignTxInput sign_tx_inputs = 10 [json_name = "signTxInputs"];</code>
     */
    private $sign_tx_inputs;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $wallet_id
     *     @type string $transaction_id
     *     @type string $key_id
     *     @type int $hd_account
     *     @type int $coin
     *     @type string $tx_id
     *     @type int $sign_index
     *     @type string $sign_message
     *     @type int $hd_change
     *     @type int $hd_index
     *     @type array<\Adamant\PBGlobal\V1\SignTxInput>|\Google\Protobuf\Internal\RepeatedField $sign_tx_inputs
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Gincoinc\Adamant\PBGlobal\V1\Adamantglobalv1\Model::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId"];</code>
     * @return string
     */
    public function getWalletId()
    {
        return $this->wallet_id;
    }

    /**
     * Generated from protobuf field <code>string wallet_id = 1 [json_name = "walletId"];</code>
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
     * Generated from protobuf field <code>string transaction_id = 2 [json_name = "transactionId"];</code>
     * @return string
     */
    public function getTransactionId()
    {
        return $this->transaction_id;
    }

    /**
     * Generated from protobuf field <code>string transaction_id = 2 [json_name = "transactionId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTransactionId($var)
    {
        GPBUtil::checkString($var, True);
        $this->transaction_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string key_id = 3 [json_name = "keyId"];</code>
     * @return string
     */
    public function getKeyId()
    {
        return $this->key_id;
    }

    /**
     * Generated from protobuf field <code>string key_id = 3 [json_name = "keyId"];</code>
     * @param string $var
     * @return $this
     */
    public function setKeyId($var)
    {
        GPBUtil::checkString($var, True);
        $this->key_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_account = 4 [json_name = "hdAccount"];</code>
     * @return int
     */
    public function getHdAccount()
    {
        return $this->hd_account;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_account = 4 [json_name = "hdAccount"];</code>
     * @param int $var
     * @return $this
     */
    public function setHdAccount($var)
    {
        GPBUtil::checkUint32($var);
        $this->hd_account = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 5 [json_name = "coin"];</code>
     * @return int
     */
    public function getCoin()
    {
        return $this->coin;
    }

    /**
     * Generated from protobuf field <code>.gincoinc.global.v1.Coin coin = 5 [json_name = "coin"];</code>
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
     * Generated from protobuf field <code>string tx_id = 6 [json_name = "txId"];</code>
     * @return string
     */
    public function getTxId()
    {
        return $this->tx_id;
    }

    /**
     * Generated from protobuf field <code>string tx_id = 6 [json_name = "txId"];</code>
     * @param string $var
     * @return $this
     */
    public function setTxId($var)
    {
        GPBUtil::checkString($var, True);
        $this->tx_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 sign_index = 11 [json_name = "signIndex"];</code>
     * @return int
     */
    public function getSignIndex()
    {
        return $this->sign_index;
    }

    /**
     * Generated from protobuf field <code>uint32 sign_index = 11 [json_name = "signIndex"];</code>
     * @param int $var
     * @return $this
     */
    public function setSignIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->sign_index = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string sign_message = 7 [json_name = "signMessage"];</code>
     * @return string
     */
    public function getSignMessage()
    {
        return $this->sign_message;
    }

    /**
     * Generated from protobuf field <code>string sign_message = 7 [json_name = "signMessage"];</code>
     * @param string $var
     * @return $this
     */
    public function setSignMessage($var)
    {
        GPBUtil::checkString($var, True);
        $this->sign_message = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_change = 8 [json_name = "hdChange"];</code>
     * @return int
     */
    public function getHdChange()
    {
        return $this->hd_change;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_change = 8 [json_name = "hdChange"];</code>
     * @param int $var
     * @return $this
     */
    public function setHdChange($var)
    {
        GPBUtil::checkUint32($var);
        $this->hd_change = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_index = 9 [json_name = "hdIndex"];</code>
     * @return int
     */
    public function getHdIndex()
    {
        return $this->hd_index;
    }

    /**
     * Generated from protobuf field <code>uint32 hd_index = 9 [json_name = "hdIndex"];</code>
     * @param int $var
     * @return $this
     */
    public function setHdIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->hd_index = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SignTxInput sign_tx_inputs = 10 [json_name = "signTxInputs"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSignTxInputs()
    {
        return $this->sign_tx_inputs;
    }

    /**
     * Generated from protobuf field <code>repeated .adamant.global.v1.SignTxInput sign_tx_inputs = 10 [json_name = "signTxInputs"];</code>
     * @param array<\Adamant\PBGlobal\V1\SignTxInput>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSignTxInputs($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Adamant\PBGlobal\V1\SignTxInput::class);
        $this->sign_tx_inputs = $arr;

        return $this;
    }

}
