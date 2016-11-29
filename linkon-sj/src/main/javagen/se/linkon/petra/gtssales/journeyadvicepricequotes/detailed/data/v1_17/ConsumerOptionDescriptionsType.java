
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerOptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerOptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerOptionDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ConsumerOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerOptionDescriptionsType", propOrder = {
    "consumerOptionDescription"
})
public class ConsumerOptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerOptionDescription", required = true)
    protected List<ConsumerOptionDescriptionType> consumerOptionDescription;

    /**
     * Gets the value of the consumerOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerOptionDescriptionType }
     * 
     * 
     */
    public List<ConsumerOptionDescriptionType> getConsumerOptionDescription() {
        if (consumerOptionDescription == null) {
            consumerOptionDescription = new ArrayList<ConsumerOptionDescriptionType>();
        }
        return this.consumerOptionDescription;
    }

    public boolean isSetConsumerOptionDescription() {
        return ((this.consumerOptionDescription!= null)&&(!this.consumerOptionDescription.isEmpty()));
    }

    public void unsetConsumerOptionDescription() {
        this.consumerOptionDescription = null;
    }

}
