package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot boud to a concept
 */
@ApiModel(description = "A slot boud to a concept")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class ConceptualSlot extends Slot  {
  @JsonProperty("value")
  private URI value;

  public ConceptualSlot value(URI value) {
    this.value = value;
    return this;
  }

   /**
   * Constant Entity reference (opt)
   * @return value
  **/
  @ApiModelProperty(value = "Constant Entity reference (opt)")
  public URI getValue() {
    return value;
  }

  public void setValue(URI value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptualSlot conceptualSlot = (ConceptualSlot) o;
    return Objects.equals(this.value, conceptualSlot.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptualSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

