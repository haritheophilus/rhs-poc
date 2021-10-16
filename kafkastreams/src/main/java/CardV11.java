import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This event is generated when Card related data is added, changed or deleted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "data"
})
@Generated("jsonschema2pojo")
public class CardV11 {

    /**
     * Object that contains the data pertaining to the event that was triggered
     * (Required)
     * 
     */
    @JsonProperty("header")
    @JsonPropertyDescription("Object that contains the data pertaining to the event that was triggered")
    private Header header;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private Data data;

    /**
     * Object that contains the data pertaining to the event that was triggered
     * (Required)
     * 
     */
    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    /**
     * Object that contains the data pertaining to the event that was triggered
     * (Required)
     * 
     */
    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

    public CardV11 withHeader(Header header) {
        this.header = header;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public CardV11 withData(Data data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardV11 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("header");
        sb.append('=');
        sb.append(((this.header == null)?"<null>":this.header));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
