
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.BookingRuleType;


/**
 * The respones for a specific segment.
 * 				Contains the segment reference and booking rule from the request,
 * 				together with the found placement options for the segment.
 * 			
 * 
 * <p>Java class for SegmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingRule"/&gt;
 *         &lt;element name="PlacementOptions" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}PlacementOptionsType"/&gt;
 *         &lt;element name="hasSeatmap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentResponse", propOrder = {
    "segmentReference",
    "bookingRule",
    "placementOptions",
    "hasSeatmap"
})
public class SegmentResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "BookingRule", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "string")
    protected BookingRuleType bookingRule;
    @XmlElement(name = "PlacementOptions", required = true)
    protected PlacementOptionsType placementOptions;
    @XmlElement(defaultValue = "false")
    protected boolean hasSeatmap;

    /**
     * Gets the value of the segmentReference property.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    public boolean isSetSegmentReference() {
        return true;
    }

    /**
     * Booking rule is copied from the value the client
     * 						passes in the request structure for easy reference.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link BookingRuleType }
     *     
     */
    public BookingRuleType getBookingRule() {
        return bookingRule;
    }

    /**
     * Sets the value of the bookingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRuleType }
     *     
     */
    public void setBookingRule(BookingRuleType value) {
        this.bookingRule = value;
    }

    public boolean isSetBookingRule() {
        return (this.bookingRule!= null);
    }

    /**
     * Gets the value of the placementOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOptionsType }
     *     
     */
    public PlacementOptionsType getPlacementOptions() {
        return placementOptions;
    }

    /**
     * Sets the value of the placementOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOptionsType }
     *     
     */
    public void setPlacementOptions(PlacementOptionsType value) {
        this.placementOptions = value;
    }

    public boolean isSetPlacementOptions() {
        return (this.placementOptions!= null);
    }

    /**
     * Gets the value of the hasSeatmap property.
     * 
     */
    public boolean isHasSeatmap() {
        return hasSeatmap;
    }

    /**
     * Sets the value of the hasSeatmap property.
     * 
     */
    public void setHasSeatmap(boolean value) {
        this.hasSeatmap = value;
    }

    public boolean isSetHasSeatmap() {
        return true;
    }

}
