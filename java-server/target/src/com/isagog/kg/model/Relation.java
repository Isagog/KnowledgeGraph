package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of entity pairs
 */
@ApiModel(description = "Class of entity pairs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class Relation extends KnowledgeElement  {
  @JsonProperty("id")
  private URI id;

  @JsonProperty("domain")
  private URI domain;

  @JsonProperty("range")
  private URI range;

  public Relation id(URI id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public URI getId() {
    return id;
  }

  public void setId(URI id) {
    this.id = id;
  }

  public Relation domain(URI domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain restriction
   * @return domain
  **/
  @ApiModelProperty(value = "Domain restriction")
  public URI getDomain() {
    return domain;
  }

  public void setDomain(URI domain) {
    this.domain = domain;
  }

  public Relation range(URI range) {
    this.range = range;
    return this;
  }

   /**
   * Range restriction
   * @return range
  **/
  @ApiModelProperty(value = "Range restriction")
  public URI getRange() {
    return range;
  }

  public void setRange(URI range) {
    this.range = range;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relation relation = (Relation) o;
    return Objects.equals(this.id, relation.id) &&
        Objects.equals(this.domain, relation.domain) &&
        Objects.equals(this.range, relation.range) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, range, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

