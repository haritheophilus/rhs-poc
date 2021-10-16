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
 * Object describing the previous card, eg. Re-issue scenario
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "sequenceNumber",
    "type",
    "detailStatus",
    "expiration",
    "issuedDate",
    "isAUSEnabled"
})
@Generated("jsonschema2pojo")
public class PreviousCard {

    /**
     * Full card number as it appears on the card
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Full card number as it appears on the card")
    private String number;
    /**
     * A one-digit suffix that identifies multiple cards for different parties
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("A one-digit suffix that identifies multiple cards for different parties")
    private String sequenceNumber;
    /**
     * Type of card being described
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of card being described")
    private PreviousCard.Type type;
    /**
     * Indicates the detailed status of the card;
     * 
     */
    @JsonProperty("detailStatus")
    @JsonPropertyDescription("Indicates the detailed status of the card;")
    private PreviousCard.DetailStatus detailStatus;
    /**
     * Month and Year the card expires
     * (Required)
     * 
     */
    @JsonProperty("expiration")
    @JsonPropertyDescription("Month and Year the card expires")
    private String expiration;
    /**
     * Date the physical card was issued
     * 
     */
    @JsonProperty("issuedDate")
    @JsonPropertyDescription("Date the physical card was issued")
    private String issuedDate;
    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false)
     * 
     */
    @JsonProperty("isAUSEnabled")
    @JsonPropertyDescription("Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false)")
    private Boolean isAUSEnabled;

    /**
     * Full card number as it appears on the card
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Full card number as it appears on the card
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public PreviousCard withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * A one-digit suffix that identifies multiple cards for different parties
     * 
     */
    @JsonProperty("sequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * A one-digit suffix that identifies multiple cards for different parties
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public PreviousCard withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Type of card being described
     * 
     */
    @JsonProperty("type")
    public PreviousCard.Type getType() {
        return type;
    }

    /**
     * Type of card being described
     * 
     */
    @JsonProperty("type")
    public void setType(PreviousCard.Type type) {
        this.type = type;
    }

    public PreviousCard withType(PreviousCard.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates the detailed status of the card;
     * 
     */
    @JsonProperty("detailStatus")
    public PreviousCard.DetailStatus getDetailStatus() {
        return detailStatus;
    }

    /**
     * Indicates the detailed status of the card;
     * 
     */
    @JsonProperty("detailStatus")
    public void setDetailStatus(PreviousCard.DetailStatus detailStatus) {
        this.detailStatus = detailStatus;
    }

    public PreviousCard withDetailStatus(PreviousCard.DetailStatus detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }

    /**
     * Month and Year the card expires
     * (Required)
     * 
     */
    @JsonProperty("expiration")
    public String getExpiration() {
        return expiration;
    }

    /**
     * Month and Year the card expires
     * (Required)
     * 
     */
    @JsonProperty("expiration")
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public PreviousCard withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Date the physical card was issued
     * 
     */
    @JsonProperty("issuedDate")
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Date the physical card was issued
     * 
     */
    @JsonProperty("issuedDate")
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public PreviousCard withIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false)
     * 
     */
    @JsonProperty("isAUSEnabled")
    public Boolean getIsAUSEnabled() {
        return isAUSEnabled;
    }

    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false)
     * 
     */
    @JsonProperty("isAUSEnabled")
    public void setIsAUSEnabled(Boolean isAUSEnabled) {
        this.isAUSEnabled = isAUSEnabled;
    }

    public PreviousCard withIsAUSEnabled(Boolean isAUSEnabled) {
        this.isAUSEnabled = isAUSEnabled;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PreviousCard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("detailStatus");
        sb.append('=');
        sb.append(((this.detailStatus == null)?"<null>":this.detailStatus));
        sb.append(',');
        sb.append("expiration");
        sb.append('=');
        sb.append(((this.expiration == null)?"<null>":this.expiration));
        sb.append(',');
        sb.append("issuedDate");
        sb.append('=');
        sb.append(((this.issuedDate == null)?"<null>":this.issuedDate));
        sb.append(',');
        sb.append("isAUSEnabled");
        sb.append('=');
        sb.append(((this.isAUSEnabled == null)?"<null>":this.isAUSEnabled));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Indicates the detailed status of the card;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DetailStatus {

        ACTIVE("Active"),
        CLOSED("Closed"),
        DAMAGED("Damaged"),
        EXPIRED("Expired"),
        HOT_CARD("HotCard"),
        INACTIVE("Inactive"),
        INQUIRY_ONLY("InquiryOnly"),
        INSUFFICIENT_FUNDS("InsufficientFunds"),
        ISSUED("Issued"),
        LOCKED("Locked"),
        LOST("Lost"),
        MISUSED("Misused"),
        NEW("New"),
        PREACTIVATED("Preactivated"),
        RESTRICTED("Restricted"),
        REVOKED("Revoked"),
        STOLEN("Stolen");
        private final String value;
        private final static Map<String, PreviousCard.DetailStatus> CONSTANTS = new HashMap<String, PreviousCard.DetailStatus>();

        static {
            for (PreviousCard.DetailStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DetailStatus(String value) {
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
        public static PreviousCard.DetailStatus fromValue(String value) {
            PreviousCard.DetailStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of card being described
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ATM("ATM"),
        CREDIT("Credit"),
        DEBIT("Debit"),
        PREPAID("Prepaid"),
        REWARDS("Rewards"),
        VIRTUAL("Virtual");
        private final String value;
        private final static Map<String, PreviousCard.Type> CONSTANTS = new HashMap<String, PreviousCard.Type>();

        static {
            for (PreviousCard.Type c: values()) {
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
        public static PreviousCard.Type fromValue(String value) {
            PreviousCard.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
