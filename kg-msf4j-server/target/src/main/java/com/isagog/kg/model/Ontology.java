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
 * Knowledge conceptual schema
 */
@ApiModel(description = "Knowledge conceptual schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Ontology   {
  @JsonProperty("namespaces")
  private List<String> namespaces = null;

  @JsonProperty("base")
  private String base;

  @JsonProperty("classifiers")
  private List<URI> classifiers = null;

  @JsonProperty("entities")
  private List<URI> entities = null;

  @JsonProperty("id")
  private URI id;

  @JsonProperty("source")
  private URI source;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("annotations")
  private List<KnowledgeAnnotation> annotations = null;

  public Ontology namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public Ontology addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Referred namespaces
   * @return namespaces
  **/
  @ApiModelProperty(value = "Referred namespaces")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public Ontology base(String base) {
    this.base = base;
    return this;
  }

   /**
   * Base namespace
   * @return base
  **/
  @ApiModelProperty(value = "Base namespace")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Ontology classifiers(List<URI> classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  public Ontology addClassifiersItem(URI classifiersItem) {
    if (this.classifiers == null) {
      this.classifiers = new ArrayList<>();
    }
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * Referred classifier names (clases, object and data properties)
   * @return classifiers
  **/
  @ApiModelProperty(value = "Referred classifier names (clases, object and data properties)")
  public List<URI> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(List<URI> classifiers) {
    this.classifiers = classifiers;
  }

  public Ontology entities(List<URI> entities) {
    this.entities = entities;
    return this;
  }

  public Ontology addEntitiesItem(URI entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Entity names
   * @return entities
  **/
  @ApiModelProperty(value = "Entity names")
  public List<URI> getEntities() {
    return entities;
  }

  public void setEntities(List<URI> entities) {
    this.entities = entities;
  }

  public Ontology id(URI id) {
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

  public Ontology source(URI source) {
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

  public Ontology size(Integer size) {
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

  public Ontology annotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Ontology addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * null
   * @return annotations
  **/
  @ApiModelProperty(value = "null")
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
    Ontology ontology = (Ontology) o;
    return Objects.equals(this.namespaces, ontology.namespaces) &&
        Objects.equals(this.base, ontology.base) &&
        Objects.equals(this.classifiers, ontology.classifiers) &&
        Objects.equals(this.entities, ontology.entities) &&
        Objects.equals(this.id, ontology.id) &&
        Objects.equals(this.source, ontology.source) &&
        Objects.equals(this.size, ontology.size) &&
        Objects.equals(this.annotations, ontology.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, base, classifiers, entities, id, source, size, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ontology {\n");
    
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

