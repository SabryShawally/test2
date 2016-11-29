
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;
import se.linkon.petra.gtssales.shared.data.v1_17.OrderItemReferenceType;


/**
 * <p>Java class for ConsumerSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerCategory"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerAge" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountCode" minOccurs="0"/&gt;
 *         &lt;element name="TravellerReference" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}TravellerReferenceSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemReference" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OrderItemReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerSpecificationType", propOrder = {
    "passengerCategory",
    "passengerAge",
    "discountCode",
    "travellerReference",
    "orderItemReference"
})
public class ConsumerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "PassengerAge", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer passengerAge;
    @XmlElement(name = "DiscountCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected DiscountCodeType discountCode;
    @XmlElement(name = "TravellerReference")
    protected TravellerReferenceSpecificationType travellerReference;
    @XmlElement(name = "OrderItemReference")
    protected OrderItemReferenceType orderItemReference;

    /**
     * 
     * 						A passenger category received in the response from operation getPassengerCategories.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoryType }
     *     
     */
    public PassengerCategoryType getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Sets the value of the passengerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoryType }
     *     
     */
    public void setPassengerCategory(PassengerCategoryType value) {
        this.passengerCategory = value;
    }

    public boolean isSetPassengerCategory() {
        return (this.passengerCategory!= null);
    }

    /**
     * 
     * 						If applicable. The age of the passenger						
     * 					
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerAge() {
        return passengerAge;
    }

    /**
     * Sets the value of the passengerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerAge(Integer value) {
        this.passengerAge = value;
    }

    public boolean isSetPassengerAge() {
        return (this.passengerAge!= null);
    }

    /**
     * 
     * 						Optional Discount code.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link DiscountCodeType }
     *     
     */
    public DiscountCodeType getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCodeType }
     *     
     */
    public void setDiscountCode(DiscountCodeType value) {
        this.discountCode = value;
    }

    public boolean isSetDiscountCode() {
        return (this.discountCode!= null);
    }

    /**
     * Gets the value of the travellerReference property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerReferenceSpecificationType }
     *     
     */
    public TravellerReferenceSpecificationType getTravellerReference() {
        return travellerReference;
    }

    /**
     * Sets the value of the travellerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerReferenceSpecificationType }
     *     
     */
    public void setTravellerReference(TravellerReferenceSpecificationType value) {
        this.travellerReference = value;
    }

    public boolean isSetTravellerReference() {
        return (this.travellerReference!= null);
    }

    /**
     * Gets the value of the orderItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemReferenceType }
     *     
     */
    public OrderItemReferenceType getOrderItemReference() {
        return orderItemReference;
    }

    /**
     * Sets the value of the orderItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemReferenceType }
     *     
     */
    public void setOrderItemReference(OrderItemReferenceType value) {
        this.orderItemReference = value;
    }

    public boolean isSetOrderItemReference() {
        return (this.orderItemReference!= null);
    }

}
