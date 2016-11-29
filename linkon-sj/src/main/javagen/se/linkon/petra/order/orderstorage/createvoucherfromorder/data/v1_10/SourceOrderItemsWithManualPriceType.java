
package se.linkon.petra.order.orderstorage.createvoucherfromorder.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOrderItemsWithManualPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceOrderItemsWithManualPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemWithManualPrice" type="{http://petra.linkon.se/order/orderstorage/createvoucherfromorder/data/v1_10}SourceOrderItemWithManualPriceType" maxOccurs="50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceOrderItemsWithManualPriceType", propOrder = {
    "orderItemWithManualPrice"
})
public class SourceOrderItemsWithManualPriceType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemWithManualPrice", required = true)
    protected List<SourceOrderItemWithManualPriceType> orderItemWithManualPrice;

    /**
     * Gets the value of the orderItemWithManualPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemWithManualPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemWithManualPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceOrderItemWithManualPriceType }
     * 
     * 
     */
    public List<SourceOrderItemWithManualPriceType> getOrderItemWithManualPrice() {
        if (orderItemWithManualPrice == null) {
            orderItemWithManualPrice = new ArrayList<SourceOrderItemWithManualPriceType>();
        }
        return this.orderItemWithManualPrice;
    }

    public boolean isSetOrderItemWithManualPrice() {
        return ((this.orderItemWithManualPrice!= null)&&(!this.orderItemWithManualPrice.isEmpty()));
    }

    public void unsetOrderItemWithManualPrice() {
        this.orderItemWithManualPrice = null;
    }

}
