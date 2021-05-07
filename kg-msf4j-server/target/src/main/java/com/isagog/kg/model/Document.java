package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.Text;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

/**
 * Textual object
 */
@ApiModel(description = "Textual object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class Document extends Text  {
  @JsonProperty("id")
  private URI id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("source")
  private URI source;

  public Document id(URI id) {
    this.id = id;
    return this;
  }

   /**
   * Document identifier (uri)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Document identifier (uri)")
  public URI getId() {
    return id;
  }

  public void setId(URI id) {
    this.id = id;
  }

  public Document title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Document title
   * @return title
  **/
  @ApiModelProperty(value = "Document title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Document source(URI source) {
    this.source = source;
    return this;
  }

   /**
   * Document source (uri)
   * @return source
  **/
  @ApiModelProperty(value = "Document source (uri)")
  public URI getSource() {
    return source;
  }

  public void setSource(URI source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.title, document.title) &&
        Objects.equals(this.source, document.source) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, source, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

