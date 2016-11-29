
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTypeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelTypeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelTypeDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}TravelTypeDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTypeDetail", propOrder = {
    "travelTypeDetailType"
})
public class TravelTypeDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelTypeDetailType", required = true)
    protected List<TravelTypeDetailType> travelTypeDetailType;

    /**
     * Gets the value of the travelTypeDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelTypeDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelTypeDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelTypeDetailType }
     * 
     * 
     */
    public List<TravelTypeDetailType> getTravelTypeDetailType() {
        if (travelTypeDetailType == null) {
            travelTypeDetailType = new ArrayList<TravelTypeDetailType>();
        }
        return this.travelTypeDetailType;
    }

    public boolean isSetTravelTypeDetailType() {
        return ((this.travelTypeDetailType!= null)&&(!this.travelTypeDetailType.isEmpty()));
    }

    public void unsetTravelTypeDetailType() {
        this.travelTypeDetailType = null;
    }

}
