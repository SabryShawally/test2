
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryBookingClassCodeType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryFlexibilityCodeType;


/**
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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryFlexibilityCode"/&gt;
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
    "salesCategoryFlexibilityCode"
})
public class SalesCategoryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesCategoryBookingClassCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SalesCategoryBookingClassCodeType salesCategoryBookingClassCode;
    @XmlElement(name = "SalesCategoryFlexibilityCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SalesCategoryFlexibilityCodeType salesCategoryFlexibilityCode;

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

}
