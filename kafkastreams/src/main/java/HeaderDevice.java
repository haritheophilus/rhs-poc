import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OS",
    "OSVersion",
    "location",
    "IPAddress",
    "uniqueIdentifier",
    "serialNumber"
})
@Generated("jsonschema2pojo")
public class HeaderDevice {

    /**
     * Operating system of the initiating device
     * 
     */
    @JsonProperty("OS")
    @JsonPropertyDescription("Operating system of the initiating device")
    private String os;
    /**
     * Operating system version of the initiating device
     * 
     */
    @JsonProperty("OSVersion")
    @JsonPropertyDescription("Operating system version of the initiating device")
    private String oSVersion;
    /**
     * Location of the initiating device
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Location of the initiating device")
    private HeaderDeviceLocation location;
    /**
     * A unique string of characters that identifies the initiating device using the Internet Protocol to communicate over a network
     * 
     */
    @JsonProperty("IPAddress")
    @JsonPropertyDescription("A unique string of characters that identifies the initiating device using the Internet Protocol to communicate over a network")
    private String iPAddress;
    /**
     * Unique identifier of the initiating device
     * 
     */
    @JsonProperty("uniqueIdentifier")
    @JsonPropertyDescription("Unique identifier of the initiating device")
    private String uniqueIdentifier;
    /**
     * Serial number of the initiating device
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("Serial number of the initiating device")
    private String serialNumber;

    /**
     * Operating system of the initiating device
     * 
     */
    @JsonProperty("OS")
    public String getOs() {
        return os;
    }

    /**
     * Operating system of the initiating device
     * 
     */
    @JsonProperty("OS")
    public void setOs(String os) {
        this.os = os;
    }

    public HeaderDevice withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * Operating system version of the initiating device
     * 
     */
    @JsonProperty("OSVersion")
    public String getOSVersion() {
        return oSVersion;
    }

    /**
     * Operating system version of the initiating device
     * 
     */
    @JsonProperty("OSVersion")
    public void setOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
    }

    public HeaderDevice withOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
        return this;
    }

    /**
     * Location of the initiating device
     * 
     */
    @JsonProperty("location")
    public HeaderDeviceLocation getLocation() {
        return location;
    }

    /**
     * Location of the initiating device
     * 
     */
    @JsonProperty("location")
    public void setLocation(HeaderDeviceLocation location) {
        this.location = location;
    }

    public HeaderDevice withLocation(HeaderDeviceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * A unique string of characters that identifies the initiating device using the Internet Protocol to communicate over a network
     * 
     */
    @JsonProperty("IPAddress")
    public String getIPAddress() {
        return iPAddress;
    }

    /**
     * A unique string of characters that identifies the initiating device using the Internet Protocol to communicate over a network
     * 
     */
    @JsonProperty("IPAddress")
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    public HeaderDevice withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * Unique identifier of the initiating device
     * 
     */
    @JsonProperty("uniqueIdentifier")
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Unique identifier of the initiating device
     * 
     */
    @JsonProperty("uniqueIdentifier")
    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public HeaderDevice withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

    /**
     * Serial number of the initiating device
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Serial number of the initiating device
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public HeaderDevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeaderDevice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("os");
        sb.append('=');
        sb.append(((this.os == null)?"<null>":this.os));
        sb.append(',');
        sb.append("oSVersion");
        sb.append('=');
        sb.append(((this.oSVersion == null)?"<null>":this.oSVersion));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("iPAddress");
        sb.append('=');
        sb.append(((this.iPAddress == null)?"<null>":this.iPAddress));
        sb.append(',');
        sb.append("uniqueIdentifier");
        sb.append('=');
        sb.append(((this.uniqueIdentifier == null)?"<null>":this.uniqueIdentifier));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
