
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;


/**
 * 
 * 				A discount belongs to a category. 
 * 			
 * 
 * <p>Java class for DiscountCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}DiscountCategoryTypeType"/&gt;
 *         &lt;element name="Amount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *         &lt;element name="Discounts" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}DiscountsType"/&gt;
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
    "category",
    "amount",
    "discounts"
})
public class DiscountCategoryType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Category", required = true)
    @XmlSchemaType(name = "string")
    protected DiscountCategoryTypeType category;
    @XmlElement(name = "Amount", required = true)
    protected Money amount;
    @XmlElement(name = "Discounts", required = true)
    protected DiscountsType discounts;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCategoryTypeType }
     *     
     */
    public DiscountCategoryTypeType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCategoryTypeType }
     *     
     */
    public void setCategory(DiscountCategoryTypeType value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    public boolean isSetAmount() {
        return (this.amount!= null);
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

}
