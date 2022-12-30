// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests/util/lock/lock_response.proto

package common.request.lock;

public interface LockResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:util.lock.LockResponseProto)
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
   * <code>.util.lock.LockRequestProto create_lock_request = 3;</code>
   * @return Whether the createLockRequest field is set.
   */
  boolean hasCreateLockRequest();
  /**
   * <code>.util.lock.LockRequestProto create_lock_request = 3;</code>
   * @return The createLockRequest.
   */
  common.request.lock.LockRequestProto getCreateLockRequest();
  /**
   * <code>.util.lock.LockRequestProto create_lock_request = 3;</code>
   */
  common.request.lock.LockRequestProtoOrBuilder getCreateLockRequestOrBuilder();

  /**
   * <code>.util.lock.NodeStateProto lock_response = 4;</code>
   * @return Whether the lockResponse field is set.
   */
  boolean hasLockResponse();
  /**
   * <code>.util.lock.NodeStateProto lock_response = 4;</code>
   * @return The lockResponse.
   */
  common.util.locks.NodeStateProto getLockResponse();
  /**
   * <code>.util.lock.NodeStateProto lock_response = 4;</code>
   */
  common.util.locks.NodeStateProtoOrBuilder getLockResponseOrBuilder();
}