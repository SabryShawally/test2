
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes, for a given itinerary of the journey advice, the options and placement choices/prices.
 * 
 * <p>Java class for ItineraryOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="PriceGroupOptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}PriceGroupOptionDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryOptionDescriptionType", propOrder = {
    "itineraryReference",
    "priceGroupOptionDescriptions"
})
public class ItineraryOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "PriceGroupOptionDescriptions", required = true)
    protected PriceGroupOptionDescriptionsType priceGroupOptionDescriptions;

    /**
     * Gets the value of the itineraryReference property.
     * 
     */
    public int getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     */
    public void setItineraryReference(int value) {
        this.itineraryReference = value;
    }

    public boolean isSetItineraryReference() {
        return true;
    }

    /**
     * Gets the value of the priceGroupOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupOptionDescriptionsType }
     *     
     */
    public PriceGroupOptionDescriptionsType getPriceGroupOptionDescriptions() {
        return priceGroupOptionDescriptions;
    }

    /**
     * Sets the value of the priceGroupOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupOptionDescriptionsType }
     *     
     */
    public void setPriceGroupOptionDescriptions(PriceGroupOptionDescriptionsType value) {
        this.priceGroupOptionDescriptions = value;
    }

    public boolean isSetPriceGroupOptionDescriptions() {
        return (this.priceGroupOptionDescriptions!= null);
    }

}
