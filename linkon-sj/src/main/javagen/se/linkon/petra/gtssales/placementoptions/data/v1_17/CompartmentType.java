
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * A compartment type,
 * 				together with a marker element present only if
 * 				the compartment type is considered the default one.
 * 			
 * 
 * <p>Java class for CompartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCode"/&gt;
 *         &lt;element name="IsDefaultChoice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentType", propOrder = {
    "compartmentCode",
    "isDefaultChoice"
})
public class CompartmentType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CompartmentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected CompartmentCodeType compartmentCode;
    @XmlElement(name = "IsDefaultChoice")
    protected EmptyType isDefaultChoice;

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
     * Gets the value of the isDefaultChoice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIsDefaultChoice() {
        return isDefaultChoice;
    }

    /**
     * Sets the value of the isDefaultChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIsDefaultChoice(EmptyType value) {
        this.isDefaultChoice = value;
    }

    public boolean isSetIsDefaultChoice() {
        return (this.isDefaultChoice!= null);
    }

}
