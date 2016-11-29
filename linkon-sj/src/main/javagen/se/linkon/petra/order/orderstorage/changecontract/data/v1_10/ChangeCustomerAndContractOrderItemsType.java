
package se.linkon.petra.order.orderstorage.changecontract.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCustomerAndContractOrderItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustomerAndContractOrderItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderReferencesOrderItem" type="{http://petra.linkon.se/order/orderstorage/changecontract/data/v1_10}OrderReferencesOrderItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCustomerAndContractOrderItemsType", propOrder = {
    "orderReferencesOrderItem"
})
public class ChangeCustomerAndContractOrderItemsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderReferencesOrderItem", required = true)
    protected List<OrderReferencesOrderItemType> orderReferencesOrderItem;

    /**
     * Gets the value of the orderReferencesOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderReferencesOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderReferencesOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferencesOrderItemType }
     * 
     * 
     */
    public List<OrderReferencesOrderItemType> getOrderReferencesOrderItem() {
        if (orderReferencesOrderItem == null) {
            orderReferencesOrderItem = new ArrayList<OrderReferencesOrderItemType>();
        }
        return this.orderReferencesOrderItem;
    }

    public boolean isSetOrderReferencesOrderItem() {
        return ((this.orderReferencesOrderItem!= null)&&(!this.orderReferencesOrderItem.isEmpty()));
    }

    public void unsetOrderReferencesOrderItem() {
        this.orderReferencesOrderItem = null;
    }

}
