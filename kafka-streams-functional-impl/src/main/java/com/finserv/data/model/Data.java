package com.finserv.data.model;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "card"
})
@Generated("jsonschema2pojo")
public class Data {

    /**
     * Object containing Card data
     * (Required)
     * 
     */
    @JsonProperty("card")
    @JsonPropertyDescription("Object containing Card data")
    private Card card;

    /**
     * Object containing Card data
     * (Required)
     * 
     */
    @JsonProperty("card")
    public Card getCard() {
        return card;
    }

    /**
     * Object containing Card data
     * (Required)
     * 
     */
    @JsonProperty("card")
    public void setCard(Card card) {
        this.card = card;
    }

    public Data withCard(Card card) {
        this.card = card;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("card");
        sb.append('=');
        sb.append(((this.card == null)?"<null>":this.card));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
