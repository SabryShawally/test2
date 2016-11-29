
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Consumer Specification.
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerAge" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber" minOccurs="0"/&gt;
 *         &lt;element name="MultiRideTicketNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TicketNumberType" minOccurs="0"/&gt;
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
    "travellerNumber",
    "multiRideTicketNumber"
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
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer travellerNumber;
    @XmlElement(name = "MultiRideTicketNumber")
    protected String multiRideTicketNumber;

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
     * 						If applicable. The age of the passenger.
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
     * In price query: optional, traveller is always anonymous. In booking flow this element has to be a reference that match a traveller (frequent, temporary or anonymous) in the traveller specification list.
     * 				
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
     * Gets the value of the multiRideTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiRideTicketNumber() {
        return multiRideTicketNumber;
    }

    /**
     * Sets the value of the multiRideTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiRideTicketNumber(String value) {
        this.multiRideTicketNumber = value;
    }

    public boolean isSetMultiRideTicketNumber() {
        return (this.multiRideTicketNumber!= null);
    }

}
