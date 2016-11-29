
package se.linkon.petra.order.orderstorage.validateforedit.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


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
 *           &lt;element name="ValidForNewOrderItems" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
 *           &lt;element name="ValidToOpenForNewOrderItems" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="NotAllowedToEditOrderItem" type="{http://petra.linkon.se/order/orderstorage/validateforedit/data/v1_10}NotAllowedToEditOrderItemType"/&gt;
 *         &lt;element name="ValidForOrderItemdEditList" type="{http://petra.linkon.se/order/orderstorage/validateforedit/data/v1_10}ValidForOrderItemEditListType" minOccurs="0"/&gt;
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
    "validForNewOrderItems",
    "validToOpenForNewOrderItems",
    "notAllowedToEditOrderItem",
    "validForOrderItemdEditList"
})
@XmlRootElement(name = "ValidateOrderForEditResponse")
public class ValidateOrderForEditResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidForNewOrderItems")
    protected EmptyType validForNewOrderItems;
    @XmlElement(name = "ValidToOpenForNewOrderItems")
    protected EmptyType validToOpenForNewOrderItems;
    @XmlElement(name = "NotAllowedToEditOrderItem", required = true)
    protected NotAllowedToEditOrderItemType notAllowedToEditOrderItem;
    @XmlElement(name = "ValidForOrderItemdEditList")
    protected ValidForOrderItemEditListType validForOrderItemdEditList;

    /**
     * Gets the value of the validForNewOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getValidForNewOrderItems() {
        return validForNewOrderItems;
    }

    /**
     * Sets the value of the validForNewOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setValidForNewOrderItems(EmptyType value) {
        this.validForNewOrderItems = value;
    }

    public boolean isSetValidForNewOrderItems() {
        return (this.validForNewOrderItems!= null);
    }

    /**
     * Gets the value of the validToOpenForNewOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getValidToOpenForNewOrderItems() {
        return validToOpenForNewOrderItems;
    }

    /**
     * Sets the value of the validToOpenForNewOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setValidToOpenForNewOrderItems(EmptyType value) {
        this.validToOpenForNewOrderItems = value;
    }

    public boolean isSetValidToOpenForNewOrderItems() {
        return (this.validToOpenForNewOrderItems!= null);
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

    /**
     * Gets the value of the validForOrderItemdEditList property.
     * 
     * @return
     *     possible object is
     *     {@link ValidForOrderItemEditListType }
     *     
     */
    public ValidForOrderItemEditListType getValidForOrderItemdEditList() {
        return validForOrderItemdEditList;
    }

    /**
     * Sets the value of the validForOrderItemdEditList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidForOrderItemEditListType }
     *     
     */
    public void setValidForOrderItemdEditList(ValidForOrderItemEditListType value) {
        this.validForOrderItemdEditList = value;
    }

    public boolean isSetValidForOrderItemdEditList() {
        return (this.validForOrderItemdEditList!= null);
    }

}
