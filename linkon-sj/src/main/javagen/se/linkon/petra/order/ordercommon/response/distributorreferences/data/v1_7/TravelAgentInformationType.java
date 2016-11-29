
package se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for TravelAgentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelAgencyCustomerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Buyer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7}InvoiceReferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}NotPrintable" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SellerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PayerAccount" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAdress" type="{http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7}CustomerAdressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgentInformationType", propOrder = {
    "salesOrderId",
    "travelAgencyCustomerId",
    "buyer",
    "invoiceReferences",
    "notPrintable",
    "sellerName",
    "customerName",
    "payerAccount",
    "customerAdress"
})
public class TravelAgentInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "TravelAgencyCustomerId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String travelAgencyCustomerId;
    @XmlElement(name = "Buyer", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String buyer;
    @XmlElement(name = "InvoiceReferences")
    protected InvoiceReferencesType invoiceReferences;
    @XmlElement(name = "NotPrintable", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected EmptyType notPrintable;
    @XmlElement(name = "SellerName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String sellerName;
    @XmlElement(name = "CustomerName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerName;
    @XmlElement(name = "PayerAccount", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String payerAccount;
    @XmlElement(name = "CustomerAdress")
    protected CustomerAdressType customerAdress;

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
     * Gets the value of the travelAgencyCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyCustomerId() {
        return travelAgencyCustomerId;
    }

    /**
     * Sets the value of the travelAgencyCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyCustomerId(String value) {
        this.travelAgencyCustomerId = value;
    }

    public boolean isSetTravelAgencyCustomerId() {
        return (this.travelAgencyCustomerId!= null);
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyer(String value) {
        this.buyer = value;
    }

    public boolean isSetBuyer() {
        return (this.buyer!= null);
    }

    /**
     * Gets the value of the invoiceReferences property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReferencesType }
     *     
     */
    public InvoiceReferencesType getInvoiceReferences() {
        return invoiceReferences;
    }

    /**
     * Sets the value of the invoiceReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReferencesType }
     *     
     */
    public void setInvoiceReferences(InvoiceReferencesType value) {
        this.invoiceReferences = value;
    }

    public boolean isSetInvoiceReferences() {
        return (this.invoiceReferences!= null);
    }

    /**
     * Gets the value of the notPrintable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNotPrintable() {
        return notPrintable;
    }

    /**
     * Sets the value of the notPrintable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNotPrintable(EmptyType value) {
        this.notPrintable = value;
    }

    public boolean isSetNotPrintable() {
        return (this.notPrintable!= null);
    }

    /**
     * Gets the value of the sellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets the value of the sellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerName(String value) {
        this.sellerName = value;
    }

    public boolean isSetSellerName() {
        return (this.sellerName!= null);
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public boolean isSetCustomerName() {
        return (this.customerName!= null);
    }

    /**
     * Gets the value of the payerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAccount() {
        return payerAccount;
    }

    /**
     * Sets the value of the payerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAccount(String value) {
        this.payerAccount = value;
    }

    public boolean isSetPayerAccount() {
        return (this.payerAccount!= null);
    }

    /**
     * Gets the value of the customerAdress property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAdressType }
     *     
     */
    public CustomerAdressType getCustomerAdress() {
        return customerAdress;
    }

    /**
     * Sets the value of the customerAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAdressType }
     *     
     */
    public void setCustomerAdress(CustomerAdressType value) {
        this.customerAdress = value;
    }

    public boolean isSetCustomerAdress() {
        return (this.customerAdress!= null);
    }

}
