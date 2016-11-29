
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="EditActionItineraryServicePriceDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionItineraryServicePriceDescriptionsType" minOccurs="0"/&gt;
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
    "editActionItineraryServicePriceDescriptions"
})
@XmlRootElement(name = "GetTransportActionsResponse")
public class GetTransportActionsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionItineraryServicePriceDescriptions")
    protected EditActionItineraryServicePriceDescriptionsType editActionItineraryServicePriceDescriptions;

    /**
     * Gets the value of the editActionItineraryServicePriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionItineraryServicePriceDescriptionsType }
     *     
     */
    public EditActionItineraryServicePriceDescriptionsType getEditActionItineraryServicePriceDescriptions() {
        return editActionItineraryServicePriceDescriptions;
    }

    /**
     * Sets the value of the editActionItineraryServicePriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionItineraryServicePriceDescriptionsType }
     *     
     */
    public void setEditActionItineraryServicePriceDescriptions(EditActionItineraryServicePriceDescriptionsType value) {
        this.editActionItineraryServicePriceDescriptions = value;
    }

    public boolean isSetEditActionItineraryServicePriceDescriptions() {
        return (this.editActionItineraryServicePriceDescriptions!= null);
    }

}
