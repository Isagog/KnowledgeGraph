package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base class for knowledge annotations
 */
@ApiModel(description = "Base class for knowledge annotations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T17:22:22.256+01:00[Europe/Berlin]")
public class KnowledgeAnnotation   {
  @JsonProperty("atype")
  private String atype;

  @JsonProperty("label")
  private String label;

  public KnowledgeAnnotation atype(String atype) {
    this.atype = atype;
    return this;
  }

   /**
   * Annotation type, should be aligned to the subclass name
   * @return atype
  **/
  @ApiModelProperty(required = true, value = "Annotation type, should be aligned to the subclass name")
  public String getAtype() {
    return atype;
  }

  public void setAtype(String atype) {
    this.atype = atype;
  }

  public KnowledgeAnnotation label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Annotation label (opt)
   * @return label
  **/
  @ApiModelProperty(value = "Annotation label (opt)")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
        Objects.equals(this.label, knowledgeAnnotation.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atype, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAnnotation {\n");
    
    sb.append("    atype: ").append(toIndentedString(atype)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

