
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerCategoryDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerCategoryDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerCategoryDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}PassengerCategoryDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCategoryDescriptionsType", propOrder = {
    "passengerCategoryDescription"
})
public class PassengerCategoryDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategoryDescription", required = true)
    protected List<PassengerCategoryDescriptionType> passengerCategoryDescription;

    /**
     * Gets the value of the passengerCategoryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCategoryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategoryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryDescriptionType }
     * 
     * 
     */
    public List<PassengerCategoryDescriptionType> getPassengerCategoryDescription() {
        if (passengerCategoryDescription == null) {
            passengerCategoryDescription = new ArrayList<PassengerCategoryDescriptionType>();
        }
        return this.passengerCategoryDescription;
    }

    public boolean isSetPassengerCategoryDescription() {
        return ((this.passengerCategoryDescription!= null)&&(!this.passengerCategoryDescription.isEmpty()));
    }

    public void unsetPassengerCategoryDescription() {
        this.passengerCategoryDescription = null;
    }

}
