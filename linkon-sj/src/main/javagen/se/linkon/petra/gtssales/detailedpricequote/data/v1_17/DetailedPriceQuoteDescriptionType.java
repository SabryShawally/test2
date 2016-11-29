
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.ConsumerDescriptionsType;


/**
 * <p>Java class for DetailedPriceQuoteDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPriceQuoteDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ConsumerDescriptionsType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="ItineraryPriceDescription" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}ItineraryPriceDescriptionType"/&gt;
 *         &lt;element name="PriceQuoteRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPriceQuoteDescriptionType", propOrder = {
    "consumerDescriptions",
    "journeyConnectionReference",
    "itineraryPriceDescription",
    "priceQuoteRule"
})
public class DetailedPriceQuoteDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerDescriptions", required = true)
    protected ConsumerDescriptionsType consumerDescriptions;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "ItineraryPriceDescription", required = true)
    protected ItineraryPriceDescriptionType itineraryPriceDescription;
    @XmlElement(name = "PriceQuoteRule")
    protected String priceQuoteRule;

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
     * Gets the value of the itineraryPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryPriceDescriptionType }
     *     
     */
    public ItineraryPriceDescriptionType getItineraryPriceDescription() {
        return itineraryPriceDescription;
    }

    /**
     * Sets the value of the itineraryPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryPriceDescriptionType }
     *     
     */
    public void setItineraryPriceDescription(ItineraryPriceDescriptionType value) {
        this.itineraryPriceDescription = value;
    }

    public boolean isSetItineraryPriceDescription() {
        return (this.itineraryPriceDescription!= null);
    }

    /**
     * Gets the value of the priceQuoteRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteRule() {
        return priceQuoteRule;
    }

    /**
     * Sets the value of the priceQuoteRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteRule(String value) {
        this.priceQuoteRule = value;
    }

    public boolean isSetPriceQuoteRule() {
        return (this.priceQuoteRule!= null);
    }

}
