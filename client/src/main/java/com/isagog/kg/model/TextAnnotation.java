/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.GrammarAnnotation;
import com.isagog.kg.model.RelationAnnotation;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.SyntaxAnnotation;
import com.isagog.kg.model.TokenAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Text annotation
 */
@ApiModel(description = "Text annotation")
@JsonPropertyOrder({
  TextAnnotation.JSON_PROPERTY_INDEX,
  TextAnnotation.JSON_PROPERTY_ATYPE,
  TextAnnotation.JSON_PROPERTY_SUPPORT
})
@JsonTypeName("TextAnnotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "atype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DependencyAnnotation.class, name = "DependencyAnnotation"),
  @JsonSubTypes.Type(value = EntityAnnotation.class, name = "EntityAnnotation"),
  @JsonSubTypes.Type(value = GrammarAnnotation.class, name = "GrammarAnnotation"),
  @JsonSubTypes.Type(value = RelationAnnotation.class, name = "RelationAnnotation"),
  @JsonSubTypes.Type(value = SyntaxAnnotation.class, name = "SyntaxAnnotation"),
  @JsonSubTypes.Type(value = TokenAnnotation.class, name = "TokenAnnotation"),
})

public class TextAnnotation {
  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  /**
   * Gets or Sets atype
   */
  public enum AtypeEnum {
    ENTITYANNOTATION("EntityAnnotation"),
    
    GRAMMARANNOTATION("GrammarAnnotation"),
    
    SYNTAXANNOTATION("SyntaxAnnotation"),
    
    DEPENDENCYANNOTATION("DependencyAnnotation"),
    
    RELATIONANNOTATION("RelationAnnotation");

    private String value;

    AtypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AtypeEnum fromValue(String value) {
      for (AtypeEnum b : AtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ATYPE = "atype";
  protected AtypeEnum atype;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Support support;


  public TextAnnotation index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Annotation array index, should be consistent with the container&#39;s one
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Annotation array index, should be consistent with the container's one")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public TextAnnotation atype(AtypeEnum atype) {
    
    this.atype = atype;
    return this;
  }

   /**
   * Get atype
   * @return atype
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AtypeEnum getAtype() {
    return atype;
  }


  public void setAtype(AtypeEnum atype) {
    this.atype = atype;
  }


  public TextAnnotation support(Support support) {
    
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Support getSupport() {
    return support;
  }


  public void setSupport(Support support) {
    this.support = support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAnnotation textAnnotation = (TextAnnotation) o;
    return Objects.equals(this.index, textAnnotation.index) &&
        Objects.equals(this.atype, textAnnotation.atype) &&
        Objects.equals(this.support, textAnnotation.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, atype, support);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAnnotation {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    atype: ").append(toIndentedString(atype)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

