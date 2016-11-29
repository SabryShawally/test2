
package se.linkon.petra.order.orderstorage.travellers.data.v1_10;

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
 *         &lt;choice&gt;
 *           &lt;element name="OrderItemIdsSpecification" type="{http://petra.linkon.se/order/orderstorage/travellers/data/v1_10}OrderItemIdsSpecification"/&gt;
 *           &lt;element name="TravellerNumbersSpecification" type="{http://petra.linkon.se/order/orderstorage/travellers/data/v1_10}TravellerNumbersSpecification"/&gt;
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
@XmlType(name = "", propOrder = {
    "salesOrderId",
    "orderLockId",
    "orderItemIdsSpecification",
    "travellerNumbersSpecification"
})
@XmlRootElement(name = "RemoveTravellersRequest")
public class RemoveTravellersRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "OrderItemIdsSpecification")
    protected OrderItemIdsSpecification orderItemIdsSpecification;
    @XmlElement(name = "TravellerNumbersSpecification")
    protected TravellerNumbersSpecification travellerNumbersSpecification;

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
     * Gets the value of the orderItemIdsSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemIdsSpecification }
     *     
     */
    public OrderItemIdsSpecification getOrderItemIdsSpecification() {
        return orderItemIdsSpecification;
    }

    /**
     * Sets the value of the orderItemIdsSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemIdsSpecification }
     *     
     */
    public void setOrderItemIdsSpecification(OrderItemIdsSpecification value) {
        this.orderItemIdsSpecification = value;
    }

    public boolean isSetOrderItemIdsSpecification() {
        return (this.orderItemIdsSpecification!= null);
    }

    /**
     * Gets the value of the travellerNumbersSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerNumbersSpecification }
     *     
     */
    public TravellerNumbersSpecification getTravellerNumbersSpecification() {
        return travellerNumbersSpecification;
    }

    /**
     * Sets the value of the travellerNumbersSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerNumbersSpecification }
     *     
     */
    public void setTravellerNumbersSpecification(TravellerNumbersSpecification value) {
        this.travellerNumbersSpecification = value;
    }

    public boolean isSetTravellerNumbersSpecification() {
        return (this.travellerNumbersSpecification!= null);
    }

}
