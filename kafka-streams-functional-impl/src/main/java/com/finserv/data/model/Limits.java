package com.finserv.data.model;
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
 * Limits on the associated card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "source",
    "action",
    "amount",
    "count",
    "isOnline",
    "fromDate",
    "toDate"
})
@Generated("jsonschema2pojo")
public class Limits {

    /**
     * Type of limit
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of limit")
    private Limits.Type type;
    /**
     * Type of limit;
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Type of limit;")
    private Limits.Source source;
    /**
     * Action associated with limit
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Action associated with limit")
    private Limits.Action action;
    /**
     * Limit amount
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Limit amount")
    private Double amount;
    /**
     * Maximum number allowed
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Maximum number allowed")
    private Integer count;
    /**
     * Whether the limit applies to online types (true) or offline types (false)
     * 
     */
    @JsonProperty("isOnline")
    @JsonPropertyDescription("Whether the limit applies to online types (true) or offline types (false)")
    private Boolean isOnline;
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
     * Type of limit
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Limits.Type getType() {
        return type;
    }

    /**
     * Type of limit
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Limits.Type type) {
        this.type = type;
    }

    public Limits withType(Limits.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Type of limit;
     * 
     */
    @JsonProperty("source")
    public Limits.Source getSource() {
        return source;
    }

    /**
     * Type of limit;
     * 
     */
    @JsonProperty("source")
    public void setSource(Limits.Source source) {
        this.source = source;
    }

    public Limits withSource(Limits.Source source) {
        this.source = source;
        return this;
    }

    /**
     * Action associated with limit
     * 
     */
    @JsonProperty("action")
    public Limits.Action getAction() {
        return action;
    }

    /**
     * Action associated with limit
     * 
     */
    @JsonProperty("action")
    public void setAction(Limits.Action action) {
        this.action = action;
    }

    public Limits withAction(Limits.Action action) {
        this.action = action;
        return this;
    }

    /**
     * Limit amount
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Limit amount
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Limits withAmount(Double amount) {
        this.amount = amount;
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

    public Limits withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Whether the limit applies to online types (true) or offline types (false)
     * 
     */
    @JsonProperty("isOnline")
    public Boolean getIsOnline() {
        return isOnline;
    }

    /**
     * Whether the limit applies to online types (true) or offline types (false)
     * 
     */
    @JsonProperty("isOnline")
    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Limits withIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
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

    public Limits withFromDate(String fromDate) {
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

    public Limits withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("isOnline");
        sb.append('=');
        sb.append(((this.isOnline == null)?"<null>":this.isOnline));
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
     * Action associated with limit
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Action {

        ADVANCE("Advance"),
        CREDIT("Credit"),
        DEBIT("Debit"),
        DEPOSIT("Deposit"),
        INQUIRY("Inquiry"),
        PURCHASE("Purchase"),
        TRANSFER("Transfer"),
        WITHDRAWAL("Withdrawal");
        private final String value;
        private final static Map<String, Limits.Action> CONSTANTS = new HashMap<String, Limits.Action>();

        static {
            for (Limits.Action c: values()) {
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
        public static Limits.Action fromValue(String value) {
            Limits.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of limit;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Source {

        ATM("ATM"),
        COMBINED("Combined"),
        POS("POS"),
        POS_PIN("POSPin"),
        POS_SIGNATURE("POSSignature");
        private final String value;
        private final static Map<String, Limits.Source> CONSTANTS = new HashMap<String, Limits.Source>();

        static {
            for (Limits.Source c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Source(String value) {
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
        public static Limits.Source fromValue(String value) {
            Limits.Source constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of limit
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        CYCLE("Cycle"),
        DAILY("Daily"),
        THREE_DAY("ThreeDay"),
        TRANSACTION("Transaction");
        private final String value;
        private final static Map<String, Limits.Type> CONSTANTS = new HashMap<String, Limits.Type>();

        static {
            for (Limits.Type c: values()) {
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
        public static Limits.Type fromValue(String value) {
            Limits.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
