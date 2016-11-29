
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.PriceGroupAvailabilityType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.RebookDescriptionType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.SalesCategoryBookingClassDeviationType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.SalesCategoryFlexibilityDeviationType;


/**
 * Describes the choices required, on a per itinerary level, to obtain the current sales category booking class and flexiblity. 
 * The description also provides extra meta-information helping the client to determine such things as availability and whether or not there are options.
 * 
 * <p>Java class for ItineraryPriceGroupChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPriceGroupChoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}PriceQuoteState" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}KpsBurnCode" minOccurs="0"/&gt;
 *         &lt;element name="FlexibilityComponentNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumberType" minOccurs="0"/&gt;
 *         &lt;element name="FlexibilityVariantNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumberType" minOccurs="0"/&gt;
 *         &lt;element name="SalesCategoryBookingClassDeviation" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SalesCategoryBookingClassDeviationType" minOccurs="0"/&gt;
 *         &lt;element name="SalesCategoryFlexibilityDeviation" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SalesCategoryFlexibilityDeviationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ServiceProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProducerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RebookDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}RebookDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ContractualPrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element name="OptionsExist" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGroupAvailability" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}PriceGroupAvailabilityType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerItineraryDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ConsumerItineraryDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPriceGroupChoiceType", propOrder = {
    "itineraryReference",
    "priceGroupCode",
    "priceQuoteState",
    "kpsBurnCode",
    "flexibilityComponentNumber",
    "flexibilityVariantNumber",
    "salesCategoryBookingClassDeviation",
    "salesCategoryFlexibilityDeviation",
    "serviceProducerCode",
    "serviceProducerName",
    "rebookDescription",
    "contractualPrice",
    "promotionCode",
    "optionsExist",
    "priceGroupAvailability",
    "consumerItineraryDescriptions"
})
public class ItineraryPriceGroupChoiceType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "PriceQuoteState", namespace = "http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17")
    protected String priceQuoteState;
    @XmlElement(name = "KpsBurnCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String kpsBurnCode;
    @XmlElement(name = "FlexibilityComponentNumber")
    protected Integer flexibilityComponentNumber;
    @XmlElement(name = "FlexibilityVariantNumber")
    protected Integer flexibilityVariantNumber;
    @XmlElement(name = "SalesCategoryBookingClassDeviation")
    protected SalesCategoryBookingClassDeviationType salesCategoryBookingClassDeviation;
    @XmlElement(name = "SalesCategoryFlexibilityDeviation")
    protected SalesCategoryFlexibilityDeviationType salesCategoryFlexibilityDeviation;
    @XmlElement(name = "ServiceProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer serviceProducerCode;
    @XmlElement(name = "ServiceProducerName")
    protected String serviceProducerName;
    @XmlElement(name = "RebookDescription")
    protected RebookDescriptionType rebookDescription;
    @XmlElement(name = "ContractualPrice")
    protected EmptyType contractualPrice;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "OptionsExist")
    protected EmptyType optionsExist;
    @XmlElement(name = "PriceGroupAvailability")
    protected PriceGroupAvailabilityType priceGroupAvailability;
    @XmlElement(name = "ConsumerItineraryDescriptions", required = true)
    protected ConsumerItineraryDescriptionsType consumerItineraryDescriptions;

    /**
     * Gets the value of the itineraryReference property.
     * 
     */
    public int getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     */
    public void setItineraryReference(int value) {
        this.itineraryReference = value;
    }

    public boolean isSetItineraryReference() {
        return true;
    }

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
     * Only present when a price quarantee is available.
     * In order to obtain the guarantee the client MUST delegate this value to the booking operation within its validity time.
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
     * When present, Describes the status of KpsBurnCode, on a per itinerary level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpsBurnCode() {
        return kpsBurnCode;
    }

    /**
     * Sets the value of the kpsBurnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpsBurnCode(String value) {
        this.kpsBurnCode = value;
    }

    public boolean isSetKpsBurnCode() {
        return (this.kpsBurnCode!= null);
    }

    /**
     * Gets the value of the flexibilityComponentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlexibilityComponentNumber() {
        return flexibilityComponentNumber;
    }

    /**
     * Sets the value of the flexibilityComponentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlexibilityComponentNumber(Integer value) {
        this.flexibilityComponentNumber = value;
    }

    public boolean isSetFlexibilityComponentNumber() {
        return (this.flexibilityComponentNumber!= null);
    }

    /**
     * Gets the value of the flexibilityVariantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlexibilityVariantNumber() {
        return flexibilityVariantNumber;
    }

    /**
     * Sets the value of the flexibilityVariantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlexibilityVariantNumber(Integer value) {
        this.flexibilityVariantNumber = value;
    }

    public boolean isSetFlexibilityVariantNumber() {
        return (this.flexibilityVariantNumber!= null);
    }

    /**
     * Gets the value of the salesCategoryBookingClassDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryBookingClassDeviationType }
     *     
     */
    public SalesCategoryBookingClassDeviationType getSalesCategoryBookingClassDeviation() {
        return salesCategoryBookingClassDeviation;
    }

    /**
     * Sets the value of the salesCategoryBookingClassDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryBookingClassDeviationType }
     *     
     */
    public void setSalesCategoryBookingClassDeviation(SalesCategoryBookingClassDeviationType value) {
        this.salesCategoryBookingClassDeviation = value;
    }

    public boolean isSetSalesCategoryBookingClassDeviation() {
        return (this.salesCategoryBookingClassDeviation!= null);
    }

    /**
     * Gets the value of the salesCategoryFlexibilityDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryFlexibilityDeviationType }
     *     
     */
    public SalesCategoryFlexibilityDeviationType getSalesCategoryFlexibilityDeviation() {
        return salesCategoryFlexibilityDeviation;
    }

    /**
     * Sets the value of the salesCategoryFlexibilityDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryFlexibilityDeviationType }
     *     
     */
    public void setSalesCategoryFlexibilityDeviation(SalesCategoryFlexibilityDeviationType value) {
        this.salesCategoryFlexibilityDeviation = value;
    }

    public boolean isSetSalesCategoryFlexibilityDeviation() {
        return (this.salesCategoryFlexibilityDeviation!= null);
    }

    /**
     * Gets the value of the serviceProducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceProducerCode() {
        return serviceProducerCode;
    }

    /**
     * Sets the value of the serviceProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceProducerCode(Integer value) {
        this.serviceProducerCode = value;
    }

    public boolean isSetServiceProducerCode() {
        return (this.serviceProducerCode!= null);
    }

    /**
     * Gets the value of the serviceProducerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProducerName() {
        return serviceProducerName;
    }

    /**
     * Sets the value of the serviceProducerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProducerName(String value) {
        this.serviceProducerName = value;
    }

    public boolean isSetServiceProducerName() {
        return (this.serviceProducerName!= null);
    }

    /**
     * Gets the value of the rebookDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RebookDescriptionType }
     *     
     */
    public RebookDescriptionType getRebookDescription() {
        return rebookDescription;
    }

    /**
     * Sets the value of the rebookDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebookDescriptionType }
     *     
     */
    public void setRebookDescription(RebookDescriptionType value) {
        this.rebookDescription = value;
    }

    public boolean isSetRebookDescription() {
        return (this.rebookDescription!= null);
    }

    /**
     * Gets the value of the contractualPrice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getContractualPrice() {
        return contractualPrice;
    }

    /**
     * Sets the value of the contractualPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setContractualPrice(EmptyType value) {
        this.contractualPrice = value;
    }

    public boolean isSetContractualPrice() {
        return (this.contractualPrice!= null);
    }

    /**
     * When present, indicates that in order to obtain the price calculated for this sales category the client must specify this promotion code for this itinerary during booking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    public boolean isSetPromotionCode() {
        return (this.promotionCode!= null);
    }

    /**
     * Gets the value of the optionsExist property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getOptionsExist() {
        return optionsExist;
    }

    /**
     * Sets the value of the optionsExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setOptionsExist(EmptyType value) {
        this.optionsExist = value;
    }

    public boolean isSetOptionsExist() {
        return (this.optionsExist!= null);
    }

    /**
     * Gets the value of the priceGroupAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupAvailabilityType }
     *     
     */
    public PriceGroupAvailabilityType getPriceGroupAvailability() {
        return priceGroupAvailability;
    }

    /**
     * Sets the value of the priceGroupAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupAvailabilityType }
     *     
     */
    public void setPriceGroupAvailability(PriceGroupAvailabilityType value) {
        this.priceGroupAvailability = value;
    }

    public boolean isSetPriceGroupAvailability() {
        return (this.priceGroupAvailability!= null);
    }

    /**
     * Gets the value of the consumerItineraryDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerItineraryDescriptionsType }
     *     
     */
    public ConsumerItineraryDescriptionsType getConsumerItineraryDescriptions() {
        return consumerItineraryDescriptions;
    }

    /**
     * Sets the value of the consumerItineraryDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerItineraryDescriptionsType }
     *     
     */
    public void setConsumerItineraryDescriptions(ConsumerItineraryDescriptionsType value) {
        this.consumerItineraryDescriptions = value;
    }

    public boolean isSetConsumerItineraryDescriptions() {
        return (this.consumerItineraryDescriptions!= null);
    }

}
