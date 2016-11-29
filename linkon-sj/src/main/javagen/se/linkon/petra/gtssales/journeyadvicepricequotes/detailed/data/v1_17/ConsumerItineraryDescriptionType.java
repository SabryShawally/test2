
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.DiscountDescriptionType;


/**
 * Describes the properties of the consumer(s) required to obtain the price of this sales category. 
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
 *         &lt;element name="ConsumerDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ConsumerDescriptionsType"/&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *         &lt;element name="DiscountDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}DiscountDescriptionType" minOccurs="0"/&gt;
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
    "price",
    "discountDescription"
})
public class ConsumerItineraryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerDescriptions", required = true)
    protected ConsumerDescriptionsType consumerDescriptions;
    @XmlElement(name = "Price")
    protected Money price;
    @XmlElement(name = "DiscountDescription")
    protected DiscountDescriptionType discountDescription;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
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

}
