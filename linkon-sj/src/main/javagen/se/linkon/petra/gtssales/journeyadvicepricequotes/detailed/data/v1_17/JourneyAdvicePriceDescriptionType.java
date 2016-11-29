
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.ConsumerPriceDescriptionsType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.TotalPlacementPriceDescriptionType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.TotalPriceDescriptionType;


/**
 * <p>Java class for JourneyAdvicePriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyAdvicePriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}TotalPriceDescriptionType"/&gt;
 *         &lt;element name="TotalPlacementPriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}TotalPlacementPriceDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerPriceDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}ConsumerPriceDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="IncludesContractualPrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="IncludesDiscount" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="IncludesPromotion" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="SalesCategoryDeviationsExist" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryPriceGroupChoices" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ItineraryPriceGroupChoicesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyAdvicePriceDescriptionType", propOrder = {
    "totalPriceDescription",
    "totalPlacementPriceDescription",
    "consumerPriceDescriptions",
    "includesContractualPrice",
    "includesDiscount",
    "includesPromotion",
    "salesCategoryDeviationsExist",
    "itineraryPriceGroupChoices"
})
public class JourneyAdvicePriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TotalPriceDescription", required = true)
    protected TotalPriceDescriptionType totalPriceDescription;
    @XmlElement(name = "TotalPlacementPriceDescription")
    protected TotalPlacementPriceDescriptionType totalPlacementPriceDescription;
    @XmlElement(name = "ConsumerPriceDescriptions")
    protected ConsumerPriceDescriptionsType consumerPriceDescriptions;
    @XmlElement(name = "IncludesContractualPrice")
    protected EmptyType includesContractualPrice;
    @XmlElement(name = "IncludesDiscount")
    protected EmptyType includesDiscount;
    @XmlElement(name = "IncludesPromotion")
    protected EmptyType includesPromotion;
    @XmlElement(name = "SalesCategoryDeviationsExist")
    protected EmptyType salesCategoryDeviationsExist;
    @XmlElement(name = "ItineraryPriceGroupChoices", required = true)
    protected ItineraryPriceGroupChoicesType itineraryPriceGroupChoices;

    /**
     * Gets the value of the totalPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceDescriptionType }
     *     
     */
    public TotalPriceDescriptionType getTotalPriceDescription() {
        return totalPriceDescription;
    }

    /**
     * Sets the value of the totalPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceDescriptionType }
     *     
     */
    public void setTotalPriceDescription(TotalPriceDescriptionType value) {
        this.totalPriceDescription = value;
    }

    public boolean isSetTotalPriceDescription() {
        return (this.totalPriceDescription!= null);
    }

    /**
     * Gets the value of the totalPlacementPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPlacementPriceDescriptionType }
     *     
     */
    public TotalPlacementPriceDescriptionType getTotalPlacementPriceDescription() {
        return totalPlacementPriceDescription;
    }

    /**
     * Sets the value of the totalPlacementPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPlacementPriceDescriptionType }
     *     
     */
    public void setTotalPlacementPriceDescription(TotalPlacementPriceDescriptionType value) {
        this.totalPlacementPriceDescription = value;
    }

    public boolean isSetTotalPlacementPriceDescription() {
        return (this.totalPlacementPriceDescription!= null);
    }

    /**
     * Gets the value of the consumerPriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerPriceDescriptionsType }
     *     
     */
    public ConsumerPriceDescriptionsType getConsumerPriceDescriptions() {
        return consumerPriceDescriptions;
    }

    /**
     * Sets the value of the consumerPriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerPriceDescriptionsType }
     *     
     */
    public void setConsumerPriceDescriptions(ConsumerPriceDescriptionsType value) {
        this.consumerPriceDescriptions = value;
    }

    public boolean isSetConsumerPriceDescriptions() {
        return (this.consumerPriceDescriptions!= null);
    }

    /**
     * Gets the value of the includesContractualPrice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludesContractualPrice() {
        return includesContractualPrice;
    }

    /**
     * Sets the value of the includesContractualPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludesContractualPrice(EmptyType value) {
        this.includesContractualPrice = value;
    }

    public boolean isSetIncludesContractualPrice() {
        return (this.includesContractualPrice!= null);
    }

    /**
     * Gets the value of the includesDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludesDiscount() {
        return includesDiscount;
    }

    /**
     * Sets the value of the includesDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludesDiscount(EmptyType value) {
        this.includesDiscount = value;
    }

    public boolean isSetIncludesDiscount() {
        return (this.includesDiscount!= null);
    }

    /**
     * Gets the value of the includesPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludesPromotion() {
        return includesPromotion;
    }

    /**
     * Sets the value of the includesPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludesPromotion(EmptyType value) {
        this.includesPromotion = value;
    }

    public boolean isSetIncludesPromotion() {
        return (this.includesPromotion!= null);
    }

    /**
     * Gets the value of the salesCategoryDeviationsExist property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getSalesCategoryDeviationsExist() {
        return salesCategoryDeviationsExist;
    }

    /**
     * Sets the value of the salesCategoryDeviationsExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setSalesCategoryDeviationsExist(EmptyType value) {
        this.salesCategoryDeviationsExist = value;
    }

    public boolean isSetSalesCategoryDeviationsExist() {
        return (this.salesCategoryDeviationsExist!= null);
    }

    /**
     * Gets the value of the itineraryPriceGroupChoices property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryPriceGroupChoicesType }
     *     
     */
    public ItineraryPriceGroupChoicesType getItineraryPriceGroupChoices() {
        return itineraryPriceGroupChoices;
    }

    /**
     * Sets the value of the itineraryPriceGroupChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryPriceGroupChoicesType }
     *     
     */
    public void setItineraryPriceGroupChoices(ItineraryPriceGroupChoicesType value) {
        this.itineraryPriceGroupChoices = value;
    }

    public boolean isSetItineraryPriceGroupChoices() {
        return (this.itineraryPriceGroupChoices!= null);
    }

}
