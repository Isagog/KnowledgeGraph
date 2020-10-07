package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Annotation
 */
@ApiModel(description = "Annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:26:29.882986300+02:00[Europe/Berlin]")
public class KnowledgeAnnotation   {
  @JsonProperty("property")
  private String property;

  @JsonProperty("value")
  private byte[] value;

  public KnowledgeAnnotation property(String property) {
    this.property = property;
    return this;
  }

   /**
   * The annotation property
   * @return property
  **/
  @ApiModelProperty(required = true, value = "The annotation property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public KnowledgeAnnotation value(byte[] value) {
    this.value = value;
    return this;
  }

   /**
   * The annotation
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The annotation")
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeAnnotation knowledgeAnnotation = (KnowledgeAnnotation) o;
    return Objects.equals(this.property, knowledgeAnnotation.property) &&
        Objects.equals(this.value, knowledgeAnnotation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAnnotation {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

