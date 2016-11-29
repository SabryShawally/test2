
package se.linkon.petra.order.orderstorage.createvoucherfromorder.data.v1_10;

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
 *           &lt;element name="SourceOrderItemsWithCompensationRule" type="{http://petra.linkon.se/order/orderstorage/createvoucherfromorder/data/v1_10}SourceOrderItemsWithCompensationRuleType"/&gt;
 *           &lt;element name="SourceOrderItemsWithManualPrice" type="{http://petra.linkon.se/order/orderstorage/createvoucherfromorder/data/v1_10}SourceOrderItemsWithManualPriceType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DestinationOrder" type="{http://petra.linkon.se/order/orderstorage/createvoucherfromorder/data/v1_10}DestinationOrderType"/&gt;
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
    "sourceOrderItemsWithCompensationRule",
    "sourceOrderItemsWithManualPrice",
    "destinationOrder"
})
@XmlRootElement(name = "CreateVoucherFromOrderRequest")
public class CreateVoucherFromOrderRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "SourceOrderItemsWithCompensationRule")
    protected SourceOrderItemsWithCompensationRuleType sourceOrderItemsWithCompensationRule;
    @XmlElement(name = "SourceOrderItemsWithManualPrice")
    protected SourceOrderItemsWithManualPriceType sourceOrderItemsWithManualPrice;
    @XmlElement(name = "DestinationOrder", required = true)
    protected DestinationOrderType destinationOrder;

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
     * Gets the value of the sourceOrderItemsWithCompensationRule property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOrderItemsWithCompensationRuleType }
     *     
     */
    public SourceOrderItemsWithCompensationRuleType getSourceOrderItemsWithCompensationRule() {
        return sourceOrderItemsWithCompensationRule;
    }

    /**
     * Sets the value of the sourceOrderItemsWithCompensationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOrderItemsWithCompensationRuleType }
     *     
     */
    public void setSourceOrderItemsWithCompensationRule(SourceOrderItemsWithCompensationRuleType value) {
        this.sourceOrderItemsWithCompensationRule = value;
    }

    public boolean isSetSourceOrderItemsWithCompensationRule() {
        return (this.sourceOrderItemsWithCompensationRule!= null);
    }

    /**
     * Gets the value of the sourceOrderItemsWithManualPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOrderItemsWithManualPriceType }
     *     
     */
    public SourceOrderItemsWithManualPriceType getSourceOrderItemsWithManualPrice() {
        return sourceOrderItemsWithManualPrice;
    }

    /**
     * Sets the value of the sourceOrderItemsWithManualPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOrderItemsWithManualPriceType }
     *     
     */
    public void setSourceOrderItemsWithManualPrice(SourceOrderItemsWithManualPriceType value) {
        this.sourceOrderItemsWithManualPrice = value;
    }

    public boolean isSetSourceOrderItemsWithManualPrice() {
        return (this.sourceOrderItemsWithManualPrice!= null);
    }

    /**
     * Gets the value of the destinationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationOrderType }
     *     
     */
    public DestinationOrderType getDestinationOrder() {
        return destinationOrder;
    }

    /**
     * Sets the value of the destinationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationOrderType }
     *     
     */
    public void setDestinationOrder(DestinationOrderType value) {
        this.destinationOrder = value;
    }

    public boolean isSetDestinationOrder() {
        return (this.destinationOrder!= null);
    }

}
