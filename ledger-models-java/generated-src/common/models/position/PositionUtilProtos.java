// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/position/position_util.proto

package common.models.position;

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
    internal_static_position_MeasureMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_position_MeasureMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_position_FieldMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_position_FieldMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#models/position/position_util.proto\022\010p" +
      "osition\032\031google/protobuf/any.proto\032\033mode" +
      "ls/position/field.proto\032\035models/position" +
      "/measure.proto\032+models/security/identifi" +
      "er/identifier.proto\032\037models/util/decimal" +
      "_value.proto\"h\n\017MeasureMapEntry\022%\n\005field" +
      "\030\001 \001(\0162\026.position.MeasureProto\022.\n\rmeasur" +
      "e_value\030\002 \001(\0132\027.util.DecimalValueProto\"\371" +
      "\001\n\rFieldMapEntry\022#\n\005field\030\001 \001(\0162\024.positi" +
      "on.FieldProto\0222\n\022field_value_packed\030\004 \001(" +
      "\0132\024.google.protobuf.AnyH\000\022\024\n\nenum_value\030" +
      "\005 \001(\tH\000\022/\n\nidentifier\030\006 \001(\0132\031.security.I" +
      "dentifierProtoH\000\0222\n\010operator\030\024 \001(\0162 .pos" +
      "ition.PositionFilterOperatorB\024\n\022FieldMap" +
      "ValueOneOf*\232\001\n\026PositionFilterOperator\022\024\n" +
      "\020UNKNOWN_OPERATOR\020\000\022\n\n\006EQUALS\020\001\022\016\n\nNOT_E" +
      "QUALS\020\002\022\r\n\tLESS_THAN\020\003\022\027\n\023LESS_THAN_OR_E" +
      "QUALS\020\004\022\r\n\tMORE_THAN\020\005\022\027\n\023MORE_THAN_OR_E" +
      "QUALS\020\006B.\n\026common.models.positionB\022Posit" +
      "ionUtilProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          common.model.protos.FieldProtos.getDescriptor(),
          common.models.position.MeasureProtos.getDescriptor(),
          common.models.security.identifier.IdentifierProtos.getDescriptor(),
          common.models.protoUtils.DecimalValue.getDescriptor(),
        });
    internal_static_position_MeasureMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_position_MeasureMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_position_MeasureMapEntry_descriptor,
        new java.lang.String[] { "Field", "MeasureValue", });
    internal_static_position_FieldMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_position_FieldMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_position_FieldMapEntry_descriptor,
        new java.lang.String[] { "Field", "FieldValuePacked", "EnumValue", "Identifier", "Operator", "FieldMapValueOneOf", });
    com.google.protobuf.AnyProto.getDescriptor();
    common.model.protos.FieldProtos.getDescriptor();
    common.models.position.MeasureProtos.getDescriptor();
    common.models.security.identifier.IdentifierProtos.getDescriptor();
    common.models.protoUtils.DecimalValue.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
