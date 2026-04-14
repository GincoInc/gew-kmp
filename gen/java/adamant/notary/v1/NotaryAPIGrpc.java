package adamant.notary.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Internal-only service. Do not expose publicly.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: gincoinc/adamant/notary/v1/adamantnotaryv1/notary_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotaryAPIGrpc {

  private NotaryAPIGrpc() {}

  public static final String SERVICE_NAME = "adamant.notary.v1.NotaryAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest,
      adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> getRegisterPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPublicKey",
      requestType = adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest.class,
      responseType = adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest,
      adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> getRegisterPublicKeyMethod() {
    io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest, adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> getRegisterPublicKeyMethod;
    if ((getRegisterPublicKeyMethod = NotaryAPIGrpc.getRegisterPublicKeyMethod) == null) {
      synchronized (NotaryAPIGrpc.class) {
        if ((getRegisterPublicKeyMethod = NotaryAPIGrpc.getRegisterPublicKeyMethod) == null) {
          NotaryAPIGrpc.getRegisterPublicKeyMethod = getRegisterPublicKeyMethod =
              io.grpc.MethodDescriptor.<adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest, adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryAPIMethodDescriptorSupplier("RegisterPublicKey"))
              .build();
        }
      }
    }
    return getRegisterPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RevokePublicKeyRequest,
      com.google.protobuf.Empty> getRevokePublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokePublicKey",
      requestType = adamant.notary.v1.NotaryApi.RevokePublicKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RevokePublicKeyRequest,
      com.google.protobuf.Empty> getRevokePublicKeyMethod() {
    io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.RevokePublicKeyRequest, com.google.protobuf.Empty> getRevokePublicKeyMethod;
    if ((getRevokePublicKeyMethod = NotaryAPIGrpc.getRevokePublicKeyMethod) == null) {
      synchronized (NotaryAPIGrpc.class) {
        if ((getRevokePublicKeyMethod = NotaryAPIGrpc.getRevokePublicKeyMethod) == null) {
          NotaryAPIGrpc.getRevokePublicKeyMethod = getRevokePublicKeyMethod =
              io.grpc.MethodDescriptor.<adamant.notary.v1.NotaryApi.RevokePublicKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokePublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.notary.v1.NotaryApi.RevokePublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryAPIMethodDescriptorSupplier("RevokePublicKey"))
              .build();
        }
      }
    }
    return getRevokePublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest,
      com.google.protobuf.Empty> getUpdatePublicKeyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePublicKeyLimit",
      requestType = adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest,
      com.google.protobuf.Empty> getUpdatePublicKeyLimitMethod() {
    io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest, com.google.protobuf.Empty> getUpdatePublicKeyLimitMethod;
    if ((getUpdatePublicKeyLimitMethod = NotaryAPIGrpc.getUpdatePublicKeyLimitMethod) == null) {
      synchronized (NotaryAPIGrpc.class) {
        if ((getUpdatePublicKeyLimitMethod = NotaryAPIGrpc.getUpdatePublicKeyLimitMethod) == null) {
          NotaryAPIGrpc.getUpdatePublicKeyLimitMethod = getUpdatePublicKeyLimitMethod =
              io.grpc.MethodDescriptor.<adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePublicKeyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryAPIMethodDescriptorSupplier("UpdatePublicKeyLimit"))
              .build();
        }
      }
    }
    return getUpdatePublicKeyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.VerifySignatureRequest,
      com.google.protobuf.Empty> getVerifySignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifySignature",
      requestType = adamant.notary.v1.NotaryApi.VerifySignatureRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.VerifySignatureRequest,
      com.google.protobuf.Empty> getVerifySignatureMethod() {
    io.grpc.MethodDescriptor<adamant.notary.v1.NotaryApi.VerifySignatureRequest, com.google.protobuf.Empty> getVerifySignatureMethod;
    if ((getVerifySignatureMethod = NotaryAPIGrpc.getVerifySignatureMethod) == null) {
      synchronized (NotaryAPIGrpc.class) {
        if ((getVerifySignatureMethod = NotaryAPIGrpc.getVerifySignatureMethod) == null) {
          NotaryAPIGrpc.getVerifySignatureMethod = getVerifySignatureMethod =
              io.grpc.MethodDescriptor.<adamant.notary.v1.NotaryApi.VerifySignatureRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifySignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  adamant.notary.v1.NotaryApi.VerifySignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryAPIMethodDescriptorSupplier("VerifySignature"))
              .build();
        }
      }
    }
    return getVerifySignatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotaryAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryAPIStub>() {
        @java.lang.Override
        public NotaryAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryAPIStub(channel, callOptions);
        }
      };
    return NotaryAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotaryAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryAPIBlockingStub>() {
        @java.lang.Override
        public NotaryAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryAPIBlockingStub(channel, callOptions);
        }
      };
    return NotaryAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotaryAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryAPIFutureStub>() {
        @java.lang.Override
        public NotaryAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryAPIFutureStub(channel, callOptions);
        }
      };
    return NotaryAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Internal-only service. Do not expose publicly.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Registry
     * -----------------------------------------------------------------------------
     * </pre>
     */
    default void registerPublicKey(adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest request,
        io.grpc.stub.StreamObserver<adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPublicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Lifecycle
     * -----------------------------------------------------------------------------
     * </pre>
     */
    default void revokePublicKey(adamant.notary.v1.NotaryApi.RevokePublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokePublicKeyMethod(), responseObserver);
    }

    /**
     */
    default void updatePublicKeyLimit(adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePublicKeyLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Signature Verification (atomic: key resolve → verify → consume nonce)
     * -----------------------------------------------------------------------------
     * </pre>
     */
    default void verifySignature(adamant.notary.v1.NotaryApi.VerifySignatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifySignatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NotaryAPI.
   * <pre>
   * Internal-only service. Do not expose publicly.
   * </pre>
   */
  public static abstract class NotaryAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NotaryAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NotaryAPI.
   * <pre>
   * Internal-only service. Do not expose publicly.
   * </pre>
   */
  public static final class NotaryAPIStub
      extends io.grpc.stub.AbstractAsyncStub<NotaryAPIStub> {
    private NotaryAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotaryAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Registry
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public void registerPublicKey(adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest request,
        io.grpc.stub.StreamObserver<adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Lifecycle
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public void revokePublicKey(adamant.notary.v1.NotaryApi.RevokePublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokePublicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePublicKeyLimit(adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePublicKeyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Signature Verification (atomic: key resolve → verify → consume nonce)
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public void verifySignature(adamant.notary.v1.NotaryApi.VerifySignatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifySignatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NotaryAPI.
   * <pre>
   * Internal-only service. Do not expose publicly.
   * </pre>
   */
  public static final class NotaryAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotaryAPIBlockingStub> {
    private NotaryAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotaryAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Registry
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse registerPublicKey(adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPublicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Lifecycle
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public com.google.protobuf.Empty revokePublicKey(adamant.notary.v1.NotaryApi.RevokePublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokePublicKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updatePublicKeyLimit(adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePublicKeyLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Signature Verification (atomic: key resolve → verify → consume nonce)
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public com.google.protobuf.Empty verifySignature(adamant.notary.v1.NotaryApi.VerifySignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifySignatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NotaryAPI.
   * <pre>
   * Internal-only service. Do not expose publicly.
   * </pre>
   */
  public static final class NotaryAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotaryAPIFutureStub> {
    private NotaryAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotaryAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Registry
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse> registerPublicKey(
        adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPublicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Key Lifecycle
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> revokePublicKey(
        adamant.notary.v1.NotaryApi.RevokePublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokePublicKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updatePublicKeyLimit(
        adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePublicKeyLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * -----------------------------------------------------------------------------
     * Signature Verification (atomic: key resolve → verify → consume nonce)
     * -----------------------------------------------------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> verifySignature(
        adamant.notary.v1.NotaryApi.VerifySignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifySignatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PUBLIC_KEY = 0;
  private static final int METHODID_REVOKE_PUBLIC_KEY = 1;
  private static final int METHODID_UPDATE_PUBLIC_KEY_LIMIT = 2;
  private static final int METHODID_VERIFY_SIGNATURE = 3;

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
        case METHODID_REGISTER_PUBLIC_KEY:
          serviceImpl.registerPublicKey((adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse>) responseObserver);
          break;
        case METHODID_REVOKE_PUBLIC_KEY:
          serviceImpl.revokePublicKey((adamant.notary.v1.NotaryApi.RevokePublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PUBLIC_KEY_LIMIT:
          serviceImpl.updatePublicKeyLimit((adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VERIFY_SIGNATURE:
          serviceImpl.verifySignature((adamant.notary.v1.NotaryApi.VerifySignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getRegisterPublicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.notary.v1.NotaryApi.RegisterPublicKeyRequest,
              adamant.notary.v1.NotaryApi.RegisterPublicKeyResponse>(
                service, METHODID_REGISTER_PUBLIC_KEY)))
        .addMethod(
          getRevokePublicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.notary.v1.NotaryApi.RevokePublicKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REVOKE_PUBLIC_KEY)))
        .addMethod(
          getUpdatePublicKeyLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.notary.v1.NotaryApi.UpdatePublicKeyLimitRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_PUBLIC_KEY_LIMIT)))
        .addMethod(
          getVerifySignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              adamant.notary.v1.NotaryApi.VerifySignatureRequest,
              com.google.protobuf.Empty>(
                service, METHODID_VERIFY_SIGNATURE)))
        .build();
  }

  private static abstract class NotaryAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotaryAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return adamant.notary.v1.NotaryApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotaryAPI");
    }
  }

  private static final class NotaryAPIFileDescriptorSupplier
      extends NotaryAPIBaseDescriptorSupplier {
    NotaryAPIFileDescriptorSupplier() {}
  }

  private static final class NotaryAPIMethodDescriptorSupplier
      extends NotaryAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotaryAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotaryAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotaryAPIFileDescriptorSupplier())
              .addMethod(getRegisterPublicKeyMethod())
              .addMethod(getRevokePublicKeyMethod())
              .addMethod(getUpdatePublicKeyLimitMethod())
              .addMethod(getVerifySignatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
