
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a list of between 1-10 journey advice
 * 				specifications.
 * 				10 is the maximum allowed number of journey advice
 * 				per request but
 * 				this number may be further limited by specific sales
 * 				unit
 * 				restrictions!
 * 			
 * 
 * <p>Java class for JourneyAdviceSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyAdviceSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyAdviceSpecification" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}JourneyAdviceSpecificationType" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyAdviceSpecificationsType", propOrder = {
    "journeyAdviceSpecification"
})
public class JourneyAdviceSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyAdviceSpecification", required = true)
    protected List<JourneyAdviceSpecificationType> journeyAdviceSpecification;

    /**
     * Gets the value of the journeyAdviceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyAdviceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyAdviceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyAdviceSpecificationType }
     * 
     * 
     */
    public List<JourneyAdviceSpecificationType> getJourneyAdviceSpecification() {
        if (journeyAdviceSpecification == null) {
            journeyAdviceSpecification = new ArrayList<JourneyAdviceSpecificationType>();
        }
        return this.journeyAdviceSpecification;
    }

    public boolean isSetJourneyAdviceSpecification() {
        return ((this.journeyAdviceSpecification!= null)&&(!this.journeyAdviceSpecification.isEmpty()));
    }

    public void unsetJourneyAdviceSpecification() {
        this.journeyAdviceSpecification = null;
    }

}
