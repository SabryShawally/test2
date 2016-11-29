
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the base price for the service. A base
 * 				price consists of the
 * 				price itself (price section) and a separate
 * 				price description.
 * 			
 * 
 * <p>Java class for BasePriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasePriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceQuoteState" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceQuoteStateType" minOccurs="0"/&gt;
 *         &lt;element name="PriceSection" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionType"/&gt;
 *         &lt;element name="SeparatePriceDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}SeparatePriceDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePriceDescriptionType", propOrder = {
    "priceQuoteState",
    "priceSection",
    "separatePriceDescriptions"
})
public class BasePriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceQuoteState")
    protected String priceQuoteState;
    @XmlElement(name = "PriceSection", required = true)
    protected PriceSectionType priceSection;
    @XmlElement(name = "SeparatePriceDescriptions")
    protected SeparatePriceDescriptionsType separatePriceDescriptions;

    /**
     * Gets the value of the priceQuoteState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteState() {
        return priceQuoteState;
    }

    /**
     * Sets the value of the priceQuoteState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteState(String value) {
        this.priceQuoteState = value;
    }

    public boolean isSetPriceQuoteState() {
        return (this.priceQuoteState!= null);
    }

    /**
     * Gets the value of the priceSection property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSectionType }
     *     
     */
    public PriceSectionType getPriceSection() {
        return priceSection;
    }

    /**
     * Sets the value of the priceSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSectionType }
     *     
     */
    public void setPriceSection(PriceSectionType value) {
        this.priceSection = value;
    }

    public boolean isSetPriceSection() {
        return (this.priceSection!= null);
    }

    /**
     * Gets the value of the separatePriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SeparatePriceDescriptionsType }
     *     
     */
    public SeparatePriceDescriptionsType getSeparatePriceDescriptions() {
        return separatePriceDescriptions;
    }

    /**
     * Sets the value of the separatePriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparatePriceDescriptionsType }
     *     
     */
    public void setSeparatePriceDescriptions(SeparatePriceDescriptionsType value) {
        this.separatePriceDescriptions = value;
    }

    public boolean isSetSeparatePriceDescriptions() {
        return (this.separatePriceDescriptions!= null);
    }

}
