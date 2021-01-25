package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot bound to an Attribute (data property)
 */
@ApiModel(description = "A slot bound to an Attribute (data property)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-23T13:35:22.833+01:00[Europe/Berlin]")
public class AttributiveSlot extends Slot  {
  @JsonProperty("subjectBinding")
  private Integer subjectBinding;

  @JsonProperty("objectBinding")
  private Integer objectBinding;

  /**
   * Comparation operator for data values (opt)
   */
  public enum ComparationEnum {
    EQUAL("EQUAL"),
    
    GREATER("GREATER"),
    
    SMALLER("SMALLER"),
    
    SIMILAR("SIMILAR");

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
  private ComparationEnum comparation = ComparationEnum.EQUAL;

  public AttributiveSlot subjectBinding(Integer subjectBinding) {
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * Slot's subject binding, must be a ConceptualSlot in the same frame.
   * minimum: 0
   * maximum: 128
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "Slot's subject binding, must be a ConceptualSlot in the same frame.")
  public Integer getSubjectBinding() {
    return subjectBinding;
  }

  public void setSubjectBinding(Integer subjectBinding) {
    this.subjectBinding = subjectBinding;
  }

  public AttributiveSlot objectBinding(Integer objectBinding) {
    this.objectBinding = objectBinding;
    return this;
  }

   /**
   * Slot's object binding, must be a ValueSlot in the same frame.
   * minimum: 0
   * maximum: 128
   * @return objectBinding
  **/
  @ApiModelProperty(value = "Slot's object binding, must be a ValueSlot in the same frame.")
  public Integer getObjectBinding() {
    return objectBinding;
  }

  public void setObjectBinding(Integer objectBinding) {
    this.objectBinding = objectBinding;
  }

  public AttributiveSlot comparation(ComparationEnum comparation) {
    this.comparation = comparation;
    return this;
  }

   /**
   * Comparation operator for data values (opt)
   * @return comparation
  **/
  @ApiModelProperty(value = "Comparation operator for data values (opt)")
  public ComparationEnum getComparation() {
    return comparation;
  }

  public void setComparation(ComparationEnum comparation) {
    this.comparation = comparation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveSlot attributiveSlot = (AttributiveSlot) o;
    return Objects.equals(this.subjectBinding, attributiveSlot.subjectBinding) &&
        Objects.equals(this.objectBinding, attributiveSlot.objectBinding) &&
        Objects.equals(this.comparation, attributiveSlot.comparation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, objectBinding, comparation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    objectBinding: ").append(toIndentedString(objectBinding)).append("\n");
    sb.append("    comparation: ").append(toIndentedString(comparation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

