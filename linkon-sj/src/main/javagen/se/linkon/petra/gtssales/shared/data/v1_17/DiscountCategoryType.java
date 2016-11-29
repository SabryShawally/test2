
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * <p>Java class for DiscountCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountType"/&gt;
 *         &lt;element name="Discounts" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}DiscountsType"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountCategoryType", propOrder = {
    "discountType",
    "discounts",
    "discountAmount"
})
public class DiscountCategoryType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DiscountType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String discountType;
    @XmlElement(name = "Discounts", required = true)
    protected DiscountsType discounts;
    @XmlElement(name = "DiscountAmount", required = true)
    protected PriceVatType discountAmount;

    /**
     * Discount type. Discounts are divided in different
     * 						types or categories such as
     * 
     * 						STD = Standard discount (arskort etc)
     * 
     * 						KND = Customer Discount (discount based on a customer program,
     * 						such
     * 						as SJ Prio or Commeo)
     * 
     * 						KSA = Cash discount (specific
     * 						saleschannel, e.g. web-intake).
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    public boolean isSetDiscountType() {
        return (this.discountType!= null);
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountsType }
     *     
     */
    public DiscountsType getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountsType }
     *     
     */
    public void setDiscounts(DiscountsType value) {
        this.discounts = value;
    }

    public boolean isSetDiscounts() {
        return (this.discounts!= null);
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setDiscountAmount(PriceVatType value) {
        this.discountAmount = value;
    }

    public boolean isSetDiscountAmount() {
        return (this.discountAmount!= null);
    }

}
