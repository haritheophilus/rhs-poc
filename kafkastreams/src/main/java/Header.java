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
 * Object that contains the data pertaining to the event that was triggered
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "organization",
    "eventType",
    "eventCode",
    "operationType",
    "eventDateTime",
    "eventVersion",
    "isRepublished",
    "originalEventId",
    "linkedEventId",
    "publisher",
    "encryption"
})
@Generated("jsonschema2pojo")
public class Header {

    /**
     * Generic identifier that contains no sensitive data and represents a unique value for the event being presented
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Generic identifier that contains no sensitive data and represents a unique value for the event being presented")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    private HeaderOrganization organization;
    /**
     * Indicates the type of event
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    @JsonPropertyDescription("Indicates the type of event")
    private Header.EventType eventType;
    /**
     * Further classifies the eventType
     * (Required)
     * 
     */
    @JsonProperty("eventCode")
    @JsonPropertyDescription("Further classifies the eventType")
    private Header.EventCode eventCode;
    /**
     * Indicates the type of change
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    @JsonPropertyDescription("Indicates the type of change")
    private Header.OperationType operationType;
    /**
     * Date/time when change occured
     * (Required)
     * 
     */
    @JsonProperty("eventDateTime")
    @JsonPropertyDescription("Date/time when change occured")
    private Date eventDateTime;
    /**
     * Version of the event (starts at "1.0.")
     * (Required)
     * 
     */
    @JsonProperty("eventVersion")
    @JsonPropertyDescription("Version of the event (starts at \"1.0.\")")
    private String eventVersion;
    /**
     * Indicates whether this event was previously published, such as a memo transaction that is published again during batch procesing.
     * 
     */
    @JsonProperty("isRepublished")
    @JsonPropertyDescription("Indicates whether this event was previously published, such as a memo transaction that is published again during batch procesing.")
    private Boolean isRepublished;
    /**
     * Optional - Original event id that is being republished
     * 
     */
    @JsonProperty("originalEventId")
    @JsonPropertyDescription("Optional - Original event id that is being republished")
    private String originalEventId;
    /**
     * Optional - Identifier to link related events together. This should only be populated when publishing a related event.
     * 
     */
    @JsonProperty("linkedEventId")
    @JsonPropertyDescription("Optional - Identifier to link related events together. This should only be populated when publishing a related event.")
    private String linkedEventId;
    /**
     * Object that contains publisher information
     * 
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("Object that contains publisher information")
    private HeaderPublisherInfo publisher;
    /**
     * List of objects containing the encryption data
     * 
     */
    @JsonProperty("encryption")
    @JsonPropertyDescription("List of objects containing the encryption data")
    private List<HeaderEncryptionInfo> encryption = new ArrayList<HeaderEncryptionInfo>();

    /**
     * Generic identifier that contains no sensitive data and represents a unique value for the event being presented
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Generic identifier that contains no sensitive data and represents a unique value for the event being presented
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Header withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public HeaderOrganization getOrganization() {
        return organization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(HeaderOrganization organization) {
        this.organization = organization;
    }

    public Header withOrganization(HeaderOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Indicates the type of event
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public Header.EventType getEventType() {
        return eventType;
    }

    /**
     * Indicates the type of event
     * (Required)
     * 
     */
    @JsonProperty("eventType")
    public void setEventType(Header.EventType eventType) {
        this.eventType = eventType;
    }

    public Header withEventType(Header.EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Further classifies the eventType
     * (Required)
     * 
     */
    @JsonProperty("eventCode")
    public Header.EventCode getEventCode() {
        return eventCode;
    }

    /**
     * Further classifies the eventType
     * (Required)
     * 
     */
    @JsonProperty("eventCode")
    public void setEventCode(Header.EventCode eventCode) {
        this.eventCode = eventCode;
    }

    public Header withEventCode(Header.EventCode eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * Indicates the type of change
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public Header.OperationType getOperationType() {
        return operationType;
    }

    /**
     * Indicates the type of change
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public void setOperationType(Header.OperationType operationType) {
        this.operationType = operationType;
    }

    public Header withOperationType(Header.OperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Date/time when change occured
     * (Required)
     * 
     */
    @JsonProperty("eventDateTime")
    public Date getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Date/time when change occured
     * (Required)
     * 
     */
    @JsonProperty("eventDateTime")
    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public Header withEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
        return this;
    }

    /**
     * Version of the event (starts at "1.0.")
     * (Required)
     * 
     */
    @JsonProperty("eventVersion")
    public String getEventVersion() {
        return eventVersion;
    }

    /**
     * Version of the event (starts at "1.0.")
     * (Required)
     * 
     */
    @JsonProperty("eventVersion")
    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }

