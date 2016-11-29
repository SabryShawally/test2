
package se.linkon.petra.gtssales.seatavailability.detail.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.seatavailability.data.v1_17.Itinerary;


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
 *         &lt;element name="Itineraries" type="{http://petra.linkon.se/gtssales/seatavailability/data/v1_17}Itinerary" maxOccurs="unbounded"/&gt;
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
    "itineraries"
})
@XmlRootElement(name = "GetSeatAvailabilityDetailSpecification")
public class GetSeatAvailabilityDetailSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Itineraries", required = true)
    protected List<Itinerary> itineraries;

    /**
     * Gets the value of the itineraries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getItineraries() {
        if (itineraries == null) {
            itineraries = new ArrayList<Itinerary>();
        }
        return this.itineraries;
    }

    public boolean isSetItineraries() {
        return ((this.itineraries!= null)&&(!this.itineraries.isEmpty()));
    }

    public void unsetItineraries() {
        this.itineraries = null;
    }

}
