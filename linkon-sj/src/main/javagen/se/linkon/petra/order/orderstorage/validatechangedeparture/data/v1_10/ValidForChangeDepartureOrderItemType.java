
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidForChangeDepartureOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidForChangeDepartureOrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ValidForChangeDeparture" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}ValidForChangeDepartureType"/&gt;
 *           &lt;element name="NotValidForChangeDepartures" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}NotValidForChangeDepartureTypes"/&gt;
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
@XmlType(name = "ValidForChangeDepartureOrderItemType", propOrder = {
    "orderItemId",
    "validForChangeDeparture",
    "notValidForChangeDepartures"
})
public class ValidForChangeDepartureOrderItemType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "ValidForChangeDeparture")
    protected ValidForChangeDepartureType validForChangeDeparture;
    @XmlElement(name = "NotValidForChangeDepartures")
    protected NotValidForChangeDepartureTypes notValidForChangeDepartures;

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
     * Gets the value of the validForChangeDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link ValidForChangeDepartureType }
     *     
     */
    public ValidForChangeDepartureType getValidForChangeDeparture() {
        return validForChangeDeparture;
    }

    /**
     * Sets the value of the validForChangeDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidForChangeDepartureType }
     *     
     */
    public void setValidForChangeDeparture(ValidForChangeDepartureType value) {
        this.validForChangeDeparture = value;
    }

    public boolean isSetValidForChangeDeparture() {
        return (this.validForChangeDeparture!= null);
    }

    /**
     * Gets the value of the notValidForChangeDepartures property.
     * 
     * @return
     *     possible object is
     *     {@link NotValidForChangeDepartureTypes }
     *     
     */
    public NotValidForChangeDepartureTypes getNotValidForChangeDepartures() {
        return notValidForChangeDepartures;
    }

    /**
     * Sets the value of the notValidForChangeDepartures property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotValidForChangeDepartureTypes }
     *     
     */
    public void setNotValidForChangeDepartures(NotValidForChangeDepartureTypes value) {
        this.notValidForChangeDepartures = value;
    }

    public boolean isSetNotValidForChangeDepartures() {
        return (this.notValidForChangeDepartures!= null);
    }

}