    public Header withEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }

    /**
     * Indicates whether this event was previously published, such as a memo transaction that is published again during batch procesing.
     * 
     */
    @JsonProperty("isRepublished")
    public Boolean getIsRepublished() {
        return isRepublished;
    }

    /**
     * Indicates whether this event was previously published, such as a memo transaction that is published again during batch procesing.
     * 
     */
    @JsonProperty("isRepublished")
    public void setIsRepublished(Boolean isRepublished) {
        this.isRepublished = isRepublished;
    }

    public Header withIsRepublished(Boolean isRepublished) {
        this.isRepublished = isRepublished;
        return this;
    }

    /**
     * Optional - Original event id that is being republished
     * 
     */
    @JsonProperty("originalEventId")
    public String getOriginalEventId() {
        return originalEventId;
    }

    /**
     * Optional - Original event id that is being republished
     * 
     */
    @JsonProperty("originalEventId")
    public void setOriginalEventId(String originalEventId) {
        this.originalEventId = originalEventId;
    }

    public Header withOriginalEventId(String originalEventId) {
        this.originalEventId = originalEventId;
        return this;
    }

    /**
     * Optional - Identifier to link related events together. This should only be populated when publishing a related event.
     * 
     */
    @JsonProperty("linkedEventId")
    public String getLinkedEventId() {
        return linkedEventId;
    }

    /**
     * Optional - Identifier to link related events together. This should only be populated when publishing a related event.
     * 
     */
    @JsonProperty("linkedEventId")
    public void setLinkedEventId(String linkedEventId) {
        this.linkedEventId = linkedEventId;
    }

    public Header withLinkedEventId(String linkedEventId) {
        this.linkedEventId = linkedEventId;
        return this;
    }

    /**
     * Object that contains publisher information
     * 
     */
    @JsonProperty("publisher")
    public HeaderPublisherInfo getPublisher() {
        return publisher;
    }

    /**
     * Object that contains publisher information
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(HeaderPublisherInfo publisher) {
        this.publisher = publisher;
    }

    public Header withPublisher(HeaderPublisherInfo publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * List of objects containing the encryption data
     * 
     */
    @JsonProperty("encryption")
    public List<HeaderEncryptionInfo> getEncryption() {
        return encryption;
    }

    /**
     * List of objects containing the encryption data
     * 
     */
    @JsonProperty("encryption")
    public void setEncryption(List<HeaderEncryptionInfo> encryption) {
        this.encryption = encryption;
    }

    public Header withEncryption(List<HeaderEncryptionInfo> encryption) {
        this.encryption = encryption;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Header.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("eventCode");
        sb.append('=');
        sb.append(((this.eventCode == null)?"<null>":this.eventCode));
        sb.append(',');
        sb.append("operationType");
        sb.append('=');
        sb.append(((this.operationType == null)?"<null>":this.operationType));
        sb.append(',');
        sb.append("eventDateTime");
        sb.append('=');
        sb.append(((this.eventDateTime == null)?"<null>":this.eventDateTime));
        sb.append(',');
        sb.append("eventVersion");
        sb.append('=');
        sb.append(((this.eventVersion == null)?"<null>":this.eventVersion));
        sb.append(',');
        sb.append("isRepublished");
        sb.append('=');
        sb.append(((this.isRepublished == null)?"<null>":this.isRepublished));
        sb.append(',');
        sb.append("originalEventId");
        sb.append('=');
        sb.append(((this.originalEventId == null)?"<null>":this.originalEventId));
        sb.append(',');
        sb.append("linkedEventId");
        sb.append('=');
        sb.append(((this.linkedEventId == null)?"<null>":this.linkedEventId));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("encryption");
        sb.append('=');
        sb.append(((this.encryption == null)?"<null>":this.encryption));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Further classifies the eventType
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EventCode {

        ACTIVATE("Activate"),
        ADDRESS("Address"),
        EMAIL("Email"),
        LIMITS("Limits"),
        NEW("New"),
        PARTY("Party"),
        PHONE("Phone"),
        PIN_MAILER("PinMailer"),
        PIN_OFFSET("PinOffset"),
        PIN_TRY_RESET("PinTryReset"),
        REISSUE("Reissue"),
        RELATIONSHIP("Relationship"),
        REPLACEMENT("Replacement"),
        SECURITY("Security"),
        STATUS("Status");
        private final String value;
        private final static Map<String, Header.EventCode> CONSTANTS = new HashMap<String, Header.EventCode>();

        static {
            for (Header.EventCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EventCode(String value) {
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
        public static Header.EventCode fromValue(String value) {
            Header.EventCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates the type of event
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EventType {

        CARD("Card");
        private final String value;
        private final static Map<String, Header.EventType> CONSTANTS = new HashMap<String, Header.EventType>();

        static {
            for (Header.EventType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EventType(String value) {
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
        public static Header.EventType fromValue(String value) {
            Header.EventType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Indicates the type of change
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OperationType {

        ADD("Add"),
        UPDATE("Update");
        private final String value;
        private final static Map<String, Header.OperationType> CONSTANTS = new HashMap<String, Header.OperationType>();

        static {
            for (Header.OperationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OperationType(String value) {
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
        public static Header.OperationType fromValue(String value) {
            Header.OperationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
