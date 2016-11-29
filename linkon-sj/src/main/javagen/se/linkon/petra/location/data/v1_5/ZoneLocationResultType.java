
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneLocationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneLocationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}ZoneLocation"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}LocationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneLocationResultType", propOrder = {
    "zoneLocation",
    "locationList"
})
public class ZoneLocationResultType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ZoneLocation", required = true)
    protected ZoneLocationType zoneLocation;
    @XmlElement(name = "LocationList")
    protected LocationListType locationList;

    /**
     * Gets the value of the zoneLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneLocationType }
     *     
     */
    public ZoneLocationType getZoneLocation() {
        return zoneLocation;
    }

    /**
     * Sets the value of the zoneLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneLocationType }
     *     
     */
    public void setZoneLocation(ZoneLocationType value) {
        this.zoneLocation = value;
    }

    public boolean isSetZoneLocation() {
        return (this.zoneLocation!= null);
    }

    /**
     * Gets the value of the locationList property.
     * 
     * @return
     *     possible object is
     *     {@link LocationListType }
     *     
     */
    public LocationListType getLocationList() {
        return locationList;
    }

    /**
     * Sets the value of the locationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationListType }
     *     
     */
    public void setLocationList(LocationListType value) {
        this.locationList = value;
    }

    public boolean isSetLocationList() {
        return (this.locationList!= null);
    }

}
