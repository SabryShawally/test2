
package se.linkon.petra.gtssales.edittransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.EditActionType;


/**
 * <p>Java class for OptionSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element name="ComponentEditAction" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}EditActionType"/&gt;
 *         &lt;element name="ComponentDeleteReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSpecificationType", propOrder = {
    "componentNumber",
    "variantNumber",
    "componentEditAction",
    "componentDeleteReasonCode"
})
public class OptionSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "ComponentEditAction", required = true)
    @XmlSchemaType(name = "string")
    protected EditActionType componentEditAction;
    @XmlElement(name = "ComponentDeleteReasonCode")
    protected String componentDeleteReasonCode;

    /**
     * Gets the value of the componentNumber property.
     * 
     */
    public int getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     */
    public void setComponentNumber(int value) {
        this.componentNumber = value;
    }

    public boolean isSetComponentNumber() {
        return true;
    }

    /**
     * Gets the value of the variantNumber property.
     * 
     */
    public int getVariantNumber() {
        return variantNumber;
    }

    /**
     * Sets the value of the variantNumber property.
     * 
     */
    public void setVariantNumber(int value) {
        this.variantNumber = value;
    }

    public boolean isSetVariantNumber() {
        return true;
    }

    /**
     * Gets the value of the componentEditAction property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionType }
     *     
     */
    public EditActionType getComponentEditAction() {
        return componentEditAction;
    }

    /**
     * Sets the value of the componentEditAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionType }
     *     
     */
    public void setComponentEditAction(EditActionType value) {
        this.componentEditAction = value;
    }

    public boolean isSetComponentEditAction() {
        return (this.componentEditAction!= null);
    }

    /**
     * Gets the value of the componentDeleteReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDeleteReasonCode() {
        return componentDeleteReasonCode;
    }

    /**
     * Sets the value of the componentDeleteReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDeleteReasonCode(String value) {
        this.componentDeleteReasonCode = value;
    }

    public boolean isSetComponentDeleteReasonCode() {
        return (this.componentDeleteReasonCode!= null);
    }

}
