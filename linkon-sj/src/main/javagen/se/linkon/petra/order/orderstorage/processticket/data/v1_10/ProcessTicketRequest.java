
package se.linkon.petra.order.orderstorage.processticket.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *           &lt;element name="TearTicket" type="{http://petra.linkon.se/order/orderstorage/processticket/data/v1_10}TearTicketType"/&gt;
 *           &lt;element name="RevokeTearTicket" type="{http://petra.linkon.se/order/orderstorage/processticket/data/v1_10}RevokTearTicketType"/&gt;
 *         &lt;/choice&gt;
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
    "tearTicket",
    "revokeTearTicket"
})
@XmlRootElement(name = "ProcessTicketRequest")
public class ProcessTicketRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TearTicket")
    protected TearTicketType tearTicket;
    @XmlElement(name = "RevokeTearTicket")
    protected RevokTearTicketType revokeTearTicket;

    /**
     * Gets the value of the tearTicket property.
     * 
     * @return
     *     possible object is
     *     {@link TearTicketType }
     *     
     */
    public TearTicketType getTearTicket() {
        return tearTicket;
    }

    /**
     * Sets the value of the tearTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TearTicketType }
     *     
     */
    public void setTearTicket(TearTicketType value) {
        this.tearTicket = value;
    }

    public boolean isSetTearTicket() {
        return (this.tearTicket!= null);
    }

    /**
     * Gets the value of the revokeTearTicket property.
     * 
     * @return
     *     possible object is
     *     {@link RevokTearTicketType }
     *     
     */
    public RevokTearTicketType getRevokeTearTicket() {
        return revokeTearTicket;
    }

    /**
     * Sets the value of the revokeTearTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevokTearTicketType }
     *     
     */
    public void setRevokeTearTicket(RevokTearTicketType value) {
        this.revokeTearTicket = value;
    }

    public boolean isSetRevokeTearTicket() {
        return (this.revokeTearTicket!= null);
    }

}
