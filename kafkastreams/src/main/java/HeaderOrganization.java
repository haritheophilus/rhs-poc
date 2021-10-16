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
    "value"
})
@Generated("jsonschema2pojo")
public class HeaderOrganization {

    /**
     * Type of organization
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of organization")
    private HeaderOrganization.Type type;
    /**
     * Value that identifies the organization
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value that identifies the organization")
    private String value;

    /**
     * Type of organization
     * (Required)
     * 
     */
    @JsonProperty("type")
    public HeaderOrganization.Type getType() {
        return type;
    }

    /**
     * Type of organization
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(HeaderOrganization.Type type) {
        this.type = type;
    }

    public HeaderOrganization withType(HeaderOrganization.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Value that identifies the organization
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value that identifies the organization
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public HeaderOrganization withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeaderOrganization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Type of organization
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ABA("ABA"),
        DUNS("DUNS"),
        FISERV("Fiserv");
        private final String value;
        private final static Map<String, HeaderOrganization.Type> CONSTANTS = new HashMap<String, HeaderOrganization.Type>();

        static {
            for (HeaderOrganization.Type c: values()) {
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
        public static HeaderOrganization.Type fromValue(String value) {
            HeaderOrganization.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
