
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare type and availability for the itinerary.
 * 			
 * 
 * <p>Java class for FareAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}FareAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareAvailabilityType", propOrder = {
    "fareAvailability"
})
public class FareAvailabilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FareAvailability", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int fareAvailability;

    /**
     * Gets the value of the fareAvailability property.
     * 
     */
    public int getFareAvailability() {
        return fareAvailability;
    }

    /**
     * Sets the value of the fareAvailability property.
     * 
     */
    public void setFareAvailability(int value) {
        this.fareAvailability = value;
    }

    public boolean isSetFareAvailability() {
        return true;
    }

}
