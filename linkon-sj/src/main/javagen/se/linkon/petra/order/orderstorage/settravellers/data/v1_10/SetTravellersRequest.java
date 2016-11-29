
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockId"/&gt;
 *         &lt;element name="TravellerSpecifications" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}TravellerSpecificationsType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemSpecifications" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}OrderItemSpecificationsType"/&gt;
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
    "salesOrderId",
    "orderLockId",
    "travellerSpecifications",
    "orderItemSpecifications"
})
@XmlRootElement(name = "SetTravellersRequest")
public class SetTravellersRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "TravellerSpecifications")
    protected TravellerSpecificationsType travellerSpecifications;
    @XmlElement(name = "OrderItemSpecifications", required = true)
    protected OrderItemSpecificationsType orderItemSpecifications;

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
     * Gets the value of the orderLockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLockId() {
        return orderLockId;
    }

    /**
     * Sets the value of the orderLockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLockId(String value) {
        this.orderLockId = value;
    }

    public boolean isSetOrderLockId() {
        return (this.orderLockId!= null);
    }

    /**
     * Gets the value of the travellerSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSpecificationsType }
     *     
     */
    public TravellerSpecificationsType getTravellerSpecifications() {
        return travellerSpecifications;
    }

    /**
     * Sets the value of the travellerSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSpecificationsType }
     *     
     */
    public void setTravellerSpecifications(TravellerSpecificationsType value) {
        this.travellerSpecifications = value;
    }

    public boolean isSetTravellerSpecifications() {
        return (this.travellerSpecifications!= null);
    }

    /**
     * Gets the value of the orderItemSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemSpecificationsType }
     *     
     */
    public OrderItemSpecificationsType getOrderItemSpecifications() {
        return orderItemSpecifications;
    }

    /**
     * Sets the value of the orderItemSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemSpecificationsType }
     *     
     */
    public void setOrderItemSpecifications(OrderItemSpecificationsType value) {
        this.orderItemSpecifications = value;
    }

    public boolean isSetOrderItemSpecifications() {
        return (this.orderItemSpecifications!= null);
    }

}
