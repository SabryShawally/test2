
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentAvailabilityDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentAvailabilityDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentAvailabilityDescription" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}ComponentAvailabilityDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentAvailabilityDescriptionsType", propOrder = {
    "componentAvailabilityDescription"
})
public class ComponentAvailabilityDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentAvailabilityDescription", required = true)
    protected List<ComponentAvailabilityDescriptionType> componentAvailabilityDescription;

    /**
     * Gets the value of the componentAvailabilityDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentAvailabilityDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentAvailabilityDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentAvailabilityDescriptionType }
     * 
     * 
     */
    public List<ComponentAvailabilityDescriptionType> getComponentAvailabilityDescription() {
        if (componentAvailabilityDescription == null) {
            componentAvailabilityDescription = new ArrayList<ComponentAvailabilityDescriptionType>();
        }
        return this.componentAvailabilityDescription;
    }

    public boolean isSetComponentAvailabilityDescription() {
        return ((this.componentAvailabilityDescription!= null)&&(!this.componentAvailabilityDescription.isEmpty()));
    }

    public void unsetComponentAvailabilityDescription() {
        this.componentAvailabilityDescription = null;
    }

}
