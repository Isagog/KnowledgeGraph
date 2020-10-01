package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity attribute
 */
@ApiModel(description = "Entity attribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class AttributiveStatement extends EntityStatement  {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("values")
  private List<byte[]> values = new ArrayList<byte[]>();

  public AttributiveStatement attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Ontology attribute
   * @return attribute
  **/
  @ApiModelProperty(required = true, value = "Ontology attribute")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public AttributiveStatement values(List<byte[]> values) {
    this.values = values;
    return this;
  }

  public AttributiveStatement addValuesItem(byte[] valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Attribute values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "Attribute values")
  public List<byte[]> getValues() {
    return values;
  }

  public void setValues(List<byte[]> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveStatement attributiveStatement = (AttributiveStatement) o;
    return Objects.equals(this.attribute, attributiveStatement.attribute) &&
        Objects.equals(this.values, attributiveStatement.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

