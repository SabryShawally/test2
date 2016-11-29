
package se.linkon.petra.order.orderstorage.retroactivemember.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.MembershipIdentificationType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TicketNumber" minOccurs="0"/&gt;
 *           &lt;element name="OrderItemSpecification" type="{http://petra.linkon.se/order/orderstorage/retroactivemember/data/v1_10}OrderItemSpecificationType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="MembershipIdentification" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}MembershipIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "orderItemSpecification",
    "membershipIdentification"
})
@XmlRootElement(name = "SetRetroactiveMemberRequest")
public class SetRetroactiveMemberRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TicketNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String ticketNumber;
    @XmlElement(name = "OrderItemSpecification")
    protected OrderItemSpecificationType orderItemSpecification;
    @XmlElement(name = "MembershipIdentification", required = true)
    protected MembershipIdentificationType membershipIdentification;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    public boolean isSetTicketNumber() {
        return (this.ticketNumber!= null);
    }

    /**
     * Gets the value of the orderItemSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemSpecificationType }
     *     
     */
    public OrderItemSpecificationType getOrderItemSpecification() {
        return orderItemSpecification;
    }

    /**
     * Sets the value of the orderItemSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemSpecificationType }
     *     
     */
    public void setOrderItemSpecification(OrderItemSpecificationType value) {
        this.orderItemSpecification = value;
    }

    public boolean isSetOrderItemSpecification() {
        return (this.orderItemSpecification!= null);
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

}
