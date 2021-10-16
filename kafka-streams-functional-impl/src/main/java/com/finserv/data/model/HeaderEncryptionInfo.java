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
 * Object containing the encryption data information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "encryptType"
})
@Generated("jsonschema2pojo")
public class HeaderEncryptionInfo {

    /**
     * Field info
     * (Required)
     * 
     */
    @JsonProperty("field")
    @JsonPropertyDescription("Field info")
    private String field;
    /**
     * Encryption type
     * (Required)
     * 
     */
    @JsonProperty("encryptType")
    @JsonPropertyDescription("Encryption type")
    private HeaderEncryptionInfo.EncryptType encryptType;

    /**
     * Field info
     * (Required)
     * 
     */
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    /**
     * Field info
     * (Required)
     * 
     */
    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public HeaderEncryptionInfo withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Encryption type
     * (Required)
     * 
     */
    @JsonProperty("encryptType")
    public HeaderEncryptionInfo.EncryptType getEncryptType() {
        return encryptType;
    }

    /**
     * Encryption type
     * (Required)
     * 
     */
    @JsonProperty("encryptType")
    public void setEncryptType(HeaderEncryptionInfo.EncryptType encryptType) {
        this.encryptType = encryptType;
    }

    public HeaderEncryptionInfo withEncryptType(HeaderEncryptionInfo.EncryptType encryptType) {
        this.encryptType = encryptType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeaderEncryptionInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("encryptType");
        sb.append('=');
        sb.append(((this.encryptType == null)?"<null>":this.encryptType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Encryption type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EncryptType {

        BIN_INTERNAL("BIN_Internal"),
        BINARY_INTERNAL("Binary_Internal"),
        CARD_INTERNAL("Card_Internal"),
        CUSTOM_TEXT_INTERNAL("CustomText_Internal"),
        GENERIC_TEXT_INTERNAL("GenericText_Internal"),
        GENERIC_TEXT_TRAILING_4_INTERNAL("GenericText_Trailing4_Internal"),
        SSN_INTERNAL("SSN_Internal");
        private final String value;
        private final static Map<String, HeaderEncryptionInfo.EncryptType> CONSTANTS = new HashMap<String, HeaderEncryptionInfo.EncryptType>();

        static {
            for (HeaderEncryptionInfo.EncryptType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EncryptType(String value) {
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
        public static HeaderEncryptionInfo.EncryptType fromValue(String value) {
            HeaderEncryptionInfo.EncryptType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
