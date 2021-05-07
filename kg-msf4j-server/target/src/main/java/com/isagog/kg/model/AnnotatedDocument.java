package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classification;
import com.isagog.kg.model.Document;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.KeywordAnnotation;
import com.isagog.kg.model.Sentence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Document annotation
 */
@ApiModel(description = "Document annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class AnnotatedDocument extends Document  {
  @JsonProperty("classes")
  private List<Classification> classes = null;

  @JsonProperty("sentences")
  private List<Sentence> sentences = null;

  @JsonProperty("entities")
  private List<EntityAnnotation> entities = null;

  @JsonProperty("summary")
  private List<Sentence> summary = null;

  @JsonProperty("keywords")
  private List<KeywordAnnotation> keywords = null;

  public AnnotatedDocument classes(List<Classification> classes) {
    this.classes = classes;
    return this;
  }

  public AnnotatedDocument addClassesItem(Classification classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Text classification
   * @return classes
  **/
  @ApiModelProperty(value = "Text classification")
  public List<Classification> getClasses() {
    return classes;
  }

  public void setClasses(List<Classification> classes) {
    this.classes = classes;
  }

  public AnnotatedDocument sentences(List<Sentence> sentences) {
    this.sentences = sentences;
    return this;
  }

  public AnnotatedDocument addSentencesItem(Sentence sentencesItem) {
    if (this.sentences == null) {
      this.sentences = new ArrayList<>();
    }
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * Get sentences
   * @return sentences
  **/
  @ApiModelProperty(value = "")
  public List<Sentence> getSentences() {
    return sentences;
  }

  public void setSentences(List<Sentence> sentences) {
    this.sentences = sentences;
  }

  public AnnotatedDocument entities(List<EntityAnnotation> entities) {
    this.entities = entities;
    return this;
  }

  public AnnotatedDocument addEntitiesItem(EntityAnnotation entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Entity annotation
   * @return entities
  **/
  @ApiModelProperty(value = "Entity annotation")
  public List<EntityAnnotation> getEntities() {
    return entities;
  }

  public void setEntities(List<EntityAnnotation> entities) {
    this.entities = entities;
  }

  public AnnotatedDocument summary(List<Sentence> summary) {
    this.summary = summary;
    return this;
  }

  public AnnotatedDocument addSummaryItem(Sentence summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public List<Sentence> getSummary() {
    return summary;
  }

  public void setSummary(List<Sentence> summary) {
    this.summary = summary;
  }

  public AnnotatedDocument keywords(List<KeywordAnnotation> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AnnotatedDocument addKeywordsItem(KeywordAnnotation keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keyword annotation
   * @return keywords
  **/
  @ApiModelProperty(value = "Keyword annotation")
  public List<KeywordAnnotation> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordAnnotation> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedDocument annotatedDocument = (AnnotatedDocument) o;
    return Objects.equals(this.classes, annotatedDocument.classes) &&
        Objects.equals(this.sentences, annotatedDocument.sentences) &&
        Objects.equals(this.entities, annotatedDocument.entities) &&
        Objects.equals(this.summary, annotatedDocument.summary) &&
        Objects.equals(this.keywords, annotatedDocument.keywords) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, sentences, entities, summary, keywords, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedDocument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

