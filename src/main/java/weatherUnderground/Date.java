
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
    "epoch",
    "pretty",
    "day",
    "month",
    "year",
    "yday",
    "hour",
    "min",
    "sec",
    "isdst",
    "monthname",
    "monthname_short",
    "weekday_short",
    "weekday",
    "ampm",
    "tz_short",
    "tz_long"
})
public class Date {

    @JsonProperty("epoch")
    private String epoch;
    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("day")
    private Integer day;
    @JsonProperty("month")
    private Integer month;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("yday")
    private Integer yday;
    @JsonProperty("hour")
    private Integer hour;
    @JsonProperty("min")
    private String min;
    @JsonProperty("sec")
    private Integer sec;
    @JsonProperty("isdst")
    private String isdst;
    @JsonProperty("monthname")
    private String monthname;
    @JsonProperty("monthname_short")
    private String monthnameShort;
    @JsonProperty("weekday_short")
    private String weekdayShort;
    @JsonProperty("weekday")
    private String weekday;
    @JsonProperty("ampm")
    private String ampm;
    @JsonProperty("tz_short")
    private String tzShort;
    @JsonProperty("tz_long")
    private String tzLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The epoch
     */
    @JsonProperty("epoch")
    public String getEpoch() {
        return epoch;
    }

    /**
     * 
     * @param epoch
     *     The epoch
     */
    @JsonProperty("epoch")
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    /**
     * 
     * @return
     *     The pretty
     */
    @JsonProperty("pretty")
    public String getPretty() {
        return pretty;
    }

    /**
     * 
     * @param pretty
     *     The pretty
     */
    @JsonProperty("pretty")
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    /**
     * 
     * @return
     *     The day
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The month
     */
    @JsonProperty("month")
    public Integer getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    @JsonProperty("month")
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * 
     * @return
     *     The year
     */
    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The yday
     */
    @JsonProperty("yday")
    public Integer getYday() {
        return yday;
    }

    /**
     * 
     * @param yday
     *     The yday
     */
    @JsonProperty("yday")
    public void setYday(Integer yday) {
        this.yday = yday;
    }

    /**
     * 
     * @return
     *     The hour
     */
    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    /**
     * 
     * @param hour
     *     The hour
     */
    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The sec
     */
    @JsonProperty("sec")
    public Integer getSec() {
        return sec;
    }

    /**
     * 
     * @param sec
     *     The sec
     */
    @JsonProperty("sec")
    public void setSec(Integer sec) {
        this.sec = sec;
    }

    /**
     * 
     * @return
     *     The isdst
     */
    @JsonProperty("isdst")
    public String getIsdst() {
        return isdst;
    }

    /**
     * 
     * @param isdst
     *     The isdst
     */
    @JsonProperty("isdst")
    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    /**
     * 
     * @return
     *     The monthname
     */
    @JsonProperty("monthname")
    public String getMonthname() {
        return monthname;
    }

    /**
     * 
     * @param monthname
     *     The monthname
     */
    @JsonProperty("monthname")
    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    /**
     * 
     * @return
     *     The monthnameShort
     */
    @JsonProperty("monthname_short")
    public String getMonthnameShort() {
        return monthnameShort;
    }

    /**
     * 
     * @param monthnameShort
     *     The monthname_short
     */
    @JsonProperty("monthname_short")
    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    /**
     * 
     * @return
     *     The weekdayShort
     */
    @JsonProperty("weekday_short")
    public String getWeekdayShort() {
        return weekdayShort;
    }

    /**
     * 
     * @param weekdayShort
     *     The weekday_short
     */
    @JsonProperty("weekday_short")
    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    /**
     * 
     * @return
     *     The weekday
     */
    @JsonProperty("weekday")
    public String getWeekday() {
        return weekday;
    }

    /**
     * 
     * @param weekday
     *     The weekday
     */
    @JsonProperty("weekday")
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /**
     * 
     * @return
     *     The ampm
     */
    @JsonProperty("ampm")
    public String getAmpm() {
        return ampm;
    }

    /**
     * 
     * @param ampm
     *     The ampm
     */
    @JsonProperty("ampm")
    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    /**
     * 
     * @return
     *     The tzShort
     */
    @JsonProperty("tz_short")
    public String getTzShort() {
        return tzShort;
    }

    /**
     * 
     * @param tzShort
     *     The tz_short
     */
    @JsonProperty("tz_short")
    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    /**
     * 
     * @return
     *     The tzLong
     */
    @JsonProperty("tz_long")
    public String getTzLong() {
        return tzLong;
    }

    /**
     * 
     * @param tzLong
     *     The tz_long
     */
    @JsonProperty("tz_long")
    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
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
