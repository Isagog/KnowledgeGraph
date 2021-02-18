package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classifier;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Binary classifier
 */
@ApiModel(description = "Binary classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-18T10:42:13.655+01:00[Europe/Berlin]")
public class Relation extends Classifier  {
  @JsonProperty("domain")
  private List<String> domain = null;

  @JsonProperty("range")
  private List<String> range = null;

  public Relation domain(List<String> domain) {
    this.domain = domain;
    return this;
  }

  public Relation addDomainItem(String domainItem) {
    if (this.domain == null) {
      this.domain = new ArrayList<String>();
    }
    this.domain.add(domainItem);
    return this;
  }

   /**
   * Domain restriction
   * @return domain
  **/
  @ApiModelProperty(value = "Domain restriction")
  public List<String> getDomain() {
    return domain;
  }

  public void setDomain(List<String> domain) {
    this.domain = domain;
  }

  public Relation range(List<String> range) {
    this.range = range;
    return this;
  }

  public Relation addRangeItem(String rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<String>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Range restrictions
   * @return range
  **/
  @ApiModelProperty(value = "Range restrictions")
  public List<String> getRange() {
    return range;
  }

  public void setRange(List<String> range) {
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

