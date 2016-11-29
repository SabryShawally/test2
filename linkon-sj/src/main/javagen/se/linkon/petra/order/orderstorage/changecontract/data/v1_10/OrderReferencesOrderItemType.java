
package se.linkon.petra.order.orderstorage.changecontract.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7.PriceAndOptionsDescriptionType;


/**
 * <p>Java class for OrderReferencesOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferencesOrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}PriceAndOptionsDescription"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferencesOrderItemType", propOrder = {
    "orderItemId",
    "priceAndOptionsDescription"
})
public class OrderReferencesOrderItemType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "PriceAndOptionsDescription", namespace = "http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", required = true)
    protected PriceAndOptionsDescriptionType priceAndOptionsDescription;

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
     * Gets the value of the priceAndOptionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndOptionsDescriptionType }
     *     
     */
    public PriceAndOptionsDescriptionType getPriceAndOptionsDescription() {
        return priceAndOptionsDescription;
    }

    /**
     * Sets the value of the priceAndOptionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndOptionsDescriptionType }
     *     
     */
    public void setPriceAndOptionsDescription(PriceAndOptionsDescriptionType value) {
        this.priceAndOptionsDescription = value;
    }

    public boolean isSetPriceAndOptionsDescription() {
        return (this.priceAndOptionsDescription!= null);
    }

}
