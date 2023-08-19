// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/requests/transaction/query_transaction_request.proto

package fintekkers.requests.transaction;

public interface QueryTransactionRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fintekkers.requests.transaction.QueryTransactionRequestProto)
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
   * <pre>
   *The list of UUIds to return
   * </pre>
   *
   * <code>repeated .fintekkers.models.util.UUIDProto uuIds = 21;</code>
   */
  java.util.List<fintekkers.models.util.Uuid.UUIDProto> 
      getUuIdsList();
  /**
   * <pre>
   *The list of UUIds to return
   * </pre>
   *
   * <code>repeated .fintekkers.models.util.UUIDProto uuIds = 21;</code>
   */
  fintekkers.models.util.Uuid.UUIDProto getUuIds(int index);
  /**
   * <pre>
   *The list of UUIds to return
   * </pre>
   *
   * <code>repeated .fintekkers.models.util.UUIDProto uuIds = 21;</code>
   */
  int getUuIdsCount();
  /**
   * <pre>
   *The list of UUIds to return
   * </pre>
   *
   * <code>repeated .fintekkers.models.util.UUIDProto uuIds = 21;</code>
   */
  java.util.List<? extends fintekkers.models.util.Uuid.UUIDProtoOrBuilder> 
      getUuIdsOrBuilderList();
  /**
   * <pre>
   *The list of UUIds to return
   * </pre>
   *
   * <code>repeated .fintekkers.models.util.UUIDProto uuIds = 21;</code>
   */
  fintekkers.models.util.Uuid.UUIDProtoOrBuilder getUuIdsOrBuilder(
      int index);

  /**
   * <pre>
   *A list of position filters that will filter securities that match.
   * </pre>
   *
   * <code>.fintekkers.models.position.PositionFilterProto search_transaction_input = 22;</code>
   * @return Whether the searchTransactionInput field is set.
   */
  boolean hasSearchTransactionInput();
  /**
   * <pre>
   *A list of position filters that will filter securities that match.
   * </pre>
   *
   * <code>.fintekkers.models.position.PositionFilterProto search_transaction_input = 22;</code>
   * @return The searchTransactionInput.
   */
  fintekkers.models.position.PositionFilterProto getSearchTransactionInput();
  /**
   * <pre>
   *A list of position filters that will filter securities that match.
   * </pre>
   *
   * <code>.fintekkers.models.position.PositionFilterProto search_transaction_input = 22;</code>
   */
  fintekkers.models.position.PositionFilterProtoOrBuilder getSearchTransactionInputOrBuilder();

  /**
   * <pre>
   *The as of date to query the data set
   * </pre>
   *
   * <code>.fintekkers.models.util.LocalTimestampProto as_of = 23;</code>
   * @return Whether the asOf field is set.
   */
  boolean hasAsOf();
  /**
   * <pre>
   *The as of date to query the data set
   * </pre>
   *
   * <code>.fintekkers.models.util.LocalTimestampProto as_of = 23;</code>
   * @return The asOf.
   */
  fintekkers.models.util.LocalTimestamp.LocalTimestampProto getAsOf();
  /**
   * <pre>
   *The as of date to query the data set
   * </pre>
   *
   * <code>.fintekkers.models.util.LocalTimestampProto as_of = 23;</code>
   */
  fintekkers.models.util.LocalTimestamp.LocalTimestampProtoOrBuilder getAsOfOrBuilder();

  /**
   * <pre>
   *Max number of records to return
   * </pre>
   *
   * <code>int32 limit = 24;</code>
   * @return The limit.
   */
  int getLimit();
}
