package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Slot value instance
 */
@ApiModel(description = "Slot value instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class SlotValue   {
  @JsonProperty("slotTypeId")
  private String slotTypeId;

  /**
   * The value provenance
   */
  public enum SourceTypeEnum {
    USER_INPUT("USER_INPUT"),
    
    KNOWLEGDE_BASE("KNOWLEGDE_BASE"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("sourceType")
  private SourceTypeEnum sourceType = SourceTypeEnum.UNDEFINED;

  @JsonProperty("value")
  private byte[] value;

  @JsonProperty("support")
  private Support support;

  public SlotValue slotTypeId(String slotTypeId) {
    this.slotTypeId = slotTypeId;
    return this;
  }

   /**
   * Slot type's identifier
   * @return slotTypeId
  **/
  @ApiModelProperty(required = true, value = "Slot type's identifier")
  public String getSlotTypeId() {
    return slotTypeId;
  }

  public void setSlotTypeId(String slotTypeId) {
    this.slotTypeId = slotTypeId;
  }

  public SlotValue sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The value provenance
   * @return sourceType
  **/
  @ApiModelProperty(value = "The value provenance")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public SlotValue value(byte[] value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public SlotValue support(Support support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public Support getSupport() {
    return support;
  }

  public void setSupport(Support support) {
    this.support = support;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotValue slotValue = (SlotValue) o;
    return Objects.equals(this.slotTypeId, slotValue.slotTypeId) &&
        Objects.equals(this.sourceType, slotValue.sourceType) &&
        Objects.equals(this.value, slotValue.value) &&
        Objects.equals(this.support, slotValue.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotTypeId, sourceType, value, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotValue {\n");
    
    sb.append("    slotTypeId: ").append(toIndentedString(slotTypeId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

