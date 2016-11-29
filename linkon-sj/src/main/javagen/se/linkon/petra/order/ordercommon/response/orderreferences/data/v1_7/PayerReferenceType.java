
package se.linkon.petra.order.ordercommon.response.orderreferences.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LastName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Telephone" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceAddress" type="{http://petra.linkon.se/order/ordercommon/response/orderreferences/data/v1_7}ReferenceAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerReferenceType", propOrder = {
    "firstName",
    "lastName",
    "emailAddress",
    "telephone",
    "referenceAddress"
})
public class PayerReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FirstName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String firstName;
    @XmlElement(name = "LastName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String lastName;
    @XmlElement(name = "EmailAddress", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String emailAddress;
    @XmlElement(name = "Telephone", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String telephone;
    @XmlElement(name = "ReferenceAddress")
    protected ReferenceAddressType referenceAddress;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    public boolean isSetEmailAddress() {
        return (this.emailAddress!= null);
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    public boolean isSetTelephone() {
        return (this.telephone!= null);
    }

    /**
     * Gets the value of the referenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAddressType }
     *     
     */
    public ReferenceAddressType getReferenceAddress() {
        return referenceAddress;
    }

    /**
     * Sets the value of the referenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAddressType }
     *     
     */
    public void setReferenceAddress(ReferenceAddressType value) {
        this.referenceAddress = value;
    }

    public boolean isSetReferenceAddress() {
        return (this.referenceAddress!= null);
    }

}
