package main

import (
	"context"
	"flag"
	"fmt"
	"net/http"
	"os"
	"os/signal"
	"runtime"
	"syscall"

	"github.com/GincoInc/go-util/logger"
	"github.com/GincoInc/gew-kmp/gen/gincoinc/adamant/teller/v1/adamanttellerv1"
	gwruntime "github.com/grpc-ecosystem/grpc-gateway/runtime"
	"go.uber.org/zap"
	"google.golang.org/grpc"
)

var (
	cpu      = flag.Int("cpu", 2, "number of cpu max procs")
	port     = flag.Int("port", 8080, "port of this gateway")
	endpoint = flag.String("endpoint", "localhost:50051", "endpoint of the gRPC service")
)

func main() {
	flag.Parse()

	cfg := struct {
		CPU      int
		Port     int
		Endpoint string
	}{
		CPU:      *cpu,
		Port:     *port,
		Endpoint: *endpoint,
	}

	logger.Info("Config was loaded.", zap.Any("config", cfg))

	runtime.GOMAXPROCS(cfg.CPU)

	ctx, cancel := context.WithCancel(context.Background())
	conn, err := grpc.DialContext(ctx, cfg.Endpoint, grpc.WithInsecure())
	if err != nil {
		logger.Fatal(err.Error())
	}
	defer conn.Close()

	gw, err := newGateway(ctx, conn)
	if err != nil {
		logger.Fatal(err.Error())
	}

	mux := http.NewServeMux()
	mux.Handle("/", gw)

	server := &http.Server{
		Addr:    fmt.Sprintf(":%d", cfg.Port),
		Handler: mux,
	}

	// Graceful Shutdown
	sigCh := make(chan os.Signal, 1)
	signal.Notify(sigCh, syscall.SIGINT, syscall.SIGTERM)
	go func() {
		defer close(sigCh)
		for sig := range sigCh {
			logger.Info(fmt.Sprintf("SIGNAL %d received. Then canceling jobs.", sig))
			server.Shutdown(context.Background())
			cancel()
			break
		}
	}()

	run := func(ctx context.Context) {
		logger.Info("Server is running.", zap.Int("port", cfg.Port))
		for {
			select {
			case <-ctx.Done():
				logger.Info("Shutting down.")
				return
			default:
				if err := server.ListenAndServe(); err != nil {
					if err != http.ErrServerClosed {
						logger.Error(err.Error())
					}
				}
			}
		}
	}

	run(ctx)
}

func newGateway(ctx context.Context, conn *grpc.ClientConn, opts ...gwruntime.ServeMuxOption) (http.Handler, error) {
	mux := gwruntime.NewServeMux(opts...)
	for _, f := range []func(context.Context, *gwruntime.ServeMux, *grpc.ClientConn) error{
		adamanttellerv1.RegisterTellerAPIHandler,
	} {
		if err := f(ctx, mux, conn); err != nil {
			return nil, err
		}
	}

	return mux, nil
}