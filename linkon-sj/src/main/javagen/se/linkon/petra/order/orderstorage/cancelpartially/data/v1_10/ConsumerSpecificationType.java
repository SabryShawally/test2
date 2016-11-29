
package se.linkon.petra.order.orderstorage.cancelpartially.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Specifies a consumer, or traveller, that should remain. 
 * Consumers have a category (VU, UN, BA, etc.) and an optional discount code.
 * 
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountCode" minOccurs="0"/&gt;
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
    "discountCode"
})
public class ConsumerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "DiscountCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected DiscountCodeType discountCode;

    /**
     * Gets the value of the passengerCategory property.
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
     * Gets the value of the discountCode property.
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

}
