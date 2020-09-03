package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Framed conceptual element
 */
@ApiModel(description = "Framed conceptual element")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class Slot   {
  @JsonProperty("id")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StypeEnum fromValue(String text) {
      for (StypeEnum b : StypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("stype")
  private StypeEnum stype;

  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("distinguished")
  private Boolean distinguished = false;

  @JsonProperty("informative")
  private Boolean informative = false;

  @JsonProperty("ontologyReference")
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
  @ApiModelProperty(value = "A slot that must be presented to consumers")
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
  public String getOntologyReference() {
    return ontologyReference;
  }

  public void setOntologyReference(String ontologyReference) {
    this.ontologyReference = ontologyReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

