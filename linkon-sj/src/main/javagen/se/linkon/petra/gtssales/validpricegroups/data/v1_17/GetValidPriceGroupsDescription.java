
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

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
 *         &lt;element name="ItineraryServicePriceDescriptions" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryServicePriceDescriptionsType" minOccurs="0"/&gt;
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
    "itineraryServicePriceDescriptions"
})
@XmlRootElement(name = "GetValidPriceGroupsDescription")
public class GetValidPriceGroupsDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryServicePriceDescriptions")
    protected ItineraryServicePriceDescriptionsType itineraryServicePriceDescriptions;

    /**
     * Gets the value of the itineraryServicePriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryServicePriceDescriptionsType }
     *     
     */
    public ItineraryServicePriceDescriptionsType getItineraryServicePriceDescriptions() {
        return itineraryServicePriceDescriptions;
    }

    /**
     * Sets the value of the itineraryServicePriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryServicePriceDescriptionsType }
     *     
     */
    public void setItineraryServicePriceDescriptions(ItineraryServicePriceDescriptionsType value) {
        this.itineraryServicePriceDescriptions = value;
    }

    public boolean isSetItineraryServicePriceDescriptions() {
        return (this.itineraryServicePriceDescriptions!= null);
    }

}
