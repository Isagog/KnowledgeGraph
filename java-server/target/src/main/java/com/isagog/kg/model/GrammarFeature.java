package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Grammatic feature
 */
@ApiModel(description = "Grammatic feature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T18:16:25.229+01:00[Europe/Berlin]")
public class GrammarFeature   {
  /**
   * Gets or Sets attribute
   */
  public enum AttributeEnum {
    NUMBER("NUMBER"),
    
    PERSON("PERSON"),
    
    TENSE("TENSE"),
    
    MODE("MODE"),
    
    NOUN_TYPE("NOUN-TYPE"),
    
    VERB_TYPE("VERB-TYPE"),
    
    ADV_TYPE("ADV-TYPE"),
    
    ADJ_TYPE("ADJ-TYPE"),
    
    X("X");

    private String value;

    AttributeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributeEnum fromValue(String text) {
      for (AttributeEnum b : AttributeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("attribute")
  private AttributeEnum attribute;

  @JsonProperty("value")
  private String value;

  public GrammarFeature attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(value = "")
  public AttributeEnum getAttribute() {
    return attribute;
  }

  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }

  public GrammarFeature value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    GrammarFeature grammarFeature = (GrammarFeature) o;
    return Objects.equals(this.attribute, grammarFeature.attribute) &&
        Objects.equals(this.value, grammarFeature.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrammarFeature {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

