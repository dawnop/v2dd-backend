package com.dawnop.algorithm.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.0)",
    comments = "Source: algorithm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AlgorithmServiceGrpc {

  private AlgorithmServiceGrpc() {}

  public static final String SERVICE_NAME = "algorithm.AlgorithmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest,
      com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> getImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "image",
      requestType = com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest.class,
      responseType = com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest,
      com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> getImageMethod() {
    io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest, com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> getImageMethod;
    if ((getImageMethod = AlgorithmServiceGrpc.getImageMethod) == null) {
      synchronized (AlgorithmServiceGrpc.class) {
        if ((getImageMethod = AlgorithmServiceGrpc.getImageMethod) == null) {
          AlgorithmServiceGrpc.getImageMethod = getImageMethod =
              io.grpc.MethodDescriptor.<com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest, com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "image"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AlgorithmServiceMethodDescriptorSupplier("image"))
              .build();
        }
      }
    }
    return getImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest,
      com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> getVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "video",
      requestType = com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest.class,
      responseType = com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest,
      com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> getVideoMethod() {
    io.grpc.MethodDescriptor<com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest, com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> getVideoMethod;
    if ((getVideoMethod = AlgorithmServiceGrpc.getVideoMethod) == null) {
      synchronized (AlgorithmServiceGrpc.class) {
        if ((getVideoMethod = AlgorithmServiceGrpc.getVideoMethod) == null) {
          AlgorithmServiceGrpc.getVideoMethod = getVideoMethod =
              io.grpc.MethodDescriptor.<com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest, com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "video"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AlgorithmServiceMethodDescriptorSupplier("video"))
              .build();
        }
      }
    }
    return getVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlgorithmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceStub>() {
        @Override
        public AlgorithmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlgorithmServiceStub(channel, callOptions);
        }
      };
    return AlgorithmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlgorithmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceBlockingStub>() {
        @Override
        public AlgorithmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlgorithmServiceBlockingStub(channel, callOptions);
        }
      };
    return AlgorithmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlgorithmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlgorithmServiceFutureStub>() {
        @Override
        public AlgorithmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlgorithmServiceFutureStub(channel, callOptions);
        }
      };
    return AlgorithmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlgorithmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void image(com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest request,
        io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageMethod(), responseObserver);
    }

    /**
     */
    public void video(com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest request,
        io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVideoMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImageMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest,
                com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse>(
                  this, METHODID_IMAGE)))
          .addMethod(
            getVideoMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest,
                com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse>(
                  this, METHODID_VIDEO)))
          .build();
    }
  }

  /**
   */
  public static final class AlgorithmServiceStub extends io.grpc.stub.AbstractAsyncStub<AlgorithmServiceStub> {
    private AlgorithmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlgorithmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceStub(channel, callOptions);
    }

    /**
     */
    public void image(com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest request,
        io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void video(com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest request,
        io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlgorithmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlgorithmServiceBlockingStub> {
    private AlgorithmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlgorithmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse> image(
        com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse> video(
        com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlgorithmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AlgorithmServiceFutureStub> {
    private AlgorithmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlgorithmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_IMAGE = 0;
  private static final int METHODID_VIDEO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlgorithmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlgorithmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMAGE:
          serviceImpl.image((com.dawnop.algorithm.proto.AlgorithmProto.ImageRequest) request,
              (io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.ImageResponse>) responseObserver);
          break;
        case METHODID_VIDEO:
          serviceImpl.video((com.dawnop.algorithm.proto.AlgorithmProto.VideoRequest) request,
              (io.grpc.stub.StreamObserver<com.dawnop.algorithm.proto.AlgorithmProto.VideoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlgorithmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlgorithmServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dawnop.algorithm.proto.AlgorithmProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlgorithmService");
    }
  }

  private static final class AlgorithmServiceFileDescriptorSupplier
      extends AlgorithmServiceBaseDescriptorSupplier {
    AlgorithmServiceFileDescriptorSupplier() {}
  }

  private static final class AlgorithmServiceMethodDescriptorSupplier
      extends AlgorithmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlgorithmServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlgorithmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlgorithmServiceFileDescriptorSupplier())
              .addMethod(getImageMethod())
              .addMethod(getVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
