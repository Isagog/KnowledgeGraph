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
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.RelationalSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Framed conceptual element
 */
@ApiModel(description = "Framed conceptual element")
@JsonPropertyOrder({
  Slot.JSON_PROPERTY_ID,
  Slot.JSON_PROPERTY_STYPE,
  Slot.JSON_PROPERTY_MANDATORY,
  Slot.JSON_PROPERTY_DISTINGUISHED,
  Slot.JSON_PROPERTY_INFORMATIVE,
  Slot.JSON_PROPERTY_ONTOLOGY_REFERENCE
})
@JsonTypeName("Slot")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T16:45:57.251979+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "stype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AttributiveSlot.class, name = "AttributiveSlot"),
  @JsonSubTypes.Type(value = ConceptualSlot.class, name = "ConceptualSlot"),
  @JsonSubTypes.Type(value = RelationalSlot.class, name = "RelationalSlot"),
})

public class Slot {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets stype
   */
  public enum StypeEnum {
    CONCEPTUALSLOT("ConceptualSlot"),
    
    RELATIONALSLOT("RelationalSlot"),
    
    ATTRIBUTIVESLOT("AttributiveSlot");

    private String value;

    StypeEnum(String value) {
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
    public static StypeEnum fromValue(String value) {
      for (StypeEnum b : StypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STYPE = "stype";
  protected StypeEnum stype;

  public static final String JSON_PROPERTY_MANDATORY = "mandatory";
  private Boolean mandatory = false;

  public static final String JSON_PROPERTY_DISTINGUISHED = "distinguished";
  private Boolean distinguished = false;

  public static final String JSON_PROPERTY_INFORMATIVE = "informative";
  private Boolean informative = false;

  public static final String JSON_PROPERTY_ONTOLOGY_REFERENCE = "ontologyReference";
  private String ontologyReference;


  public Slot id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Slot identifier, must be univoque in the frame
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Slot identifier, must be univoque in the frame")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Slot stype(StypeEnum stype) {
    
    this.stype = stype;
    return this;
  }

   /**
   * Get stype
   * @return stype
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StypeEnum getStype() {
    return stype;
  }


  public void setStype(StypeEnum stype) {
    this.stype = stype;
  }


  public Slot mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * A slot that must be instantiated
   * @return mandatory
  **/
  @ApiModelProperty(required = true, value = "A slot that must be instantiated")
  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMandatory() {
    return mandatory;
  }


  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public Slot distinguished(Boolean distinguished) {
    
    this.distinguished = distinguished;
    return this;
  }

   /**
   * A slot that has a specific pragmatic role
   * @return distinguished
  **/
  @ApiModelProperty(required = true, value = "A slot that has a specific pragmatic role")
  @JsonProperty(JSON_PROPERTY_DISTINGUISHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDistinguished() {
    return distinguished;
  }


  public void setDistinguished(Boolean distinguished) {
    this.distinguished = distinguished;
  }


  public Slot informative(Boolean informative) {
    
    this.informative = informative;
    return this;
  }

   /**
   * A slot that must be presented to consumers
   * @return informative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A slot that must be presented to consumers")
  @JsonProperty(JSON_PROPERTY_INFORMATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInformative() {
    return informative;
  }


  public void setInformative(Boolean informative) {
    this.informative = informative;
  }


  public Slot ontologyReference(String ontologyReference) {
    
    this.ontologyReference = ontologyReference;
    return this;
  }

   /**
   * Ontology element linked to the slot
   * @return ontologyReference
  **/
  @ApiModelProperty(required = true, value = "Ontology element linked to the slot")
  @JsonProperty(JSON_PROPERTY_ONTOLOGY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOntologyReference() {
    return ontologyReference;
  }


  public void setOntologyReference(String ontologyReference) {
    this.ontologyReference = ontologyReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slot slot = (Slot) o;
    return Objects.equals(this.id, slot.id) &&
        Objects.equals(this.stype, slot.stype) &&
        Objects.equals(this.mandatory, slot.mandatory) &&
        Objects.equals(this.distinguished, slot.distinguished) &&
        Objects.equals(this.informative, slot.informative) &&
        Objects.equals(this.ontologyReference, slot.ontologyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stype, mandatory, distinguished, informative, ontologyReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stype: ").append(toIndentedString(stype)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    distinguished: ").append(toIndentedString(distinguished)).append("\n");
    sb.append("    informative: ").append(toIndentedString(informative)).append("\n");
    sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
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

