
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Describes the payment status the order is in.
 * 
 * 				Corresponding PETRA-term: BETSTAKOD
 * 			
 * 
 * <p>Java class for PaymentStatusCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatusCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;PaymentStatusType"&gt;
 *       &lt;attGroup ref="{http://petra.linkon.se/commonelements/data/v4_6}PlaintextAttribute"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCodeType", propOrder = {
    "value"
})
public class PaymentStatusCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected PaymentStatusType value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * 
     * 				Describes the payment status the order is in.
     * 
     * 				Corresponding PETRA-term: BETSTAKOD
     * 			
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusType }
     *     
     */
    public PaymentStatusType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusType }
     *     
     */
    public void setValue(PaymentStatusType value) {
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
