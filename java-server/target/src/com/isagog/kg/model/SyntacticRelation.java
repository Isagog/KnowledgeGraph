package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.DependencyAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Governor&#39;s syntactin role
 */
@ApiModel(description = "Governor's syntactin role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class SyntacticRelation extends DependencyAnnotation  {
  /**
   * Governor's syntactic role (Universal Dependencies)
   */
  public enum TagEnum {
    ACL("ACL"),
    
    ADVCL("ADVCL"),
    
    ADVMOD("ADVMOD"),
    
    AMOD("AMOD"),
    
    APPOS("APPOS"),
    
    AUX("AUX"),
    
    CASE("CASE"),
    
    CC("CC"),
    
    CCOMP("CCOMP"),
    
    CLF("CLF"),
    
    COMPOUND("COMPOUND"),
    
    CONJ("CONJ"),
    
    COP("COP"),
    
    CSUBJ("CSUBJ"),
    
    DEP("DEP"),
    
    DET("DET"),
    
    DISCOURSE("DISCOURSE"),
    
    DISLOCATED("DISLOCATED"),
    
    EXPL("EXPL"),
    
    FIXED("FIXED"),
    
    FLAT("FLAT"),
    
    GOESWITH("GOESWITH"),
    
    IOBJ("IOBJ"),
    
    LIST("LIST"),
    
    MARK("MARK"),
    
    NMOD("NMOD"),
    
    NSUBJ("NSUBJ"),
    
    NUMMOD("NUMMOD"),
    
    OBJ("OBJ"),
    
    OBL("OBL"),
    
    ORPHAN("ORPHAN"),
    
    PARATAXIS("PARATAXIS"),
    
    PUNCT("PUNCT"),
    
    REPARANDUM("REPARANDUM"),
    
    ROOT("ROOT"),
    
    VOCATIVE("VOCATIVE"),
    
    XCOMP("XCOMP"),
    
    OTHER("OTHER");

    private String value;

    TagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TagEnum fromValue(String text) {
      for (TagEnum b : TagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("tag")
  private TagEnum tag;

  @JsonProperty("extension")
  private String extension;

  public SyntacticRelation tag(TagEnum tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Governor's syntactic role (Universal Dependencies)
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "Governor's syntactic role (Universal Dependencies)")
  public TagEnum getTag() {
    return tag;
  }

  public void setTag(TagEnum tag) {
    this.tag = tag;
  }

  public SyntacticRelation extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Further details or non UD tag
   * @return extension
  **/
  @ApiModelProperty(value = "Further details or non UD tag")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntacticRelation syntacticRelation = (SyntacticRelation) o;
    return Objects.equals(this.tag, syntacticRelation.tag) &&
        Objects.equals(this.extension, syntacticRelation.extension) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, extension, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntacticRelation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

