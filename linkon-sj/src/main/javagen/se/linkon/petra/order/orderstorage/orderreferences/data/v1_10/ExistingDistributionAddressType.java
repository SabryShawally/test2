
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.AddressTypeType;


/**
 * Structure for DistributionAddress.
 * 
 * <p>Java class for ExistingDistributionAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExistingDistributionAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistributionAddressType" type="{http://petra.linkon.se/commonelements/data/v4_6}AddressTypeType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DistributionAddressSequenceNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistingDistributionAddressType", propOrder = {
    "distributionAddressType",
    "distributionAddressSequenceNumber"
})
public class ExistingDistributionAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DistributionAddressType", required = true)
    @XmlSchemaType(name = "string")
    protected AddressTypeType distributionAddressType;
    @XmlElement(name = "DistributionAddressSequenceNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer distributionAddressSequenceNumber;

    /**
     * Gets the value of the distributionAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeType }
     *     
     */
    public AddressTypeType getDistributionAddressType() {
        return distributionAddressType;
    }

    /**
     * Sets the value of the distributionAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeType }
     *     
     */
    public void setDistributionAddressType(AddressTypeType value) {
        this.distributionAddressType = value;
    }

    public boolean isSetDistributionAddressType() {
        return (this.distributionAddressType!= null);
    }

    /**
     * Gets the value of the distributionAddressSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistributionAddressSequenceNumber() {
        return distributionAddressSequenceNumber;
    }

    /**
     * Sets the value of the distributionAddressSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistributionAddressSequenceNumber(Integer value) {
        this.distributionAddressSequenceNumber = value;
    }

    public boolean isSetDistributionAddressSequenceNumber() {
        return (this.distributionAddressSequenceNumber!= null);
    }

}
