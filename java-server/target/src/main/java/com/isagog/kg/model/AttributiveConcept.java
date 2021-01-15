package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary attributive classifier
 */
@ApiModel(description = "Unary attributive classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class AttributiveConcept extends Concept  {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("value")
  private byte[] value;

  /**
   * Gets or Sets constraint
   */
  public enum ConstraintEnum {
    EQUAL("EQUAL"),
    
    GREATER_THAN("GREATER_THAN"),
    
    SMALLER_THAN("SMALLER_THAN"),
    
    SIMILAR("SIMILAR");

    private String value;

    ConstraintEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConstraintEnum fromValue(String text) {
      for (ConstraintEnum b : ConstraintEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("constraint")
  private ConstraintEnum constraint = ConstraintEnum.EQUAL;

  public AttributiveConcept attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public AttributiveConcept value(byte[] value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public AttributiveConcept constraint(ConstraintEnum constraint) {
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @ApiModelProperty(value = "")
  public ConstraintEnum getConstraint() {
    return constraint;
  }

  public void setConstraint(ConstraintEnum constraint) {
    this.constraint = constraint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveConcept attributiveConcept = (AttributiveConcept) o;
    return Objects.equals(this.attribute, attributiveConcept.attribute) &&
        Objects.equals(this.value, attributiveConcept.value) &&
        Objects.equals(this.constraint, attributiveConcept.constraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, value, constraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveConcept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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

