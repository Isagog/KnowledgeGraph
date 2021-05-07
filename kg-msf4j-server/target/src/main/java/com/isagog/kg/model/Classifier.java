package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Classifying predicate
 */
@ApiModel(description = "Classifying predicate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Classifier extends KnowledgeElement  {
  @JsonProperty("ns")
  private String ns;

  @JsonProperty("superclasses")
  private List<URI> superclasses = null;

  @JsonProperty("subclasses")
  private List<URI> subclasses = null;

  @JsonProperty("disjointclasses")
  private List<URI> disjointclasses = null;

  public Classifier ns(String ns) {
    this.ns = ns;
    return this;
  }

   /**
   * Namespace
   * @return ns
  **/
  @ApiModelProperty(required = true, value = "Namespace")
  public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public Classifier superclasses(List<URI> superclasses) {
    this.superclasses = superclasses;
    return this;
  }

  public Classifier addSuperclassesItem(URI superclassesItem) {
    if (this.superclasses == null) {
      this.superclasses = new ArrayList<>();
    }
    this.superclasses.add(superclassesItem);
    return this;
  }

   /**
   * Broader classifiers
   * @return superclasses
  **/
  @ApiModelProperty(value = "Broader classifiers")
  public List<URI> getSuperclasses() {
    return superclasses;
  }

  public void setSuperclasses(List<URI> superclasses) {
    this.superclasses = superclasses;
  }

  public Classifier subclasses(List<URI> subclasses) {
    this.subclasses = subclasses;
    return this;
  }

  public Classifier addSubclassesItem(URI subclassesItem) {
    if (this.subclasses == null) {
      this.subclasses = new ArrayList<>();
    }
    this.subclasses.add(subclassesItem);
    return this;
  }

   /**
   * Narrower classifiers
   * @return subclasses
  **/
  @ApiModelProperty(value = "Narrower classifiers")
  public List<URI> getSubclasses() {
    return subclasses;
  }

  public void setSubclasses(List<URI> subclasses) {
    this.subclasses = subclasses;
  }

  public Classifier disjointclasses(List<URI> disjointclasses) {
    this.disjointclasses = disjointclasses;
    return this;
  }

  public Classifier addDisjointclassesItem(URI disjointclassesItem) {
    if (this.disjointclasses == null) {
      this.disjointclasses = new ArrayList<>();
    }
    this.disjointclasses.add(disjointclassesItem);
    return this;
  }

   /**
   * Disjoint classifiers
   * @return disjointclasses
  **/
  @ApiModelProperty(value = "Disjoint classifiers")
  public List<URI> getDisjointclasses() {
    return disjointclasses;
  }

  public void setDisjointclasses(List<URI> disjointclasses) {
    this.disjointclasses = disjointclasses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classifier classifier = (Classifier) o;
    return Objects.equals(this.ns, classifier.ns) &&
        Objects.equals(this.superclasses, classifier.superclasses) &&
        Objects.equals(this.subclasses, classifier.subclasses) &&
        Objects.equals(this.disjointclasses, classifier.disjointclasses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ns, superclasses, subclasses, disjointclasses, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classifier {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
    sb.append("    superclasses: ").append(toIndentedString(superclasses)).append("\n");
    sb.append("    subclasses: ").append(toIndentedString(subclasses)).append("\n");
    sb.append("    disjointclasses: ").append(toIndentedString(disjointclasses)).append("\n");
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

