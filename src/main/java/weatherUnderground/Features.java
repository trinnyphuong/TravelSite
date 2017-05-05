
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
    "forecast10day"
})
public class Features {

    @JsonProperty("forecast10day")
    private Integer forecast10day;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The forecast10day
     */
    @JsonProperty("forecast10day")
    public Integer getForecast10day() {
        return forecast10day;
    }

    /**
     * 
     * @param forecast10day
     *     The forecast10day
     */
    @JsonProperty("forecast10day")
    public void setForecast10day(Integer forecast10day) {
        this.forecast10day = forecast10day;
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
