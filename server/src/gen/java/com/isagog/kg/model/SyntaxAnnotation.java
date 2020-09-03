package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Token syntactic dependency
 */
@ApiModel(description = "Token syntactic dependency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class SyntaxAnnotation extends DependencyAnnotation  {
  /**
   * Gets or Sets syntax
   */
  public enum SyntaxEnum {
    OBJECT("OBJECT"),
    
    SUBJECT("SUBJECT"),
    
    COMPLEMENT("COMPLEMENT"),
    
    ADJUNCT("ADJUNCT"),
    
    COORDINATE("COORDINATE");

    private String value;

    SyntaxEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SyntaxEnum fromValue(String text) {
      for (SyntaxEnum b : SyntaxEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("syntax")
  private SyntaxEnum syntax;

  public SyntaxAnnotation syntax(SyntaxEnum syntax) {
    this.syntax = syntax;
    return this;
  }

   /**
   * Get syntax
   * @return syntax
  **/
  @ApiModelProperty(required = true, value = "")
  public SyntaxEnum getSyntax() {
    return syntax;
  }

  public void setSyntax(SyntaxEnum syntax) {
    this.syntax = syntax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntaxAnnotation syntaxAnnotation = (SyntaxAnnotation) o;
    return Objects.equals(this.syntax, syntaxAnnotation.syntax) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syntax, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntaxAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    syntax: ").append(toIndentedString(syntax)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

