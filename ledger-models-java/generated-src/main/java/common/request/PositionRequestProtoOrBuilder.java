// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests/position/position_request.proto

package common.request;

public interface PositionRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:position.PositionRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_class = 1;</code>
   * @return The objectClass.
   */
  java.lang.String getObjectClass();
  /**
   * <code>string object_class = 1;</code>
   * @return The bytes for objectClass.
   */
  com.google.protobuf.ByteString
      getObjectClassBytes();

  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>.util.RequestOperationTypeProto operation_type = 10;</code>
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   * <code>.util.RequestOperationTypeProto operation_type = 10;</code>
   * @return The operationType.
   */
  common.request.util.RequestOperationTypeProto getOperationType();

  /**
   * <code>.position.PositionTypeProto position_type = 20;</code>
   * @return The enum numeric value on the wire for positionType.
   */
  int getPositionTypeValue();
  /**
   * <code>.position.PositionTypeProto position_type = 20;</code>
   * @return The positionType.
   */
  common.models.position.PositionTypeProto getPositionType();

  /**
   * <code>.position.PositionViewProto position_view = 21;</code>
   * @return The enum numeric value on the wire for positionView.
   */
  int getPositionViewValue();
  /**
   * <code>.position.PositionViewProto position_view = 21;</code>
   * @return The positionView.
   */
  common.models.position.PositionViewProto getPositionView();

  /**
   * <code>repeated .position.FieldProto fields = 30;</code>
   * @return A list containing the fields.
   */
  java.util.List<common.models.position.FieldProto> getFieldsList();
  /**
   * <code>repeated .position.FieldProto fields = 30;</code>
   * @return The count of fields.
   */
  int getFieldsCount();
  /**
   * <code>repeated .position.FieldProto fields = 30;</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  common.models.position.FieldProto getFields(int index);
  /**
   * <code>repeated .position.FieldProto fields = 30;</code>
   * @return A list containing the enum numeric values on the wire for fields.
   */
  java.util.List<java.lang.Integer>
  getFieldsValueList();
  /**
   * <code>repeated .position.FieldProto fields = 30;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fields at the given index.
   */
  int getFieldsValue(int index);

  /**
   * <code>repeated .position.MeasureProto measures = 31;</code>
   * @return A list containing the measures.
   */
  java.util.List<common.models.position.MeasureProto> getMeasuresList();
  /**
   * <code>repeated .position.MeasureProto measures = 31;</code>
   * @return The count of measures.
   */
  int getMeasuresCount();
  /**
   * <code>repeated .position.MeasureProto measures = 31;</code>
   * @param index The index of the element to return.
   * @return The measures at the given index.
   */
  common.models.position.MeasureProto getMeasures(int index);
  /**
   * <code>repeated .position.MeasureProto measures = 31;</code>
   * @return A list containing the enum numeric values on the wire for measures.
   */
  java.util.List<java.lang.Integer>
  getMeasuresValueList();
  /**
   * <code>repeated .position.MeasureProto measures = 31;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of measures at the given index.
   */
  int getMeasuresValue(int index);

  /**
   * <code>.position.PositionFilterProto filter_fields = 32;</code>
   * @return Whether the filterFields field is set.
   */
  boolean hasFilterFields();
  /**
   * <code>.position.PositionFilterProto filter_fields = 32;</code>
   * @return The filterFields.
   */
  common.models.position.PositionFilterProto getFilterFields();
  /**
   * <code>.position.PositionFilterProto filter_fields = 32;</code>
   */
  common.models.position.PositionFilterProtoOrBuilder getFilterFieldsOrBuilder();

  /**
   * <code>.util.LocalTimestampProto as_of = 33;</code>
   * @return Whether the asOf field is set.
   */
  boolean hasAsOf();
  /**
   * <code>.util.LocalTimestampProto as_of = 33;</code>
   * @return The asOf.
   */
  common.models.protoUtils.LocalTimestamp.LocalTimestampProto getAsOf();
  /**
   * <code>.util.LocalTimestampProto as_of = 33;</code>
   */
  common.models.protoUtils.LocalTimestamp.LocalTimestampProtoOrBuilder getAsOfOrBuilder();
}