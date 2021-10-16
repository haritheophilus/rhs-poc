
package com.rhslearnings.kafkastreams.republish.data.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EventType",
    "CustomerId",
    "ModifiedContactNumber",
    "ModifiedEmailId"
})
@Generated("jsonschema2pojo")
public class Notification {

    @JsonProperty("EventType")
    private String eventType;
    @JsonProperty("CustomerId")
    private Double customerId;
    @JsonProperty("ModifiedContactNumber")
    private Double modifiedContactNumber;
    @JsonProperty("ModifiedEmailId")
    private String modifiedEmailId;

    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Notification withEventType(String eventType) {
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

    public Notification withCustomerId(Double customerId) {
        this.customerId = customerId;
        return this;
    }

    @JsonProperty("ModifiedContactNumber")
    public Double getModifiedContactNumber() {
        return modifiedContactNumber;
    }

    @JsonProperty("ModifiedContactNumber")
    public void setModifiedContactNumber(Double modifiedContactNumber) {
        this.modifiedContactNumber = modifiedContactNumber;
    }

    public Notification withModifiedContactNumber(Double modifiedContactNumber) {
        this.modifiedContactNumber = modifiedContactNumber;
        return this;
    }

    @JsonProperty("ModifiedEmailId")
    public String getModifiedEmailId() {
        return modifiedEmailId;
    }

    @JsonProperty("ModifiedEmailId")
    public void setModifiedEmailId(String modifiedEmailId) {
        this.modifiedEmailId = modifiedEmailId;
    }

    public Notification withModifiedEmailId(String modifiedEmailId) {
        this.modifiedEmailId = modifiedEmailId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Notification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("modifiedContactNumber");
        sb.append('=');
        sb.append(((this.modifiedContactNumber == null)?"<null>":this.modifiedContactNumber));
        sb.append(',');
        sb.append("modifiedEmailId");
        sb.append('=');
        sb.append(((this.modifiedEmailId == null)?"<null>":this.modifiedEmailId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
