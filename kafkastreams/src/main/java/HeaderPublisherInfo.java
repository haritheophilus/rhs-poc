import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Object that contains publisher information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "channel",
    "device"
})
@Generated("jsonschema2pojo")
public class HeaderPublisherInfo {

    /**
     * Instance identifier for the particular publisher.  Used for alerting to determine which particular instance raised the event
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Instance identifier for the particular publisher.  Used for alerting to determine which particular instance raised the event")
    private String id;
    /**
     * Name of the publisher, such as the Fiserv provider name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the publisher, such as the Fiserv provider name")
    private String name;
    /**
     * Identifies the channel that originated the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("Identifies the channel that originated the event")
    private HeaderPublisherInfo.Channel channel;
    @JsonProperty("device")
    private HeaderDevice device;

    /**
     * Instance identifier for the particular publisher.  Used for alerting to determine which particular instance raised the event
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Instance identifier for the particular publisher.  Used for alerting to determine which particular instance raised the event
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HeaderPublisherInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the publisher, such as the Fiserv provider name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the publisher, such as the Fiserv provider name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public HeaderPublisherInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Identifies the channel that originated the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public HeaderPublisherInfo.Channel getChannel() {
        return channel;
    }

    /**
     * Identifies the channel that originated the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(HeaderPublisherInfo.Channel channel) {
        this.channel = channel;
    }

    public HeaderPublisherInfo withChannel(HeaderPublisherInfo.Channel channel) {
        this.channel = channel;
        return this;
    }

    @JsonProperty("device")
    public HeaderDevice getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(HeaderDevice device) {
        this.device = device;
    }

    public HeaderPublisherInfo withDevice(HeaderDevice device) {
        this.device = device;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeaderPublisherInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Identifies the channel that originated the event
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Channel {

        ACH("ACH"),
        BACK_OFFICE("BackOffice"),
        BATCH("Batch"),
        BUSINESS_ONLINE("BusinessOnline"),
        DEPOSIT_LINE("DepositLine"),
        EFT("EFT"),
        FOS("FOS"),
        INTERNET("Internet"),
        MOBILE("Mobile"),
        NOW("NOW"),
        OTHER("Other"),
        PHONE("Phone"),
        POSITIVE_PAY("PositivePay"),
        RETAIL_ONLINE("RetailOnline"),
        SYSTEM("System"),
        TELLER("Teller"),
        WIRE("Wire");
        private final String value;
        private final static Map<String, HeaderPublisherInfo.Channel> CONSTANTS = new HashMap<String, HeaderPublisherInfo.Channel>();

        static {
            for (HeaderPublisherInfo.Channel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Channel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static HeaderPublisherInfo.Channel fromValue(String value) {
            HeaderPublisherInfo.Channel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
