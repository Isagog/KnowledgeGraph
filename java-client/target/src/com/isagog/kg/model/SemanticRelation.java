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
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.SemanticRelation;
import com.isagog.kg.model.SyntacticRelation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Governor&#39;s semantic role
 */
@ApiModel(description = "Governor's semantic role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T10:03:52.590+01:00[Europe/Berlin]")
public class SemanticRelation extends DependencyAnnotation {
  public static final String SERIALIZED_NAME_PREDICATE = "predicate";
  @SerializedName(SERIALIZED_NAME_PREDICATE)
  private String predicate;

  /**
   * Governor&#39;s predicative role (subject or object)
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SUBJECT("SUBJECT"),
    
    OBJECT("OBJECT");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public SemanticRelation() {
    this.dtype = this.getClass().getSimpleName();
  }

  public SemanticRelation predicate(String predicate) {
    
    this.predicate = predicate;
    return this;
  }

   /**
   * Ontology predicate (relation or attribute)
   * @return predicate
  **/
  @ApiModelProperty(required = true, value = "Ontology predicate (relation or attribute)")

  public String getPredicate() {
    return predicate;
  }


  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }


  public SemanticRelation role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * Governor&#39;s predicative role (subject or object)
   * @return role
  **/
  @ApiModelProperty(required = true, value = "Governor's predicative role (subject or object)")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRelation semanticRelation = (SemanticRelation) o;
    return Objects.equals(this.predicate, semanticRelation.predicate) &&
        Objects.equals(this.role, semanticRelation.role) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, role, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRelation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

