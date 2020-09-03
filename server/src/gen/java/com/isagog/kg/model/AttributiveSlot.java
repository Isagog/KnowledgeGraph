package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A slot bound to an Attribute (data property)
 */
@ApiModel(description = "A slot bound to an Attribute (data property)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class AttributiveSlot extends Slot  {
  @JsonProperty("subjectBinding")
  private String subjectBinding;

  /**
   * Semantics of the Attribute's value
   */
  public enum ValueTypeEnum {
    STRING("STRING"),
    
    NUMBER("NUMBER"),
    
    TEXT("TEXT"),
    
    DATE("DATE"),
    
    MONEY("MONEY"),
    
    LOCATION("LOCATION"),
    
    NAME("NAME"),
    
    ANY("ANY");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueTypeEnum fromValue(String text) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("valueType")
  private ValueTypeEnum valueType = ValueTypeEnum.ANY;

  /**
   * The comparison operator when instantiated
   */
  public enum ComparationEnum {
    EQUAL("EQUAL"),
    
    GREATER("GREATER"),
    
    SMALLER("SMALLER"),
    
    SIMILAR("SIMILAR"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    ComparationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComparationEnum fromValue(String text) {
      for (ComparationEnum b : ComparationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("comparation")
  private ComparationEnum comparation = ComparationEnum.UNDEFINED;

  public AttributiveSlot subjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * The id of the slot representing the Attribute's subject
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "The id of the slot representing the Attribute's subject")
  public String getSubjectBinding() {
    return subjectBinding;
  }

  public void setSubjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
  }

  public AttributiveSlot valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Semantics of the Attribute's value
   * @return valueType
  **/
  @ApiModelProperty(value = "Semantics of the Attribute's value")
  public ValueTypeEnum getValueType() {
    return valueType;
  }

  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  public AttributiveSlot comparation(ComparationEnum comparation) {
    this.comparation = comparation;
    return this;
  }

   /**
   * The comparison operator when instantiated
   * @return comparation
  **/
  @ApiModelProperty(value = "The comparison operator when instantiated")
  public ComparationEnum getComparation() {
    return comparation;
  }

  public void setComparation(ComparationEnum comparation) {
    this.comparation = comparation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveSlot attributiveSlot = (AttributiveSlot) o;
    return Objects.equals(this.subjectBinding, attributiveSlot.subjectBinding) &&
        Objects.equals(this.valueType, attributiveSlot.valueType) &&
        Objects.equals(this.comparation, attributiveSlot.comparation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, valueType, comparation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    comparation: ").append(toIndentedString(comparation)).append("\n");
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

