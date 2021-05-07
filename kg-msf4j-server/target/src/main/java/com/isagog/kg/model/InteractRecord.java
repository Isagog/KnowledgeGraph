package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.InteractType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Interaction record
 */
@ApiModel(description = "Interaction record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:02.031+02:00[Europe/Berlin]")
public class InteractRecord   {
  @JsonProperty("itype")
  private InteractType itype;

  @JsonProperty("value")
  private String value;

  @JsonProperty("kitem")
  private String kitem;

  @JsonProperty("constraints")
  private List<String> constraints = null;

  @JsonProperty("slotref")
  private String slotref;

  public InteractRecord itype(InteractType itype) {
    this.itype = itype;
    return this;
  }

   /**
   * Get itype
   * @return itype
  **/
  @ApiModelProperty(required = true, value = "")
  public InteractType getItype() {
    return itype;
  }

  public void setItype(InteractType itype) {
    this.itype = itype;
  }

  public InteractRecord value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Interaction content
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Interaction content")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InteractRecord kitem(String kitem) {
    this.kitem = kitem;
    return this;
  }

   /**
   * Knowlege item (opt)
   * @return kitem
  **/
  @ApiModelProperty(value = "Knowlege item (opt)")
  public String getKitem() {
    return kitem;
  }

  public void setKitem(String kitem) {
    this.kitem = kitem;
  }

  public InteractRecord constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public InteractRecord addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Knowledge constraints (opt)
   * @return constraints
  **/
  @ApiModelProperty(value = "Knowledge constraints (opt)")
  public List<String> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }

  public InteractRecord slotref(String slotref) {
    this.slotref = slotref;
    return this;
  }

   /**
   * Reference to a frame slot <frame id>.<slot id> (opt)
   * @return slotref
  **/
  @ApiModelProperty(value = "Reference to a frame slot <frame id>.<slot id> (opt)")
  public String getSlotref() {
    return slotref;
  }

  public void setSlotref(String slotref) {
    this.slotref = slotref;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractRecord interactRecord = (InteractRecord) o;
    return Objects.equals(this.itype, interactRecord.itype) &&
        Objects.equals(this.value, interactRecord.value) &&
        Objects.equals(this.kitem, interactRecord.kitem) &&
        Objects.equals(this.constraints, interactRecord.constraints) &&
        Objects.equals(this.slotref, interactRecord.slotref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itype, value, kitem, constraints, slotref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractRecord {\n");
    
    sb.append("    itype: ").append(toIndentedString(itype)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    kitem: ").append(toIndentedString(kitem)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    slotref: ").append(toIndentedString(slotref)).append("\n");
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

