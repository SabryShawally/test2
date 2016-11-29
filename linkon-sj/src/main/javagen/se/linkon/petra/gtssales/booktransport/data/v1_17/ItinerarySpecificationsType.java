
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItinerarySpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinerarySpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItinerarySpecification" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}ItinerarySpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinerarySpecificationsType", propOrder = {
    "itinerarySpecification"
})
public class ItinerarySpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItinerarySpecification", required = true)
    protected List<ItinerarySpecificationType> itinerarySpecification;

    /**
     * Gets the value of the itinerarySpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerarySpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerarySpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinerarySpecificationType }
     * 
     * 
     */
    public List<ItinerarySpecificationType> getItinerarySpecification() {
        if (itinerarySpecification == null) {
            itinerarySpecification = new ArrayList<ItinerarySpecificationType>();
        }
        return this.itinerarySpecification;
    }

    public boolean isSetItinerarySpecification() {
        return ((this.itinerarySpecification!= null)&&(!this.itinerarySpecification.isEmpty()));
    }

    public void unsetItinerarySpecification() {
        this.itinerarySpecification = null;
    }

}
