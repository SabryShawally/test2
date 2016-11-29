
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Describes the properties of the options required in the case of options is included and 
 * 			should be preferred (season ticket clients / campaigns), we must present these to the client to be able to 
 * 			turn in to the elections at booking.
 * 			The options that this refers we recognize the reply from getValidPriceGroups when they meet one of the following:
 * 			-Mandatory AND DefaultComponentVariant
 * 			-DefaultComponentVariant AND VariantNumber > 0
 * 			
 * 
 * <p>Java class for RequiredOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumberType"/&gt;
 *         &lt;element name="ComponentDescription" type="{http://petra.linkon.se/commonelements/data/v4_6}DescriptionType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element name="VariantDescription" type="{http://petra.linkon.se/commonelements/data/v4_6}DescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredOptionType", propOrder = {
    "componentNumber",
    "componentDescription",
    "variantNumber",
    "variantDescription"
})
public class RequiredOptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentNumber")
    protected int componentNumber;
    @XmlElement(name = "ComponentDescription", required = true)
    protected String componentDescription;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "VariantDescription", required = true)
    protected String variantDescription;

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

}
