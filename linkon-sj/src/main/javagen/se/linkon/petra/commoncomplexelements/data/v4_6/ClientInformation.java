
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import se.linkon.petra.commonelements.data.v4_6.LanguageCodeType;


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
 *         &lt;element name="SalesUnitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="EndUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InternalRequestId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionLogging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="__p2sInternal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="__p2sInternalCallerPrincipal" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}CallerPrincipalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='skip'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salesUnitKey",
    "applicationName",
    "languageCode",
    "endUserId",
    "requestId",
    "internalRequestId",
    "transactionLogging",
    "p2SInternal",
    "p2SInternalCallerPrincipal"
})
@XmlRootElement(name = "ClientInformation")
public class ClientInformation
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesUnitKey", required = true)
    protected String salesUnitKey;
    @XmlElement(name = "ApplicationName", required = true)
    protected String applicationName;
    @XmlElement(name = "LanguageCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "string")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "EndUserId")
    protected String endUserId;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "InternalRequestId")
    protected String internalRequestId;
    @XmlElement(name = "TransactionLogging")
    protected String transactionLogging;
    @XmlElement(name = "__p2sInternal")
    protected Object p2SInternal;
    @XmlElement(name = "__p2sInternalCallerPrincipal")
    protected CallerPrincipalType p2SInternalCallerPrincipal;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    public boolean isSetApplicationName() {
        return (this.applicationName!= null);
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    public boolean isSetLanguageCode() {
        return (this.languageCode!= null);
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

    /**
     * Gets the value of the p2SInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getP2SInternal() {
        return p2SInternal;
    }

    /**
     * Sets the value of the p2SInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setP2SInternal(Object value) {
        this.p2SInternal = value;
    }

    public boolean isSetP2SInternal() {
        return (this.p2SInternal!= null);
    }

    /**
     * Gets the value of the p2SInternalCallerPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link CallerPrincipalType }
     *     
     */
    public CallerPrincipalType getP2SInternalCallerPrincipal() {
        return p2SInternalCallerPrincipal;
    }

    /**
     * Sets the value of the p2SInternalCallerPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerPrincipalType }
     *     
     */
    public void setP2SInternalCallerPrincipal(CallerPrincipalType value) {
        this.p2SInternalCallerPrincipal = value;
    }

    public boolean isSetP2SInternalCallerPrincipal() {
        return (this.p2SInternalCallerPrincipal!= null);
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
