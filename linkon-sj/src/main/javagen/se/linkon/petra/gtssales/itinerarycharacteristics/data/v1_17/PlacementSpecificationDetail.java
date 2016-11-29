
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementSpecificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementSpecificationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementSpecificationDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}PlacementSpecificationDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementSpecificationDetail", propOrder = {
    "placementSpecificationDetailType"
})
public class PlacementSpecificationDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementSpecificationDetailType", required = true)
    protected List<PlacementSpecificationDetailType> placementSpecificationDetailType;

    /**
     * Gets the value of the placementSpecificationDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementSpecificationDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementSpecificationDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementSpecificationDetailType }
     * 
     * 
     */
    public List<PlacementSpecificationDetailType> getPlacementSpecificationDetailType() {
        if (placementSpecificationDetailType == null) {
            placementSpecificationDetailType = new ArrayList<PlacementSpecificationDetailType>();
        }
        return this.placementSpecificationDetailType;
    }

    public boolean isSetPlacementSpecificationDetailType() {
        return ((this.placementSpecificationDetailType!= null)&&(!this.placementSpecificationDetailType.isEmpty()));
    }

    public void unsetPlacementSpecificationDetailType() {
        this.placementSpecificationDetailType = null;
    }

}
