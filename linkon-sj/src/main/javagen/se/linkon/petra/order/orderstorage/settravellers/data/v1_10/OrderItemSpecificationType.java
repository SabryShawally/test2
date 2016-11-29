
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies traveller connections and order item
 * 				properties, such as mobile phone, membership identification and/or
 * 				multi-ride ticket number, for a given order item.
 * 				NOTE! None of the
 * 				contents of an order item specification (except the order item id)
 * 				is required according to schema BUT in practice the client MUST
 * 				specify at least one of the fields!
 * 			
 * 
 * <p>Java class for OrderItemSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="TravellerConnectionsSpecification" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}TravellerConnectionsSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}MobilePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="MembershipIdentification" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}MembershipIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="MultiRideTicketNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TicketNumberType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceReference" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}InvoiceReferencesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemSpecificationType", propOrder = {
    "orderItemId",
    "travellerConnectionsSpecification",
    "mobilePhone",
    "emailAddress",
    "membershipIdentification",
    "multiRideTicketNumber",
    "invoiceReference"
})
public class OrderItemSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "TravellerConnectionsSpecification")
    protected TravellerConnectionsSpecificationType travellerConnectionsSpecification;
    @XmlElement(name = "MobilePhone", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String mobilePhone;
    @XmlElement(name = "EmailAddress", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String emailAddress;
    @XmlElement(name = "MembershipIdentification")
    protected MembershipIdentificationType membershipIdentification;
    @XmlElement(name = "MultiRideTicketNumber")
    protected String multiRideTicketNumber;
    @XmlElement(name = "InvoiceReference")
    protected InvoiceReferencesType invoiceReference;

    /**
     * Gets the value of the orderItemId property.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return true;
    }

    /**
     * Gets the value of the travellerConnectionsSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerConnectionsSpecificationType }
     *     
     */
    public TravellerConnectionsSpecificationType getTravellerConnectionsSpecification() {
        return travellerConnectionsSpecification;
    }

    /**
     * Sets the value of the travellerConnectionsSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerConnectionsSpecificationType }
     *     
     */
    public void setTravellerConnectionsSpecification(TravellerConnectionsSpecificationType value) {
        this.travellerConnectionsSpecification = value;
    }

    public boolean isSetTravellerConnectionsSpecification() {
        return (this.travellerConnectionsSpecification!= null);
    }

    /**
     * 
     * 						The mobile phone number associated with this
     * 						order item. Mainly used for mobile ticket distibution. Not to be
     * 						confused with the phone number a specific traveller connected to
     * 						this order item.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    public boolean isSetMobilePhone() {
        return (this.mobilePhone!= null);
    }

    /**
     * 
     *                         When present, describes the email address
     *                         associated with this order item.
     *                     
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
     *     {@link MembershipIdentificationType }
     *     
     */
    public MembershipIdentificationType getMembershipIdentification() {
        return membershipIdentification;
    }

    /**
     * Sets the value of the membershipIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipIdentificationType }
     *     
     */
    public void setMembershipIdentification(MembershipIdentificationType value) {
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

    /**
     * Gets the value of the invoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReferencesType }
     *     
     */
    public InvoiceReferencesType getInvoiceReference() {
        return invoiceReference;
    }

    /**
     * Sets the value of the invoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReferencesType }
     *     
     */
    public void setInvoiceReference(InvoiceReferencesType value) {
        this.invoiceReference = value;
    }

    public boolean isSetInvoiceReference() {
        return (this.invoiceReference!= null);
    }

}
