
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for payer data.
 * 
 * <p>Java class for PayerReferenceSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerReferenceSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceSpecification" type="{http://petra.linkon.se/order/orderstorage/orderreferences/data/v1_10}ReferenceSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerReferenceSpecification", propOrder = {
    "referenceSpecification"
})
public class PayerReferenceSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ReferenceSpecification", required = true)
    protected ReferenceSpecification referenceSpecification;

    /**
     * Gets the value of the referenceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSpecification }
     *     
     */
    public ReferenceSpecification getReferenceSpecification() {
        return referenceSpecification;
    }

    /**
     * Sets the value of the referenceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSpecification }
     *     
     */
    public void setReferenceSpecification(ReferenceSpecification value) {
        this.referenceSpecification = value;
    }

    public boolean isSetReferenceSpecification() {
        return (this.referenceSpecification!= null);
    }

}
