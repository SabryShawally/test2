
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * An option variant. 
 * Variants are variations of options, such as the duration of Internet onboard, a fish-plate or a rebuyable ticket.
 * 
 * <p>Java class for ComponentVariantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentVariantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Description"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}HelpText" minOccurs="0"/&gt;
 *         &lt;element name="DefaultComponentVariant" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentVariantType", propOrder = {
    "variantNumber",
    "description",
    "helpText",
    "defaultComponentVariant"
})
public class ComponentVariantType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "Description", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String description;
    @XmlElement(name = "HelpText", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String helpText;
    @XmlElement(name = "DefaultComponentVariant")
    protected EmptyType defaultComponentVariant;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    public boolean isSetHelpText() {
        return (this.helpText!= null);
    }

    /**
     * Gets the value of the defaultComponentVariant property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDefaultComponentVariant() {
        return defaultComponentVariant;
    }

    /**
     * Sets the value of the defaultComponentVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDefaultComponentVariant(EmptyType value) {
        this.defaultComponentVariant = value;
    }

    public boolean isSetDefaultComponentVariant() {
        return (this.defaultComponentVariant!= null);
    }

}
