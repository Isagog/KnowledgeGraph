package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class EntityAnnotation extends TokenAnnotation  {
  @JsonProperty("classifiers")
  private List<String> classifiers = null;

  @JsonProperty("links")
  private List<URI> links = null;

  public EntityAnnotation classifiers(List<String> classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  public EntityAnnotation addClassifiersItem(String classifiersItem) {
    if (this.classifiers == null) {
      this.classifiers = new ArrayList<String>();
    }
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * Get classifiers
   * @return classifiers
  **/
  @ApiModelProperty(value = "")
  public List<String> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(List<String> classifiers) {
    this.classifiers = classifiers;
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
    return Objects.equals(this.classifiers, entityAnnotation.classifiers) &&
        Objects.equals(this.links, entityAnnotation.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifiers, links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
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

