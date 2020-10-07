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
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.Situation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Frame type
 */
@ApiModel(description = "Frame type")
@JsonPropertyOrder({
  Frame.JSON_PROPERTY_FTYPE,
  Frame.JSON_PROPERTY_SLOTS
})
@JsonTypeName("Frame")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T16:26:39.961968100+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "ftype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Query.class, name = "Query"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
})

public class Frame extends KnowledgeElement {
  /**
   * Gets or Sets ftype
   */
  public enum FtypeEnum {
    QUERY("Query"),
    
    SITUATION("Situation");

    private String value;

    FtypeEnum(String value) {
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
    public static FtypeEnum fromValue(String value) {
      for (FtypeEnum b : FtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FTYPE = "ftype";
  protected FtypeEnum ftype = FtypeEnum.SITUATION;

  public static final String JSON_PROPERTY_SLOTS = "slots";
  private List<Slot> slots = new ArrayList<Slot>();


  public Frame ftype(FtypeEnum ftype) {
    
    this.ftype = ftype;
    return this;
  }

   /**
   * Get ftype
   * @return ftype
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FtypeEnum getFtype() {
    return ftype;
  }


  public void setFtype(FtypeEnum ftype) {
    this.ftype = ftype;
  }


  public Frame slots(List<Slot> slots) {
    
    this.slots = slots;
    return this;
  }

  public Frame addSlotsItem(Slot slotsItem) {
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * List of conceptual elements
   * @return slots
  **/
  @ApiModelProperty(required = true, value = "List of conceptual elements")
  @JsonProperty(JSON_PROPERTY_SLOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Slot> getSlots() {
    return slots;
  }


  public void setSlots(List<Slot> slots) {
    this.slots = slots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frame frame = (Frame) o;
    return Objects.equals(this.ftype, frame.ftype) &&
        Objects.equals(this.slots, frame.slots) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ftype, slots, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ftype: ").append(toIndentedString(ftype)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

