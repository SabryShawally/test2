
package se.linkon.petra.gtssales.validatepromotioncode.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromotionCodeExists" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "promotionCodeExists"
})
@XmlRootElement(name = "ValidatePromotionCodeResponse")
public class ValidatePromotionCodeResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PromotionCodeExists")
    protected EmptyType promotionCodeExists;

    /**
     * Gets the value of the promotionCodeExists property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getPromotionCodeExists() {
        return promotionCodeExists;
    }

    /**
     * Sets the value of the promotionCodeExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setPromotionCodeExists(EmptyType value) {
        this.promotionCodeExists = value;
    }

    public boolean isSetPromotionCodeExists() {
        return (this.promotionCodeExists!= null);
    }

}
