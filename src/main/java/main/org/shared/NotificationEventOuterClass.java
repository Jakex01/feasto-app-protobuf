// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: notificationEvent.proto
// Protobuf Java Version: 4.28.2

package org.shared;

public final class NotificationEventOuterClass {
  private NotificationEventOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      NotificationEventOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NotificationEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.shared.NotificationEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string email = 1;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>bytes pdfContent = 2;</code>
     * @return The pdfContent.
     */
    com.google.protobuf.ByteString getPdfContent();
  }
  /**
   * Protobuf type {@code org.shared.NotificationEvent}
   */
  public static final class NotificationEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:org.shared.NotificationEvent)
      NotificationEventOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 2,
        /* suffix= */ "",
        NotificationEvent.class.getName());
    }
    // Use NotificationEvent.newBuilder() to construct.
    private NotificationEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private NotificationEvent() {
      email_ = "";
      pdfContent_ = com.google.protobuf.ByteString.EMPTY;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.shared.NotificationEventOuterClass.internal_static_org_shared_NotificationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.shared.NotificationEventOuterClass.internal_static_org_shared_NotificationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.shared.NotificationEventOuterClass.NotificationEvent.class, org.shared.NotificationEventOuterClass.NotificationEvent.Builder.class);
    }

    public static final int EMAIL_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object email_ = "";
    /**
     * <code>string email = 1;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PDFCONTENT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString pdfContent_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes pdfContent = 2;</code>
     * @return The pdfContent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPdfContent() {
      return pdfContent_;
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(email_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, email_);
      }
      if (!pdfContent_.isEmpty()) {
        output.writeBytes(2, pdfContent_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(email_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, email_);
      }
      if (!pdfContent_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, pdfContent_);
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
      if (!(obj instanceof org.shared.NotificationEventOuterClass.NotificationEvent)) {
        return super.equals(obj);
      }
      org.shared.NotificationEventOuterClass.NotificationEvent other = (org.shared.NotificationEventOuterClass.NotificationEvent) obj;

      if (!getEmail()
          .equals(other.getEmail())) return false;
      if (!getPdfContent()
          .equals(other.getPdfContent())) return false;
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
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (37 * hash) + PDFCONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getPdfContent().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.shared.NotificationEventOuterClass.NotificationEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.shared.NotificationEventOuterClass.NotificationEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.shared.NotificationEventOuterClass.NotificationEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.shared.NotificationEventOuterClass.NotificationEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.shared.NotificationEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.shared.NotificationEvent)
        org.shared.NotificationEventOuterClass.NotificationEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.shared.NotificationEventOuterClass.internal_static_org_shared_NotificationEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.shared.NotificationEventOuterClass.internal_static_org_shared_NotificationEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.shared.NotificationEventOuterClass.NotificationEvent.class, org.shared.NotificationEventOuterClass.NotificationEvent.Builder.class);
      }

      // Construct using org.shared.NotificationEventOuterClass.NotificationEvent.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        email_ = "";
        pdfContent_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.shared.NotificationEventOuterClass.internal_static_org_shared_NotificationEvent_descriptor;
      }

      @java.lang.Override
      public org.shared.NotificationEventOuterClass.NotificationEvent getDefaultInstanceForType() {
        return org.shared.NotificationEventOuterClass.NotificationEvent.getDefaultInstance();
      }

      @java.lang.Override
      public org.shared.NotificationEventOuterClass.NotificationEvent build() {
        org.shared.NotificationEventOuterClass.NotificationEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.shared.NotificationEventOuterClass.NotificationEvent buildPartial() {
        org.shared.NotificationEventOuterClass.NotificationEvent result = new org.shared.NotificationEventOuterClass.NotificationEvent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.shared.NotificationEventOuterClass.NotificationEvent result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.email_ = email_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pdfContent_ = pdfContent_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.shared.NotificationEventOuterClass.NotificationEvent) {
          return mergeFrom((org.shared.NotificationEventOuterClass.NotificationEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.shared.NotificationEventOuterClass.NotificationEvent other) {
        if (other == org.shared.NotificationEventOuterClass.NotificationEvent.getDefaultInstance()) return this;
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getPdfContent() != com.google.protobuf.ByteString.EMPTY) {
          setPdfContent(other.getPdfContent());
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
                email_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                pdfContent_ = input.readBytes();
                bitField0_ |= 0x00000002;
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
      private int bitField0_;

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 1;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 1;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 1;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        email_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        email_ = getDefaultInstance().getEmail();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string email = 1;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        email_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString pdfContent_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes pdfContent = 2;</code>
       * @return The pdfContent.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPdfContent() {
        return pdfContent_;
      }
      /**
       * <code>bytes pdfContent = 2;</code>
       * @param value The pdfContent to set.
       * @return This builder for chaining.
       */
      public Builder setPdfContent(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        pdfContent_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes pdfContent = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPdfContent() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pdfContent_ = getDefaultInstance().getPdfContent();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.shared.NotificationEvent)
    }

    // @@protoc_insertion_point(class_scope:org.shared.NotificationEvent)
    private static final org.shared.NotificationEventOuterClass.NotificationEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.shared.NotificationEventOuterClass.NotificationEvent();
    }

    public static org.shared.NotificationEventOuterClass.NotificationEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NotificationEvent>
        PARSER = new com.google.protobuf.AbstractParser<NotificationEvent>() {
      @java.lang.Override
      public NotificationEvent parsePartialFrom(
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

    public static com.google.protobuf.Parser<NotificationEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NotificationEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.shared.NotificationEventOuterClass.NotificationEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_shared_NotificationEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_shared_NotificationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027notificationEvent.proto\022\norg.shared\"6\n" +
      "\021NotificationEvent\022\r\n\005email\030\001 \001(\t\022\022\n\npdf" +
      "Content\030\002 \001(\014b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_shared_NotificationEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_shared_NotificationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_shared_NotificationEvent_descriptor,
        new java.lang.String[] { "Email", "PdfContent", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}