
package placeDetails;

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
    "aspects",
    "author_name",
    "author_url",
    "language",
    "profile_photo_url",
    "rating",
    "relative_time_description",
    "text",
    "time"
})
public class Review {

    @JsonProperty("aspects")
    private List<Aspect> aspects = new ArrayList<Aspect>();
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_url")
    private String authorUrl;
    @JsonProperty("language")
    private String language;
    @JsonProperty("profile_photo_url")
    private String profilePhotoUrl;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("relative_time_description")
    private String relativeTimeDescription;
    @JsonProperty("text")
    private String text;
    @JsonProperty("time")
    private Integer time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The aspects
     */
    @JsonProperty("aspects")
    public List<Aspect> getAspects() {
        return aspects;
    }

    /**
     * 
     * @param aspects
     *     The aspects
     */
    @JsonProperty("aspects")
    public void setAspects(List<Aspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * 
     * @return
     *     The authorName
     */
    @JsonProperty("author_name")
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 
     * @param authorName
     *     The author_name
     */
    @JsonProperty("author_name")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * 
     * @return
     *     The authorUrl
     */
    @JsonProperty("author_url")
    public String getAuthorUrl() {
        return authorUrl;
    }

    /**
     * 
     * @param authorUrl
     *     The author_url
     */
    @JsonProperty("author_url")
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The profilePhotoUrl
     */
    @JsonProperty("profile_photo_url")
    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    /**
     * 
     * @param profilePhotoUrl
     *     The profile_photo_url
     */
    @JsonProperty("profile_photo_url")
    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public Integer getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The relativeTimeDescription
     */
    @JsonProperty("relative_time_description")
    public String getRelativeTimeDescription() {
        return relativeTimeDescription;
    }

    /**
     * 
     * @param relativeTimeDescription
     *     The relative_time_description
     */
    @JsonProperty("relative_time_description")
    public void setRelativeTimeDescription(String relativeTimeDescription) {
        this.relativeTimeDescription = relativeTimeDescription;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
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
