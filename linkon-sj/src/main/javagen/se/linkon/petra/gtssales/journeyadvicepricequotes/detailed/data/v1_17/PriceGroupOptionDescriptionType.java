
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;


/**
 * Describes, for a given pricegroup, the options and placement choices/prices.
 * 
 * <p>Java class for PriceGroupOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="ConsumerOptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ConsumerOptionDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupOptionDescriptionType", propOrder = {
    "priceGroupCode",
    "consumerOptionDescriptions"
})
public class PriceGroupOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "ConsumerOptionDescriptions", required = true)
    protected ConsumerOptionDescriptionsType consumerOptionDescriptions;

    /**
     * Gets the value of the priceGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public PriceGroupCodeType getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Sets the value of the priceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public void setPriceGroupCode(PriceGroupCodeType value) {
        this.priceGroupCode = value;
    }

    public boolean isSetPriceGroupCode() {
        return (this.priceGroupCode!= null);
    }

    /**
     * Gets the value of the consumerOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerOptionDescriptionsType }
     *     
     */
    public ConsumerOptionDescriptionsType getConsumerOptionDescriptions() {
        return consumerOptionDescriptions;
    }

    /**
     * Sets the value of the consumerOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerOptionDescriptionsType }
     *     
     */
    public void setConsumerOptionDescriptions(ConsumerOptionDescriptionsType value) {
        this.consumerOptionDescriptions = value;
    }

    public boolean isSetConsumerOptionDescriptions() {
        return (this.consumerOptionDescriptions!= null);
    }

}
