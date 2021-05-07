package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classification;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.KeywordAnnotation;
import com.isagog.kg.model.LemmaAnnotation;
import com.isagog.kg.model.Sentence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Text annotation
 */
@ApiModel(description = "Text annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class AnnotatedSentence extends Sentence  {
  @JsonProperty("classes")
  private List<Classification> classes = null;

  @JsonProperty("lemmas")
  private List<LemmaAnnotation> lemmas = null;

  @JsonProperty("entities")
  private List<EntityAnnotation> entities = null;

  @JsonProperty("keywords")
  private List<KeywordAnnotation> keywords = null;

  @JsonProperty("dependencies")
  private List<DependencyAnnotation> dependencies = null;

  public AnnotatedSentence classes(List<Classification> classes) {
    this.classes = classes;
    return this;
  }

  public AnnotatedSentence addClassesItem(Classification classesItem) {
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

  public AnnotatedSentence lemmas(List<LemmaAnnotation> lemmas) {
    this.lemmas = lemmas;
    return this;
  }

  public AnnotatedSentence addLemmasItem(LemmaAnnotation lemmasItem) {
    if (this.lemmas == null) {
      this.lemmas = new ArrayList<>();
    }
    this.lemmas.add(lemmasItem);
    return this;
  }

   /**
   * Basic token annotation
   * @return lemmas
  **/
  @ApiModelProperty(value = "Basic token annotation")
  public List<LemmaAnnotation> getLemmas() {
    return lemmas;
  }

  public void setLemmas(List<LemmaAnnotation> lemmas) {
    this.lemmas = lemmas;
  }

  public AnnotatedSentence entities(List<EntityAnnotation> entities) {
    this.entities = entities;
    return this;
  }

  public AnnotatedSentence addEntitiesItem(EntityAnnotation entitiesItem) {
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

  public AnnotatedSentence keywords(List<KeywordAnnotation> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AnnotatedSentence addKeywordsItem(KeywordAnnotation keywordsItem) {
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

  public AnnotatedSentence dependencies(List<DependencyAnnotation> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public AnnotatedSentence addDependenciesItem(DependencyAnnotation dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies
   * @return dependencies
  **/
  @ApiModelProperty(value = "Dependencies")
  public List<DependencyAnnotation> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<DependencyAnnotation> dependencies) {
    this.dependencies = dependencies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedSentence annotatedSentence = (AnnotatedSentence) o;
    return Objects.equals(this.classes, annotatedSentence.classes) &&
        Objects.equals(this.lemmas, annotatedSentence.lemmas) &&
        Objects.equals(this.entities, annotatedSentence.entities) &&
        Objects.equals(this.keywords, annotatedSentence.keywords) &&
        Objects.equals(this.dependencies, annotatedSentence.dependencies) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, lemmas, entities, keywords, dependencies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedSentence {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    lemmas: ").append(toIndentedString(lemmas)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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

