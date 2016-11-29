
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.ExceptionSeverityType;


/**
 * 
 *         Error type indicating cause of error
 *       
 * 
 * <p>Java class for ExceptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExceptionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Severity" type="{http://petra.linkon.se/commonelements/data/v4_6}ExceptionSeverityType"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SystemErrorInformation" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}SystemErrorInformationType" minOccurs="0"/&gt;
 *         &lt;element name="DynamicTexts" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}DynamicTextListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionData", propOrder = {
    "exceptionId",
    "severity",
    "errorCode",
    "errorText",
    "systemErrorInformation",
    "dynamicTexts"
})
public class ExceptionData
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ExceptionId", required = true)
    protected String exceptionId;
    @XmlElement(name = "Severity", required = true)
    @XmlSchemaType(name = "string")
    protected ExceptionSeverityType severity;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorText", required = true, defaultValue = "")
    protected String errorText;
    @XmlElement(name = "SystemErrorInformation")
    protected SystemErrorInformationType systemErrorInformation;
    @XmlElement(name = "DynamicTexts")
    protected DynamicTextListType dynamicTexts;

    /**
     * Gets the value of the exceptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionId() {
        return exceptionId;
    }

    /**
     * Sets the value of the exceptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionId(String value) {
        this.exceptionId = value;
    }

    public boolean isSetExceptionId() {
        return (this.exceptionId!= null);
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionSeverityType }
     *     
     */
    public ExceptionSeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionSeverityType }
     *     
     */
    public void setSeverity(ExceptionSeverityType value) {
        this.severity = value;
    }

    public boolean isSetSeverity() {
        return (this.severity!= null);
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    public boolean isSetErrorCode() {
        return true;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    public boolean isSetErrorText() {
        return (this.errorText!= null);
    }

    /**
     * Gets the value of the systemErrorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SystemErrorInformationType }
     *     
     */
    public SystemErrorInformationType getSystemErrorInformation() {
        return systemErrorInformation;
    }

    /**
     * Sets the value of the systemErrorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemErrorInformationType }
     *     
     */
    public void setSystemErrorInformation(SystemErrorInformationType value) {
        this.systemErrorInformation = value;
    }

    public boolean isSetSystemErrorInformation() {
        return (this.systemErrorInformation!= null);
    }

    /**
     * Gets the value of the dynamicTexts property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicTextListType }
     *     
     */
    public DynamicTextListType getDynamicTexts() {
        return dynamicTexts;
    }

    /**
     * Sets the value of the dynamicTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicTextListType }
     *     
     */
    public void setDynamicTexts(DynamicTextListType value) {
        this.dynamicTexts = value;
    }

    public boolean isSetDynamicTexts() {
        return (this.dynamicTexts!= null);
    }

}
