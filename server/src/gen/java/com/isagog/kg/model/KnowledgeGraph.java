package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Set of statements about conceptualized entities
 */
@ApiModel(description = "Set of statements about conceptualized entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class KnowledgeGraph   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("sources")
  private List<URI> sources = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("ontologies")
  private List<URI> ontologies = null;

  @JsonProperty("context")
  private List<String> context = null;

  @JsonProperty("content")
  private List<EntityStatement> content = null;

  @JsonProperty("annotations")
  private List<KnowledgeAnnotation> annotations = null;

  public KnowledgeGraph id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Knowledge Graph id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Knowledge Graph id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KnowledgeGraph sources(List<URI> sources) {
    this.sources = sources;
    return this;
  }

  public KnowledgeGraph addSourcesItem(URI sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<URI>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * KG sources
   * @return sources
  **/
  @ApiModelProperty(value = "KG sources")
  public List<URI> getSources() {
    return sources;
  }

  public void setSources(List<URI> sources) {
    this.sources = sources;
  }

  public KnowledgeGraph description(String description) {
    this.description = description;
    return this;
  }

   /**
   * KG description
   * @return description
  **/
  @ApiModelProperty(value = "KG description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KnowledgeGraph size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Statement number
   * @return size
  **/
  @ApiModelProperty(value = "Statement number")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public KnowledgeGraph ontologies(List<URI> ontologies) {
    this.ontologies = ontologies;
    return this;
  }

  public KnowledgeGraph addOntologiesItem(URI ontologiesItem) {
    if (this.ontologies == null) {
      this.ontologies = new ArrayList<URI>();
    }
    this.ontologies.add(ontologiesItem);
    return this;
  }

   /**
   * Ontologies where concepts and relations are defined (URIs)
   * @return ontologies
  **/
  @ApiModelProperty(value = "Ontologies where concepts and relations are defined (URIs)")
  public List<URI> getOntologies() {
    return ontologies;
  }

  public void setOntologies(List<URI> ontologies) {
    this.ontologies = ontologies;
  }

  public KnowledgeGraph context(List<String> context) {
    this.context = context;
    return this;
  }

  public KnowledgeGraph addContextItem(String contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<String>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * Other graphs providing contextual knowledge
   * @return context
  **/
  @ApiModelProperty(value = "Other graphs providing contextual knowledge")
  public List<String> getContext() {
    return context;
  }

  public void setContext(List<String> context) {
    this.context = context;
  }

  public KnowledgeGraph content(List<EntityStatement> content) {
    this.content = content;
    return this;
  }

  public KnowledgeGraph addContentItem(EntityStatement contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<EntityStatement>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * KG content (statements)
   * @return content
  **/
  @ApiModelProperty(value = "KG content (statements)")
  public List<EntityStatement> getContent() {
    return content;
  }

  public void setContent(List<EntityStatement> content) {
    this.content = content;
  }

  public KnowledgeGraph annotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KnowledgeGraph addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KnowledgeAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * KG annotation (application specific)
   * @return annotations
  **/
  @ApiModelProperty(value = "KG annotation (application specific)")
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
        Objects.equals(this.sources, knowledgeGraph.sources) &&
        Objects.equals(this.description, knowledgeGraph.description) &&
        Objects.equals(this.size, knowledgeGraph.size) &&
        Objects.equals(this.ontologies, knowledgeGraph.ontologies) &&
        Objects.equals(this.context, knowledgeGraph.context) &&
        Objects.equals(this.content, knowledgeGraph.content) &&
        Objects.equals(this.annotations, knowledgeGraph.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sources, description, size, ontologies, context, content, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGraph {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    ontologies: ").append(toIndentedString(ontologies)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

