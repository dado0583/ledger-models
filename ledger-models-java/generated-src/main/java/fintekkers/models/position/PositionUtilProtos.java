// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/models/position/position_util.proto

package fintekkers.models.position;

public final class PositionUtilProtos {
  private PositionUtilProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintekkers_models_position_MeasureMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintekkers_models_position_MeasureMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintekkers_models_position_FieldMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintekkers_models_position_FieldMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.fintekkers/models/position/position_ut" +
      "il.proto\022\032fintekkers.models.position\032\031go" +
      "ogle/protobuf/any.proto\032&fintekkers/mode" +
      "ls/position/field.proto\032(fintekkers/mode" +
      "ls/position/measure.proto\0326fintekkers/mo" +
      "dels/security/identifier/identifier.prot" +
      "o\032*fintekkers/models/util/decimal_value." +
      "proto\"\214\001\n\017MeasureMapEntry\0227\n\005field\030\001 \001(\016" +
      "2(.fintekkers.models.position.MeasurePro" +
      "to\022@\n\rmeasure_value\030\002 \001(\0132).fintekkers.m" +
      "odels.util.DecimalValueProto\"\257\002\n\rFieldMa" +
      "pEntry\0225\n\005field\030\001 \001(\0162&.fintekkers.model" +
      "s.position.FieldProto\0222\n\022field_value_pac" +
      "ked\030\004 \001(\0132\024.google.protobuf.AnyH\000\022\024\n\nenu" +
      "m_value\030\005 \001(\tH\000\022A\n\nidentifier\030\006 \001(\0132+.fi" +
      "ntekkers.models.security.IdentifierProto" +
      "H\000\022D\n\010operator\030\024 \001(\01622.fintekkers.models" +
      ".position.PositionFilterOperatorB\024\n\022Fiel" +
      "dMapValueOneOf*\232\001\n\026PositionFilterOperato" +
      "r\022\024\n\020UNKNOWN_OPERATOR\020\000\022\n\n\006EQUALS\020\001\022\016\n\nN" +
      "OT_EQUALS\020\002\022\r\n\tLESS_THAN\020\003\022\027\n\023LESS_THAN_" +
      "OR_EQUALS\020\004\022\r\n\tMORE_THAN\020\005\022\027\n\023MORE_THAN_" +
      "OR_EQUALS\020\006B\026B\022PositionUtilProtosP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          fintekkers.models.position.FieldProtos.getDescriptor(),
          fintekkers.models.position.MeasureProtos.getDescriptor(),
          fintekkers.models.security.IdentifierProtos.getDescriptor(),
          fintekkers.models.util.DecimalValue.getDescriptor(),
        });
    internal_static_fintekkers_models_position_MeasureMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintekkers_models_position_MeasureMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_models_position_MeasureMapEntry_descriptor,
        new java.lang.String[] { "Field", "MeasureValue", });
    internal_static_fintekkers_models_position_FieldMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_fintekkers_models_position_FieldMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_models_position_FieldMapEntry_descriptor,
        new java.lang.String[] { "Field", "FieldValuePacked", "EnumValue", "Identifier", "Operator", "FieldMapValueOneOf", });
    com.google.protobuf.AnyProto.getDescriptor();
    fintekkers.models.position.FieldProtos.getDescriptor();
    fintekkers.models.position.MeasureProtos.getDescriptor();
    fintekkers.models.security.IdentifierProtos.getDescriptor();
    fintekkers.models.util.DecimalValue.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
