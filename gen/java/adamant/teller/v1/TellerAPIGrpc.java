package adamant.teller.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TellerAPIGrpc {

  private TellerAPIGrpc() {}

  public static final String SERVICE_NAME = "adamant.teller.v1.TellerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWallet",
      requestType = adamant.teller.v1.CreateWalletRequest.class,
      responseType = adamant.global.v1.CreateWalletResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest,
      adamant.global.v1.CreateWalletResponse> getCreateWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse> getCreateWalletMethod;
    if ((getCreateWalletMethod = TellerAPIGrpc.getCreateWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateWalletMethod = TellerAPIGrpc.getCreateWalletMethod) == null) {
          TellerAPIGrpc.getCreateWalletMethod = getCreateWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.CreateWalletRequest, adamant.global.v1.CreateWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.CreateWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateWalletResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateWallet"))
              .build();
        }
      }
    }
    return getCreateWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest,
      adamant.global.v1.Model.Wallet> getGetWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWallet",
      requestType = adamant.global.v1.GetWalletRequest.class,
      responseType = adamant.global.v1.Model.Wallet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest,
      adamant.global.v1.Model.Wallet> getGetWalletMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetWalletRequest, adamant.global.v1.Model.Wallet> getGetWalletMethod;
    if ((getGetWalletMethod = TellerAPIGrpc.getGetWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetWalletMethod = TellerAPIGrpc.getGetWalletMethod) == null) {
          TellerAPIGrpc.getGetWalletMethod = getGetWalletMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetWalletRequest, adamant.global.v1.Model.Wallet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Wallet.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetWallet"))
              .build();
        }
      }
    }
    return getGetWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWallets",
      requestType = adamant.global.v1.ListWalletsRequest.class,
      responseType = adamant.global.v1.ListWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsRequest, adamant.global.v1.ListWalletsResponse> getListWalletsMethod;
    if ((getListWalletsMethod = TellerAPIGrpc.getListWalletsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListWalletsMethod = TellerAPIGrpc.getListWalletsMethod) == null) {
          TellerAPIGrpc.getListWalletsMethod = getListWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListWallets"))
              .build();
        }
      }
    }
    return getListWalletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWalletsByFilter",
      requestType = adamant.global.v1.ListWalletsByFilterRequest.class,
      responseType = adamant.global.v1.ListWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest,
      adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListWalletsByFilterRequest, adamant.global.v1.ListWalletsResponse> getListWalletsByFilterMethod;
    if ((getListWalletsByFilterMethod = TellerAPIGrpc.getListWalletsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListWalletsByFilterMethod = TellerAPIGrpc.getListWalletsByFilterMethod) == null) {
          TellerAPIGrpc.getListWalletsByFilterMethod = getListWalletsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListWalletsByFilterRequest, adamant.global.v1.ListWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWalletsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListWalletsByFilter"))
              .build();
        }
      }
    }
    return getListWalletsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListStakingWalletsByFilterRequest,
      adamant.global.v1.ListStakingWalletsResponse> getListStakingWalletsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStakingWalletsByFilter",
      requestType = adamant.global.v1.ListStakingWalletsByFilterRequest.class,
      responseType = adamant.global.v1.ListStakingWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListStakingWalletsByFilterRequest,
      adamant.global.v1.ListStakingWalletsResponse> getListStakingWalletsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListStakingWalletsByFilterRequest, adamant.global.v1.ListStakingWalletsResponse> getListStakingWalletsByFilterMethod;
    if ((getListStakingWalletsByFilterMethod = TellerAPIGrpc.getListStakingWalletsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListStakingWalletsByFilterMethod = TellerAPIGrpc.getListStakingWalletsByFilterMethod) == null) {
          TellerAPIGrpc.getListStakingWalletsByFilterMethod = getListStakingWalletsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListStakingWalletsByFilterRequest, adamant.global.v1.ListStakingWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStakingWalletsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingWalletsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListStakingWalletsByFilter"))
              .build();
        }
      }
    }
    return getListStakingWalletsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListNFTWalletsByFilterRequest,
      adamant.global.v1.ListNFTWalletsResponse> getListNFTWalletsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNFTWalletsByFilter",
      requestType = adamant.global.v1.ListNFTWalletsByFilterRequest.class,
      responseType = adamant.global.v1.ListNFTWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListNFTWalletsByFilterRequest,
      adamant.global.v1.ListNFTWalletsResponse> getListNFTWalletsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListNFTWalletsByFilterRequest, adamant.global.v1.ListNFTWalletsResponse> getListNFTWalletsByFilterMethod;
    if ((getListNFTWalletsByFilterMethod = TellerAPIGrpc.getListNFTWalletsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListNFTWalletsByFilterMethod = TellerAPIGrpc.getListNFTWalletsByFilterMethod) == null) {
          TellerAPIGrpc.getListNFTWalletsByFilterMethod = getListNFTWalletsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListNFTWalletsByFilterRequest, adamant.global.v1.ListNFTWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNFTWalletsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListNFTWalletsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListNFTWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListNFTWalletsByFilter"))
              .build();
        }
      }
    }
    return getListNFTWalletsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest,
      adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBaseWallets",
      requestType = adamant.global.v1.ListBaseWalletsRequest.class,
      responseType = adamant.global.v1.ListBaseWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest,
      adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListBaseWalletsRequest, adamant.global.v1.ListBaseWalletsResponse> getListBaseWalletsMethod;
    if ((getListBaseWalletsMethod = TellerAPIGrpc.getListBaseWalletsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListBaseWalletsMethod = TellerAPIGrpc.getListBaseWalletsMethod) == null) {
          TellerAPIGrpc.getListBaseWalletsMethod = getListBaseWalletsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBaseWalletsRequest, adamant.global.v1.ListBaseWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBaseWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBaseWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListBaseWallets"))
              .build();
        }
      }
    }
    return getListBaseWalletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest,
      adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendableBalance",
      requestType = adamant.global.v1.GetSpendableBalanceRequest.class,
      responseType = adamant.global.v1.GetSpendableBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest,
      adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetSpendableBalanceRequest, adamant.global.v1.GetSpendableBalanceResponse> getGetSpendableBalanceMethod;
    if ((getGetSpendableBalanceMethod = TellerAPIGrpc.getGetSpendableBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetSpendableBalanceMethod = TellerAPIGrpc.getGetSpendableBalanceMethod) == null) {
          TellerAPIGrpc.getGetSpendableBalanceMethod = getGetSpendableBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetSpendableBalanceRequest, adamant.global.v1.GetSpendableBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendableBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetSpendableBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetSpendableBalance"))
              .build();
        }
      }
    }
    return getGetSpendableBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest,
      com.google.protobuf.Empty> getInitializeXRPWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeXRPWallet",
      requestType = adamant.teller.v1.InitializeXRPWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest,
      com.google.protobuf.Empty> getInitializeXRPWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.InitializeXRPWalletRequest, com.google.protobuf.Empty> getInitializeXRPWalletMethod;
    if ((getInitializeXRPWalletMethod = TellerAPIGrpc.getInitializeXRPWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getInitializeXRPWalletMethod = TellerAPIGrpc.getInitializeXRPWalletMethod) == null) {
          TellerAPIGrpc.getInitializeXRPWalletMethod = getInitializeXRPWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.InitializeXRPWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeXRPWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.InitializeXRPWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("InitializeXRPWallet"))
              .build();
        }
      }
    }
    return getInitializeXRPWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest,
      com.google.protobuf.Empty> getInitializeWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeWallet",
      requestType = adamant.teller.v1.InitializeWalletRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest,
      com.google.protobuf.Empty> getInitializeWalletMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.InitializeWalletRequest, com.google.protobuf.Empty> getInitializeWalletMethod;
    if ((getInitializeWalletMethod = TellerAPIGrpc.getInitializeWalletMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getInitializeWalletMethod = TellerAPIGrpc.getInitializeWalletMethod) == null) {
          TellerAPIGrpc.getInitializeWalletMethod = getInitializeWalletMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.InitializeWalletRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.InitializeWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("InitializeWallet"))
              .build();
        }
      }
    }
    return getInitializeWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateDestinationWalletIDRequest,
      com.google.protobuf.Empty> getUpdateDestinationWalletIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDestinationWalletID",
      requestType = adamant.global.v1.UpdateDestinationWalletIDRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateDestinationWalletIDRequest,
      com.google.protobuf.Empty> getUpdateDestinationWalletIDMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateDestinationWalletIDRequest, com.google.protobuf.Empty> getUpdateDestinationWalletIDMethod;
    if ((getUpdateDestinationWalletIDMethod = TellerAPIGrpc.getUpdateDestinationWalletIDMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getUpdateDestinationWalletIDMethod = TellerAPIGrpc.getUpdateDestinationWalletIDMethod) == null) {
          TellerAPIGrpc.getUpdateDestinationWalletIDMethod = getUpdateDestinationWalletIDMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateDestinationWalletIDRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDestinationWalletID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateDestinationWalletIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("UpdateDestinationWalletID"))
              .build();
        }
      }
    }
    return getUpdateDestinationWalletIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetCosmosBalanceRequest,
      adamant.global.v1.GetCosmosBalanceResponse> getGetCosmosBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCosmosBalance",
      requestType = adamant.global.v1.GetCosmosBalanceRequest.class,
      responseType = adamant.global.v1.GetCosmosBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetCosmosBalanceRequest,
      adamant.global.v1.GetCosmosBalanceResponse> getGetCosmosBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetCosmosBalanceRequest, adamant.global.v1.GetCosmosBalanceResponse> getGetCosmosBalanceMethod;
    if ((getGetCosmosBalanceMethod = TellerAPIGrpc.getGetCosmosBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetCosmosBalanceMethod = TellerAPIGrpc.getGetCosmosBalanceMethod) == null) {
          TellerAPIGrpc.getGetCosmosBalanceMethod = getGetCosmosBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetCosmosBalanceRequest, adamant.global.v1.GetCosmosBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCosmosBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetCosmosBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetCosmosBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetCosmosBalance"))
              .build();
        }
      }
    }
    return getGetCosmosBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListCosmosDelegateHistoriesRequest,
      adamant.global.v1.ListCosmosDelegateHistoriesResponse> getListCosmosDelegateHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCosmosDelegateHistories",
      requestType = adamant.global.v1.ListCosmosDelegateHistoriesRequest.class,
      responseType = adamant.global.v1.ListCosmosDelegateHistoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListCosmosDelegateHistoriesRequest,
      adamant.global.v1.ListCosmosDelegateHistoriesResponse> getListCosmosDelegateHistoriesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListCosmosDelegateHistoriesRequest, adamant.global.v1.ListCosmosDelegateHistoriesResponse> getListCosmosDelegateHistoriesMethod;
    if ((getListCosmosDelegateHistoriesMethod = TellerAPIGrpc.getListCosmosDelegateHistoriesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListCosmosDelegateHistoriesMethod = TellerAPIGrpc.getListCosmosDelegateHistoriesMethod) == null) {
          TellerAPIGrpc.getListCosmosDelegateHistoriesMethod = getListCosmosDelegateHistoriesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListCosmosDelegateHistoriesRequest, adamant.global.v1.ListCosmosDelegateHistoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCosmosDelegateHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListCosmosDelegateHistoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListCosmosDelegateHistoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListCosmosDelegateHistories"))
              .build();
        }
      }
    }
    return getListCosmosDelegateHistoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListUTXOsRequest,
      adamant.global.v1.ListUTXOsResponse> getListUTXOsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUTXOs",
      requestType = adamant.global.v1.ListUTXOsRequest.class,
      responseType = adamant.global.v1.ListUTXOsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListUTXOsRequest,
      adamant.global.v1.ListUTXOsResponse> getListUTXOsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListUTXOsRequest, adamant.global.v1.ListUTXOsResponse> getListUTXOsMethod;
    if ((getListUTXOsMethod = TellerAPIGrpc.getListUTXOsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListUTXOsMethod = TellerAPIGrpc.getListUTXOsMethod) == null) {
          TellerAPIGrpc.getListUTXOsMethod = getListUTXOsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListUTXOsRequest, adamant.global.v1.ListUTXOsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUTXOs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListUTXOsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListUTXOsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListUTXOs"))
              .build();
        }
      }
    }
    return getListUTXOsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest,
      adamant.global.v1.CreateAddressResponse> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = adamant.global.v1.CreateAddressRequest.class,
      responseType = adamant.global.v1.CreateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest,
      adamant.global.v1.CreateAddressResponse> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateAddressRequest, adamant.global.v1.CreateAddressResponse> getCreateAddressMethod;
    if ((getCreateAddressMethod = TellerAPIGrpc.getCreateAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateAddressMethod = TellerAPIGrpc.getCreateAddressMethod) == null) {
          TellerAPIGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateAddressRequest, adamant.global.v1.CreateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateIOSTAccountRequest,
      adamant.global.v1.CreateIOSTAccountResponse> getCreateIOSTAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIOSTAccount",
      requestType = adamant.global.v1.CreateIOSTAccountRequest.class,
      responseType = adamant.global.v1.CreateIOSTAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateIOSTAccountRequest,
      adamant.global.v1.CreateIOSTAccountResponse> getCreateIOSTAccountMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateIOSTAccountRequest, adamant.global.v1.CreateIOSTAccountResponse> getCreateIOSTAccountMethod;
    if ((getCreateIOSTAccountMethod = TellerAPIGrpc.getCreateIOSTAccountMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateIOSTAccountMethod = TellerAPIGrpc.getCreateIOSTAccountMethod) == null) {
          TellerAPIGrpc.getCreateIOSTAccountMethod = getCreateIOSTAccountMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateIOSTAccountRequest, adamant.global.v1.CreateIOSTAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIOSTAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateIOSTAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateIOSTAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateIOSTAccount"))
              .build();
        }
      }
    }
    return getCreateIOSTAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListSymbolChildAddressesRequest,
      adamant.global.v1.ListSymbolChildAddressesResponse> getListSymbolChildAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSymbolChildAddresses",
      requestType = adamant.global.v1.ListSymbolChildAddressesRequest.class,
      responseType = adamant.global.v1.ListSymbolChildAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListSymbolChildAddressesRequest,
      adamant.global.v1.ListSymbolChildAddressesResponse> getListSymbolChildAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListSymbolChildAddressesRequest, adamant.global.v1.ListSymbolChildAddressesResponse> getListSymbolChildAddressesMethod;
    if ((getListSymbolChildAddressesMethod = TellerAPIGrpc.getListSymbolChildAddressesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListSymbolChildAddressesMethod = TellerAPIGrpc.getListSymbolChildAddressesMethod) == null) {
          TellerAPIGrpc.getListSymbolChildAddressesMethod = getListSymbolChildAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListSymbolChildAddressesRequest, adamant.global.v1.ListSymbolChildAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSymbolChildAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListSymbolChildAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListSymbolChildAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListSymbolChildAddresses"))
              .build();
        }
      }
    }
    return getListSymbolChildAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddress",
      requestType = adamant.global.v1.GetAddressRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressRequest, adamant.global.v1.Model.Address> getGetAddressMethod;
    if ((getGetAddressMethod = TellerAPIGrpc.getGetAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressMethod = TellerAPIGrpc.getGetAddressMethod) == null) {
          TellerAPIGrpc.getGetAddressMethod = getGetAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddress"))
              .build();
        }
      }
    }
    return getGetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByAddress",
      requestType = adamant.global.v1.GetAddressByAddressRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressRequest, adamant.global.v1.Model.Address> getGetAddressByAddressMethod;
    if ((getGetAddressByAddressMethod = TellerAPIGrpc.getGetAddressByAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressByAddressMethod = TellerAPIGrpc.getGetAddressByAddressMethod) == null) {
          TellerAPIGrpc.getGetAddressByAddressMethod = getGetAddressByAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByAddressRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddressByAddress"))
              .build();
        }
      }
    }
    return getGetAddressByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressCoinRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByAddressCoin",
      requestType = adamant.global.v1.GetAddressByAddressCoinRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressCoinRequest,
      adamant.global.v1.Model.Address> getGetAddressByAddressCoinMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByAddressCoinRequest, adamant.global.v1.Model.Address> getGetAddressByAddressCoinMethod;
    if ((getGetAddressByAddressCoinMethod = TellerAPIGrpc.getGetAddressByAddressCoinMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressByAddressCoinMethod = TellerAPIGrpc.getGetAddressByAddressCoinMethod) == null) {
          TellerAPIGrpc.getGetAddressByAddressCoinMethod = getGetAddressByAddressCoinMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByAddressCoinRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByAddressCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByAddressCoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddressByAddressCoin"))
              .build();
        }
      }
    }
    return getGetAddressByAddressCoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest,
      adamant.global.v1.Model.Address> getGetAddressByIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByIndex",
      requestType = adamant.global.v1.GetAddressByIndexRequest.class,
      responseType = adamant.global.v1.Model.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest,
      adamant.global.v1.Model.Address> getGetAddressByIndexMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetAddressByIndexRequest, adamant.global.v1.Model.Address> getGetAddressByIndexMethod;
    if ((getGetAddressByIndexMethod = TellerAPIGrpc.getGetAddressByIndexMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetAddressByIndexMethod = TellerAPIGrpc.getGetAddressByIndexMethod) == null) {
          TellerAPIGrpc.getGetAddressByIndexMethod = getGetAddressByIndexMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetAddressByIndexRequest, adamant.global.v1.Model.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetAddressByIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Address.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetAddressByIndex"))
              .build();
        }
      }
    }
    return getGetAddressByIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest,
      adamant.global.v1.ListAddressesResponse> getListAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAddresses",
      requestType = adamant.global.v1.ListAddressesRequest.class,
      responseType = adamant.global.v1.ListAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest,
      adamant.global.v1.ListAddressesResponse> getListAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListAddressesRequest, adamant.global.v1.ListAddressesResponse> getListAddressesMethod;
    if ((getListAddressesMethod = TellerAPIGrpc.getListAddressesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListAddressesMethod = TellerAPIGrpc.getListAddressesMethod) == null) {
          TellerAPIGrpc.getListAddressesMethod = getListAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListAddressesRequest, adamant.global.v1.ListAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListAddresses"))
              .build();
        }
      }
    }
    return getListAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ImportAddressRequest,
      com.google.protobuf.Empty> getImportAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportAddress",
      requestType = adamant.global.v1.ImportAddressRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ImportAddressRequest,
      com.google.protobuf.Empty> getImportAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ImportAddressRequest, com.google.protobuf.Empty> getImportAddressMethod;
    if ((getImportAddressMethod = TellerAPIGrpc.getImportAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getImportAddressMethod = TellerAPIGrpc.getImportAddressMethod) == null) {
          TellerAPIGrpc.getImportAddressMethod = getImportAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ImportAddressRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ImportAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ImportAddress"))
              .build();
        }
      }
    }
    return getImportAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest,
      adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEthereumFeeAddress",
      requestType = adamant.global.v1.GetEthereumFeeAddressRequest.class,
      responseType = adamant.global.v1.Model.EthereumFeeAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest,
      adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetEthereumFeeAddressRequest, adamant.global.v1.Model.EthereumFeeAddress> getGetEthereumFeeAddressMethod;
    if ((getGetEthereumFeeAddressMethod = TellerAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetEthereumFeeAddressMethod = TellerAPIGrpc.getGetEthereumFeeAddressMethod) == null) {
          TellerAPIGrpc.getGetEthereumFeeAddressMethod = getGetEthereumFeeAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetEthereumFeeAddressRequest, adamant.global.v1.Model.EthereumFeeAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEthereumFeeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetEthereumFeeAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.EthereumFeeAddress.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetEthereumFeeAddress"))
              .build();
        }
      }
    }
    return getGetEthereumFeeAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest,
      com.google.protobuf.Empty> getUpdateAddressBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAddressBalance",
      requestType = adamant.global.v1.UpdateAddressBalanceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest,
      com.google.protobuf.Empty> getUpdateAddressBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.UpdateAddressBalanceRequest, com.google.protobuf.Empty> getUpdateAddressBalanceMethod;
    if ((getUpdateAddressBalanceMethod = TellerAPIGrpc.getUpdateAddressBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getUpdateAddressBalanceMethod = TellerAPIGrpc.getUpdateAddressBalanceMethod) == null) {
          TellerAPIGrpc.getUpdateAddressBalanceMethod = getUpdateAddressBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.UpdateAddressBalanceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAddressBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.UpdateAddressBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("UpdateAddressBalance"))
              .build();
        }
      }
    }
    return getUpdateAddressBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ListColdFeeDepositAddressesRequest,
      adamant.teller.v1.ListColdFeeDepositAddressesResponse> getListColdFeeDepositAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListColdFeeDepositAddresses",
      requestType = adamant.teller.v1.ListColdFeeDepositAddressesRequest.class,
      responseType = adamant.teller.v1.ListColdFeeDepositAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ListColdFeeDepositAddressesRequest,
      adamant.teller.v1.ListColdFeeDepositAddressesResponse> getListColdFeeDepositAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ListColdFeeDepositAddressesRequest, adamant.teller.v1.ListColdFeeDepositAddressesResponse> getListColdFeeDepositAddressesMethod;
    if ((getListColdFeeDepositAddressesMethod = TellerAPIGrpc.getListColdFeeDepositAddressesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListColdFeeDepositAddressesMethod = TellerAPIGrpc.getListColdFeeDepositAddressesMethod) == null) {
          TellerAPIGrpc.getListColdFeeDepositAddressesMethod = getListColdFeeDepositAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ListColdFeeDepositAddressesRequest, adamant.teller.v1.ListColdFeeDepositAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListColdFeeDepositAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ListColdFeeDepositAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ListColdFeeDepositAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListColdFeeDepositAddresses"))
              .build();
        }
      }
    }
    return getListColdFeeDepositAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ListHotFeeDepositAddressesRequest,
      adamant.teller.v1.ListHotFeeDepositAddressesResponse> getListHotFeeDepositAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHotFeeDepositAddresses",
      requestType = adamant.teller.v1.ListHotFeeDepositAddressesRequest.class,
      responseType = adamant.teller.v1.ListHotFeeDepositAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ListHotFeeDepositAddressesRequest,
      adamant.teller.v1.ListHotFeeDepositAddressesResponse> getListHotFeeDepositAddressesMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ListHotFeeDepositAddressesRequest, adamant.teller.v1.ListHotFeeDepositAddressesResponse> getListHotFeeDepositAddressesMethod;
    if ((getListHotFeeDepositAddressesMethod = TellerAPIGrpc.getListHotFeeDepositAddressesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListHotFeeDepositAddressesMethod = TellerAPIGrpc.getListHotFeeDepositAddressesMethod) == null) {
          TellerAPIGrpc.getListHotFeeDepositAddressesMethod = getListHotFeeDepositAddressesMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ListHotFeeDepositAddressesRequest, adamant.teller.v1.ListHotFeeDepositAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHotFeeDepositAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ListHotFeeDepositAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ListHotFeeDepositAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListHotFeeDepositAddresses"))
              .build();
        }
      }
    }
    return getListHotFeeDepositAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreatePreTransactionRequest,
      adamant.global.v1.CreatePreTransactionResponse> getCreatePreTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePreTransaction",
      requestType = adamant.global.v1.CreatePreTransactionRequest.class,
      responseType = adamant.global.v1.CreatePreTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreatePreTransactionRequest,
      adamant.global.v1.CreatePreTransactionResponse> getCreatePreTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreatePreTransactionRequest, adamant.global.v1.CreatePreTransactionResponse> getCreatePreTransactionMethod;
    if ((getCreatePreTransactionMethod = TellerAPIGrpc.getCreatePreTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreatePreTransactionMethod = TellerAPIGrpc.getCreatePreTransactionMethod) == null) {
          TellerAPIGrpc.getCreatePreTransactionMethod = getCreatePreTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreatePreTransactionRequest, adamant.global.v1.CreatePreTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePreTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreatePreTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreatePreTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreatePreTransaction"))
              .build();
        }
      }
    }
    return getCreatePreTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionsByFilterRequest,
      adamant.global.v1.ListPreTransactionsByFilterResponse> getListPreTransactionsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPreTransactionsByFilter",
      requestType = adamant.global.v1.ListPreTransactionsByFilterRequest.class,
      responseType = adamant.global.v1.ListPreTransactionsByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionsByFilterRequest,
      adamant.global.v1.ListPreTransactionsByFilterResponse> getListPreTransactionsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionsByFilterRequest, adamant.global.v1.ListPreTransactionsByFilterResponse> getListPreTransactionsByFilterMethod;
    if ((getListPreTransactionsByFilterMethod = TellerAPIGrpc.getListPreTransactionsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListPreTransactionsByFilterMethod = TellerAPIGrpc.getListPreTransactionsByFilterMethod) == null) {
          TellerAPIGrpc.getListPreTransactionsByFilterMethod = getListPreTransactionsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListPreTransactionsByFilterRequest, adamant.global.v1.ListPreTransactionsByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPreTransactionsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPreTransactionsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPreTransactionsByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListPreTransactionsByFilter"))
              .build();
        }
      }
    }
    return getListPreTransactionsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CancelPreTransactionRequest,
      com.google.protobuf.Empty> getCancelPreTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelPreTransaction",
      requestType = adamant.global.v1.CancelPreTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CancelPreTransactionRequest,
      com.google.protobuf.Empty> getCancelPreTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CancelPreTransactionRequest, com.google.protobuf.Empty> getCancelPreTransactionMethod;
    if ((getCancelPreTransactionMethod = TellerAPIGrpc.getCancelPreTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCancelPreTransactionMethod = TellerAPIGrpc.getCancelPreTransactionMethod) == null) {
          TellerAPIGrpc.getCancelPreTransactionMethod = getCancelPreTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CancelPreTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelPreTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CancelPreTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CancelPreTransaction"))
              .build();
        }
      }
    }
    return getCancelPreTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest,
      adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = adamant.global.v1.CreateTransactionRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest,
      adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateTransactionRequest, adamant.global.v1.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = TellerAPIGrpc.getCreateTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateTransactionMethod = TellerAPIGrpc.getCreateTransactionMethod) == null) {
          TellerAPIGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateTransactionRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CreateContractCreationTransactionRequest,
      adamant.global.v1.CreateContractCreationTransactionResponse> getCreateContractCreationTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContractCreationTransaction",
      requestType = adamant.global.v1.CreateContractCreationTransactionRequest.class,
      responseType = adamant.global.v1.CreateContractCreationTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CreateContractCreationTransactionRequest,
      adamant.global.v1.CreateContractCreationTransactionResponse> getCreateContractCreationTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CreateContractCreationTransactionRequest, adamant.global.v1.CreateContractCreationTransactionResponse> getCreateContractCreationTransactionMethod;
    if ((getCreateContractCreationTransactionMethod = TellerAPIGrpc.getCreateContractCreationTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCreateContractCreationTransactionMethod = TellerAPIGrpc.getCreateContractCreationTransactionMethod) == null) {
          TellerAPIGrpc.getCreateContractCreationTransactionMethod = getCreateContractCreationTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CreateContractCreationTransactionRequest, adamant.global.v1.CreateContractCreationTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateContractCreationTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateContractCreationTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateContractCreationTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CreateContractCreationTransaction"))
              .build();
        }
      }
    }
    return getCreateContractCreationTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignTransaction",
      requestType = adamant.teller.v1.SignTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest,
      com.google.protobuf.Empty> getSignTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.SignTransactionRequest, com.google.protobuf.Empty> getSignTransactionMethod;
    if ((getSignTransactionMethod = TellerAPIGrpc.getSignTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSignTransactionMethod = TellerAPIGrpc.getSignTransactionMethod) == null) {
          TellerAPIGrpc.getSignTransactionMethod = getSignTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.SignTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.SignTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SignTransaction"))
              .build();
        }
      }
    }
    return getSignTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.SendTransactionRequest,
      adamant.global.v1.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = adamant.teller.v1.SendTransactionRequest.class,
      responseType = adamant.global.v1.SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.SendTransactionRequest,
      adamant.global.v1.SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.SendTransactionRequest, adamant.global.v1.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = TellerAPIGrpc.getSendTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSendTransactionMethod = TellerAPIGrpc.getSendTransactionMethod) == null) {
          TellerAPIGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.SendTransactionRequest, adamant.global.v1.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ResendTransactionRequest,
      adamant.global.v1.ResendTransactionResponse> getResendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendTransaction",
      requestType = adamant.teller.v1.ResendTransactionRequest.class,
      responseType = adamant.global.v1.ResendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ResendTransactionRequest,
      adamant.global.v1.ResendTransactionResponse> getResendTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ResendTransactionRequest, adamant.global.v1.ResendTransactionResponse> getResendTransactionMethod;
    if ((getResendTransactionMethod = TellerAPIGrpc.getResendTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getResendTransactionMethod = TellerAPIGrpc.getResendTransactionMethod) == null) {
          TellerAPIGrpc.getResendTransactionMethod = getResendTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ResendTransactionRequest, adamant.global.v1.ResendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ResendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ResendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ResendTransaction"))
              .build();
        }
      }
    }
    return getResendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest,
      com.google.protobuf.Empty> getCancelTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTransaction",
      requestType = adamant.global.v1.CancelTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest,
      com.google.protobuf.Empty> getCancelTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CancelTransactionRequest, com.google.protobuf.Empty> getCancelTransactionMethod;
    if ((getCancelTransactionMethod = TellerAPIGrpc.getCancelTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCancelTransactionMethod = TellerAPIGrpc.getCancelTransactionMethod) == null) {
          TellerAPIGrpc.getCancelTransactionMethod = getCancelTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CancelTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CancelTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CancelTransaction"))
              .build();
        }
      }
    }
    return getCancelTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ReplaceTransactionRequest,
      adamant.global.v1.ReplaceTransactionResponse> getReplaceTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceTransaction",
      requestType = adamant.global.v1.ReplaceTransactionRequest.class,
      responseType = adamant.global.v1.ReplaceTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ReplaceTransactionRequest,
      adamant.global.v1.ReplaceTransactionResponse> getReplaceTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ReplaceTransactionRequest, adamant.global.v1.ReplaceTransactionResponse> getReplaceTransactionMethod;
    if ((getReplaceTransactionMethod = TellerAPIGrpc.getReplaceTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getReplaceTransactionMethod = TellerAPIGrpc.getReplaceTransactionMethod) == null) {
          TellerAPIGrpc.getReplaceTransactionMethod = getReplaceTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ReplaceTransactionRequest, adamant.global.v1.ReplaceTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReplaceTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ReplaceTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ReplaceTransaction"))
              .build();
        }
      }
    }
    return getReplaceTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.IsTransactionReplaceableRequest,
      adamant.global.v1.IsTransactionReplaceableResponse> getIsTransactionReplaceableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsTransactionReplaceable",
      requestType = adamant.global.v1.IsTransactionReplaceableRequest.class,
      responseType = adamant.global.v1.IsTransactionReplaceableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.IsTransactionReplaceableRequest,
      adamant.global.v1.IsTransactionReplaceableResponse> getIsTransactionReplaceableMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.IsTransactionReplaceableRequest, adamant.global.v1.IsTransactionReplaceableResponse> getIsTransactionReplaceableMethod;
    if ((getIsTransactionReplaceableMethod = TellerAPIGrpc.getIsTransactionReplaceableMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getIsTransactionReplaceableMethod = TellerAPIGrpc.getIsTransactionReplaceableMethod) == null) {
          TellerAPIGrpc.getIsTransactionReplaceableMethod = getIsTransactionReplaceableMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.IsTransactionReplaceableRequest, adamant.global.v1.IsTransactionReplaceableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsTransactionReplaceable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsTransactionReplaceableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.IsTransactionReplaceableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("IsTransactionReplaceable"))
              .build();
        }
      }
    }
    return getIsTransactionReplaceableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = adamant.global.v1.GetTransactionRequest.class,
      responseType = adamant.global.v1.Model.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionRequest, adamant.global.v1.Model.Transaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = TellerAPIGrpc.getGetTransactionMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetTransactionMethod = TellerAPIGrpc.getGetTransactionMethod) == null) {
          TellerAPIGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionByTxID",
      requestType = adamant.global.v1.GetTransactionByTxIDRequest.class,
      responseType = adamant.global.v1.Model.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest,
      adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetTransactionByTxIDRequest, adamant.global.v1.Model.Transaction> getGetTransactionByTxIDMethod;
    if ((getGetTransactionByTxIDMethod = TellerAPIGrpc.getGetTransactionByTxIDMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetTransactionByTxIDMethod = TellerAPIGrpc.getGetTransactionByTxIDMethod) == null) {
          TellerAPIGrpc.getGetTransactionByTxIDMethod = getGetTransactionByTxIDMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetTransactionByTxIDRequest, adamant.global.v1.Model.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionByTxID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetTransactionByTxIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetTransactionByTxID"))
              .build();
        }
      }
    }
    return getGetTransactionByTxIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransactions",
      requestType = adamant.global.v1.ListTransactionsRequest.class,
      responseType = adamant.global.v1.ListTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsRequest, adamant.global.v1.ListTransactionsResponse> getListTransactionsMethod;
    if ((getListTransactionsMethod = TellerAPIGrpc.getListTransactionsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransactionsMethod = TellerAPIGrpc.getListTransactionsMethod) == null) {
          TellerAPIGrpc.getListTransactionsMethod = getListTransactionsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransactions"))
              .build();
        }
      }
    }
    return getListTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransactionsByFilter",
      requestType = adamant.global.v1.ListTransactionsByFilterRequest.class,
      responseType = adamant.global.v1.ListTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest,
      adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransactionsByFilterRequest, adamant.global.v1.ListTransactionsResponse> getListTransactionsByFilterMethod;
    if ((getListTransactionsByFilterMethod = TellerAPIGrpc.getListTransactionsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransactionsByFilterMethod = TellerAPIGrpc.getListTransactionsByFilterMethod) == null) {
          TellerAPIGrpc.getListTransactionsByFilterMethod = getListTransactionsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransactionsByFilterRequest, adamant.global.v1.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactionsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransactionsByFilter"))
              .build();
        }
      }
    }
    return getListTransactionsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest,
      adamant.global.v1.ListUnconfirmedTransactionsResponse> getListUnconfirmedTransactionsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUnconfirmedTransactionsByFilter",
      requestType = adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest.class,
      responseType = adamant.global.v1.ListUnconfirmedTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest,
      adamant.global.v1.ListUnconfirmedTransactionsResponse> getListUnconfirmedTransactionsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest, adamant.global.v1.ListUnconfirmedTransactionsResponse> getListUnconfirmedTransactionsByFilterMethod;
    if ((getListUnconfirmedTransactionsByFilterMethod = TellerAPIGrpc.getListUnconfirmedTransactionsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListUnconfirmedTransactionsByFilterMethod = TellerAPIGrpc.getListUnconfirmedTransactionsByFilterMethod) == null) {
          TellerAPIGrpc.getListUnconfirmedTransactionsByFilterMethod = getListUnconfirmedTransactionsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest, adamant.global.v1.ListUnconfirmedTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUnconfirmedTransactionsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListUnconfirmedTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListUnconfirmedTransactionsByFilter"))
              .build();
        }
      }
    }
    return getListUnconfirmedTransactionsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ExitEthereumStakingValidatorsRequest,
      adamant.global.v1.ExitEthereumStakingValidatorsResponse> getExitEthereumStakingValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitEthereumStakingValidators",
      requestType = adamant.global.v1.ExitEthereumStakingValidatorsRequest.class,
      responseType = adamant.global.v1.ExitEthereumStakingValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ExitEthereumStakingValidatorsRequest,
      adamant.global.v1.ExitEthereumStakingValidatorsResponse> getExitEthereumStakingValidatorsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ExitEthereumStakingValidatorsRequest, adamant.global.v1.ExitEthereumStakingValidatorsResponse> getExitEthereumStakingValidatorsMethod;
    if ((getExitEthereumStakingValidatorsMethod = TellerAPIGrpc.getExitEthereumStakingValidatorsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getExitEthereumStakingValidatorsMethod = TellerAPIGrpc.getExitEthereumStakingValidatorsMethod) == null) {
          TellerAPIGrpc.getExitEthereumStakingValidatorsMethod = getExitEthereumStakingValidatorsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ExitEthereumStakingValidatorsRequest, adamant.global.v1.ExitEthereumStakingValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitEthereumStakingValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ExitEthereumStakingValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ExitEthereumStakingValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ExitEthereumStakingValidators"))
              .build();
        }
      }
    }
    return getExitEthereumStakingValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransfers",
      requestType = adamant.global.v1.ListTransfersRequest.class,
      responseType = adamant.global.v1.ListTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersRequest, adamant.global.v1.ListTransfersResponse> getListTransfersMethod;
    if ((getListTransfersMethod = TellerAPIGrpc.getListTransfersMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransfersMethod = TellerAPIGrpc.getListTransfersMethod) == null) {
          TellerAPIGrpc.getListTransfersMethod = getListTransfersMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransfers"))
              .build();
        }
      }
    }
    return getListTransfersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransfersByFilter",
      requestType = adamant.global.v1.ListTransfersByFilterRequest.class,
      responseType = adamant.global.v1.ListTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest,
      adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListTransfersByFilterRequest, adamant.global.v1.ListTransfersResponse> getListTransfersByFilterMethod;
    if ((getListTransfersByFilterMethod = TellerAPIGrpc.getListTransfersByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListTransfersByFilterMethod = TellerAPIGrpc.getListTransfersByFilterMethod) == null) {
          TellerAPIGrpc.getListTransfersByFilterMethod = getListTransfersByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListTransfersByFilterRequest, adamant.global.v1.ListTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransfersByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListTransfersByFilter"))
              .build();
        }
      }
    }
    return getListTransfersByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateSnapshot",
      requestType = adamant.global.v1.GetRateSnapshotRequest.class,
      responseType = adamant.global.v1.Model.RateSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot> getGetRateSnapshotMethod;
    if ((getGetRateSnapshotMethod = TellerAPIGrpc.getGetRateSnapshotMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetRateSnapshotMethod = TellerAPIGrpc.getGetRateSnapshotMethod) == null) {
          TellerAPIGrpc.getGetRateSnapshotMethod = getGetRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetRateSnapshot"))
              .build();
        }
      }
    }
    return getGetRateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestRateSnapshot",
      requestType = adamant.global.v1.GetLatestRateSnapshotRequest.class,
      responseType = adamant.global.v1.Model.RateSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest,
      adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetLatestRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot> getGetLatestRateSnapshotMethod;
    if ((getGetLatestRateSnapshotMethod = TellerAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetLatestRateSnapshotMethod = TellerAPIGrpc.getGetLatestRateSnapshotMethod) == null) {
          TellerAPIGrpc.getGetLatestRateSnapshotMethod = getGetLatestRateSnapshotMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetLatestRateSnapshotRequest, adamant.global.v1.Model.RateSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestRateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetLatestRateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.Model.RateSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetLatestRateSnapshot"))
              .build();
        }
      }
    }
    return getGetLatestRateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest,
      adamant.global.v1.SetRatesResponse> getSetRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRates",
      requestType = adamant.global.v1.SetRatesRequest.class,
      responseType = adamant.global.v1.SetRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest,
      adamant.global.v1.SetRatesResponse> getSetRatesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.SetRatesRequest, adamant.global.v1.SetRatesResponse> getSetRatesMethod;
    if ((getSetRatesMethod = TellerAPIGrpc.getSetRatesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSetRatesMethod = TellerAPIGrpc.getSetRatesMethod) == null) {
          TellerAPIGrpc.getSetRatesMethod = getSetRatesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.SetRatesRequest, adamant.global.v1.SetRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.SetRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SetRates"))
              .build();
        }
      }
    }
    return getSetRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest,
      adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateFee",
      requestType = adamant.global.v1.CalculateFeeRequest.class,
      responseType = adamant.global.v1.CalculateFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest,
      adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.CalculateFeeRequest, adamant.global.v1.CalculateFeeResponse> getCalculateFeeMethod;
    if ((getCalculateFeeMethod = TellerAPIGrpc.getCalculateFeeMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getCalculateFeeMethod = TellerAPIGrpc.getCalculateFeeMethod) == null) {
          TellerAPIGrpc.getCalculateFeeMethod = getCalculateFeeMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.CalculateFeeRequest, adamant.global.v1.CalculateFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CalculateFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("CalculateFee"))
              .build();
        }
      }
    }
    return getCalculateFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest,
      adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecommendedFeeRate",
      requestType = adamant.global.v1.GetRecommendedFeeRateRequest.class,
      responseType = adamant.global.v1.GetRecommendedFeeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest,
      adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.GetRecommendedFeeRateRequest, adamant.global.v1.GetRecommendedFeeRateResponse> getGetRecommendedFeeRateMethod;
    if ((getGetRecommendedFeeRateMethod = TellerAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getGetRecommendedFeeRateMethod = TellerAPIGrpc.getGetRecommendedFeeRateMethod) == null) {
          TellerAPIGrpc.getGetRecommendedFeeRateMethod = getGetRecommendedFeeRateMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.GetRecommendedFeeRateRequest, adamant.global.v1.GetRecommendedFeeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecommendedFeeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.GetRecommendedFeeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("GetRecommendedFeeRate"))
              .build();
        }
      }
    }
    return getGetRecommendedFeeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest,
      adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateAddress",
      requestType = adamant.global.v1.ValidateAddressRequest.class,
      responseType = adamant.global.v1.ValidateAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest,
      adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ValidateAddressRequest, adamant.global.v1.ValidateAddressResponse> getValidateAddressMethod;
    if ((getValidateAddressMethod = TellerAPIGrpc.getValidateAddressMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getValidateAddressMethod = TellerAPIGrpc.getValidateAddressMethod) == null) {
          TellerAPIGrpc.getValidateAddressMethod = getValidateAddressMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ValidateAddressRequest, adamant.global.v1.ValidateAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ValidateAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ValidateAddress"))
              .build();
        }
      }
    }
    return getValidateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest,
      adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlushBalance",
      requestType = adamant.global.v1.FlushBalanceRequest.class,
      responseType = adamant.global.v1.FlushBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest,
      adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.FlushBalanceRequest, adamant.global.v1.FlushBalanceResponse> getFlushBalanceMethod;
    if ((getFlushBalanceMethod = TellerAPIGrpc.getFlushBalanceMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getFlushBalanceMethod = TellerAPIGrpc.getFlushBalanceMethod) == null) {
          TellerAPIGrpc.getFlushBalanceMethod = getFlushBalanceMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.FlushBalanceRequest, adamant.global.v1.FlushBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.FlushBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("FlushBalance"))
              .build();
        }
      }
    }
    return getFlushBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListAuditLogsRequest,
      adamant.global.v1.ListAuditLogsResponse> getListAuditLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuditLogs",
      requestType = adamant.global.v1.ListAuditLogsRequest.class,
      responseType = adamant.global.v1.ListAuditLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListAuditLogsRequest,
      adamant.global.v1.ListAuditLogsResponse> getListAuditLogsMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListAuditLogsRequest, adamant.global.v1.ListAuditLogsResponse> getListAuditLogsMethod;
    if ((getListAuditLogsMethod = TellerAPIGrpc.getListAuditLogsMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListAuditLogsMethod = TellerAPIGrpc.getListAuditLogsMethod) == null) {
          TellerAPIGrpc.getListAuditLogsMethod = getListAuditLogsMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListAuditLogsRequest, adamant.global.v1.ListAuditLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuditLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAuditLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListAuditLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListAuditLogs"))
              .build();
        }
      }
    }
    return getListAuditLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListStakingHistoriesByFilterRequest,
      adamant.global.v1.ListStakingHistoriesResponse> getListStakingHistoriesByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStakingHistoriesByFilter",
      requestType = adamant.global.v1.ListStakingHistoriesByFilterRequest.class,
      responseType = adamant.global.v1.ListStakingHistoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListStakingHistoriesByFilterRequest,
      adamant.global.v1.ListStakingHistoriesResponse> getListStakingHistoriesByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListStakingHistoriesByFilterRequest, adamant.global.v1.ListStakingHistoriesResponse> getListStakingHistoriesByFilterMethod;
    if ((getListStakingHistoriesByFilterMethod = TellerAPIGrpc.getListStakingHistoriesByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListStakingHistoriesByFilterMethod = TellerAPIGrpc.getListStakingHistoriesByFilterMethod) == null) {
          TellerAPIGrpc.getListStakingHistoriesByFilterMethod = getListStakingHistoriesByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListStakingHistoriesByFilterRequest, adamant.global.v1.ListStakingHistoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStakingHistoriesByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingHistoriesByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingHistoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListStakingHistoriesByFilter"))
              .build();
        }
      }
    }
    return getListStakingHistoriesByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListStakingValidatorsByFilterRequest,
      adamant.global.v1.ListStakingValidatorsResponse> getListStakingValidatorsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStakingValidatorsByFilter",
      requestType = adamant.global.v1.ListStakingValidatorsByFilterRequest.class,
      responseType = adamant.global.v1.ListStakingValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListStakingValidatorsByFilterRequest,
      adamant.global.v1.ListStakingValidatorsResponse> getListStakingValidatorsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListStakingValidatorsByFilterRequest, adamant.global.v1.ListStakingValidatorsResponse> getListStakingValidatorsByFilterMethod;
    if ((getListStakingValidatorsByFilterMethod = TellerAPIGrpc.getListStakingValidatorsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListStakingValidatorsByFilterMethod = TellerAPIGrpc.getListStakingValidatorsByFilterMethod) == null) {
          TellerAPIGrpc.getListStakingValidatorsByFilterMethod = getListStakingValidatorsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListStakingValidatorsByFilterRequest, adamant.global.v1.ListStakingValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStakingValidatorsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingValidatorsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListStakingValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListStakingValidatorsByFilter"))
              .build();
        }
      }
    }
    return getListStakingValidatorsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListNFTsByFilterRequest,
      adamant.global.v1.ListNFTsResponse> getListNFTsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNFTsByFilter",
      requestType = adamant.global.v1.ListNFTsByFilterRequest.class,
      responseType = adamant.global.v1.ListNFTsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListNFTsByFilterRequest,
      adamant.global.v1.ListNFTsResponse> getListNFTsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListNFTsByFilterRequest, adamant.global.v1.ListNFTsResponse> getListNFTsByFilterMethod;
    if ((getListNFTsByFilterMethod = TellerAPIGrpc.getListNFTsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListNFTsByFilterMethod = TellerAPIGrpc.getListNFTsByFilterMethod) == null) {
          TellerAPIGrpc.getListNFTsByFilterMethod = getListNFTsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListNFTsByFilterRequest, adamant.global.v1.ListNFTsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNFTsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListNFTsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListNFTsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListNFTsByFilter"))
              .build();
        }
      }
    }
    return getListNFTsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.SignMessageRequest,
      adamant.teller.v1.SignMessageResponse> getSignMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignMessage",
      requestType = adamant.teller.v1.SignMessageRequest.class,
      responseType = adamant.teller.v1.SignMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.SignMessageRequest,
      adamant.teller.v1.SignMessageResponse> getSignMessageMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.SignMessageRequest, adamant.teller.v1.SignMessageResponse> getSignMessageMethod;
    if ((getSignMessageMethod = TellerAPIGrpc.getSignMessageMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getSignMessageMethod = TellerAPIGrpc.getSignMessageMethod) == null) {
          TellerAPIGrpc.getSignMessageMethod = getSignMessageMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.SignMessageRequest, adamant.teller.v1.SignMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.SignMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.SignMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("SignMessage"))
              .build();
        }
      }
    }
    return getSignMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinInitializeRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinInitializeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinInitialize",
      requestType = adamant.teller.v1.ProgmatCoinInitializeRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinInitializeRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinInitializeMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinInitializeRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinInitializeMethod;
    if ((getProgmatCoinInitializeMethod = TellerAPIGrpc.getProgmatCoinInitializeMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinInitializeMethod = TellerAPIGrpc.getProgmatCoinInitializeMethod) == null) {
          TellerAPIGrpc.getProgmatCoinInitializeMethod = getProgmatCoinInitializeMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinInitializeRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinInitialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinInitializeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinInitialize"))
              .build();
        }
      }
    }
    return getProgmatCoinInitializeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfigureMinterRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfigureMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinConfigureMinter",
      requestType = adamant.teller.v1.ProgmatCoinConfigureMinterRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfigureMinterRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfigureMinterMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfigureMinterRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfigureMinterMethod;
    if ((getProgmatCoinConfigureMinterMethod = TellerAPIGrpc.getProgmatCoinConfigureMinterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinConfigureMinterMethod = TellerAPIGrpc.getProgmatCoinConfigureMinterMethod) == null) {
          TellerAPIGrpc.getProgmatCoinConfigureMinterMethod = getProgmatCoinConfigureMinterMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinConfigureMinterRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinConfigureMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinConfigureMinterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinConfigureMinter"))
              .build();
        }
      }
    }
    return getProgmatCoinConfigureMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintAndTransferRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintAndTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinMintAndTransfer",
      requestType = adamant.teller.v1.ProgmatCoinMintAndTransferRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintAndTransferRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintAndTransferMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintAndTransferRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintAndTransferMethod;
    if ((getProgmatCoinMintAndTransferMethod = TellerAPIGrpc.getProgmatCoinMintAndTransferMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinMintAndTransferMethod = TellerAPIGrpc.getProgmatCoinMintAndTransferMethod) == null) {
          TellerAPIGrpc.getProgmatCoinMintAndTransferMethod = getProgmatCoinMintAndTransferMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinMintAndTransferRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinMintAndTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinMintAndTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinMintAndTransfer"))
              .build();
        }
      }
    }
    return getProgmatCoinMintAndTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinMint",
      requestType = adamant.teller.v1.ProgmatCoinMintRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinMintRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinMintMethod;
    if ((getProgmatCoinMintMethod = TellerAPIGrpc.getProgmatCoinMintMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinMintMethod = TellerAPIGrpc.getProgmatCoinMintMethod) == null) {
          TellerAPIGrpc.getProgmatCoinMintMethod = getProgmatCoinMintMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinMintRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinMint"))
              .build();
        }
      }
    }
    return getProgmatCoinMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBurnRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinBurn",
      requestType = adamant.teller.v1.ProgmatCoinBurnRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBurnRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBurnMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBurnRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinBurnMethod;
    if ((getProgmatCoinBurnMethod = TellerAPIGrpc.getProgmatCoinBurnMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinBurnMethod = TellerAPIGrpc.getProgmatCoinBurnMethod) == null) {
          TellerAPIGrpc.getProgmatCoinBurnMethod = getProgmatCoinBurnMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinBurnRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinBurn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinBurnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinBurn"))
              .build();
        }
      }
    }
    return getProgmatCoinBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinBulkAddToWhitelist",
      requestType = adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToWhitelistMethod;
    if ((getProgmatCoinBulkAddToWhitelistMethod = TellerAPIGrpc.getProgmatCoinBulkAddToWhitelistMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinBulkAddToWhitelistMethod = TellerAPIGrpc.getProgmatCoinBulkAddToWhitelistMethod) == null) {
          TellerAPIGrpc.getProgmatCoinBulkAddToWhitelistMethod = getProgmatCoinBulkAddToWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinBulkAddToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinBulkAddToWhitelist"))
              .build();
        }
      }
    }
    return getProgmatCoinBulkAddToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinBulkRemoveFromWhitelist",
      requestType = adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromWhitelistMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromWhitelistMethod;
    if ((getProgmatCoinBulkRemoveFromWhitelistMethod = TellerAPIGrpc.getProgmatCoinBulkRemoveFromWhitelistMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinBulkRemoveFromWhitelistMethod = TellerAPIGrpc.getProgmatCoinBulkRemoveFromWhitelistMethod) == null) {
          TellerAPIGrpc.getProgmatCoinBulkRemoveFromWhitelistMethod = getProgmatCoinBulkRemoveFromWhitelistMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinBulkRemoveFromWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinBulkRemoveFromWhitelist"))
              .build();
        }
      }
    }
    return getProgmatCoinBulkRemoveFromWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToBlacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinBulkAddToBlacklist",
      requestType = adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToBlacklistMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkAddToBlacklistMethod;
    if ((getProgmatCoinBulkAddToBlacklistMethod = TellerAPIGrpc.getProgmatCoinBulkAddToBlacklistMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinBulkAddToBlacklistMethod = TellerAPIGrpc.getProgmatCoinBulkAddToBlacklistMethod) == null) {
          TellerAPIGrpc.getProgmatCoinBulkAddToBlacklistMethod = getProgmatCoinBulkAddToBlacklistMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinBulkAddToBlacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinBulkAddToBlacklist"))
              .build();
        }
      }
    }
    return getProgmatCoinBulkAddToBlacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromBlacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinBulkRemoveFromBlacklist",
      requestType = adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromBlacklistMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinBulkRemoveFromBlacklistMethod;
    if ((getProgmatCoinBulkRemoveFromBlacklistMethod = TellerAPIGrpc.getProgmatCoinBulkRemoveFromBlacklistMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinBulkRemoveFromBlacklistMethod = TellerAPIGrpc.getProgmatCoinBulkRemoveFromBlacklistMethod) == null) {
          TellerAPIGrpc.getProgmatCoinBulkRemoveFromBlacklistMethod = getProgmatCoinBulkRemoveFromBlacklistMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinBulkRemoveFromBlacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinBulkRemoveFromBlacklist"))
              .build();
        }
      }
    }
    return getProgmatCoinBulkRemoveFromBlacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfiscateRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfiscateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinConfiscate",
      requestType = adamant.teller.v1.ProgmatCoinConfiscateRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfiscateRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfiscateMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinConfiscateRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinConfiscateMethod;
    if ((getProgmatCoinConfiscateMethod = TellerAPIGrpc.getProgmatCoinConfiscateMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinConfiscateMethod = TellerAPIGrpc.getProgmatCoinConfiscateMethod) == null) {
          TellerAPIGrpc.getProgmatCoinConfiscateMethod = getProgmatCoinConfiscateMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinConfiscateRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinConfiscate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinConfiscateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinConfiscate"))
              .build();
        }
      }
    }
    return getProgmatCoinConfiscateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinPauseRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinPause",
      requestType = adamant.teller.v1.ProgmatCoinPauseRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinPauseRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinPauseMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinPauseRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinPauseMethod;
    if ((getProgmatCoinPauseMethod = TellerAPIGrpc.getProgmatCoinPauseMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinPauseMethod = TellerAPIGrpc.getProgmatCoinPauseMethod) == null) {
          TellerAPIGrpc.getProgmatCoinPauseMethod = getProgmatCoinPauseMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinPauseRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinPause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinPauseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinPause"))
              .build();
        }
      }
    }
    return getProgmatCoinPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUnpauseRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinUnpauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinUnpause",
      requestType = adamant.teller.v1.ProgmatCoinUnpauseRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUnpauseRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinUnpauseMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUnpauseRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinUnpauseMethod;
    if ((getProgmatCoinUnpauseMethod = TellerAPIGrpc.getProgmatCoinUnpauseMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinUnpauseMethod = TellerAPIGrpc.getProgmatCoinUnpauseMethod) == null) {
          TellerAPIGrpc.getProgmatCoinUnpauseMethod = getProgmatCoinUnpauseMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinUnpauseRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinUnpause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinUnpauseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinUnpause"))
              .build();
        }
      }
    }
    return getProgmatCoinUnpauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinGrantWhiteAndBlackListerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinGrantWhiteAndBlackLister",
      requestType = adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinGrantWhiteAndBlackListerMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinGrantWhiteAndBlackListerMethod;
    if ((getProgmatCoinGrantWhiteAndBlackListerMethod = TellerAPIGrpc.getProgmatCoinGrantWhiteAndBlackListerMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinGrantWhiteAndBlackListerMethod = TellerAPIGrpc.getProgmatCoinGrantWhiteAndBlackListerMethod) == null) {
          TellerAPIGrpc.getProgmatCoinGrantWhiteAndBlackListerMethod = getProgmatCoinGrantWhiteAndBlackListerMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinGrantWhiteAndBlackLister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinGrantWhiteAndBlackLister"))
              .build();
        }
      }
    }
    return getProgmatCoinGrantWhiteAndBlackListerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinUpgradeToAndCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgmatCoinUpgradeToAndCall",
      requestType = adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest.class,
      responseType = adamant.global.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest,
      adamant.global.v1.CreateTransactionResponse> getProgmatCoinUpgradeToAndCallMethod() {
    io.grpc.MethodDescriptor<adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest, adamant.global.v1.CreateTransactionResponse> getProgmatCoinUpgradeToAndCallMethod;
    if ((getProgmatCoinUpgradeToAndCallMethod = TellerAPIGrpc.getProgmatCoinUpgradeToAndCallMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getProgmatCoinUpgradeToAndCallMethod = TellerAPIGrpc.getProgmatCoinUpgradeToAndCallMethod) == null) {
          TellerAPIGrpc.getProgmatCoinUpgradeToAndCallMethod = getProgmatCoinUpgradeToAndCallMethod =
              io.grpc.MethodDescriptor.<adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest, adamant.global.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgmatCoinUpgradeToAndCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ProgmatCoinUpgradeToAndCall"))
              .build();
        }
      }
    }
    return getProgmatCoinUpgradeToAndCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionThresholdsByFilterRequest,
      adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> getListPreTransactionThresholdsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPreTransactionThresholdsByFilter",
      requestType = adamant.global.v1.ListPreTransactionThresholdsByFilterRequest.class,
      responseType = adamant.global.v1.ListPreTransactionThresholdsByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionThresholdsByFilterRequest,
      adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> getListPreTransactionThresholdsByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListPreTransactionThresholdsByFilterRequest, adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> getListPreTransactionThresholdsByFilterMethod;
    if ((getListPreTransactionThresholdsByFilterMethod = TellerAPIGrpc.getListPreTransactionThresholdsByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListPreTransactionThresholdsByFilterMethod = TellerAPIGrpc.getListPreTransactionThresholdsByFilterMethod) == null) {
          TellerAPIGrpc.getListPreTransactionThresholdsByFilterMethod = getListPreTransactionThresholdsByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListPreTransactionThresholdsByFilterRequest, adamant.global.v1.ListPreTransactionThresholdsByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPreTransactionThresholdsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPreTransactionThresholdsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListPreTransactionThresholdsByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListPreTransactionThresholdsByFilter"))
              .build();
        }
      }
    }
    return getListPreTransactionThresholdsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressesByFilterRequest,
      adamant.global.v1.ListBlacklistAddressesByFilterResponse> getListBlacklistAddressesByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBlacklistAddressesByFilter",
      requestType = adamant.global.v1.ListBlacklistAddressesByFilterRequest.class,
      responseType = adamant.global.v1.ListBlacklistAddressesByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressesByFilterRequest,
      adamant.global.v1.ListBlacklistAddressesByFilterResponse> getListBlacklistAddressesByFilterMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressesByFilterRequest, adamant.global.v1.ListBlacklistAddressesByFilterResponse> getListBlacklistAddressesByFilterMethod;
    if ((getListBlacklistAddressesByFilterMethod = TellerAPIGrpc.getListBlacklistAddressesByFilterMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListBlacklistAddressesByFilterMethod = TellerAPIGrpc.getListBlacklistAddressesByFilterMethod) == null) {
          TellerAPIGrpc.getListBlacklistAddressesByFilterMethod = getListBlacklistAddressesByFilterMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBlacklistAddressesByFilterRequest, adamant.global.v1.ListBlacklistAddressesByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBlacklistAddressesByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBlacklistAddressesByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBlacklistAddressesByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListBlacklistAddressesByFilter"))
              .build();
        }
      }
    }
    return getListBlacklistAddressesByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressFilesRequest,
      adamant.global.v1.ListBlacklistAddressFilesResponse> getListBlacklistAddressFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBlacklistAddressFiles",
      requestType = adamant.global.v1.ListBlacklistAddressFilesRequest.class,
      responseType = adamant.global.v1.ListBlacklistAddressFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressFilesRequest,
      adamant.global.v1.ListBlacklistAddressFilesResponse> getListBlacklistAddressFilesMethod() {
    io.grpc.MethodDescriptor<adamant.global.v1.ListBlacklistAddressFilesRequest, adamant.global.v1.ListBlacklistAddressFilesResponse> getListBlacklistAddressFilesMethod;
    if ((getListBlacklistAddressFilesMethod = TellerAPIGrpc.getListBlacklistAddressFilesMethod) == null) {
      synchronized (TellerAPIGrpc.class) {
        if ((getListBlacklistAddressFilesMethod = TellerAPIGrpc.getListBlacklistAddressFilesMethod) == null) {
          TellerAPIGrpc.getListBlacklistAddressFilesMethod = getListBlacklistAddressFilesMethod =
              io.grpc.MethodDescriptor.<adamant.global.v1.ListBlacklistAddressFilesRequest, adamant.global.v1.ListBlacklistAddressFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBlacklistAddressFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBlacklistAddressFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.global.v1.ListBlacklistAddressFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TellerAPIMethodDescriptorSupplier("ListBlacklistAddressFiles"))
              .build();
        }
      }
    }
    return getListBlacklistAddressFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TellerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIStub>() {
        @java.lang.Override
        public TellerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIStub(channel, callOptions);
        }
      };
    return TellerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TellerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIBlockingStub>() {
        @java.lang.Override
        public TellerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIBlockingStub(channel, callOptions);
        }
      };
    return TellerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TellerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TellerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TellerAPIFutureStub>() {
        @java.lang.Override
        public TellerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TellerAPIFutureStub(channel, callOptions);
        }
      };
    return TellerAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createWallet(adamant.teller.v1.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWalletMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    default void getWallet(adamant.global.v1.GetWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWalletMethod(), responseObserver);
    }

    /**
     */
    default void listWallets(adamant.global.v1.ListWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWalletsMethod(), responseObserver);
    }

    /**
     */
    default void listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWalletsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listStakingWalletsByFilter(adamant.global.v1.ListStakingWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStakingWalletsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listNFTWalletsByFilter(adamant.global.v1.ListNFTWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNFTWalletsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBaseWalletsMethod(), responseObserver);
    }

    /**
     */
    default void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendableBalanceMethod(), responseObserver);
    }

    /**
     */
    default void initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeXRPWalletMethod(), responseObserver);
    }

    /**
     */
    default void initializeWallet(adamant.teller.v1.InitializeWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeWalletMethod(), responseObserver);
    }

    /**
     */
    default void updateDestinationWalletID(adamant.global.v1.UpdateDestinationWalletIDRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDestinationWalletIDMethod(), responseObserver);
    }

    /**
     */
    default void getCosmosBalance(adamant.global.v1.GetCosmosBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetCosmosBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCosmosBalanceMethod(), responseObserver);
    }

    /**
     */
    default void listCosmosDelegateHistories(adamant.global.v1.ListCosmosDelegateHistoriesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListCosmosDelegateHistoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCosmosDelegateHistoriesMethod(), responseObserver);
    }

    /**
     */
    default void listUTXOs(adamant.global.v1.ListUTXOsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListUTXOsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUTXOsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new address for an existing wallet
     * </pre>
     */
    default void createAddress(adamant.global.v1.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    default void createIOSTAccount(adamant.global.v1.CreateIOSTAccountRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateIOSTAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIOSTAccountMethod(), responseObserver);
    }

    /**
     */
    default void listSymbolChildAddresses(adamant.global.v1.ListSymbolChildAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListSymbolChildAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSymbolChildAddressesMethod(), responseObserver);
    }

    /**
     */
    default void getAddress(adamant.global.v1.GetAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    /**
     */
    default void getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByAddressMethod(), responseObserver);
    }

    /**
     */
    default void getAddressByAddressCoin(adamant.global.v1.GetAddressByAddressCoinRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByAddressCoinMethod(), responseObserver);
    }

    /**
     */
    default void getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByIndexMethod(), responseObserver);
    }

    /**
     */
    default void listAddresses(adamant.global.v1.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAddressesMethod(), responseObserver);
    }

    /**
     */
    default void importAddress(adamant.global.v1.ImportAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    default void getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEthereumFeeAddressMethod(), responseObserver);
    }

    /**
     */
    default void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAddressBalanceMethod(), responseObserver);
    }

    /**
     */
    default void listColdFeeDepositAddresses(adamant.teller.v1.ListColdFeeDepositAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.ListColdFeeDepositAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListColdFeeDepositAddressesMethod(), responseObserver);
    }

    /**
     */
    default void listHotFeeDepositAddresses(adamant.teller.v1.ListHotFeeDepositAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.ListHotFeeDepositAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHotFeeDepositAddressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PreTransaction
     * </pre>
     */
    default void createPreTransaction(adamant.global.v1.CreatePreTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreatePreTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePreTransactionMethod(), responseObserver);
    }

    /**
     */
    default void listPreTransactionsByFilter(adamant.global.v1.ListPreTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionsByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPreTransactionsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void cancelPreTransaction(adamant.global.v1.CancelPreTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelPreTransactionMethod(), responseObserver);
    }

    /**
     */
    default void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    default void createContractCreationTransaction(adamant.global.v1.CreateContractCreationTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateContractCreationTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateContractCreationTransactionMethod(), responseObserver);
    }

    /**
     */
    default void signTransaction(adamant.teller.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTransactionMethod(), responseObserver);
    }

    /**
     */
    default void sendTransaction(adamant.teller.v1.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     */
    default void resendTransaction(adamant.teller.v1.ResendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ResendTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendTransactionMethod(), responseObserver);
    }

    /**
     */
    default void cancelTransaction(adamant.global.v1.CancelTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTransactionMethod(), responseObserver);
    }

    /**
     */
    default void replaceTransaction(adamant.global.v1.ReplaceTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ReplaceTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceTransactionMethod(), responseObserver);
    }

    /**
     */
    default void isTransactionReplaceable(adamant.global.v1.IsTransactionReplaceableRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsTransactionReplaceableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsTransactionReplaceableMethod(), responseObserver);
    }

    /**
     */
    default void getTransaction(adamant.global.v1.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByTxIDMethod(), responseObserver);
    }

    /**
     */
    default void listTransactions(adamant.global.v1.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransactionsMethod(), responseObserver);
    }

    /**
     */
    default void listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransactionsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listUnconfirmedTransactionsByFilter(adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListUnconfirmedTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUnconfirmedTransactionsByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exit ethereum validators
     * </pre>
     */
    default void exitEthereumStakingValidators(adamant.global.v1.ExitEthereumStakingValidatorsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ExitEthereumStakingValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitEthereumStakingValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    default void listTransfers(adamant.global.v1.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransfersMethod(), responseObserver);
    }

    /**
     */
    default void listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransfersByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get rates by snapshot id
     * </pre>
     */
    default void getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    default void getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestRateSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    default void setRates(adamant.global.v1.SetRatesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRatesMethod(), responseObserver);
    }

    /**
     */
    default void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateFeeMethod(), responseObserver);
    }

    /**
     */
    default void getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecommendedFeeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    default void validateAddress(adamant.global.v1.ValidateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateAddressMethod(), responseObserver);
    }

    /**
     */
    default void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushBalanceMethod(), responseObserver);
    }

    /**
     */
    default void listAuditLogs(adamant.global.v1.ListAuditLogsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAuditLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuditLogsMethod(), responseObserver);
    }

    /**
     */
    default void listStakingHistoriesByFilter(adamant.global.v1.ListStakingHistoriesByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingHistoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStakingHistoriesByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listStakingValidatorsByFilter(adamant.global.v1.ListStakingValidatorsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStakingValidatorsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listNFTsByFilter(adamant.global.v1.ListNFTsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNFTsByFilterMethod(), responseObserver);
    }

    /**
     */
    default void signMessage(adamant.teller.v1.SignMessageRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.SignMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProgmatCoin
     * </pre>
     */
    default void progmatCoinInitialize(adamant.teller.v1.ProgmatCoinInitializeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinInitializeMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinConfigureMinter(adamant.teller.v1.ProgmatCoinConfigureMinterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinConfigureMinterMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinMintAndTransfer(adamant.teller.v1.ProgmatCoinMintAndTransferRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinMintAndTransferMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinMint(adamant.teller.v1.ProgmatCoinMintRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinMintMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinBurn(adamant.teller.v1.ProgmatCoinBurnRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinBurnMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinBulkAddToWhitelist(adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinBulkAddToWhitelistMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinBulkRemoveFromWhitelist(adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinBulkRemoveFromWhitelistMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinBulkAddToBlacklist(adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinBulkAddToBlacklistMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinBulkRemoveFromBlacklist(adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinBulkRemoveFromBlacklistMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinConfiscate(adamant.teller.v1.ProgmatCoinConfiscateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinConfiscateMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinPause(adamant.teller.v1.ProgmatCoinPauseRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinPauseMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinUnpause(adamant.teller.v1.ProgmatCoinUnpauseRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinUnpauseMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinGrantWhiteAndBlackLister(adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinGrantWhiteAndBlackListerMethod(), responseObserver);
    }

    /**
     */
    default void progmatCoinUpgradeToAndCall(adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgmatCoinUpgradeToAndCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * PreTransactionThreshold
     * </pre>
     */
    default void listPreTransactionThresholdsByFilter(adamant.global.v1.ListPreTransactionThresholdsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPreTransactionThresholdsByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlacklistAddress
     * </pre>
     */
    default void listBlacklistAddressesByFilter(adamant.global.v1.ListBlacklistAddressesByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressesByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBlacklistAddressesByFilterMethod(), responseObserver);
    }

    /**
     */
    default void listBlacklistAddressFiles(adamant.global.v1.ListBlacklistAddressFilesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBlacklistAddressFilesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TellerAPI.
   */
  public static abstract class TellerAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TellerAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TellerAPI.
   */
  public static final class TellerAPIStub
      extends io.grpc.stub.AbstractAsyncStub<TellerAPIStub> {
    private TellerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIStub(channel, callOptions);
    }

    /**
     */
    public void createWallet(adamant.teller.v1.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public void getWallet(adamant.global.v1.GetWalletRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWallets(adamant.global.v1.ListWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWalletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWalletsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listStakingWalletsByFilter(adamant.global.v1.ListStakingWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStakingWalletsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNFTWalletsByFilter(adamant.global.v1.ListNFTWalletsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNFTWalletsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBaseWalletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeXRPWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initializeWallet(adamant.teller.v1.InitializeWalletRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDestinationWalletID(adamant.global.v1.UpdateDestinationWalletIDRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDestinationWalletIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCosmosBalance(adamant.global.v1.GetCosmosBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetCosmosBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCosmosBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCosmosDelegateHistories(adamant.global.v1.ListCosmosDelegateHistoriesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListCosmosDelegateHistoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCosmosDelegateHistoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUTXOs(adamant.global.v1.ListUTXOsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListUTXOsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUTXOsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new address for an existing wallet
     * </pre>
     */
    public void createAddress(adamant.global.v1.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createIOSTAccount(adamant.global.v1.CreateIOSTAccountRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateIOSTAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIOSTAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSymbolChildAddresses(adamant.global.v1.ListSymbolChildAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListSymbolChildAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSymbolChildAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddress(adamant.global.v1.GetAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByAddressCoin(adamant.global.v1.GetAddressByAddressCoinRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByAddressCoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAddresses(adamant.global.v1.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void importAddress(adamant.global.v1.ImportAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public void getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEthereumFeeAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listColdFeeDepositAddresses(adamant.teller.v1.ListColdFeeDepositAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.ListColdFeeDepositAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListColdFeeDepositAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHotFeeDepositAddresses(adamant.teller.v1.ListHotFeeDepositAddressesRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.ListHotFeeDepositAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHotFeeDepositAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PreTransaction
     * </pre>
     */
    public void createPreTransaction(adamant.global.v1.CreatePreTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreatePreTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePreTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPreTransactionsByFilter(adamant.global.v1.ListPreTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionsByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPreTransactionsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelPreTransaction(adamant.global.v1.CancelPreTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelPreTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(adamant.global.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createContractCreationTransaction(adamant.global.v1.CreateContractCreationTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateContractCreationTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateContractCreationTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signTransaction(adamant.teller.v1.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendTransaction(adamant.teller.v1.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendTransaction(adamant.teller.v1.ResendTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ResendTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelTransaction(adamant.global.v1.CancelTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replaceTransaction(adamant.global.v1.ReplaceTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ReplaceTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isTransactionReplaceable(adamant.global.v1.IsTransactionReplaceableRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.IsTransactionReplaceableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsTransactionReplaceableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(adamant.global.v1.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionByTxIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransactions(adamant.global.v1.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransactionsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUnconfirmedTransactionsByFilter(adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListUnconfirmedTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUnconfirmedTransactionsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exit ethereum validators
     * </pre>
     */
    public void exitEthereumStakingValidators(adamant.global.v1.ExitEthereumStakingValidatorsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ExitEthereumStakingValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitEthereumStakingValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public void listTransfers(adamant.global.v1.ListTransfersRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransfersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransfersByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get rates by snapshot id
     * </pre>
     */
    public void getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public void getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestRateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public void setRates(adamant.global.v1.SetRatesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateFee(adamant.global.v1.CalculateFeeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecommendedFeeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public void validateAddress(adamant.global.v1.ValidateAddressRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flushBalance(adamant.global.v1.FlushBalanceRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAuditLogs(adamant.global.v1.ListAuditLogsRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListAuditLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuditLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listStakingHistoriesByFilter(adamant.global.v1.ListStakingHistoriesByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingHistoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStakingHistoriesByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listStakingValidatorsByFilter(adamant.global.v1.ListStakingValidatorsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStakingValidatorsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNFTsByFilter(adamant.global.v1.ListNFTsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNFTsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signMessage(adamant.teller.v1.SignMessageRequest request,
        io.grpc.stub.StreamObserver<adamant.teller.v1.SignMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProgmatCoin
     * </pre>
     */
    public void progmatCoinInitialize(adamant.teller.v1.ProgmatCoinInitializeRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinInitializeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinConfigureMinter(adamant.teller.v1.ProgmatCoinConfigureMinterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinConfigureMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinMintAndTransfer(adamant.teller.v1.ProgmatCoinMintAndTransferRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinMintAndTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinMint(adamant.teller.v1.ProgmatCoinMintRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinBurn(adamant.teller.v1.ProgmatCoinBurnRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinBulkAddToWhitelist(adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinBulkAddToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinBulkRemoveFromWhitelist(adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinBulkRemoveFromWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinBulkAddToBlacklist(adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinBulkAddToBlacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinBulkRemoveFromBlacklist(adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinBulkRemoveFromBlacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinConfiscate(adamant.teller.v1.ProgmatCoinConfiscateRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinConfiscateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinPause(adamant.teller.v1.ProgmatCoinPauseRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinUnpause(adamant.teller.v1.ProgmatCoinUnpauseRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinUnpauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinGrantWhiteAndBlackLister(adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinGrantWhiteAndBlackListerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void progmatCoinUpgradeToAndCall(adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgmatCoinUpgradeToAndCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PreTransactionThreshold
     * </pre>
     */
    public void listPreTransactionThresholdsByFilter(adamant.global.v1.ListPreTransactionThresholdsByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPreTransactionThresholdsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlacklistAddress
     * </pre>
     */
    public void listBlacklistAddressesByFilter(adamant.global.v1.ListBlacklistAddressesByFilterRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressesByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBlacklistAddressesByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBlacklistAddressFiles(adamant.global.v1.ListBlacklistAddressFilesRequest request,
        io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBlacklistAddressFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TellerAPI.
   */
  public static final class TellerAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TellerAPIBlockingStub> {
    private TellerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public adamant.global.v1.CreateWalletResponse createWallet(adamant.teller.v1.CreateWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWalletMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public adamant.global.v1.Model.Wallet getWallet(adamant.global.v1.GetWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListWalletsResponse listWallets(adamant.global.v1.ListWalletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWalletsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListWalletsResponse listWalletsByFilter(adamant.global.v1.ListWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWalletsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListStakingWalletsResponse listStakingWalletsByFilter(adamant.global.v1.ListStakingWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStakingWalletsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListNFTWalletsResponse listNFTWalletsByFilter(adamant.global.v1.ListNFTWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNFTWalletsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListBaseWalletsResponse listBaseWallets(adamant.global.v1.ListBaseWalletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBaseWalletsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.GetSpendableBalanceResponse getSpendableBalance(adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendableBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty initializeXRPWallet(adamant.teller.v1.InitializeXRPWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeXRPWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty initializeWallet(adamant.teller.v1.InitializeWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeWalletMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateDestinationWalletID(adamant.global.v1.UpdateDestinationWalletIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDestinationWalletIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.GetCosmosBalanceResponse getCosmosBalance(adamant.global.v1.GetCosmosBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCosmosBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListCosmosDelegateHistoriesResponse listCosmosDelegateHistories(adamant.global.v1.ListCosmosDelegateHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCosmosDelegateHistoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListUTXOsResponse listUTXOs(adamant.global.v1.ListUTXOsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUTXOsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new address for an existing wallet
     * </pre>
     */
    public adamant.global.v1.CreateAddressResponse createAddress(adamant.global.v1.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateIOSTAccountResponse createIOSTAccount(adamant.global.v1.CreateIOSTAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIOSTAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListSymbolChildAddressesResponse listSymbolChildAddresses(adamant.global.v1.ListSymbolChildAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSymbolChildAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddress(adamant.global.v1.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddressByAddress(adamant.global.v1.GetAddressByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddressByAddressCoin(adamant.global.v1.GetAddressByAddressCoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByAddressCoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Address getAddressByIndex(adamant.global.v1.GetAddressByIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListAddressesResponse listAddresses(adamant.global.v1.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty importAddress(adamant.global.v1.ImportAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public adamant.global.v1.Model.EthereumFeeAddress getEthereumFeeAddress(adamant.global.v1.GetEthereumFeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEthereumFeeAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAddressBalance(adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAddressBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.teller.v1.ListColdFeeDepositAddressesResponse listColdFeeDepositAddresses(adamant.teller.v1.ListColdFeeDepositAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListColdFeeDepositAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.teller.v1.ListHotFeeDepositAddressesResponse listHotFeeDepositAddresses(adamant.teller.v1.ListHotFeeDepositAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHotFeeDepositAddressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PreTransaction
     * </pre>
     */
    public adamant.global.v1.CreatePreTransactionResponse createPreTransaction(adamant.global.v1.CreatePreTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePreTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListPreTransactionsByFilterResponse listPreTransactionsByFilter(adamant.global.v1.ListPreTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPreTransactionsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelPreTransaction(adamant.global.v1.CancelPreTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelPreTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse createTransaction(adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateContractCreationTransactionResponse createContractCreationTransaction(adamant.global.v1.CreateContractCreationTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateContractCreationTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty signTransaction(adamant.teller.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.SendTransactionResponse sendTransaction(adamant.teller.v1.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ResendTransactionResponse resendTransaction(adamant.teller.v1.ResendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelTransaction(adamant.global.v1.CancelTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ReplaceTransactionResponse replaceTransaction(adamant.global.v1.ReplaceTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.IsTransactionReplaceableResponse isTransactionReplaceable(adamant.global.v1.IsTransactionReplaceableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsTransactionReplaceableMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Transaction getTransaction(adamant.global.v1.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.Model.Transaction getTransactionByTxID(adamant.global.v1.GetTransactionByTxIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByTxIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransactionsResponse listTransactions(adamant.global.v1.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransactionsResponse listTransactionsByFilter(adamant.global.v1.ListTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransactionsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListUnconfirmedTransactionsResponse listUnconfirmedTransactionsByFilter(adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUnconfirmedTransactionsByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exit ethereum validators
     * </pre>
     */
    public adamant.global.v1.ExitEthereumStakingValidatorsResponse exitEthereumStakingValidators(adamant.global.v1.ExitEthereumStakingValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitEthereumStakingValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public adamant.global.v1.ListTransfersResponse listTransfers(adamant.global.v1.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransfersMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListTransfersResponse listTransfersByFilter(adamant.global.v1.ListTransfersByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransfersByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get rates by snapshot id
     * </pre>
     */
    public adamant.global.v1.Model.RateSnapshot getRateSnapshot(adamant.global.v1.GetRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public adamant.global.v1.Model.RateSnapshot getLatestRateSnapshot(adamant.global.v1.GetLatestRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestRateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public adamant.global.v1.SetRatesResponse setRates(adamant.global.v1.SetRatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CalculateFeeResponse calculateFee(adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.GetRecommendedFeeRateResponse getRecommendedFeeRate(adamant.global.v1.GetRecommendedFeeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecommendedFeeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public adamant.global.v1.ValidateAddressResponse validateAddress(adamant.global.v1.ValidateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.FlushBalanceResponse flushBalance(adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListAuditLogsResponse listAuditLogs(adamant.global.v1.ListAuditLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuditLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListStakingHistoriesResponse listStakingHistoriesByFilter(adamant.global.v1.ListStakingHistoriesByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStakingHistoriesByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListStakingValidatorsResponse listStakingValidatorsByFilter(adamant.global.v1.ListStakingValidatorsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStakingValidatorsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListNFTsResponse listNFTsByFilter(adamant.global.v1.ListNFTsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNFTsByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.teller.v1.SignMessageResponse signMessage(adamant.teller.v1.SignMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProgmatCoin
     * </pre>
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinInitialize(adamant.teller.v1.ProgmatCoinInitializeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinInitializeMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinConfigureMinter(adamant.teller.v1.ProgmatCoinConfigureMinterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinConfigureMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinMintAndTransfer(adamant.teller.v1.ProgmatCoinMintAndTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinMintAndTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinMint(adamant.teller.v1.ProgmatCoinMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinBurn(adamant.teller.v1.ProgmatCoinBurnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinBulkAddToWhitelist(adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinBulkAddToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinBulkRemoveFromWhitelist(adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinBulkRemoveFromWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinBulkAddToBlacklist(adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinBulkAddToBlacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinBulkRemoveFromBlacklist(adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinBulkRemoveFromBlacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinConfiscate(adamant.teller.v1.ProgmatCoinConfiscateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinConfiscateMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinPause(adamant.teller.v1.ProgmatCoinPauseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinUnpause(adamant.teller.v1.ProgmatCoinUnpauseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinUnpauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinGrantWhiteAndBlackLister(adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinGrantWhiteAndBlackListerMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.CreateTransactionResponse progmatCoinUpgradeToAndCall(adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgmatCoinUpgradeToAndCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PreTransactionThreshold
     * </pre>
     */
    public adamant.global.v1.ListPreTransactionThresholdsByFilterResponse listPreTransactionThresholdsByFilter(adamant.global.v1.ListPreTransactionThresholdsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPreTransactionThresholdsByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlacklistAddress
     * </pre>
     */
    public adamant.global.v1.ListBlacklistAddressesByFilterResponse listBlacklistAddressesByFilter(adamant.global.v1.ListBlacklistAddressesByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBlacklistAddressesByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public adamant.global.v1.ListBlacklistAddressFilesResponse listBlacklistAddressFiles(adamant.global.v1.ListBlacklistAddressFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBlacklistAddressFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TellerAPI.
   */
  public static final class TellerAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<TellerAPIFutureStub> {
    private TellerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TellerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TellerAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateWalletResponse> createWallet(
        adamant.teller.v1.CreateWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWalletMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get wallet information. the wallet model includes balance, address etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Wallet> getWallet(
        adamant.global.v1.GetWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListWalletsResponse> listWallets(
        adamant.global.v1.ListWalletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWalletsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListWalletsResponse> listWalletsByFilter(
        adamant.global.v1.ListWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWalletsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListStakingWalletsResponse> listStakingWalletsByFilter(
        adamant.global.v1.ListStakingWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStakingWalletsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListNFTWalletsResponse> listNFTWalletsByFilter(
        adamant.global.v1.ListNFTWalletsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNFTWalletsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListBaseWalletsResponse> listBaseWallets(
        adamant.global.v1.ListBaseWalletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBaseWalletsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetSpendableBalanceResponse> getSpendableBalance(
        adamant.global.v1.GetSpendableBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendableBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> initializeXRPWallet(
        adamant.teller.v1.InitializeXRPWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeXRPWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> initializeWallet(
        adamant.teller.v1.InitializeWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeWalletMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDestinationWalletID(
        adamant.global.v1.UpdateDestinationWalletIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDestinationWalletIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetCosmosBalanceResponse> getCosmosBalance(
        adamant.global.v1.GetCosmosBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCosmosBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListCosmosDelegateHistoriesResponse> listCosmosDelegateHistories(
        adamant.global.v1.ListCosmosDelegateHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCosmosDelegateHistoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListUTXOsResponse> listUTXOs(
        adamant.global.v1.ListUTXOsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUTXOsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new address for an existing wallet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateAddressResponse> createAddress(
        adamant.global.v1.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateIOSTAccountResponse> createIOSTAccount(
        adamant.global.v1.CreateIOSTAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIOSTAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListSymbolChildAddressesResponse> listSymbolChildAddresses(
        adamant.global.v1.ListSymbolChildAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSymbolChildAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddress(
        adamant.global.v1.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddressByAddress(
        adamant.global.v1.GetAddressByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddressByAddressCoin(
        adamant.global.v1.GetAddressByAddressCoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByAddressCoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Address> getAddressByIndex(
        adamant.global.v1.GetAddressByIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListAddressesResponse> listAddresses(
        adamant.global.v1.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> importAddress(
        adamant.global.v1.ImportAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an address which hold ETH for ethereum wallet/address creation etc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.EthereumFeeAddress> getEthereumFeeAddress(
        adamant.global.v1.GetEthereumFeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEthereumFeeAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAddressBalance(
        adamant.global.v1.UpdateAddressBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAddressBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.teller.v1.ListColdFeeDepositAddressesResponse> listColdFeeDepositAddresses(
        adamant.teller.v1.ListColdFeeDepositAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListColdFeeDepositAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.teller.v1.ListHotFeeDepositAddressesResponse> listHotFeeDepositAddresses(
        adamant.teller.v1.ListHotFeeDepositAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHotFeeDepositAddressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PreTransaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreatePreTransactionResponse> createPreTransaction(
        adamant.global.v1.CreatePreTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePreTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListPreTransactionsByFilterResponse> listPreTransactionsByFilter(
        adamant.global.v1.ListPreTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPreTransactionsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelPreTransaction(
        adamant.global.v1.CancelPreTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelPreTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> createTransaction(
        adamant.global.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateContractCreationTransactionResponse> createContractCreationTransaction(
        adamant.global.v1.CreateContractCreationTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateContractCreationTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> signTransaction(
        adamant.teller.v1.SignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.SendTransactionResponse> sendTransaction(
        adamant.teller.v1.SendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ResendTransactionResponse> resendTransaction(
        adamant.teller.v1.ResendTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelTransaction(
        adamant.global.v1.CancelTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ReplaceTransactionResponse> replaceTransaction(
        adamant.global.v1.ReplaceTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.IsTransactionReplaceableResponse> isTransactionReplaceable(
        adamant.global.v1.IsTransactionReplaceableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsTransactionReplaceableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Transaction> getTransaction(
        adamant.global.v1.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.Transaction> getTransactionByTxID(
        adamant.global.v1.GetTransactionByTxIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionByTxIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransactionsResponse> listTransactions(
        adamant.global.v1.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransactionsResponse> listTransactionsByFilter(
        adamant.global.v1.ListTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransactionsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListUnconfirmedTransactionsResponse> listUnconfirmedTransactionsByFilter(
        adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUnconfirmedTransactionsByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exit ethereum validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ExitEthereumStakingValidatorsResponse> exitEthereumStakingValidators(
        adamant.global.v1.ExitEthereumStakingValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitEthereumStakingValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List transfers for a given wallet. Ordered by update time desc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransfersResponse> listTransfers(
        adamant.global.v1.ListTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransfersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListTransfersResponse> listTransfersByFilter(
        adamant.global.v1.ListTransfersByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransfersByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get rates by snapshot id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.RateSnapshot> getRateSnapshot(
        adamant.global.v1.GetRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get latest rates set to your organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.Model.RateSnapshot> getLatestRateSnapshot(
        adamant.global.v1.GetLatestRateSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestRateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rates to your organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.SetRatesResponse> setRates(
        adamant.global.v1.SetRatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CalculateFeeResponse> calculateFee(
        adamant.global.v1.CalculateFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.GetRecommendedFeeRateResponse> getRecommendedFeeRate(
        adamant.global.v1.GetRecommendedFeeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecommendedFeeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate format of given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ValidateAddressResponse> validateAddress(
        adamant.global.v1.ValidateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.FlushBalanceResponse> flushBalance(
        adamant.global.v1.FlushBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListAuditLogsResponse> listAuditLogs(
        adamant.global.v1.ListAuditLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuditLogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListStakingHistoriesResponse> listStakingHistoriesByFilter(
        adamant.global.v1.ListStakingHistoriesByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStakingHistoriesByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListStakingValidatorsResponse> listStakingValidatorsByFilter(
        adamant.global.v1.ListStakingValidatorsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStakingValidatorsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListNFTsResponse> listNFTsByFilter(
        adamant.global.v1.ListNFTsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNFTsByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.teller.v1.SignMessageResponse> signMessage(
        adamant.teller.v1.SignMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProgmatCoin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinInitialize(
        adamant.teller.v1.ProgmatCoinInitializeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinInitializeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinConfigureMinter(
        adamant.teller.v1.ProgmatCoinConfigureMinterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinConfigureMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinMintAndTransfer(
        adamant.teller.v1.ProgmatCoinMintAndTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinMintAndTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinMint(
        adamant.teller.v1.ProgmatCoinMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinBurn(
        adamant.teller.v1.ProgmatCoinBurnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinBulkAddToWhitelist(
        adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinBulkAddToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinBulkRemoveFromWhitelist(
        adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinBulkRemoveFromWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinBulkAddToBlacklist(
        adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinBulkAddToBlacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinBulkRemoveFromBlacklist(
        adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinBulkRemoveFromBlacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinConfiscate(
        adamant.teller.v1.ProgmatCoinConfiscateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinConfiscateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinPause(
        adamant.teller.v1.ProgmatCoinPauseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinUnpause(
        adamant.teller.v1.ProgmatCoinUnpauseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinUnpauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinGrantWhiteAndBlackLister(
        adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinGrantWhiteAndBlackListerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.CreateTransactionResponse> progmatCoinUpgradeToAndCall(
        adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgmatCoinUpgradeToAndCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PreTransactionThreshold
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListPreTransactionThresholdsByFilterResponse> listPreTransactionThresholdsByFilter(
        adamant.global.v1.ListPreTransactionThresholdsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPreTransactionThresholdsByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlacklistAddress
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListBlacklistAddressesByFilterResponse> listBlacklistAddressesByFilter(
        adamant.global.v1.ListBlacklistAddressesByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBlacklistAddressesByFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.global.v1.ListBlacklistAddressFilesResponse> listBlacklistAddressFiles(
        adamant.global.v1.ListBlacklistAddressFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBlacklistAddressFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WALLET = 0;
  private static final int METHODID_GET_WALLET = 1;
  private static final int METHODID_LIST_WALLETS = 2;
  private static final int METHODID_LIST_WALLETS_BY_FILTER = 3;
  private static final int METHODID_LIST_STAKING_WALLETS_BY_FILTER = 4;
  private static final int METHODID_LIST_NFTWALLETS_BY_FILTER = 5;
  private static final int METHODID_LIST_BASE_WALLETS = 6;
  private static final int METHODID_GET_SPENDABLE_BALANCE = 7;
  private static final int METHODID_INITIALIZE_XRPWALLET = 8;
  private static final int METHODID_INITIALIZE_WALLET = 9;
  private static final int METHODID_UPDATE_DESTINATION_WALLET_ID = 10;
  private static final int METHODID_GET_COSMOS_BALANCE = 11;
  private static final int METHODID_LIST_COSMOS_DELEGATE_HISTORIES = 12;
  private static final int METHODID_LIST_UTXOS = 13;
  private static final int METHODID_CREATE_ADDRESS = 14;
  private static final int METHODID_CREATE_IOSTACCOUNT = 15;
  private static final int METHODID_LIST_SYMBOL_CHILD_ADDRESSES = 16;
  private static final int METHODID_GET_ADDRESS = 17;
  private static final int METHODID_GET_ADDRESS_BY_ADDRESS = 18;
  private static final int METHODID_GET_ADDRESS_BY_ADDRESS_COIN = 19;
  private static final int METHODID_GET_ADDRESS_BY_INDEX = 20;
  private static final int METHODID_LIST_ADDRESSES = 21;
  private static final int METHODID_IMPORT_ADDRESS = 22;
  private static final int METHODID_GET_ETHEREUM_FEE_ADDRESS = 23;
  private static final int METHODID_UPDATE_ADDRESS_BALANCE = 24;
  private static final int METHODID_LIST_COLD_FEE_DEPOSIT_ADDRESSES = 25;
  private static final int METHODID_LIST_HOT_FEE_DEPOSIT_ADDRESSES = 26;
  private static final int METHODID_CREATE_PRE_TRANSACTION = 27;
  private static final int METHODID_LIST_PRE_TRANSACTIONS_BY_FILTER = 28;
  private static final int METHODID_CANCEL_PRE_TRANSACTION = 29;
  private static final int METHODID_CREATE_TRANSACTION = 30;
  private static final int METHODID_CREATE_CONTRACT_CREATION_TRANSACTION = 31;
  private static final int METHODID_SIGN_TRANSACTION = 32;
  private static final int METHODID_SEND_TRANSACTION = 33;
  private static final int METHODID_RESEND_TRANSACTION = 34;
  private static final int METHODID_CANCEL_TRANSACTION = 35;
  private static final int METHODID_REPLACE_TRANSACTION = 36;
  private static final int METHODID_IS_TRANSACTION_REPLACEABLE = 37;
  private static final int METHODID_GET_TRANSACTION = 38;
  private static final int METHODID_GET_TRANSACTION_BY_TX_ID = 39;
  private static final int METHODID_LIST_TRANSACTIONS = 40;
  private static final int METHODID_LIST_TRANSACTIONS_BY_FILTER = 41;
  private static final int METHODID_LIST_UNCONFIRMED_TRANSACTIONS_BY_FILTER = 42;
  private static final int METHODID_EXIT_ETHEREUM_STAKING_VALIDATORS = 43;
  private static final int METHODID_LIST_TRANSFERS = 44;
  private static final int METHODID_LIST_TRANSFERS_BY_FILTER = 45;
  private static final int METHODID_GET_RATE_SNAPSHOT = 46;
  private static final int METHODID_GET_LATEST_RATE_SNAPSHOT = 47;
  private static final int METHODID_SET_RATES = 48;
  private static final int METHODID_CALCULATE_FEE = 49;
  private static final int METHODID_GET_RECOMMENDED_FEE_RATE = 50;
  private static final int METHODID_VALIDATE_ADDRESS = 51;
  private static final int METHODID_FLUSH_BALANCE = 52;
  private static final int METHODID_LIST_AUDIT_LOGS = 53;
  private static final int METHODID_LIST_STAKING_HISTORIES_BY_FILTER = 54;
  private static final int METHODID_LIST_STAKING_VALIDATORS_BY_FILTER = 55;
  private static final int METHODID_LIST_NFTS_BY_FILTER = 56;
  private static final int METHODID_SIGN_MESSAGE = 57;
  private static final int METHODID_PROGMAT_COIN_INITIALIZE = 58;
  private static final int METHODID_PROGMAT_COIN_CONFIGURE_MINTER = 59;
  private static final int METHODID_PROGMAT_COIN_MINT_AND_TRANSFER = 60;
  private static final int METHODID_PROGMAT_COIN_MINT = 61;
  private static final int METHODID_PROGMAT_COIN_BURN = 62;
  private static final int METHODID_PROGMAT_COIN_BULK_ADD_TO_WHITELIST = 63;
  private static final int METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_WHITELIST = 64;
  private static final int METHODID_PROGMAT_COIN_BULK_ADD_TO_BLACKLIST = 65;
  private static final int METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_BLACKLIST = 66;
  private static final int METHODID_PROGMAT_COIN_CONFISCATE = 67;
  private static final int METHODID_PROGMAT_COIN_PAUSE = 68;
  private static final int METHODID_PROGMAT_COIN_UNPAUSE = 69;
  private static final int METHODID_PROGMAT_COIN_GRANT_WHITE_AND_BLACK_LISTER = 70;
  private static final int METHODID_PROGMAT_COIN_UPGRADE_TO_AND_CALL = 71;
  private static final int METHODID_LIST_PRE_TRANSACTION_THRESHOLDS_BY_FILTER = 72;
  private static final int METHODID_LIST_BLACKLIST_ADDRESSES_BY_FILTER = 73;
  private static final int METHODID_LIST_BLACKLIST_ADDRESS_FILES = 74;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((adamant.teller.v1.CreateWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateWalletResponse>) responseObserver);
          break;
        case METHODID_GET_WALLET:
          serviceImpl.getWallet((adamant.global.v1.GetWalletRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Wallet>) responseObserver);
          break;
        case METHODID_LIST_WALLETS:
          serviceImpl.listWallets((adamant.global.v1.ListWalletsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_WALLETS_BY_FILTER:
          serviceImpl.listWalletsByFilter((adamant.global.v1.ListWalletsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_STAKING_WALLETS_BY_FILTER:
          serviceImpl.listStakingWalletsByFilter((adamant.global.v1.ListStakingWalletsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_NFTWALLETS_BY_FILTER:
          serviceImpl.listNFTWalletsByFilter((adamant.global.v1.ListNFTWalletsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTWalletsResponse>) responseObserver);
          break;
        case METHODID_LIST_BASE_WALLETS:
          serviceImpl.listBaseWallets((adamant.global.v1.ListBaseWalletsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListBaseWalletsResponse>) responseObserver);
          break;
        case METHODID_GET_SPENDABLE_BALANCE:
          serviceImpl.getSpendableBalance((adamant.global.v1.GetSpendableBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetSpendableBalanceResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_XRPWALLET:
          serviceImpl.initializeXRPWallet((adamant.teller.v1.InitializeXRPWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INITIALIZE_WALLET:
          serviceImpl.initializeWallet((adamant.teller.v1.InitializeWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DESTINATION_WALLET_ID:
          serviceImpl.updateDestinationWalletID((adamant.global.v1.UpdateDestinationWalletIDRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_COSMOS_BALANCE:
          serviceImpl.getCosmosBalance((adamant.global.v1.GetCosmosBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetCosmosBalanceResponse>) responseObserver);
          break;
        case METHODID_LIST_COSMOS_DELEGATE_HISTORIES:
          serviceImpl.listCosmosDelegateHistories((adamant.global.v1.ListCosmosDelegateHistoriesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListCosmosDelegateHistoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_UTXOS:
          serviceImpl.listUTXOs((adamant.global.v1.ListUTXOsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListUTXOsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((adamant.global.v1.CreateAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateAddressResponse>) responseObserver);
          break;
        case METHODID_CREATE_IOSTACCOUNT:
          serviceImpl.createIOSTAccount((adamant.global.v1.CreateIOSTAccountRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateIOSTAccountResponse>) responseObserver);
          break;
        case METHODID_LIST_SYMBOL_CHILD_ADDRESSES:
          serviceImpl.listSymbolChildAddresses((adamant.global.v1.ListSymbolChildAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListSymbolChildAddressesResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((adamant.global.v1.GetAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_ADDRESS:
          serviceImpl.getAddressByAddress((adamant.global.v1.GetAddressByAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_ADDRESS_COIN:
          serviceImpl.getAddressByAddressCoin((adamant.global.v1.GetAddressByAddressCoinRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_INDEX:
          serviceImpl.getAddressByIndex((adamant.global.v1.GetAddressByIndexRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Address>) responseObserver);
          break;
        case METHODID_LIST_ADDRESSES:
          serviceImpl.listAddresses((adamant.global.v1.ListAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListAddressesResponse>) responseObserver);
          break;
        case METHODID_IMPORT_ADDRESS:
          serviceImpl.importAddress((adamant.global.v1.ImportAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ETHEREUM_FEE_ADDRESS:
          serviceImpl.getEthereumFeeAddress((adamant.global.v1.GetEthereumFeeAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.EthereumFeeAddress>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS_BALANCE:
          serviceImpl.updateAddressBalance((adamant.global.v1.UpdateAddressBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COLD_FEE_DEPOSIT_ADDRESSES:
          serviceImpl.listColdFeeDepositAddresses((adamant.teller.v1.ListColdFeeDepositAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.teller.v1.ListColdFeeDepositAddressesResponse>) responseObserver);
          break;
        case METHODID_LIST_HOT_FEE_DEPOSIT_ADDRESSES:
          serviceImpl.listHotFeeDepositAddresses((adamant.teller.v1.ListHotFeeDepositAddressesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.teller.v1.ListHotFeeDepositAddressesResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRE_TRANSACTION:
          serviceImpl.createPreTransaction((adamant.global.v1.CreatePreTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreatePreTransactionResponse>) responseObserver);
          break;
        case METHODID_LIST_PRE_TRANSACTIONS_BY_FILTER:
          serviceImpl.listPreTransactionsByFilter((adamant.global.v1.ListPreTransactionsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionsByFilterResponse>) responseObserver);
          break;
        case METHODID_CANCEL_PRE_TRANSACTION:
          serviceImpl.cancelPreTransaction((adamant.global.v1.CancelPreTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((adamant.global.v1.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONTRACT_CREATION_TRANSACTION:
          serviceImpl.createContractCreationTransaction((adamant.global.v1.CreateContractCreationTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateContractCreationTransactionResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION:
          serviceImpl.signTransaction((adamant.teller.v1.SignTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((adamant.teller.v1.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_RESEND_TRANSACTION:
          serviceImpl.resendTransaction((adamant.teller.v1.ResendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ResendTransactionResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TRANSACTION:
          serviceImpl.cancelTransaction((adamant.global.v1.CancelTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REPLACE_TRANSACTION:
          serviceImpl.replaceTransaction((adamant.global.v1.ReplaceTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ReplaceTransactionResponse>) responseObserver);
          break;
        case METHODID_IS_TRANSACTION_REPLACEABLE:
          serviceImpl.isTransactionReplaceable((adamant.global.v1.IsTransactionReplaceableRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.IsTransactionReplaceableResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((adamant.global.v1.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_TX_ID:
          serviceImpl.getTransactionByTxID((adamant.global.v1.GetTransactionByTxIDRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.Transaction>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTIONS:
          serviceImpl.listTransactions((adamant.global.v1.ListTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTIONS_BY_FILTER:
          serviceImpl.listTransactionsByFilter((adamant.global.v1.ListTransactionsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransactionsResponse>) responseObserver);
          break;
        case METHODID_LIST_UNCONFIRMED_TRANSACTIONS_BY_FILTER:
          serviceImpl.listUnconfirmedTransactionsByFilter((adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListUnconfirmedTransactionsResponse>) responseObserver);
          break;
        case METHODID_EXIT_ETHEREUM_STAKING_VALIDATORS:
          serviceImpl.exitEthereumStakingValidators((adamant.global.v1.ExitEthereumStakingValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ExitEthereumStakingValidatorsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSFERS:
          serviceImpl.listTransfers((adamant.global.v1.ListTransfersRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSFERS_BY_FILTER:
          serviceImpl.listTransfersByFilter((adamant.global.v1.ListTransfersByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListTransfersResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_SNAPSHOT:
          serviceImpl.getRateSnapshot((adamant.global.v1.GetRateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot>) responseObserver);
          break;
        case METHODID_GET_LATEST_RATE_SNAPSHOT:
          serviceImpl.getLatestRateSnapshot((adamant.global.v1.GetLatestRateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.Model.RateSnapshot>) responseObserver);
          break;
        case METHODID_SET_RATES:
          serviceImpl.setRates((adamant.global.v1.SetRatesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.SetRatesResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_FEE:
          serviceImpl.calculateFee((adamant.global.v1.CalculateFeeRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CalculateFeeResponse>) responseObserver);
          break;
        case METHODID_GET_RECOMMENDED_FEE_RATE:
          serviceImpl.getRecommendedFeeRate((adamant.global.v1.GetRecommendedFeeRateRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.GetRecommendedFeeRateResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_ADDRESS:
          serviceImpl.validateAddress((adamant.global.v1.ValidateAddressRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ValidateAddressResponse>) responseObserver);
          break;
        case METHODID_FLUSH_BALANCE:
          serviceImpl.flushBalance((adamant.global.v1.FlushBalanceRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.FlushBalanceResponse>) responseObserver);
          break;
        case METHODID_LIST_AUDIT_LOGS:
          serviceImpl.listAuditLogs((adamant.global.v1.ListAuditLogsRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListAuditLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_STAKING_HISTORIES_BY_FILTER:
          serviceImpl.listStakingHistoriesByFilter((adamant.global.v1.ListStakingHistoriesByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingHistoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_STAKING_VALIDATORS_BY_FILTER:
          serviceImpl.listStakingValidatorsByFilter((adamant.global.v1.ListStakingValidatorsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListStakingValidatorsResponse>) responseObserver);
          break;
        case METHODID_LIST_NFTS_BY_FILTER:
          serviceImpl.listNFTsByFilter((adamant.global.v1.ListNFTsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListNFTsResponse>) responseObserver);
          break;
        case METHODID_SIGN_MESSAGE:
          serviceImpl.signMessage((adamant.teller.v1.SignMessageRequest) request,
              (io.grpc.stub.StreamObserver<adamant.teller.v1.SignMessageResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_INITIALIZE:
          serviceImpl.progmatCoinInitialize((adamant.teller.v1.ProgmatCoinInitializeRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_CONFIGURE_MINTER:
          serviceImpl.progmatCoinConfigureMinter((adamant.teller.v1.ProgmatCoinConfigureMinterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_MINT_AND_TRANSFER:
          serviceImpl.progmatCoinMintAndTransfer((adamant.teller.v1.ProgmatCoinMintAndTransferRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_MINT:
          serviceImpl.progmatCoinMint((adamant.teller.v1.ProgmatCoinMintRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_BURN:
          serviceImpl.progmatCoinBurn((adamant.teller.v1.ProgmatCoinBurnRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_BULK_ADD_TO_WHITELIST:
          serviceImpl.progmatCoinBulkAddToWhitelist((adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_WHITELIST:
          serviceImpl.progmatCoinBulkRemoveFromWhitelist((adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_BULK_ADD_TO_BLACKLIST:
          serviceImpl.progmatCoinBulkAddToBlacklist((adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_BLACKLIST:
          serviceImpl.progmatCoinBulkRemoveFromBlacklist((adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_CONFISCATE:
          serviceImpl.progmatCoinConfiscate((adamant.teller.v1.ProgmatCoinConfiscateRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_PAUSE:
          serviceImpl.progmatCoinPause((adamant.teller.v1.ProgmatCoinPauseRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_UNPAUSE:
          serviceImpl.progmatCoinUnpause((adamant.teller.v1.ProgmatCoinUnpauseRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_GRANT_WHITE_AND_BLACK_LISTER:
          serviceImpl.progmatCoinGrantWhiteAndBlackLister((adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_PROGMAT_COIN_UPGRADE_TO_AND_CALL:
          serviceImpl.progmatCoinUpgradeToAndCall((adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_LIST_PRE_TRANSACTION_THRESHOLDS_BY_FILTER:
          serviceImpl.listPreTransactionThresholdsByFilter((adamant.global.v1.ListPreTransactionThresholdsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListPreTransactionThresholdsByFilterResponse>) responseObserver);
          break;
        case METHODID_LIST_BLACKLIST_ADDRESSES_BY_FILTER:
          serviceImpl.listBlacklistAddressesByFilter((adamant.global.v1.ListBlacklistAddressesByFilterRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressesByFilterResponse>) responseObserver);
          break;
        case METHODID_LIST_BLACKLIST_ADDRESS_FILES:
          serviceImpl.listBlacklistAddressFiles((adamant.global.v1.ListBlacklistAddressFilesRequest) request,
              (io.grpc.stub.StreamObserver<adamant.global.v1.ListBlacklistAddressFilesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.CreateWalletRequest,
              adamant.global.v1.CreateWalletResponse>(
                service, METHODID_CREATE_WALLET)))
        .addMethod(
          getGetWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetWalletRequest,
              adamant.global.v1.Model.Wallet>(
                service, METHODID_GET_WALLET)))
        .addMethod(
          getListWalletsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListWalletsRequest,
              adamant.global.v1.ListWalletsResponse>(
                service, METHODID_LIST_WALLETS)))
        .addMethod(
          getListWalletsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListWalletsByFilterRequest,
              adamant.global.v1.ListWalletsResponse>(
                service, METHODID_LIST_WALLETS_BY_FILTER)))
        .addMethod(
          getListStakingWalletsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListStakingWalletsByFilterRequest,
              adamant.global.v1.ListStakingWalletsResponse>(
                service, METHODID_LIST_STAKING_WALLETS_BY_FILTER)))
        .addMethod(
          getListNFTWalletsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListNFTWalletsByFilterRequest,
              adamant.global.v1.ListNFTWalletsResponse>(
                service, METHODID_LIST_NFTWALLETS_BY_FILTER)))
        .addMethod(
          getListBaseWalletsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListBaseWalletsRequest,
              adamant.global.v1.ListBaseWalletsResponse>(
                service, METHODID_LIST_BASE_WALLETS)))
        .addMethod(
          getGetSpendableBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetSpendableBalanceRequest,
              adamant.global.v1.GetSpendableBalanceResponse>(
                service, METHODID_GET_SPENDABLE_BALANCE)))
        .addMethod(
          getInitializeXRPWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.InitializeXRPWalletRequest,
              com.google.protobuf.Empty>(
                service, METHODID_INITIALIZE_XRPWALLET)))
        .addMethod(
          getInitializeWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.InitializeWalletRequest,
              com.google.protobuf.Empty>(
                service, METHODID_INITIALIZE_WALLET)))
        .addMethod(
          getUpdateDestinationWalletIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.UpdateDestinationWalletIDRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_DESTINATION_WALLET_ID)))
        .addMethod(
          getGetCosmosBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetCosmosBalanceRequest,
              adamant.global.v1.GetCosmosBalanceResponse>(
                service, METHODID_GET_COSMOS_BALANCE)))
        .addMethod(
          getListCosmosDelegateHistoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListCosmosDelegateHistoriesRequest,
              adamant.global.v1.ListCosmosDelegateHistoriesResponse>(
                service, METHODID_LIST_COSMOS_DELEGATE_HISTORIES)))
        .addMethod(
          getListUTXOsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListUTXOsRequest,
              adamant.global.v1.ListUTXOsResponse>(
                service, METHODID_LIST_UTXOS)))
        .addMethod(
          getCreateAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CreateAddressRequest,
              adamant.global.v1.CreateAddressResponse>(
                service, METHODID_CREATE_ADDRESS)))
        .addMethod(
          getCreateIOSTAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CreateIOSTAccountRequest,
              adamant.global.v1.CreateIOSTAccountResponse>(
                service, METHODID_CREATE_IOSTACCOUNT)))
        .addMethod(
          getListSymbolChildAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListSymbolChildAddressesRequest,
              adamant.global.v1.ListSymbolChildAddressesResponse>(
                service, METHODID_LIST_SYMBOL_CHILD_ADDRESSES)))
        .addMethod(
          getGetAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetAddressRequest,
              adamant.global.v1.Model.Address>(
                service, METHODID_GET_ADDRESS)))
        .addMethod(
          getGetAddressByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetAddressByAddressRequest,
              adamant.global.v1.Model.Address>(
                service, METHODID_GET_ADDRESS_BY_ADDRESS)))
        .addMethod(
          getGetAddressByAddressCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetAddressByAddressCoinRequest,
              adamant.global.v1.Model.Address>(
                service, METHODID_GET_ADDRESS_BY_ADDRESS_COIN)))
        .addMethod(
          getGetAddressByIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetAddressByIndexRequest,
              adamant.global.v1.Model.Address>(
                service, METHODID_GET_ADDRESS_BY_INDEX)))
        .addMethod(
          getListAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListAddressesRequest,
              adamant.global.v1.ListAddressesResponse>(
                service, METHODID_LIST_ADDRESSES)))
        .addMethod(
          getImportAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ImportAddressRequest,
              com.google.protobuf.Empty>(
                service, METHODID_IMPORT_ADDRESS)))
        .addMethod(
          getGetEthereumFeeAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetEthereumFeeAddressRequest,
              adamant.global.v1.Model.EthereumFeeAddress>(
                service, METHODID_GET_ETHEREUM_FEE_ADDRESS)))
        .addMethod(
          getUpdateAddressBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.UpdateAddressBalanceRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_ADDRESS_BALANCE)))
        .addMethod(
          getListColdFeeDepositAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ListColdFeeDepositAddressesRequest,
              adamant.teller.v1.ListColdFeeDepositAddressesResponse>(
                service, METHODID_LIST_COLD_FEE_DEPOSIT_ADDRESSES)))
        .addMethod(
          getListHotFeeDepositAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ListHotFeeDepositAddressesRequest,
              adamant.teller.v1.ListHotFeeDepositAddressesResponse>(
                service, METHODID_LIST_HOT_FEE_DEPOSIT_ADDRESSES)))
        .addMethod(
          getCreatePreTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CreatePreTransactionRequest,
              adamant.global.v1.CreatePreTransactionResponse>(
                service, METHODID_CREATE_PRE_TRANSACTION)))
        .addMethod(
          getListPreTransactionsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListPreTransactionsByFilterRequest,
              adamant.global.v1.ListPreTransactionsByFilterResponse>(
                service, METHODID_LIST_PRE_TRANSACTIONS_BY_FILTER)))
        .addMethod(
          getCancelPreTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CancelPreTransactionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_PRE_TRANSACTION)))
        .addMethod(
          getCreateTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CreateTransactionRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_CREATE_TRANSACTION)))
        .addMethod(
          getCreateContractCreationTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CreateContractCreationTransactionRequest,
              adamant.global.v1.CreateContractCreationTransactionResponse>(
                service, METHODID_CREATE_CONTRACT_CREATION_TRANSACTION)))
        .addMethod(
          getSignTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.SignTransactionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SIGN_TRANSACTION)))
        .addMethod(
          getSendTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.SendTransactionRequest,
              adamant.global.v1.SendTransactionResponse>(
                service, METHODID_SEND_TRANSACTION)))
        .addMethod(
          getResendTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ResendTransactionRequest,
              adamant.global.v1.ResendTransactionResponse>(
                service, METHODID_RESEND_TRANSACTION)))
        .addMethod(
          getCancelTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CancelTransactionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_TRANSACTION)))
        .addMethod(
          getReplaceTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ReplaceTransactionRequest,
              adamant.global.v1.ReplaceTransactionResponse>(
                service, METHODID_REPLACE_TRANSACTION)))
        .addMethod(
          getIsTransactionReplaceableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.IsTransactionReplaceableRequest,
              adamant.global.v1.IsTransactionReplaceableResponse>(
                service, METHODID_IS_TRANSACTION_REPLACEABLE)))
        .addMethod(
          getGetTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetTransactionRequest,
              adamant.global.v1.Model.Transaction>(
                service, METHODID_GET_TRANSACTION)))
        .addMethod(
          getGetTransactionByTxIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetTransactionByTxIDRequest,
              adamant.global.v1.Model.Transaction>(
                service, METHODID_GET_TRANSACTION_BY_TX_ID)))
        .addMethod(
          getListTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListTransactionsRequest,
              adamant.global.v1.ListTransactionsResponse>(
                service, METHODID_LIST_TRANSACTIONS)))
        .addMethod(
          getListTransactionsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListTransactionsByFilterRequest,
              adamant.global.v1.ListTransactionsResponse>(
                service, METHODID_LIST_TRANSACTIONS_BY_FILTER)))
        .addMethod(
          getListUnconfirmedTransactionsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListUnconfirmedTransactionsByFilterRequest,
              adamant.global.v1.ListUnconfirmedTransactionsResponse>(
                service, METHODID_LIST_UNCONFIRMED_TRANSACTIONS_BY_FILTER)))
        .addMethod(
          getExitEthereumStakingValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ExitEthereumStakingValidatorsRequest,
              adamant.global.v1.ExitEthereumStakingValidatorsResponse>(
                service, METHODID_EXIT_ETHEREUM_STAKING_VALIDATORS)))
        .addMethod(
          getListTransfersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListTransfersRequest,
              adamant.global.v1.ListTransfersResponse>(
                service, METHODID_LIST_TRANSFERS)))
        .addMethod(
          getListTransfersByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListTransfersByFilterRequest,
              adamant.global.v1.ListTransfersResponse>(
                service, METHODID_LIST_TRANSFERS_BY_FILTER)))
        .addMethod(
          getGetRateSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetRateSnapshotRequest,
              adamant.global.v1.Model.RateSnapshot>(
                service, METHODID_GET_RATE_SNAPSHOT)))
        .addMethod(
          getGetLatestRateSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetLatestRateSnapshotRequest,
              adamant.global.v1.Model.RateSnapshot>(
                service, METHODID_GET_LATEST_RATE_SNAPSHOT)))
        .addMethod(
          getSetRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.SetRatesRequest,
              adamant.global.v1.SetRatesResponse>(
                service, METHODID_SET_RATES)))
        .addMethod(
          getCalculateFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.CalculateFeeRequest,
              adamant.global.v1.CalculateFeeResponse>(
                service, METHODID_CALCULATE_FEE)))
        .addMethod(
          getGetRecommendedFeeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.GetRecommendedFeeRateRequest,
              adamant.global.v1.GetRecommendedFeeRateResponse>(
                service, METHODID_GET_RECOMMENDED_FEE_RATE)))
        .addMethod(
          getValidateAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ValidateAddressRequest,
              adamant.global.v1.ValidateAddressResponse>(
                service, METHODID_VALIDATE_ADDRESS)))
        .addMethod(
          getFlushBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.FlushBalanceRequest,
              adamant.global.v1.FlushBalanceResponse>(
                service, METHODID_FLUSH_BALANCE)))
        .addMethod(
          getListAuditLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListAuditLogsRequest,
              adamant.global.v1.ListAuditLogsResponse>(
                service, METHODID_LIST_AUDIT_LOGS)))
        .addMethod(
          getListStakingHistoriesByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListStakingHistoriesByFilterRequest,
              adamant.global.v1.ListStakingHistoriesResponse>(
                service, METHODID_LIST_STAKING_HISTORIES_BY_FILTER)))
        .addMethod(
          getListStakingValidatorsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListStakingValidatorsByFilterRequest,
              adamant.global.v1.ListStakingValidatorsResponse>(
                service, METHODID_LIST_STAKING_VALIDATORS_BY_FILTER)))
        .addMethod(
          getListNFTsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListNFTsByFilterRequest,
              adamant.global.v1.ListNFTsResponse>(
                service, METHODID_LIST_NFTS_BY_FILTER)))
        .addMethod(
          getSignMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.SignMessageRequest,
              adamant.teller.v1.SignMessageResponse>(
                service, METHODID_SIGN_MESSAGE)))
        .addMethod(
          getProgmatCoinInitializeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinInitializeRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_INITIALIZE)))
        .addMethod(
          getProgmatCoinConfigureMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinConfigureMinterRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_CONFIGURE_MINTER)))
        .addMethod(
          getProgmatCoinMintAndTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinMintAndTransferRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_MINT_AND_TRANSFER)))
        .addMethod(
          getProgmatCoinMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinMintRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_MINT)))
        .addMethod(
          getProgmatCoinBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinBurnRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_BURN)))
        .addMethod(
          getProgmatCoinBulkAddToWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinBulkAddToWhitelistRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_BULK_ADD_TO_WHITELIST)))
        .addMethod(
          getProgmatCoinBulkRemoveFromWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinBulkRemoveFromWhitelistRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_WHITELIST)))
        .addMethod(
          getProgmatCoinBulkAddToBlacklistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinBulkAddToBlacklistRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_BULK_ADD_TO_BLACKLIST)))
        .addMethod(
          getProgmatCoinBulkRemoveFromBlacklistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinBulkRemoveFromBlacklistRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_BULK_REMOVE_FROM_BLACKLIST)))
        .addMethod(
          getProgmatCoinConfiscateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinConfiscateRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_CONFISCATE)))
        .addMethod(
          getProgmatCoinPauseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinPauseRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_PAUSE)))
        .addMethod(
          getProgmatCoinUnpauseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinUnpauseRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_UNPAUSE)))
        .addMethod(
          getProgmatCoinGrantWhiteAndBlackListerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinGrantWhiteAndBlackListerRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_GRANT_WHITE_AND_BLACK_LISTER)))
        .addMethod(
          getProgmatCoinUpgradeToAndCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.teller.v1.ProgmatCoinUpgradeToAndCallRequest,
              adamant.global.v1.CreateTransactionResponse>(
                service, METHODID_PROGMAT_COIN_UPGRADE_TO_AND_CALL)))
        .addMethod(
          getListPreTransactionThresholdsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListPreTransactionThresholdsByFilterRequest,
              adamant.global.v1.ListPreTransactionThresholdsByFilterResponse>(
                service, METHODID_LIST_PRE_TRANSACTION_THRESHOLDS_BY_FILTER)))
        .addMethod(
          getListBlacklistAddressesByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListBlacklistAddressesByFilterRequest,
              adamant.global.v1.ListBlacklistAddressesByFilterResponse>(
                service, METHODID_LIST_BLACKLIST_ADDRESSES_BY_FILTER)))
        .addMethod(
          getListBlacklistAddressFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.global.v1.ListBlacklistAddressFilesRequest,
              adamant.global.v1.ListBlacklistAddressFilesResponse>(
                service, METHODID_LIST_BLACKLIST_ADDRESS_FILES)))
        .build();
  }

  private static abstract class TellerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TellerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return adamant.teller.v1.TellerAPIProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TellerAPI");
    }
  }

  private static final class TellerAPIFileDescriptorSupplier
      extends TellerAPIBaseDescriptorSupplier {
    TellerAPIFileDescriptorSupplier() {}
  }

  private static final class TellerAPIMethodDescriptorSupplier
      extends TellerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TellerAPIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TellerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TellerAPIFileDescriptorSupplier())
              .addMethod(getCreateWalletMethod())
              .addMethod(getGetWalletMethod())
              .addMethod(getListWalletsMethod())
              .addMethod(getListWalletsByFilterMethod())
              .addMethod(getListStakingWalletsByFilterMethod())
              .addMethod(getListNFTWalletsByFilterMethod())
              .addMethod(getListBaseWalletsMethod())
              .addMethod(getGetSpendableBalanceMethod())
              .addMethod(getInitializeXRPWalletMethod())
              .addMethod(getInitializeWalletMethod())
              .addMethod(getUpdateDestinationWalletIDMethod())
              .addMethod(getGetCosmosBalanceMethod())
              .addMethod(getListCosmosDelegateHistoriesMethod())
              .addMethod(getListUTXOsMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getCreateIOSTAccountMethod())
              .addMethod(getListSymbolChildAddressesMethod())
              .addMethod(getGetAddressMethod())
              .addMethod(getGetAddressByAddressMethod())
              .addMethod(getGetAddressByAddressCoinMethod())
              .addMethod(getGetAddressByIndexMethod())
              .addMethod(getListAddressesMethod())
              .addMethod(getImportAddressMethod())
              .addMethod(getGetEthereumFeeAddressMethod())
              .addMethod(getUpdateAddressBalanceMethod())
              .addMethod(getListColdFeeDepositAddressesMethod())
              .addMethod(getListHotFeeDepositAddressesMethod())
              .addMethod(getCreatePreTransactionMethod())
              .addMethod(getListPreTransactionsByFilterMethod())
              .addMethod(getCancelPreTransactionMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateContractCreationTransactionMethod())
              .addMethod(getSignTransactionMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getResendTransactionMethod())
              .addMethod(getCancelTransactionMethod())
              .addMethod(getReplaceTransactionMethod())
              .addMethod(getIsTransactionReplaceableMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionByTxIDMethod())
              .addMethod(getListTransactionsMethod())
              .addMethod(getListTransactionsByFilterMethod())
              .addMethod(getListUnconfirmedTransactionsByFilterMethod())
              .addMethod(getExitEthereumStakingValidatorsMethod())
              .addMethod(getListTransfersMethod())
              .addMethod(getListTransfersByFilterMethod())
              .addMethod(getGetRateSnapshotMethod())
              .addMethod(getGetLatestRateSnapshotMethod())
              .addMethod(getSetRatesMethod())
              .addMethod(getCalculateFeeMethod())
              .addMethod(getGetRecommendedFeeRateMethod())
              .addMethod(getValidateAddressMethod())
              .addMethod(getFlushBalanceMethod())
              .addMethod(getListAuditLogsMethod())
              .addMethod(getListStakingHistoriesByFilterMethod())
              .addMethod(getListStakingValidatorsByFilterMethod())
              .addMethod(getListNFTsByFilterMethod())
              .addMethod(getSignMessageMethod())
              .addMethod(getProgmatCoinInitializeMethod())
              .addMethod(getProgmatCoinConfigureMinterMethod())
              .addMethod(getProgmatCoinMintAndTransferMethod())
              .addMethod(getProgmatCoinMintMethod())
              .addMethod(getProgmatCoinBurnMethod())
              .addMethod(getProgmatCoinBulkAddToWhitelistMethod())
              .addMethod(getProgmatCoinBulkRemoveFromWhitelistMethod())
              .addMethod(getProgmatCoinBulkAddToBlacklistMethod())
              .addMethod(getProgmatCoinBulkRemoveFromBlacklistMethod())
              .addMethod(getProgmatCoinConfiscateMethod())
              .addMethod(getProgmatCoinPauseMethod())
              .addMethod(getProgmatCoinUnpauseMethod())
              .addMethod(getProgmatCoinGrantWhiteAndBlackListerMethod())
              .addMethod(getProgmatCoinUpgradeToAndCallMethod())
              .addMethod(getListPreTransactionThresholdsByFilterMethod())
              .addMethod(getListBlacklistAddressesByFilterMethod())
              .addMethod(getListBlacklistAddressFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
