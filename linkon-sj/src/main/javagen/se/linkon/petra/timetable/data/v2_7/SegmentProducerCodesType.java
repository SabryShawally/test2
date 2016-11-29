
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SegmentProducerCodeType;


/**
 * <p>Java class for SegmentProducerCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentProducerCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentProducerCode" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentProducerCodesType", propOrder = {
    "segmentProducerCode"
})
public class SegmentProducerCodesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected List<SegmentProducerCodeType> segmentProducerCode;

    /**
     * Gets the value of the segmentProducerCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentProducerCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentProducerCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentProducerCodeType }
     * 
     * 
     */
    public List<SegmentProducerCodeType> getSegmentProducerCode() {
        if (segmentProducerCode == null) {
            segmentProducerCode = new ArrayList<SegmentProducerCodeType>();
        }
        return this.segmentProducerCode;
    }

    public boolean isSetSegmentProducerCode() {
        return ((this.segmentProducerCode!= null)&&(!this.segmentProducerCode.isEmpty()));
    }

    public void unsetSegmentProducerCode() {
        this.segmentProducerCode = null;
    }

}
