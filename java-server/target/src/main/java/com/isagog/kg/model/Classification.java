package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Text general classification (e.g. intent or sentiment)
 */
@ApiModel(description = "Text general classification (e.g. intent or sentiment)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class Classification   {
  @JsonProperty("classifier")
  private String classifier;

  @JsonProperty("support")
  private Double support;

  public Classification classifier(String classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Get classifier
   * @return classifier
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassifier() {
    return classifier;
  }

  public void setClassifier(String classifier) {
    this.classifier = classifier;
  }

  public Classification support(Double support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * minimum: 0.0
   * maximum: 1.0
   * @return support
  **/
  @ApiModelProperty(value = "")
  public Double getSupport() {
    return support;
  }

  public void setSupport(Double support) {
    this.support = support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classification classification = (Classification) o;
    return Objects.equals(this.classifier, classification.classifier) &&
        Objects.equals(this.support, classification.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifier, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

