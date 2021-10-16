import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Travel Alerts on the associated card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countryCode",
    "stateProvince",
    "fromDate",
    "toDate"
})
@Generated("jsonschema2pojo")
public class TravelAlerts {

    /**
     * Country code: ISO 3166-1 Alpha 2 format, eg. US
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Country code: ISO 3166-1 Alpha 2 format, eg. US")
    private String countryCode;
    /**
     * State/province associated with address: ISO 3166-2 standard format, but only include values after the dash
     * 
     */
    @JsonProperty("stateProvince")
    @JsonPropertyDescription("State/province associated with address: ISO 3166-2 standard format, but only include values after the dash")
    private String stateProvince;
    /**
     * From date
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("From date")
    private String fromDate;
    /**
     * To date
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("To date")
    private String toDate;

    /**
     * Country code: ISO 3166-1 Alpha 2 format, eg. US
     * 
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country code: ISO 3166-1 Alpha 2 format, eg. US
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public TravelAlerts withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * State/province associated with address: ISO 3166-2 standard format, but only include values after the dash
     * 
     */
    @JsonProperty("stateProvince")
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * State/province associated with address: ISO 3166-2 standard format, but only include values after the dash
     * 
     */
    @JsonProperty("stateProvince")
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public TravelAlerts withStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    /**
     * From date
     * 
     */
    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    /**
     * From date
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public TravelAlerts withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * To date
     * 
     */
    @JsonProperty("toDate")
    public String getToDate() {
        return toDate;
    }

    /**
     * To date
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public TravelAlerts withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TravelAlerts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("stateProvince");
        sb.append('=');
        sb.append(((this.stateProvince == null)?"<null>":this.stateProvince));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
