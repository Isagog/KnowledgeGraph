/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Annotation
 */
@ApiModel(description = "Annotation")
@JsonPropertyOrder({
  KnowledgeAnnotation.JSON_PROPERTY_PROPERTY,
  KnowledgeAnnotation.JSON_PROPERTY_VALUE
})
@JsonTypeName("KnowledgeAnnotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
public class KnowledgeAnnotation {
  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_VALUE = "value";
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
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
        Arrays.equals(this.value, knowledgeAnnotation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, Arrays.hashCode(value));
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

