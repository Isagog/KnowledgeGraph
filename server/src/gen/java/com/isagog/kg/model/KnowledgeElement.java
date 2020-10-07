package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Managed knowledge element
 */
@ApiModel(description = "Managed knowledge element")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:26:29.882986300+02:00[Europe/Berlin]")
public class KnowledgeElement   {
  @JsonProperty("id")
  private String id;

  /**
   * Gets or Sets ktype
   */
  public enum KtypeEnum {
    ATOMICCONCEPT("AtomicConcept"),
    
    RELATIONALCONCEPT("RelationalConcept"),
    
    ATTRIBUTIVECONCEPT("AttributiveConcept"),
    
    RELATION("Relation"),
    
    ENTITY("Entity"),
    
    CONCEPTSTATEMENT("ConceptStatement"),
    
    ENTITYSTATEMENT("EntityStatement"),
    
    CLASSIFICATIONSTATEMENT("ClassificationStatement"),
    
    RELATIONALSTATEMENT("RelationalStatement"),
    
    ATTRIBUTIVESTATEMENT("AttributiveStatement"),
    
    SITUATION("Situation");

    private String value;

    KtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KtypeEnum fromValue(String text) {
      for (KtypeEnum b : KtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ktype")
  private KtypeEnum ktype;

  @JsonProperty("annotations")
  private List<KnowledgeAnnotation> annotations = null;

  public KnowledgeElement id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KnowledgeElement ktype(KtypeEnum ktype) {
    this.ktype = ktype;
    return this;
  }

   /**
   * Get ktype
   * @return ktype
  **/
  @ApiModelProperty(required = true, value = "")
  public KtypeEnum getKtype() {
    return ktype;
  }

  public void setKtype(KtypeEnum ktype) {
    this.ktype = ktype;
  }

  public KnowledgeElement annotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KnowledgeElement addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KnowledgeAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public List<KnowledgeAnnotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeElement knowledgeElement = (KnowledgeElement) o;
    return Objects.equals(this.id, knowledgeElement.id) &&
        Objects.equals(this.ktype, knowledgeElement.ktype) &&
        Objects.equals(this.annotations, knowledgeElement.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ktype, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ktype: ").append(toIndentedString(ktype)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

