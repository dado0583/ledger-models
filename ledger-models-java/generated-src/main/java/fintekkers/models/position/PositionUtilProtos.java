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
      "ls/position/measure.proto\032*fintekkers/mo" +
      "dels/util/decimal_value.proto\"\226\001\n\017Measur" +
      "eMapEntry\0229\n\007measure\030\001 \001(\0162(.fintekkers." +
      "models.position.MeasureProto\022H\n\025measure_" +
      "decimal_value\030\002 \001(\0132).fintekkers.models." +
      "util.DecimalValueProto\"\354\001\n\rFieldMapEntry" +
      "\0225\n\005field\030\001 \001(\0162&.fintekkers.models.posi" +
      "tion.FieldProto\0222\n\022field_value_packed\030\004 " +
      "\001(\0132\024.google.protobuf.AnyH\000\022\024\n\nenum_valu" +
      "e\030\005 \001(\005H\000\022D\n\010operator\030\024 \001(\01622.fintekkers" +
      ".models.position.PositionFilterOperatorB" +
      "\024\n\022FieldMapValueOneOf*\232\001\n\026PositionFilter" +
      "Operator\022\024\n\020UNKNOWN_OPERATOR\020\000\022\n\n\006EQUALS" +
      "\020\001\022\016\n\nNOT_EQUALS\020\002\022\r\n\tLESS_THAN\020\003\022\027\n\023LES" +
      "S_THAN_OR_EQUALS\020\004\022\r\n\tMORE_THAN\020\005\022\027\n\023MOR" +
      "E_THAN_OR_EQUALS\020\006B\026B\022PositionUtilProtos" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          fintekkers.models.position.FieldProtos.getDescriptor(),
          fintekkers.models.position.MeasureProtos.getDescriptor(),
          fintekkers.models.util.DecimalValue.getDescriptor(),
        });
    internal_static_fintekkers_models_position_MeasureMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintekkers_models_position_MeasureMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_models_position_MeasureMapEntry_descriptor,
        new java.lang.String[] { "Measure", "MeasureDecimalValue", });
    internal_static_fintekkers_models_position_FieldMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_fintekkers_models_position_FieldMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_models_position_FieldMapEntry_descriptor,
        new java.lang.String[] { "Field", "FieldValuePacked", "EnumValue", "Operator", "FieldMapValueOneOf", });
    com.google.protobuf.AnyProto.getDescriptor();
    fintekkers.models.position.FieldProtos.getDescriptor();
    fintekkers.models.position.MeasureProtos.getDescriptor();
    fintekkers.models.util.DecimalValue.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
