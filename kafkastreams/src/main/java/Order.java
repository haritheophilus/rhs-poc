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
 * Order associated to the card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "count",
    "isExpedited",
    "deliveryAddress"
})
@Generated("jsonschema2pojo")
public class Order {

    /**
     * Type of Order
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of Order")
    private Order.Type type;
    /**
     * Number of orders
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Number of orders")
    private Integer count;
    /**
     * Indicates whether this order is expedited (true) or not (false)
     * 
     */
    @JsonProperty("isExpedited")
    @JsonPropertyDescription("Indicates whether this order is expedited (true) or not (false)")
    private Boolean isExpedited;
    /**
     * Delivery address of the order
     * (Required)
     * 
     */
    @JsonProperty("deliveryAddress")
    @JsonPropertyDescription("Delivery address of the order")
    private DeliveryAddress deliveryAddress;

    /**
     * Type of Order
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Order.Type getType() {
        return type;
    }

    /**
     * Type of Order
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Order.Type type) {
        this.type = type;
    }

    public Order withType(Order.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Number of orders
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Number of orders
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Order withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Indicates whether this order is expedited (true) or not (false)
     * 
     */
    @JsonProperty("isExpedited")
    public Boolean getIsExpedited() {
        return isExpedited;
    }

    /**
     * Indicates whether this order is expedited (true) or not (false)
     * 
     */
    @JsonProperty("isExpedited")
    public void setIsExpedited(Boolean isExpedited) {
        this.isExpedited = isExpedited;
    }

    public Order withIsExpedited(Boolean isExpedited) {
        this.isExpedited = isExpedited;
        return this;
    }

    /**
     * Delivery address of the order
     * (Required)
     * 
     */
    @JsonProperty("deliveryAddress")
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Delivery address of the order
     * (Required)
     * 
     */
    @JsonProperty("deliveryAddress")
    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Order withDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("isExpedited");
        sb.append('=');
        sb.append(((this.isExpedited == null)?"<null>":this.isExpedited));
        sb.append(',');
        sb.append("deliveryAddress");
        sb.append('=');
        sb.append(((this.deliveryAddress == null)?"<null>":this.deliveryAddress));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Type of Order
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        NEW("New"),
        REISSUE("Reissue"),
        PIN_MAILER("PinMailer");
        private final String value;
        private final static Map<String, Order.Type> CONSTANTS = new HashMap<String, Order.Type>();

        static {
            for (Order.Type c: values()) {
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
        public static Order.Type fromValue(String value) {
            Order.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
