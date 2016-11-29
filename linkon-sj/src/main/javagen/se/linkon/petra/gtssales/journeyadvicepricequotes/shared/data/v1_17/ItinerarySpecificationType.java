
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies an itinerary, as part of a journey
 * 				advice, and its segments.
 * 			
 * 
 * <p>Java class for ItinerarySpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinerarySpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="SegmentSpecifications" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SegmentSpecificationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinerarySpecificationType", propOrder = {
    "itineraryReference",
    "segmentSpecifications"
})
public class ItinerarySpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "SegmentSpecifications", required = true)
    protected SegmentSpecificationsType segmentSpecifications;

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
     * Gets the value of the segmentSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public SegmentSpecificationsType getSegmentSpecifications() {
        return segmentSpecifications;
    }

    /**
     * Sets the value of the segmentSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public void setSegmentSpecifications(SegmentSpecificationsType value) {
        this.segmentSpecifications = value;
    }

    public boolean isSetSegmentSpecifications() {
        return (this.segmentSpecifications!= null);
    }

}
