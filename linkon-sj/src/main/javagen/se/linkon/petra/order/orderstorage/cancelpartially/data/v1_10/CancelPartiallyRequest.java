
package se.linkon.petra.order.orderstorage.cancelpartially.data.v1_10;

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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockId"/&gt;
 *         &lt;element name="OriginalSalesOrderId" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderIdType"/&gt;
 *         &lt;element name="OrderItemIdToCancelPartially" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemIdType"/&gt;
 *         &lt;element name="NewSalesOrderId" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderIdType" minOccurs="0"/&gt;
 *         &lt;element name="RemainingConsumersSpecifications" type="{http://petra.linkon.se/order/orderstorage/cancelpartially/data/v1_10}ConsumerSpecificationsType"/&gt;
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
    "orderLockId",
    "originalSalesOrderId",
    "orderItemIdToCancelPartially",
    "newSalesOrderId",
    "remainingConsumersSpecifications"
})
@XmlRootElement(name = "CancelPartiallyRequest")
public class CancelPartiallyRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "OriginalSalesOrderId", required = true)
    protected String originalSalesOrderId;
    @XmlElement(name = "OrderItemIdToCancelPartially")
    protected int orderItemIdToCancelPartially;
    @XmlElement(name = "NewSalesOrderId")
    protected String newSalesOrderId;
    @XmlElement(name = "RemainingConsumersSpecifications", required = true)
    protected ConsumerSpecificationsType remainingConsumersSpecifications;

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
     * Gets the value of the originalSalesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSalesOrderId() {
        return originalSalesOrderId;
    }

    /**
     * Sets the value of the originalSalesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSalesOrderId(String value) {
        this.originalSalesOrderId = value;
    }

    public boolean isSetOriginalSalesOrderId() {
        return (this.originalSalesOrderId!= null);
    }

    /**
     * Gets the value of the orderItemIdToCancelPartially property.
     * 
     */
    public int getOrderItemIdToCancelPartially() {
        return orderItemIdToCancelPartially;
    }

    /**
     * Sets the value of the orderItemIdToCancelPartially property.
     * 
     */
    public void setOrderItemIdToCancelPartially(int value) {
        this.orderItemIdToCancelPartially = value;
    }

    public boolean isSetOrderItemIdToCancelPartially() {
        return true;
    }

    /**
     * Gets the value of the newSalesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSalesOrderId() {
        return newSalesOrderId;
    }

    /**
     * Sets the value of the newSalesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSalesOrderId(String value) {
        this.newSalesOrderId = value;
    }

    public boolean isSetNewSalesOrderId() {
        return (this.newSalesOrderId!= null);
    }

    /**
     * Gets the value of the remainingConsumersSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public ConsumerSpecificationsType getRemainingConsumersSpecifications() {
        return remainingConsumersSpecifications;
    }

    /**
     * Sets the value of the remainingConsumersSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public void setRemainingConsumersSpecifications(ConsumerSpecificationsType value) {
        this.remainingConsumersSpecifications = value;
    }

    public boolean isSetRemainingConsumersSpecifications() {
        return (this.remainingConsumersSpecifications!= null);
    }

}
