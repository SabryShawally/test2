
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Describes the price per consumer category.
 * 			
 * 
 * <p>Java class for ConsumerPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerCategory"/&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber" minOccurs="0"/&gt;
 *         &lt;element name="SeparatePriceDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SeparatePriceDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerPriceDescriptionType", propOrder = {
    "passengerCategory",
    "price",
    "travellerNumber",
    "separatePriceDescriptions"
})
public class ConsumerPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "Price", required = true)
    protected Money price;
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer travellerNumber;
    @XmlElement(name = "SeparatePriceDescriptions")
    protected SeparatePriceDescriptionsType separatePriceDescriptions;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
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
     * Gets the value of the separatePriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SeparatePriceDescriptionsType }
     *     
     */
    public SeparatePriceDescriptionsType getSeparatePriceDescriptions() {
        return separatePriceDescriptions;
    }

    /**
     * Sets the value of the separatePriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparatePriceDescriptionsType }
     *     
     */
    public void setSeparatePriceDescriptions(SeparatePriceDescriptionsType value) {
        this.separatePriceDescriptions = value;
    }

    public boolean isSetSeparatePriceDescriptions() {
        return (this.separatePriceDescriptions!= null);
    }

}
