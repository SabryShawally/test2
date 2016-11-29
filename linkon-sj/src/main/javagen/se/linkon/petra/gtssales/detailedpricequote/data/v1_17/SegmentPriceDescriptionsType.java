
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentPriceDescription" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}SegmentPriceDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPriceDescriptionsType", propOrder = {
    "segmentPriceDescription"
})
public class SegmentPriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentPriceDescription", required = true)
    protected List<SegmentPriceDescriptionType> segmentPriceDescription;

    /**
     * Gets the value of the segmentPriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentPriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentPriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentPriceDescriptionType }
     * 
     * 
     */
    public List<SegmentPriceDescriptionType> getSegmentPriceDescription() {
        if (segmentPriceDescription == null) {
            segmentPriceDescription = new ArrayList<SegmentPriceDescriptionType>();
        }
        return this.segmentPriceDescription;
    }

    public boolean isSetSegmentPriceDescription() {
        return ((this.segmentPriceDescription!= null)&&(!this.segmentPriceDescription.isEmpty()));
    }

    public void unsetSegmentPriceDescription() {
        this.segmentPriceDescription = null;
    }

}
