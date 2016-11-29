
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateChangeDepartureRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateChangeDepartureRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrderId" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderIdType"/&gt;
 *         &lt;element name="OrderItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OrderItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ValidateChangeDepartureRequestType", propOrder = {
    "salesOrderId",
    "orderItems"
})
public class ValidateChangeDepartureRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderItems")
    protected ValidateChangeDepartureRequestType.OrderItems orderItems;

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
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateChangeDepartureRequestType.OrderItems }
     *     
     */
    public ValidateChangeDepartureRequestType.OrderItems getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateChangeDepartureRequestType.OrderItems }
     *     
     */
    public void setOrderItems(ValidateChangeDepartureRequestType.OrderItems value) {
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
     *         &lt;element name="OrderItem" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
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
        "orderItem"
    })
    public static class OrderItems
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "OrderItem")
        protected List<ValidateChangeDepartureRequestType.OrderItems.OrderItem> orderItem;

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
         * {@link ValidateChangeDepartureRequestType.OrderItems.OrderItem }
         * 
         * 
         */
        public List<ValidateChangeDepartureRequestType.OrderItems.OrderItem> getOrderItem() {
            if (orderItem == null) {
                orderItem = new ArrayList<ValidateChangeDepartureRequestType.OrderItems.OrderItem>();
            }
            return this.orderItem;
        }

        public boolean isSetOrderItem() {
            return ((this.orderItem!= null)&&(!this.orderItem.isEmpty()));
        }

        public void unsetOrderItem() {
            this.orderItem = null;
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
         *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
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
            "orderItemId"
        })
        public static class OrderItem
            implements Serializable
        {

            private final static long serialVersionUID = 1234L;
            @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
            protected int orderItemId;

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

        }

    }

}
