
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerSegmentDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerSegmentDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerSegmentDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}ConsumerSegmentDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerSegmentDescriptionsType", propOrder = {
    "consumerSegmentDescription"
})
public class ConsumerSegmentDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerSegmentDescription", required = true)
    protected List<ConsumerSegmentDescriptionType> consumerSegmentDescription;

    /**
     * Gets the value of the consumerSegmentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerSegmentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerSegmentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerSegmentDescriptionType }
     * 
     * 
     */
    public List<ConsumerSegmentDescriptionType> getConsumerSegmentDescription() {
        if (consumerSegmentDescription == null) {
            consumerSegmentDescription = new ArrayList<ConsumerSegmentDescriptionType>();
        }
        return this.consumerSegmentDescription;
    }

    public boolean isSetConsumerSegmentDescription() {
        return ((this.consumerSegmentDescription!= null)&&(!this.consumerSegmentDescription.isEmpty()));
    }

    public void unsetConsumerSegmentDescription() {
        this.consumerSegmentDescription = null;
    }

}
