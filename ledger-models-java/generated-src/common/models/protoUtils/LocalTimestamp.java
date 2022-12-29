// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/util/local_timestamp.proto

package common.models.protoUtils;

public final class LocalTimestamp {
  private LocalTimestamp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LocalTimestampProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:util.LocalTimestampProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    boolean hasTimestamp();
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return The timestamp.
     */
    com.google.protobuf.Timestamp getTimestamp();
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

    /**
     * <pre>
     *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
     *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     * </pre>
     *
     * <code>string time_zone = 2;</code>
     * @return The timeZone.
     */
    java.lang.String getTimeZone();
    /**
     * <pre>
     *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
     *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     * </pre>
     *
     * <code>string time_zone = 2;</code>
     * @return The bytes for timeZone.
     */
    com.google.protobuf.ByteString
        getTimeZoneBytes();
  }
  /**
   * Protobuf type {@code util.LocalTimestampProto}
   */
  public static final class LocalTimestampProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:util.LocalTimestampProto)
      LocalTimestampProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LocalTimestampProto.newBuilder() to construct.
    private LocalTimestampProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LocalTimestampProto() {
      timeZone_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LocalTimestampProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return common.models.protoUtils.LocalTimestamp.internal_static_util_LocalTimestampProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return common.models.protoUtils.LocalTimestamp.internal_static_util_LocalTimestampProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              common.models.protoUtils.LocalTimestamp.LocalTimestampProto.class, common.models.protoUtils.LocalTimestamp.LocalTimestampProto.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp timestamp_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return timestamp_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getTimestamp() {
      return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      return getTimestamp();
    }

    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private volatile java.lang.Object timeZone_;
    /**
     * <pre>
     *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
     *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     * </pre>
     *
     * <code>string time_zone = 2;</code>
     * @return The timeZone.
     */
    @java.lang.Override
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeZone_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
     *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     * </pre>
     *
     * <code>string time_zone = 2;</code>
     * @return The bytes for timeZone.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (timestamp_ != null) {
        output.writeMessage(1, getTimestamp());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timeZone_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTimestamp());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, timeZone_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof common.models.protoUtils.LocalTimestamp.LocalTimestampProto)) {
        return super.equals(obj);
      }
      common.models.protoUtils.LocalTimestamp.LocalTimestampProto other = (common.models.protoUtils.LocalTimestamp.LocalTimestampProto) obj;

      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (!getTimestamp()
            .equals(other.getTimestamp())) return false;
      }
      if (!getTimeZone()
          .equals(other.getTimeZone())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + getTimestamp().hashCode();
      }
      hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
      hash = (53 * hash) + getTimeZone().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto parseFrom(
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
    public static Builder newBuilder(common.models.protoUtils.LocalTimestamp.LocalTimestampProto prototype) {
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
     * Protobuf type {@code util.LocalTimestampProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:util.LocalTimestampProto)
        common.models.protoUtils.LocalTimestamp.LocalTimestampProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return common.models.protoUtils.LocalTimestamp.internal_static_util_LocalTimestampProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return common.models.protoUtils.LocalTimestamp.internal_static_util_LocalTimestampProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                common.models.protoUtils.LocalTimestamp.LocalTimestampProto.class, common.models.protoUtils.LocalTimestamp.LocalTimestampProto.Builder.class);
      }

      // Construct using common.models.protoUtils.LocalTimestamp.LocalTimestampProto.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (timestampBuilder_ == null) {
          timestamp_ = null;
        } else {
          timestamp_ = null;
          timestampBuilder_ = null;
        }
        timeZone_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return common.models.protoUtils.LocalTimestamp.internal_static_util_LocalTimestampProto_descriptor;
      }

      @java.lang.Override
      public common.models.protoUtils.LocalTimestamp.LocalTimestampProto getDefaultInstanceForType() {
        return common.models.protoUtils.LocalTimestamp.LocalTimestampProto.getDefaultInstance();
      }

      @java.lang.Override
      public common.models.protoUtils.LocalTimestamp.LocalTimestampProto build() {
        common.models.protoUtils.LocalTimestamp.LocalTimestampProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public common.models.protoUtils.LocalTimestamp.LocalTimestampProto buildPartial() {
        common.models.protoUtils.LocalTimestamp.LocalTimestampProto result = new common.models.protoUtils.LocalTimestamp.LocalTimestampProto(this);
        if (timestampBuilder_ == null) {
          result.timestamp_ = timestamp_;
        } else {
          result.timestamp_ = timestampBuilder_.build();
        }
        result.timeZone_ = timeZone_;
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
        if (other instanceof common.models.protoUtils.LocalTimestamp.LocalTimestampProto) {
          return mergeFrom((common.models.protoUtils.LocalTimestamp.LocalTimestampProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(common.models.protoUtils.LocalTimestamp.LocalTimestampProto other) {
        if (other == common.models.protoUtils.LocalTimestamp.LocalTimestampProto.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          mergeTimestamp(other.getTimestamp());
        }
        if (!other.getTimeZone().isEmpty()) {
          timeZone_ = other.timeZone_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getTimestampFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 18: {
                timeZone_ = input.readStringRequireUtf8();

                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private com.google.protobuf.Timestamp timestamp_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       * @return Whether the timestamp field is set.
       */
      public boolean hasTimestamp() {
        return timestampBuilder_ != null || timestamp_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       * @return The timestamp.
       */
      public com.google.protobuf.Timestamp getTimestamp() {
        if (timestampBuilder_ == null) {
          return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
        } else {
          return timestampBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder setTimestamp(com.google.protobuf.Timestamp value) {
        if (timestampBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          timestamp_ = value;
          onChanged();
        } else {
          timestampBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder setTimestamp(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (timestampBuilder_ == null) {
          timestamp_ = builderForValue.build();
          onChanged();
        } else {
          timestampBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
        if (timestampBuilder_ == null) {
          if (timestamp_ != null) {
            timestamp_ =
              com.google.protobuf.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
          } else {
            timestamp_ = value;
          }
          onChanged();
        } else {
          timestampBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        if (timestampBuilder_ == null) {
          timestamp_ = null;
          onChanged();
        } else {
          timestamp_ = null;
          timestampBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
        
        onChanged();
        return getTimestampFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
        if (timestampBuilder_ != null) {
          return timestampBuilder_.getMessageOrBuilder();
        } else {
          return timestamp_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp timestamp = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getTimestampFieldBuilder() {
        if (timestampBuilder_ == null) {
          timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getTimestamp(),
                  getParentForChildren(),
                  isClean());
          timestamp_ = null;
        }
        return timestampBuilder_;
      }

      private java.lang.Object timeZone_ = "";
      /**
       * <pre>
       *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
       *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
       * </pre>
       *
       * <code>string time_zone = 2;</code>
       * @return The timeZone.
       */
      public java.lang.String getTimeZone() {
        java.lang.Object ref = timeZone_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          timeZone_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
       *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
       * </pre>
       *
       * <code>string time_zone = 2;</code>
       * @return The bytes for timeZone.
       */
      public com.google.protobuf.ByteString
          getTimeZoneBytes() {
        java.lang.Object ref = timeZone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timeZone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
       *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
       * </pre>
       *
       * <code>string time_zone = 2;</code>
       * @param value The timeZone to set.
       * @return This builder for chaining.
       */
      public Builder setTimeZone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        timeZone_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
       *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
       * </pre>
       *
       * <code>string time_zone = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeZone() {
        
        timeZone_ = getDefaultInstance().getTimeZone();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *TODO: Need to decide how to model this: https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
       *https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
       * </pre>
       *
       * <code>string time_zone = 2;</code>
       * @param value The bytes for timeZone to set.
       * @return This builder for chaining.
       */
      public Builder setTimeZoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        timeZone_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:util.LocalTimestampProto)
    }

    // @@protoc_insertion_point(class_scope:util.LocalTimestampProto)
    private static final common.models.protoUtils.LocalTimestamp.LocalTimestampProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new common.models.protoUtils.LocalTimestamp.LocalTimestampProto();
    }

    public static common.models.protoUtils.LocalTimestamp.LocalTimestampProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LocalTimestampProto>
        PARSER = new com.google.protobuf.AbstractParser<LocalTimestampProto>() {
      @java.lang.Override
      public LocalTimestampProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LocalTimestampProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LocalTimestampProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public common.models.protoUtils.LocalTimestamp.LocalTimestampProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_util_LocalTimestampProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_util_LocalTimestampProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!models/util/local_timestamp.proto\022\004uti" +
      "l\032\037google/protobuf/timestamp.proto\"W\n\023Lo" +
      "calTimestampProto\022-\n\ttimestamp\030\001 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022\021\n\ttime_zone\030\002 " +
      "\001(\tB\032\n\030common.models.protoUtilsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_util_LocalTimestampProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_util_LocalTimestampProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_util_LocalTimestampProto_descriptor,
        new java.lang.String[] { "Timestamp", "TimeZone", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
