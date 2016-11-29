
package se.linkon.petra.order.orderstorage.closeorder.data.v1_10;

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
 *         &lt;element name="CloseOrder" type="{http://petra.linkon.se/order/orderstorage/closeorder/data/v1_10}CloseOrderType"/&gt;
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
    "closeOrder"
})
@XmlRootElement(name = "CloseOrderSpecification")
public class CloseOrderSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CloseOrder", required = true)
    protected CloseOrderType closeOrder;

    /**
     * Gets the value of the closeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CloseOrderType }
     *     
     */
    public CloseOrderType getCloseOrder() {
        return closeOrder;
    }

    /**
     * Sets the value of the closeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseOrderType }
     *     
     */
    public void setCloseOrder(CloseOrderType value) {
        this.closeOrder = value;
    }

    public boolean isSetCloseOrder() {
        return (this.closeOrder!= null);
    }

}
