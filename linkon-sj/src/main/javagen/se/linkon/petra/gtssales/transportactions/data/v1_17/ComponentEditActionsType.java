
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.EditActionTypeCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.ErrorMessageType;


/**
 * <p>Java class for ComponentEditActionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentEditActionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentEditAction" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}EditActionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ErrorMessageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentEditActionsType", propOrder = {
    "componentEditAction",
    "errorMessage"
})
public class ComponentEditActionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentEditAction")
    protected List<EditActionTypeCodeType> componentEditAction;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessageType errorMessage;

    /**
     * Gets the value of the componentEditAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentEditAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentEditAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditActionTypeCodeType }
     * 
     * 
     */
    public List<EditActionTypeCodeType> getComponentEditAction() {
        if (componentEditAction == null) {
            componentEditAction = new ArrayList<EditActionTypeCodeType>();
        }
        return this.componentEditAction;
    }

    public boolean isSetComponentEditAction() {
        return ((this.componentEditAction!= null)&&(!this.componentEditAction.isEmpty()));
    }

    public void unsetComponentEditAction() {
        this.componentEditAction = null;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    public boolean isSetErrorMessage() {
        return (this.errorMessage!= null);
    }

}
