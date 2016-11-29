
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for LocationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="LocationQueryField"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnLocationZones" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="ExistsInTimetable" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="OnlyGpsLocations" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="OnlySpecificExternalSystems" type="{http://petra.linkon.se/location/data/v1_5}OnlySpecificExternalSystemsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationQueryType", propOrder = {
    "producerCode",
    "locationQueryField",
    "returnLocationZones",
    "existsInTimetable",
    "onlyGpsLocations",
    "onlySpecificExternalSystems"
})
public class LocationQueryType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer producerCode;
    @XmlElement(name = "LocationQueryField", required = true)
    protected String locationQueryField;
    @XmlElement(name = "ReturnLocationZones")
    protected EmptyType returnLocationZones;
    @XmlElement(name = "ExistsInTimetable")
    protected EmptyType existsInTimetable;
    @XmlElement(name = "OnlyGpsLocations")
    protected EmptyType onlyGpsLocations;
    @XmlElement(name = "OnlySpecificExternalSystems")
    protected OnlySpecificExternalSystemsType onlySpecificExternalSystems;

    /**
     * Gets the value of the producerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProducerCode(Integer value) {
        this.producerCode = value;
    }

    public boolean isSetProducerCode() {
        return (this.producerCode!= null);
    }

    /**
     * Gets the value of the locationQueryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationQueryField() {
        return locationQueryField;
    }

    /**
     * Sets the value of the locationQueryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationQueryField(String value) {
        this.locationQueryField = value;
    }

    public boolean isSetLocationQueryField() {
        return (this.locationQueryField!= null);
    }

    /**
     * Gets the value of the returnLocationZones property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getReturnLocationZones() {
        return returnLocationZones;
    }

    /**
     * Sets the value of the returnLocationZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setReturnLocationZones(EmptyType value) {
        this.returnLocationZones = value;
    }

    public boolean isSetReturnLocationZones() {
        return (this.returnLocationZones!= null);
    }

    /**
     * Gets the value of the existsInTimetable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getExistsInTimetable() {
        return existsInTimetable;
    }

    /**
     * Sets the value of the existsInTimetable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setExistsInTimetable(EmptyType value) {
        this.existsInTimetable = value;
    }

    public boolean isSetExistsInTimetable() {
        return (this.existsInTimetable!= null);
    }

    /**
     * Gets the value of the onlyGpsLocations property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getOnlyGpsLocations() {
        return onlyGpsLocations;
    }

    /**
     * Sets the value of the onlyGpsLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setOnlyGpsLocations(EmptyType value) {
        this.onlyGpsLocations = value;
    }

    public boolean isSetOnlyGpsLocations() {
        return (this.onlyGpsLocations!= null);
    }

    /**
     * Gets the value of the onlySpecificExternalSystems property.
     * 
     * @return
     *     possible object is
     *     {@link OnlySpecificExternalSystemsType }
     *     
     */
    public OnlySpecificExternalSystemsType getOnlySpecificExternalSystems() {
        return onlySpecificExternalSystems;
    }

    /**
     * Sets the value of the onlySpecificExternalSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlySpecificExternalSystemsType }
     *     
     */
    public void setOnlySpecificExternalSystems(OnlySpecificExternalSystemsType value) {
        this.onlySpecificExternalSystems = value;
    }

    public boolean isSetOnlySpecificExternalSystems() {
        return (this.onlySpecificExternalSystems!= null);
    }

}
