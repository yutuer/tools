// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FormationReq.proto

package com.pureland.common.protocal;

public final class FormationReqProtocal {
  private FormationReqProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FormationReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .FormationReq.RequestType requestType = 1;
    /**
     * <code>required .FormationReq.RequestType requestType = 1;</code>
     */
    boolean hasRequestType();
    /**
     * <code>required .FormationReq.RequestType requestType = 1;</code>
     */
    com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType getRequestType();

    // optional .FormationVO formation = 2;
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    boolean hasFormation();
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO getFormation();
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder getFormationOrBuilder();

    // optional int32 destFormationId = 3;
    /**
     * <code>optional int32 destFormationId = 3;</code>
     */
    boolean hasDestFormationId();
    /**
     * <code>optional int32 destFormationId = 3;</code>
     */
    int getDestFormationId();
  }
  /**
   * Protobuf type {@code FormationReq}
   */
  public static final class FormationReq extends
      com.google.protobuf.GeneratedMessage
      implements FormationReqOrBuilder {
    // Use FormationReq.newBuilder() to construct.
    private FormationReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FormationReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FormationReq defaultInstance;
    public static FormationReq getDefaultInstance() {
      return defaultInstance;
    }

    public FormationReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FormationReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType value = com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                requestType_ = value;
              }
              break;
            }
            case 18: {
              com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = formation_.toBuilder();
              }
              formation_ = input.readMessage(com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(formation_);
                formation_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              destFormationId_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pureland.common.protocal.FormationReqProtocal.internal_static_FormationReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.FormationReqProtocal.internal_static_FormationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.FormationReqProtocal.FormationReq.class, com.pureland.common.protocal.FormationReqProtocal.FormationReq.Builder.class);
    }

    public static com.google.protobuf.Parser<FormationReq> PARSER =
        new com.google.protobuf.AbstractParser<FormationReq>() {
      public FormationReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FormationReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FormationReq> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code FormationReq.RequestType}
     */
    public enum RequestType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>OpenFormationPanel = 1;</code>
       *
       * <pre>
       *打开阵型面板
       * </pre>
       */
      OpenFormationPanel(0, 1),
      /**
       * <code>SetClanFormation = 2;</code>
       *
       * <pre>
       *设置为公会阵法
       * </pre>
       */
      SetClanFormation(1, 2),
      /**
       * <code>SetPersonalFormation = 3;</code>
       *
       * <pre>
       *设置为个人阵法
       * </pre>
       */
      SetPersonalFormation(2, 3),
      /**
       * <code>SaveFormation = 4;</code>
       *
       * <pre>
       *保存阵法
       * </pre>
       */
      SaveFormation(3, 4),
      /**
       * <code>CopyFormation = 5;</code>
       *
       * <pre>
       *复制
       * </pre>
       */
      CopyFormation(4, 5),
      ;

      /**
       * <code>OpenFormationPanel = 1;</code>
       *
       * <pre>
       *打开阵型面板
       * </pre>
       */
      public static final int OpenFormationPanel_VALUE = 1;
      /**
       * <code>SetClanFormation = 2;</code>
       *
       * <pre>
       *设置为公会阵法
       * </pre>
       */
      public static final int SetClanFormation_VALUE = 2;
      /**
       * <code>SetPersonalFormation = 3;</code>
       *
       * <pre>
       *设置为个人阵法
       * </pre>
       */
      public static final int SetPersonalFormation_VALUE = 3;
      /**
       * <code>SaveFormation = 4;</code>
       *
       * <pre>
       *保存阵法
       * </pre>
       */
      public static final int SaveFormation_VALUE = 4;
      /**
       * <code>CopyFormation = 5;</code>
       *
       * <pre>
       *复制
       * </pre>
       */
      public static final int CopyFormation_VALUE = 5;


      public final int getNumber() { return value; }

      public static RequestType valueOf(int value) {
        switch (value) {
          case 1: return OpenFormationPanel;
          case 2: return SetClanFormation;
          case 3: return SetPersonalFormation;
          case 4: return SaveFormation;
          case 5: return CopyFormation;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<RequestType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
              public RequestType findValueByNumber(int number) {
                return RequestType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.pureland.common.protocal.FormationReqProtocal.FormationReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final RequestType[] VALUES = values();

      public static RequestType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private RequestType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:FormationReq.RequestType)
    }

    private int bitField0_;
    // required .FormationReq.RequestType requestType = 1;
    public static final int REQUESTTYPE_FIELD_NUMBER = 1;
    private com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType requestType_;
    /**
     * <code>required .FormationReq.RequestType requestType = 1;</code>
     */
    public boolean hasRequestType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .FormationReq.RequestType requestType = 1;</code>
     */
    public com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType getRequestType() {
      return requestType_;
    }

    // optional .FormationVO formation = 2;
    public static final int FORMATION_FIELD_NUMBER = 2;
    private com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO formation_;
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    public boolean hasFormation() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    public com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO getFormation() {
      return formation_;
    }
    /**
     * <code>optional .FormationVO formation = 2;</code>
     */
    public com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder getFormationOrBuilder() {
      return formation_;
    }

    // optional int32 destFormationId = 3;
    public static final int DESTFORMATIONID_FIELD_NUMBER = 3;
    private int destFormationId_;
    /**
     * <code>optional int32 destFormationId = 3;</code>
     */
    public boolean hasDestFormationId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 destFormationId = 3;</code>
     */
    public int getDestFormationId() {
      return destFormationId_;
    }

    private void initFields() {
      requestType_ = com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType.OpenFormationPanel;
      formation_ = com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.getDefaultInstance();
      destFormationId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRequestType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasFormation()) {
        if (!getFormation().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, requestType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, formation_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, destFormationId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, requestType_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, formation_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, destFormationId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.FormationReqProtocal.FormationReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.FormationReqProtocal.FormationReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FormationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.FormationReqProtocal.FormationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.FormationReqProtocal.internal_static_FormationReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.FormationReqProtocal.internal_static_FormationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.FormationReqProtocal.FormationReq.class, com.pureland.common.protocal.FormationReqProtocal.FormationReq.Builder.class);
      }

      // Construct using com.pureland.common.protocal.FormationReqProtocal.FormationReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFormationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        requestType_ = com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType.OpenFormationPanel;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (formationBuilder_ == null) {
          formation_ = com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.getDefaultInstance();
        } else {
          formationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        destFormationId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.FormationReqProtocal.internal_static_FormationReq_descriptor;
      }

      public com.pureland.common.protocal.FormationReqProtocal.FormationReq getDefaultInstanceForType() {
        return com.pureland.common.protocal.FormationReqProtocal.FormationReq.getDefaultInstance();
      }

      public com.pureland.common.protocal.FormationReqProtocal.FormationReq build() {
        com.pureland.common.protocal.FormationReqProtocal.FormationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.FormationReqProtocal.FormationReq buildPartial() {
        com.pureland.common.protocal.FormationReqProtocal.FormationReq result = new com.pureland.common.protocal.FormationReqProtocal.FormationReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.requestType_ = requestType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (formationBuilder_ == null) {
          result.formation_ = formation_;
        } else {
          result.formation_ = formationBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.destFormationId_ = destFormationId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.FormationReqProtocal.FormationReq) {
          return mergeFrom((com.pureland.common.protocal.FormationReqProtocal.FormationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.FormationReqProtocal.FormationReq other) {
        if (other == com.pureland.common.protocal.FormationReqProtocal.FormationReq.getDefaultInstance()) return this;
        if (other.hasRequestType()) {
          setRequestType(other.getRequestType());
        }
        if (other.hasFormation()) {
          mergeFormation(other.getFormation());
        }
        if (other.hasDestFormationId()) {
          setDestFormationId(other.getDestFormationId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRequestType()) {
          
          return false;
        }
        if (hasFormation()) {
          if (!getFormation().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.FormationReqProtocal.FormationReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.FormationReqProtocal.FormationReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .FormationReq.RequestType requestType = 1;
      private com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType requestType_ = com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType.OpenFormationPanel;
      /**
       * <code>required .FormationReq.RequestType requestType = 1;</code>
       */
      public boolean hasRequestType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .FormationReq.RequestType requestType = 1;</code>
       */
      public com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType getRequestType() {
        return requestType_;
      }
      /**
       * <code>required .FormationReq.RequestType requestType = 1;</code>
       */
      public Builder setRequestType(com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        requestType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .FormationReq.RequestType requestType = 1;</code>
       */
      public Builder clearRequestType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        requestType_ = com.pureland.common.protocal.FormationReqProtocal.FormationReq.RequestType.OpenFormationPanel;
        onChanged();
        return this;
      }

      // optional .FormationVO formation = 2;
      private com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO formation_ = com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder> formationBuilder_;
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public boolean hasFormation() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO getFormation() {
        if (formationBuilder_ == null) {
          return formation_;
        } else {
          return formationBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public Builder setFormation(com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO value) {
        if (formationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          formation_ = value;
          onChanged();
        } else {
          formationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public Builder setFormation(
          com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder builderForValue) {
        if (formationBuilder_ == null) {
          formation_ = builderForValue.build();
          onChanged();
        } else {
          formationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public Builder mergeFormation(com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO value) {
        if (formationBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              formation_ != com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.getDefaultInstance()) {
            formation_ =
              com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.newBuilder(formation_).mergeFrom(value).buildPartial();
          } else {
            formation_ = value;
          }
          onChanged();
        } else {
          formationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public Builder clearFormation() {
        if (formationBuilder_ == null) {
          formation_ = com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.getDefaultInstance();
          onChanged();
        } else {
          formationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder getFormationBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getFormationFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      public com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder getFormationOrBuilder() {
        if (formationBuilder_ != null) {
          return formationBuilder_.getMessageOrBuilder();
        } else {
          return formation_;
        }
      }
      /**
       * <code>optional .FormationVO formation = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder> 
          getFormationFieldBuilder() {
        if (formationBuilder_ == null) {
          formationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVO.Builder, com.pureland.common.protocal.vo.FormationVOProtocal.FormationVOOrBuilder>(
                  formation_,
                  getParentForChildren(),
                  isClean());
          formation_ = null;
        }
        return formationBuilder_;
      }

      // optional int32 destFormationId = 3;
      private int destFormationId_ ;
      /**
       * <code>optional int32 destFormationId = 3;</code>
       */
      public boolean hasDestFormationId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 destFormationId = 3;</code>
       */
      public int getDestFormationId() {
        return destFormationId_;
      }
      /**
       * <code>optional int32 destFormationId = 3;</code>
       */
      public Builder setDestFormationId(int value) {
        bitField0_ |= 0x00000004;
        destFormationId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 destFormationId = 3;</code>
       */
      public Builder clearDestFormationId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        destFormationId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:FormationReq)
    }

    static {
      defaultInstance = new FormationReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:FormationReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FormationReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FormationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022FormationReq.proto\032\021FormationVO.proto\"" +
      "\365\001\n\014FormationReq\022.\n\013requestType\030\001 \002(\0162\031." +
      "FormationReq.RequestType\022\037\n\tformation\030\002 " +
      "\001(\0132\014.FormationVO\022\027\n\017destFormationId\030\003 \001" +
      "(\005\"{\n\013RequestType\022\026\n\022OpenFormationPanel\020" +
      "\001\022\024\n\020SetClanFormation\020\002\022\030\n\024SetPersonalFo" +
      "rmation\020\003\022\021\n\rSaveFormation\020\004\022\021\n\rCopyForm" +
      "ation\020\005B4\n\034com.pureland.common.protocalB" +
      "\024FormationReqProtocal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FormationReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FormationReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FormationReq_descriptor,
              new java.lang.String[] { "RequestType", "Formation", "DestFormationId", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.pureland.common.protocal.vo.FormationVOProtocal.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}