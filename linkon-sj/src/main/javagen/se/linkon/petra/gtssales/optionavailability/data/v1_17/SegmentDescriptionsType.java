
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentDescription" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}SegmentDescriptionType" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDescriptionsType", propOrder = {
    "segmentDescription"
})
public class SegmentDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentDescription", required = true)
    protected List<SegmentDescriptionType> segmentDescription;

    /**
     * Gets the value of the segmentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDescriptionType }
     * 
     * 
     */
    public List<SegmentDescriptionType> getSegmentDescription() {
        if (segmentDescription == null) {
            segmentDescription = new ArrayList<SegmentDescriptionType>();
        }
        return this.segmentDescription;
    }

    public boolean isSetSegmentDescription() {
        return ((this.segmentDescription!= null)&&(!this.segmentDescription.isEmpty()));
    }

    public void unsetSegmentDescription() {
        this.segmentDescription = null;
    }

}
