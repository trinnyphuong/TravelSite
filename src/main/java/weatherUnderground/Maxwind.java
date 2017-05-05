
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
    "mph",
    "kph",
    "dir",
    "degrees"
})
public class Maxwind {

    @JsonProperty("mph")
    private Integer mph;
    @JsonProperty("kph")
    private Integer kph;
    @JsonProperty("dir")
    private String dir;
    @JsonProperty("degrees")
    private Integer degrees;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mph
     */
    @JsonProperty("mph")
    public Integer getMph() {
        return mph;
    }

    /**
     * 
     * @param mph
     *     The mph
     */
    @JsonProperty("mph")
    public void setMph(Integer mph) {
        this.mph = mph;
    }

    /**
     * 
     * @return
     *     The kph
     */
    @JsonProperty("kph")
    public Integer getKph() {
        return kph;
    }

    /**
     * 
     * @param kph
     *     The kph
     */
    @JsonProperty("kph")
    public void setKph(Integer kph) {
        this.kph = kph;
    }

    /**
     * 
     * @return
     *     The dir
     */
    @JsonProperty("dir")
    public String getDir() {
        return dir;
    }

    /**
     * 
     * @param dir
     *     The dir
     */
    @JsonProperty("dir")
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * 
     * @return
     *     The degrees
     */
    @JsonProperty("degrees")
    public Integer getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The degrees
     */
    @JsonProperty("degrees")
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
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
