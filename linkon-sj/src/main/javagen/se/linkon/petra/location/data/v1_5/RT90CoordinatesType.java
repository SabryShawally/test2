
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * GPS coorditates (X and Y) following the RT90 standard.
 * 
 * <p>Java class for RT90CoordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RT90CoordinatesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XCoordinate" type="{http://petra.linkon.se/location/data/v1_5}RT90CoordinateType" minOccurs="0"/&gt;
 *         &lt;element name="YCoordinate" type="{http://petra.linkon.se/location/data/v1_5}RT90CoordinateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RT90CoordinatesType", propOrder = {
    "xCoordinate",
    "yCoordinate"
})
public class RT90CoordinatesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "XCoordinate")
    protected Integer xCoordinate;
    @XmlElement(name = "YCoordinate")
    protected Integer yCoordinate;

    /**
     * Gets the value of the xCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXCoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the value of the xCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXCoordinate(Integer value) {
        this.xCoordinate = value;
    }

    public boolean isSetXCoordinate() {
        return (this.xCoordinate!= null);
    }

    /**
     * Gets the value of the yCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the value of the yCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYCoordinate(Integer value) {
        this.yCoordinate = value;
    }

    public boolean isSetYCoordinate() {
        return (this.yCoordinate!= null);
    }

}
