
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmokingDepartmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmokingDepartmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmokingDepartmentDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}SmokingDepartmentDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmokingDepartmentDetail", propOrder = {
    "smokingDepartmentDetailType"
})
public class SmokingDepartmentDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SmokingDepartmentDetailType", required = true)
    protected List<SmokingDepartmentDetailType> smokingDepartmentDetailType;

    /**
     * Gets the value of the smokingDepartmentDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smokingDepartmentDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmokingDepartmentDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmokingDepartmentDetailType }
     * 
     * 
     */
    public List<SmokingDepartmentDetailType> getSmokingDepartmentDetailType() {
        if (smokingDepartmentDetailType == null) {
            smokingDepartmentDetailType = new ArrayList<SmokingDepartmentDetailType>();
        }
        return this.smokingDepartmentDetailType;
    }

    public boolean isSetSmokingDepartmentDetailType() {
        return ((this.smokingDepartmentDetailType!= null)&&(!this.smokingDepartmentDetailType.isEmpty()));
    }

    public void unsetSmokingDepartmentDetailType() {
        this.smokingDepartmentDetailType = null;
    }

}
