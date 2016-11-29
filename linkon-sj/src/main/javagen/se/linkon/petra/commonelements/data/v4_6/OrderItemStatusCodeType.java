
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Describes the status the order item is in.
 * 
 * 				Corresponding PETRA-term: BSRDSTAKOD
 * 			
 * 
 * <p>Java class for OrderItemStatusCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemStatusCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;OrderItemStatusType"&gt;
 *       &lt;attGroup ref="{http://petra.linkon.se/commonelements/data/v4_6}PlaintextAttribute"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemStatusCodeType", propOrder = {
    "value"
})
public class OrderItemStatusCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected OrderItemStatusType value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * 
     * 				Describes the status the order item is in.
     * 
     * 				Corresponding PETRA-term: BSRDSTAKOD
     * 			
     * 
     * @return
     *     possible object is
     *     {@link OrderItemStatusType }
     *     
     */
    public OrderItemStatusType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemStatusType }
     *     
     */
    public void setValue(OrderItemStatusType value) {
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
