
package se.linkon.petra.gtssales.seatavailability.detail.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PlacementCharacteristicsType;


/**
 * Description of placement characteristics and availability.
 * 
 * <p>Java class for PlacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementCharacteristics"/&gt;
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
@XmlType(name = "PlacementType", propOrder = {
    "placementCharacteristics",
    "seatAvailability"
})
public class PlacementType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementCharacteristics", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PlacementCharacteristicsType placementCharacteristics;
    @XmlElement(name = "SeatAvailability", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int seatAvailability;

    /**
     * Gets the value of the placementCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementCharacteristicsType }
     *     
     */
    public PlacementCharacteristicsType getPlacementCharacteristics() {
        return placementCharacteristics;
    }

    /**
     * Sets the value of the placementCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementCharacteristicsType }
     *     
     */
    public void setPlacementCharacteristics(PlacementCharacteristicsType value) {
        this.placementCharacteristics = value;
    }

    public boolean isSetPlacementCharacteristics() {
        return (this.placementCharacteristics!= null);
    }

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
