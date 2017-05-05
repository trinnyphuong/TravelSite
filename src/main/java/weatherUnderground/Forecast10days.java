
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
    "response",
    "forecast"
})
public class Forecast10days {

    @JsonProperty("response")
    private Response response;
    @JsonProperty("forecast")
    private Forecast forecast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The response
     */
    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The forecast
     */
    @JsonProperty("forecast")
    public Forecast getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    @JsonProperty("forecast")
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
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
