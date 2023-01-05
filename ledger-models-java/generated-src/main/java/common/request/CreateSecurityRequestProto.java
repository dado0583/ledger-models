// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: requests/security/create_security_request.proto

package common.request;

/**
 * <pre>
 *Use this request to create or update securities. Uniqueness is guaranteed via the UUID.
 *Security identifiers do not guarantee uniqueness. As an example a bond ISIN or stock ticker
 *may be re-used over time. Therefore if you send 2 requests with the same security identifier
 *you will create two securities. In order to avoid duplication you should either re-use the UUID
 *when calling the API, in which case an update will be applied. If you do not know the UUID, you
 *should first do a search operation.
 *It is preferred that the client generates the UUID. This will avoid issues in the network leading
 *to duplicate securities.
 * </pre>
 *
 * Protobuf type {@code security.CreateSecurityRequestProto}
 */
public final class CreateSecurityRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:security.CreateSecurityRequestProto)
    CreateSecurityRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSecurityRequestProto.newBuilder() to construct.
  private CreateSecurityRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSecurityRequestProto() {
    objectClass_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSecurityRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSecurityRequestProto(
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
          case 162: {
            common.models.security.SecurityProto.Builder subBuilder = null;
            if (securityInput_ != null) {
              subBuilder = securityInput_.toBuilder();
            }
            securityInput_ = input.readMessage(common.models.security.SecurityProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(securityInput_);
              securityInput_ = subBuilder.buildPartial();
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
    return common.request.CreateSecurityRequestProtos.internal_static_security_CreateSecurityRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return common.request.CreateSecurityRequestProtos.internal_static_security_CreateSecurityRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            common.request.CreateSecurityRequestProto.class, common.request.CreateSecurityRequestProto.Builder.class);
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

  public static final int SECURITY_INPUT_FIELD_NUMBER = 20;
  private common.models.security.SecurityProto securityInput_;
  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.security.SecurityProto security_input = 20;</code>
   * @return Whether the securityInput field is set.
   */
  @java.lang.Override
  public boolean hasSecurityInput() {
    return securityInput_ != null;
  }
  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.security.SecurityProto security_input = 20;</code>
   * @return The securityInput.
   */
  @java.lang.Override
  public common.models.security.SecurityProto getSecurityInput() {
    return securityInput_ == null ? common.models.security.SecurityProto.getDefaultInstance() : securityInput_;
  }
  /**
   * <pre>
   *A fully formed security object to be created or updated. Validations may be applied
   *before creating. For example creating an equity security with bond fields may be invalid and
   *therefore rejected.
   * </pre>
   *
   * <code>.security.SecurityProto security_input = 20;</code>
   */
  @java.lang.Override
  public common.models.security.SecurityProtoOrBuilder getSecurityInputOrBuilder() {
    return getSecurityInput();
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
    if (securityInput_ != null) {
      output.writeMessage(20, getSecurityInput());
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
    if (securityInput_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(20, getSecurityInput());
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
    if (!(obj instanceof common.request.CreateSecurityRequestProto)) {
      return super.equals(obj);
    }
    common.request.CreateSecurityRequestProto other = (common.request.CreateSecurityRequestProto) obj;

    if (!getObjectClass()
        .equals(other.getObjectClass())) return false;
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (hasSecurityInput() != other.hasSecurityInput()) return false;
    if (hasSecurityInput()) {
      if (!getSecurityInput()
          .equals(other.getSecurityInput())) return false;
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
    if (hasSecurityInput()) {
      hash = (37 * hash) + SECURITY_INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityInput().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static common.request.CreateSecurityRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.request.CreateSecurityRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static common.request.CreateSecurityRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static common.request.CreateSecurityRequestProto parseFrom(
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
  public static Builder newBuilder(common.request.CreateSecurityRequestProto prototype) {
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
   * <pre>
   *Use this request to create or update securities. Uniqueness is guaranteed via the UUID.
   *Security identifiers do not guarantee uniqueness. As an example a bond ISIN or stock ticker
   *may be re-used over time. Therefore if you send 2 requests with the same security identifier
   *you will create two securities. In order to avoid duplication you should either re-use the UUID
   *when calling the API, in which case an update will be applied. If you do not know the UUID, you
   *should first do a search operation.
   *It is preferred that the client generates the UUID. This will avoid issues in the network leading
   *to duplicate securities.
   * </pre>
   *
   * Protobuf type {@code security.CreateSecurityRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:security.CreateSecurityRequestProto)
      common.request.CreateSecurityRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return common.request.CreateSecurityRequestProtos.internal_static_security_CreateSecurityRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return common.request.CreateSecurityRequestProtos.internal_static_security_CreateSecurityRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              common.request.CreateSecurityRequestProto.class, common.request.CreateSecurityRequestProto.Builder.class);
    }

    // Construct using common.request.CreateSecurityRequestProto.newBuilder()
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

      if (securityInputBuilder_ == null) {
        securityInput_ = null;
      } else {
        securityInput_ = null;
        securityInputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return common.request.CreateSecurityRequestProtos.internal_static_security_CreateSecurityRequestProto_descriptor;
    }

    @java.lang.Override
    public common.request.CreateSecurityRequestProto getDefaultInstanceForType() {
      return common.request.CreateSecurityRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public common.request.CreateSecurityRequestProto build() {
      common.request.CreateSecurityRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public common.request.CreateSecurityRequestProto buildPartial() {
      common.request.CreateSecurityRequestProto result = new common.request.CreateSecurityRequestProto(this);
      result.objectClass_ = objectClass_;
      result.version_ = version_;
      if (securityInputBuilder_ == null) {
        result.securityInput_ = securityInput_;
      } else {
        result.securityInput_ = securityInputBuilder_.build();
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
      if (other instanceof common.request.CreateSecurityRequestProto) {
        return mergeFrom((common.request.CreateSecurityRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(common.request.CreateSecurityRequestProto other) {
      if (other == common.request.CreateSecurityRequestProto.getDefaultInstance()) return this;
      if (!other.getObjectClass().isEmpty()) {
        objectClass_ = other.objectClass_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.hasSecurityInput()) {
        mergeSecurityInput(other.getSecurityInput());
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
      common.request.CreateSecurityRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (common.request.CreateSecurityRequestProto) e.getUnfinishedMessage();
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

    private common.models.security.SecurityProto securityInput_;
    private com.google.protobuf.SingleFieldBuilderV3<
        common.models.security.SecurityProto, common.models.security.SecurityProto.Builder, common.models.security.SecurityProtoOrBuilder> securityInputBuilder_;
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     * @return Whether the securityInput field is set.
     */
    public boolean hasSecurityInput() {
      return securityInputBuilder_ != null || securityInput_ != null;
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     * @return The securityInput.
     */
    public common.models.security.SecurityProto getSecurityInput() {
      if (securityInputBuilder_ == null) {
        return securityInput_ == null ? common.models.security.SecurityProto.getDefaultInstance() : securityInput_;
      } else {
        return securityInputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public Builder setSecurityInput(common.models.security.SecurityProto value) {
      if (securityInputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityInput_ = value;
        onChanged();
      } else {
        securityInputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public Builder setSecurityInput(
        common.models.security.SecurityProto.Builder builderForValue) {
      if (securityInputBuilder_ == null) {
        securityInput_ = builderForValue.build();
        onChanged();
      } else {
        securityInputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public Builder mergeSecurityInput(common.models.security.SecurityProto value) {
      if (securityInputBuilder_ == null) {
        if (securityInput_ != null) {
          securityInput_ =
            common.models.security.SecurityProto.newBuilder(securityInput_).mergeFrom(value).buildPartial();
        } else {
          securityInput_ = value;
        }
        onChanged();
      } else {
        securityInputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public Builder clearSecurityInput() {
      if (securityInputBuilder_ == null) {
        securityInput_ = null;
        onChanged();
      } else {
        securityInput_ = null;
        securityInputBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public common.models.security.SecurityProto.Builder getSecurityInputBuilder() {
      
      onChanged();
      return getSecurityInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    public common.models.security.SecurityProtoOrBuilder getSecurityInputOrBuilder() {
      if (securityInputBuilder_ != null) {
        return securityInputBuilder_.getMessageOrBuilder();
      } else {
        return securityInput_ == null ?
            common.models.security.SecurityProto.getDefaultInstance() : securityInput_;
      }
    }
    /**
     * <pre>
     *A fully formed security object to be created or updated. Validations may be applied
     *before creating. For example creating an equity security with bond fields may be invalid and
     *therefore rejected.
     * </pre>
     *
     * <code>.security.SecurityProto security_input = 20;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        common.models.security.SecurityProto, common.models.security.SecurityProto.Builder, common.models.security.SecurityProtoOrBuilder> 
        getSecurityInputFieldBuilder() {
      if (securityInputBuilder_ == null) {
        securityInputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            common.models.security.SecurityProto, common.models.security.SecurityProto.Builder, common.models.security.SecurityProtoOrBuilder>(
                getSecurityInput(),
                getParentForChildren(),
                isClean());
        securityInput_ = null;
      }
      return securityInputBuilder_;
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


    // @@protoc_insertion_point(builder_scope:security.CreateSecurityRequestProto)
  }

  // @@protoc_insertion_point(class_scope:security.CreateSecurityRequestProto)
  private static final common.request.CreateSecurityRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new common.request.CreateSecurityRequestProto();
  }

  public static common.request.CreateSecurityRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecurityRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<CreateSecurityRequestProto>() {
    @java.lang.Override
    public CreateSecurityRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSecurityRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSecurityRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecurityRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public common.request.CreateSecurityRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
