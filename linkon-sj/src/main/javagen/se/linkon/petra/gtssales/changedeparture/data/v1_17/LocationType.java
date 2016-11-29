
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * LocationType which includes location name.
 * 			
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationNameShort" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "producerCode",
    "locationId",
    "locationNameShort"
})
public class LocationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int producerCode;
    @XmlElement(name = "LocationId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int locationId;
    @XmlElement(name = "LocationNameShort", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String locationNameShort;

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

    /**
     * Gets the value of the locationNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNameShort() {
        return locationNameShort;
    }

    /**
     * Sets the value of the locationNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNameShort(String value) {
        this.locationNameShort = value;
    }

    public boolean isSetLocationNameShort() {
        return (this.locationNameShort!= null);
    }

}
