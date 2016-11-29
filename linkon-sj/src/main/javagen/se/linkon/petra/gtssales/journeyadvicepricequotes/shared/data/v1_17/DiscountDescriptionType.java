
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;


/**
 * Describes a discount by its discount type and
 * 				discount code.
 * 			
 * 
 * <p>Java class for DiscountDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountDescriptionType", propOrder = {
    "discountType",
    "discountCode"
})
public class DiscountDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DiscountType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String discountType;
    @XmlElement(name = "DiscountCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected DiscountCodeType discountCode;

    /**
     * Gets the value of the discountType property.
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
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCodeType }
     *     
     */
    public DiscountCodeType getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCodeType }
     *     
     */
    public void setDiscountCode(DiscountCodeType value) {
        this.discountCode = value;
    }

    public boolean isSetDiscountCode() {
        return (this.discountCode!= null);
    }

}
