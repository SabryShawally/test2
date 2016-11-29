
package se.linkon.petra.order.orderstorage.changecontract.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A payer specification can give raise to discounts and is specified as either a company customer specification or a private customer identity.
 * 
 * <p>Java class for PayerCustomerSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerCustomerSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CompanyCustomerSpecification" type="{http://petra.linkon.se/order/orderstorage/changecontract/data/v1_10}CompanyCustomerSpecificationType"/&gt;
 *         &lt;element name="PayerPrivateCustomerId" type="{http://petra.linkon.se/commonelements/data/v4_6}CustomerIdType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerCustomerSpecificationType", propOrder = {
    "companyCustomerSpecification",
    "payerPrivateCustomerId"
})
public class PayerCustomerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CompanyCustomerSpecification")
    protected CompanyCustomerSpecificationType companyCustomerSpecification;
    @XmlElement(name = "PayerPrivateCustomerId")
    protected String payerPrivateCustomerId;

    /**
     * Gets the value of the companyCustomerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyCustomerSpecificationType }
     *     
     */
    public CompanyCustomerSpecificationType getCompanyCustomerSpecification() {
        return companyCustomerSpecification;
    }

    /**
     * Sets the value of the companyCustomerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyCustomerSpecificationType }
     *     
     */
    public void setCompanyCustomerSpecification(CompanyCustomerSpecificationType value) {
        this.companyCustomerSpecification = value;
    }

    public boolean isSetCompanyCustomerSpecification() {
        return (this.companyCustomerSpecification!= null);
    }

    /**
     * Gets the value of the payerPrivateCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerPrivateCustomerId() {
        return payerPrivateCustomerId;
    }

    /**
     * Sets the value of the payerPrivateCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerPrivateCustomerId(String value) {
        this.payerPrivateCustomerId = value;
    }

    public boolean isSetPayerPrivateCustomerId() {
        return (this.payerPrivateCustomerId!= null);
    }

}
