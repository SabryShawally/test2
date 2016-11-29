
package se.linkon.petra.gtssales.seatavailability.detail.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed seat availability itinerary response.
 * Contains an itinerary reference, a list of segments and a flag indicting whether or not the itinerary is bookable.
 * 
 * <p>Java class for ItineraryDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="Segment" type="{http://petra.linkon.se/gtssales/seatavailability/detail/data/v1_17}SegmentDetailResponse" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itineraryBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryDetailResponse", propOrder = {
    "itineraryReference",
    "segment"
})
public class ItineraryDetailResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "Segment", required = true)
    protected List<SegmentDetailResponse> segment;
    @XmlAttribute(name = "itineraryBookable")
    protected Boolean itineraryBookable;

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
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDetailResponse }
     * 
     * 
     */
    public List<SegmentDetailResponse> getSegment() {
        if (segment == null) {
            segment = new ArrayList<SegmentDetailResponse>();
        }
        return this.segment;
    }

    public boolean isSetSegment() {
        return ((this.segment!= null)&&(!this.segment.isEmpty()));
    }

    public void unsetSegment() {
        this.segment = null;
    }

    /**
     * Gets the value of the itineraryBookable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItineraryBookable() {
        return itineraryBookable;
    }

    /**
     * Sets the value of the itineraryBookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItineraryBookable(boolean value) {
        this.itineraryBookable = value;
    }

    public boolean isSetItineraryBookable() {
        return (this.itineraryBookable!= null);
    }

    public void unsetItineraryBookable() {
        this.itineraryBookable = null;
    }

}
