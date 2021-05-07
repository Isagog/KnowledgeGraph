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
 * Grammatic feature
 */
@ApiModel(description = "Grammatic feature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.116+02:00[Europe/Berlin]")
public class GrammarFeature {
  /**
   * Gets or Sets attribute
   */
  @JsonAdapter(AttributeEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttributeEnum fromValue(String value) {
      for (AttributeEnum b : AttributeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttributeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttributeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttributeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttributeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private AttributeEnum attribute;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public GrammarFeature attribute(AttributeEnum attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
