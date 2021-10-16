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
public class Image {

    /**
     * Type of image
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of image")
    private Image.Type type;
    /**
     * The URI link to the image
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The URI link to the image")
    private String value;

    /**
     * Type of image
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Image.Type getType() {
        return type;
    }

    /**
     * Type of image
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Image.Type type) {
        this.type = type;
    }

    public Image withType(Image.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The URI link to the image
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * The URI link to the image
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Image withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
     * Type of image
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        STOCK("Stock"),
        PHOTO("Photo"),
        SIGNATURE("Signature");
        private final String value;
        private final static Map<String, Image.Type> CONSTANTS = new HashMap<String, Image.Type>();

        static {
            for (Image.Type c: values()) {
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
        public static Image.Type fromValue(String value) {
            Image.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
