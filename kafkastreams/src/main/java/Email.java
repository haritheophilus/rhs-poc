import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "address",
    "isPreferred",
    "contactAllowed"
})
@Generated("jsonschema2pojo")
public class Email {

    /**
     * Type of email address
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of email address")
    private Email.Type type;
    /**
     * Email address
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Email address")
    private String address;
    /**
     * Is this email the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    @JsonPropertyDescription("Is this email the preferred form of contact")
    private Boolean isPreferred;
    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    @JsonPropertyDescription("Whether or not contact is allowed for the associated form of communication")
    private Email.ContactAllowed contactAllowed;

    /**
     * Type of email address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Email.Type getType() {
        return type;
    }

    /**
     * Type of email address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Email.Type type) {
        this.type = type;
    }

    public Email withType(Email.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Email address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Email address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Email withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Is this email the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    /**
     * Is this email the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    public Email withIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
        return this;
    }

    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    public Email.ContactAllowed getContactAllowed() {
        return contactAllowed;
    }

    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    public void setContactAllowed(Email.ContactAllowed contactAllowed) {
        this.contactAllowed = contactAllowed;
    }

    public Email withContactAllowed(Email.ContactAllowed contactAllowed) {
        this.contactAllowed = contactAllowed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Email.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("isPreferred");
        sb.append('=');
        sb.append(((this.isPreferred == null)?"<null>":this.isPreferred));
        sb.append(',');
        sb.append("contactAllowed");
        sb.append('=');
        sb.append(((this.contactAllowed == null)?"<null>":this.contactAllowed));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Whether or not contact is allowed for the associated form of communication
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ContactAllowed {

        UNDEFINED("Undefined"),
        YES("Yes"),
        NO("No");
        private final String value;
        private final static Map<String, Email.ContactAllowed> CONSTANTS = new HashMap<String, Email.ContactAllowed>();

        static {
            for (Email.ContactAllowed c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ContactAllowed(String value) {
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
        public static Email.ContactAllowed fromValue(String value) {
            Email.ContactAllowed constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of email address
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        BUSINESS("Business"),
        PERSONAL("Personal"),
        WORK("Work");
        private final String value;
        private final static Map<String, Email.Type> CONSTANTS = new HashMap<String, Email.Type>();

        static {
            for (Email.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Email.Type fromValue(String value) {
            Email.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
