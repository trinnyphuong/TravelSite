
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
    "mm"
})
public class QpfNight {

    @JsonProperty("in")
    private Double in;
    @JsonProperty("mm")
    private Integer mm;
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
     *     The mm
     */
    @JsonProperty("mm")
    public Integer getMm() {
        return mm;
    }

    /**
     * 
     * @param mm
     *     The mm
     */
    @JsonProperty("mm")
    public void setMm(Integer mm) {
        this.mm = mm;
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
