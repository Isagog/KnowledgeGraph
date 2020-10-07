package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Text annotation (should be abstract)
 */
@ApiModel(description = "Text annotation (should be abstract)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class TextAnnotation   {
  /**
   * Annotation type
   */
  public enum AtypeEnum {
    ENTITYANNOTATION("EntityAnnotation"),
    
    GRAMMARANNOTATION("GrammarAnnotation"),
    
    SYNTAXANNOTATION("SyntaxAnnotation"),
    
    DEPENDENCYANNOTATION("DependencyAnnotation"),
    
    RELATIONANNOTATION("RelationAnnotation"),
    
    CLASSANNOTATION("ClassAnnotation");

    private String value;

    AtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AtypeEnum fromValue(String text) {
      for (AtypeEnum b : AtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("atype")
  private AtypeEnum atype;

  @JsonProperty("support")
  private Support support;

  public TextAnnotation atype(AtypeEnum atype) {
    this.atype = atype;
    return this;
  }

   /**
   * Annotation type
   * @return atype
  **/
  @ApiModelProperty(required = true, value = "Annotation type")
  public AtypeEnum getAtype() {
    return atype;
  }

  public void setAtype(AtypeEnum atype) {
    this.atype = atype;
  }

  public TextAnnotation support(Support support) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAnnotation textAnnotation = (TextAnnotation) o;
    return Objects.equals(this.atype, textAnnotation.atype) &&
        Objects.equals(this.support, textAnnotation.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atype, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAnnotation {\n");
    
    sb.append("    atype: ").append(toIndentedString(atype)).append("\n");
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

