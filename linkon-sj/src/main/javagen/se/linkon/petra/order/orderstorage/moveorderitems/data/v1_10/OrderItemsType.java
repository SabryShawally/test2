
package se.linkon.petra.order.orderstorage.moveorderitems.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemsType", propOrder = {
    "orderItemId"
})
public class OrderItemsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", type = Integer.class)
    protected List<Integer> orderItemId;

    /**
     * Gets the value of the orderItemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOrderItemId() {
        if (orderItemId == null) {
            orderItemId = new ArrayList<Integer>();
        }
        return this.orderItemId;
    }

    public boolean isSetOrderItemId() {
        return ((this.orderItemId!= null)&&(!this.orderItemId.isEmpty()));
    }

    public void unsetOrderItemId() {
        this.orderItemId = null;
    }

}
