
package se.linkon.petra.order.orderstorage.openorderforedit.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.OrderStatusCodeType;


/**
 * <p>Java class for OpenOrderForEditResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderForEditResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderSequenceNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderForEditResponse", propOrder = {
    "salesOrderId",
    "salesOrderSequenceNumber",
    "orderStatus"
})
public class OpenOrderForEditResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "SalesOrderSequenceNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int salesOrderSequenceNumber;
    @XmlElement(name = "OrderStatus", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected OrderStatusCodeType orderStatus;

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
     * Gets the value of the salesOrderSequenceNumber property.
     * 
     */
    public int getSalesOrderSequenceNumber() {
        return salesOrderSequenceNumber;
    }

    /**
     * Sets the value of the salesOrderSequenceNumber property.
     * 
     */
    public void setSalesOrderSequenceNumber(int value) {
        this.salesOrderSequenceNumber = value;
    }

    public boolean isSetSalesOrderSequenceNumber() {
        return true;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public OrderStatusCodeType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public void setOrderStatus(OrderStatusCodeType value) {
        this.orderStatus = value;
    }

    public boolean isSetOrderStatus() {
        return (this.orderStatus!= null);
    }

}
