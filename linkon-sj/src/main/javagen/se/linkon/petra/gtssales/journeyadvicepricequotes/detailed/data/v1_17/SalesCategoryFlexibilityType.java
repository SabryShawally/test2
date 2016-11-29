
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryFlexibilityCodeType;


/**
 * The sales category flexibilities describes the prices and choices for this particular main price group and journey advice part with the given flexibility.
 * 
 * <p>Java class for SalesCategoryFlexibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryFlexibilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryFlexibilityCode"/&gt;
 *         &lt;element name="JourneyAdvicePriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}JourneyAdvicePriceDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryFlexibilityType", propOrder = {
    "salesCategoryFlexibilityCode",
    "journeyAdvicePriceDescription"
})
public class SalesCategoryFlexibilityType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesCategoryFlexibilityCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SalesCategoryFlexibilityCodeType salesCategoryFlexibilityCode;
    @XmlElement(name = "JourneyAdvicePriceDescription", required = true)
    protected JourneyAdvicePriceDescriptionType journeyAdvicePriceDescription;

    /**
     * Gets the value of the salesCategoryFlexibilityCode property.
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

}
