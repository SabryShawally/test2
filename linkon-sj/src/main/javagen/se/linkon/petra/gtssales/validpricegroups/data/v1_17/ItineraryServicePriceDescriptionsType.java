
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryServicePriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryServicePriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryServicePriceDescription" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryServicePriceDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryServicePriceDescriptionsType", propOrder = {
    "itineraryServicePriceDescription"
})
public class ItineraryServicePriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryServicePriceDescription", required = true)
    protected List<ItineraryServicePriceDescriptionType> itineraryServicePriceDescription;

    /**
     * Gets the value of the itineraryServicePriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryServicePriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryServicePriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryServicePriceDescriptionType }
     * 
     * 
     */
    public List<ItineraryServicePriceDescriptionType> getItineraryServicePriceDescription() {
        if (itineraryServicePriceDescription == null) {
            itineraryServicePriceDescription = new ArrayList<ItineraryServicePriceDescriptionType>();
        }
        return this.itineraryServicePriceDescription;
    }

    public boolean isSetItineraryServicePriceDescription() {
        return ((this.itineraryServicePriceDescription!= null)&&(!this.itineraryServicePriceDescription.isEmpty()));
    }

    public void unsetItineraryServicePriceDescription() {
        this.itineraryServicePriceDescription = null;
    }

}
