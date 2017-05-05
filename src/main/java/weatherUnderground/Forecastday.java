
package weatherUnderground;

import java.util.HashMap;
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
    "period",
    "icon",
    "icon_url",
    "title",
    "fcttext",
    "fcttext_metric",
    "pop"
})
public class Forecastday {

    @JsonProperty("period")
    private Integer period;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("fcttext")
    private String fcttext;
    @JsonProperty("fcttext_metric")
    private String fcttextMetric;
    @JsonProperty("pop")
    private String pop;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The period
     */
    @JsonProperty("period")
    public Integer getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    @JsonProperty("period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * 
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The icon_url
     */
    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The fcttext
     */
    @JsonProperty("fcttext")
    public String getFcttext() {
        return fcttext;
    }

    /**
     * 
     * @param fcttext
     *     The fcttext
     */
    @JsonProperty("fcttext")
    public void setFcttext(String fcttext) {
        this.fcttext = fcttext;
    }

    /**
     * 
     * @return
     *     The fcttextMetric
     */
    @JsonProperty("fcttext_metric")
    public String getFcttextMetric() {
        return fcttextMetric;
    }

    /**
     * 
     * @param fcttextMetric
     *     The fcttext_metric
     */
    @JsonProperty("fcttext_metric")
    public void setFcttextMetric(String fcttextMetric) {
        this.fcttextMetric = fcttextMetric;
    }

    /**
     * 
     * @return
     *     The pop
     */
    @JsonProperty("pop")
    public String getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    @JsonProperty("pop")
    public void setPop(String pop) {
        this.pop = pop;
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
