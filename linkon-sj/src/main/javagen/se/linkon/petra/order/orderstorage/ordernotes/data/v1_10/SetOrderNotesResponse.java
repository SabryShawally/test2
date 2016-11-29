
package se.linkon.petra.order.orderstorage.ordernotes.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7.OrderNotesType;


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
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/ordernotes/data/v1_7}OrderNotes"/&gt;
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
    "orderNotes"
})
@XmlRootElement(name = "SetOrderNotesResponse")
public class SetOrderNotesResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderNotes", namespace = "http://petra.linkon.se/order/ordercommon/response/ordernotes/data/v1_7", required = true)
    protected OrderNotesType orderNotes;

    /**
     * Gets the value of the orderNotes property.
     * 
     * @return
     *     possible object is
     *     {@link OrderNotesType }
     *     
     */
    public OrderNotesType getOrderNotes() {
        return orderNotes;
    }

    /**
     * Sets the value of the orderNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderNotesType }
     *     
     */
    public void setOrderNotes(OrderNotesType value) {
        this.orderNotes = value;
    }

    public boolean isSetOrderNotes() {
        return (this.orderNotes!= null);
    }

}
