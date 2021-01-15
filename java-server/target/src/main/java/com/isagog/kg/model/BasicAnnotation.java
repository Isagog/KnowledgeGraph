package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.GrammarFeature;
import com.isagog.kg.model.PartOfSpeech;
import com.isagog.kg.model.TokenAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Pos and lemma annotation
 */
@ApiModel(description = "Pos and lemma annotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class BasicAnnotation extends TokenAnnotation  {
  @JsonProperty("pos")
  private PartOfSpeech pos;

  @JsonProperty("features")
  private List<GrammarFeature> features = null;

  @JsonProperty("lemma")
  private String lemma;

  public BasicAnnotation pos(PartOfSpeech pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(required = true, value = "")
  public PartOfSpeech getPos() {
    return pos;
  }

  public void setPos(PartOfSpeech pos) {
    this.pos = pos;
  }

  public BasicAnnotation features(List<GrammarFeature> features) {
    this.features = features;
    return this;
  }

  public BasicAnnotation addFeaturesItem(GrammarFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<GrammarFeature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Grammatical features
   * @return features
  **/
  @ApiModelProperty(value = "Grammatical features")
  public List<GrammarFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<GrammarFeature> features) {
    this.features = features;
  }

  public BasicAnnotation lemma(String lemma) {
    this.lemma = lemma;
    return this;
  }

   /**
   * Base form
   * @return lemma
  **/
  @ApiModelProperty(required = true, value = "Base form")
  public String getLemma() {
    return lemma;
  }

  public void setLemma(String lemma) {
    this.lemma = lemma;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicAnnotation basicAnnotation = (BasicAnnotation) o;
    return Objects.equals(this.pos, basicAnnotation.pos) &&
        Objects.equals(this.features, basicAnnotation.features) &&
        Objects.equals(this.lemma, basicAnnotation.lemma) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, features, lemma, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    lemma: ").append(toIndentedString(lemma)).append("\n");
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

