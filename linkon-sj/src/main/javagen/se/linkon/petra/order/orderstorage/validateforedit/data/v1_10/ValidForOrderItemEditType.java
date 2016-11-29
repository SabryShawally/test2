
package se.linkon.petra.order.orderstorage.validateforedit.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for ValidForOrderItemEditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidForOrderItemEditType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ValidForEdit" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
 *           &lt;element name="NotAllowedToEditOrderItem" type="{http://petra.linkon.se/order/orderstorage/validateforedit/data/v1_10}NotAllowedToEditOrderItemType"/&gt;
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
@XmlType(name = "ValidForOrderItemEditType", propOrder = {
    "orderItemId",
    "validForEdit",
    "notAllowedToEditOrderItem"
})
public class ValidForOrderItemEditType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "ValidForEdit")
    protected EmptyType validForEdit;
    @XmlElement(name = "NotAllowedToEditOrderItem")
    protected NotAllowedToEditOrderItemType notAllowedToEditOrderItem;

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
     * Gets the value of the validForEdit property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getValidForEdit() {
        return validForEdit;
    }

    /**
     * Sets the value of the validForEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setValidForEdit(EmptyType value) {
        this.validForEdit = value;
    }

    public boolean isSetValidForEdit() {
        return (this.validForEdit!= null);
    }

    /**
     * Gets the value of the notAllowedToEditOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link NotAllowedToEditOrderItemType }
     *     
     */
    public NotAllowedToEditOrderItemType getNotAllowedToEditOrderItem() {
        return notAllowedToEditOrderItem;
    }

    /**
     * Sets the value of the notAllowedToEditOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAllowedToEditOrderItemType }
     *     
     */
    public void setNotAllowedToEditOrderItem(NotAllowedToEditOrderItemType value) {
        this.notAllowedToEditOrderItem = value;
    }

    public boolean isSetNotAllowedToEditOrderItem() {
        return (this.notAllowedToEditOrderItem!= null);
    }

}
