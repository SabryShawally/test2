
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerItineraryDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerItineraryDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerItineraryDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}ConsumerItineraryDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerItineraryDescriptionsType", propOrder = {
    "consumerItineraryDescription"
})
public class ConsumerItineraryDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerItineraryDescription", required = true)
    protected List<ConsumerItineraryDescriptionType> consumerItineraryDescription;

    /**
     * Gets the value of the consumerItineraryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerItineraryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerItineraryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerItineraryDescriptionType }
     * 
     * 
     */
    public List<ConsumerItineraryDescriptionType> getConsumerItineraryDescription() {
        if (consumerItineraryDescription == null) {
            consumerItineraryDescription = new ArrayList<ConsumerItineraryDescriptionType>();
        }
        return this.consumerItineraryDescription;
    }

    public boolean isSetConsumerItineraryDescription() {
        return ((this.consumerItineraryDescription!= null)&&(!this.consumerItineraryDescription.isEmpty()));
    }

    public void unsetConsumerItineraryDescription() {
        this.consumerItineraryDescription = null;
    }

}
