
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Indicates direction of the placement (undefined, forward, backward).
 * 
 * N.B. Placementdirection is not used at the moment, it is not possible choose at booking.
 * 
 * Corresponding PETRA-term: PLSRIKTN.
 * 
 * Code/clear-text type. The value is the code (of enum type) and the plaintext attribute is the clear-text (of string type).
 * 
 * <p>Java class for PlacementDirectionCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDirectionCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;PlacementDirectionType"&gt;
 *       &lt;attGroup ref="{http://petra.linkon.se/commonelements/data/v4_6}PlaintextAttribute"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDirectionCodeType", propOrder = {
    "value"
})
public class PlacementDirectionCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected PlacementDirectionType value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * Indicates direction of the placement (undefined, forward, backward)
     * 
     * N.B. Placementdirection is not used at the moment, it is not possible choose at booking.
     * 
     * Corresponding PETRA-term: PLSRIKTN
     * 			
     * 
     * @return
     *     possible object is
     *     {@link PlacementDirectionType }
     *     
     */
    public PlacementDirectionType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementDirectionType }
     *     
     */
    public void setValue(PlacementDirectionType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
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
