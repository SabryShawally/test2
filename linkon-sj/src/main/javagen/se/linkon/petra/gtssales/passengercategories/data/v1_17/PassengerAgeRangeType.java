
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A valid age range for a passengerCategory
 * 
 * <p>Java class for PassengerAgeRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerAgeRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerAgeFrom" type="{http://petra.linkon.se/commonelements/data/v4_6}PassengerAgeType"/&gt;
 *         &lt;element name="PassengerAgeTo" type="{http://petra.linkon.se/commonelements/data/v4_6}PassengerAgeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAgeRangeType", propOrder = {
    "passengerAgeFrom",
    "passengerAgeTo"
})
public class PassengerAgeRangeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerAgeFrom")
    protected int passengerAgeFrom;
    @XmlElement(name = "PassengerAgeTo")
    protected int passengerAgeTo;

    /**
     * Gets the value of the passengerAgeFrom property.
     * 
     */
    public int getPassengerAgeFrom() {
        return passengerAgeFrom;
    }

    /**
     * Sets the value of the passengerAgeFrom property.
     * 
     */
    public void setPassengerAgeFrom(int value) {
        this.passengerAgeFrom = value;
    }

    public boolean isSetPassengerAgeFrom() {
        return true;
    }

    /**
     * Gets the value of the passengerAgeTo property.
     * 
     */
    public int getPassengerAgeTo() {
        return passengerAgeTo;
    }

    /**
     * Sets the value of the passengerAgeTo property.
     * 
     */
    public void setPassengerAgeTo(int value) {
        this.passengerAgeTo = value;
    }

    public boolean isSetPassengerAgeTo() {
        return true;
    }

}
