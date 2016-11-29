
package se.linkon.petra.order.orderstorage.assistance.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="CancelAssistance" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
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
    "orderItemId",
    "cancelAssistance"
})
@XmlRootElement(name = "SetAssistanceStatusRequest")
public class SetAssistanceStatusRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "CancelAssistance")
    protected EmptyType cancelAssistance;

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
     * Gets the value of the cancelAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCancelAssistance() {
        return cancelAssistance;
    }

    /**
     * Sets the value of the cancelAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCancelAssistance(EmptyType value) {
        this.cancelAssistance = value;
    }

    public boolean isSetCancelAssistance() {
        return (this.cancelAssistance!= null);
    }

}
