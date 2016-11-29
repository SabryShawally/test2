
package se.linkon.petra.order.ordercommon.response.travellers.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellersResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *           &lt;element name="TravellerDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}TravellerDescriptionsType" minOccurs="0"/&gt;
 *           &lt;element name="OrderItemDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}OrderItemDescriptionsType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellersResponseType", propOrder = {
    "salesOrderId",
    "travellerDescriptions",
    "orderItemDescriptions"
})
public class TravellersResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "TravellerDescriptions")
    protected TravellerDescriptionsType travellerDescriptions;
    @XmlElement(name = "OrderItemDescriptions", required = true)
    protected OrderItemDescriptionsType orderItemDescriptions;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderId(String value) {
        this.salesOrderId = value;
    }

    public boolean isSetSalesOrderId() {
        return (this.salesOrderId!= null);
    }

    /**
     * Gets the value of the travellerDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDescriptionsType }
     *     
     */
    public TravellerDescriptionsType getTravellerDescriptions() {
        return travellerDescriptions;
    }

    /**
     * Sets the value of the travellerDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDescriptionsType }
     *     
     */
    public void setTravellerDescriptions(TravellerDescriptionsType value) {
        this.travellerDescriptions = value;
    }

    public boolean isSetTravellerDescriptions() {
        return (this.travellerDescriptions!= null);
    }

    /**
     * Gets the value of the orderItemDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDescriptionsType }
     *     
     */
    public OrderItemDescriptionsType getOrderItemDescriptions() {
        return orderItemDescriptions;
    }

    /**
     * Sets the value of the orderItemDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDescriptionsType }
     *     
     */
    public void setOrderItemDescriptions(OrderItemDescriptionsType value) {
        this.orderItemDescriptions = value;
    }

    public boolean isSetOrderItemDescriptions() {
        return (this.orderItemDescriptions!= null);
    }

}
