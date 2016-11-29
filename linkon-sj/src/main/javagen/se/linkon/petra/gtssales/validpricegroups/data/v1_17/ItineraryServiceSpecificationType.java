
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.GroupSpecificationType;


/**
 * Specifies an itinerary service that we wish to
 * 				query for pricegroups and optionally fareavailability,
 * 				seatavailability and prices.
 * 				Consists of a ConsumerSpecifications containing travellers and an
 * 				ItineraryPriceSpecification wrapping journey information.
 * 			
 * 
 * <p>Java class for ItineraryServiceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryServiceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerSpecifications" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ConsumerSpecificationsType" minOccurs="0"/&gt;
 *         &lt;element name="GroupSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}GroupSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryPriceSpecification" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryPriceSpecificationType"/&gt;
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
    "consumerSpecifications",
    "groupSpecification",
    "itineraryPriceSpecification"
})
public class ItineraryServiceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerSpecifications")
    protected ConsumerSpecificationsType consumerSpecifications;
    @XmlElement(name = "GroupSpecification")
    protected GroupSpecificationType groupSpecification;
    @XmlElement(name = "ItineraryPriceSpecification", required = true)
    protected ItineraryPriceSpecificationType itineraryPriceSpecification;

    /**
     * Gets the value of the consumerSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public ConsumerSpecificationsType getConsumerSpecifications() {
        return consumerSpecifications;
    }

    /**
     * Sets the value of the consumerSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public void setConsumerSpecifications(ConsumerSpecificationsType value) {
        this.consumerSpecifications = value;
    }

    public boolean isSetConsumerSpecifications() {
        return (this.consumerSpecifications!= null);
    }

    /**
     * Gets the value of the groupSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link GroupSpecificationType }
     *     
     */
    public GroupSpecificationType getGroupSpecification() {
        return groupSpecification;
    }

    /**
     * Sets the value of the groupSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSpecificationType }
     *     
     */
    public void setGroupSpecification(GroupSpecificationType value) {
        this.groupSpecification = value;
    }

    public boolean isSetGroupSpecification() {
        return (this.groupSpecification!= null);
    }

    /**
     * Gets the value of the itineraryPriceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryPriceSpecificationType }
     *     
     */
    public ItineraryPriceSpecificationType getItineraryPriceSpecification() {
        return itineraryPriceSpecification;
    }

    /**
     * Sets the value of the itineraryPriceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryPriceSpecificationType }
     *     
     */
    public void setItineraryPriceSpecification(ItineraryPriceSpecificationType value) {
        this.itineraryPriceSpecification = value;
    }

    public boolean isSetItineraryPriceSpecification() {
        return (this.itineraryPriceSpecification!= null);
    }

}
