
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;


/**
 * The response for a specific itinerary.
 * 				Contains the itinerary reference and price group code from the request,
 * 				together with the found placement options for the itinerary.
 * 			
 * 
 * <p>Java class for ItineraryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="PlacementOptionsForItinerary" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}PlacementOptionsType"/&gt;
 *         &lt;element name="Segment" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}SegmentResponse" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryResponse", propOrder = {
    "itineraryReference",
    "priceGroupCode",
    "placementOptionsForItinerary",
    "segment"
})
public class ItineraryResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "PlacementOptionsForItinerary", required = true)
    protected PlacementOptionsType placementOptionsForItinerary;
    @XmlElement(name = "Segment", required = true)
    protected List<SegmentResponse> segment;

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
     * The itinerary price group from the request.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public PriceGroupCodeType getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Sets the value of the priceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public void setPriceGroupCode(PriceGroupCodeType value) {
        this.priceGroupCode = value;
    }

    public boolean isSetPriceGroupCode() {
        return (this.priceGroupCode!= null);
    }

    /**
     * Gets the value of the placementOptionsForItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOptionsType }
     *     
     */
    public PlacementOptionsType getPlacementOptionsForItinerary() {
        return placementOptionsForItinerary;
    }

    /**
     * Sets the value of the placementOptionsForItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOptionsType }
     *     
     */
    public void setPlacementOptionsForItinerary(PlacementOptionsType value) {
        this.placementOptionsForItinerary = value;
    }

    public boolean isSetPlacementOptionsForItinerary() {
        return (this.placementOptionsForItinerary!= null);
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
     * {@link SegmentResponse }
     * 
     * 
     */
    public List<SegmentResponse> getSegment() {
        if (segment == null) {
            segment = new ArrayList<SegmentResponse>();
        }
        return this.segment;
    }

    public boolean isSetSegment() {
        return ((this.segment!= null)&&(!this.segment.isEmpty()));
    }

    public void unsetSegment() {
        this.segment = null;
    }

}
