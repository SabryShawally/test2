
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains descriptions of all possible options that can be made on this specific journey advice. 
 * Options can exist on itinerary and/or segment level. Examples of possible options are seat reservation, Internet service, food, etc.
 * 
 * <p>Java class for JourneyAdviceOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyAdviceOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryOptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ItineraryOptionDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyAdviceOptionDescriptionType", propOrder = {
    "itineraryOptionDescriptions"
})
public class JourneyAdviceOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryOptionDescriptions", required = true)
    protected ItineraryOptionDescriptionsType itineraryOptionDescriptions;

    /**
     * Gets the value of the itineraryOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryOptionDescriptionsType }
     *     
     */
    public ItineraryOptionDescriptionsType getItineraryOptionDescriptions() {
        return itineraryOptionDescriptions;
    }

    /**
     * Sets the value of the itineraryOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryOptionDescriptionsType }
     *     
     */
    public void setItineraryOptionDescriptions(ItineraryOptionDescriptionsType value) {
        this.itineraryOptionDescriptions = value;
    }

    public boolean isSetItineraryOptionDescriptions() {
        return (this.itineraryOptionDescriptions!= null);
    }

}
