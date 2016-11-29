
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.TravelDocumentCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.BasePriceDescriptionType;
import se.linkon.petra.gtssales.shared.data.v1_17.DiscountCategoriesType;
import se.linkon.petra.gtssales.shared.data.v1_17.OptionDescriptionsType;
import se.linkon.petra.gtssales.shared.data.v1_17.PriceSectionType;


/**
 * <p>Java class for ItineraryPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelDocumentCode"/&gt;
 *         &lt;element name="DiscountCategories" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}DiscountCategoriesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Points" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ServiceName"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ServiceLongName"/&gt;
 *         &lt;element name="ServicePriceDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionType"/&gt;
 *         &lt;element name="BasePriceDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}BasePriceDescriptionType"/&gt;
 *         &lt;element name="PlacementPriceDescription" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}PlacementPriceDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentPriceDescriptions" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}SegmentPriceDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPriceDescriptionType", propOrder = {
    "itineraryReference",
    "travelDocumentCode",
    "discountCategories",
    "points",
    "serviceName",
    "serviceLongName",
    "servicePriceDescription",
    "basePriceDescription",
    "placementPriceDescription",
    "optionDescriptions",
    "segmentPriceDescriptions"
})
public class ItineraryPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "TravelDocumentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "string")
    protected TravelDocumentCodeType travelDocumentCode;
    @XmlElement(name = "DiscountCategories")
    protected DiscountCategoriesType discountCategories;
    @XmlElement(name = "Points", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer points;
    @XmlElement(name = "ServiceName", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String serviceName;
    @XmlElement(name = "ServiceLongName", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String serviceLongName;
    @XmlElement(name = "ServicePriceDescription", required = true)
    protected PriceSectionType servicePriceDescription;
    @XmlElement(name = "BasePriceDescription", required = true)
    protected BasePriceDescriptionType basePriceDescription;
    @XmlElement(name = "PlacementPriceDescription")
    protected PlacementPriceDescriptionType placementPriceDescription;
    @XmlElement(name = "OptionDescriptions")
    protected OptionDescriptionsType optionDescriptions;
    @XmlElement(name = "SegmentPriceDescriptions", required = true)
    protected SegmentPriceDescriptionsType segmentPriceDescriptions;

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
     * Gets the value of the travelDocumentCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentCodeType }
     *     
     */
    public TravelDocumentCodeType getTravelDocumentCode() {
        return travelDocumentCode;
    }

    /**
     * Sets the value of the travelDocumentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentCodeType }
     *     
     */
    public void setTravelDocumentCode(TravelDocumentCodeType value) {
        this.travelDocumentCode = value;
    }

    public boolean isSetTravelDocumentCode() {
        return (this.travelDocumentCode!= null);
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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public boolean isSetServiceName() {
        return (this.serviceName!= null);
    }

    /**
     * Gets the value of the serviceLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLongName() {
        return serviceLongName;
    }

    /**
     * Sets the value of the serviceLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLongName(String value) {
        this.serviceLongName = value;
    }

    public boolean isSetServiceLongName() {
        return (this.serviceLongName!= null);
    }

    /**
     * Gets the value of the servicePriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSectionType }
     *     
     */
    public PriceSectionType getServicePriceDescription() {
        return servicePriceDescription;
    }

    /**
     * Sets the value of the servicePriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSectionType }
     *     
     */
    public void setServicePriceDescription(PriceSectionType value) {
        this.servicePriceDescription = value;
    }

    public boolean isSetServicePriceDescription() {
        return (this.servicePriceDescription!= null);
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
     *     {@link PlacementPriceDescriptionType }
     *     
     */
    public PlacementPriceDescriptionType getPlacementPriceDescription() {
        return placementPriceDescription;
    }

    /**
     * Sets the value of the placementPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementPriceDescriptionType }
     *     
     */
    public void setPlacementPriceDescription(PlacementPriceDescriptionType value) {
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
     * Gets the value of the segmentPriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPriceDescriptionsType }
     *     
     */
    public SegmentPriceDescriptionsType getSegmentPriceDescriptions() {
        return segmentPriceDescriptions;
    }

    /**
     * Sets the value of the segmentPriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPriceDescriptionsType }
     *     
     */
    public void setSegmentPriceDescriptions(SegmentPriceDescriptionsType value) {
        this.segmentPriceDescriptions = value;
    }

    public boolean isSetSegmentPriceDescriptions() {
        return (this.segmentPriceDescriptions!= null);
    }

}
