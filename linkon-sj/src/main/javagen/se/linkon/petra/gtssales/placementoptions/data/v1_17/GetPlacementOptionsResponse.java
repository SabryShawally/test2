
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="PlacementOptionsForJourneyAdvice" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}PlacementOptionsType"/&gt;
 *         &lt;element name="Itinerary" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}ItineraryResponse" maxOccurs="unbounded"/&gt;
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
    "journeyConnectionReference",
    "placementOptionsForJourneyAdvice",
    "itinerary"
})
@XmlRootElement(name = "GetPlacementOptionsResponse")
public class GetPlacementOptionsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "PlacementOptionsForJourneyAdvice", required = true)
    protected PlacementOptionsType placementOptionsForJourneyAdvice;
    @XmlElement(name = "Itinerary", required = true)
    protected List<ItineraryResponse> itinerary;

    /**
     * Gets the value of the journeyConnectionReference property.
     * 
     */
    public int getJourneyConnectionReference() {
        return journeyConnectionReference;
    }

    /**
     * Sets the value of the journeyConnectionReference property.
     * 
     */
    public void setJourneyConnectionReference(int value) {
        this.journeyConnectionReference = value;
    }

    public boolean isSetJourneyConnectionReference() {
        return true;
    }

    /**
     * Gets the value of the placementOptionsForJourneyAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOptionsType }
     *     
     */
    public PlacementOptionsType getPlacementOptionsForJourneyAdvice() {
        return placementOptionsForJourneyAdvice;
    }

    /**
     * Sets the value of the placementOptionsForJourneyAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOptionsType }
     *     
     */
    public void setPlacementOptionsForJourneyAdvice(PlacementOptionsType value) {
        this.placementOptionsForJourneyAdvice = value;
    }

    public boolean isSetPlacementOptionsForJourneyAdvice() {
        return (this.placementOptionsForJourneyAdvice!= null);
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryResponse }
     * 
     * 
     */
    public List<ItineraryResponse> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<ItineraryResponse>();
        }
        return this.itinerary;
    }

    public boolean isSetItinerary() {
        return ((this.itinerary!= null)&&(!this.itinerary.isEmpty()));
    }

    public void unsetItinerary() {
        this.itinerary = null;
    }

}
