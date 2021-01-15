package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reference to a frame slot
 */
@ApiModel(description = "Reference to a frame slot")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class SlotReference   {
  @JsonProperty("frameid")
  private String frameid;

  @JsonProperty("slotid")
  private Integer slotid;

  public SlotReference frameid(String frameid) {
    this.frameid = frameid;
    return this;
  }

   /**
   * Get frameid
   * @return frameid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFrameid() {
    return frameid;
  }

  public void setFrameid(String frameid) {
    this.frameid = frameid;
  }

  public SlotReference slotid(Integer slotid) {
    this.slotid = slotid;
    return this;
  }

   /**
   * Get slotid
   * minimum: 0
   * maximum: 128
   * @return slotid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSlotid() {
    return slotid;
  }

  public void setSlotid(Integer slotid) {
    this.slotid = slotid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotReference slotReference = (SlotReference) o;
    return Objects.equals(this.frameid, slotReference.frameid) &&
        Objects.equals(this.slotid, slotReference.slotid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameid, slotid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotReference {\n");
    
    sb.append("    frameid: ").append(toIndentedString(frameid)).append("\n");
    sb.append("    slotid: ").append(toIndentedString(slotid)).append("\n");
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

