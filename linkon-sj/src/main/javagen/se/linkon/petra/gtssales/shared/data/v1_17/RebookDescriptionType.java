
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for RebookDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebookDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayableWithRebookableTicket" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Rebookable" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="RebookingFeeRuleNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RebookingFeeRuleVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebookDescriptionType", propOrder = {
    "payableWithRebookableTicket",
    "rebookable",
    "rebookingFeeRuleNumber",
    "rebookingFeeRuleVersionNumber"
})
public class RebookDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PayableWithRebookableTicket")
    protected EmptyType payableWithRebookableTicket;
    @XmlElement(name = "Rebookable")
    protected EmptyType rebookable;
    @XmlElement(name = "RebookingFeeRuleNumber")
    protected Integer rebookingFeeRuleNumber;
    @XmlElement(name = "RebookingFeeRuleVersionNumber")
    protected Integer rebookingFeeRuleVersionNumber;

    /**
     * Gets the value of the payableWithRebookableTicket property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getPayableWithRebookableTicket() {
        return payableWithRebookableTicket;
    }

    /**
     * Sets the value of the payableWithRebookableTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setPayableWithRebookableTicket(EmptyType value) {
        this.payableWithRebookableTicket = value;
    }

    public boolean isSetPayableWithRebookableTicket() {
        return (this.payableWithRebookableTicket!= null);
    }

    /**
     * Gets the value of the rebookable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getRebookable() {
        return rebookable;
    }

    /**
     * Sets the value of the rebookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setRebookable(EmptyType value) {
        this.rebookable = value;
    }

    public boolean isSetRebookable() {
        return (this.rebookable!= null);
    }

    /**
     * Gets the value of the rebookingFeeRuleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRebookingFeeRuleNumber() {
        return rebookingFeeRuleNumber;
    }

    /**
     * Sets the value of the rebookingFeeRuleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRebookingFeeRuleNumber(Integer value) {
        this.rebookingFeeRuleNumber = value;
    }

    public boolean isSetRebookingFeeRuleNumber() {
        return (this.rebookingFeeRuleNumber!= null);
    }

    /**
     * Gets the value of the rebookingFeeRuleVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRebookingFeeRuleVersionNumber() {
        return rebookingFeeRuleVersionNumber;
    }

    /**
     * Sets the value of the rebookingFeeRuleVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRebookingFeeRuleVersionNumber(Integer value) {
        this.rebookingFeeRuleVersionNumber = value;
    }

    public boolean isSetRebookingFeeRuleVersionNumber() {
        return (this.rebookingFeeRuleVersionNumber!= null);
    }

}
