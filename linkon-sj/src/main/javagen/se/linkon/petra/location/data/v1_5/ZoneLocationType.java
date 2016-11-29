
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneLocationType", propOrder = {
    "producerCode",
    "locationId"
})
public class ZoneLocationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int producerCode;
    @XmlElement(name = "LocationId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int locationId;

    /**
     * Gets the value of the producerCode property.
     * 
     */
    public int getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     */
    public void setProducerCode(int value) {
        this.producerCode = value;
    }

    public boolean isSetProducerCode() {
        return true;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    public boolean isSetLocationId() {
        return true;
    }

}
