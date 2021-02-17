package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classification;
import com.isagog.kg.model.TokenAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity classifier and\\or link
 */
@ApiModel(description = "Entity classifier and\\or link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T17:22:22.256+01:00[Europe/Berlin]")
public class EntityAnnotation extends TokenAnnotation  {
  @JsonProperty("classes")
  private List<Classification> classes = null;

  @JsonProperty("links")
  private List<URI> links = null;

  public EntityAnnotation classes(List<Classification> classes) {
    this.classes = classes;
    return this;
  }

  public EntityAnnotation addClassesItem(Classification classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<Classification>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Text classification
   * @return classes
  **/
  @ApiModelProperty(value = "Text classification")
  public List<Classification> getClasses() {
    return classes;
  }

  public void setClasses(List<Classification> classes) {
    this.classes = classes;
  }

  public EntityAnnotation links(List<URI> links) {
    this.links = links;
    return this;
  }

  public EntityAnnotation addLinksItem(URI linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<URI>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<URI> getLinks() {
    return links;
  }

  public void setLinks(List<URI> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityAnnotation entityAnnotation = (EntityAnnotation) o;
    return Objects.equals(this.classes, entityAnnotation.classes) &&
        Objects.equals(this.links, entityAnnotation.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

