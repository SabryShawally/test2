
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for NonNegativeIntCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonNegativeIntCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;NonNegativeInt"&gt;
 *       &lt;attribute name="plaintext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonNegativeIntCodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    SegmentProducerCodeType.class
})
public class NonNegativeIntCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected int value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return true;
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
