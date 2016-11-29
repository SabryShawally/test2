
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.PriceSectionTotalType;


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
 *         &lt;element name="DetailedPriceQuoteDescriptions" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}DetailedPriceQuoteDescriptionsType"/&gt;
 *         &lt;element name="TotalPriceDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionTotalType"/&gt;
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
    "detailedPriceQuoteDescriptions",
    "totalPriceDescription"
})
@XmlRootElement(name = "DetailedItineraryPriceQuoteResponse")
public class DetailedItineraryPriceQuoteResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DetailedPriceQuoteDescriptions", required = true)
    protected DetailedPriceQuoteDescriptionsType detailedPriceQuoteDescriptions;
    @XmlElement(name = "TotalPriceDescription", required = true)
    protected PriceSectionTotalType totalPriceDescription;

    /**
     * Gets the value of the detailedPriceQuoteDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPriceQuoteDescriptionsType }
     *     
     */
    public DetailedPriceQuoteDescriptionsType getDetailedPriceQuoteDescriptions() {
        return detailedPriceQuoteDescriptions;
    }

    /**
     * Sets the value of the detailedPriceQuoteDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPriceQuoteDescriptionsType }
     *     
     */
    public void setDetailedPriceQuoteDescriptions(DetailedPriceQuoteDescriptionsType value) {
        this.detailedPriceQuoteDescriptions = value;
    }

    public boolean isSetDetailedPriceQuoteDescriptions() {
        return (this.detailedPriceQuoteDescriptions!= null);
    }

    /**
     * Gets the value of the totalPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSectionTotalType }
     *     
     */
    public PriceSectionTotalType getTotalPriceDescription() {
        return totalPriceDescription;
    }

    /**
     * Sets the value of the totalPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSectionTotalType }
     *     
     */
    public void setTotalPriceDescription(PriceSectionTotalType value) {
        this.totalPriceDescription = value;
    }

    public boolean isSetTotalPriceDescription() {
        return (this.totalPriceDescription!= null);
    }

}
