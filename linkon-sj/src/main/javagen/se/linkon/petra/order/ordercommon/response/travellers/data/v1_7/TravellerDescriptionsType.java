
package se.linkon.petra.order.ordercommon.response.travellers.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the travellers connected to the order
 * 				item(s) described in the response.
 * 			
 * 
 * <p>Java class for TravellerDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravellerDescription" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}TravellerDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDescriptionsType", propOrder = {
    "travellerDescription"
})
public class TravellerDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerDescription", required = true)
    protected List<TravellerDescriptionType> travellerDescription;

    /**
     * Gets the value of the travellerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerDescriptionType }
     * 
     * 
     */
    public List<TravellerDescriptionType> getTravellerDescription() {
        if (travellerDescription == null) {
            travellerDescription = new ArrayList<TravellerDescriptionType>();
        }
        return this.travellerDescription;
    }

    public boolean isSetTravellerDescription() {
        return ((this.travellerDescription!= null)&&(!this.travellerDescription.isEmpty()));
    }

    public void unsetTravellerDescription() {
        this.travellerDescription = null;
    }

}
