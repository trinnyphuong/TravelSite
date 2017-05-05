
package autocomplete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "main_text",
    "main_text_matched_substrings",
    "secondary_text"
})
public class StructuredFormatting {

    @JsonProperty("main_text")
    private String mainText;
    @JsonProperty("main_text_matched_substrings")
    private List<MainTextMatchedSubstring> mainTextMatchedSubstrings = new ArrayList<MainTextMatchedSubstring>();
    @JsonProperty("secondary_text")
    private String secondaryText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mainText
     */
    @JsonProperty("main_text")
    public String getMainText() {
        return mainText;
    }

    /**
     * 
     * @param mainText
     *     The main_text
     */
    @JsonProperty("main_text")
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    /**
     * 
     * @return
     *     The mainTextMatchedSubstrings
     */
    @JsonProperty("main_text_matched_substrings")
    public List<MainTextMatchedSubstring> getMainTextMatchedSubstrings() {
        return mainTextMatchedSubstrings;
    }

    /**
     * 
     * @param mainTextMatchedSubstrings
     *     The main_text_matched_substrings
     */
    @JsonProperty("main_text_matched_substrings")
    public void setMainTextMatchedSubstrings(List<MainTextMatchedSubstring> mainTextMatchedSubstrings) {
        this.mainTextMatchedSubstrings = mainTextMatchedSubstrings;
    }

    /**
     * 
     * @return
     *     The secondaryText
     */
    @JsonProperty("secondary_text")
    public String getSecondaryText() {
        return secondaryText;
    }

    /**
     * 
     * @param secondaryText
     *     The secondary_text
     */
    @JsonProperty("secondary_text")
    public void setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
