package com.finserv.data.model;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum TransactionRestrictions {

    ALL("All"),
    CREDIT("Credit"),
    CROSS_TRANSFER("CrossTransfer"),
    DEBIT("Debit"),
    DEPOSIT("Deposit"),
    INQUIRY("Inquiry"),
    POS("POS"),
    WITHDRAWAL("Withdrawal");
    private final String value;
    private final static Map<String, TransactionRestrictions> CONSTANTS = new HashMap<String, TransactionRestrictions>();

    static {
        for (TransactionRestrictions c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransactionRestrictions(String value) {
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
    public static TransactionRestrictions fromValue(String value) {
        TransactionRestrictions constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
