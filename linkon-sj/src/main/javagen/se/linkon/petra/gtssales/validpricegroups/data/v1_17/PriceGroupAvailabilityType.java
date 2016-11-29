
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat and fare availability for the pricegroup.
 * 			
 * 
 * <p>Java class for PriceGroupAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareAvailability" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}FareAvailabilityType" minOccurs="0"/&gt;
 *         &lt;element name="SeatAvailability" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}SeatAvailabilityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupAvailabilityType", propOrder = {
    "fareAvailability",
    "seatAvailability"
})
public class PriceGroupAvailabilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FareAvailability")
    protected FareAvailabilityType fareAvailability;
    @XmlElement(name = "SeatAvailability")
    protected SeatAvailabilityType seatAvailability;

    /**
     * Gets the value of the fareAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link FareAvailabilityType }
     *     
     */
    public FareAvailabilityType getFareAvailability() {
        return fareAvailability;
    }

    /**
     * Sets the value of the fareAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAvailabilityType }
     *     
     */
    public void setFareAvailability(FareAvailabilityType value) {
        this.fareAvailability = value;
    }

    public boolean isSetFareAvailability() {
        return (this.fareAvailability!= null);
    }

    /**
     * Gets the value of the seatAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityType }
     *     
     */
    public SeatAvailabilityType getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * Sets the value of the seatAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityType }
     *     
     */
    public void setSeatAvailability(SeatAvailabilityType value) {
        this.seatAvailability = value;
    }

    public boolean isSetSeatAvailability() {
        return (this.seatAvailability!= null);
    }

}
