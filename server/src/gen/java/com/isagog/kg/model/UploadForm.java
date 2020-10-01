package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;

/**
 * Upload form
 */
@ApiModel(description = "Upload form")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class UploadForm   {
  /**
   * Serialization format
   */
  public enum FormatEnum {
    TURTLE("turtle"),
    
    RDF_XML("rdf-xml"),
    
    RDF_JSON("rdf-json"),
    
    JSON_LD("json-ld");

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
  private File content;

  public UploadForm format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Serialization format
   * @return format
  **/
  @ApiModelProperty(value = "Serialization format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public UploadForm content(File content) {
    this.content = content;
    return this;
  }

   /**
   * Serialized content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "Serialized content")
  public File getContent() {
    return content;
  }

  public void setContent(File content) {
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
    UploadForm uploadForm = (UploadForm) o;
    return Objects.equals(this.format, uploadForm.format) &&
        Objects.equals(this.content, uploadForm.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadForm {\n");
    
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

