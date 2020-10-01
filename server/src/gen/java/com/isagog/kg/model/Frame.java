package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Frame type
 */
@ApiModel(description = "Frame type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class Frame extends KnowledgeElement  {
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FtypeEnum fromValue(String text) {
      for (FtypeEnum b : FtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ftype")
  private FtypeEnum ftype = FtypeEnum.SITUATION;

  @JsonProperty("slots")
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

