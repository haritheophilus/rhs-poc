
package com.finserv.data.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EventType",
    "CustomerId",
    "ContactNumber",
    "EmailId"
})
@Generated("jsonschema2pojo")
public class CardInfo {

    @JsonProperty("EventType")
    private String eventType;
    @JsonProperty("CustomerId")
    private Double customerId;
    @JsonProperty("ContactNumber")
    private Double contactNumber;
    @JsonProperty("EmailId")
    private String emailId;

    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public CardInfo withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    @JsonProperty("CustomerId")
    public Double getCustomerId() {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(Double customerId) {
        this.customerId = customerId;
    }

    public CardInfo withCustomerId(Double customerId) {
        this.customerId = customerId;
        return this;
    }

    @JsonProperty("ContactNumber")
    public Double getContactNumber() {
        return contactNumber;
    }

    @JsonProperty("ContactNumber")
    public void setContactNumber(Double contactNumber) {
        this.contactNumber = contactNumber;
    }

    public CardInfo withContactNumber(Double contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    @JsonProperty("EmailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("EmailId")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public CardInfo withEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("contactNumber");
        sb.append('=');
        sb.append(((this.contactNumber == null)?"<null>":this.contactNumber));
        sb.append(',');
        sb.append("emailId");
        sb.append('=');
        sb.append(((this.emailId == null)?"<null>":this.emailId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
