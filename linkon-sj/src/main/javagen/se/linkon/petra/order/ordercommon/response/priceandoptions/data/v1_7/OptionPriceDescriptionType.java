
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * 
 * 				Option description and its price. 
 * 			
 * 
 * <p>Java class for OptionPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentSequenceNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element name="ComponentDescription" type="{http://petra.linkon.se/commonelements/data/v4_6}DescriptionType"/&gt;
 *         &lt;element name="VariantDescription" type="{http://petra.linkon.se/commonelements/data/v4_6}DescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OptionCategory"/&gt;
 *         &lt;element name="IncludedInServiceBasePrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="OptionPrice" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionPriceDescriptionType", propOrder = {
    "componentSequenceNumber",
    "componentNumber",
    "variantNumber",
    "componentDescription",
    "variantDescription",
    "optionCategory",
    "includedInServiceBasePrice",
    "optionPrice"
})
public class OptionPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentSequenceNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentSequenceNumber;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "ComponentDescription", required = true)
    protected String componentDescription;
    @XmlElement(name = "VariantDescription")
    protected String variantDescription;
    @XmlElement(name = "OptionCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String optionCategory;
    @XmlElement(name = "IncludedInServiceBasePrice")
    protected EmptyType includedInServiceBasePrice;
    @XmlElement(name = "OptionPrice")
    protected PriceVatType optionPrice;

    /**
     * Gets the value of the componentSequenceNumber property.
     * 
     */
    public int getComponentSequenceNumber() {
        return componentSequenceNumber;
    }

    /**
     * Sets the value of the componentSequenceNumber property.
     * 
     */
    public void setComponentSequenceNumber(int value) {
        this.componentSequenceNumber = value;
    }

    public boolean isSetComponentSequenceNumber() {
        return true;
    }

    /**
     * Gets the value of the componentNumber property.
     * 
     */
    public int getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     */
    public void setComponentNumber(int value) {
        this.componentNumber = value;
    }

    public boolean isSetComponentNumber() {
        return true;
    }

    /**
     * Gets the value of the variantNumber property.
     * 
     */
    public int getVariantNumber() {
        return variantNumber;
    }

    /**
     * Sets the value of the variantNumber property.
     * 
     */
    public void setVariantNumber(int value) {
        this.variantNumber = value;
    }

    public boolean isSetVariantNumber() {
        return true;
    }

    /**
     * Gets the value of the componentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDescription() {
        return componentDescription;
    }

    /**
     * Sets the value of the componentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDescription(String value) {
        this.componentDescription = value;
    }

    public boolean isSetComponentDescription() {
        return (this.componentDescription!= null);
    }

    /**
     * Gets the value of the variantDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantDescription() {
        return variantDescription;
    }

    /**
     * Sets the value of the variantDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantDescription(String value) {
        this.variantDescription = value;
    }

    public boolean isSetVariantDescription() {
        return (this.variantDescription!= null);
    }

    /**
     * Gets the value of the optionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCategory() {
        return optionCategory;
    }

    /**
     * Sets the value of the optionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCategory(String value) {
        this.optionCategory = value;
    }

    public boolean isSetOptionCategory() {
        return (this.optionCategory!= null);
    }

    /**
     * Gets the value of the includedInServiceBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludedInServiceBasePrice() {
        return includedInServiceBasePrice;
    }

    /**
     * Sets the value of the includedInServiceBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludedInServiceBasePrice(EmptyType value) {
        this.includedInServiceBasePrice = value;
    }

    public boolean isSetIncludedInServiceBasePrice() {
        return (this.includedInServiceBasePrice!= null);
    }

    /**
     * Gets the value of the optionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getOptionPrice() {
        return optionPrice;
    }

    /**
     * Sets the value of the optionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setOptionPrice(PriceVatType value) {
        this.optionPrice = value;
    }

    public boolean isSetOptionPrice() {
        return (this.optionPrice!= null);
    }

}
