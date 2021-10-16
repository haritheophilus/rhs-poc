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
 * Fees on the associated card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "description",
    "amount",
    "isWaived",
    "nextAssessmentDate",
    "lastWaivedDate"
})
@Generated("jsonschema2pojo")
public class Fees {

    /**
     * Type of fee
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of fee")
    private Fees.Type type;
    /**
     * Fee description
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Fee description")
    private String description;
    /**
     * Fee amount
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Fee amount")
    private Double amount;
    /**
     * Whether the fee is waived (true) or not (false)
     * 
     */
    @JsonProperty("isWaived")
    @JsonPropertyDescription("Whether the fee is waived (true) or not (false)")
    private Boolean isWaived;
    /**
     * The date the fee will be charged
     * 
     */
    @JsonProperty("nextAssessmentDate")
    @JsonPropertyDescription("The date the fee will be charged")
    private String nextAssessmentDate;
    /**
     * Date of the last waived fee
     * 
     */
    @JsonProperty("lastWaivedDate")
    @JsonPropertyDescription("Date of the last waived fee")
    private String lastWaivedDate;

    /**
     * Type of fee
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Fees.Type getType() {
        return type;
    }

    /**
     * Type of fee
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Fees.Type type) {
        this.type = type;
    }

    public Fees withType(Fees.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Fee description
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Fee description
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Fees withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Fee amount
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Fee amount
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Fees withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Whether the fee is waived (true) or not (false)
     * 
     */
    @JsonProperty("isWaived")
    public Boolean getIsWaived() {
        return isWaived;
    }

    /**
     * Whether the fee is waived (true) or not (false)
     * 
     */
    @JsonProperty("isWaived")
    public void setIsWaived(Boolean isWaived) {
        this.isWaived = isWaived;
    }

    public Fees withIsWaived(Boolean isWaived) {
        this.isWaived = isWaived;
        return this;
    }

    /**
     * The date the fee will be charged
     * 
     */
    @JsonProperty("nextAssessmentDate")
    public String getNextAssessmentDate() {
        return nextAssessmentDate;
    }

    /**
     * The date the fee will be charged
     * 
     */
    @JsonProperty("nextAssessmentDate")
    public void setNextAssessmentDate(String nextAssessmentDate) {
        this.nextAssessmentDate = nextAssessmentDate;
    }

    public Fees withNextAssessmentDate(String nextAssessmentDate) {
        this.nextAssessmentDate = nextAssessmentDate;
        return this;
    }

    /**
     * Date of the last waived fee
     * 
     */
    @JsonProperty("lastWaivedDate")
    public String getLastWaivedDate() {
        return lastWaivedDate;
    }

    /**
     * Date of the last waived fee
     * 
     */
    @JsonProperty("lastWaivedDate")
    public void setLastWaivedDate(String lastWaivedDate) {
        this.lastWaivedDate = lastWaivedDate;
    }

    public Fees withLastWaivedDate(String lastWaivedDate) {
        this.lastWaivedDate = lastWaivedDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fees.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("isWaived");
        sb.append('=');
        sb.append(((this.isWaived == null)?"<null>":this.isWaived));
        sb.append(',');
        sb.append("nextAssessmentDate");
        sb.append('=');
        sb.append(((this.nextAssessmentDate == null)?"<null>":this.nextAssessmentDate));
        sb.append(',');
        sb.append("lastWaivedDate");
        sb.append('=');
        sb.append(((this.lastWaivedDate == null)?"<null>":this.lastWaivedDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Type of fee
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ANNUAL("Annual"),
        CARD("Card"),
        SEMI_ANNUAL("SemiAnnual"),
        TRANSACTION("Transaction"),
        QUARTERLY("Quarterly"),
        MONTHLY("Monthly");
        private final String value;
        private final static Map<String, Fees.Type> CONSTANTS = new HashMap<String, Fees.Type>();

        static {
            for (Fees.Type c: values()) {
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
        public static Fees.Type fromValue(String value) {
            Fees.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
