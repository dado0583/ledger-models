// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/position/position_filter.proto

package common.models.position;

public interface PositionFilterProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:position.PositionFilterProto)
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
   * <code>repeated .position.FieldMapEntry filters = 21;</code>
   */
  java.util.List<common.models.position.FieldMapEntry> 
      getFiltersList();
  /**
   * <code>repeated .position.FieldMapEntry filters = 21;</code>
   */
  common.models.position.FieldMapEntry getFilters(int index);
  /**
   * <code>repeated .position.FieldMapEntry filters = 21;</code>
   */
  int getFiltersCount();
  /**
   * <code>repeated .position.FieldMapEntry filters = 21;</code>
   */
  java.util.List<? extends common.models.position.FieldMapEntryOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <code>repeated .position.FieldMapEntry filters = 21;</code>
   */
  common.models.position.FieldMapEntryOrBuilder getFiltersOrBuilder(
      int index);
}
