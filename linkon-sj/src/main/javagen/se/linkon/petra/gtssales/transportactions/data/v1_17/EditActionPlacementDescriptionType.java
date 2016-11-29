
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.gtssales.shared.data.v1_17.PriceSectionType;


/**
 * <p>Java class for EditActionPlacementDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionPlacementDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element name="Placement" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}PlacementType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCode" minOccurs="0"/&gt;
 *         &lt;element name="EditSection" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditSection"/&gt;
 *         &lt;element name="PriceSection" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionType" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilitySection" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}AvailabilitySectionType" minOccurs="0"/&gt;
 *         &lt;element name="Mandatory" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultReservation" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionPlacementDescriptionType", propOrder = {
    "componentType",
    "componentNumber",
    "placement",
    "compartmentCode",
    "editSection",
    "priceSection",
    "availabilitySection",
    "mandatory",
    "defaultReservation"
})
public class EditActionPlacementDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String componentType;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "Placement", required = true)
    protected PlacementType placement;
    @XmlElement(name = "CompartmentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentCodeType compartmentCode;
    @XmlElement(name = "EditSection", required = true)
    protected EditSection editSection;
    @XmlElement(name = "PriceSection")
    protected PriceSectionType priceSection;
    @XmlElement(name = "AvailabilitySection")
    protected AvailabilitySectionType availabilitySection;
    @XmlElement(name = "Mandatory")
    protected EmptyType mandatory;
    @XmlElement(name = "DefaultReservation")
    protected EmptyType defaultReservation;

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    public boolean isSetComponentType() {
        return (this.componentType!= null);
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
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementType }
     *     
     */
    public PlacementType getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementType }
     *     
     */
    public void setPlacement(PlacementType value) {
        this.placement = value;
    }

    public boolean isSetPlacement() {
        return (this.placement!= null);
    }

    /**
     * Gets the value of the compartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentCodeType }
     *     
     */
    public CompartmentCodeType getCompartmentCode() {
        return compartmentCode;
    }

    /**
     * Sets the value of the compartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentCodeType }
     *     
     */
    public void setCompartmentCode(CompartmentCodeType value) {
        this.compartmentCode = value;
    }

    public boolean isSetCompartmentCode() {
        return (this.compartmentCode!= null);
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

    /**
     * Gets the value of the defaultReservation property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDefaultReservation() {
        return defaultReservation;
    }

    /**
     * Sets the value of the defaultReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDefaultReservation(EmptyType value) {
        this.defaultReservation = value;
    }

    public boolean isSetDefaultReservation() {
        return (this.defaultReservation!= null);
    }

}
