
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Specifies a consumer, or traveller, for a service.
 * 				Consumers have a category (VU, UN, BA, etc.) and an optional age.
 * 			
 * 
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerAge" minOccurs="0"/&gt;
 *         &lt;element name="TravellerNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumberType" minOccurs="0"/&gt;
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
    "passengerAge",
    "travellerNumber"
})
public class ConsumerDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "PassengerAge", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer passengerAge;
    @XmlElement(name = "TravellerNumber")
    @XmlSchemaType(name = "integer")
    protected Integer travellerNumber;

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
     * Gets the value of the passengerAge property.
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

}
