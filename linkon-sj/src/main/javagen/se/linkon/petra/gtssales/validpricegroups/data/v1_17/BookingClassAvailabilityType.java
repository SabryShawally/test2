
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SeatAvailabilityGroupSummaryType;


/**
 * Number of available seats for a specific booking
 * 				class.
 * 
 * <p>Java class for BookingClassAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingClassAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SeatAvailabilityGroupSummary"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SeatAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingClassAvailabilityType", propOrder = {
    "seatAvailabilityGroupSummary",
    "seatAvailability"
})
public class BookingClassAvailabilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SeatAvailabilityGroupSummary", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SeatAvailabilityGroupSummaryType seatAvailabilityGroupSummary;
    @XmlElement(name = "SeatAvailability", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer seatAvailability;

    /**
     * Gets the value of the seatAvailabilityGroupSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityGroupSummaryType }
     *     
     */
    public SeatAvailabilityGroupSummaryType getSeatAvailabilityGroupSummary() {
        return seatAvailabilityGroupSummary;
    }

    /**
     * Sets the value of the seatAvailabilityGroupSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityGroupSummaryType }
     *     
     */
    public void setSeatAvailabilityGroupSummary(SeatAvailabilityGroupSummaryType value) {
        this.seatAvailabilityGroupSummary = value;
    }

    public boolean isSetSeatAvailabilityGroupSummary() {
        return (this.seatAvailabilityGroupSummary!= null);
    }

    /**
     * Gets the value of the seatAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * Sets the value of the seatAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeatAvailability(Integer value) {
        this.seatAvailability = value;
    }

    public boolean isSetSeatAvailability() {
        return (this.seatAvailability!= null);
    }

}
