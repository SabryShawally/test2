
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.ConsumerSpecificationType;


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
 *         &lt;element name="ConsumerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ConsumerSpecificationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="ItinerarySpecifications" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}ItinerarySpecificationsType"/&gt;
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
    "consumerSpecification",
    "journeyConnectionReference",
    "itinerarySpecifications"
})
public class ItineraryServiceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerSpecification", required = true)
    protected ConsumerSpecificationType consumerSpecification;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "ItinerarySpecifications", required = true)
    protected ItinerarySpecificationsType itinerarySpecifications;

    /**
     * Gets the value of the consumerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSpecificationType }
     *     
     */
    public ConsumerSpecificationType getConsumerSpecification() {
        return consumerSpecification;
    }

    /**
     * Sets the value of the consumerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSpecificationType }
     *     
     */
    public void setConsumerSpecification(ConsumerSpecificationType value) {
        this.consumerSpecification = value;
    }

    public boolean isSetConsumerSpecification() {
        return (this.consumerSpecification!= null);
    }

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
