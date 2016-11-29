
package se.linkon.petra.order.orderstorage.distributor.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The consumers that should remain, together with their optional discounts.
 * 
 * <p>Java class for TravelAgentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/orderstorage/distributor/data/v1_10}TravelAgencyCustomerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Buyer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/orderstorage/distributor/data/v1_10}PrintHandling" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SellerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PayerAccount" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAddress" type="{http://petra.linkon.se/order/orderstorage/distributor/data/v1_10}CustomerAddressType" minOccurs="0"/&gt;
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
    "travelAgencyCustomerId",
    "buyer",
    "printHandling",
    "sellerName",
    "customerName",
    "payerAccount",
    "customerAddress"
})
public class TravelAgentInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelAgencyCustomerId")
    protected String travelAgencyCustomerId;
    @XmlElement(name = "Buyer", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String buyer;
    @XmlElement(name = "PrintHandling")
    @XmlSchemaType(name = "string")
    protected PrintHandlingType printHandling;
    @XmlElement(name = "SellerName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String sellerName;
    @XmlElement(name = "CustomerName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerName;
    @XmlElement(name = "PayerAccount", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String payerAccount;
    @XmlElement(name = "CustomerAddress")
    protected CustomerAddressType customerAddress;

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
     * Gets the value of the printHandling property.
     * 
     * @return
     *     possible object is
     *     {@link PrintHandlingType }
     *     
     */
    public PrintHandlingType getPrintHandling() {
        return printHandling;
    }

    /**
     * Sets the value of the printHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintHandlingType }
     *     
     */
    public void setPrintHandling(PrintHandlingType value) {
        this.printHandling = value;
    }

    public boolean isSetPrintHandling() {
        return (this.printHandling!= null);
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
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setCustomerAddress(CustomerAddressType value) {
        this.customerAddress = value;
    }

    public boolean isSetCustomerAddress() {
        return (this.customerAddress!= null);
    }

}
