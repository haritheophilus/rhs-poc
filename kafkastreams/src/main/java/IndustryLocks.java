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
 * Merchant/Industry locks on the associated card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "code",
    "subCode",
    "fromDate",
    "toDate"
})
@Generated("jsonschema2pojo")
public class IndustryLocks {

    /**
     * Type of industry lock;
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of industry lock;")
    private IndustryLocks.Type type;
    /**
     * Lock code
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lock code")
    private String code;
    /**
     * Sub code
     * 
     */
    @JsonProperty("subCode")
    @JsonPropertyDescription("Sub code")
    private String subCode;
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
     * Type of industry lock;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public IndustryLocks.Type getType() {
        return type;
    }

    /**
     * Type of industry lock;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(IndustryLocks.Type type) {
        this.type = type;
    }

    public IndustryLocks withType(IndustryLocks.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Lock code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Lock code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public IndustryLocks withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Sub code
     * 
     */
    @JsonProperty("subCode")
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sub code
     * 
     */
    @JsonProperty("subCode")
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public IndustryLocks withSubCode(String subCode) {
        this.subCode = subCode;
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

    public IndustryLocks withFromDate(String fromDate) {
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

    public IndustryLocks withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndustryLocks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("subCode");
        sb.append('=');
        sb.append(((this.subCode == null)?"<null>":this.subCode));
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


    /**
     * Type of industry lock;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        NAICS("NAICS"),
        SIC("SIC");
        private final String value;
        private final static Map<String, IndustryLocks.Type> CONSTANTS = new HashMap<String, IndustryLocks.Type>();

        static {
            for (IndustryLocks.Type c: values()) {
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
        public static IndustryLocks.Type fromValue(String value) {
            IndustryLocks.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
