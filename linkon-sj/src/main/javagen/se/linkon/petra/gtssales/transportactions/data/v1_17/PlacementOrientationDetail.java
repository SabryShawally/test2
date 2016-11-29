
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementOrientationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementOrientationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementOrientationDetailType" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}PlacementOrientationDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementOrientationDetail", propOrder = {
    "placementOrientationDetailType"
})
public class PlacementOrientationDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementOrientationDetailType", required = true)
    protected List<PlacementOrientationDetailType> placementOrientationDetailType;

    /**
     * Gets the value of the placementOrientationDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementOrientationDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementOrientationDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementOrientationDetailType }
     * 
     * 
     */
    public List<PlacementOrientationDetailType> getPlacementOrientationDetailType() {
        if (placementOrientationDetailType == null) {
            placementOrientationDetailType = new ArrayList<PlacementOrientationDetailType>();
        }
        return this.placementOrientationDetailType;
    }

    public boolean isSetPlacementOrientationDetailType() {
        return ((this.placementOrientationDetailType!= null)&&(!this.placementOrientationDetailType.isEmpty()));
    }

    public void unsetPlacementOrientationDetailType() {
        this.placementOrientationDetailType = null;
    }

}
