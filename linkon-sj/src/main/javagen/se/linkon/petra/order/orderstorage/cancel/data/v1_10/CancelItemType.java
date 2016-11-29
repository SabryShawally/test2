
package se.linkon.petra.order.orderstorage.cancel.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * Describes the linear structure of an order to be canceled.
 * It is also indicating status codes for the rows that could not be canceled.
 * 
 * <p>Java class for CancelItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemId" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemIdType"/&gt;
 *         &lt;element name="CancelFailedStatus" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://petra.linkon.se/commonelements/data/v4_6}PointsType" minOccurs="0"/&gt;
 *         &lt;element name="CreditPoints" type="{http://petra.linkon.se/commonelements/data/v4_6}CreditPointsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelItemType", propOrder = {
    "orderItemId",
    "cancelFailedStatus",
    "totalPrice",
    "creditAmount",
    "points",
    "creditPoints"
})
public class CancelItemType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId")
    protected int orderItemId;
    @XmlElement(name = "CancelFailedStatus")
    protected StringCodeType cancelFailedStatus;
    @XmlElement(name = "TotalPrice")
    protected PriceVatType totalPrice;
    @XmlElement(name = "CreditAmount")
    protected PriceVatType creditAmount;
    @XmlElement(name = "Points")
    protected Integer points;
    @XmlElement(name = "CreditPoints")
    protected Integer creditPoints;

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
     * Gets the value of the cancelFailedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StringCodeType }
     *     
     */
    public StringCodeType getCancelFailedStatus() {
        return cancelFailedStatus;
    }

    /**
     * Sets the value of the cancelFailedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringCodeType }
     *     
     */
    public void setCancelFailedStatus(StringCodeType value) {
        this.cancelFailedStatus = value;
    }

    public boolean isSetCancelFailedStatus() {
        return (this.cancelFailedStatus!= null);
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setTotalPrice(PriceVatType value) {
        this.totalPrice = value;
    }

    public boolean isSetTotalPrice() {
        return (this.totalPrice!= null);
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setCreditAmount(PriceVatType value) {
        this.creditAmount = value;
    }

    public boolean isSetCreditAmount() {
        return (this.creditAmount!= null);
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return (this.points!= null);
    }

    /**
     * Gets the value of the creditPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditPoints() {
        return creditPoints;
    }

    /**
     * Sets the value of the creditPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditPoints(Integer value) {
        this.creditPoints = value;
    }

    public boolean isSetCreditPoints() {
        return (this.creditPoints!= null);
    }

}
