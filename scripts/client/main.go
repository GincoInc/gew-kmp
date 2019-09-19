package main

import (
	"context"
	"log"

	"github.com/GincoInc/gew-kmp/gen/gincoinc/adamant/global/v1/adamantglobalv1"
	"github.com/GincoInc/gew-kmp/gen/gincoinc/adamant/teller/v1/adamanttellerv1"
	"github.com/GincoInc/gew-kmp/gen/gincoinc/global/v1/gincoincglobalv1"
	"github.com/GincoInc/go-util/logger"
	"github.com/davecgh/go-spew/spew"
	"google.golang.org/grpc"
)

var (
	ctx    = context.Background()
	client adamanttellerv1.TellerAPIClient
)

func main() {
	conn, err := grpc.Dial("127.0.0.1:50056", grpc.WithInsecure())
	if err != nil {
		logger.Fatal(err.Error())
	}
	defer conn.Close()
	client = adamanttellerv1.NewTellerAPIClient(conn)

	listWallets()
	// createWallet("hot wallet 1 created by teller", gincoincglobalv1.AddressType_ADDRESS_TYPE_P2WSH)
	// w := createWallet("hot wallet 2 created by teller", gconst.AddressType_P2SH_P2WSH)

	// w := getWallet("0176f8d1-bcbc-4949-ae73-f31f290cdfef") // P2WSH account 0
	// w := getWallet("01DHNDKMKXC4H5X05Q5R9TK7Y5") // P2SH_P2WSH account 1

	// createAddress(w.WalletId)
	// createAddress(w.WalletId)
	// createAddress(w.WalletId)
	// listAddresses(w.WalletId, true)

	// getSpendableBalance(w.WalletId)

	// txOutputs := []*adamantglobalv1.RequestTxOutput{
	// 	{
	// 		Address: "mkHS9ne12qx9pS9VojpwU5xtRd4T7X7ZUt",
	// 		Value:   3000000 - 16650,
	// 	},
	// }
	//
	// caluculateFee(w.WalletId, 50, txOutputs)

	// createTransaction(w.WalletId, 50, txOutputs)
	//
	// tx := listTransactions(w.WalletId)[0]
	// pp.Println(tx)
	//
	// transactionID := tx.TransactionId
	// signTransaction(tx.WalletId, transactionID)
	// sendTransaction(tx.WalletId, transactionID)

	// cancelTransaction(tx.WalletId, tx.TransactionId)

	// listTrasfers(w.WalletId)
}

func createWallet(walletName string, addressType gincoincglobalv1.AddressType) *adamantglobalv1.Wallet {
	res, err := client.CreateWallet(ctx, &adamanttellerv1.CreateWalletRequest{
		WalletName:  walletName,
		Coin:        gincoincglobalv1.Coin_COIN_BTC,
		WalletType:  adamantglobalv1.WalletType_WALLET_TYPE_SELF_CUSTODY_HOT,
		AddressType: addressType,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res
}

func getWallet(walletID string) *adamantglobalv1.Wallet {
	res, err := client.GetWallet(ctx, &adamantglobalv1.GetWalletRequest{
		WalletId: walletID,
	})
	if err != nil {
		logger.Fatal(err.Error())
	}
	spew.Dump(res)
	return res
}

func listWallets() []*adamantglobalv1.Wallet {
	res, err := client.ListWallets(ctx, &adamantglobalv1.ListWalletsRequest{})
	if err != nil {
		logger.Fatal(err.Error())
	}
	spew.Dump(res)
	return res.Wallets
}

func getSpendableBalance(walletID string) {
	res, err := client.GetSpendableBalance(ctx, &adamantglobalv1.GetSpendableBalanceRequest{
		WalletId: walletID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
}

func createAddress(walletID string) *adamantglobalv1.Address {
	res, err := client.CreateAddress(ctx, &adamantglobalv1.CreateAddressRequest{
		WalletId: walletID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res
}

func listAddresses(walletID string, omitChange bool) []*adamantglobalv1.Address {
	res, err := client.ListAddresses(ctx, &adamantglobalv1.ListAddressesRequest{
		WalletId:   walletID,
		OmitChange: omitChange,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res.Addresses)
	return res.Addresses
}

func createTransaction(walletID string, feeRate uint64, txOutputs []*adamantglobalv1.RequestTxOutput) *adamantglobalv1.Transaction {
	res, err := client.CreateTransaction(ctx, &adamantglobalv1.CreateTransactionRequest{
		WalletId:  walletID,
		FeeRate:   feeRate,
		TxOutputs: txOutputs,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res
}

func signTransaction(walletID, transactionID string) {
	res, err := client.SignTransaction(ctx, &adamanttellerv1.SignTransactionRequest{
		WalletId:      walletID,
		TransactionId: transactionID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
}

func sendTransaction(walletID, transactionID string) {
	res, err := client.SendTransaction(ctx, &adamantglobalv1.SendTransactionRequest{
		WalletId:      walletID,
		TransactionId: transactionID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
}

func cancelTransaction(walletID string, transactionID string) {
	res, err := client.CancelTransaction(ctx, &adamantglobalv1.CancelTransactionRequest{
		WalletId:      walletID,
		TransactionId: transactionID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
}

// func getTransactions(walletID string) []*adamantglobalv1.Transaction {
// 	res, err := client.GetTransaction(ctx, &adamantglobalv1.GetTransactionRequest{})
// 	if err != nil {
// 		log.Fatal("error: ", err)
// 	}
// 	spew.Dump(res)
// 	return res.Transactions
// }

func listTransactions(walletID string) []*adamantglobalv1.Transaction {
	res, err := client.ListTransactions(ctx, &adamantglobalv1.ListTransactionsRequest{
		WalletId: walletID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res.Transactions
}

func listTrasfers(walletID string) []*adamantglobalv1.Transfer {
	res, err := client.ListTransfers(ctx, &adamantglobalv1.ListTransfersRequest{
		WalletId: walletID,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res.Transfers
}

func caluculateFee(walletID string, feeRate uint64, txOutputs []*adamantglobalv1.RequestTxOutput) float64 {
	res, err := client.CalculateFee(ctx, &adamantglobalv1.CalculateFeeRequest{
		WalletId:  walletID,
		FeeRate:   feeRate,
		TxOutputs: txOutputs,
	})
	if err != nil {
		log.Fatal("error: ", err)
	}
	spew.Dump(res)
	return res.Fee
}
