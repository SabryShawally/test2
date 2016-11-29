
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocationZoneId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationZoneType", propOrder = {
    "externalSystem",
    "locationZoneId"
})
public class LocationZoneType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ExternalSystem", required = true)
    protected String externalSystem;
    @XmlElement(name = "LocationZoneId", required = true)
    protected String locationZoneId;

    /**
     * Gets the value of the externalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystem() {
        return externalSystem;
    }

    /**
     * Sets the value of the externalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystem(String value) {
        this.externalSystem = value;
    }

    public boolean isSetExternalSystem() {
        return (this.externalSystem!= null);
    }

    /**
     * Gets the value of the locationZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationZoneId() {
        return locationZoneId;
    }

    /**
     * Sets the value of the locationZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationZoneId(String value) {
        this.locationZoneId = value;
    }

    public boolean isSetLocationZoneId() {
        return (this.locationZoneId!= null);
    }

}
