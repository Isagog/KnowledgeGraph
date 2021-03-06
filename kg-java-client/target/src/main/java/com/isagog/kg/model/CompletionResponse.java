/*
 * Isagog Knowledge Graph Interaction Service
 * Isagog Knowledge Graph Interaction module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.isagog.kg.model.InteractRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Completion array
 */
@ApiModel(description = "Completion array")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:38.134+02:00[Europe/Berlin]")
public class CompletionResponse {
  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private List<InteractRecord> suggestions = null;


  public CompletionResponse suggestions(List<InteractRecord> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public CompletionResponse addSuggestionsItem(InteractRecord suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Suggested interactions, should be sorted by type (itype)
   * @return suggestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested interactions, should be sorted by type (itype)")

  public List<InteractRecord> getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(List<InteractRecord> suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionResponse completionResponse = (CompletionResponse) o;
    return Objects.equals(this.suggestions, completionResponse.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionResponse {\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

