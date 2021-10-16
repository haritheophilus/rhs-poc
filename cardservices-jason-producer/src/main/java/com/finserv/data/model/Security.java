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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value"
})
@Generated("jsonschema2pojo")
public class Security {

    /**
     * Type of security
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of security")
    private Security.Type type;
    /**
     * Value for the type of Security specified
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value for the type of Security specified")
    private String value;

    /**
     * Type of security
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Security.Type getType() {
        return type;
    }

    /**
     * Type of security
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Security.Type type) {
        this.type = type;
    }

    public Security withType(Security.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Value for the type of Security specified
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value for the type of Security specified
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Security withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Security.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
     * Type of security
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        REFERENCE_CODE("ReferenceCode"),
        MOTHERS_MAIDEN_NAME("MothersMaidenName"),
        CVV("CVV");
        private final String value;
        private final static Map<String, Security.Type> CONSTANTS = new HashMap<String, Security.Type>();

        static {
            for (Security.Type c: values()) {
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
        public static Security.Type fromValue(String value) {
            Security.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
