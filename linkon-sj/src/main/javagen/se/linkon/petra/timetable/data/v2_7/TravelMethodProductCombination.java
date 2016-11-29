
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;
import se.linkon.petra.commonelements.data.v4_6.TravelMethodCodeType;


/**
 * Structure for defining a travel method and product code combination.
 * 
 * <p>Java class for TravelMethodProductCombination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelMethodProductCombination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelMethodCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="plaintext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelMethodProductCombination", propOrder = {
    "travelMethodCode",
    "productCode"
})
public class TravelMethodProductCombination
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelMethodCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelMethodCodeType travelMethodCode;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * Gets the value of the travelMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelMethodCodeType }
     *     
     */
    public TravelMethodCodeType getTravelMethodCode() {
        return travelMethodCode;
    }

    /**
     * Sets the value of the travelMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelMethodCodeType }
     *     
     */
    public void setTravelMethodCode(TravelMethodCodeType value) {
        this.travelMethodCode = value;
    }

    public boolean isSetTravelMethodCode() {
        return (this.travelMethodCode!= null);
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType }
     *     
     */
    public ProductCodeType getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType }
     *     
     */
    public void setProductCode(ProductCodeType value) {
        this.productCode = value;
    }

    public boolean isSetProductCode() {
        return (this.productCode!= null);
    }

    /**
     * Gets the value of the plaintext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaintext() {
        return plaintext;
    }

    /**
     * Sets the value of the plaintext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaintext(String value) {
        this.plaintext = value;
    }

    public boolean isSetPlaintext() {
        return (this.plaintext!= null);
    }

}
