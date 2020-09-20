package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.AtomicConcept;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Knowledge Element classification record
 */
@ApiModel(description = "Knowledge Element classification record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class Classification   {
  @JsonProperty("classifier")
  private AtomicConcept classifier;

  @JsonProperty("support")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("method")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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

