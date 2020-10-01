/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.AtomicConcept;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Knowledge Element classification record
 */
@ApiModel(description = "Knowledge Element classification record")
@JsonPropertyOrder({
  Classification.JSON_PROPERTY_CLASSIFIER,
  Classification.JSON_PROPERTY_SUPPORT,
  Classification.JSON_PROPERTY_METHOD
})
@JsonTypeName("Classification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
public class Classification {
  public static final String JSON_PROPERTY_CLASSIFIER = "classifier";
  private AtomicConcept classifier;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Support support;

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    DEDUCTION("DEDUCTION"),
    
    ABDUCTION("ABDUCTION");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_METHOD = "method";
  private MethodEnum method = MethodEnum.DEDUCTION;


  public Classification classifier(AtomicConcept classifier) {
    
    this.classifier = classifier;
    return this;
  }

   /**
   * Get classifier
   * @return classifier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLASSIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AtomicConcept getClassifier() {
    return classifier;
  }


  public void setClassifier(AtomicConcept classifier) {
    this.classifier = classifier;
  }


  public Classification support(Support support) {
    
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Support getSupport() {
    return support;
  }


  public void setSupport(Support support) {
    this.support = support;
  }


  public Classification method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
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
        Objects.equals(this.support, classification.support) &&
        Objects.equals(this.method, classification.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifier, support, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

