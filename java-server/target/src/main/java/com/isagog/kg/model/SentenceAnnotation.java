package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.BasicAnnotation;
import com.isagog.kg.model.Classification;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.Sentence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Text annotation
 */
@ApiModel(description = "Text annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-11T17:00:59.973+01:00[Europe/Berlin]")
public class SentenceAnnotation   {
  @JsonProperty("classes")
  private List<Classification> classes = null;

  @JsonProperty("tokens")
  private List<BasicAnnotation> tokens = null;

  @JsonProperty("entities")
  private List<EntityAnnotation> entities = null;

  @JsonProperty("dependencies")
  private List<DependencyAnnotation> dependencies = null;

  @JsonProperty("sentence")
  private Sentence sentence;

  public SentenceAnnotation classes(List<Classification> classes) {
    this.classes = classes;
    return this;
  }

  public SentenceAnnotation addClassesItem(Classification classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<Classification>();
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

  public SentenceAnnotation tokens(List<BasicAnnotation> tokens) {
    this.tokens = tokens;
    return this;
  }

  public SentenceAnnotation addTokensItem(BasicAnnotation tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<BasicAnnotation>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Basic token annotation
   * @return tokens
  **/
  @ApiModelProperty(value = "Basic token annotation")
  public List<BasicAnnotation> getTokens() {
    return tokens;
  }

  public void setTokens(List<BasicAnnotation> tokens) {
    this.tokens = tokens;
  }

  public SentenceAnnotation entities(List<EntityAnnotation> entities) {
    this.entities = entities;
    return this;
  }

  public SentenceAnnotation addEntitiesItem(EntityAnnotation entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<EntityAnnotation>();
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

  public SentenceAnnotation dependencies(List<DependencyAnnotation> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public SentenceAnnotation addDependenciesItem(DependencyAnnotation dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<DependencyAnnotation>();
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

  public SentenceAnnotation sentence(Sentence sentence) {
    this.sentence = sentence;
    return this;
  }

   /**
   * Get sentence
   * @return sentence
  **/
  @ApiModelProperty(value = "")
  public Sentence getSentence() {
    return sentence;
  }

  public void setSentence(Sentence sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentenceAnnotation sentenceAnnotation = (SentenceAnnotation) o;
    return Objects.equals(this.classes, sentenceAnnotation.classes) &&
        Objects.equals(this.tokens, sentenceAnnotation.tokens) &&
        Objects.equals(this.entities, sentenceAnnotation.entities) &&
        Objects.equals(this.dependencies, sentenceAnnotation.dependencies) &&
        Objects.equals(this.sentence, sentenceAnnotation.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes, tokens, entities, dependencies, sentence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentenceAnnotation {\n");
    
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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

