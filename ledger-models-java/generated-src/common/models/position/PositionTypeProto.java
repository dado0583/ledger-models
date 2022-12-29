// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/position/position.proto

package common.models.position;

/**
 * Protobuf enum {@code position.PositionTypeProto}
 */
public enum PositionTypeProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_POSITION_TYPE = 0;</code>
   */
  UNKNOWN_POSITION_TYPE(0),
  /**
   * <code>TRANSACTION = 1;</code>
   */
  TRANSACTION(1),
  /**
   * <code>TAX_LOT = 2;</code>
   */
  TAX_LOT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_POSITION_TYPE = 0;</code>
   */
  public static final int UNKNOWN_POSITION_TYPE_VALUE = 0;
  /**
   * <code>TRANSACTION = 1;</code>
   */
  public static final int TRANSACTION_VALUE = 1;
  /**
   * <code>TAX_LOT = 2;</code>
   */
  public static final int TAX_LOT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PositionTypeProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PositionTypeProto forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_POSITION_TYPE;
      case 1: return TRANSACTION;
      case 2: return TAX_LOT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PositionTypeProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PositionTypeProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PositionTypeProto>() {
          public PositionTypeProto findValueByNumber(int number) {
            return PositionTypeProto.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return common.models.position.PositionProtos.getDescriptor().getEnumTypes().get(1);
  }

  private static final PositionTypeProto[] VALUES = values();

  public static PositionTypeProto valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PositionTypeProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:position.PositionTypeProto)
}

