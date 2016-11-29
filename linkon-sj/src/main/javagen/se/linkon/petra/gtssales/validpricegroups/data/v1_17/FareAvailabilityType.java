
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.FareTypeType;


/**
 * Type and availability for the travel. This
 * 				structure represents a ticket type without a seat.
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}FareType"/&gt;
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
    "fareType",
    "fareAvailability"
})
public class FareAvailabilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FareType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected FareTypeType fareType;
    @XmlElement(name = "FareAvailability", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int fareAvailability;

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeType }
     *     
     */
    public FareTypeType getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeType }
     *     
     */
    public void setFareType(FareTypeType value) {
        this.fareType = value;
    }

    public boolean isSetFareType() {
        return (this.fareType!= null);
    }

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
