
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationNameShort"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationCode" minOccurs="0"/&gt;
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
    "locationNameShort",
    "locationName",
    "locationCode"
})
public class LocationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int producerCode;
    @XmlElement(name = "LocationId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int locationId;
    @XmlElement(name = "LocationNameShort", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String locationNameShort;
    @XmlElement(name = "LocationName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String locationName;
    @XmlElement(name = "LocationCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String locationCode;

    /**
     * Producer for the Location.
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
     * A unique identifier for the Location together with the producer code.
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
     * The plaintext name for the Location.
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

    /**
     * An alternate and longer plaintext name for the Location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    public boolean isSetLocationName() {
        return (this.locationName!= null);
    }

    /**
     * A coded abbreviation of the name, for example "CST" for Stockholm C.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    public boolean isSetLocationCode() {
        return (this.locationCode!= null);
    }

}
