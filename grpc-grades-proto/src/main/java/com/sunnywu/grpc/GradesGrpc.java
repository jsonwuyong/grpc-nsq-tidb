package com.sunnywu.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *服务端接口类
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: Grades.proto")
public final class GradesGrpc {

  private GradesGrpc() {}

  public static final String SERVICE_NAME = "grpc.Grades";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGradesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sunnywu.grpc.GradesRequest,
      com.sunnywu.grpc.GradesReply> METHOD_GET_GRADES = getGetGradesMethod();

  private static volatile io.grpc.MethodDescriptor<com.sunnywu.grpc.GradesRequest,
      com.sunnywu.grpc.GradesReply> getGetGradesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sunnywu.grpc.GradesRequest,
      com.sunnywu.grpc.GradesReply> getGetGradesMethod() {
    io.grpc.MethodDescriptor<com.sunnywu.grpc.GradesRequest, com.sunnywu.grpc.GradesReply> getGetGradesMethod;
    if ((getGetGradesMethod = GradesGrpc.getGetGradesMethod) == null) {
      synchronized (GradesGrpc.class) {
        if ((getGetGradesMethod = GradesGrpc.getGetGradesMethod) == null) {
          GradesGrpc.getGetGradesMethod = getGetGradesMethod = 
              io.grpc.MethodDescriptor.<com.sunnywu.grpc.GradesRequest, com.sunnywu.grpc.GradesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.Grades", "GetGrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunnywu.grpc.GradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunnywu.grpc.GradesReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GradesMethodDescriptorSupplier("GetGrades"))
                  .build();
          }
        }
     }
     return getGetGradesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GradesStub newStub(io.grpc.Channel channel) {
    return new GradesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GradesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GradesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GradesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GradesFutureStub(channel);
  }

  /**
   * <pre>
   *服务端接口类
   * </pre>
   */
  public static abstract class GradesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *服务端接口方法
     * </pre>
     */
    public void getGrades(com.sunnywu.grpc.GradesRequest request,
        io.grpc.stub.StreamObserver<com.sunnywu.grpc.GradesReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGradesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGradesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunnywu.grpc.GradesRequest,
                com.sunnywu.grpc.GradesReply>(
                  this, METHODID_GET_GRADES)))
          .build();
    }
  }

  /**
   * <pre>
   *服务端接口类
   * </pre>
   */
  public static final class GradesStub extends io.grpc.stub.AbstractStub<GradesStub> {
    private GradesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradesStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务端接口方法
     * </pre>
     */
    public void getGrades(com.sunnywu.grpc.GradesRequest request,
        io.grpc.stub.StreamObserver<com.sunnywu.grpc.GradesReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGradesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *服务端接口类
   * </pre>
   */
  public static final class GradesBlockingStub extends io.grpc.stub.AbstractStub<GradesBlockingStub> {
    private GradesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务端接口方法
     * </pre>
     */
    public com.sunnywu.grpc.GradesReply getGrades(com.sunnywu.grpc.GradesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGradesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *服务端接口类
   * </pre>
   */
  public static final class GradesFutureStub extends io.grpc.stub.AbstractStub<GradesFutureStub> {
    private GradesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GradesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GradesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *服务端接口方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunnywu.grpc.GradesReply> getGrades(
        com.sunnywu.grpc.GradesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGradesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GRADES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GradesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GradesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GRADES:
          serviceImpl.getGrades((com.sunnywu.grpc.GradesRequest) request,
              (io.grpc.stub.StreamObserver<com.sunnywu.grpc.GradesReply>) responseObserver);
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

  private static abstract class GradesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GradesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunnywu.grpc.GradesServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Grades");
    }
  }

  private static final class GradesFileDescriptorSupplier
      extends GradesBaseDescriptorSupplier {
    GradesFileDescriptorSupplier() {}
  }

  private static final class GradesMethodDescriptorSupplier
      extends GradesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GradesMethodDescriptorSupplier(String methodName) {
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
      synchronized (GradesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GradesFileDescriptorSupplier())
              .addMethod(getGetGradesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
