
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneLocationResultListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneLocationResultListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}ZoneLocationResult" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneLocationResultListType", propOrder = {
    "zoneLocationResult"
})
public class ZoneLocationResultListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ZoneLocationResult", required = true)
    protected List<ZoneLocationResultType> zoneLocationResult;

    /**
     * Gets the value of the zoneLocationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneLocationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneLocationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneLocationResultType }
     * 
     * 
     */
    public List<ZoneLocationResultType> getZoneLocationResult() {
        if (zoneLocationResult == null) {
            zoneLocationResult = new ArrayList<ZoneLocationResultType>();
        }
        return this.zoneLocationResult;
    }

    public boolean isSetZoneLocationResult() {
        return ((this.zoneLocationResult!= null)&&(!this.zoneLocationResult.isEmpty()));
    }

    public void unsetZoneLocationResult() {
        this.zoneLocationResult = null;
    }

}
