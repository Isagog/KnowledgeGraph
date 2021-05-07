package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classifier;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Binary classifier
 */
@ApiModel(description = "Binary classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Relation extends Classifier  {
  @JsonProperty("domain")
  private List<URI> domain = null;

  @JsonProperty("range")
  private List<URI> range = null;

  public Relation domain(List<URI> domain) {
    this.domain = domain;
    return this;
  }

  public Relation addDomainItem(URI domainItem) {
    if (this.domain == null) {
      this.domain = new ArrayList<>();
    }
    this.domain.add(domainItem);
    return this;
  }

   /**
   * Domain restriction
   * @return domain
  **/
  @ApiModelProperty(value = "Domain restriction")
  public List<URI> getDomain() {
    return domain;
  }

  public void setDomain(List<URI> domain) {
    this.domain = domain;
  }

  public Relation range(List<URI> range) {
    this.range = range;
    return this;
  }

  public Relation addRangeItem(URI rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Range restrictions
   * @return range
  **/
  @ApiModelProperty(value = "Range restrictions")
  public List<URI> getRange() {
    return range;
  }

  public void setRange(List<URI> range) {
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
    return Objects.equals(this.domain, relation.domain) &&
        Objects.equals(this.range, relation.range) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, range, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

