
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneLocationSpecificationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneLocationSpecificationListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}ZoneLocationSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneLocationSpecificationListType", propOrder = {
    "zoneLocationSpecification"
})
public class ZoneLocationSpecificationListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ZoneLocationSpecification", required = true)
    protected List<ZoneLocationType> zoneLocationSpecification;

    /**
     * Information about the zoneLocation Gets the value of the zoneLocationSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneLocationSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneLocationSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneLocationType }
     * 
     * 
     */
    public List<ZoneLocationType> getZoneLocationSpecification() {
        if (zoneLocationSpecification == null) {
            zoneLocationSpecification = new ArrayList<ZoneLocationType>();
        }
        return this.zoneLocationSpecification;
    }

    public boolean isSetZoneLocationSpecification() {
        return ((this.zoneLocationSpecification!= null)&&(!this.zoneLocationSpecification.isEmpty()));
    }

    public void unsetZoneLocationSpecification() {
        this.zoneLocationSpecification = null;
    }

}
