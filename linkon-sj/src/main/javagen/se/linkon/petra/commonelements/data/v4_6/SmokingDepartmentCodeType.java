
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Smoking department property.
 * 
 * 				Corresponding PETRA-term: UTRROK.
 * 
 * 				Code/clear-text type. The value is the code (of enum type)
 * 				and the plaintext attribute is the clear-text (of string type).
 * 			
 * 
 * <p>Java class for SmokingDepartmentCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmokingDepartmentCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;SmokingDepartmentType"&gt;
 *       &lt;attGroup ref="{http://petra.linkon.se/commonelements/data/v4_6}PlaintextAttribute"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmokingDepartmentCodeType", propOrder = {
    "value"
})
public class SmokingDepartmentCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected SmokingDepartmentType value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * 
     * 				Smoking department property.
     * 
     * 				Corresponding PETRA-term: UTRROK
     * 			
     * 
     * @return
     *     possible object is
     *     {@link SmokingDepartmentType }
     *     
     */
    public SmokingDepartmentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingDepartmentType }
     *     
     */
    public void setValue(SmokingDepartmentType value) {
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
