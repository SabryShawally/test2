
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentSpecification" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}SegmentSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentSpecificationsType", propOrder = {
    "segmentSpecification"
})
public class SegmentSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentSpecification", required = true)
    protected List<SegmentSpecificationType> segmentSpecification;

    /**
     * Gets the value of the segmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentSpecificationType }
     * 
     * 
     */
    public List<SegmentSpecificationType> getSegmentSpecification() {
        if (segmentSpecification == null) {
            segmentSpecification = new ArrayList<SegmentSpecificationType>();
        }
        return this.segmentSpecification;
    }

    public boolean isSetSegmentSpecification() {
        return ((this.segmentSpecification!= null)&&(!this.segmentSpecification.isEmpty()));
    }

    public void unsetSegmentSpecification() {
        this.segmentSpecification = null;
    }

}
