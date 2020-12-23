package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Knowledge statement
 */
@ApiModel(description = "Knowledge statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class Statement extends KnowledgeElement  {
  @JsonProperty("subject")
  private URI subject;

  /**
   * Gets or Sets privacy
   */
  public enum PrivacyEnum {
    OWNER("OWNER"),
    
    TRUSTED("TRUSTED"),
    
    CONTACTS("CONTACTS"),
    
    PUBLIC("PUBLIC");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyEnum fromValue(String text) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("privacy")
  private PrivacyEnum privacy = PrivacyEnum.OWNER;

  @JsonProperty("support")
  private Double support;

  public Statement subject(URI subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The predicate's subject id, may be omitted when the statement is contained in a structure
   * @return subject
  **/
  @ApiModelProperty(value = "The predicate's subject id, may be omitted when the statement is contained in a structure")
  public URI getSubject() {
    return subject;
  }

  public void setSubject(URI subject) {
    this.subject = subject;
  }

  public Statement privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @ApiModelProperty(value = "")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public Statement support(Double support) {
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
    Statement statement = (Statement) o;
    return Objects.equals(this.subject, statement.subject) &&
        Objects.equals(this.privacy, statement.privacy) &&
        Objects.equals(this.support, statement.support) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, privacy, support, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

