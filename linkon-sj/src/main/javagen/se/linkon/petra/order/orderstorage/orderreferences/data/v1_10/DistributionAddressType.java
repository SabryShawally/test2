
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for DistributionAddress or ReferenceAddress.
 * 
 * <p>Java class for DistributionAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExistingDistributionAddress" type="{http://petra.linkon.se/order/orderstorage/orderreferences/data/v1_10}ExistingDistributionAddressType"/&gt;
 *         &lt;element name="ReferenceAddress" type="{http://petra.linkon.se/order/orderstorage/orderreferences/data/v1_10}ReferenceAddress"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionAddressType", propOrder = {
    "existingDistributionAddress",
    "referenceAddress"
})
public class DistributionAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ExistingDistributionAddress")
    protected ExistingDistributionAddressType existingDistributionAddress;
    @XmlElement(name = "ReferenceAddress")
    protected ReferenceAddress referenceAddress;

    /**
     * Gets the value of the existingDistributionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingDistributionAddressType }
     *     
     */
    public ExistingDistributionAddressType getExistingDistributionAddress() {
        return existingDistributionAddress;
    }

    /**
     * Sets the value of the existingDistributionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingDistributionAddressType }
     *     
     */
    public void setExistingDistributionAddress(ExistingDistributionAddressType value) {
        this.existingDistributionAddress = value;
    }

    public boolean isSetExistingDistributionAddress() {
        return (this.existingDistributionAddress!= null);
    }

    /**
     * Gets the value of the referenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAddress }
     *     
     */
    public ReferenceAddress getReferenceAddress() {
        return referenceAddress;
    }

    /**
     * Sets the value of the referenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAddress }
     *     
     */
    public void setReferenceAddress(ReferenceAddress value) {
        this.referenceAddress = value;
    }

    public boolean isSetReferenceAddress() {
        return (this.referenceAddress!= null);
    }

}
