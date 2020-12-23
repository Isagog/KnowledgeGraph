/*
 * Isagog Knowledge Graph Interaction Service
 * Isagog Knowledge Graph Interaction module
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
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.PredicateStatement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of entity pairs
 */
@ApiModel(description = "Class of entity pairs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T10:03:52.590+01:00[Europe/Berlin]")
public class Relation extends KnowledgeElement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private URI id;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private URI domain;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private URI range;

  public Relation() {
    this.ktype = this.getClass().getSimpleName();
  }

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

