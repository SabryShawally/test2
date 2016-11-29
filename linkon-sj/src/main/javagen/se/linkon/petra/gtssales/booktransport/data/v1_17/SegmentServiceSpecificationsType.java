
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentServiceSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentServiceSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentServiceSpecification" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}SegmentServiceSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentServiceSpecificationsType", propOrder = {
    "segmentServiceSpecification"
})
public class SegmentServiceSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentServiceSpecification", required = true)
    protected List<SegmentServiceSpecificationType> segmentServiceSpecification;

    /**
     * Gets the value of the segmentServiceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentServiceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentServiceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentServiceSpecificationType }
     * 
     * 
     */
    public List<SegmentServiceSpecificationType> getSegmentServiceSpecification() {
        if (segmentServiceSpecification == null) {
            segmentServiceSpecification = new ArrayList<SegmentServiceSpecificationType>();
        }
        return this.segmentServiceSpecification;
    }

    public boolean isSetSegmentServiceSpecification() {
        return ((this.segmentServiceSpecification!= null)&&(!this.segmentServiceSpecification.isEmpty()));
    }

    public void unsetSegmentServiceSpecification() {
        this.segmentServiceSpecification = null;
    }

}
