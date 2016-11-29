
package se.linkon.petra.order.orderstorage.changecontract.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A company customer specification contains the id of
 * 				the customer and
 * 				the contract number being used for this query.
 * 			
 * 
 * <p>Java class for CompanyCustomerSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyCustomerSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PayerCustomerId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ContractNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyCustomerSpecificationType", propOrder = {
    "payerCustomerId",
    "contractNumber"
})
public class CompanyCustomerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PayerCustomerId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String payerCustomerId;
    @XmlElement(name = "ContractNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected int contractNumber;

    /**
     * Gets the value of the payerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCustomerId() {
        return payerCustomerId;
    }

    /**
     * Sets the value of the payerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCustomerId(String value) {
        this.payerCustomerId = value;
    }

    public boolean isSetPayerCustomerId() {
        return (this.payerCustomerId!= null);
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     */
    public int getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     */
    public void setContractNumber(int value) {
        this.contractNumber = value;
    }

    public boolean isSetContractNumber() {
        return true;
    }

}
