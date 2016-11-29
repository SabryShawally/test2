
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryServiceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryServiceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="ItinerarySpecification" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}ItinerarySpecificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryServiceSpecificationType", propOrder = {
    "journeyConnectionReference",
    "itinerarySpecification"
})
public class ItineraryServiceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "ItinerarySpecification", required = true)
    protected ItinerarySpecificationType itinerarySpecification;

    /**
     * Gets the value of the journeyConnectionReference property.
     * 
     */
    public int getJourneyConnectionReference() {
        return journeyConnectionReference;
    }

    /**
     * Sets the value of the journeyConnectionReference property.
     * 
     */
    public void setJourneyConnectionReference(int value) {
        this.journeyConnectionReference = value;
    }

    public boolean isSetJourneyConnectionReference() {
        return true;
    }

    /**
     * Gets the value of the itinerarySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySpecificationType }
     *     
     */
    public ItinerarySpecificationType getItinerarySpecification() {
        return itinerarySpecification;
    }

    /**
     * Sets the value of the itinerarySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySpecificationType }
     *     
     */
    public void setItinerarySpecification(ItinerarySpecificationType value) {
        this.itinerarySpecification = value;
    }

    public boolean isSetItinerarySpecification() {
        return (this.itinerarySpecification!= null);
    }

}
