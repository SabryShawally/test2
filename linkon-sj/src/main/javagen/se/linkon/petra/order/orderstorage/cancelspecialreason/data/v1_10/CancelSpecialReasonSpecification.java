
package se.linkon.petra.order.orderstorage.cancelspecialreason.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CancelReasonCode"/&gt;
 *         &lt;element name="OrderItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OrderItem" type="{http://petra.linkon.se/order/orderstorage/cancelspecialreason/data/v1_10}OrderItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "cancelReasonCode",
    "orderItems"
})
@XmlRootElement(name = "CancelSpecialReasonSpecification")
public class CancelSpecialReasonSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "CancelReasonCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String cancelReasonCode;
    @XmlElement(name = "OrderItems")
    protected CancelSpecialReasonSpecification.OrderItems orderItems;

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
     * 
     *                             Reason code for the cancel action. Possible reason codes are retrieved from the getValidCodes operation for the list name ReasonCodeCancellation. 
     *                             Use a selected code value as input.
     *                         
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReasonCode() {
        return cancelReasonCode;
    }

    /**
     * Sets the value of the cancelReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReasonCode(String value) {
        this.cancelReasonCode = value;
    }

    public boolean isSetCancelReasonCode() {
        return (this.cancelReasonCode!= null);
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link CancelSpecialReasonSpecification.OrderItems }
     *     
     */
    public CancelSpecialReasonSpecification.OrderItems getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelSpecialReasonSpecification.OrderItems }
     *     
     */
    public void setOrderItems(CancelSpecialReasonSpecification.OrderItems value) {
        this.orderItems = value;
    }

    public boolean isSetOrderItems() {
        return (this.orderItems!= null);
    }


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
     *         &lt;element name="OrderItem" type="{http://petra.linkon.se/order/orderstorage/cancelspecialreason/data/v1_10}OrderItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "orderItem"
    })
    public static class OrderItems
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "OrderItem")
        protected List<OrderItemType> orderItem;

        /**
         * Gets the value of the orderItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderItemType }
         * 
         * 
         */
        public List<OrderItemType> getOrderItem() {
            if (orderItem == null) {
                orderItem = new ArrayList<OrderItemType>();
            }
            return this.orderItem;
        }

        public boolean isSetOrderItem() {
            return ((this.orderItem!= null)&&(!this.orderItem.isEmpty()));
        }

        public void unsetOrderItem() {
            this.orderItem = null;
        }

    }

}
