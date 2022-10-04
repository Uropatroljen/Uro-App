// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UroCommand.proto

package com.example.uropatruljen_app.protobuf;

/**
 * Protobuf type {@code uropatruljen_app.Light}
 */
public final class Light extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uropatruljen_app.Light)
    LightOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Light.newBuilder() to construct.
  private Light(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Light() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Light();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Light(
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
          case 8: {
            bitField0_ |= 0x00000001;
            state_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            red_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            green_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            blue_ = input.readInt32();
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
    return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_Light_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_Light_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.uropatruljen_app.protobuf.Light.class, com.example.uropatruljen_app.protobuf.Light.Builder.class);
  }

  private int bitField0_;
  public static final int STATE_FIELD_NUMBER = 1;
  private boolean state_;
  /**
   * <code>optional bool state = 1;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool state = 1;</code>
   * @return The state.
   */
  @java.lang.Override
  public boolean getState() {
    return state_;
  }

  public static final int RED_FIELD_NUMBER = 2;
  private int red_;
  /**
   * <code>optional int32 red = 2;</code>
   * @return Whether the red field is set.
   */
  @java.lang.Override
  public boolean hasRed() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 red = 2;</code>
   * @return The red.
   */
  @java.lang.Override
  public int getRed() {
    return red_;
  }

  public static final int GREEN_FIELD_NUMBER = 3;
  private int green_;
  /**
   * <code>optional int32 green = 3;</code>
   * @return Whether the green field is set.
   */
  @java.lang.Override
  public boolean hasGreen() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 green = 3;</code>
   * @return The green.
   */
  @java.lang.Override
  public int getGreen() {
    return green_;
  }

  public static final int BLUE_FIELD_NUMBER = 4;
  private int blue_;
  /**
   * <code>optional int32 blue = 4;</code>
   * @return Whether the blue field is set.
   */
  @java.lang.Override
  public boolean hasBlue() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int32 blue = 4;</code>
   * @return The blue.
   */
  @java.lang.Override
  public int getBlue() {
    return blue_;
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
      output.writeBool(1, state_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, red_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, green_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, blue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, state_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, red_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, green_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, blue_);
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
    if (!(obj instanceof com.example.uropatruljen_app.protobuf.Light)) {
      return super.equals(obj);
    }
    com.example.uropatruljen_app.protobuf.Light other = (com.example.uropatruljen_app.protobuf.Light) obj;

    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (getState()
          != other.getState()) return false;
    }
    if (hasRed() != other.hasRed()) return false;
    if (hasRed()) {
      if (getRed()
          != other.getRed()) return false;
    }
    if (hasGreen() != other.hasGreen()) return false;
    if (hasGreen()) {
      if (getGreen()
          != other.getGreen()) return false;
    }
    if (hasBlue() != other.hasBlue()) return false;
    if (hasBlue()) {
      if (getBlue()
          != other.getBlue()) return false;
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
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getState());
    }
    if (hasRed()) {
      hash = (37 * hash) + RED_FIELD_NUMBER;
      hash = (53 * hash) + getRed();
    }
    if (hasGreen()) {
      hash = (37 * hash) + GREEN_FIELD_NUMBER;
      hash = (53 * hash) + getGreen();
    }
    if (hasBlue()) {
      hash = (37 * hash) + BLUE_FIELD_NUMBER;
      hash = (53 * hash) + getBlue();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.uropatruljen_app.protobuf.Light parseFrom(
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
  public static Builder newBuilder(com.example.uropatruljen_app.protobuf.Light prototype) {
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
   * Protobuf type {@code uropatruljen_app.Light}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uropatruljen_app.Light)
      com.example.uropatruljen_app.protobuf.LightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_Light_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_Light_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.uropatruljen_app.protobuf.Light.class, com.example.uropatruljen_app.protobuf.Light.Builder.class);
    }

    // Construct using com.example.uropatruljen_app.protobuf.Light.newBuilder()
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
      state_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      red_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      green_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      blue_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.uropatruljen_app.protobuf.UroCommand.internal_static_uropatruljen_app_Light_descriptor;
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.Light getDefaultInstanceForType() {
      return com.example.uropatruljen_app.protobuf.Light.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.Light build() {
      com.example.uropatruljen_app.protobuf.Light result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.uropatruljen_app.protobuf.Light buildPartial() {
      com.example.uropatruljen_app.protobuf.Light result = new com.example.uropatruljen_app.protobuf.Light(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.red_ = red_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.green_ = green_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.blue_ = blue_;
        to_bitField0_ |= 0x00000008;
      }
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
      if (other instanceof com.example.uropatruljen_app.protobuf.Light) {
        return mergeFrom((com.example.uropatruljen_app.protobuf.Light)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.uropatruljen_app.protobuf.Light other) {
      if (other == com.example.uropatruljen_app.protobuf.Light.getDefaultInstance()) return this;
      if (other.hasState()) {
        setState(other.getState());
      }
      if (other.hasRed()) {
        setRed(other.getRed());
      }
      if (other.hasGreen()) {
        setGreen(other.getGreen());
      }
      if (other.hasBlue()) {
        setBlue(other.getBlue());
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
      com.example.uropatruljen_app.protobuf.Light parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.uropatruljen_app.protobuf.Light) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean state_ ;
    /**
     * <code>optional bool state = 1;</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public boolean getState() {
      return state_;
    }
    /**
     * <code>optional bool state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(boolean value) {
      bitField0_ |= 0x00000001;
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = false;
      onChanged();
      return this;
    }

    private int red_ ;
    /**
     * <code>optional int32 red = 2;</code>
     * @return Whether the red field is set.
     */
    @java.lang.Override
    public boolean hasRed() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 red = 2;</code>
     * @return The red.
     */
    @java.lang.Override
    public int getRed() {
      return red_;
    }
    /**
     * <code>optional int32 red = 2;</code>
     * @param value The red to set.
     * @return This builder for chaining.
     */
    public Builder setRed(int value) {
      bitField0_ |= 0x00000002;
      red_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 red = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      red_ = 0;
      onChanged();
      return this;
    }

    private int green_ ;
    /**
     * <code>optional int32 green = 3;</code>
     * @return Whether the green field is set.
     */
    @java.lang.Override
    public boolean hasGreen() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 green = 3;</code>
     * @return The green.
     */
    @java.lang.Override
    public int getGreen() {
      return green_;
    }
    /**
     * <code>optional int32 green = 3;</code>
     * @param value The green to set.
     * @return This builder for chaining.
     */
    public Builder setGreen(int value) {
      bitField0_ |= 0x00000004;
      green_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 green = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGreen() {
      bitField0_ = (bitField0_ & ~0x00000004);
      green_ = 0;
      onChanged();
      return this;
    }

    private int blue_ ;
    /**
     * <code>optional int32 blue = 4;</code>
     * @return Whether the blue field is set.
     */
    @java.lang.Override
    public boolean hasBlue() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 blue = 4;</code>
     * @return The blue.
     */
    @java.lang.Override
    public int getBlue() {
      return blue_;
    }
    /**
     * <code>optional int32 blue = 4;</code>
     * @param value The blue to set.
     * @return This builder for chaining.
     */
    public Builder setBlue(int value) {
      bitField0_ |= 0x00000008;
      blue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 blue = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlue() {
      bitField0_ = (bitField0_ & ~0x00000008);
      blue_ = 0;
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


    // @@protoc_insertion_point(builder_scope:uropatruljen_app.Light)
  }

  // @@protoc_insertion_point(class_scope:uropatruljen_app.Light)
  private static final com.example.uropatruljen_app.protobuf.Light DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.uropatruljen_app.protobuf.Light();
  }

  public static com.example.uropatruljen_app.protobuf.Light getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Light>
      PARSER = new com.google.protobuf.AbstractParser<Light>() {
    @java.lang.Override
    public Light parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Light(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Light> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Light> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.uropatruljen_app.protobuf.Light getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
