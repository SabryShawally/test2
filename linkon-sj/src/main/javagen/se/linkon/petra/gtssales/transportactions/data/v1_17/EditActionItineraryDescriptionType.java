
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.gtssales.shared.data.v1_17.BasePriceDescriptionType;
import se.linkon.petra.gtssales.shared.data.v1_17.DiscountCategoryType;


/**
 * <p>Java class for EditActionItineraryDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionItineraryDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountCategory" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}DiscountCategoryType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Points" minOccurs="0"/&gt;
 *         &lt;element name="BasePriceDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}BasePriceDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="PlacementPriceDescription" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="EditActionOptionDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionOptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="EditActionSegmentDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionSegmentDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionItineraryDescriptionType", propOrder = {
    "discountCategory",
    "itineraryReference",
    "points",
    "basePriceDescription",
    "placementPriceDescription",
    "editActionOptionDescriptions",
    "editActionSegmentDescriptions"
})
public class EditActionItineraryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DiscountCategory")
    protected DiscountCategoryType discountCategory;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "Points", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer points;
    @XmlElement(name = "BasePriceDescription")
    protected BasePriceDescriptionType basePriceDescription;
    @XmlElement(name = "PlacementPriceDescription")
    protected PriceVatType placementPriceDescription;
    @XmlElement(name = "EditActionOptionDescriptions")
    protected EditActionOptionDescriptionsType editActionOptionDescriptions;
    @XmlElement(name = "EditActionSegmentDescriptions", required = true)
    protected EditActionSegmentDescriptionsType editActionSegmentDescriptions;

    /**
     * Gets the value of the discountCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCategoryType }
     *     
     */
    public DiscountCategoryType getDiscountCategory() {
        return discountCategory;
    }

    /**
     * Sets the value of the discountCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCategoryType }
     *     
     */
    public void setDiscountCategory(DiscountCategoryType value) {
        this.discountCategory = value;
    }

    public boolean isSetDiscountCategory() {
        return (this.discountCategory!= null);
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
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getPlacementPriceDescription() {
        return placementPriceDescription;
    }

    /**
     * Sets the value of the placementPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setPlacementPriceDescription(PriceVatType value) {
        this.placementPriceDescription = value;
    }

    public boolean isSetPlacementPriceDescription() {
        return (this.placementPriceDescription!= null);
    }

    /**
     * Gets the value of the editActionOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionOptionDescriptionsType }
     *     
     */
    public EditActionOptionDescriptionsType getEditActionOptionDescriptions() {
        return editActionOptionDescriptions;
    }

    /**
     * Sets the value of the editActionOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionOptionDescriptionsType }
     *     
     */
    public void setEditActionOptionDescriptions(EditActionOptionDescriptionsType value) {
        this.editActionOptionDescriptions = value;
    }

    public boolean isSetEditActionOptionDescriptions() {
        return (this.editActionOptionDescriptions!= null);
    }

    /**
     * Gets the value of the editActionSegmentDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionSegmentDescriptionsType }
     *     
     */
    public EditActionSegmentDescriptionsType getEditActionSegmentDescriptions() {
        return editActionSegmentDescriptions;
    }

    /**
     * Sets the value of the editActionSegmentDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionSegmentDescriptionsType }
     *     
     */
    public void setEditActionSegmentDescriptions(EditActionSegmentDescriptionsType value) {
        this.editActionSegmentDescriptions = value;
    }

    public boolean isSetEditActionSegmentDescriptions() {
        return (this.editActionSegmentDescriptions!= null);
    }

}
