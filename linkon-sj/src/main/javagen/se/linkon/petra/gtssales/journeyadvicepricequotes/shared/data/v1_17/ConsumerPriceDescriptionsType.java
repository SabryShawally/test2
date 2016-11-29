
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerPriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerPriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerPriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}ConsumerPriceDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerPriceDescriptionsType", propOrder = {
    "consumerPriceDescription"
})
public class ConsumerPriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerPriceDescription", required = true)
    protected List<ConsumerPriceDescriptionType> consumerPriceDescription;

    /**
     * Gets the value of the consumerPriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerPriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerPriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerPriceDescriptionType }
     * 
     * 
     */
    public List<ConsumerPriceDescriptionType> getConsumerPriceDescription() {
        if (consumerPriceDescription == null) {
            consumerPriceDescription = new ArrayList<ConsumerPriceDescriptionType>();
        }
        return this.consumerPriceDescription;
    }

    public boolean isSetConsumerPriceDescription() {
        return ((this.consumerPriceDescription!= null)&&(!this.consumerPriceDescription.isEmpty()));
    }

    public void unsetConsumerPriceDescription() {
        this.consumerPriceDescription = null;
    }

}
