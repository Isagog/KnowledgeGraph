package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Knowledge support score
 */
@ApiModel(description = "Knowledge support score")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-02T11:33:37.504057800+02:00[Europe/Berlin]")
public class Support   {
  @JsonProperty("evidence")
  private Double evidence = 0.5d;

  @JsonProperty("confidence")
  private Double confidence = 0.5d;

  public Support evidence(Double evidence) {
    this.evidence = evidence;
    return this;
  }

   /**
   * Evidence score [1=Positive evidence, 0=Negative evidence]
   * @return evidence
  **/
  @ApiModelProperty(required = true, value = "Evidence score [1=Positive evidence, 0=Negative evidence]")
  public Double getEvidence() {
    return evidence;
  }

  public void setEvidence(Double evidence) {
    this.evidence = evidence;
  }

  public Support confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Confidence score [1=Full confidence, 0=No confidence]
   * @return confidence
  **/
  @ApiModelProperty(required = true, value = "Confidence score [1=Full confidence, 0=No confidence]")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Support support = (Support) o;
    return Objects.equals(this.evidence, support.evidence) &&
        Objects.equals(this.confidence, support.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidence, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Support {\n");
    
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

