<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Adamant\Global\V1;

/**
 * =============================================================================
 *  Service
 * =============================================================================
 *
 */
class GlobalAPIClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Wallet
     * @param \Adamant\Global\V1\CreateWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateWallet(\Adamant\Global\V1\CreateWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateWallet',
        $argument,
        ['\Adamant\Global\V1\CreateWalletResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Get wallet information. the wallet model includes balance, address etc.
     * @param \Adamant\Global\V1\GetWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetWallet(\Adamant\Global\V1\GetWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetWallet',
        $argument,
        ['\Adamant\Global\V1\Wallet', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CancelWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CancelWallet(\Adamant\Global\V1\CancelWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CancelWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ArchiveWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ArchiveWallet(\Adamant\Global\V1\ArchiveWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ArchiveWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UnArchiveWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UnArchiveWallet(\Adamant\Global\V1\UnArchiveWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UnArchiveWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListWalletsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListWallets(\Adamant\Global\V1\ListWalletsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListWallets',
        $argument,
        ['\Adamant\Global\V1\ListWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListWalletsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListWalletsByFilter(\Adamant\Global\V1\ListWalletsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListWalletsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListBaseWalletsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListBaseWallets(\Adamant\Global\V1\ListBaseWalletsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListBaseWallets',
        $argument,
        ['\Adamant\Global\V1\ListBaseWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListStakingWalletsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListStakingWalletsByFilter(\Adamant\Global\V1\ListStakingWalletsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListStakingWalletsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListNFTWalletsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListNFTWalletsByFilter(\Adamant\Global\V1\ListNFTWalletsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListNFTWalletsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListNFTWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletNameRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletName(\Adamant\Global\V1\UpdateWalletNameRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletName',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletValidationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletValidation(\Adamant\Global\V1\UpdateWalletValidationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletValidation',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletPolicy(\Adamant\Global\V1\UpdateWalletPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletPolicy',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ReviewWalletProposalRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ReviewWalletProposal(\Adamant\Global\V1\ReviewWalletProposalRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ReviewWalletProposal',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\FlushBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function FlushBalance(\Adamant\Global\V1\FlushBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/FlushBalance',
        $argument,
        ['\Adamant\Global\V1\FlushBalanceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateWalletGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateWalletGroup(\Adamant\Global\V1\CreateWalletGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateWalletGroup',
        $argument,
        ['\Adamant\Global\V1\CreateWalletGroupResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletGroupNameRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletGroupName(\Adamant\Global\V1\UpdateWalletGroupNameRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletGroupName',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletGroup(\Adamant\Global\V1\UpdateWalletGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletGroup',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetWalletGroupRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetWalletGroup(\Adamant\Global\V1\GetWalletGroupRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetWalletGroup',
        $argument,
        ['\Adamant\Global\V1\WalletGroup', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListWalletGroupsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListWalletGroups(\Adamant\Global\V1\ListWalletGroupsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListWalletGroups',
        $argument,
        ['\Adamant\Global\V1\ListWalletGroupsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateDestinationWalletIDRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateDestinationWalletID(\Adamant\Global\V1\UpdateDestinationWalletIDRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateDestinationWalletID',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetCosmosBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetCosmosBalance(\Adamant\Global\V1\GetCosmosBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetCosmosBalance',
        $argument,
        ['\Adamant\Global\V1\GetCosmosBalanceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListCosmosDelegateHistoriesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListCosmosDelegateHistories(\Adamant\Global\V1\ListCosmosDelegateHistoriesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListCosmosDelegateHistories',
        $argument,
        ['\Adamant\Global\V1\ListCosmosDelegateHistoriesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\EnableUTXORequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function EnableUTXO(\Adamant\Global\V1\EnableUTXORequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/EnableUTXO',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\DisableUTXORequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DisableUTXO(\Adamant\Global\V1\DisableUTXORequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/DisableUTXO',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWalletIsStakingAvailableRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWalletIsStakingAvailable(\Adamant\Global\V1\UpdateWalletIsStakingAvailableRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWalletIsStakingAvailable',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\RefreshStakingWalletClaimableRewardRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RefreshStakingWalletClaimableReward(\Adamant\Global\V1\RefreshStakingWalletClaimableRewardRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/RefreshStakingWalletClaimableReward',
        $argument,
        ['\Adamant\Global\V1\RefreshStakingWalletClaimableRewardResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Review
     * @param \Adamant\Global\V1\ApproveWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ApproveWallet(\Adamant\Global\V1\ApproveWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ApproveWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ApproveTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ApproveTransaction(\Adamant\Global\V1\ApproveTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ApproveTransaction',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Address
     * Create a new address for an existing wallet
     * @param \Adamant\Global\V1\CreateAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateAddress(\Adamant\Global\V1\CreateAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateAddress',
        $argument,
        ['\Adamant\Global\V1\CreateAddressResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAddress(\Adamant\Global\V1\GetAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetAddress',
        $argument,
        ['\Adamant\Global\V1\Address', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetAddressByAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAddressByAddress(\Adamant\Global\V1\GetAddressByAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetAddressByAddress',
        $argument,
        ['\Adamant\Global\V1\Address', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetAddressByAddressCoinRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAddressByAddressCoin(\Adamant\Global\V1\GetAddressByAddressCoinRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetAddressByAddressCoin',
        $argument,
        ['\Adamant\Global\V1\Address', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetAddressByIndexRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAddressByIndex(\Adamant\Global\V1\GetAddressByIndexRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetAddressByIndex',
        $argument,
        ['\Adamant\Global\V1\Address', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListAddressesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListAddresses(\Adamant\Global\V1\ListAddressesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListAddresses',
        $argument,
        ['\Adamant\Global\V1\ListAddressesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListAddressesWithBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListAddressesWithBalance(\Adamant\Global\V1\ListAddressesWithBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListAddressesWithBalance',
        $argument,
        ['\Adamant\Global\V1\ListAddressesWithBalanceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateAddressBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateAddressBalance(\Adamant\Global\V1\UpdateAddressBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateAddressBalance',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * @param \Adamant\Global\V1\GetEthereumFeeAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetEthereumFeeAddress(\Adamant\Global\V1\GetEthereumFeeAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetEthereumFeeAddress',
        $argument,
        ['\Adamant\Global\V1\EthereumFeeAddress', 'decode'],
        $metadata, $options);
    }

    /**
     * Get addresses associated with the Polkadot signer
     * @param \Adamant\Global\V1\ListSubstrateChildAddressesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListSubstrateChildAddresses(\Adamant\Global\V1\ListSubstrateChildAddressesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListSubstrateChildAddresses',
        $argument,
        ['\Adamant\Global\V1\ListSubstrateChildAddressesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListSymbolChildAddressesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListSymbolChildAddresses(\Adamant\Global\V1\ListSymbolChildAddressesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListSymbolChildAddresses',
        $argument,
        ['\Adamant\Global\V1\ListSymbolChildAddressesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListIOSTChildAccountsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListIOSTChildAccounts(\Adamant\Global\V1\ListIOSTChildAccountsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListIOSTChildAccounts',
        $argument,
        ['\Adamant\Global\V1\ListIOSTChildAccountsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ImportAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ImportAddress(\Adamant\Global\V1\ImportAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ImportAddress',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListCallersRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListCallers(\Adamant\Global\V1\ListCallersRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListCallers',
        $argument,
        ['\Adamant\Global\V1\ListCallersResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListFeeDepositsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListFeeDeposits(\Adamant\Global\V1\ListFeeDepositsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListFeeDeposits',
        $argument,
        ['\Adamant\Global\V1\ListFeeDepositsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * RegisterKey
     * @param \Adamant\Global\V1\RegisterKeyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RegisterKey(\Adamant\Global\V1\RegisterKeyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/RegisterKey',
        $argument,
        ['\Adamant\Global\V1\RegisterKeyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetSignerPubKeyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetSignerPubKey(\Adamant\Global\V1\GetSignerPubKeyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetSignerPubKey',
        $argument,
        ['\Adamant\Global\V1\GetSignerPubKeyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Transaction
     * @param \Adamant\Global\V1\CreateTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateTransaction(\Adamant\Global\V1\CreateTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateTransaction',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateXRPInitTransactionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateXRPInitTransactions(\Adamant\Global\V1\CreateXRPInitTransactionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateXRPInitTransactions',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateContractCreationTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateContractCreationTransaction(\Adamant\Global\V1\CreateContractCreationTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateContractCreationTransaction',
        $argument,
        ['\Adamant\Global\V1\CreateContractCreationTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\SignTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SignTransaction(\Adamant\Global\V1\SignTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SignTransaction',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\SignXRPInitTransactionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SignXRPInitTransactions(\Adamant\Global\V1\SignXRPInitTransactionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SignXRPInitTransactions',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\SendTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SendTransaction(\Adamant\Global\V1\SendTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SendTransaction',
        $argument,
        ['\Adamant\Global\V1\SendTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ResendTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ResendTransaction(\Adamant\Global\V1\ResendTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ResendTransaction',
        $argument,
        ['\Adamant\Global\V1\ResendTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\SendXRPInitTransactionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SendXRPInitTransactions(\Adamant\Global\V1\SendXRPInitTransactionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SendXRPInitTransactions',
        $argument,
        ['\Adamant\Global\V1\SendXRPInitTransactionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CancelTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CancelTransaction(\Adamant\Global\V1\CancelTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CancelTransaction',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ReplaceTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ReplaceTransaction(\Adamant\Global\V1\ReplaceTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ReplaceTransaction',
        $argument,
        ['\Adamant\Global\V1\ReplaceTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\IsTransactionReplaceableRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function IsTransactionReplaceable(\Adamant\Global\V1\IsTransactionReplaceableRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/IsTransactionReplaceable',
        $argument,
        ['\Adamant\Global\V1\IsTransactionReplaceableResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetTransaction(\Adamant\Global\V1\GetTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetTransaction',
        $argument,
        ['\Adamant\Global\V1\Transaction', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetTransactionByTxIDRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetTransactionByTxID(\Adamant\Global\V1\GetTransactionByTxIDRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetTransactionByTxID',
        $argument,
        ['\Adamant\Global\V1\Transaction', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListTransactionsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransactions(\Adamant\Global\V1\ListTransactionsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListTransactions',
        $argument,
        ['\Adamant\Global\V1\ListTransactionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListTransactionsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransactionsByFilter(\Adamant\Global\V1\ListTransactionsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListTransactionsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListTransactionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * UnconfirmedTransaction
     * @param \Adamant\Global\V1\ListUnconfirmedTransactionsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListUnconfirmedTransactionsByFilter(\Adamant\Global\V1\ListUnconfirmedTransactionsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListUnconfirmedTransactionsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListUnconfirmedTransactionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * SignInfo
     * @param \Adamant\Global\V1\GetSignInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetSignInfo(\Adamant\Global\V1\GetSignInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetSignInfo',
        $argument,
        ['\Adamant\Global\V1\SignInfo', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListSignInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListSignInfo(\Adamant\Global\V1\ListSignInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListSignInfo',
        $argument,
        ['\Adamant\Global\V1\ListSignInfoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListXRPInitSignInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListXRPInitSignInfo(\Adamant\Global\V1\ListXRPInitSignInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListXRPInitSignInfo',
        $argument,
        ['\Adamant\Global\V1\ListXRPInitSignInfoResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Transfer
     * List transfers for a given wallet. Ordered by update time desc
     * @param \Adamant\Global\V1\ListTransfersRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransfers(\Adamant\Global\V1\ListTransfersRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListTransfers',
        $argument,
        ['\Adamant\Global\V1\ListTransfersResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListTransfersByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransfersByFilter(\Adamant\Global\V1\ListTransfersByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListTransfersByFilter',
        $argument,
        ['\Adamant\Global\V1\ListTransfersResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Rate
     * Get rates by snapshot id
     * @param \Adamant\Global\V1\GetRateSnapshotRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetRateSnapshot(\Adamant\Global\V1\GetRateSnapshotRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetRateSnapshot',
        $argument,
        ['\Adamant\Global\V1\RateSnapshot', 'decode'],
        $metadata, $options);
    }

    /**
     * Get latest rates set to your organization
     * @param \Adamant\Global\V1\GetLatestRateSnapshotRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetLatestRateSnapshot(\Adamant\Global\V1\GetLatestRateSnapshotRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetLatestRateSnapshot',
        $argument,
        ['\Adamant\Global\V1\RateSnapshot', 'decode'],
        $metadata, $options);
    }

    /**
     * Set rates to your organization
     * @param \Adamant\Global\V1\SetRatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SetRates(\Adamant\Global\V1\SetRatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SetRates',
        $argument,
        ['\Adamant\Global\V1\SetRatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\SetDefaultRatesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SetDefaultRates(\Adamant\Global\V1\SetDefaultRatesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/SetDefaultRates',
        $argument,
        ['\Adamant\Global\V1\SetDefaultRatesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * policy
     * @param \Adamant\Global\V1\CreateLabeledAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateLabeledAddress(\Adamant\Global\V1\CreateLabeledAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateLabeledAddress',
        $argument,
        ['\Adamant\Global\V1\CreateLabeledAddressResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetLabeledAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetLabeledAddress(\Adamant\Global\V1\GetLabeledAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetLabeledAddress',
        $argument,
        ['\Adamant\Global\V1\LabeledAddress', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListLabeledAddressesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListLabeledAddresses(\Adamant\Global\V1\ListLabeledAddressesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListLabeledAddresses',
        $argument,
        ['\Adamant\Global\V1\ListLabeledAddressesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListLabeledAddressesByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListLabeledAddressesByFilter(\Adamant\Global\V1\ListLabeledAddressesByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListLabeledAddressesByFilter',
        $argument,
        ['\Adamant\Global\V1\ListLabeledAddressesByFilterResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\IsDeletableLabeledAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function IsDeletableLabeledAddress(\Adamant\Global\V1\IsDeletableLabeledAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/IsDeletableLabeledAddress',
        $argument,
        ['\Adamant\Global\V1\IsDeletableLabeledAddressResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateLabeledAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateLabeledAddress(\Adamant\Global\V1\UpdateLabeledAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateLabeledAddress',
        $argument,
        ['\Adamant\Global\V1\LabeledAddress', 'decode'],
        $metadata, $options);
    }

    /**
     * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
     * @param \Adamant\Global\V1\DeleteLabeledAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteAddress(\Adamant\Global\V1\DeleteLabeledAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/DeleteAddress',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ReviewLabeledAddressProposalRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ReviewLabeledAddressProposal(\Adamant\Global\V1\ReviewLabeledAddressProposalRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ReviewLabeledAddressProposal',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateWhitelist(\Adamant\Global\V1\CreateWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateWhitelist',
        $argument,
        ['\Adamant\Global\V1\CreateWhitelistResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetWhitelist(\Adamant\Global\V1\GetWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetWhitelist',
        $argument,
        ['\Adamant\Global\V1\Whitelist', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListWhitelistsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListWhitelists(\Adamant\Global\V1\ListWhitelistsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListWhitelists',
        $argument,
        ['\Adamant\Global\V1\ListWhitelistsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListWhitelistsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListWhitelistsByFilter(\Adamant\Global\V1\ListWhitelistsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListWhitelistsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListWhitelistsByFilterResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\IsDeletableWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function IsDeletableWhitelist(\Adamant\Global\V1\IsDeletableWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/IsDeletableWhitelist',
        $argument,
        ['\Adamant\Global\V1\IsDeletableWhitelistResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWhitelist(\Adamant\Global\V1\UpdateWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWhitelist',
        $argument,
        ['\Adamant\Global\V1\Whitelist', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateWhitelistAddressesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateWhitelistAddresses(\Adamant\Global\V1\UpdateWhitelistAddressesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateWhitelistAddresses',
        $argument,
        ['\Adamant\Global\V1\Whitelist', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\DeleteWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteWhitelist(\Adamant\Global\V1\DeleteWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/DeleteWhitelist',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateTransferLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateTransferLimit(\Adamant\Global\V1\CreateTransferLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreateTransferLimit',
        $argument,
        ['\Adamant\Global\V1\CreateTransferLimitResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetTransferLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetTransferLimit(\Adamant\Global\V1\GetTransferLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetTransferLimit',
        $argument,
        ['\Adamant\Global\V1\TransferLimit', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListTransferLimitsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransferLimits(\Adamant\Global\V1\ListTransferLimitsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListTransferLimits',
        $argument,
        ['\Adamant\Global\V1\ListTransferLimitsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\IsDeletableTransferLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function IsDeletableTransferLimit(\Adamant\Global\V1\IsDeletableTransferLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/IsDeletableTransferLimit',
        $argument,
        ['\Adamant\Global\V1\IsDeletableTransferLimitResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateTransferLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateTransferLimit(\Adamant\Global\V1\UpdateTransferLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateTransferLimit',
        $argument,
        ['\Adamant\Global\V1\TransferLimit', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdateTransferLimitNameRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateTransferLimitName(\Adamant\Global\V1\UpdateTransferLimitNameRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdateTransferLimitName',
        $argument,
        ['\Adamant\Global\V1\TransferLimit', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\DeleteTransferLimitRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteTransferLimit(\Adamant\Global\V1\DeleteTransferLimitRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/DeleteTransferLimit',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ReviewTransferLimitProposalRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ReviewTransferLimitProposal(\Adamant\Global\V1\ReviewTransferLimitProposalRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ReviewTransferLimitProposal',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreatePolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreatePolicy(\Adamant\Global\V1\CreatePolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CreatePolicy',
        $argument,
        ['\Adamant\Global\V1\CreatePolicyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetPolicy(\Adamant\Global\V1\GetPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetPolicy',
        $argument,
        ['\Adamant\Global\V1\Policy', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListPoliciesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListPolicies(\Adamant\Global\V1\ListPoliciesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListPolicies',
        $argument,
        ['\Adamant\Global\V1\ListPoliciesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListPoliciesByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListPoliciesByFilter(\Adamant\Global\V1\ListPoliciesByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListPoliciesByFilter',
        $argument,
        ['\Adamant\Global\V1\ListPoliciesByFilterResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\IsDeletablePolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function IsDeletablePolicy(\Adamant\Global\V1\IsDeletablePolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/IsDeletablePolicy',
        $argument,
        ['\Adamant\Global\V1\IsDeletablePolicyResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpdatePolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdatePolicy(\Adamant\Global\V1\UpdatePolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpdatePolicy',
        $argument,
        ['\Adamant\Global\V1\Policy', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\DeletePolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeletePolicy(\Adamant\Global\V1\DeletePolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/DeletePolicy',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ReviewPolicyProposalRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ReviewPolicyProposal(\Adamant\Global\V1\ReviewPolicyProposalRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ReviewPolicyProposal',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * Utility
     * @param \Adamant\Global\V1\GetSpendableBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetSpendableBalance(\Adamant\Global\V1\GetSpendableBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetSpendableBalance',
        $argument,
        ['\Adamant\Global\V1\GetSpendableBalanceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetTotalBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetTotalBalance(\Adamant\Global\V1\GetTotalBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetTotalBalance',
        $argument,
        ['\Adamant\Global\V1\TotalBalance', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListBalanceSnapshotsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListBalanceSnapshots(\Adamant\Global\V1\ListBalanceSnapshotsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListBalanceSnapshots',
        $argument,
        ['\Adamant\Global\V1\ListBalanceSnapshotsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CalculateFeeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CalculateFee(\Adamant\Global\V1\CalculateFeeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/CalculateFee',
        $argument,
        ['\Adamant\Global\V1\CalculateFeeResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetMembersDeactivatabilitiesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetMembersDeactivatabilities(\Adamant\Global\V1\GetMembersDeactivatabilitiesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetMembersDeactivatabilities',
        $argument,
        ['\Adamant\Global\V1\GetMembersDeactivatabilitiesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetRecommendedFeeRateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetRecommendedFeeRate(\Adamant\Global\V1\GetRecommendedFeeRateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/GetRecommendedFeeRate',
        $argument,
        ['\Adamant\Global\V1\GetRecommendedFeeRateResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Validate format of given address
     * @param \Adamant\Global\V1\ValidateAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ValidateAddress(\Adamant\Global\V1\ValidateAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ValidateAddress',
        $argument,
        ['\Adamant\Global\V1\ValidateAddressResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListAuditLogsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListAuditLogs(\Adamant\Global\V1\ListAuditLogsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListAuditLogs',
        $argument,
        ['\Adamant\Global\V1\ListAuditLogsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * ForwardingThresholds
     * @param \Adamant\Global\V1\ListForwardingThresholdsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListForwardingThresholds(\Adamant\Global\V1\ListForwardingThresholdsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListForwardingThresholds',
        $argument,
        ['\Adamant\Global\V1\ListForwardingThresholdsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\UpsertForwardingThresholdRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpsertForwardingThreshold(\Adamant\Global\V1\UpsertForwardingThresholdRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/UpsertForwardingThreshold',
        $argument,
        ['\Adamant\Global\V1\UpsertForwardingThresholdResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * StakingHistories
     * @param \Adamant\Global\V1\ListStakingHistoriesByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListStakingHistoriesByFilter(\Adamant\Global\V1\ListStakingHistoriesByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListStakingHistoriesByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingHistoriesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * StakingValidators
     * @param \Adamant\Global\V1\ListStakingValidatorsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListStakingValidatorsByFilter(\Adamant\Global\V1\ListStakingValidatorsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListStakingValidatorsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingValidatorsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * NFT
     * @param \Adamant\Global\V1\ListNFTsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListNFTsByFilter(\Adamant\Global\V1\ListNFTsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.global.v1.GlobalAPI/ListNFTsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListNFTsResponse', 'decode'],
        $metadata, $options);
    }

}
