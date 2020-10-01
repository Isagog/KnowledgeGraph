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
 * Text annotation
 */
@ApiModel(description = "Text annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class TextAnnotation   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Gets or Sets atype
   */
  public enum AtypeEnum {
    ENTITYANNOTATION("EntityAnnotation"),
    
    GRAMMARANNOTATION("GrammarAnnotation"),
    
    SYNTAXANNOTATION("SyntaxAnnotation"),
    
    DEPENDENCYANNOTATION("DependencyAnnotation"),
    
    RELATIONANNOTATION("RelationAnnotation");

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

  public TextAnnotation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Annotation array index, should be consistent with the container's one
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Annotation array index, should be consistent with the container's one")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public TextAnnotation atype(AtypeEnum atype) {
    this.atype = atype;
    return this;
  }

   /**
   * Get atype
   * @return atype
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.index, textAnnotation.index) &&
        Objects.equals(this.atype, textAnnotation.atype) &&
        Objects.equals(this.support, textAnnotation.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, atype, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAnnotation {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

