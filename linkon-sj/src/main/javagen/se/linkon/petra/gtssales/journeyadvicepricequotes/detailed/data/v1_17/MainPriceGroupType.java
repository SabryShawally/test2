
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;


/**
 * Main price group describes one possible journey advice configuration. 
 * It has a main price group code used to establish the configuration of adjacent itineraries in the same journey advice part. 
 * Also it contains a list of the possible flexibility choices for this particular price group.
 * 
 * <p>Java class for MainPriceGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainPriceGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainPriceGroupCode" type="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCodeType"/&gt;
 *         &lt;element name="SalesCategoryFlexibilities" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}SalesCategoryFlexibilitiesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainPriceGroupType", propOrder = {
    "mainPriceGroupCode",
    "salesCategoryFlexibilities"
})
public class MainPriceGroupType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "MainPriceGroupCode", required = true)
    protected PriceGroupCodeType mainPriceGroupCode;
    @XmlElement(name = "SalesCategoryFlexibilities", required = true)
    protected SalesCategoryFlexibilitiesType salesCategoryFlexibilities;

    /**
     * Gets the value of the mainPriceGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public PriceGroupCodeType getMainPriceGroupCode() {
        return mainPriceGroupCode;
    }

    /**
     * Sets the value of the mainPriceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public void setMainPriceGroupCode(PriceGroupCodeType value) {
        this.mainPriceGroupCode = value;
    }

    public boolean isSetMainPriceGroupCode() {
        return (this.mainPriceGroupCode!= null);
    }

    /**
     * Gets the value of the salesCategoryFlexibilities property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryFlexibilitiesType }
     *     
     */
    public SalesCategoryFlexibilitiesType getSalesCategoryFlexibilities() {
        return salesCategoryFlexibilities;
    }

    /**
     * Sets the value of the salesCategoryFlexibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryFlexibilitiesType }
     *     
     */
    public void setSalesCategoryFlexibilities(SalesCategoryFlexibilitiesType value) {
        this.salesCategoryFlexibilities = value;
    }

    public boolean isSetSalesCategoryFlexibilities() {
        return (this.salesCategoryFlexibilities!= null);
    }

}
