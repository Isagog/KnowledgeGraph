package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Dependendency tag (Universal Dependencies)
 */
public enum SyntacticDependency {
  
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

  SyntacticDependency(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntacticDependency fromValue(String text) {
    for (SyntacticDependency b : SyntacticDependency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

