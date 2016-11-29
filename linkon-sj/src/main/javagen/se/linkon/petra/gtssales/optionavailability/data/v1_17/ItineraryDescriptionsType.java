
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryDescriptions" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}ItineraryDescriptionType" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryDescriptionsType", propOrder = {
    "itineraryDescriptions"
})
public class ItineraryDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryDescriptions", required = true)
    protected List<ItineraryDescriptionType> itineraryDescriptions;

    /**
     * Gets the value of the itineraryDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDescriptionType }
     * 
     * 
     */
    public List<ItineraryDescriptionType> getItineraryDescriptions() {
        if (itineraryDescriptions == null) {
            itineraryDescriptions = new ArrayList<ItineraryDescriptionType>();
        }
        return this.itineraryDescriptions;
    }

    public boolean isSetItineraryDescriptions() {
        return ((this.itineraryDescriptions!= null)&&(!this.itineraryDescriptions.isEmpty()));
    }

    public void unsetItineraryDescriptions() {
        this.itineraryDescriptions = null;
    }

}
