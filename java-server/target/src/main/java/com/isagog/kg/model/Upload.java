package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Upload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-01T22:54:50.715+01:00[Europe/Berlin]")
public class Upload   {
  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    XML("XML"),
    
    TURTLE("TURTLE"),
    
    N3("N3"),
    
    CSV("CSV"),
    
    JSON("JSON");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("format")
  private FormatEnum format;

  @JsonProperty("content")
  private byte[] content;

  public Upload format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public Upload content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upload upload = (Upload) o;
    return Objects.equals(this.format, upload.format) &&
        Objects.equals(this.content, upload.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

