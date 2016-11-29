
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateChangeDepartureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateChangeDepartureResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidForChangeDepartureOrderItems" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}ValidForChangeDepartureOrderItemsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateChangeDepartureResponseType", propOrder = {
    "validForChangeDepartureOrderItems"
})
public class ValidateChangeDepartureResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidForChangeDepartureOrderItems", required = true)
    protected ValidForChangeDepartureOrderItemsType validForChangeDepartureOrderItems;

    /**
     * Gets the value of the validForChangeDepartureOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link ValidForChangeDepartureOrderItemsType }
     *     
     */
    public ValidForChangeDepartureOrderItemsType getValidForChangeDepartureOrderItems() {
        return validForChangeDepartureOrderItems;
    }

    /**
     * Sets the value of the validForChangeDepartureOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidForChangeDepartureOrderItemsType }
     *     
     */
    public void setValidForChangeDepartureOrderItems(ValidForChangeDepartureOrderItemsType value) {
        this.validForChangeDepartureOrderItems = value;
    }

    public boolean isSetValidForChangeDepartureOrderItems() {
        return (this.validForChangeDepartureOrderItems!= null);
    }

}
