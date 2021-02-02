package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot bound to a relation (property)
 */
@ApiModel(description = "A slot bound to a relation (property)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-01T22:54:51.415+01:00[Europe/Berlin]")
public class RelationalSlot extends Slot  {
  @JsonProperty("subjectBinding")
  private Integer subjectBinding;

  @JsonProperty("objectBinding")
  private Integer objectBinding;

  public RelationalSlot subjectBinding(Integer subjectBinding) {
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * Slot's subject binding, must be a ConceptualSlot in the same frame.
   * minimum: 0
   * maximum: 128
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "Slot's subject binding, must be a ConceptualSlot in the same frame.")
  public Integer getSubjectBinding() {
    return subjectBinding;
  }

  public void setSubjectBinding(Integer subjectBinding) {
    this.subjectBinding = subjectBinding;
  }

  public RelationalSlot objectBinding(Integer objectBinding) {
    this.objectBinding = objectBinding;
    return this;
  }

   /**
   * Slot's object binding, must be a ConceptualSlot in the same frame.
   * minimum: 0
   * maximum: 128
   * @return objectBinding
  **/
  @ApiModelProperty(value = "Slot's object binding, must be a ConceptualSlot in the same frame.")
  public Integer getObjectBinding() {
    return objectBinding;
  }

  public void setObjectBinding(Integer objectBinding) {
    this.objectBinding = objectBinding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalSlot relationalSlot = (RelationalSlot) o;
    return Objects.equals(this.subjectBinding, relationalSlot.subjectBinding) &&
        Objects.equals(this.objectBinding, relationalSlot.objectBinding) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, objectBinding, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    objectBinding: ").append(toIndentedString(objectBinding)).append("\n");
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

