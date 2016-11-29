
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.ConsumerDescriptionsType;


/**
 * Describes an itinerary service with pricegroups and
 * 				optionally fare availability, seat availability and prices.
 * 				Consists of a ConsumerDescriptions containing travelers and an
 * 				ItineraryPriceDescription wrapping pricegroup/journey information.
 * 			
 * 
 * <p>Java class for ItineraryServicePriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryServicePriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialFareAvailabilities" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}SpecialFareAvailabilities" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ConsumerDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryPriceDescription" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryPriceDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryServicePriceDescriptionType", propOrder = {
    "specialFareAvailabilities",
    "consumerDescriptions",
    "itineraryPriceDescription"
})
public class ItineraryServicePriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SpecialFareAvailabilities")
    protected SpecialFareAvailabilities specialFareAvailabilities;
    @XmlElement(name = "ConsumerDescriptions")
    protected ConsumerDescriptionsType consumerDescriptions;
    @XmlElement(name = "ItineraryPriceDescription", required = true)
    protected ItineraryPriceDescriptionType itineraryPriceDescription;

    /**
     * Gets the value of the specialFareAvailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialFareAvailabilities }
     *     
     */
    public SpecialFareAvailabilities getSpecialFareAvailabilities() {
        return specialFareAvailabilities;
    }

    /**
     * Sets the value of the specialFareAvailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialFareAvailabilities }
     *     
     */
    public void setSpecialFareAvailabilities(SpecialFareAvailabilities value) {
        this.specialFareAvailabilities = value;
    }

    public boolean isSetSpecialFareAvailabilities() {
        return (this.specialFareAvailabilities!= null);
    }

    /**
     * Gets the value of the consumerDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerDescriptionsType }
     *     
     */
    public ConsumerDescriptionsType getConsumerDescriptions() {
        return consumerDescriptions;
    }

    /**
     * Sets the value of the consumerDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerDescriptionsType }
     *     
     */
    public void setConsumerDescriptions(ConsumerDescriptionsType value) {
        this.consumerDescriptions = value;
    }

    public boolean isSetConsumerDescriptions() {
        return (this.consumerDescriptions!= null);
    }

    /**
     * Gets the value of the itineraryPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryPriceDescriptionType }
     *     
     */
    public ItineraryPriceDescriptionType getItineraryPriceDescription() {
        return itineraryPriceDescription;
    }

    /**
     * Sets the value of the itineraryPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryPriceDescriptionType }
     *     
     */
    public void setItineraryPriceDescription(ItineraryPriceDescriptionType value) {
        this.itineraryPriceDescription = value;
    }

    public boolean isSetItineraryPriceDescription() {
        return (this.itineraryPriceDescription!= null);
    }

}
