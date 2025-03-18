package main

import (
	"context"
	"fmt"
	"log"

	pb "github.com/GincoInc/gew-kmp/gen/gincoinc/adamant/global/v1/adamantglobalv1"
	tellerpb "github.com/GincoInc/gew-kmp/gen/gincoinc/adamant/teller/v1/adamanttellerv1"
	"google.golang.org/genproto/googleapis/rpc/errdetails"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

func main() {
	// gRPCサーバーに接続
	conn, err := grpc.Dial("localhost:50051", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("Failed to connect: %v", err)
	}
	defer conn.Close()

	// gRPCクライアントの作成
	client := tellerpb.NewTellerAPIClient(conn)

	// リクエストの作成
	req := &pb.CalculateFeeRequest{
		WalletId:    "8f773760-f747-4240-8970-29ab2de3db0f",
		Address:     "0xa974b750e11de58c3f51f42fe76e16a1b5f1128a1aed264e46360fb3cae6ab66",
		StringValue: "100.0",
	}

	// gRPCリクエストを送信
	res, err := client.CalculateFee(context.Background(), req)
	if err != nil {
		st, ok := status.FromError(err)
		if ok {
			log.Printf("gRPC Error: %s (%d)", st.Message(), st.Code())

			// 詳細情報を解析
			for _, detail := range st.Details() {
				switch d := detail.(type) {
				case *errdetails.ErrorInfo:
					log.Printf("ErrorInfo: Reason=%s, Domain=%s, Metadata=%v\n", d.Reason, d.Domain, d.Metadata)
				case *errdetails.RetryInfo:
					log.Printf("RetryInfo: %v", d)
				case *errdetails.BadRequest:
					for _, v := range d.FieldViolations {
						log.Printf("BadRequest - Field: %s, Description: %s", v.Field, v.Description)
					}
				default:
					log.Printf("Unknown detail type: %T", d)
				}
			}

			// エラーコードごとの処理
			if st.Code() == codes.InvalidArgument {
				log.Println("Insufficient balance.")
			}
		} else {
			log.Fatalf("Failed to call CalculateFee: %v", err)
		}
		return
	}

	// レスポンスの表示
	fmt.Printf("Response: %+v\n", res)
}
