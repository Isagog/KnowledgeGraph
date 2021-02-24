package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Ranking record
 */
@ApiModel(description = "Ranking record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.562+01:00[Europe/Berlin]")
public class ElementRanking   {
  @JsonProperty("element")
  private KnowledgeElement element;

  @JsonProperty("support")
  private Double support;

  public ElementRanking element(KnowledgeElement element) {
    this.element = element;
    return this;
  }

   /**
   * Get element
   * @return element
  **/
  @ApiModelProperty(required = true, value = "")
  public KnowledgeElement getElement() {
    return element;
  }

  public void setElement(KnowledgeElement element) {
    this.element = element;
  }

  public ElementRanking support(Double support) {
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
    ElementRanking elementRanking = (ElementRanking) o;
    return Objects.equals(this.element, elementRanking.element) &&
        Objects.equals(this.support, elementRanking.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(element, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementRanking {\n");
    
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
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

