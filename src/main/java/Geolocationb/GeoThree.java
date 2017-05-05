
package Geolocationb;

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
    "considerIp",
    "wifiAccessPoints"
})
public class GeoThree {

    @JsonProperty("considerIp")
    private String considerIp;
    @JsonProperty("wifiAccessPoints")
    private List<WifiAccessPoint> wifiAccessPoints = new ArrayList<WifiAccessPoint>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The considerIp
     */
    @JsonProperty("considerIp")
    public String getConsiderIp() {
        return considerIp;
    }

    /**
     * 
     * @param considerIp
     *     The considerIp
     */
    @JsonProperty("considerIp")
    public void setConsiderIp(String considerIp) {
        this.considerIp = considerIp;
    }

    /**
     * 
     * @return
     *     The wifiAccessPoints
     */
    @JsonProperty("wifiAccessPoints")
    public List<WifiAccessPoint> getWifiAccessPoints() {
        return wifiAccessPoints;
    }

    /**
     * 
     * @param wifiAccessPoints
     *     The wifiAccessPoints
     */
    @JsonProperty("wifiAccessPoints")
    public void setWifiAccessPoints(List<WifiAccessPoint> wifiAccessPoints) {
        this.wifiAccessPoints = wifiAccessPoints;
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
