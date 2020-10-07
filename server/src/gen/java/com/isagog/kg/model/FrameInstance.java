package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.SlotValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Frame instance
 */
@ApiModel(description = "Frame instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class FrameInstance   {
  @JsonProperty("ftype")
  private String ftype;

  @JsonProperty("slotValues")
  private List<SlotValue> slotValues = null;

  public FrameInstance ftype(String ftype) {
    this.ftype = ftype;
    return this;
  }

   /**
   * Frame type identifier
   * @return ftype
  **/
  @ApiModelProperty(required = true, value = "Frame type identifier")
  public String getFtype() {
    return ftype;
  }

  public void setFtype(String ftype) {
    this.ftype = ftype;
  }

  public FrameInstance slotValues(List<SlotValue> slotValues) {
    this.slotValues = slotValues;
    return this;
  }

  public FrameInstance addSlotValuesItem(SlotValue slotValuesItem) {
    if (this.slotValues == null) {
      this.slotValues = new ArrayList<SlotValue>();
    }
    this.slotValues.add(slotValuesItem);
    return this;
  }

   /**
   * Get slotValues
   * @return slotValues
  **/
  @ApiModelProperty(value = "")
  public List<SlotValue> getSlotValues() {
    return slotValues;
  }

  public void setSlotValues(List<SlotValue> slotValues) {
    this.slotValues = slotValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameInstance frameInstance = (FrameInstance) o;
    return Objects.equals(this.ftype, frameInstance.ftype) &&
        Objects.equals(this.slotValues, frameInstance.slotValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ftype, slotValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameInstance {\n");
    
    sb.append("    ftype: ").append(toIndentedString(ftype)).append("\n");
    sb.append("    slotValues: ").append(toIndentedString(slotValues)).append("\n");
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

