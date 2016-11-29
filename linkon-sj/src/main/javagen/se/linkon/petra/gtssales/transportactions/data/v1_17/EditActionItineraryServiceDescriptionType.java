
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.ConsumerDescriptionsType;


/**
 * Describes an itinerary service with pricegroups and optionally fare availability, seat availability and prices.
 * Consists of a ConsumerDescriptions containing travelers and an ItineraryPriceDescription wrapping pricegroup/journey information.
 * 
 * <p>Java class for EditActionItineraryServiceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionItineraryServiceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ConsumerDescriptionsType"/&gt;
 *         &lt;element name="EditActionItineraryDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionItineraryDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionItineraryServiceDescriptionType", propOrder = {
    "consumerDescriptions",
    "editActionItineraryDescription"
})
public class EditActionItineraryServiceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerDescriptions", required = true)
    protected ConsumerDescriptionsType consumerDescriptions;
    @XmlElement(name = "EditActionItineraryDescription", required = true)
    protected EditActionItineraryDescriptionType editActionItineraryDescription;

    /**
     * Gets the value of the consumerDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerDescriptionsType }
     *     
     */
    public ConsumerDescriptionsType getConsumerDescriptions() {
        return consumerDescriptions;
    }

    /**
     * Sets the value of the consumerDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerDescriptionsType }
     *     
     */
    public void setConsumerDescriptions(ConsumerDescriptionsType value) {
        this.consumerDescriptions = value;
    }

    public boolean isSetConsumerDescriptions() {
        return (this.consumerDescriptions!= null);
    }

    /**
     * Gets the value of the editActionItineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionItineraryDescriptionType }
     *     
     */
    public EditActionItineraryDescriptionType getEditActionItineraryDescription() {
        return editActionItineraryDescription;
    }

    /**
     * Sets the value of the editActionItineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionItineraryDescriptionType }
     *     
     */
    public void setEditActionItineraryDescription(EditActionItineraryDescriptionType value) {
        this.editActionItineraryDescription = value;
    }

    public boolean isSetEditActionItineraryDescription() {
        return (this.editActionItineraryDescription!= null);
    }

}
