
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ItinerarySpecifications" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}ItinerarySpecificationsType"/&gt;
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
    "itinerarySpecifications"
})
@XmlRootElement(name = "GetOptionAvailabilityRequest")
public class GetOptionAvailabilityRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItinerarySpecifications", required = true)
    protected ItinerarySpecificationsType itinerarySpecifications;

    /**
     * Gets the value of the itinerarySpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySpecificationsType }
     *     
     */
    public ItinerarySpecificationsType getItinerarySpecifications() {
        return itinerarySpecifications;
    }

    /**
     * Sets the value of the itinerarySpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySpecificationsType }
     *     
     */
    public void setItinerarySpecifications(ItinerarySpecificationsType value) {
        this.itinerarySpecifications = value;
    }

    public boolean isSetItinerarySpecifications() {
        return (this.itinerarySpecifications!= null);
    }

}
