package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Comparator;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T18:16:25.422+01:00[Europe/Berlin]")
public class AttributiveSlot extends Slot  {
  @JsonProperty("subjectBinding")
  private String subjectBinding;

  @JsonProperty("value")
  private String value;

  @JsonProperty("comparation")
  private Comparator comparation = Comparator.EQUAL;

  public AttributiveSlot subjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * Slot's subject binding
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "Slot's subject binding")
  public String getSubjectBinding() {
    return subjectBinding;
  }

  public void setSubjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
  }

  public AttributiveSlot value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Constant data value (opt)
   * @return value
  **/
  @ApiModelProperty(value = "Constant data value (opt)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AttributiveSlot comparation(Comparator comparation) {
    this.comparation = comparation;
    return this;
  }

   /**
   * Get comparation
   * @return comparation
  **/
  @ApiModelProperty(value = "")
  public Comparator getComparation() {
    return comparation;
  }

  public void setComparation(Comparator comparation) {
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
        Objects.equals(this.value, attributiveSlot.value) &&
        Objects.equals(this.comparation, attributiveSlot.comparation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, value, comparation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

