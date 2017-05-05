
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
    "open_now",
    "periods",
    "weekday_text"
})
public class OpeningHours {

    @JsonProperty("open_now")
    private Boolean openNow;
    @JsonProperty("periods")
    private List<Period> periods = new ArrayList<Period>();
    @JsonProperty("weekday_text")
    private List<String> weekdayText = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The openNow
     */
    @JsonProperty("open_now")
    public Boolean getOpenNow() {
        return openNow;
    }

    /**
     * 
     * @param openNow
     *     The open_now
     */
    @JsonProperty("open_now")
    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }

    /**
     * 
     * @return
     *     The periods
     */
    @JsonProperty("periods")
    public List<Period> getPeriods() {
        return periods;
    }

    /**
     * 
     * @param periods
     *     The periods
     */
    @JsonProperty("periods")
    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    /**
     * 
     * @return
     *     The weekdayText
     */
    @JsonProperty("weekday_text")
    public List<String> getWeekdayText() {
        return weekdayText;
    }

    /**
     * 
     * @param weekdayText
     *     The weekday_text
     */
    @JsonProperty("weekday_text")
    public void setWeekdayText(List<String> weekdayText) {
        this.weekdayText = weekdayText;
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
