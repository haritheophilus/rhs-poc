package com.finserv.data.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Party associated to the card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "preferredContactMethod",
    "taxNumberType",
    "taxNumber",
    "birthDate",
    "firstName",
    "middleName",
    "lastName",
    "prefix",
    "suffix",
    "businessName",
    "email",
    "phone"
})
@Generated("jsonschema2pojo")
public class Party {

    /**
     * Identifier of the original card owner
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Identifier of the original card owner")
    private String number;
    /**
     * Preferred contact method
     * 
     */
    @JsonProperty("preferredContactMethod")
    @JsonPropertyDescription("Preferred contact method")
    private Party.PreferredContactMethod preferredContactMethod;
    /**
     * Type of tax identifier;
     * 
     */
    @JsonProperty("taxNumberType")
    @JsonPropertyDescription("Type of tax identifier;")
    private Party.TaxNumberType taxNumberType;
    /**
     * Tax identifier
     * 
     */
    @JsonProperty("taxNumber")
    @JsonPropertyDescription("Tax identifier")
    private String taxNumber;
    /**
     * Date of Birth
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Date of Birth")
    private String birthDate;
    /**
     * First name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("First name of the party; not applicable for businesses and entities")
    private String firstName;
    /**
     * Middle name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Middle name of the party; not applicable for businesses and entities")
    private String middleName;
    /**
     * Last name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Last name of the party; not applicable for businesses and entities")
    private String lastName;
    /**
     * Prefix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Prefix of the party; not applicable for businesses and entities")
    private String prefix;
    /**
     * Suffix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("Suffix of the party; not applicable for businesses and entities")
    private String suffix;
    /**
     * Name of business; not applicable for individuals
     * 
     */
    @JsonProperty("businessName")
    @JsonPropertyDescription("Name of business; not applicable for individuals")
    private String businessName;
    /**
     * List of Email objects associated to the .card.party object
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("List of Email objects associated to the .card.party object")
    private List<Email> email = new ArrayList<Email>();
    /**
     * List of Phone objects associated to the .card.party object
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("List of Phone objects associated to the .card.party object")
    private List<Phone> phone = new ArrayList<Phone>();

    /**
     * Identifier of the original card owner
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Identifier of the original card owner
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Party withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Preferred contact method
     * 
     */
    @JsonProperty("preferredContactMethod")
    public Party.PreferredContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Preferred contact method
     * 
     */
    @JsonProperty("preferredContactMethod")
    public void setPreferredContactMethod(Party.PreferredContactMethod preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public Party withPreferredContactMethod(Party.PreferredContactMethod preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
        return this;
    }

    /**
     * Type of tax identifier;
     * 
     */
    @JsonProperty("taxNumberType")
    public Party.TaxNumberType getTaxNumberType() {
        return taxNumberType;
    }

    /**
     * Type of tax identifier;
     * 
     */
    @JsonProperty("taxNumberType")
    public void setTaxNumberType(Party.TaxNumberType taxNumberType) {
        this.taxNumberType = taxNumberType;
    }

    public Party withTaxNumberType(Party.TaxNumberType taxNumberType) {
        this.taxNumberType = taxNumberType;
        return this;
    }

    /**
     * Tax identifier
     * 
     */
    @JsonProperty("taxNumber")
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Tax identifier
     * 
     */
    @JsonProperty("taxNumber")
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public Party withTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    /**
     * Date of Birth
     * 
     */
    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Date of Birth
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Party withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * First name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Party withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Party withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Party withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Prefix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Party withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Suffix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix of the party; not applicable for businesses and entities
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Party withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Name of business; not applicable for individuals
     * 
     */
    @JsonProperty("businessName")
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Name of business; not applicable for individuals
     * 
     */
    @JsonProperty("businessName")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Party withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * List of Email objects associated to the .card.party object
     * 
     */
    @JsonProperty("email")
    public List<Email> getEmail() {
        return email;
    }

    /**
     * List of Email objects associated to the .card.party object
     * 
     */
    @JsonProperty("email")
    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public Party withEmail(List<Email> email) {
        this.email = email;
        return this;
    }

    /**
     * List of Phone objects associated to the .card.party object
     * 
     */
    @JsonProperty("phone")
    public List<Phone> getPhone() {
        return phone;
    }

    /**
     * List of Phone objects associated to the .card.party object
     * 
     */
    @JsonProperty("phone")
    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public Party withPhone(List<Phone> phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Party.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("preferredContactMethod");
        sb.append('=');
        sb.append(((this.preferredContactMethod == null)?"<null>":this.preferredContactMethod));
        sb.append(',');
        sb.append("taxNumberType");
        sb.append('=');
        sb.append(((this.taxNumberType == null)?"<null>":this.taxNumberType));
        sb.append(',');
        sb.append("taxNumber");
        sb.append('=');
        sb.append(((this.taxNumber == null)?"<null>":this.taxNumber));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("businessName");
        sb.append('=');
        sb.append(((this.businessName == null)?"<null>":this.businessName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


    /**
     * Preferred contact method
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PreferredContactMethod {

        EMAIL("Email"),
        PHONE("Phone"),
        SMS("SMS");
        private final String value;
        private final static Map<String, Party.PreferredContactMethod> CONSTANTS = new HashMap<String, Party.PreferredContactMethod>();

        static {
            for (Party.PreferredContactMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PreferredContactMethod(String value) {
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
        public static Party.PreferredContactMethod fromValue(String value) {
            Party.PreferredContactMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type of tax identifier;
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TaxNumberType {

        EIN("EIN"),
        ITIN("ITIN"),
        SSN("SSN");
        private final String value;
        private final static Map<String, Party.TaxNumberType> CONSTANTS = new HashMap<String, Party.TaxNumberType>();

        static {
            for (Party.TaxNumberType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TaxNumberType(String value) {
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
        public static Party.TaxNumberType fromValue(String value) {
            Party.TaxNumberType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
