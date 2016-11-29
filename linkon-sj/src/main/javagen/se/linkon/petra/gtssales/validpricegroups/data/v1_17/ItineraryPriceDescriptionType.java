
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.TravelTypeType;


/**
 * Describes itinerary (journey) prices for a set of
 * 				pricegroups.
 * 
 * <p>Java class for ItineraryPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelType"/&gt;
 *         &lt;element name="PriceGroupDescriptions" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}PriceGroupDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPriceDescriptionType", propOrder = {
    "travelType",
    "priceGroupDescriptions"
})
public class ItineraryPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelTypeType travelType;
    @XmlElement(name = "PriceGroupDescriptions", required = true)
    protected PriceGroupDescriptionsType priceGroupDescriptions;

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTypeType }
     *     
     */
    public TravelTypeType getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTypeType }
     *     
     */
    public void setTravelType(TravelTypeType value) {
        this.travelType = value;
    }

    public boolean isSetTravelType() {
        return (this.travelType!= null);
    }

    /**
     * Gets the value of the priceGroupDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupDescriptionsType }
     *     
     */
    public PriceGroupDescriptionsType getPriceGroupDescriptions() {
        return priceGroupDescriptions;
    }

    /**
     * Sets the value of the priceGroupDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupDescriptionsType }
     *     
     */
    public void setPriceGroupDescriptions(PriceGroupDescriptionsType value) {
        this.priceGroupDescriptions = value;
    }

    public boolean isSetPriceGroupDescriptions() {
        return (this.priceGroupDescriptions!= null);
    }

}
