/*
 * Isagog Knowledge Graph Language Service
 * Isagog Knowledge Graph Language module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Text general classification (e.g. intent or sentiment)
 */
@ApiModel(description = "Text general classification (e.g. intent or sentiment)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.116+02:00[Europe/Berlin]")
public class Classification {
  public static final String SERIALIZED_NAME_CLASSIFIER = "classifier";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER)
  private String classifier;

  public static final String SERIALIZED_NAME_SUPPORT = "support";
  @SerializedName(SERIALIZED_NAME_SUPPORT)
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
  @javax.annotation.Nullable
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

