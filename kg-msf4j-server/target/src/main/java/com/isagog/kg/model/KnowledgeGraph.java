package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A container of interlinked entities
 */
@ApiModel(description = "A container of interlinked entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.273+02:00[Europe/Berlin]")
public class KnowledgeGraph   {
  @JsonProperty("id")
  private URI id;

  @JsonProperty("source")
  private URI source;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("annotations")
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

