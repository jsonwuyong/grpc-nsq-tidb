// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Grades.proto

package com.sunnywu.grpc;

public final class GradesServiceProto {
  private GradesServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_GradesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_GradesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_GradesReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_GradesReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Grades.proto\022\004grpc\"6\n\rGradesRequest\022\014\n" +
      "\004name\030\001 \001(\t\022\013\n\003sex\030\002 \001(\t\022\n\n\002in\030\003 \001(\t\"\036\n\013" +
      "GradesReply\022\017\n\007message\030\001 \001(\t2?\n\006Grades\0225" +
      "\n\tGetGrades\022\023.grpc.GradesRequest\032\021.grpc." +
      "GradesReply\"\000B(\n\020com.sunnywu.grpcB\022Grade" +
      "sServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_GradesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_GradesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_GradesRequest_descriptor,
        new java.lang.String[] { "Name", "Sex", "In", });
    internal_static_grpc_GradesReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_GradesReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_GradesReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
