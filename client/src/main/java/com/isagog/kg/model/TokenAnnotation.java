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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.ClassAnnotation;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.GrammarAnnotation;
import com.isagog.kg.model.RelationAnnotation;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.SyntaxAnnotation;
import com.isagog.kg.model.TextAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Token annotation
 */
@ApiModel(description = "Token annotation")
@JsonPropertyOrder({
  TokenAnnotation.JSON_PROPERTY_START,
  TokenAnnotation.JSON_PROPERTY_END
})
@JsonTypeName("TokenAnnotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T16:45:57.251979+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "atype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ClassAnnotation.class, name = "ClassAnnotation"),
  @JsonSubTypes.Type(value = DependencyAnnotation.class, name = "DependencyAnnotation"),
  @JsonSubTypes.Type(value = EntityAnnotation.class, name = "EntityAnnotation"),
  @JsonSubTypes.Type(value = GrammarAnnotation.class, name = "GrammarAnnotation"),
  @JsonSubTypes.Type(value = RelationAnnotation.class, name = "RelationAnnotation"),
  @JsonSubTypes.Type(value = SyntaxAnnotation.class, name = "SyntaxAnnotation"),
})

public class TokenAnnotation extends TextAnnotation {
  public static final String JSON_PROPERTY_START = "start";
  private Integer start;

  public static final String JSON_PROPERTY_END = "end";
  private Integer end;


  public TokenAnnotation start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public TokenAnnotation end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenAnnotation tokenAnnotation = (TokenAnnotation) o;
    return Objects.equals(this.start, tokenAnnotation.start) &&
        Objects.equals(this.end, tokenAnnotation.end) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

