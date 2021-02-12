package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:33.397+01:00[Europe/Berlin]")
public class RelationalSlot extends Slot  {
  @JsonProperty("subjectBinding")
  private String subjectBinding;

  @JsonProperty("objectBinding")
  private String objectBinding;

  public RelationalSlot subjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * Slot's subject binding
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "Slot's subject binding")
  public String getSubjectBinding() {
    return subjectBinding;
  }

  public void setSubjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
  }

  public RelationalSlot objectBinding(String objectBinding) {
    this.objectBinding = objectBinding;
    return this;
  }

   /**
   * Slot's object binding
   * @return objectBinding
  **/
  @ApiModelProperty(value = "Slot's object binding")
  public String getObjectBinding() {
    return objectBinding;
  }

  public void setObjectBinding(String objectBinding) {
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

