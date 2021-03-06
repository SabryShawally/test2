
package se.linkon.petra.order.orderstorage.validateforcancel.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for ValidateOrderForCancelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateOrderForCancelResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ValidForCancel" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
 *           &lt;element name="NotValidForCancel" type="{http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10}NotValidForCancelType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ValidForCancelOrderItemList" type="{http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10}ValidForCancelOrderItemListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateOrderForCancelResponseType", propOrder = {
    "validForCancel",
    "notValidForCancel",
    "validForCancelOrderItemList"
})
public class ValidateOrderForCancelResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidForCancel")
    protected EmptyType validForCancel;
    @XmlElement(name = "NotValidForCancel")
    protected NotValidForCancelType notValidForCancel;
    @XmlElement(name = "ValidForCancelOrderItemList")
    protected ValidForCancelOrderItemListType validForCancelOrderItemList;

    /**
     * Gets the value of the validForCancel property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getValidForCancel() {
        return validForCancel;
    }

    /**
     * Sets the value of the validForCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setValidForCancel(EmptyType value) {
        this.validForCancel = value;
    }

    public boolean isSetValidForCancel() {
        return (this.validForCancel!= null);
    }

    /**
     * Gets the value of the notValidForCancel property.
     * 
     * @return
     *     possible object is
     *     {@link NotValidForCancelType }
     *     
     */
    public NotValidForCancelType getNotValidForCancel() {
        return notValidForCancel;
    }

    /**
     * Sets the value of the notValidForCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotValidForCancelType }
     *     
     */
    public void setNotValidForCancel(NotValidForCancelType value) {
        this.notValidForCancel = value;
    }

    public boolean isSetNotValidForCancel() {
        return (this.notValidForCancel!= null);
    }

    /**
     * Gets the value of the validForCancelOrderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ValidForCancelOrderItemListType }
     *     
     */
    public ValidForCancelOrderItemListType getValidForCancelOrderItemList() {
        return validForCancelOrderItemList;
    }

    /**
     * Sets the value of the validForCancelOrderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidForCancelOrderItemListType }
     *     
     */
    public void setValidForCancelOrderItemList(ValidForCancelOrderItemListType value) {
        this.validForCancelOrderItemList = value;
    }

    public boolean isSetValidForCancelOrderItemList() {
        return (this.validForCancelOrderItemList!= null);
    }

}
