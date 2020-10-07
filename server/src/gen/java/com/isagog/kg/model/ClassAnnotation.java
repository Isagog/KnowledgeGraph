package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.TextAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Text classification
 */
@ApiModel(description = "Text classification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class ClassAnnotation extends TextAnnotation  {
  @JsonProperty("classifiers")
  private List<String> classifiers = new ArrayList<String>();

  public ClassAnnotation classifiers(List<String> classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  public ClassAnnotation addClassifiersItem(String classifiersItem) {
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * Get classifiers
   * @return classifiers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(List<String> classifiers) {
    this.classifiers = classifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassAnnotation classAnnotation = (ClassAnnotation) o;
    return Objects.equals(this.classifiers, classAnnotation.classifiers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifiers, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
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

