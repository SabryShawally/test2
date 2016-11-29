
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerEditActionOptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerEditActionOptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerEditActionOptionDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}ConsumerEditActionOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerEditActionOptionDescriptionsType", propOrder = {
    "consumerEditActionOptionDescription"
})
public class ConsumerEditActionOptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerEditActionOptionDescription", required = true)
    protected List<ConsumerEditActionOptionDescriptionType> consumerEditActionOptionDescription;

    /**
     * Gets the value of the consumerEditActionOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerEditActionOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerEditActionOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerEditActionOptionDescriptionType }
     * 
     * 
     */
    public List<ConsumerEditActionOptionDescriptionType> getConsumerEditActionOptionDescription() {
        if (consumerEditActionOptionDescription == null) {
            consumerEditActionOptionDescription = new ArrayList<ConsumerEditActionOptionDescriptionType>();
        }
        return this.consumerEditActionOptionDescription;
    }

    public boolean isSetConsumerEditActionOptionDescription() {
        return ((this.consumerEditActionOptionDescription!= null)&&(!this.consumerEditActionOptionDescription.isEmpty()));
    }

    public void unsetConsumerEditActionOptionDescription() {
        this.consumerEditActionOptionDescription = null;
    }

}
