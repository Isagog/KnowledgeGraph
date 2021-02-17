package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Managed knowledge element (should be abstract)
 */
@ApiModel(description = "Managed knowledge element (should be abstract)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T17:22:22.256+01:00[Europe/Berlin]")
public class KnowledgeElement   {
  @JsonProperty("ktype")
  private String ktype;

  @JsonProperty("annotations")
  private List<KnowledgeAnnotation> annotations = null;

  public KnowledgeElement ktype(String ktype) {
    this.ktype = ktype;
    return this;
  }

   /**
   * Knowledge element type, should be aligned to the subclass name
   * @return ktype
  **/
  @ApiModelProperty(required = true, value = "Knowledge element type, should be aligned to the subclass name")
  public String getKtype() {
    return ktype;
  }

  public void setKtype(String ktype) {
    this.ktype = ktype;
  }

  public KnowledgeElement annotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KnowledgeElement addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KnowledgeAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Knowledge annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "Knowledge annotations")
  public List<KnowledgeAnnotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeElement knowledgeElement = (KnowledgeElement) o;
    return Objects.equals(this.ktype, knowledgeElement.ktype) &&
        Objects.equals(this.annotations, knowledgeElement.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ktype, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeElement {\n");
    
    sb.append("    ktype: ").append(toIndentedString(ktype)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

