/*
 * Isagog Knowledge Graph Data Service
 * Isagog Knowledge Graph Data module
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
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A container of interlinked entities
 */
@ApiModel(description = "A container of interlinked entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:36.167+02:00[Europe/Berlin]")
public class KnowledgeGraph {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private URI id;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private URI source;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<KnowledgeAnnotation> annotations = null;


  public KnowledgeGraph id(URI id) {
    
    this.id = id;
    return this;
  }

   /**
   * Ontology identifier (uri)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Ontology identifier (uri)")

  public URI getId() {
    return id;
  }


  public void setId(URI id) {
    this.id = id;
  }


  public KnowledgeGraph source(URI source) {
    
    this.source = source;
    return this;
  }

   /**
   * Graph source (document url)
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Graph source (document url)")

  public URI getSource() {
    return source;
  }


  public void setSource(URI source) {
    this.source = source;
  }


  public KnowledgeGraph size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Number of contained entities
   * minimum: 0
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of contained entities")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public KnowledgeGraph annotations(List<KnowledgeAnnotation> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public KnowledgeGraph addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    KnowledgeGraph knowledgeGraph = (KnowledgeGraph) o;
    return Objects.equals(this.id, knowledgeGraph.id) &&
        Objects.equals(this.source, knowledgeGraph.source) &&
        Objects.equals(this.size, knowledgeGraph.size) &&
        Objects.equals(this.annotations, knowledgeGraph.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, size, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGraph {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
