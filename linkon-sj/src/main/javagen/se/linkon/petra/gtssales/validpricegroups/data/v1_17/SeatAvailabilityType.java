
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SeatAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAvailabilityType", propOrder = {
    "seatAvailability"
})
public class SeatAvailabilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SeatAvailability", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int seatAvailability;

    /**
     * Gets the value of the seatAvailability property.
     * 
     */
    public int getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * Sets the value of the seatAvailability property.
     * 
     */
    public void setSeatAvailability(int value) {
        this.seatAvailability = value;
    }

    public boolean isSetSeatAvailability() {
        return true;
    }

}
