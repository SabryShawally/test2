
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * <p>Java class for CustomerAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerStreetName"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerStreetNameExtra" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerZipCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerCityName"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CountryName" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CareOf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAddressType", propOrder = {
    "customerStreetName",
    "customerStreetNameExtra",
    "customerZipCode",
    "customerCityName",
    "countryName",
    "countryCode",
    "careOf"
})
public class CustomerAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CustomerStreetName", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String customerStreetName;
    @XmlElement(name = "CustomerStreetNameExtra", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerStreetNameExtra;
    @XmlElement(name = "CustomerZipCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String customerZipCode;
    @XmlElement(name = "CustomerCityName", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String customerCityName;
    @XmlElement(name = "CountryName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String countryName;
    @XmlElement(name = "CountryCode")
    protected StringCodeType countryCode;
    @XmlElement(name = "CareOf", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String careOf;

    /**
     * Gets the value of the customerStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStreetName() {
        return customerStreetName;
    }

    /**
     * Sets the value of the customerStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStreetName(String value) {
        this.customerStreetName = value;
    }

    public boolean isSetCustomerStreetName() {
        return (this.customerStreetName!= null);
    }

    /**
     * Gets the value of the customerStreetNameExtra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStreetNameExtra() {
        return customerStreetNameExtra;
    }

    /**
     * Sets the value of the customerStreetNameExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStreetNameExtra(String value) {
        this.customerStreetNameExtra = value;
    }

    public boolean isSetCustomerStreetNameExtra() {
        return (this.customerStreetNameExtra!= null);
    }

    /**
     * Gets the value of the customerZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerZipCode() {
        return customerZipCode;
    }

    /**
     * Sets the value of the customerZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerZipCode(String value) {
        this.customerZipCode = value;
    }

    public boolean isSetCustomerZipCode() {
        return (this.customerZipCode!= null);
    }

    /**
     * Gets the value of the customerCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCityName() {
        return customerCityName;
    }

    /**
     * Sets the value of the customerCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCityName(String value) {
        this.customerCityName = value;
    }

    public boolean isSetCustomerCityName() {
        return (this.customerCityName!= null);
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    public boolean isSetCountryName() {
        return (this.countryName!= null);
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link StringCodeType }
     *     
     */
    public StringCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringCodeType }
     *     
     */
    public void setCountryCode(StringCodeType value) {
        this.countryCode = value;
    }

    public boolean isSetCountryCode() {
        return (this.countryCode!= null);
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    public boolean isSetCareOf() {
        return (this.careOf!= null);
    }

}
