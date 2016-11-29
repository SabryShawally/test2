
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotPreferredTravelMethodProductCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotPreferredTravelMethodProductCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelMethodProductCodes" type="{http://petra.linkon.se/timetable/data/v2_7}TravelMethodProductCombination" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotPreferredTravelMethodProductCodesType", propOrder = {
    "travelMethodProductCodes"
})
public class NotPreferredTravelMethodProductCodesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelMethodProductCodes", required = true)
    protected List<TravelMethodProductCombination> travelMethodProductCodes;

    /**
     * Gets the value of the travelMethodProductCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelMethodProductCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelMethodProductCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelMethodProductCombination }
     * 
     * 
     */
    public List<TravelMethodProductCombination> getTravelMethodProductCodes() {
        if (travelMethodProductCodes == null) {
            travelMethodProductCodes = new ArrayList<TravelMethodProductCombination>();
        }
        return this.travelMethodProductCodes;
    }

    public boolean isSetTravelMethodProductCodes() {
        return ((this.travelMethodProductCodes!= null)&&(!this.travelMethodProductCodes.isEmpty()));
    }

    public void unsetTravelMethodProductCodes() {
        this.travelMethodProductCodes = null;
    }

}
