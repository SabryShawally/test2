
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The list of placement orientations.
 * 			
 * 
 * <p>Java class for PlacementOrientationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementOrientationListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orientation" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}OrientationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementOrientationListType", propOrder = {
    "orientation"
})
public class PlacementOrientationListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Orientation")
    protected List<OrientationType> orientation;

    /**
     * Gets the value of the orientation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrientationType }
     * 
     * 
     */
    public List<OrientationType> getOrientation() {
        if (orientation == null) {
            orientation = new ArrayList<OrientationType>();
        }
        return this.orientation;
    }

    public boolean isSetOrientation() {
        return ((this.orientation!= null)&&(!this.orientation.isEmpty()));
    }

    public void unsetOrientation() {
        this.orientation = null;
    }

}
