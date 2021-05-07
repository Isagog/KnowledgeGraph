package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.AnnotationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base class for knowledge annotations
 */
@ApiModel(description = "Base class for knowledge annotations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class KnowledgeAnnotation   {
  @JsonProperty("atype")
  private AnnotationType atype = AnnotationType.INFO;

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  public KnowledgeAnnotation atype(AnnotationType atype) {
    this.atype = atype;
    return this;
  }

   /**
   * Get atype
   * @return atype
  **/
  @ApiModelProperty(required = true, value = "")
  public AnnotationType getAtype() {
    return atype;
  }

  public void setAtype(AnnotationType atype) {
    this.atype = atype;
  }

  public KnowledgeAnnotation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Annotation key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Annotation key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KnowledgeAnnotation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Annotation value
   * @return value
  **/
  @ApiModelProperty(value = "Annotation value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    return Objects.equals(this.atype, knowledgeAnnotation.atype) &&
        Objects.equals(this.key, knowledgeAnnotation.key) &&
        Objects.equals(this.value, knowledgeAnnotation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atype, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAnnotation {\n");
    
    sb.append("    atype: ").append(toIndentedString(atype)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

