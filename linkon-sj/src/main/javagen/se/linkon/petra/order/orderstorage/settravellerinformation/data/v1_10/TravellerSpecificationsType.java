
package se.linkon.petra.order.orderstorage.settravellerinformation.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the travellers to be updated.
 * 			
 * 
 * <p>Java class for TravellerSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TravellerSpecification" type="{http://petra.linkon.se/order/orderstorage/settravellerinformation/data/v1_10}TravellerSpecificationType" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerSpecificationsType", propOrder = {
    "travellerSpecification"
})
public class TravellerSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerSpecification")
    protected List<TravellerSpecificationType> travellerSpecification;

    /**
     * Gets the value of the travellerSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerSpecificationType }
     * 
     * 
     */
    public List<TravellerSpecificationType> getTravellerSpecification() {
        if (travellerSpecification == null) {
            travellerSpecification = new ArrayList<TravellerSpecificationType>();
        }
        return this.travellerSpecification;
    }

    public boolean isSetTravellerSpecification() {
        return ((this.travellerSpecification!= null)&&(!this.travellerSpecification.isEmpty()));
    }

    public void unsetTravellerSpecification() {
        this.travellerSpecification = null;
    }

}
