
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.DiscountDescriptionType;


/**
 * Describes the properties of the consumer required to obtain the price of this sales category. 
 * During booking the client must delegate this information to the booking operation.
 * 
 * <p>Java class for ConsumerItineraryDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerItineraryDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}ConsumerDescriptionsType"/&gt;
 *         &lt;element name="DiscountDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}DiscountDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}RequiredOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerSegmentDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}ConsumerSegmentDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerItineraryDescriptionType", propOrder = {
    "consumerDescriptions",
    "discountDescription",
    "requiredOptions",
    "consumerSegmentDescriptions"
})
public class ConsumerItineraryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerDescriptions", required = true)
    protected ConsumerDescriptionsType consumerDescriptions;
    @XmlElement(name = "DiscountDescription")
    protected DiscountDescriptionType discountDescription;
    @XmlElement(name = "RequiredOptions")
    protected RequiredOptionsType requiredOptions;
    @XmlElement(name = "ConsumerSegmentDescriptions", required = true)
    protected ConsumerSegmentDescriptionsType consumerSegmentDescriptions;

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
     * Gets the value of the discountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountDescriptionType }
     *     
     */
    public DiscountDescriptionType getDiscountDescription() {
        return discountDescription;
    }

    /**
     * Sets the value of the discountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountDescriptionType }
     *     
     */
    public void setDiscountDescription(DiscountDescriptionType value) {
        this.discountDescription = value;
    }

    public boolean isSetDiscountDescription() {
        return (this.discountDescription!= null);
    }

    /**
     * Gets the value of the requiredOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredOptionsType }
     *     
     */
    public RequiredOptionsType getRequiredOptions() {
        return requiredOptions;
    }

    /**
     * Sets the value of the requiredOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredOptionsType }
     *     
     */
    public void setRequiredOptions(RequiredOptionsType value) {
        this.requiredOptions = value;
    }

    public boolean isSetRequiredOptions() {
        return (this.requiredOptions!= null);
    }

    /**
     * Gets the value of the consumerSegmentDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSegmentDescriptionsType }
     *     
     */
    public ConsumerSegmentDescriptionsType getConsumerSegmentDescriptions() {
        return consumerSegmentDescriptions;
    }

    /**
     * Sets the value of the consumerSegmentDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSegmentDescriptionsType }
     *     
     */
    public void setConsumerSegmentDescriptions(ConsumerSegmentDescriptionsType value) {
        this.consumerSegmentDescriptions = value;
    }

    public boolean isSetConsumerSegmentDescriptions() {
        return (this.consumerSegmentDescriptions!= null);
    }

}
