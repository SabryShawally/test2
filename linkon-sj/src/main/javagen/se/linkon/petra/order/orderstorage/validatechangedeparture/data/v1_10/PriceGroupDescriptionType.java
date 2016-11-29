
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;


/**
 * <p>Java class for PriceGroupDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="FlexibilityComponentNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumberType"/&gt;
 *         &lt;element name="FlexibilityVariantNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumberType"/&gt;
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
    "priceGroupCode",
    "flexibilityComponentNumber",
    "flexibilityVariantNumber"
})
public class PriceGroupDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "FlexibilityComponentNumber")
    protected int flexibilityComponentNumber;
    @XmlElement(name = "FlexibilityVariantNumber")
    protected int flexibilityVariantNumber;

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
     * Gets the value of the flexibilityComponentNumber property.
     * 
     */
    public int getFlexibilityComponentNumber() {
        return flexibilityComponentNumber;
    }

    /**
     * Sets the value of the flexibilityComponentNumber property.
     * 
     */
    public void setFlexibilityComponentNumber(int value) {
        this.flexibilityComponentNumber = value;
    }

    public boolean isSetFlexibilityComponentNumber() {
        return true;
    }

    /**
     * Gets the value of the flexibilityVariantNumber property.
     * 
     */
    public int getFlexibilityVariantNumber() {
        return flexibilityVariantNumber;
    }

    /**
     * Sets the value of the flexibilityVariantNumber property.
     * 
     */
    public void setFlexibilityVariantNumber(int value) {
        this.flexibilityVariantNumber = value;
    }

    public boolean isSetFlexibilityVariantNumber() {
        return true;
    }

}
