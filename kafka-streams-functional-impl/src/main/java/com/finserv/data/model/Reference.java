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
    "number"
})
@Generated("jsonschema2pojo")
public class Reference {

    /**
     * Type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of address")
    private Reference.Type type;
    /**
     * Reference number that uniquely identifies the associated object as specified by the Type field. Can be a composite key.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Reference number that uniquely identifies the associated object as specified by the Type field. Can be a composite key.")
    private String number;

    /**
     * Type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Reference.Type getType() {
        return type;
    }

    /**
     * Type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Reference.Type type) {
        this.type = type;
    }

    public Reference withType(Reference.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Reference number that uniquely identifies the associated object as specified by the Type field. Can be a composite key.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Reference number that uniquely identifies the associated object as specified by the Type field. Can be a composite key.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Reference withNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Type of address
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ACCOUNT("Account"),
        ADDRESS("Address"),
        CARD("Card"),
        PARTY("Party");
        private final String value;
        private final static Map<String, Reference.Type> CONSTANTS = new HashMap<String, Reference.Type>();

        static {
            for (Reference.Type c: values()) {
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
        public static Reference.Type fromValue(String value) {
            Reference.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
