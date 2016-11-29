
package se.linkon.petra.order.orderstorage.cancel.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of the lines canceled or where attempts have been made to cancel.
 * 
 * <p>Java class for CancelItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelItem" type="{http://petra.linkon.se/order/orderstorage/cancel/data/v1_10}CancelItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelItemListType", propOrder = {
    "cancelItem"
})
public class CancelItemListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CancelItem", required = true)
    protected List<CancelItemType> cancelItem;

    /**
     * Gets the value of the cancelItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelItemType }
     * 
     * 
     */
    public List<CancelItemType> getCancelItem() {
        if (cancelItem == null) {
            cancelItem = new ArrayList<CancelItemType>();
        }
        return this.cancelItem;
    }

    public boolean isSetCancelItem() {
        return ((this.cancelItem!= null)&&(!this.cancelItem.isEmpty()));
    }

    public void unsetCancelItem() {
        this.cancelItem = null;
    }

}
