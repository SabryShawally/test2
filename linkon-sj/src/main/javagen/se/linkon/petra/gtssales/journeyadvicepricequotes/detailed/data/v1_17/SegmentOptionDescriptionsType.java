
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentOptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentOptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentOptionDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}SegmentOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentOptionDescriptionsType", propOrder = {
    "segmentOptionDescription"
})
public class SegmentOptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentOptionDescription", required = true)
    protected List<SegmentOptionDescriptionType> segmentOptionDescription;

    /**
     * Gets the value of the segmentOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentOptionDescriptionType }
     * 
     * 
     */
    public List<SegmentOptionDescriptionType> getSegmentOptionDescription() {
        if (segmentOptionDescription == null) {
            segmentOptionDescription = new ArrayList<SegmentOptionDescriptionType>();
        }
        return this.segmentOptionDescription;
    }

    public boolean isSetSegmentOptionDescription() {
        return ((this.segmentOptionDescription!= null)&&(!this.segmentOptionDescription.isEmpty()));
    }

    public void unsetSegmentOptionDescription() {
        this.segmentOptionDescription = null;
    }

}
