
package se.linkon.petra.gtssales.seatavailability.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The itinerary is the concept of a journey seen from a traveler perspective. 
 * Itineraries can be composed from a combination of segments with different products, producers and transports.
 * 
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="Segments" type="{http://petra.linkon.se/gtssales/seatavailability/data/v1_17}Segment" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "itineraryReference",
    "segments"
})
public class Itinerary
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "Segments", required = true)
    protected List<Segment> segments;

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
     * Gets the value of the segments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegments() {
        if (segments == null) {
            segments = new ArrayList<Segment>();
        }
        return this.segments;
    }

    public boolean isSetSegments() {
        return ((this.segments!= null)&&(!this.segments.isEmpty()));
    }

    public void unsetSegments() {
        this.segments = null;
    }

}
