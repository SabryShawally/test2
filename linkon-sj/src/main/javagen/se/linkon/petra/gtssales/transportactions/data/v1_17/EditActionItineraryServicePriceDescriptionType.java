
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.gtssales.shared.data.v1_17.ErrorMessageType;


/**
 * Describes an itinerary service with pricegroups and optionally fare availability, seat availability and prices or provides an error message.
 * Consists of a ConsumerDescriptions containing travelers and an ItineraryPriceDescription wrapping pricegroup/journey information if no error message is present.
 * 
 * <p>Java class for EditActionItineraryServicePriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionItineraryServicePriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="EditActionItineraryServiceDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionItineraryServiceDescriptionType"/&gt;
 *           &lt;element name="ErrorMessage" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ErrorMessageType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionItineraryServicePriceDescriptionType", propOrder = {
    "orderItemId",
    "editActionItineraryServiceDescription",
    "errorMessage"
})
public class EditActionItineraryServicePriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer orderItemId;
    @XmlElement(name = "EditActionItineraryServiceDescription")
    protected EditActionItineraryServiceDescriptionType editActionItineraryServiceDescription;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessageType errorMessage;

    /**
     * Gets the value of the orderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderItemId(Integer value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return (this.orderItemId!= null);
    }

    /**
     * Gets the value of the editActionItineraryServiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionItineraryServiceDescriptionType }
     *     
     */
    public EditActionItineraryServiceDescriptionType getEditActionItineraryServiceDescription() {
        return editActionItineraryServiceDescription;
    }

    /**
     * Sets the value of the editActionItineraryServiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionItineraryServiceDescriptionType }
     *     
     */
    public void setEditActionItineraryServiceDescription(EditActionItineraryServiceDescriptionType value) {
        this.editActionItineraryServiceDescription = value;
    }

    public boolean isSetEditActionItineraryServiceDescription() {
        return (this.editActionItineraryServiceDescription!= null);
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
