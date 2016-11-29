
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents price including tax vat
 * 
 * <p>Java class for PriceVatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceVatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceInclVat" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *         &lt;element name="Vat" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *         &lt;element name="VatPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVatType", propOrder = {
    "priceInclVat",
    "vat",
    "vatPercentage"
})
public class PriceVatType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceInclVat", required = true)
    protected Money priceInclVat;
    @XmlElement(name = "Vat", required = true)
    protected Money vat;
    @XmlElement(name = "VatPercentage")
    protected BigDecimal vatPercentage;

    /**
     * Gets the value of the priceInclVat property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriceInclVat() {
        return priceInclVat;
    }

    /**
     * Sets the value of the priceInclVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriceInclVat(Money value) {
        this.priceInclVat = value;
    }

    public boolean isSetPriceInclVat() {
        return (this.priceInclVat!= null);
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setVat(Money value) {
        this.vat = value;
    }

    public boolean isSetVat() {
        return (this.vat!= null);
    }

    /**
     * Gets the value of the vatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatPercentage() {
        return vatPercentage;
    }

    /**
     * Sets the value of the vatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatPercentage(BigDecimal value) {
        this.vatPercentage = value;
    }

    public boolean isSetVatPercentage() {
        return (this.vatPercentage!= null);
    }

}
