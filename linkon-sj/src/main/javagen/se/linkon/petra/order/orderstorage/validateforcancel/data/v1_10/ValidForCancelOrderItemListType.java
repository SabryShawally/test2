
package se.linkon.petra.order.orderstorage.validateforcancel.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidForCancelOrderItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidForCancelOrderItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidForCancelOrderItem" type="{http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10}ValidForCancelOrderItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidForCancelOrderItemListType", propOrder = {
    "validForCancelOrderItem"
})
public class ValidForCancelOrderItemListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidForCancelOrderItem", required = true)
    protected List<ValidForCancelOrderItemType> validForCancelOrderItem;

    /**
     * Gets the value of the validForCancelOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validForCancelOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidForCancelOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidForCancelOrderItemType }
     * 
     * 
     */
    public List<ValidForCancelOrderItemType> getValidForCancelOrderItem() {
        if (validForCancelOrderItem == null) {
            validForCancelOrderItem = new ArrayList<ValidForCancelOrderItemType>();
        }
        return this.validForCancelOrderItem;
    }

    public boolean isSetValidForCancelOrderItem() {
        return ((this.validForCancelOrderItem!= null)&&(!this.validForCancelOrderItem.isEmpty()));
    }

    public void unsetValidForCancelOrderItem() {
        this.validForCancelOrderItem = null;
    }

}
