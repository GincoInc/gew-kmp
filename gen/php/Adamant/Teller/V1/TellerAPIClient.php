<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Adamant\Teller\V1;

/**
 * =============================================================================
 *  Service
 * =============================================================================
 *
 */
class TellerAPIClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Adamant\Teller\V1\CreateWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateWallet(\Adamant\Teller\V1\CreateWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CreateWallet',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetWallet',
        $argument,
        ['\Adamant\Global\V1\Wallet', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListWallets',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListWalletsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListWalletsResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListStakingWalletsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingWalletsResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListBaseWallets',
        $argument,
        ['\Adamant\Global\V1\ListBaseWalletsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\GetSpendableBalanceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetSpendableBalance(\Adamant\Global\V1\GetSpendableBalanceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetSpendableBalance',
        $argument,
        ['\Adamant\Global\V1\GetSpendableBalanceResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\InitializeXRPWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function InitializeXRPWallet(\Adamant\Teller\V1\InitializeXRPWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/InitializeXRPWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\InitializeWalletRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function InitializeWallet(\Adamant\Teller\V1\InitializeWalletRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/InitializeWallet',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/UpdateDestinationWalletID',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetCosmosBalance',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListCosmosDelegateHistories',
        $argument,
        ['\Adamant\Global\V1\ListCosmosDelegateHistoriesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Create a new address for an existing wallet
     * @param \Adamant\Global\V1\CreateAddressRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateAddress(\Adamant\Global\V1\CreateAddressRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CreateAddress',
        $argument,
        ['\Adamant\Global\V1\CreateAddressResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateIOSTAccountRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateIOSTAccount(\Adamant\Global\V1\CreateIOSTAccountRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CreateIOSTAccount',
        $argument,
        ['\Adamant\Global\V1\CreateIOSTAccountResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListSymbolChildAddresses',
        $argument,
        ['\Adamant\Global\V1\ListSymbolChildAddressesResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetAddress',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetAddressByAddress',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetAddressByAddressCoin',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetAddressByIndex',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListAddresses',
        $argument,
        ['\Adamant\Global\V1\ListAddressesResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ImportAddress',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetEthereumFeeAddress',
        $argument,
        ['\Adamant\Global\V1\EthereumFeeAddress', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/UpdateAddressBalance',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\CreateTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateTransaction(\Adamant\Global\V1\CreateTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CreateTransaction',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\SignTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SignTransaction(\Adamant\Teller\V1\SignTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/SignTransaction',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\SendTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SendTransaction(\Adamant\Teller\V1\SendTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/SendTransaction',
        $argument,
        ['\Adamant\Global\V1\SendTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ResendTransactionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ResendTransaction(\Adamant\Teller\V1\ResendTransactionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ResendTransaction',
        $argument,
        ['\Adamant\Global\V1\ResendTransactionResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CancelTransaction',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ReplaceTransaction',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/IsTransactionReplaceable',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetTransaction',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetTransactionByTxID',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListTransactions',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListTransactionsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListTransactionsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Exit ethereum validators
     * @param \Adamant\Global\V1\ExitEthereumStakingValidatorsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ExitEthereumStakingValidators(\Adamant\Global\V1\ExitEthereumStakingValidatorsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ExitEthereumStakingValidators',
        $argument,
        ['\Adamant\Global\V1\ExitEthereumStakingValidatorsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * List transfers for a given wallet. Ordered by update time desc
     * @param \Adamant\Global\V1\ListTransfersRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListTransfers(\Adamant\Global\V1\ListTransfersRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListTransfers',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListTransfersByFilter',
        $argument,
        ['\Adamant\Global\V1\ListTransfersResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Get rates by snapshot id
     * @param \Adamant\Global\V1\GetRateSnapshotRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetRateSnapshot(\Adamant\Global\V1\GetRateSnapshotRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetRateSnapshot',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetLatestRateSnapshot',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/SetRates',
        $argument,
        ['\Adamant\Global\V1\SetRatesResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/CalculateFee',
        $argument,
        ['\Adamant\Global\V1\CalculateFeeResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/GetRecommendedFeeRate',
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ValidateAddress',
        $argument,
        ['\Adamant\Global\V1\ValidateAddressResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/FlushBalance',
        $argument,
        ['\Adamant\Global\V1\FlushBalanceResponse', 'decode'],
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
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListAuditLogs',
        $argument,
        ['\Adamant\Global\V1\ListAuditLogsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListStakingHistoriesByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListStakingHistoriesByFilter(\Adamant\Global\V1\ListStakingHistoriesByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListStakingHistoriesByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingHistoriesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Global\V1\ListStakingValidatorsByFilterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListStakingValidatorsByFilter(\Adamant\Global\V1\ListStakingValidatorsByFilterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ListStakingValidatorsByFilter',
        $argument,
        ['\Adamant\Global\V1\ListStakingValidatorsResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\SignMessageRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SignMessage(\Adamant\Teller\V1\SignMessageRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/SignMessage',
        $argument,
        ['\Adamant\Teller\V1\SignMessageResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * ProgmatCoin
     * @param \Adamant\Teller\V1\ProgmatCoinInitializeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinInitialize(\Adamant\Teller\V1\ProgmatCoinInitializeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinInitialize',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinConfigureMinterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinConfigureMinter(\Adamant\Teller\V1\ProgmatCoinConfigureMinterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinConfigureMinter',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinMintAndTransferRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinMintAndTransfer(\Adamant\Teller\V1\ProgmatCoinMintAndTransferRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinMintAndTransfer',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinMintRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinMint(\Adamant\Teller\V1\ProgmatCoinMintRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinMint',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinBurnRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinBurn(\Adamant\Teller\V1\ProgmatCoinBurnRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinBurn',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinAddToWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinAddToWhitelist(\Adamant\Teller\V1\ProgmatCoinAddToWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinAddToWhitelist',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinRemoveFromWhitelistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinRemoveFromWhitelist(\Adamant\Teller\V1\ProgmatCoinRemoveFromWhitelistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinRemoveFromWhitelist',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinAddToBlacklistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinAddToBlacklist(\Adamant\Teller\V1\ProgmatCoinAddToBlacklistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinAddToBlacklist',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinRemoveFromBlacklistRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinRemoveFromBlacklist(\Adamant\Teller\V1\ProgmatCoinRemoveFromBlacklistRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinRemoveFromBlacklist',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinConfiscateRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinConfiscate(\Adamant\Teller\V1\ProgmatCoinConfiscateRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinConfiscate',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinPauseRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinPause(\Adamant\Teller\V1\ProgmatCoinPauseRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinPause',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Adamant\Teller\V1\ProgmatCoinUnpauseRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ProgmatCoinUnpause(\Adamant\Teller\V1\ProgmatCoinUnpauseRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/adamant.teller.v1.TellerAPI/ProgmatCoinUnpause',
        $argument,
        ['\Adamant\Global\V1\CreateTransactionResponse', 'decode'],
        $metadata, $options);
    }

}
