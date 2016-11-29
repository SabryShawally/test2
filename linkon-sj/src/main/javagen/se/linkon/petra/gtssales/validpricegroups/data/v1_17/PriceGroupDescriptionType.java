
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.BasePriceDescriptionType;
import se.linkon.petra.gtssales.shared.data.v1_17.DiscountCategoriesType;
import se.linkon.petra.gtssales.shared.data.v1_17.OptionDescriptionsType;


/**
 * Describes a particular pricegroup for a journey.
 * 				Optionally contains options, prices and availabilities for the same.
 * 			
 * 
 * <p>Java class for PriceGroupDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element name="DiscountCategories" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}DiscountCategoriesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="PriceGroupStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceGroupStatusReason" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}PriceGroupStatusReasonType" minOccurs="0"/&gt;
 *         &lt;element name="ContractualPriceGroup" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGroupAvailability" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}PriceGroupAvailabilityType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Points" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ServiceProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProducerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasePriceDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}BasePriceDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="PlacementPriceDescription" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentDescriptions" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}SegmentDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupDescriptionType", propOrder = {
    "journeyConnectionReference",
    "discountCategories",
    "priceGroupCode",
    "priceGroupStatusCode",
    "priceGroupStatusReason",
    "contractualPriceGroup",
    "priceGroupAvailability",
    "itineraryReference",
    "points",
    "serviceProducerCode",
    "serviceProducerName",
    "basePriceDescription",
    "placementPriceDescription",
    "optionDescriptions",
    "segmentDescriptions"
})
public class PriceGroupDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "DiscountCategories")
    protected DiscountCategoriesType discountCategories;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "PriceGroupStatusCode", required = true)
    protected String priceGroupStatusCode;
    @XmlElement(name = "PriceGroupStatusReason")
    protected PriceGroupStatusReasonType priceGroupStatusReason;
    @XmlElement(name = "ContractualPriceGroup")
    protected EmptyType contractualPriceGroup;
    @XmlElement(name = "PriceGroupAvailability")
    protected PriceGroupAvailabilityType priceGroupAvailability;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "Points", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer points;
    @XmlElement(name = "ServiceProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer serviceProducerCode;
    @XmlElement(name = "ServiceProducerName")
    protected String serviceProducerName;
    @XmlElement(name = "BasePriceDescription")
    protected BasePriceDescriptionType basePriceDescription;
    @XmlElement(name = "PlacementPriceDescription")
    protected Money placementPriceDescription;
    @XmlElement(name = "OptionDescriptions")
    protected OptionDescriptionsType optionDescriptions;
    @XmlElement(name = "SegmentDescriptions")
    protected SegmentDescriptionsType segmentDescriptions;

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
     * Gets the value of the discountCategories property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCategoriesType }
     *     
     */
    public DiscountCategoriesType getDiscountCategories() {
        return discountCategories;
    }

    /**
     * Sets the value of the discountCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCategoriesType }
     *     
     */
    public void setDiscountCategories(DiscountCategoriesType value) {
        this.discountCategories = value;
    }

    public boolean isSetDiscountCategories() {
        return (this.discountCategories!= null);
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
     * Gets the value of the priceGroupStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGroupStatusCode() {
        return priceGroupStatusCode;
    }

    /**
     * Sets the value of the priceGroupStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceGroupStatusCode(String value) {
        this.priceGroupStatusCode = value;
    }

    public boolean isSetPriceGroupStatusCode() {
        return (this.priceGroupStatusCode!= null);
    }

    /**
     * Gets the value of the priceGroupStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupStatusReasonType }
     *     
     */
    public PriceGroupStatusReasonType getPriceGroupStatusReason() {
        return priceGroupStatusReason;
    }

    /**
     * Sets the value of the priceGroupStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupStatusReasonType }
     *     
     */
    public void setPriceGroupStatusReason(PriceGroupStatusReasonType value) {
        this.priceGroupStatusReason = value;
    }

    public boolean isSetPriceGroupStatusReason() {
        return (this.priceGroupStatusReason!= null);
    }

    /**
     * Gets the value of the contractualPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getContractualPriceGroup() {
        return contractualPriceGroup;
    }

    /**
     * Sets the value of the contractualPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setContractualPriceGroup(EmptyType value) {
        this.contractualPriceGroup = value;
    }

    public boolean isSetContractualPriceGroup() {
        return (this.contractualPriceGroup!= null);
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
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return (this.points!= null);
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
     * Gets the value of the basePriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link BasePriceDescriptionType }
     *     
     */
    public BasePriceDescriptionType getBasePriceDescription() {
        return basePriceDescription;
    }

    /**
     * Sets the value of the basePriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePriceDescriptionType }
     *     
     */
    public void setBasePriceDescription(BasePriceDescriptionType value) {
        this.basePriceDescription = value;
    }

    public boolean isSetBasePriceDescription() {
        return (this.basePriceDescription!= null);
    }

    /**
     * Gets the value of the placementPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPlacementPriceDescription() {
        return placementPriceDescription;
    }

    /**
     * Sets the value of the placementPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPlacementPriceDescription(Money value) {
        this.placementPriceDescription = value;
    }

    public boolean isSetPlacementPriceDescription() {
        return (this.placementPriceDescription!= null);
    }

    /**
     * Gets the value of the optionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public OptionDescriptionsType getOptionDescriptions() {
        return optionDescriptions;
    }

    /**
     * Sets the value of the optionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public void setOptionDescriptions(OptionDescriptionsType value) {
        this.optionDescriptions = value;
    }

    public boolean isSetOptionDescriptions() {
        return (this.optionDescriptions!= null);
    }

    /**
     * Gets the value of the segmentDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDescriptionsType }
     *     
     */
    public SegmentDescriptionsType getSegmentDescriptions() {
        return segmentDescriptions;
    }

    /**
     * Sets the value of the segmentDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDescriptionsType }
     *     
     */
    public void setSegmentDescriptions(SegmentDescriptionsType value) {
        this.segmentDescriptions = value;
    }

    public boolean isSetSegmentDescriptions() {
        return (this.segmentDescriptions!= null);
    }

}
