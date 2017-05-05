
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
    "in",
    "cm"
})
public class SnowDay {

    @JsonProperty("in")
    private Double in;
    @JsonProperty("cm")
    private Double cm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The in
     */
    @JsonProperty("in")
    public Double getIn() {
        return in;
    }

    /**
     * 
     * @param in
     *     The in
     */
    @JsonProperty("in")
    public void setIn(Double in) {
        this.in = in;
    }

    /**
     * 
     * @return
     *     The cm
     */
    @JsonProperty("cm")
    public Double getCm() {
        return cm;
    }

    /**
     * 
     * @param cm
     *     The cm
     */
    @JsonProperty("cm")
    public void setCm(Double cm) {
        this.cm = cm;
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
