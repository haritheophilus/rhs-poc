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
    "countryCode",
    "number",
    "extension",
    "isPreferred",
    "contactAllowed"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Type of phone number;
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of phone number;")
    private Phone.Type type;
    /**
     * Phone country code. Numeric values only.
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Phone country code. Numeric values only.")
    private String countryCode;
    /**
     * Phone number. Numeric values only.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Phone number. Numeric values only.")
    private String number;
    /**
     * Phone extension. Numeric values only.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Phone extension. Numeric values only.")
    private String extension;
    /**
     * Is this phone number the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    @JsonPropertyDescription("Is this phone number the preferred form of contact")
    private Boolean isPreferred;
    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    @JsonPropertyDescription("Whether or not contact is allowed for the associated form of communication")
    private Phone.ContactAllowed contactAllowed;

    /**
     * Type of phone number;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Phone.Type getType() {
        return type;
    }

    /**
     * Type of phone number;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Phone.Type type) {
        this.type = type;
    }

    public Phone withType(Phone.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Phone country code. Numeric values only.
     * 
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Phone country code. Numeric values only.
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Phone withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Phone number. Numeric values only.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Phone number. Numeric values only.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Phone withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Phone extension. Numeric values only.
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Phone extension. Numeric values only.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Phone withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Is this phone number the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    /**
     * Is this phone number the preferred form of contact
     * 
     */
    @JsonProperty("isPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    public Phone withIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
        return this;
    }

    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    public Phone.ContactAllowed getContactAllowed() {
        return contactAllowed;
    }

    /**
     * Whether or not contact is allowed for the associated form of communication
     * (Required)
     * 
     */
    @JsonProperty("contactAllowed")
    public void setContactAllowed(Phone.ContactAllowed contactAllowed) {
        this.contactAllowed = contactAllowed;
    }

    public Phone withContactAllowed(Phone.ContactAllowed contactAllowed) {
        this.contactAllowed = contactAllowed;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
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
        private final static Map<String, Phone.ContactAllowed> CONSTANTS = new HashMap<String, Phone.ContactAllowed>();

        static {
            for (Phone.ContactAllowed c: values()) {
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
        public static Phone.ContactAllowed fromValue(String value) {
            Phone.ContactAllowed constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of phone number;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        HOME("Home"),
        WORK("Work"),
        MOBILE("Mobile"),
        FAX("Fax"),
        PAGER("Pager"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Phone.Type> CONSTANTS = new HashMap<String, Phone.Type>();

        static {
            for (Phone.Type c: values()) {
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
        public static Phone.Type fromValue(String value) {
            Phone.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
