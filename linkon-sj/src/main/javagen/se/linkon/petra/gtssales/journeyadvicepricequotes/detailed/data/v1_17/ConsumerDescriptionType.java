
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * <p>Java class for ConsumerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerCategory"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber" minOccurs="0"/&gt;
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
@XmlType(name = "ConsumerDescriptionType", propOrder = {
    "passengerCategory",
    "travellerNumber",
    "discountCode"
})
public class ConsumerDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer travellerNumber;
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
     * Gets the value of the travellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravellerNumber() {
        return travellerNumber;
    }

    /**
     * Sets the value of the travellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravellerNumber(Integer value) {
        this.travellerNumber = value;
    }

    public boolean isSetTravellerNumber() {
        return (this.travellerNumber!= null);
    }

    /**
     * The discount code must be passed into the booking operation in order to obtain the discount.
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
