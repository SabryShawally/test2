
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryDescriptions" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}ItineraryDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itineraryDescriptions"
})
@XmlRootElement(name = "GetOptionAvailabilityResponse")
public class GetOptionAvailabilityResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryDescriptions", required = true)
    protected ItineraryDescriptionsType itineraryDescriptions;

    /**
     * Gets the value of the itineraryDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryDescriptionsType }
     *     
     */
    public ItineraryDescriptionsType getItineraryDescriptions() {
        return itineraryDescriptions;
    }

    /**
     * Sets the value of the itineraryDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryDescriptionsType }
     *     
     */
    public void setItineraryDescriptions(ItineraryDescriptionsType value) {
        this.itineraryDescriptions = value;
    }

    public boolean isSetItineraryDescriptions() {
        return (this.itineraryDescriptions!= null);
    }

}
