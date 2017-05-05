
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
    "date",
    "period",
    "high",
    "low",
    "conditions",
    "icon",
    "icon_url",
    "skyicon",
    "pop",
    "qpf_allday",
    "qpf_day",
    "qpf_night",
    "snow_allday",
    "snow_day",
    "snow_night",
    "maxwind",
    "avewind",
    "avehumidity",
    "maxhumidity",
    "minhumidity"
})
public class Forecastday_ {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("period")
    private Integer period;
    @JsonProperty("high")
    private High high;
    @JsonProperty("low")
    private Low low;
    @JsonProperty("conditions")
    private String conditions;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("skyicon")
    private String skyicon;
    @JsonProperty("pop")
    private Integer pop;
    @JsonProperty("qpf_allday")
    private QpfAllday qpfAllday;
    @JsonProperty("qpf_day")
    private QpfDay qpfDay;
    @JsonProperty("qpf_night")
    private QpfNight qpfNight;
    @JsonProperty("snow_allday")
    private SnowAllday snowAllday;
    @JsonProperty("snow_day")
    private SnowDay snowDay;
    @JsonProperty("snow_night")
    private SnowNight snowNight;
    @JsonProperty("maxwind")
    private Maxwind maxwind;
    @JsonProperty("avewind")
    private Avewind avewind;
    @JsonProperty("avehumidity")
    private Integer avehumidity;
    @JsonProperty("maxhumidity")
    private Integer maxhumidity;
    @JsonProperty("minhumidity")
    private Integer minhumidity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

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
     *     The high
     */
    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The low
     */
    @JsonProperty("low")
    public Low getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    @JsonProperty("low")
    public void setLow(Low low) {
        this.low = low;
    }

    /**
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public String getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(String conditions) {
        this.conditions = conditions;
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
     *     The skyicon
     */
    @JsonProperty("skyicon")
    public String getSkyicon() {
        return skyicon;
    }

    /**
     * 
     * @param skyicon
     *     The skyicon
     */
    @JsonProperty("skyicon")
    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    /**
     * 
     * @return
     *     The pop
     */
    @JsonProperty("pop")
    public Integer getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    @JsonProperty("pop")
    public void setPop(Integer pop) {
        this.pop = pop;
    }

    /**
     * 
     * @return
     *     The qpfAllday
     */
    @JsonProperty("qpf_allday")
    public QpfAllday getQpfAllday() {
        return qpfAllday;
    }

    /**
     * 
     * @param qpfAllday
     *     The qpf_allday
     */
    @JsonProperty("qpf_allday")
    public void setQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
    }

    /**
     * 
     * @return
     *     The qpfDay
     */
    @JsonProperty("qpf_day")
    public QpfDay getQpfDay() {
        return qpfDay;
    }

    /**
     * 
     * @param qpfDay
     *     The qpf_day
     */
    @JsonProperty("qpf_day")
    public void setQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
    }

    /**
     * 
     * @return
     *     The qpfNight
     */
    @JsonProperty("qpf_night")
    public QpfNight getQpfNight() {
        return qpfNight;
    }

    /**
     * 
     * @param qpfNight
     *     The qpf_night
     */
    @JsonProperty("qpf_night")
    public void setQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
    }

    /**
     * 
     * @return
     *     The snowAllday
     */
    @JsonProperty("snow_allday")
    public SnowAllday getSnowAllday() {
        return snowAllday;
    }

    /**
     * 
     * @param snowAllday
     *     The snow_allday
     */
    @JsonProperty("snow_allday")
    public void setSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
    }

    /**
     * 
     * @return
     *     The snowDay
     */
    @JsonProperty("snow_day")
    public SnowDay getSnowDay() {
        return snowDay;
    }

    /**
     * 
     * @param snowDay
     *     The snow_day
     */
    @JsonProperty("snow_day")
    public void setSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
    }

    /**
     * 
     * @return
     *     The snowNight
     */
    @JsonProperty("snow_night")
    public SnowNight getSnowNight() {
        return snowNight;
    }

    /**
     * 
     * @param snowNight
     *     The snow_night
     */
    @JsonProperty("snow_night")
    public void setSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
    }

    /**
     * 
     * @return
     *     The maxwind
     */
    @JsonProperty("maxwind")
    public Maxwind getMaxwind() {
        return maxwind;
    }

    /**
     * 
     * @param maxwind
     *     The maxwind
     */
    @JsonProperty("maxwind")
    public void setMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
    }

    /**
     * 
     * @return
     *     The avewind
     */
    @JsonProperty("avewind")
    public Avewind getAvewind() {
        return avewind;
    }

    /**
     * 
     * @param avewind
     *     The avewind
     */
    @JsonProperty("avewind")
    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    /**
     * 
     * @return
     *     The avehumidity
     */
    @JsonProperty("avehumidity")
    public Integer getAvehumidity() {
        return avehumidity;
    }

    /**
     * 
     * @param avehumidity
     *     The avehumidity
     */
    @JsonProperty("avehumidity")
    public void setAvehumidity(Integer avehumidity) {
        this.avehumidity = avehumidity;
    }

    /**
     * 
     * @return
     *     The maxhumidity
     */
    @JsonProperty("maxhumidity")
    public Integer getMaxhumidity() {
        return maxhumidity;
    }

    /**
     * 
     * @param maxhumidity
     *     The maxhumidity
     */
    @JsonProperty("maxhumidity")
    public void setMaxhumidity(Integer maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    /**
     * 
     * @return
     *     The minhumidity
     */
    @JsonProperty("minhumidity")
    public Integer getMinhumidity() {
        return minhumidity;
    }

    /**
     * 
     * @param minhumidity
     *     The minhumidity
     */
    @JsonProperty("minhumidity")
    public void setMinhumidity(Integer minhumidity) {
        this.minhumidity = minhumidity;
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
