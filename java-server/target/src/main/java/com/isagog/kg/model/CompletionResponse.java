package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.InteractRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Completion array
 */
@ApiModel(description = "Completion array")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-18T10:42:13.875+01:00[Europe/Berlin]")
public class CompletionResponse   {
  @JsonProperty("suggestions")
  private List<InteractRecord> suggestions = null;

  public CompletionResponse suggestions(List<InteractRecord> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public CompletionResponse addSuggestionsItem(InteractRecord suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<InteractRecord>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Suggested interactions, should be sorted by type (itype)
   * @return suggestions
  **/
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

