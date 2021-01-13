package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.InteractType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Interaction record
 */
@ApiModel(description = "Interaction record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-13T15:29:38.710+01:00[Europe/Berlin]")
public class InteractRecord   {
  @JsonProperty("itype")
  private InteractType itype;

  @JsonProperty("kitem")
  private String kitem;

  @JsonProperty("value")
  private String value;

  @JsonProperty("binding")
  private Integer binding;

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

  public InteractRecord binding(Integer binding) {
    this.binding = binding;
    return this;
  }

   /**
   * Frame slot binding (opt)
   * minimum: 0
   * maximum: 128
   * @return binding
  **/
  @ApiModelProperty(value = "Frame slot binding (opt)")
  public Integer getBinding() {
    return binding;
  }

  public void setBinding(Integer binding) {
    this.binding = binding;
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
        Objects.equals(this.kitem, interactRecord.kitem) &&
        Objects.equals(this.value, interactRecord.value) &&
        Objects.equals(this.binding, interactRecord.binding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itype, kitem, value, binding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractRecord {\n");
    
    sb.append("    itype: ").append(toIndentedString(itype)).append("\n");
    sb.append("    kitem: ").append(toIndentedString(kitem)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
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

