// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UroCommand.proto

package com.example.uropatruljen_app.protobuf;

public final class UroCommand {
  private UroCommand() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_Music_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_Music_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_Light_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_Light_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_Uro_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_Uro_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uropatruljen_app_NetworkCre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uropatruljen_app_NetworkCre_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UroCommand.proto\022\020uropatruljen_app\"\211\002\n" +
      "\007Command\022\024\n\007command\030\001 \001(\tH\001\210\001\001\022*\n\006client" +
      "\030\002 \001(\0132\030.uropatruljen_app.ClientH\000\022(\n\005mu" +
      "sic\030\003 \001(\0132\027.uropatruljen_app.MusicH\000\022(\n\005" +
      "light\030\004 \001(\0132\027.uropatruljen_app.LightH\000\022$" +
      "\n\003uro\030\005 \001(\0132\025.uropatruljen_app.UroH\000\022/\n\007" +
      "network\030\006 \001(\0132\034.uropatruljen_app.Network" +
      "CreH\000B\005\n\003msgB\n\n\010_command\"B\n\006Client\022\022\n\005to" +
      "ken\030\001 \001(\tH\000\210\001\001\022\021\n\004imei\030\002 \001(\tH\001\210\001\001B\010\n\006_to" +
      "kenB\007\n\005_imei\"=\n\005Music\022\017\n\002id\030\001 \001(\005H\000\210\001\001\022\022" +
      "\n\005title\030\002 \001(\tH\001\210\001\001B\005\n\003_idB\010\n\006_title\"y\n\005L" +
      "ight\022\022\n\005state\030\001 \001(\010H\000\210\001\001\022\020\n\003red\030\002 \001(\005H\001\210" +
      "\001\001\022\022\n\005green\030\003 \001(\005H\002\210\001\001\022\021\n\004blue\030\004 \001(\005H\003\210\001" +
      "\001B\010\n\006_stateB\006\n\004_redB\010\n\006_greenB\007\n\005_blue\"#" +
      "\n\003Uro\022\022\n\005model\030\001 \001(\tH\000\210\001\001B\010\n\006_model\"D\n\nN" +
      "etworkCre\022\021\n\004ssid\030\001 \001(\tH\000\210\001\001\022\021\n\004pass\030\002 \001" +
      "(\tH\001\210\001\001B\007\n\005_ssidB\007\n\005_passB5\n%com.example" +
      ".uropatruljen_app.protobufB\nUroCommandP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_uropatruljen_app_Command_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_uropatruljen_app_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_Command_descriptor,
        new java.lang.String[] { "Command", "Client", "Music", "Light", "Uro", "Network", "Msg", "Command", });
    internal_static_uropatruljen_app_Client_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_uropatruljen_app_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_Client_descriptor,
        new java.lang.String[] { "Token", "Imei", "Token", "Imei", });
    internal_static_uropatruljen_app_Music_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_uropatruljen_app_Music_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_Music_descriptor,
        new java.lang.String[] { "Id", "Title", "Id", "Title", });
    internal_static_uropatruljen_app_Light_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_uropatruljen_app_Light_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_Light_descriptor,
        new java.lang.String[] { "State", "Red", "Green", "Blue", "State", "Red", "Green", "Blue", });
    internal_static_uropatruljen_app_Uro_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_uropatruljen_app_Uro_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_Uro_descriptor,
        new java.lang.String[] { "Model", "Model", });
    internal_static_uropatruljen_app_NetworkCre_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_uropatruljen_app_NetworkCre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uropatruljen_app_NetworkCre_descriptor,
        new java.lang.String[] { "Ssid", "Pass", "Ssid", "Pass", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
