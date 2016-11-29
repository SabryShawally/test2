
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for consumer specifications.
 * 			
 * 
 * <p>Java class for ConsumerSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerSpecification" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}ConsumerSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerSpecificationsType", propOrder = {
    "consumerSpecification"
})
public class ConsumerSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerSpecification", required = true)
    protected List<ConsumerSpecificationType> consumerSpecification;

    /**
     * Gets the value of the consumerSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerSpecificationType }
     * 
     * 
     */
    public List<ConsumerSpecificationType> getConsumerSpecification() {
        if (consumerSpecification == null) {
            consumerSpecification = new ArrayList<ConsumerSpecificationType>();
        }
        return this.consumerSpecification;
    }

    public boolean isSetConsumerSpecification() {
        return ((this.consumerSpecification!= null)&&(!this.consumerSpecification.isEmpty()));
    }

    public void unsetConsumerSpecification() {
        this.consumerSpecification = null;
    }

}
