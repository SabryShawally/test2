
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * A booking option and its variants. Options define a "service category", such as flexibility, Food onboard or Internet onboard.
 * 
 * <p>Java class for EditActionOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OptionCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Description"/&gt;
 *         &lt;element name="EditActionComponentVariants" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionComponentVariantsType" minOccurs="0"/&gt;
 *         &lt;element name="Mandatory" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionOptionDescriptionType", propOrder = {
    "optionCategory",
    "componentNumber",
    "description",
    "editActionComponentVariants",
    "mandatory"
})
public class EditActionOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OptionCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String optionCategory;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "Description", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String description;
    @XmlElement(name = "EditActionComponentVariants")
    protected EditActionComponentVariantsType editActionComponentVariants;
    @XmlElement(name = "Mandatory")
    protected EmptyType mandatory;

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
     * Gets the value of the editActionComponentVariants property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionComponentVariantsType }
     *     
     */
    public EditActionComponentVariantsType getEditActionComponentVariants() {
        return editActionComponentVariants;
    }

    /**
     * Sets the value of the editActionComponentVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionComponentVariantsType }
     *     
     */
    public void setEditActionComponentVariants(EditActionComponentVariantsType value) {
        this.editActionComponentVariants = value;
    }

    public boolean isSetEditActionComponentVariants() {
        return (this.editActionComponentVariants!= null);
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMandatory(EmptyType value) {
        this.mandatory = value;
    }

    public boolean isSetMandatory() {
        return (this.mandatory!= null);
    }

}
