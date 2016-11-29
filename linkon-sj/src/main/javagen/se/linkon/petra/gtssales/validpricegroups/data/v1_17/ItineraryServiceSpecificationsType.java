
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryServiceSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryServiceSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryServiceSpecification" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryServiceSpecificationType" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryServiceSpecificationsType", propOrder = {
    "itineraryServiceSpecification"
})
public class ItineraryServiceSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryServiceSpecification", required = true)
    protected List<ItineraryServiceSpecificationType> itineraryServiceSpecification;

    /**
     * Gets the value of the itineraryServiceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryServiceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryServiceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryServiceSpecificationType }
     * 
     * 
     */
    public List<ItineraryServiceSpecificationType> getItineraryServiceSpecification() {
        if (itineraryServiceSpecification == null) {
            itineraryServiceSpecification = new ArrayList<ItineraryServiceSpecificationType>();
        }
        return this.itineraryServiceSpecification;
    }

    public boolean isSetItineraryServiceSpecification() {
        return ((this.itineraryServiceSpecification!= null)&&(!this.itineraryServiceSpecification.isEmpty()));
    }

    public void unsetItineraryServiceSpecification() {
        this.itineraryServiceSpecification = null;
    }

}
