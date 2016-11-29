
package se.linkon.petra.gtssales.seatavailability.detail.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed seat availability segment response.
 * Contains a segment reference and a list of placement descriptions.
 * 
 * <p>Java class for SegmentDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="hasSeatmap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PlacementDescription" type="{http://petra.linkon.se/gtssales/seatavailability/detail/data/v1_17}PlacementDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDetailResponse", propOrder = {
    "segmentReference",
    "hasSeatmap",
    "placementDescription"
})
public class SegmentDetailResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(defaultValue = "false")
    protected boolean hasSeatmap;
    @XmlElement(name = "PlacementDescription")
    protected List<PlacementDescriptionType> placementDescription;

    /**
     * Gets the value of the segmentReference property.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    public boolean isSetSegmentReference() {
        return true;
    }

    /**
     * Gets the value of the hasSeatmap property.
     * 
     */
    public boolean isHasSeatmap() {
        return hasSeatmap;
    }

    /**
     * Sets the value of the hasSeatmap property.
     * 
     */
    public void setHasSeatmap(boolean value) {
        this.hasSeatmap = value;
    }

    public boolean isSetHasSeatmap() {
        return true;
    }

    /**
     * Gets the value of the placementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementDescriptionType }
     * 
     * 
     */
    public List<PlacementDescriptionType> getPlacementDescription() {
        if (placementDescription == null) {
            placementDescription = new ArrayList<PlacementDescriptionType>();
        }
        return this.placementDescription;
    }

    public boolean isSetPlacementDescription() {
        return ((this.placementDescription!= null)&&(!this.placementDescription.isEmpty()));
    }

    public void unsetPlacementDescription() {
        this.placementDescription = null;
    }

}
