
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SalesCategoryFlexibilityCodeType;


/**
 * <p>Java class for SalesCategoryFlexibilityDeviationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryFlexibilityDeviationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FromFlexibility" type="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryFlexibilityCodeType"/&gt;
 *         &lt;element name="ToFlexibility" type="{http://petra.linkon.se/commonelements/data/v4_6}SalesCategoryFlexibilityCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryFlexibilityDeviationType", propOrder = {
    "deviationMessage",
    "fromFlexibility",
    "toFlexibility"
})
public class SalesCategoryFlexibilityDeviationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DeviationMessage", required = true)
    protected String deviationMessage;
    @XmlElement(name = "FromFlexibility", required = true)
    protected SalesCategoryFlexibilityCodeType fromFlexibility;
    @XmlElement(name = "ToFlexibility", required = true)
    protected SalesCategoryFlexibilityCodeType toFlexibility;

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
     * Gets the value of the fromFlexibility property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public SalesCategoryFlexibilityCodeType getFromFlexibility() {
        return fromFlexibility;
    }

    /**
     * Sets the value of the fromFlexibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public void setFromFlexibility(SalesCategoryFlexibilityCodeType value) {
        this.fromFlexibility = value;
    }

    public boolean isSetFromFlexibility() {
        return (this.fromFlexibility!= null);
    }

    /**
     * Gets the value of the toFlexibility property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public SalesCategoryFlexibilityCodeType getToFlexibility() {
        return toFlexibility;
    }

    /**
     * Sets the value of the toFlexibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryFlexibilityCodeType }
     *     
     */
    public void setToFlexibility(SalesCategoryFlexibilityCodeType value) {
        this.toFlexibility = value;
    }

    public boolean isSetToFlexibility() {
        return (this.toFlexibility!= null);
    }

}
