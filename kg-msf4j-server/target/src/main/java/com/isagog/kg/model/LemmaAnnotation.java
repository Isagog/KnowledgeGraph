package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class LemmaAnnotation extends TokenAnnotation  {
  @JsonProperty("pos")
  private PartOfSpeech pos;

  @JsonProperty("features")
  private List<GrammarFeature> features = null;

  @JsonProperty("lemma")
  private String lemma;

  public LemmaAnnotation pos(PartOfSpeech pos) {
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

  public LemmaAnnotation features(List<GrammarFeature> features) {
    this.features = features;
    return this;
  }

  public LemmaAnnotation addFeaturesItem(GrammarFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
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

  public LemmaAnnotation lemma(String lemma) {
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
    LemmaAnnotation lemmaAnnotation = (LemmaAnnotation) o;
    return Objects.equals(this.pos, lemmaAnnotation.pos) &&
        Objects.equals(this.features, lemmaAnnotation.features) &&
        Objects.equals(this.lemma, lemmaAnnotation.lemma) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, features, lemma, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LemmaAnnotation {\n");
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

