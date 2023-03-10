// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/requests/util/lock/lock_request.proto

package fintekkers.requests.util.lock;

/**
 * Protobuf type {@code fintekkers.requests.util.lock.LockRequestProto}
 */
public final class LockRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fintekkers.requests.util.lock.LockRequestProto)
    LockRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LockRequestProto.newBuilder() to construct.
  private LockRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LockRequestProto() {
    objectClass_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LockRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LockRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            objectClass_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 90: {
            fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder subBuilder = null;
            if (nodePartition_ != null) {
              subBuilder = nodePartition_.toBuilder();
            }
            nodePartition_ = input.readMessage(fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nodePartition_);
              nodePartition_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fintekkers.requests.util.lock.LockRequestProtos.internal_static_fintekkers_requests_util_lock_LockRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fintekkers.requests.util.lock.LockRequestProtos.internal_static_fintekkers_requests_util_lock_LockRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fintekkers.requests.util.lock.LockRequestProto.class, fintekkers.requests.util.lock.LockRequestProto.Builder.class);
  }

  public static final int OBJECT_CLASS_FIELD_NUMBER = 1;
  private volatile java.lang.Object objectClass_;
  /**
   * <code>string object_class = 1;</code>
   * @return The objectClass.
   */
  @java.lang.Override
  public java.lang.String getObjectClass() {
    java.lang.Object ref = objectClass_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectClass_ = s;
      return s;
    }
  }
  /**
   * <code>string object_class = 1;</code>
   * @return The bytes for objectClass.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectClassBytes() {
    java.lang.Object ref = objectClass_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectClass_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_PARTITION_FIELD_NUMBER = 11;
  private fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition nodePartition_;
  /**
   * <pre>
   *The namespace/partition to get the lock for. Generally, when requesting a 
   *lock the caller should only specify the namespace, meaning that its up to 
   *the lock service to pick a partition for you. 
   *If the partition number is also specified the lock service will ONLY try
   *to get the lock on that parition and fail if it the lock is already taken
   * </pre>
   *
   * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
   * @return Whether the nodePartition field is set.
   */
  @java.lang.Override
  public boolean hasNodePartition() {
    return nodePartition_ != null;
  }
  /**
   * <pre>
   *The namespace/partition to get the lock for. Generally, when requesting a 
   *lock the caller should only specify the namespace, meaning that its up to 
   *the lock service to pick a partition for you. 
   *If the partition number is also specified the lock service will ONLY try
   *to get the lock on that parition and fail if it the lock is already taken
   * </pre>
   *
   * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
   * @return The nodePartition.
   */
  @java.lang.Override
  public fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition getNodePartition() {
    return nodePartition_ == null ? fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.getDefaultInstance() : nodePartition_;
  }
  /**
   * <pre>
   *The namespace/partition to get the lock for. Generally, when requesting a 
   *lock the caller should only specify the namespace, meaning that its up to 
   *the lock service to pick a partition for you. 
   *If the partition number is also specified the lock service will ONLY try
   *to get the lock on that parition and fail if it the lock is already taken
   * </pre>
   *
   * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
   */
  @java.lang.Override
  public fintekkers.models.util.lock.NodePartitionOuterClass.NodePartitionOrBuilder getNodePartitionOrBuilder() {
    return getNodePartition();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getObjectClassBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectClass_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (nodePartition_ != null) {
      output.writeMessage(11, getNodePartition());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getObjectClassBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectClass_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (nodePartition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getNodePartition());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof fintekkers.requests.util.lock.LockRequestProto)) {
      return super.equals(obj);
    }
    fintekkers.requests.util.lock.LockRequestProto other = (fintekkers.requests.util.lock.LockRequestProto) obj;

    if (!getObjectClass()
        .equals(other.getObjectClass())) return false;
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (hasNodePartition() != other.hasNodePartition()) return false;
    if (hasNodePartition()) {
      if (!getNodePartition()
          .equals(other.getNodePartition())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OBJECT_CLASS_FIELD_NUMBER;
    hash = (53 * hash) + getObjectClass().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasNodePartition()) {
      hash = (37 * hash) + NODE_PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getNodePartition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fintekkers.requests.util.lock.LockRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(fintekkers.requests.util.lock.LockRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code fintekkers.requests.util.lock.LockRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fintekkers.requests.util.lock.LockRequestProto)
      fintekkers.requests.util.lock.LockRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fintekkers.requests.util.lock.LockRequestProtos.internal_static_fintekkers_requests_util_lock_LockRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fintekkers.requests.util.lock.LockRequestProtos.internal_static_fintekkers_requests_util_lock_LockRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fintekkers.requests.util.lock.LockRequestProto.class, fintekkers.requests.util.lock.LockRequestProto.Builder.class);
    }

    // Construct using fintekkers.requests.util.lock.LockRequestProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      objectClass_ = "";

      version_ = "";

      if (nodePartitionBuilder_ == null) {
        nodePartition_ = null;
      } else {
        nodePartition_ = null;
        nodePartitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fintekkers.requests.util.lock.LockRequestProtos.internal_static_fintekkers_requests_util_lock_LockRequestProto_descriptor;
    }

    @java.lang.Override
    public fintekkers.requests.util.lock.LockRequestProto getDefaultInstanceForType() {
      return fintekkers.requests.util.lock.LockRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public fintekkers.requests.util.lock.LockRequestProto build() {
      fintekkers.requests.util.lock.LockRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fintekkers.requests.util.lock.LockRequestProto buildPartial() {
      fintekkers.requests.util.lock.LockRequestProto result = new fintekkers.requests.util.lock.LockRequestProto(this);
      result.objectClass_ = objectClass_;
      result.version_ = version_;
      if (nodePartitionBuilder_ == null) {
        result.nodePartition_ = nodePartition_;
      } else {
        result.nodePartition_ = nodePartitionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof fintekkers.requests.util.lock.LockRequestProto) {
        return mergeFrom((fintekkers.requests.util.lock.LockRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fintekkers.requests.util.lock.LockRequestProto other) {
      if (other == fintekkers.requests.util.lock.LockRequestProto.getDefaultInstance()) return this;
      if (!other.getObjectClass().isEmpty()) {
        objectClass_ = other.objectClass_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.hasNodePartition()) {
        mergeNodePartition(other.getNodePartition());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      fintekkers.requests.util.lock.LockRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (fintekkers.requests.util.lock.LockRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object objectClass_ = "";
    /**
     * <code>string object_class = 1;</code>
     * @return The objectClass.
     */
    public java.lang.String getObjectClass() {
      java.lang.Object ref = objectClass_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectClass_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string object_class = 1;</code>
     * @return The bytes for objectClass.
     */
    public com.google.protobuf.ByteString
        getObjectClassBytes() {
      java.lang.Object ref = objectClass_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectClass_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string object_class = 1;</code>
     * @param value The objectClass to set.
     * @return This builder for chaining.
     */
    public Builder setObjectClass(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      objectClass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string object_class = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectClass() {
      
      objectClass_ = getDefaultInstance().getObjectClass();
      onChanged();
      return this;
    }
    /**
     * <code>string object_class = 1;</code>
     * @param value The bytes for objectClass to set.
     * @return This builder for chaining.
     */
    public Builder setObjectClassBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      objectClass_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition nodePartition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartitionOrBuilder> nodePartitionBuilder_;
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     * @return Whether the nodePartition field is set.
     */
    public boolean hasNodePartition() {
      return nodePartitionBuilder_ != null || nodePartition_ != null;
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     * @return The nodePartition.
     */
    public fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition getNodePartition() {
      if (nodePartitionBuilder_ == null) {
        return nodePartition_ == null ? fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.getDefaultInstance() : nodePartition_;
      } else {
        return nodePartitionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public Builder setNodePartition(fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition value) {
      if (nodePartitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodePartition_ = value;
        onChanged();
      } else {
        nodePartitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public Builder setNodePartition(
        fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder builderForValue) {
      if (nodePartitionBuilder_ == null) {
        nodePartition_ = builderForValue.build();
        onChanged();
      } else {
        nodePartitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public Builder mergeNodePartition(fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition value) {
      if (nodePartitionBuilder_ == null) {
        if (nodePartition_ != null) {
          nodePartition_ =
            fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.newBuilder(nodePartition_).mergeFrom(value).buildPartial();
        } else {
          nodePartition_ = value;
        }
        onChanged();
      } else {
        nodePartitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public Builder clearNodePartition() {
      if (nodePartitionBuilder_ == null) {
        nodePartition_ = null;
        onChanged();
      } else {
        nodePartition_ = null;
        nodePartitionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder getNodePartitionBuilder() {
      
      onChanged();
      return getNodePartitionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    public fintekkers.models.util.lock.NodePartitionOuterClass.NodePartitionOrBuilder getNodePartitionOrBuilder() {
      if (nodePartitionBuilder_ != null) {
        return nodePartitionBuilder_.getMessageOrBuilder();
      } else {
        return nodePartition_ == null ?
            fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.getDefaultInstance() : nodePartition_;
      }
    }
    /**
     * <pre>
     *The namespace/partition to get the lock for. Generally, when requesting a 
     *lock the caller should only specify the namespace, meaning that its up to 
     *the lock service to pick a partition for you. 
     *If the partition number is also specified the lock service will ONLY try
     *to get the lock on that parition and fail if it the lock is already taken
     * </pre>
     *
     * <code>.fintekkers.models.util.lock.NodePartition node_partition = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartitionOrBuilder> 
        getNodePartitionFieldBuilder() {
      if (nodePartitionBuilder_ == null) {
        nodePartitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartition.Builder, fintekkers.models.util.lock.NodePartitionOuterClass.NodePartitionOrBuilder>(
                getNodePartition(),
                getParentForChildren(),
                isClean());
        nodePartition_ = null;
      }
      return nodePartitionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:fintekkers.requests.util.lock.LockRequestProto)
  }

  // @@protoc_insertion_point(class_scope:fintekkers.requests.util.lock.LockRequestProto)
  private static final fintekkers.requests.util.lock.LockRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fintekkers.requests.util.lock.LockRequestProto();
  }

  public static fintekkers.requests.util.lock.LockRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LockRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<LockRequestProto>() {
    @java.lang.Override
    public LockRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LockRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LockRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LockRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fintekkers.requests.util.lock.LockRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

