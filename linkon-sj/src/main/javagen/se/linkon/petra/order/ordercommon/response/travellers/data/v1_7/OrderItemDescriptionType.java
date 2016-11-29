
package se.linkon.petra.order.ordercommon.response.travellers.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.MembershipIdentificationType;


/**
 * 
 * 				Describes traveller connections and order item
 * 				properties for a given order item.
 * 				
 * 
 * <p>Java class for OrderItemDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="TravellerConnectionsDescription" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}TravellerConnectionsDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}MobilePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="MembershipIdentification" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}MembershipIdentificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerPriority" minOccurs="0"/&gt;
 *         &lt;element name="MultiRideTicketNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TicketNumberType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceReference" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}InvoiceReferencesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDescriptionType", propOrder = {
    "orderItemId",
    "travellerConnectionsDescription",
    "mobilePhone",
    "emailAddress",
    "membershipIdentification",
    "customerPriority",
    "multiRideTicketNumber",
    "invoiceReference"
})
public class OrderItemDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "TravellerConnectionsDescription")
    protected TravellerConnectionsDescriptionType travellerConnectionsDescription;
    @XmlElement(name = "MobilePhone", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String mobilePhone;
    @XmlElement(name = "EmailAddress", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String emailAddress;
    @XmlElement(name = "MembershipIdentification")
    protected MembershipIdentificationType membershipIdentification;
    @XmlElement(name = "CustomerPriority", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerPriority;
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
     * Gets the value of the travellerConnectionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerConnectionsDescriptionType }
     *     
     */
    public TravellerConnectionsDescriptionType getTravellerConnectionsDescription() {
        return travellerConnectionsDescription;
    }

    /**
     * Sets the value of the travellerConnectionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerConnectionsDescriptionType }
     *     
     */
    public void setTravellerConnectionsDescription(TravellerConnectionsDescriptionType value) {
        this.travellerConnectionsDescription = value;
    }

    public boolean isSetTravellerConnectionsDescription() {
        return (this.travellerConnectionsDescription!= null);
    }

    /**
     * 
     * 						When present, describes the mobile phone number
     * 						associated with this order item.
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
     * 
     * 						Only present for order items having a frequent
     * 						customer (with SJ Prio) connected. Describes the customer level at
     * 						the time the connection was made. This may differ from the current
     * 						customer level if the traveller has gathered more points since
     * 						then.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPriority() {
        return customerPriority;
    }

    /**
     * Sets the value of the customerPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPriority(String value) {
        this.customerPriority = value;
    }

    public boolean isSetCustomerPriority() {
        return (this.customerPriority!= null);
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
