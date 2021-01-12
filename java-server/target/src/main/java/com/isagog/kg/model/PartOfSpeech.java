package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Part of speech
 */
public enum PartOfSpeech {
  
  ADJ("ADJ"),
  
  ADP("ADP"),
  
  ADV("ADV"),
  
  AUX("AUX"),
  
  CCONJ("CCONJ"),
  
  DET("DET"),
  
  INTJ("INTJ"),
  
  NOUN("NOUN"),
  
  NUM("NUM"),
  
  PART("PART"),
  
  PRON("PRON"),
  
  PROPN("PROPN"),
  
  PUNCT("PUNCT"),
  
  SCONJ("SCONJ"),
  
  SYM("SYM"),
  
  VERB("VERB"),
  
  X("X");

  private String value;

  PartOfSpeech(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PartOfSpeech fromValue(String text) {
    for (PartOfSpeech b : PartOfSpeech.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

