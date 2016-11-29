
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryBookingClassCodeType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryFlexibilityCodeType;


/**
 * Describes a specific sales category for a journey advice. 
 * The sales category is identified by the sales category booking class and flexibility.
 * 
 * <p>Java class for SalesCategoryDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryBookingClassCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryFlexibilityCode" minOccurs="0"/&gt;
 *         &lt;element name="JourneyAdvicePriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}JourneyAdvicePriceDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGroupChoices" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}PriceGroupChoicesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryDescriptionType", propOrder = {
    "salesCategoryBookingClassCode",
    "salesCategoryFlexibilityCode",
    "journeyAdvicePriceDescription",
    "priceGroupChoices"
})
public class SalesCategoryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesCategoryBookingClassCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SalesCategoryBookingClassCodeType salesCategoryBookingClassCode;
    @XmlElement(name = "SalesCategoryFlexibilityCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected SalesCategoryFlexibilityCodeType salesCategoryFlexibilityCode;
    @XmlElement(name = "JourneyAdvicePriceDescription")
    protected JourneyAdvicePriceDescriptionType journeyAdvicePriceDescription;
    @XmlElement(name = "PriceGroupChoices")
    protected PriceGroupChoicesType priceGroupChoices;

    /**
     * Gets the value of the salesCategoryBookingClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public SalesCategoryBookingClassCodeType getSalesCategoryBookingClassCode() {
        return salesCategoryBookingClassCode;
    }

    /**
     * Sets the value of the salesCategoryBookingClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public void setSalesCategoryBookingClassCode(SalesCategoryBookingClassCodeType value) {
        this.salesCategoryBookingClassCode = value;
    }

    public boolean isSetSalesCategoryBookingClassCode() {
        return (this.salesCategoryBookingClassCode!= null);
    }

    /**
     * Omitted for sales category descriptions that have price group choices since a single coherent sales category flexibility code may not be possible to express.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public SalesCategoryFlexibilityCodeType getSalesCategoryFlexibilityCode() {
        return salesCategoryFlexibilityCode;
    }

    /**
     * Sets the value of the salesCategoryFlexibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public void setSalesCategoryFlexibilityCode(SalesCategoryFlexibilityCodeType value) {
        this.salesCategoryFlexibilityCode = value;
    }

    public boolean isSetSalesCategoryFlexibilityCode() {
        return (this.salesCategoryFlexibilityCode!= null);
    }

    /**
     * Gets the value of the journeyAdvicePriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdvicePriceDescriptionType }
     *     
     */
    public JourneyAdvicePriceDescriptionType getJourneyAdvicePriceDescription() {
        return journeyAdvicePriceDescription;
    }

    /**
     * Sets the value of the journeyAdvicePriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdvicePriceDescriptionType }
     *     
     */
    public void setJourneyAdvicePriceDescription(JourneyAdvicePriceDescriptionType value) {
        this.journeyAdvicePriceDescription = value;
    }

    public boolean isSetJourneyAdvicePriceDescription() {
        return (this.journeyAdvicePriceDescription!= null);
    }

    /**
     * Gets the value of the priceGroupChoices property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupChoicesType }
     *     
     */
    public PriceGroupChoicesType getPriceGroupChoices() {
        return priceGroupChoices;
    }

    /**
     * Sets the value of the priceGroupChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupChoicesType }
     *     
     */
    public void setPriceGroupChoices(PriceGroupChoicesType value) {
        this.priceGroupChoices = value;
    }

    public boolean isSetPriceGroupChoices() {
        return (this.priceGroupChoices!= null);
    }

}
