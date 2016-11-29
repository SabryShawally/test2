
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallerPrincipalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallerPrincipalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesUnitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesPointNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesPointUnitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesPointCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionLogging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallerPrincipalType", propOrder = {
    "name",
    "salesUnitKey",
    "salesChannelType",
    "salesPointNumber",
    "salesPointUnitNumber",
    "salesPointCategory",
    "languageCode",
    "currencyCode",
    "salesChannelCode",
    "cardSystem",
    "endUserId",
    "operationName",
    "requestId",
    "internalRequestId",
    "transactionLogging"
})
public class CallerPrincipalType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    protected String name;
    protected String salesUnitKey;
    protected String salesChannelType;
    protected String salesPointNumber;
    protected String salesPointUnitNumber;
    protected String salesPointCategory;
    protected String languageCode;
    protected String currencyCode;
    protected String salesChannelCode;
    protected String cardSystem;
    protected String endUserId;
    protected String operationName;
    protected String requestId;
    protected String internalRequestId;
    protected String transactionLogging;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the salesUnitKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitKey() {
        return salesUnitKey;
    }

    /**
     * Sets the value of the salesUnitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitKey(String value) {
        this.salesUnitKey = value;
    }

    public boolean isSetSalesUnitKey() {
        return (this.salesUnitKey!= null);
    }

    /**
     * Gets the value of the salesChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelType() {
        return salesChannelType;
    }

    /**
     * Sets the value of the salesChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelType(String value) {
        this.salesChannelType = value;
    }

    public boolean isSetSalesChannelType() {
        return (this.salesChannelType!= null);
    }

    /**
     * Gets the value of the salesPointNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPointNumber() {
        return salesPointNumber;
    }

    /**
     * Sets the value of the salesPointNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPointNumber(String value) {
        this.salesPointNumber = value;
    }

    public boolean isSetSalesPointNumber() {
        return (this.salesPointNumber!= null);
    }

    /**
     * Gets the value of the salesPointUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPointUnitNumber() {
        return salesPointUnitNumber;
    }

    /**
     * Sets the value of the salesPointUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPointUnitNumber(String value) {
        this.salesPointUnitNumber = value;
    }

    public boolean isSetSalesPointUnitNumber() {
        return (this.salesPointUnitNumber!= null);
    }

    /**
     * Gets the value of the salesPointCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPointCategory() {
        return salesPointCategory;
    }

    /**
     * Sets the value of the salesPointCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPointCategory(String value) {
        this.salesPointCategory = value;
    }

    public boolean isSetSalesPointCategory() {
        return (this.salesPointCategory!= null);
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    public boolean isSetLanguageCode() {
        return (this.languageCode!= null);
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public boolean isSetCurrencyCode() {
        return (this.currencyCode!= null);
    }

    /**
     * Gets the value of the salesChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelCode() {
        return salesChannelCode;
    }

    /**
     * Sets the value of the salesChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelCode(String value) {
        this.salesChannelCode = value;
    }

    public boolean isSetSalesChannelCode() {
        return (this.salesChannelCode!= null);
    }

    /**
     * Gets the value of the cardSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSystem() {
        return cardSystem;
    }

    /**
     * Sets the value of the cardSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSystem(String value) {
        this.cardSystem = value;
    }

    public boolean isSetCardSystem() {
        return (this.cardSystem!= null);
    }

    /**
     * Gets the value of the endUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserId() {
        return endUserId;
    }

    /**
     * Sets the value of the endUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserId(String value) {
        this.endUserId = value;
    }

    public boolean isSetEndUserId() {
        return (this.endUserId!= null);
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    public boolean isSetOperationName() {
        return (this.operationName!= null);
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    public boolean isSetRequestId() {
        return (this.requestId!= null);
    }

    /**
     * Gets the value of the internalRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRequestId() {
        return internalRequestId;
    }

    /**
     * Sets the value of the internalRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRequestId(String value) {
        this.internalRequestId = value;
    }

    public boolean isSetInternalRequestId() {
        return (this.internalRequestId!= null);
    }

    /**
     * Gets the value of the transactionLogging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLogging() {
        return transactionLogging;
    }

    /**
     * Sets the value of the transactionLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLogging(String value) {
        this.transactionLogging = value;
    }

    public boolean isSetTransactionLogging() {
        return (this.transactionLogging!= null);
    }

}
