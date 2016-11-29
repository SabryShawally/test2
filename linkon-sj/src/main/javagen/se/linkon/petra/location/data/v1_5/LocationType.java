
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ZoneLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ZoneLocationProducer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LocationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}IATACode" minOccurs="0"/&gt;
 *         &lt;element name="PositionCoordinates" type="{http://petra.linkon.se/location/data/v1_5}PositionCoordinatesType" minOccurs="0"/&gt;
 *         &lt;element name="LocationZones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://petra.linkon.se/location/data/v1_5}LocationZone" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "zoneLocation",
    "zoneLocationProducer",
    "locationCode",
    "iataCode",
    "positionCoordinates",
    "locationZones"
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
    @XmlElement(name = "ZoneLocation")
    protected Integer zoneLocation;
    @XmlElement(name = "ZoneLocationProducer")
    protected Integer zoneLocationProducer;
    @XmlElement(name = "LocationCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String locationCode;
    @XmlElement(name = "IATACode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String iataCode;
    @XmlElement(name = "PositionCoordinates")
    protected PositionCoordinatesType positionCoordinates;
    @XmlElement(name = "LocationZones")
    protected LocationType.LocationZones locationZones;

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

    /**
     * Gets the value of the locationName property.
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
     * Gets the value of the zoneLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoneLocation() {
        return zoneLocation;
    }

    /**
     * Sets the value of the zoneLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoneLocation(Integer value) {
        this.zoneLocation = value;
    }

    public boolean isSetZoneLocation() {
        return (this.zoneLocation!= null);
    }

    /**
     * Gets the value of the zoneLocationProducer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoneLocationProducer() {
        return zoneLocationProducer;
    }

    /**
     * Sets the value of the zoneLocationProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoneLocationProducer(Integer value) {
        this.zoneLocationProducer = value;
    }

    public boolean isSetZoneLocationProducer() {
        return (this.zoneLocationProducer!= null);
    }

    /**
     * Location abbreviation.
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

    /**
     * Gets the value of the iataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATACode(String value) {
        this.iataCode = value;
    }

    public boolean isSetIATACode() {
        return (this.iataCode!= null);
    }

    /**
     * Gets the value of the positionCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PositionCoordinatesType }
     *     
     */
    public PositionCoordinatesType getPositionCoordinates() {
        return positionCoordinates;
    }

    /**
     * Sets the value of the positionCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCoordinatesType }
     *     
     */
    public void setPositionCoordinates(PositionCoordinatesType value) {
        this.positionCoordinates = value;
    }

    public boolean isSetPositionCoordinates() {
        return (this.positionCoordinates!= null);
    }

    /**
     * Gets the value of the locationZones property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType.LocationZones }
     *     
     */
    public LocationType.LocationZones getLocationZones() {
        return locationZones;
    }

    /**
     * Sets the value of the locationZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType.LocationZones }
     *     
     */
    public void setLocationZones(LocationType.LocationZones value) {
        this.locationZones = value;
    }

    public boolean isSetLocationZones() {
        return (this.locationZones!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}LocationZone" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locationZone"
    })
    public static class LocationZones
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "LocationZone", required = true)
        protected List<LocationZoneType> locationZone;

        /**
         * Gets the value of the locationZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationZoneType }
         * 
         * 
         */
        public List<LocationZoneType> getLocationZone() {
            if (locationZone == null) {
                locationZone = new ArrayList<LocationZoneType>();
            }
            return this.locationZone;
        }

        public boolean isSetLocationZone() {
            return ((this.locationZone!= null)&&(!this.locationZone.isEmpty()));
        }

        public void unsetLocationZone() {
            this.locationZone = null;
        }

    }

}
