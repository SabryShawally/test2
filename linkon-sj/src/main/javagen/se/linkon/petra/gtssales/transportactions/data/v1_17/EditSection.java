
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for EditSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Existing" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="ComponentEditActions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}ComponentEditActionsType"/&gt;
 *         &lt;element name="EditValue" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditSection", propOrder = {
    "existing",
    "componentEditActions",
    "editValue"
})
public class EditSection
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Existing")
    protected EmptyType existing;
    @XmlElement(name = "ComponentEditActions", required = true)
    protected ComponentEditActionsType componentEditActions;
    @XmlElement(name = "EditValue")
    protected PriceVatType editValue;

    /**
     * Gets the value of the existing property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getExisting() {
        return existing;
    }

    /**
     * Sets the value of the existing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setExisting(EmptyType value) {
        this.existing = value;
    }

    public boolean isSetExisting() {
        return (this.existing!= null);
    }

    /**
     * Gets the value of the componentEditActions property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentEditActionsType }
     *     
     */
    public ComponentEditActionsType getComponentEditActions() {
        return componentEditActions;
    }

    /**
     * Sets the value of the componentEditActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentEditActionsType }
     *     
     */
    public void setComponentEditActions(ComponentEditActionsType value) {
        this.componentEditActions = value;
    }

    public boolean isSetComponentEditActions() {
        return (this.componentEditActions!= null);
    }

    /**
     * Gets the value of the editValue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getEditValue() {
        return editValue;
    }

    /**
     * Sets the value of the editValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setEditValue(PriceVatType value) {
        this.editValue = value;
    }

    public boolean isSetEditValue() {
        return (this.editValue!= null);
    }

}
