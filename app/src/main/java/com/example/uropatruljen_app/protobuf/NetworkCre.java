// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UroCommand.proto

package com.example.uropatruljen_app.protobuf;

/**
 * Protobuf type {@code uropatruljen_app.NetworkCre}
 */
public final class NetworkCre extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uropatruljen_app.NetworkCre)
    NetworkCreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkCre.newBuilder() to construct.
  private NetworkCre(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkCre() {
    ssid_ = "";
    psw_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkCre();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NetworkCre(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            bitField0_ |= 0x00000001;
            ssid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            psw_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_NetworkCre_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_NetworkCre_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.uropatruljen_app.protobuf.NetworkCre.class, com.example.uropatruljen_app.protobuf.NetworkCre.Builder.class);
  }

  private int bitField0_;
  public static final int SSID_FIELD_NUMBER = 1;
  private volatile java.lang.Object ssid_;
  /**
   * <code>optional string ssid = 1;</code>
   * @return Whether the ssid field is set.
   */
  @java.lang.Override
  public boolean hasSsid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string ssid = 1;</code>
   * @return The ssid.
   */
  @java.lang.Override
  public java.lang.String getSsid() {
    java.lang.Object ref = ssid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ssid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ssid = 1;</code>
   * @return The bytes for ssid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSsidBytes() {
    java.lang.Object ref = ssid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ssid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PSW_FIELD_NUMBER = 2;
  private volatile java.lang.Object psw_;
  /**
   * <code>optional string psw = 2;</code>
   * @return Whether the psw field is set.
   */
  @java.lang.Override
  public boolean hasPsw() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string psw = 2;</code>
   * @return The psw.
   */
  @java.lang.Override
  public java.lang.String getPsw() {
    java.lang.Object ref = psw_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      psw_ = s;
      return s;
    }
  }
  /**
   * <code>optional string psw = 2;</code>
   * @return The bytes for psw.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPswBytes() {
    java.lang.Object ref = psw_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      psw_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ssid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, psw_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ssid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, psw_);
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
    if (!(obj instanceof com.example.uropatruljen_app.protobuf.NetworkCre)) {
      return super.equals(obj);
    }
    com.example.uropatruljen_app.protobuf.NetworkCre other = (com.example.uropatruljen_app.protobuf.NetworkCre) obj;

    if (hasSsid() != other.hasSsid()) return false;
    if (hasSsid()) {
      if (!getSsid()
          .equals(other.getSsid())) return false;
    }
    if (hasPsw() != other.hasPsw()) return false;
    if (hasPsw()) {
      if (!getPsw()
          .equals(other.getPsw())) return false;
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
    if (hasSsid()) {
      hash = (37 * hash) + SSID_FIELD_NUMBER;
      hash = (53 * hash) + getSsid().hashCode();
    }
    if (hasPsw()) {
      hash = (37 * hash) + PSW_FIELD_NUMBER;
      hash = (53 * hash) + getPsw().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.NetworkCre parseFrom(
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
  public static Builder newBuilder(com.example.uropatruljen_app.protobuf.NetworkCre prototype) {
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
   * Protobuf type {@code uropatruljen_app.NetworkCre}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uropatruljen_app.NetworkCre)
      com.example.uropatruljen_app.protobuf.NetworkCreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_NetworkCre_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_NetworkCre_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.uropatruljen_app.protobuf.NetworkCre.class, com.example.uropatruljen_app.protobuf.NetworkCre.Builder.class);
    }

    // Construct using com.example.uropatruljen_app.protobuf.NetworkCre.newBuilder()
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
      ssid_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      psw_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_NetworkCre_descriptor;
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.NetworkCre getDefaultInstanceForType() {
      return com.example.uropatruljen_app.protobuf.NetworkCre.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.NetworkCre build() {
      com.example.uropatruljen_app.protobuf.NetworkCre result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.NetworkCre buildPartial() {
      com.example.uropatruljen_app.protobuf.NetworkCre result = new com.example.uropatruljen_app.protobuf.NetworkCre(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.ssid_ = ssid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.psw_ = psw_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.example.uropatruljen_app.protobuf.NetworkCre) {
        return mergeFrom((com.example.uropatruljen_app.protobuf.NetworkCre)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.uropatruljen_app.protobuf.NetworkCre other) {
      if (other == com.example.uropatruljen_app.protobuf.NetworkCre.getDefaultInstance()) return this;
      if (other.hasSsid()) {
        bitField0_ |= 0x00000001;
        ssid_ = other.ssid_;
        onChanged();
      }
      if (other.hasPsw()) {
        bitField0_ |= 0x00000002;
        psw_ = other.psw_;
        onChanged();
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
      com.example.uropatruljen_app.protobuf.NetworkCre parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.uropatruljen_app.protobuf.NetworkCre) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object ssid_ = "";
    /**
     * <code>optional string ssid = 1;</code>
     * @return Whether the ssid field is set.
     */
    public boolean hasSsid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string ssid = 1;</code>
     * @return The ssid.
     */
    public java.lang.String getSsid() {
      java.lang.Object ref = ssid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ssid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ssid = 1;</code>
     * @return The bytes for ssid.
     */
    public com.google.protobuf.ByteString
        getSsidBytes() {
      java.lang.Object ref = ssid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ssid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ssid = 1;</code>
     * @param value The ssid to set.
     * @return This builder for chaining.
     */
    public Builder setSsid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      ssid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ssid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSsid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ssid_ = getDefaultInstance().getSsid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ssid = 1;</code>
     * @param value The bytes for ssid to set.
     * @return This builder for chaining.
     */
    public Builder setSsidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      ssid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object psw_ = "";
    /**
     * <code>optional string psw = 2;</code>
     * @return Whether the psw field is set.
     */
    public boolean hasPsw() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string psw = 2;</code>
     * @return The psw.
     */
    public java.lang.String getPsw() {
      java.lang.Object ref = psw_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        psw_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string psw = 2;</code>
     * @return The bytes for psw.
     */
    public com.google.protobuf.ByteString
        getPswBytes() {
      java.lang.Object ref = psw_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        psw_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string psw = 2;</code>
     * @param value The psw to set.
     * @return This builder for chaining.
     */
    public Builder setPsw(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      psw_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string psw = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPsw() {
      bitField0_ = (bitField0_ & ~0x00000002);
      psw_ = getDefaultInstance().getPsw();
      onChanged();
      return this;
    }
    /**
     * <code>optional string psw = 2;</code>
     * @param value The bytes for psw to set.
     * @return This builder for chaining.
     */
    public Builder setPswBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      psw_ = value;
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


    // @@protoc_insertion_point(builder_scope:uropatruljen_app.NetworkCre)
  }

  // @@protoc_insertion_point(class_scope:uropatruljen_app.NetworkCre)
  private static final com.example.uropatruljen_app.protobuf.NetworkCre DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.uropatruljen_app.protobuf.NetworkCre();
  }

  public static com.example.uropatruljen_app.protobuf.NetworkCre getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkCre>
      PARSER = new com.google.protobuf.AbstractParser<NetworkCre>() {
    @java.lang.Override
    public NetworkCre parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NetworkCre(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkCre> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkCre> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.uropatruljen_app.protobuf.NetworkCre getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

