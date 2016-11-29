
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryBookingClassCodeType;


/**
 * <p>Java class for SalesCategoryBookingClassDeviationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryBookingClassDeviationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FromBookingClass" type="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryBookingClassCodeType"/&gt;
 *         &lt;element name="ToBookingClass" type="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryBookingClassCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryBookingClassDeviationType", propOrder = {
    "deviationMessage",
    "fromBookingClass",
    "toBookingClass"
})
public class SalesCategoryBookingClassDeviationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DeviationMessage", required = true)
    protected String deviationMessage;
    @XmlElement(name = "FromBookingClass", required = true)
    protected SalesCategoryBookingClassCodeType fromBookingClass;
    @XmlElement(name = "ToBookingClass", required = true)
    protected SalesCategoryBookingClassCodeType toBookingClass;

    /**
     * Gets the value of the deviationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviationMessage() {
        return deviationMessage;
    }

    /**
     * Sets the value of the deviationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviationMessage(String value) {
        this.deviationMessage = value;
    }

    public boolean isSetDeviationMessage() {
        return (this.deviationMessage!= null);
    }

    /**
     * Gets the value of the fromBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public SalesCategoryBookingClassCodeType getFromBookingClass() {
        return fromBookingClass;
    }

    /**
     * Sets the value of the fromBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public void setFromBookingClass(SalesCategoryBookingClassCodeType value) {
        this.fromBookingClass = value;
    }

    public boolean isSetFromBookingClass() {
        return (this.fromBookingClass!= null);
    }

    /**
     * Gets the value of the toBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public SalesCategoryBookingClassCodeType getToBookingClass() {
        return toBookingClass;
    }

    /**
     * Sets the value of the toBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryBookingClassCodeType }
     *     
     */
    public void setToBookingClass(SalesCategoryBookingClassCodeType value) {
        this.toBookingClass = value;
    }

    public boolean isSetToBookingClass() {
        return (this.toBookingClass!= null);
    }

}
