
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;


/**
 * 
 * 			Describes the properties of the consumer segment required to obtain the price of this sales category. 
 * During booking the client must delegate this information to the booking operation.
 * 			
 * 
 * <p>Java class for ConsumerSegmentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerSegmentDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="RequiredOptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}RequiredOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="SeatMapBookingClass" type="{http://petra.linkon.se/commonelements/data/v4_6}BookingClassType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerSegmentDescriptionType", propOrder = {
    "segmentReference",
    "requiredOptions",
    "seatMapBookingClass"
})
public class ConsumerSegmentDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "RequiredOptions")
    protected RequiredOptionsType requiredOptions;
    @XmlElement(name = "SeatMapBookingClass")
    protected BookingClassType seatMapBookingClass;

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
     * Gets the value of the requiredOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredOptionsType }
     *     
     */
    public RequiredOptionsType getRequiredOptions() {
        return requiredOptions;
    }

    /**
     * Sets the value of the requiredOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredOptionsType }
     *     
     */
    public void setRequiredOptions(RequiredOptionsType value) {
        this.requiredOptions = value;
    }

    public boolean isSetRequiredOptions() {
        return (this.requiredOptions!= null);
    }

    /**
     * Gets the value of the seatMapBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassType }
     *     
     */
    public BookingClassType getSeatMapBookingClass() {
        return seatMapBookingClass;
    }

    /**
     * Sets the value of the seatMapBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassType }
     *     
     */
    public void setSeatMapBookingClass(BookingClassType value) {
        this.seatMapBookingClass = value;
    }

    public boolean isSetSeatMapBookingClass() {
        return (this.seatMapBookingClass!= null);
    }

}
