import java.util.ArrayList;
import java.util.Date;
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
 * Object containing Card data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "sequenceNumber",
    "type",
    "status",
    "detailStatus",
    "nickname",
    "description",
    "expiration",
    "embossedNameOne",
    "embossedNameTwo",
    "issuedDate",
    "ISO",
    "limitStrategyCode",
    "openDate",
    "closedDate",
    "isPrimaryOwner",
    "productIdentification",
    "rewardsProgramNumber",
    "portfolioNumber",
    "lastUpdateDateTime",
    "lastActivityDateTime",
    "reissueDate",
    "priorExpiration",
    "statusChangeDateTime",
    "activatedDate",
    "activatedChannel",
    "pinOffset",
    "language",
    "issuedCount",
    "isReissued",
    "isPersonal",
    "isAUSEnabled",
    "isInstantIssue",
    "accounts",
    "address",
    "fees",
    "image",
    "industryLocks",
    "limits",
    "order",
    "party",
    "previousCard",
    "security",
    "travelAlerts",
    "usage"
})
@Generated("jsonschema2pojo")
public class Card {

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
    private Card.Type type;
    /**
     * Used to indicate the status of the card;
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Used to indicate the status of the card;")
    private Card.Status status;
    /**
     * Indicates the detailed status of the card;
     * (Required)
     * 
     */
    @JsonProperty("detailStatus")
    @JsonPropertyDescription("Indicates the detailed status of the card;")
    private Card.DetailStatus detailStatus;
    /**
     * User defined name of card
     * 
     */
    @JsonProperty("nickname")
    @JsonPropertyDescription("User defined name of card")
    private String nickname;
    /**
     * Description of the card
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description of the card")
    private String description;
    /**
     * Month and Year the card expires
     * (Required)
     * 
     */
    @JsonProperty("expiration")
    @JsonPropertyDescription("Month and Year the card expires")
    private String expiration;
    /**
     * First name as it appears on the physical card
     * (Required)
     * 
     */
    @JsonProperty("embossedNameOne")
    @JsonPropertyDescription("First name as it appears on the physical card")
    private String embossedNameOne;
    /**
     * Second name as it appears on physical card
     * 
     */
    @JsonProperty("embossedNameTwo")
    @JsonPropertyDescription("Second name as it appears on physical card")
    private String embossedNameTwo;
    /**
     * Date the card was issued
     * 
     */
    @JsonProperty("issuedDate")
    @JsonPropertyDescription("Date the card was issued")
    private String issuedDate;
    /**
     * ISO/BIN number associated with cards
     * (Required)
     * 
     */
    @JsonProperty("ISO")
    @JsonPropertyDescription("ISO/BIN number associated with cards")
    private String iso;
    /**
     * The code for the limit strategy, eg. VIP
     * 
     */
    @JsonProperty("limitStrategyCode")
    @JsonPropertyDescription("The code for the limit strategy, eg. VIP")
    private String limitStrategyCode;
    /**
     * Date on which the card record was opened
     * 
     */
    @JsonProperty("openDate")
    @JsonPropertyDescription("Date on which the card record was opened")
    private String openDate;
    /**
     * Date the card was closed
     * 
     */
    @JsonProperty("closedDate")
    @JsonPropertyDescription("Date the card was closed")
    private String closedDate;
    /**
     * Indicates if this is the primary owner (true) or not (false)
     * 
     */
    @JsonProperty("isPrimaryOwner")
    @JsonPropertyDescription("Indicates if this is the primary owner (true) or not (false)")
    private Boolean isPrimaryOwner;
    /**
     * Identifier for the related card Product
     * 
     */
    @JsonProperty("productIdentification")
    @JsonPropertyDescription("Identifier for the related card Product")
    private String productIdentification;
    /**
     * Unique identifier for the card rewards program as defined by the bank or credit union
     * 
     */
    @JsonProperty("rewardsProgramNumber")
    @JsonPropertyDescription("Unique identifier for the card rewards program as defined by the bank or credit union")
    private String rewardsProgramNumber;
    /**
     * Unique identifier for the household
     * 
     */
    @JsonProperty("portfolioNumber")
    @JsonPropertyDescription("Unique identifier for the household")
    private String portfolioNumber;
    /**
     * Date/time of last maintenance to the card
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    @JsonPropertyDescription("Date/time of last maintenance to the card")
    private Date lastUpdateDateTime;
    /**
     * Date/time of last activity
     * 
     */
    @JsonProperty("lastActivityDateTime")
    @JsonPropertyDescription("Date/time of last activity")
    private Date lastActivityDateTime;
    /**
     * Date the card was re-issued
     * 
     */
    @JsonProperty("reissueDate")
    @JsonPropertyDescription("Date the card was re-issued")
    private String reissueDate;
    /**
     * Month and Year the card previously expired
     * 
     */
    @JsonProperty("priorExpiration")
    @JsonPropertyDescription("Month and Year the card previously expired")
    private String priorExpiration;
    /**
     * Date/time the card status changed
     * 
     */
    @JsonProperty("statusChangeDateTime")
    @JsonPropertyDescription("Date/time the card status changed")
    private Date statusChangeDateTime;
    /**
     * Date the card was activated
     * 
     */
    @JsonProperty("activatedDate")
    @JsonPropertyDescription("Date the card was activated")
    private String activatedDate;
    /**
     * Method through which the card was activated
     * 
     */
    @JsonProperty("activatedChannel")
    @JsonPropertyDescription("Method through which the card was activated")
    private Card.ActivatedChannel activatedChannel;
    /**
     * Offset of the PIN
     * 
     */
    @JsonProperty("pinOffset")
    @JsonPropertyDescription("Offset of the PIN")
    private String pinOffset;
    /**
     * Language code; ISO-639-1
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("Language code; ISO-639-1")
    private String language;
    /**
     * Number of physical cards issued by number and sequenceNumber
     * 
     */
    @JsonProperty("issuedCount")
    @JsonPropertyDescription("Number of physical cards issued by number and sequenceNumber")
    private Integer issuedCount;
    /**
     * Has the card been re-issued (true) or not (false). When this is true and isAUSEnabled is true, then the .card.previousCard object is required
     * 
     */
    @JsonProperty("isReissued")
    @JsonPropertyDescription("Has the card been re-issued (true) or not (false). When this is true and isAUSEnabled is true, then the .card.previousCard object is required")
    private Boolean isReissued;
    /**
     * Is this card for personal  use (true) or commercial (false)
     * 
     */
    @JsonProperty("isPersonal")
    @JsonPropertyDescription("Is this card for personal  use (true) or commercial (false)")
    private Boolean isPersonal;
    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false). When this is true and isReissued is true, the .card.previousCard object is required
     * 
     */
    @JsonProperty("isAUSEnabled")
    @JsonPropertyDescription("Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false). When this is true and isReissued is true, the .card.previousCard object is required")
    private Boolean isAUSEnabled;
    /**
     * Is this card an instant issue card (true) or not (false). When this is true, then .issuedDate, .activatedDate and .activatedChannel are required
     * 
     */
    @JsonProperty("isInstantIssue")
    @JsonPropertyDescription("Is this card an instant issue card (true) or not (false). When this is true, then .issuedDate, .activatedDate and .activatedChannel are required")
    private Boolean isInstantIssue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accounts")
    private List<Accounts> accounts = new ArrayList<Accounts>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    private List<Address> address = new ArrayList<Address>();
    @JsonProperty("fees")
    private List<Fees> fees = new ArrayList<Fees>();
    /**
     * Images of the associated card
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Images of the associated card")
    private List<Image> image = new ArrayList<Image>();
    @JsonProperty("industryLocks")
    private List<IndustryLocks> industryLocks = new ArrayList<IndustryLocks>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    private List<Limits> limits = new ArrayList<Limits>();
    /**
     * List of orders associated to the card
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("List of orders associated to the card")
    private List<Order> order = new ArrayList<Order>();
    /**
     * Party associated to the card
     * (Required)
     * 
     */
    @JsonProperty("party")
    @JsonPropertyDescription("Party associated to the card")
    private Party party;
    /**
     * Object describing the previous card, eg. Re-issue scenario
     * 
     */
    @JsonProperty("previousCard")
    @JsonPropertyDescription("Object describing the previous card, eg. Re-issue scenario")
    private PreviousCard previousCard;
    @JsonProperty("security")
    private Security security;
    @JsonProperty("travelAlerts")
    private List<TravelAlerts> travelAlerts = new ArrayList<TravelAlerts>();
    /**
     * List of usages associated to the card. Either frequency, type or action are required and either count or amount.
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("List of usages associated to the card. Either frequency, type or action are required and either count or amount.")
    private Usage usage;

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

    public Card withNumber(String number) {
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

    public Card withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Type of card being described
     * 
     */
    @JsonProperty("type")
    public Card.Type getType() {
        return type;
    }

    /**
     * Type of card being described
     * 
     */
    @JsonProperty("type")
    public void setType(Card.Type type) {
        this.type = type;
    }

    public Card withType(Card.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Used to indicate the status of the card;
     * 
     */
    @JsonProperty("status")
    public Card.Status getStatus() {
        return status;
    }

    /**
     * Used to indicate the status of the card;
     * 
     */
    @JsonProperty("status")
    public void setStatus(Card.Status status) {
        this.status = status;
    }

    public Card withStatus(Card.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Indicates the detailed status of the card;
     * (Required)
     * 
     */
    @JsonProperty("detailStatus")
    public Card.DetailStatus getDetailStatus() {
        return detailStatus;
    }

    /**
     * Indicates the detailed status of the card;
     * (Required)
     * 
     */
    @JsonProperty("detailStatus")
    public void setDetailStatus(Card.DetailStatus detailStatus) {
        this.detailStatus = detailStatus;
    }

    public Card withDetailStatus(Card.DetailStatus detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }

    /**
     * User defined name of card
     * 
     */
    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    /**
     * User defined name of card
     * 
     */
    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Card withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * Description of the card
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description of the card
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Card withDescription(String description) {
        this.description = description;
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

    public Card withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * First name as it appears on the physical card
     * (Required)
     * 
     */
    @JsonProperty("embossedNameOne")
    public String getEmbossedNameOne() {
        return embossedNameOne;
    }

    /**
     * First name as it appears on the physical card
     * (Required)
     * 
     */
    @JsonProperty("embossedNameOne")
    public void setEmbossedNameOne(String embossedNameOne) {
        this.embossedNameOne = embossedNameOne;
    }

    public Card withEmbossedNameOne(String embossedNameOne) {
        this.embossedNameOne = embossedNameOne;
        return this;
    }

    /**
     * Second name as it appears on physical card
     * 
     */
    @JsonProperty("embossedNameTwo")
    public String getEmbossedNameTwo() {
        return embossedNameTwo;
    }

    /**
     * Second name as it appears on physical card
     * 
     */
    @JsonProperty("embossedNameTwo")
    public void setEmbossedNameTwo(String embossedNameTwo) {
        this.embossedNameTwo = embossedNameTwo;
    }

    public Card withEmbossedNameTwo(String embossedNameTwo) {
        this.embossedNameTwo = embossedNameTwo;
        return this;
    }

    /**
     * Date the card was issued
     * 
     */
    @JsonProperty("issuedDate")
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Date the card was issued
     * 
     */
    @JsonProperty("issuedDate")
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Card withIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    /**
     * ISO/BIN number associated with cards
     * (Required)
     * 
     */
    @JsonProperty("ISO")
    public String getIso() {
        return iso;
    }

    /**
     * ISO/BIN number associated with cards
     * (Required)
     * 
     */
    @JsonProperty("ISO")
    public void setIso(String iso) {
        this.iso = iso;
    }

    public Card withIso(String iso) {
        this.iso = iso;
        return this;
    }

    /**
     * The code for the limit strategy, eg. VIP
     * 
     */
    @JsonProperty("limitStrategyCode")
    public String getLimitStrategyCode() {
        return limitStrategyCode;
    }

    /**
     * The code for the limit strategy, eg. VIP
     * 
     */
    @JsonProperty("limitStrategyCode")
    public void setLimitStrategyCode(String limitStrategyCode) {
        this.limitStrategyCode = limitStrategyCode;
    }

    public Card withLimitStrategyCode(String limitStrategyCode) {
        this.limitStrategyCode = limitStrategyCode;
        return this;
    }

    /**
     * Date on which the card record was opened
     * 
     */
    @JsonProperty("openDate")
    public String getOpenDate() {
        return openDate;
    }

    /**
     * Date on which the card record was opened
     * 
     */
    @JsonProperty("openDate")
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public Card withOpenDate(String openDate) {
        this.openDate = openDate;
        return this;
    }

    /**
     * Date the card was closed
     * 
     */
    @JsonProperty("closedDate")
    public String getClosedDate() {
        return closedDate;
    }

    /**
     * Date the card was closed
     * 
     */
    @JsonProperty("closedDate")
    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public Card withClosedDate(String closedDate) {
        this.closedDate = closedDate;
        return this;
    }

    /**
     * Indicates if this is the primary owner (true) or not (false)
     * 
     */
    @JsonProperty("isPrimaryOwner")
    public Boolean getIsPrimaryOwner() {
        return isPrimaryOwner;
    }

    /**
     * Indicates if this is the primary owner (true) or not (false)
     * 
     */
    @JsonProperty("isPrimaryOwner")
    public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
        this.isPrimaryOwner = isPrimaryOwner;
    }

    public Card withIsPrimaryOwner(Boolean isPrimaryOwner) {
        this.isPrimaryOwner = isPrimaryOwner;
        return this;
    }

    /**
     * Identifier for the related card Product
     * 
     */
    @JsonProperty("productIdentification")
    public String getProductIdentification() {
        return productIdentification;
    }

    /**
     * Identifier for the related card Product
     * 
     */
    @JsonProperty("productIdentification")
    public void setProductIdentification(String productIdentification) {
        this.productIdentification = productIdentification;
    }

    public Card withProductIdentification(String productIdentification) {
        this.productIdentification = productIdentification;
        return this;
    }

    /**
     * Unique identifier for the card rewards program as defined by the bank or credit union
     * 
     */
    @JsonProperty("rewardsProgramNumber")
    public String getRewardsProgramNumber() {
        return rewardsProgramNumber;
    }

    /**
     * Unique identifier for the card rewards program as defined by the bank or credit union
     * 
     */
    @JsonProperty("rewardsProgramNumber")
    public void setRewardsProgramNumber(String rewardsProgramNumber) {
        this.rewardsProgramNumber = rewardsProgramNumber;
    }

    public Card withRewardsProgramNumber(String rewardsProgramNumber) {
        this.rewardsProgramNumber = rewardsProgramNumber;
        return this;
    }

    /**
     * Unique identifier for the household
     * 
     */
    @JsonProperty("portfolioNumber")
    public String getPortfolioNumber() {
        return portfolioNumber;
    }

    /**
     * Unique identifier for the household
     * 
     */
    @JsonProperty("portfolioNumber")
    public void setPortfolioNumber(String portfolioNumber) {
        this.portfolioNumber = portfolioNumber;
    }

    public Card withPortfolioNumber(String portfolioNumber) {
        this.portfolioNumber = portfolioNumber;
        return this;
    }

    /**
     * Date/time of last maintenance to the card
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    public Date getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Date/time of last maintenance to the card
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    public void setLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public Card withLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Date/time of last activity
     * 
     */
    @JsonProperty("lastActivityDateTime")
    public Date getLastActivityDateTime() {
        return lastActivityDateTime;
    }

    /**
     * Date/time of last activity
     * 
     */
    @JsonProperty("lastActivityDateTime")
    public void setLastActivityDateTime(Date lastActivityDateTime) {
        this.lastActivityDateTime = lastActivityDateTime;
    }

    public Card withLastActivityDateTime(Date lastActivityDateTime) {
        this.lastActivityDateTime = lastActivityDateTime;
        return this;
    }

    /**
     * Date the card was re-issued
     * 
     */
    @JsonProperty("reissueDate")
    public String getReissueDate() {
        return reissueDate;
    }

    /**
     * Date the card was re-issued
     * 
     */
    @JsonProperty("reissueDate")
    public void setReissueDate(String reissueDate) {
        this.reissueDate = reissueDate;
    }

    public Card withReissueDate(String reissueDate) {
        this.reissueDate = reissueDate;
        return this;
    }

    /**
     * Month and Year the card previously expired
     * 
     */
    @JsonProperty("priorExpiration")
    public String getPriorExpiration() {
        return priorExpiration;
    }

    /**
     * Month and Year the card previously expired
     * 
     */
    @JsonProperty("priorExpiration")
    public void setPriorExpiration(String priorExpiration) {
        this.priorExpiration = priorExpiration;
    }

    public Card withPriorExpiration(String priorExpiration) {
        this.priorExpiration = priorExpiration;
        return this;
    }

    /**
     * Date/time the card status changed
     * 
     */
    @JsonProperty("statusChangeDateTime")
    public Date getStatusChangeDateTime() {
        return statusChangeDateTime;
    }

    /**
     * Date/time the card status changed
     * 
     */
    @JsonProperty("statusChangeDateTime")
    public void setStatusChangeDateTime(Date statusChangeDateTime) {
        this.statusChangeDateTime = statusChangeDateTime;
    }

    public Card withStatusChangeDateTime(Date statusChangeDateTime) {
        this.statusChangeDateTime = statusChangeDateTime;
        return this;
    }

    /**
     * Date the card was activated
     * 
     */
    @JsonProperty("activatedDate")
    public String getActivatedDate() {
        return activatedDate;
    }

    /**
     * Date the card was activated
     * 
     */
    @JsonProperty("activatedDate")
    public void setActivatedDate(String activatedDate) {
        this.activatedDate = activatedDate;
    }

    public Card withActivatedDate(String activatedDate) {
        this.activatedDate = activatedDate;
        return this;
    }

    /**
     * Method through which the card was activated
     * 
     */
    @JsonProperty("activatedChannel")
    public Card.ActivatedChannel getActivatedChannel() {
        return activatedChannel;
    }

    /**
     * Method through which the card was activated
     * 
     */
    @JsonProperty("activatedChannel")
    public void setActivatedChannel(Card.ActivatedChannel activatedChannel) {
        this.activatedChannel = activatedChannel;
    }

    public Card withActivatedChannel(Card.ActivatedChannel activatedChannel) {
        this.activatedChannel = activatedChannel;
        return this;
    }

    /**
     * Offset of the PIN
     * 
     */
    @JsonProperty("pinOffset")
    public String getPinOffset() {
        return pinOffset;
    }

    /**
     * Offset of the PIN
     * 
     */
    @JsonProperty("pinOffset")
    public void setPinOffset(String pinOffset) {
        this.pinOffset = pinOffset;
    }

    public Card withPinOffset(String pinOffset) {
        this.pinOffset = pinOffset;
        return this;
    }

    /**
     * Language code; ISO-639-1
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Language code; ISO-639-1
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public Card withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Number of physical cards issued by number and sequenceNumber
     * 
     */
    @JsonProperty("issuedCount")
    public Integer getIssuedCount() {
        return issuedCount;
    }

    /**
     * Number of physical cards issued by number and sequenceNumber
     * 
     */
    @JsonProperty("issuedCount")
    public void setIssuedCount(Integer issuedCount) {
        this.issuedCount = issuedCount;
    }

    public Card withIssuedCount(Integer issuedCount) {
        this.issuedCount = issuedCount;
        return this;
    }

    /**
     * Has the card been re-issued (true) or not (false). When this is true and isAUSEnabled is true, then the .card.previousCard object is required
     * 
     */
    @JsonProperty("isReissued")
    public Boolean getIsReissued() {
        return isReissued;
    }

    /**
     * Has the card been re-issued (true) or not (false). When this is true and isAUSEnabled is true, then the .card.previousCard object is required
     * 
     */
    @JsonProperty("isReissued")
    public void setIsReissued(Boolean isReissued) {
        this.isReissued = isReissued;
    }

    public Card withIsReissued(Boolean isReissued) {
        this.isReissued = isReissued;
        return this;
    }

    /**
     * Is this card for personal  use (true) or commercial (false)
     * 
     */
    @JsonProperty("isPersonal")
    public Boolean getIsPersonal() {
        return isPersonal;
    }

    /**
     * Is this card for personal  use (true) or commercial (false)
     * 
     */
    @JsonProperty("isPersonal")
    public void setIsPersonal(Boolean isPersonal) {
        this.isPersonal = isPersonal;
    }

    public Card withIsPersonal(Boolean isPersonal) {
        this.isPersonal = isPersonal;
        return this;
    }

    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false). When this is true and isReissued is true, the .card.previousCard object is required
     * 
     */
    @JsonProperty("isAUSEnabled")
    public Boolean getIsAUSEnabled() {
        return isAUSEnabled;
    }

    /**
     * Is the Account Updater Services option (for automatic updates to all merchants) enabled for the card (true) or not (false). When this is true and isReissued is true, the .card.previousCard object is required
     * 
     */
    @JsonProperty("isAUSEnabled")
    public void setIsAUSEnabled(Boolean isAUSEnabled) {
        this.isAUSEnabled = isAUSEnabled;
    }

    public Card withIsAUSEnabled(Boolean isAUSEnabled) {
        this.isAUSEnabled = isAUSEnabled;
        return this;
    }

    /**
     * Is this card an instant issue card (true) or not (false). When this is true, then .issuedDate, .activatedDate and .activatedChannel are required
     * 
     */
    @JsonProperty("isInstantIssue")
    public Boolean getIsInstantIssue() {
        return isInstantIssue;
    }

    /**
     * Is this card an instant issue card (true) or not (false). When this is true, then .issuedDate, .activatedDate and .activatedChannel are required
     * 
     */
    @JsonProperty("isInstantIssue")
    public void setIsInstantIssue(Boolean isInstantIssue) {
        this.isInstantIssue = isInstantIssue;
    }

    public Card withIsInstantIssue(Boolean isInstantIssue) {
        this.isInstantIssue = isInstantIssue;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accounts")
    public List<Accounts> getAccounts() {
        return accounts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accounts")
    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public Card withAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Card withAddress(List<Address> address) {
        this.address = address;
        return this;
    }

    @JsonProperty("fees")
    public List<Fees> getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(List<Fees> fees) {
        this.fees = fees;
    }

    public Card withFees(List<Fees> fees) {
        this.fees = fees;
        return this;
    }

    /**
     * Images of the associated card
     * 
     */
    @JsonProperty("image")
    public List<Image> getImage() {
        return image;
    }

    /**
     * Images of the associated card
     * 
     */
    @JsonProperty("image")
    public void setImage(List<Image> image) {
        this.image = image;
    }

    public Card withImage(List<Image> image) {
        this.image = image;
        return this;
    }

    @JsonProperty("industryLocks")
    public List<IndustryLocks> getIndustryLocks() {
        return industryLocks;
    }

    @JsonProperty("industryLocks")
    public void setIndustryLocks(List<IndustryLocks> industryLocks) {
        this.industryLocks = industryLocks;
    }

    public Card withIndustryLocks(List<IndustryLocks> industryLocks) {
        this.industryLocks = industryLocks;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    public List<Limits> getLimits() {
        return limits;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    public void setLimits(List<Limits> limits) {
        this.limits = limits;
    }

    public Card withLimits(List<Limits> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * List of orders associated to the card
     * 
     */
    @JsonProperty("order")
    public List<Order> getOrder() {
        return order;
    }

    /**
     * List of orders associated to the card
     * 
     */
    @JsonProperty("order")
    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public Card withOrder(List<Order> order) {
        this.order = order;
        return this;
    }

    /**
     * Party associated to the card
     * (Required)
     * 
     */
    @JsonProperty("party")
    public Party getParty() {
        return party;
    }

    /**
     * Party associated to the card
     * (Required)
     * 
     */
    @JsonProperty("party")
    public void setParty(Party party) {
        this.party = party;
    }

    public Card withParty(Party party) {
        this.party = party;
        return this;
    }

    /**
     * Object describing the previous card, eg. Re-issue scenario
     * 
     */
    @JsonProperty("previousCard")
    public PreviousCard getPreviousCard() {
        return previousCard;
    }

    /**
     * Object describing the previous card, eg. Re-issue scenario
     * 
     */
    @JsonProperty("previousCard")
    public void setPreviousCard(PreviousCard previousCard) {
        this.previousCard = previousCard;
    }

    public Card withPreviousCard(PreviousCard previousCard) {
        this.previousCard = previousCard;
        return this;
    }

    @JsonProperty("security")
    public Security getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(Security security) {
        this.security = security;
    }

    public Card withSecurity(Security security) {
        this.security = security;
        return this;
    }

    @JsonProperty("travelAlerts")
    public List<TravelAlerts> getTravelAlerts() {
        return travelAlerts;
    }

    @JsonProperty("travelAlerts")
    public void setTravelAlerts(List<TravelAlerts> travelAlerts) {
        this.travelAlerts = travelAlerts;
    }

    public Card withTravelAlerts(List<TravelAlerts> travelAlerts) {
        this.travelAlerts = travelAlerts;
        return this;
    }

    /**
     * List of usages associated to the card. Either frequency, type or action are required and either count or amount.
     * 
     */
    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     * List of usages associated to the card. Either frequency, type or action are required and either count or amount.
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Card withUsage(Usage usage) {
        this.usage = usage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Card.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("detailStatus");
        sb.append('=');
        sb.append(((this.detailStatus == null)?"<null>":this.detailStatus));
        sb.append(',');
        sb.append("nickname");
        sb.append('=');
        sb.append(((this.nickname == null)?"<null>":this.nickname));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("expiration");
        sb.append('=');
        sb.append(((this.expiration == null)?"<null>":this.expiration));
        sb.append(',');
        sb.append("embossedNameOne");
        sb.append('=');
        sb.append(((this.embossedNameOne == null)?"<null>":this.embossedNameOne));
        sb.append(',');
        sb.append("embossedNameTwo");
        sb.append('=');
        sb.append(((this.embossedNameTwo == null)?"<null>":this.embossedNameTwo));
        sb.append(',');
        sb.append("issuedDate");
        sb.append('=');
        sb.append(((this.issuedDate == null)?"<null>":this.issuedDate));
        sb.append(',');
        sb.append("iso");
        sb.append('=');
        sb.append(((this.iso == null)?"<null>":this.iso));
        sb.append(',');
        sb.append("limitStrategyCode");
        sb.append('=');
        sb.append(((this.limitStrategyCode == null)?"<null>":this.limitStrategyCode));
        sb.append(',');
        sb.append("openDate");
        sb.append('=');
        sb.append(((this.openDate == null)?"<null>":this.openDate));
        sb.append(',');
        sb.append("closedDate");
        sb.append('=');
        sb.append(((this.closedDate == null)?"<null>":this.closedDate));
        sb.append(',');
        sb.append("isPrimaryOwner");
        sb.append('=');
        sb.append(((this.isPrimaryOwner == null)?"<null>":this.isPrimaryOwner));
        sb.append(',');
        sb.append("productIdentification");
        sb.append('=');
        sb.append(((this.productIdentification == null)?"<null>":this.productIdentification));
        sb.append(',');
        sb.append("rewardsProgramNumber");
        sb.append('=');
        sb.append(((this.rewardsProgramNumber == null)?"<null>":this.rewardsProgramNumber));
        sb.append(',');
        sb.append("portfolioNumber");
        sb.append('=');
        sb.append(((this.portfolioNumber == null)?"<null>":this.portfolioNumber));
        sb.append(',');
        sb.append("lastUpdateDateTime");
        sb.append('=');
        sb.append(((this.lastUpdateDateTime == null)?"<null>":this.lastUpdateDateTime));
        sb.append(',');
        sb.append("lastActivityDateTime");
        sb.append('=');
        sb.append(((this.lastActivityDateTime == null)?"<null>":this.lastActivityDateTime));
        sb.append(',');
        sb.append("reissueDate");
        sb.append('=');
        sb.append(((this.reissueDate == null)?"<null>":this.reissueDate));
        sb.append(',');
        sb.append("priorExpiration");
        sb.append('=');
        sb.append(((this.priorExpiration == null)?"<null>":this.priorExpiration));
        sb.append(',');
        sb.append("statusChangeDateTime");
        sb.append('=');
        sb.append(((this.statusChangeDateTime == null)?"<null>":this.statusChangeDateTime));
        sb.append(',');
        sb.append("activatedDate");
        sb.append('=');
        sb.append(((this.activatedDate == null)?"<null>":this.activatedDate));
        sb.append(',');
        sb.append("activatedChannel");
        sb.append('=');
        sb.append(((this.activatedChannel == null)?"<null>":this.activatedChannel));
        sb.append(',');
        sb.append("pinOffset");
        sb.append('=');
        sb.append(((this.pinOffset == null)?"<null>":this.pinOffset));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("issuedCount");
        sb.append('=');
        sb.append(((this.issuedCount == null)?"<null>":this.issuedCount));
        sb.append(',');
        sb.append("isReissued");
        sb.append('=');
        sb.append(((this.isReissued == null)?"<null>":this.isReissued));
        sb.append(',');
        sb.append("isPersonal");
        sb.append('=');
        sb.append(((this.isPersonal == null)?"<null>":this.isPersonal));
        sb.append(',');
        sb.append("isAUSEnabled");
        sb.append('=');
        sb.append(((this.isAUSEnabled == null)?"<null>":this.isAUSEnabled));
        sb.append(',');
        sb.append("isInstantIssue");
        sb.append('=');
        sb.append(((this.isInstantIssue == null)?"<null>":this.isInstantIssue));
        sb.append(',');
        sb.append("accounts");
        sb.append('=');
        sb.append(((this.accounts == null)?"<null>":this.accounts));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("fees");
        sb.append('=');
        sb.append(((this.fees == null)?"<null>":this.fees));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("industryLocks");
        sb.append('=');
        sb.append(((this.industryLocks == null)?"<null>":this.industryLocks));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
        sb.append(',');
        sb.append("previousCard");
        sb.append('=');
        sb.append(((this.previousCard == null)?"<null>":this.previousCard));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("travelAlerts");
        sb.append('=');
        sb.append(((this.travelAlerts == null)?"<null>":this.travelAlerts));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Method through which the card was activated
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ActivatedChannel {

        ATM("ATM"),
        BRANCH("Branch"),
        IVR("IVR"),
        ONLINE("Online");
        private final String value;
        private final static Map<String, Card.ActivatedChannel> CONSTANTS = new HashMap<String, Card.ActivatedChannel>();

        static {
            for (Card.ActivatedChannel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ActivatedChannel(String value) {
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
        public static Card.ActivatedChannel fromValue(String value) {
            Card.ActivatedChannel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

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
        private final static Map<String, Card.DetailStatus> CONSTANTS = new HashMap<String, Card.DetailStatus>();

        static {
            for (Card.DetailStatus c: values()) {
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
        public static Card.DetailStatus fromValue(String value) {
            Card.DetailStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Used to indicate the status of the card;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("Active"),
        INACTIVE("Inactive");
        private final String value;
        private final static Map<String, Card.Status> CONSTANTS = new HashMap<String, Card.Status>();

        static {
            for (Card.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static Card.Status fromValue(String value) {
            Card.Status constant = CONSTANTS.get(value);
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
        private final static Map<String, Card.Type> CONSTANTS = new HashMap<String, Card.Type>();

        static {
            for (Card.Type c: values()) {
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
        public static Card.Type fromValue(String value) {
            Card.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
