import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Accounts associated to the card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "detailType",
    "sequenceNumber",
    "transactionRestrictions",
    "isActive",
    "nickname"
})
@Generated("jsonschema2pojo")
public class Accounts {

    /**
     * Actual account number as defined by the bank or credit union
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Actual account number as defined by the bank or credit union")
    private String number;
    /**
     * Detailed account type
     * (Required)
     * 
     */
    @JsonProperty("detailType")
    @JsonPropertyDescription("Detailed account type")
    private Accounts.DetailType detailType;
    /**
     * Defines the order of the accounts by Account Type, eg. 1 = Primary Savings, 2 = Secondary Savings
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("Defines the order of the accounts by Account Type, eg. 1 = Primary Savings, 2 = Secondary Savings")
    private Integer sequenceNumber;
    /**
     * Monetary transaction restrictions
     * 
     */
    @JsonProperty("transactionRestrictions")
    @JsonPropertyDescription("Monetary transaction restrictions")
    private List<TransactionRestrictions> transactionRestrictions = new ArrayList<TransactionRestrictions>();
    /**
     * Indicates whether the account is active (true) or not (false)
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    @JsonPropertyDescription("Indicates whether the account is active (true) or not (false)")
    private Boolean isActive;
    /**
     * User defined name of account
     * 
     */
    @JsonProperty("nickname")
    @JsonPropertyDescription("User defined name of account")
    private String nickname;

    /**
     * Actual account number as defined by the bank or credit union
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Actual account number as defined by the bank or credit union
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Accounts withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Detailed account type
     * (Required)
     * 
     */
    @JsonProperty("detailType")
    public Accounts.DetailType getDetailType() {
        return detailType;
    }

    /**
     * Detailed account type
     * (Required)
     * 
     */
    @JsonProperty("detailType")
    public void setDetailType(Accounts.DetailType detailType) {
        this.detailType = detailType;
    }

    public Accounts withDetailType(Accounts.DetailType detailType) {
        this.detailType = detailType;
        return this;
    }

    /**
     * Defines the order of the accounts by Account Type, eg. 1 = Primary Savings, 2 = Secondary Savings
     * 
     */
    @JsonProperty("sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Defines the order of the accounts by Account Type, eg. 1 = Primary Savings, 2 = Secondary Savings
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Accounts withSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Monetary transaction restrictions
     * 
     */
    @JsonProperty("transactionRestrictions")
    public List<TransactionRestrictions> getTransactionRestrictions() {
        return transactionRestrictions;
    }

    /**
     * Monetary transaction restrictions
     * 
     */
    @JsonProperty("transactionRestrictions")
    public void setTransactionRestrictions(List<TransactionRestrictions> transactionRestrictions) {
        this.transactionRestrictions = transactionRestrictions;
    }

    public Accounts withTransactionRestrictions(List<TransactionRestrictions> transactionRestrictions) {
        this.transactionRestrictions = transactionRestrictions;
        return this;
    }

    /**
     * Indicates whether the account is active (true) or not (false)
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Indicates whether the account is active (true) or not (false)
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Accounts withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * User defined name of account
     * 
     */
    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    /**
     * User defined name of account
     * 
     */
    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Accounts withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Accounts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("detailType");
        sb.append('=');
        sb.append(((this.detailType == null)?"<null>":this.detailType));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("transactionRestrictions");
        sb.append('=');
        sb.append(((this.transactionRestrictions == null)?"<null>":this.transactionRestrictions));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("nickname");
        sb.append('=');
        sb.append(((this.nickname == null)?"<null>":this.nickname));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Detailed account type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DetailType {

        BROKERAGE("Brokerage"),
        CERTIFICATE_OF_DEPOSIT("CertificateOfDeposit"),
        CHECKING("Checking"),
        CLUB("Club"),
        COMMERCIAL("Commercial"),
        CONSTRUCTION("Construction"),
        CONSUMER("Consumer"),
        CREDIT_CARD("CreditCard"),
        DEMAND_DEPOSIT_LOAN("DemandDepositLoan"),
        ESCROW("Escrow"),
        FLEXIBLE_SPENDING("FlexibleSpending"),
        FLOOR_PLAN("FloorPlan"),
        HEALTH_SAVINGS("HealthSavings"),
        HOME_EQUITY("HomeEquity"),
        HOME_EQUITY_LINE_OF_CREDIT("HomeEquityLineOfCredit"),
        INSTALLMENT("Installment"),
        LEASE("Lease"),
        LOAN("Loan"),
        LINE_OF_CREDIT("LineOfCredit"),
        MONEY_MARKET("MoneyMarket"),
        MORTGAGE("Mortgage"),
        PASSBOOK("Passbook"),
        PERSONAL("Personal"),
        PORTFOLIO_RELATIONSHIP("PortfolioRelationship"),
        RETIREMENT("Retirement"),
        SAVINGS("Savings"),
        SHARE_DRAFT("ShareDraft"),
        STUDENT("Student");
        private final String value;
        private final static Map<String, Accounts.DetailType> CONSTANTS = new HashMap<String, Accounts.DetailType>();

        static {
            for (Accounts.DetailType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DetailType(String value) {
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
        public static Accounts.DetailType fromValue(String value) {
            Accounts.DetailType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
