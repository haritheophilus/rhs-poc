import java.util.Date;
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
 * List of usages associated to the card. Either frequency, type or action are required and either count or amount.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frequency",
    "type",
    "action",
    "count",
    "amount",
    "lastDateTime"
})
@Generated("jsonschema2pojo")
public class Usage {

    /**
     * Usage frequency
     * 
     */
    @JsonProperty("frequency")
    @JsonPropertyDescription("Usage frequency")
    private Usage.Frequency frequency;
    /**
     * Type of Usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of Usage")
    private Usage.Type type;
    /**
     * Type of Usage action
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Type of Usage action")
    private Usage.Action action;
    /**
     * Maximum number allowed
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Maximum number allowed")
    private Integer count;
    /**
     * Usage amount
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Usage amount")
    private Double amount;
    @JsonProperty("lastDateTime")
    private Date lastDateTime;

    /**
     * Usage frequency
     * 
     */
    @JsonProperty("frequency")
    public Usage.Frequency getFrequency() {
        return frequency;
    }

    /**
     * Usage frequency
     * 
     */
    @JsonProperty("frequency")
    public void setFrequency(Usage.Frequency frequency) {
        this.frequency = frequency;
    }

    public Usage withFrequency(Usage.Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Type of Usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Usage.Type getType() {
        return type;
    }

    /**
     * Type of Usage
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Usage.Type type) {
        this.type = type;
    }

    public Usage withType(Usage.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Type of Usage action
     * 
     */
    @JsonProperty("action")
    public Usage.Action getAction() {
        return action;
    }

    /**
     * Type of Usage action
     * 
     */
    @JsonProperty("action")
    public void setAction(Usage.Action action) {
        this.action = action;
    }

    public Usage withAction(Usage.Action action) {
        this.action = action;
        return this;
    }

    /**
     * Maximum number allowed
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Maximum number allowed
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Usage withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Usage amount
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Usage amount
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Usage withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("lastDateTime")
    public Date getLastDateTime() {
        return lastDateTime;
    }

    @JsonProperty("lastDateTime")
    public void setLastDateTime(Date lastDateTime) {
        this.lastDateTime = lastDateTime;
    }

    public Usage withLastDateTime(Date lastDateTime) {
        this.lastDateTime = lastDateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Usage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("lastDateTime");
        sb.append('=');
        sb.append(((this.lastDateTime == null)?"<null>":this.lastDateTime));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Type of Usage action
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Action {

        ADVANCE("Advance"),
        AUTHORIZED("Authorized"),
        CREDITS("Credits"),
        DEBITS("Debits"),
        DEPOSIT("Deposit"),
        FEE("Fee"),
        INQUIRY("Inquiry"),
        PAYMENT("Payment"),
        PURCHASE("Purchase"),
        TRANSFER("Transfer"),
        WAIVED("Waived"),
        WITHDRAWAL("Withdrawal");
        private final String value;
        private final static Map<String, Usage.Action> CONSTANTS = new HashMap<String, Usage.Action>();

        static {
            for (Usage.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Action(String value) {
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
        public static Usage.Action fromValue(String value) {
            Usage.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Usage frequency
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Frequency {

        DAILY("Daily"),
        LAST("Last"),
        MTD("MTD"),
        PRIOR_MONTH("PriorMonth"),
        PRIOR_YEAR("PriorYear"),
        TOTAL("Total"),
        YTD("YTD");
        private final String value;
        private final static Map<String, Usage.Frequency> CONSTANTS = new HashMap<String, Usage.Frequency>();

        static {
            for (Usage.Frequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Frequency(String value) {
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
        public static Usage.Frequency fromValue(String value) {
            Usage.Frequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of Usage
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ACCESS("Access"),
        ATM("ATM"),
        CARDS_IN_USE("CardsInUse"),
        CARD_USED("CardUsed"),
        FOREIGN("Foreign"),
        FOREIGN_FEES("ForeignFees"),
        OFFLINE("Offline"),
        ON_US("OnUs"),
        PIN("Pin"),
        POS("POS"),
        SIGNATURE("Signature"),
        SIGNATURE_POS("SignaturePOS"),
        USAGE("Usage");
        private final String value;
        private final static Map<String, Usage.Type> CONSTANTS = new HashMap<String, Usage.Type>();

        static {
            for (Usage.Type c: values()) {
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
        public static Usage.Type fromValue(String value) {
            Usage.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
