
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.CustomerAddressType;


/**
 * Structure for the reference person address.
 * 
 * <p>Java class for ReferenceAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}CustomerAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceAddress", propOrder = {
    "address"
})
public class ReferenceAddress
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Address", required = true)
    protected CustomerAddressType address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setAddress(CustomerAddressType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

}
