
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a journey advice, its available sales categories and, at least, basic consumer and itinerary properties required to perform a booking at this point.
 * 
 * <p>Java class for JourneyAdviceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyAdviceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="SalesCategoryDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}SalesCategoryDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyAdviceDescriptionType", propOrder = {
    "journeyConnectionReference",
    "salesCategoryDescriptions"
})
public class JourneyAdviceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "SalesCategoryDescriptions", required = true)
    protected SalesCategoryDescriptionsType salesCategoryDescriptions;

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
     * Gets the value of the salesCategoryDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryDescriptionsType }
     *     
     */
    public SalesCategoryDescriptionsType getSalesCategoryDescriptions() {
        return salesCategoryDescriptions;
    }

    /**
     * Sets the value of the salesCategoryDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryDescriptionsType }
     *     
     */
    public void setSalesCategoryDescriptions(SalesCategoryDescriptionsType value) {
        this.salesCategoryDescriptions = value;
    }

    public boolean isSetSalesCategoryDescriptions() {
        return (this.salesCategoryDescriptions!= null);
    }

}
