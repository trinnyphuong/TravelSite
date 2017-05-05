
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
    "txt_forecast",
    "simpleforecast"
})
public class Forecast {

    @JsonProperty("txt_forecast")
    private TxtForecast txtForecast;
    @JsonProperty("simpleforecast")
    private Simpleforecast simpleforecast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The txtForecast
     */
    @JsonProperty("txt_forecast")
    public TxtForecast getTxtForecast() {
        return txtForecast;
    }

    /**
     * 
     * @param txtForecast
     *     The txt_forecast
     */
    @JsonProperty("txt_forecast")
    public void setTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
    }

    /**
     * 
     * @return
     *     The simpleforecast
     */
    @JsonProperty("simpleforecast")
    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    /**
     * 
     * @param simpleforecast
     *     The simpleforecast
     */
    @JsonProperty("simpleforecast")
    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
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
