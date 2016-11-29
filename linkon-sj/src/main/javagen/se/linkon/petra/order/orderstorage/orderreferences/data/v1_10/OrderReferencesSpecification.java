
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.MembershipIdentificationType;


/**
 * Structure for payer data
 * 
 * <p>Java class for OrderReferencesSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferencesSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistributionAddress" type="{http://petra.linkon.se/order/orderstorage/orderreferences/data/v1_10}DistributionAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PayerReferenceSpecification" type="{http://petra.linkon.se/order/orderstorage/orderreferences/data/v1_10}PayerReferenceSpecification" minOccurs="0"/&gt;
 *         &lt;element name="MembershipIdentification" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}MembershipIdentificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferencesSpecification", propOrder = {
    "distributionAddress",
    "payerReferenceSpecification",
    "membershipIdentification"
})
public class OrderReferencesSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DistributionAddress")
    protected DistributionAddressType distributionAddress;
    @XmlElement(name = "PayerReferenceSpecification")
    protected PayerReferenceSpecification payerReferenceSpecification;
    @XmlElement(name = "MembershipIdentification")
    protected MembershipIdentificationType membershipIdentification;

    /**
     * Gets the value of the distributionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionAddressType }
     *     
     */
    public DistributionAddressType getDistributionAddress() {
        return distributionAddress;
    }

    /**
     * Sets the value of the distributionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionAddressType }
     *     
     */
    public void setDistributionAddress(DistributionAddressType value) {
        this.distributionAddress = value;
    }

    public boolean isSetDistributionAddress() {
        return (this.distributionAddress!= null);
    }

    /**
     * Gets the value of the payerReferenceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link PayerReferenceSpecification }
     *     
     */
    public PayerReferenceSpecification getPayerReferenceSpecification() {
        return payerReferenceSpecification;
    }

    /**
     * Sets the value of the payerReferenceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerReferenceSpecification }
     *     
     */
    public void setPayerReferenceSpecification(PayerReferenceSpecification value) {
        this.payerReferenceSpecification = value;
    }

    public boolean isSetPayerReferenceSpecification() {
        return (this.payerReferenceSpecification!= null);
    }

    /**
     * Gets the value of the membershipIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipIdentificationType }
     *     
     */
    public MembershipIdentificationType getMembershipIdentification() {
        return membershipIdentification;
    }

    /**
     * Sets the value of the membershipIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipIdentificationType }
     *     
     */
    public void setMembershipIdentification(MembershipIdentificationType value) {
        this.membershipIdentification = value;
    }

    public boolean isSetMembershipIdentification() {
        return (this.membershipIdentification!= null);
    }

}
