
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a certian route between departurelocation and arrivallocation. Travel routes can be found in the operation findInternationalTravelRoutes in the Service GtsTransport.
 * 
 * <p>Java class for TravelRouteSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelRouteSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelRoute" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SerialNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelRouteSpecificationType", propOrder = {
    "travelRoute",
    "serialNumber"
})
public class TravelRouteSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelRoute", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String travelRoute;
    @XmlElement(name = "SerialNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer serialNumber;

    /**
     * Identifies a certian route between departurelocation and arrivallocation. Travel routes can be found in the operation findInternationalTravelRoutes in the Service GtsTransport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelRoute() {
        return travelRoute;
    }

    /**
     * Sets the value of the travelRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelRoute(String value) {
        this.travelRoute = value;
    }

    public boolean isSetTravelRoute() {
        return (this.travelRoute!= null);
    }

    /**
     * The identity of the segment of an international travel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerialNumber(Integer value) {
        this.serialNumber = value;
    }

    public boolean isSetSerialNumber() {
        return (this.serialNumber!= null);
    }

}
