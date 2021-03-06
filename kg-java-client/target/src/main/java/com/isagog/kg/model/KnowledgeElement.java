/*
 * Isagog Knowledge Service
 * Isagog Knowledge Graph Ontology service
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.Classifier;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalSlot;
import com.isagog.kg.model.Slot;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Named knowledge element
 */
@ApiModel(description = "Named knowledge element")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.592+02:00[Europe/Berlin]")
public class KnowledgeElement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KTYPE = "ktype";
  @SerializedName(SERIALIZED_NAME_KTYPE)
  protected String ktype;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<KnowledgeAnnotation> annotations = null;

  public KnowledgeElement() {
    this.ktype = this.getClass().getSimpleName();
  }

  public KnowledgeElement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Element identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Element identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public KnowledgeElement ktype(String ktype) {
    
    this.ktype = ktype;
    return this;
  }

   /**
   * Knowledge element type, MUST be one of KnowledgeType enum
   * @return ktype
  **/
  @ApiModelProperty(required = true, value = "Knowledge element type, MUST be one of KnowledgeType enum")

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
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Knowledge annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
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
    return Objects.equals(this.id, knowledgeElement.id) &&
        Objects.equals(this.ktype, knowledgeElement.ktype) &&
        Objects.equals(this.annotations, knowledgeElement.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ktype, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

