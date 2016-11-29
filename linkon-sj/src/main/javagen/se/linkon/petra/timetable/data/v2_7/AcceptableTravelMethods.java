
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelMethodProductCombination" type="{http://petra.linkon.se/timetable/data/v2_7}TravelMethodProductCombination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "travelMethodProductCombination"
})
@XmlRootElement(name = "AcceptableTravelMethods")
public class AcceptableTravelMethods
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelMethodProductCombination")
    protected List<TravelMethodProductCombination> travelMethodProductCombination;

    /**
     * Gets the value of the travelMethodProductCombination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelMethodProductCombination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelMethodProductCombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelMethodProductCombination }
     * 
     * 
     */
    public List<TravelMethodProductCombination> getTravelMethodProductCombination() {
        if (travelMethodProductCombination == null) {
            travelMethodProductCombination = new ArrayList<TravelMethodProductCombination>();
        }
        return this.travelMethodProductCombination;
    }

    public boolean isSetTravelMethodProductCombination() {
        return ((this.travelMethodProductCombination!= null)&&(!this.travelMethodProductCombination.isEmpty()));
    }

    public void unsetTravelMethodProductCombination() {
        this.travelMethodProductCombination = null;
    }

}
