
package Geolocationb;

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
    "macAddress",
    "signalStrength",
    "signalToNoiseRatio"
})
public class WifiAccessPoint {

    @JsonProperty("macAddress")
    private String macAddress;
    @JsonProperty("signalStrength")
    private Integer signalStrength;
    @JsonProperty("signalToNoiseRatio")
    private Integer signalToNoiseRatio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The macAddress
     */
    @JsonProperty("macAddress")
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 
     * @param macAddress
     *     The macAddress
     */
    @JsonProperty("macAddress")
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * 
     * @return
     *     The signalStrength
     */
    @JsonProperty("signalStrength")
    public Integer getSignalStrength() {
        return signalStrength;
    }

    /**
     * 
     * @param signalStrength
     *     The signalStrength
     */
    @JsonProperty("signalStrength")
    public void setSignalStrength(Integer signalStrength) {
        this.signalStrength = signalStrength;
    }

    /**
     * 
     * @return
     *     The signalToNoiseRatio
     */
    @JsonProperty("signalToNoiseRatio")
    public Integer getSignalToNoiseRatio() {
        return signalToNoiseRatio;
    }

    /**
     * 
     * @param signalToNoiseRatio
     *     The signalToNoiseRatio
     */
    @JsonProperty("signalToNoiseRatio")
    public void setSignalToNoiseRatio(Integer signalToNoiseRatio) {
        this.signalToNoiseRatio = signalToNoiseRatio;
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
