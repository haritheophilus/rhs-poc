import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Delivery address of the order
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineOne",
    "lineTwo",
    "city",
    "stateProvince",
    "country",
    "postalCode"
})
@Generated("jsonschema2pojo")
public class DeliveryAddress {

    /**
     * First line of address
     * (Required)
     * 
     */
    @JsonProperty("lineOne")
    @JsonPropertyDescription("First line of address")
    private String lineOne;
    /**
     * Second line of address
     * 
     */
    @JsonProperty("lineTwo")
    @JsonPropertyDescription("Second line of address")
    private String lineTwo;
    /**
     * City associated with address
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City associated with address")
    private String city;
    /**
     * State/province associated with address
     * 
     */
    @JsonProperty("stateProvince")
    @JsonPropertyDescription("State/province associated with address")
    private String stateProvince;
    /**
     * Name of country associated with address
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Name of country associated with address")
    private String country;
    /**
     * Postal code associated with address
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("Postal code associated with address")
    private String postalCode;

    /**
     * First line of address
     * (Required)
     * 
     */
    @JsonProperty("lineOne")
    public String getLineOne() {
        return lineOne;
    }

    /**
     * First line of address
     * (Required)
     * 
     */
    @JsonProperty("lineOne")
    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public DeliveryAddress withLineOne(String lineOne) {
        this.lineOne = lineOne;
        return this;
    }

    /**
     * Second line of address
     * 
     */
    @JsonProperty("lineTwo")
    public String getLineTwo() {
        return lineTwo;
    }

    /**
     * Second line of address
     * 
     */
    @JsonProperty("lineTwo")
    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public DeliveryAddress withLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
        return this;
    }

    /**
     * City associated with address
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City associated with address
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public DeliveryAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State/province associated with address
     * 
     */
    @JsonProperty("stateProvince")
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * State/province associated with address
     * 
     */
    @JsonProperty("stateProvince")
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public DeliveryAddress withStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    /**
     * Name of country associated with address
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Name of country associated with address
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public DeliveryAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Postal code associated with address
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal code associated with address
     * (Required)
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public DeliveryAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeliveryAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineOne");
        sb.append('=');
        sb.append(((this.lineOne == null)?"<null>":this.lineOne));
        sb.append(',');
        sb.append("lineTwo");
        sb.append('=');
        sb.append(((this.lineTwo == null)?"<null>":this.lineTwo));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("stateProvince");
        sb.append('=');
        sb.append(((this.stateProvince == null)?"<null>":this.stateProvince));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
