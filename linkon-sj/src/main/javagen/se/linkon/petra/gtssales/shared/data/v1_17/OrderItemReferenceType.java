
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Extra information to set on order item; cell phone number, email, membership identification, Multiride Ticket Number.
 *     		
 * 
 * <p>Java class for OrderItemReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobilePhoneNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TelephoneType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="MembershipIdentification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}CardType" minOccurs="0"/&gt;
 *         &lt;element name="MultiRideTicketNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TicketNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemReferenceType", propOrder = {
    "mobilePhoneNumber",
    "emailAddress",
    "membershipIdentification",
    "multiRideTicketNumber"
})
public class OrderItemReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "MobilePhoneNumber")
    protected String mobilePhoneNumber;
    @XmlElement(name = "EmailAddress", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String emailAddress;
    @XmlElement(name = "MembershipIdentification")
    protected CardType membershipIdentification;
    @XmlElement(name = "MultiRideTicketNumber")
    protected String multiRideTicketNumber;

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    public boolean isSetMobilePhoneNumber() {
        return (this.mobilePhoneNumber!= null);
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
     * Gets the value of the membershipIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getMembershipIdentification() {
        return membershipIdentification;
    }

    /**
     * Sets the value of the membershipIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setMembershipIdentification(CardType value) {
        this.membershipIdentification = value;
    }

    public boolean isSetMembershipIdentification() {
        return (this.membershipIdentification!= null);
    }

    /**
     * Gets the value of the multiRideTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiRideTicketNumber() {
        return multiRideTicketNumber;
    }

    /**
     * Sets the value of the multiRideTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiRideTicketNumber(String value) {
        this.multiRideTicketNumber = value;
    }

    public boolean isSetMultiRideTicketNumber() {
        return (this.multiRideTicketNumber!= null);
    }

}
