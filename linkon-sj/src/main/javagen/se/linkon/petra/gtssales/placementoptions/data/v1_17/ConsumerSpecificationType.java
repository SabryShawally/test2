
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Specifies a consumer, or traveller, for a service,
 * 				together with its category (VU, UN, BA, etc.).
 * 			
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
    "passengerAge"
})
public class ConsumerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "PassengerAge", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer passengerAge;

    /**
     * 
     * 						A passenger category received in the response from operation getPassengerCategories..
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

}
