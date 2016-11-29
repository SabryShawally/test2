
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds information about GPS coordinates
 * 
 * <p>Java class for PositionCoordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionCoordinatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WGS84Coordinates" type="{http://petra.linkon.se/location/data/v1_5}WGS84CoordinateType" minOccurs="0"/&gt;
 *         &lt;element name="RT90Coordinates" type="{http://petra.linkon.se/location/data/v1_5}RT90CoordinatesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionCoordinatesType", propOrder = {
    "wgs84Coordinates",
    "rt90Coordinates"
})
public class PositionCoordinatesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "WGS84Coordinates")
    protected WGS84CoordinateType wgs84Coordinates;
    @XmlElement(name = "RT90Coordinates")
    protected RT90CoordinatesType rt90Coordinates;

    /**
     * Gets the value of the wgs84Coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link WGS84CoordinateType }
     *     
     */
    public WGS84CoordinateType getWGS84Coordinates() {
        return wgs84Coordinates;
    }

    /**
     * Sets the value of the wgs84Coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link WGS84CoordinateType }
     *     
     */
    public void setWGS84Coordinates(WGS84CoordinateType value) {
        this.wgs84Coordinates = value;
    }

    public boolean isSetWGS84Coordinates() {
        return (this.wgs84Coordinates!= null);
    }

    /**
     * Gets the value of the rt90Coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link RT90CoordinatesType }
     *     
     */
    public RT90CoordinatesType getRT90Coordinates() {
        return rt90Coordinates;
    }

    /**
     * Sets the value of the rt90Coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RT90CoordinatesType }
     *     
     */
    public void setRT90Coordinates(RT90CoordinatesType value) {
        this.rt90Coordinates = value;
    }

    public boolean isSetRT90Coordinates() {
        return (this.rt90Coordinates!= null);
    }

}
