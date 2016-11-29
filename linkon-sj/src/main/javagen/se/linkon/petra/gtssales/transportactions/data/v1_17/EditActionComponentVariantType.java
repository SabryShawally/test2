
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.gtssales.shared.data.v1_17.PriceSectionType;


/**
 * An option variant. Variants are variations of options, such as the duration of Internet onboard, a fish-plate or a rebuyable ticket.
 * 
 * <p>Java class for EditActionComponentVariantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionComponentVariantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Description"/&gt;
 *         &lt;element name="DefaultComponentVariant" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="EditSection" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditSection"/&gt;
 *         &lt;element name="PriceSection" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionType" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilitySection" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}AvailabilitySectionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionComponentVariantType", propOrder = {
    "variantNumber",
    "description",
    "defaultComponentVariant",
    "editSection",
    "priceSection",
    "availabilitySection"
})
public class EditActionComponentVariantType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "Description", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String description;
    @XmlElement(name = "DefaultComponentVariant")
    protected EmptyType defaultComponentVariant;
    @XmlElement(name = "EditSection", required = true)
    protected EditSection editSection;
    @XmlElement(name = "PriceSection")
    protected PriceSectionType priceSection;
    @XmlElement(name = "AvailabilitySection")
    protected AvailabilitySectionType availabilitySection;

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

    /**
     * Gets the value of the editSection property.
     * 
     * @return
     *     possible object is
     *     {@link EditSection }
     *     
     */
    public EditSection getEditSection() {
        return editSection;
    }

    /**
     * Sets the value of the editSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditSection }
     *     
     */
    public void setEditSection(EditSection value) {
        this.editSection = value;
    }

    public boolean isSetEditSection() {
        return (this.editSection!= null);
    }

    /**
     * Gets the value of the priceSection property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSectionType }
     *     
     */
    public PriceSectionType getPriceSection() {
        return priceSection;
    }

    /**
     * Sets the value of the priceSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSectionType }
     *     
     */
    public void setPriceSection(PriceSectionType value) {
        this.priceSection = value;
    }

    public boolean isSetPriceSection() {
        return (this.priceSection!= null);
    }

    /**
     * Gets the value of the availabilitySection property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilitySectionType }
     *     
     */
    public AvailabilitySectionType getAvailabilitySection() {
        return availabilitySection;
    }

    /**
     * Sets the value of the availabilitySection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilitySectionType }
     *     
     */
    public void setAvailabilitySection(AvailabilitySectionType value) {
        this.availabilitySection = value;
    }

    public boolean isSetAvailabilitySection() {
        return (this.availabilitySection!= null);
    }

}
