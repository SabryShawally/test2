
package se.linkon.petra.order.orderstorage.changecontract.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.AddressTypeCodeType;
import se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7.TotalPriceDescriptionType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.MembershipIdentificationType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element name="PayerCustomerId" type="{http://petra.linkon.se/commonelements/data/v4_6}CustomerIdType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ContractNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}MembershipIdentification" minOccurs="0"/&gt;
 *         &lt;element name="DistributionAddressType" type="{http://petra.linkon.se/commonelements/data/v4_6}AddressTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DistributionAddressSequenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}TotalPriceDescription"/&gt;
 *         &lt;element name="OrderItems" type="{http://petra.linkon.se/order/orderstorage/changecontract/data/v1_10}ChangeCustomerAndContractOrderItemsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salesOrderId",
    "payerCustomerId",
    "contractNumber",
    "membershipIdentification",
    "distributionAddressType",
    "distributionAddressSequenceNumber",
    "totalPriceDescription",
    "orderItems"
})
@XmlRootElement(name = "ChangeCustomerAndContractResponse")
public class ChangeCustomerAndContractResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "PayerCustomerId")
    protected String payerCustomerId;
    @XmlElement(name = "ContractNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer contractNumber;
    @XmlElement(name = "MembershipIdentification", namespace = "http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7")
    protected MembershipIdentificationType membershipIdentification;
    @XmlElement(name = "DistributionAddressType")
    protected AddressTypeCodeType distributionAddressType;
    @XmlElement(name = "DistributionAddressSequenceNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected Integer distributionAddressSequenceNumber;
    @XmlElement(name = "TotalPriceDescription", namespace = "http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", required = true)
    protected TotalPriceDescriptionType totalPriceDescription;
    @XmlElement(name = "OrderItems")
    protected ChangeCustomerAndContractOrderItemsType orderItems;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderId(String value) {
        this.salesOrderId = value;
    }

    public boolean isSetSalesOrderId() {
        return (this.salesOrderId!= null);
    }

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractNumber(Integer value) {
        this.contractNumber = value;
    }

    public boolean isSetContractNumber() {
        return (this.contractNumber!= null);
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

    /**
     * Gets the value of the distributionAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public AddressTypeCodeType getDistributionAddressType() {
        return distributionAddressType;
    }

    /**
     * Sets the value of the distributionAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public void setDistributionAddressType(AddressTypeCodeType value) {
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

    /**
     * Gets the value of the totalPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceDescriptionType }
     *     
     */
    public TotalPriceDescriptionType getTotalPriceDescription() {
        return totalPriceDescription;
    }

    /**
     * Sets the value of the totalPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceDescriptionType }
     *     
     */
    public void setTotalPriceDescription(TotalPriceDescriptionType value) {
        this.totalPriceDescription = value;
    }

    public boolean isSetTotalPriceDescription() {
        return (this.totalPriceDescription!= null);
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustomerAndContractOrderItemsType }
     *     
     */
    public ChangeCustomerAndContractOrderItemsType getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustomerAndContractOrderItemsType }
     *     
     */
    public void setOrderItems(ChangeCustomerAndContractOrderItemsType value) {
        this.orderItems = value;
    }

    public boolean isSetOrderItems() {
        return (this.orderItems!= null);
    }

}
