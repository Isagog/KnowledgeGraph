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
import com.isagog.kg.model.AtomicConcept;
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveConcept;
import com.isagog.kg.model.AttributiveStatement;
import com.isagog.kg.model.ClassificationStatement;
import com.isagog.kg.model.ConceptStatement;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.LinguisticStatement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalConcept;
import com.isagog.kg.model.RelationalStatement;
import com.isagog.kg.model.Situation;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Knowledge statement
 */
@ApiModel(description = "Knowledge statement")
@JsonPropertyOrder({
  Statement.JSON_PROPERTY_SUBJECT,
  Statement.JSON_PROPERTY_PRIVACY,
  Statement.JSON_PROPERTY_SUPPORT
})
@JsonTypeName("Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "ktype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AtomicConcept.class, name = "AtomicConcept"),
  @JsonSubTypes.Type(value = Attribute.class, name = "Attribute"),
  @JsonSubTypes.Type(value = AttributiveConcept.class, name = "AttributiveConcept"),
  @JsonSubTypes.Type(value = AttributiveStatement.class, name = "AttributiveStatement"),
  @JsonSubTypes.Type(value = ClassificationStatement.class, name = "ClassificationStatement"),
  @JsonSubTypes.Type(value = ConceptStatement.class, name = "ConceptStatement"),
  @JsonSubTypes.Type(value = Entity.class, name = "Entity"),
  @JsonSubTypes.Type(value = EntityStatement.class, name = "EntityStatement"),
  @JsonSubTypes.Type(value = LinguisticStatement.class, name = "LinguisticStatement"),
  @JsonSubTypes.Type(value = Relation.class, name = "Relation"),
  @JsonSubTypes.Type(value = RelationalConcept.class, name = "RelationalConcept"),
  @JsonSubTypes.Type(value = RelationalStatement.class, name = "RelationalStatement"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
})

public class Statement extends KnowledgeElement {
  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  /**
   * Gets or Sets privacy
   */
  public enum PrivacyEnum {
    OWNER("OWNER"),
    
    TRUSTED("TRUSTED"),
    
    CONTACTS("CONTACTS"),
    
    PUBLIC("PUBLIC");

    private String value;

    PrivacyEnum(String value) {
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
    public static PrivacyEnum fromValue(String value) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIVACY = "privacy";
  private PrivacyEnum privacy = PrivacyEnum.OWNER;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Support support;


  public Statement subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Statement privacy(PrivacyEnum privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVACY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrivacyEnum getPrivacy() {
    return privacy;
  }


  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }


  public Statement support(Support support) {
    
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
    Statement statement = (Statement) o;
    return Objects.equals(this.subject, statement.subject) &&
        Objects.equals(this.privacy, statement.privacy) &&
        Objects.equals(this.support, statement.support) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, privacy, support, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

