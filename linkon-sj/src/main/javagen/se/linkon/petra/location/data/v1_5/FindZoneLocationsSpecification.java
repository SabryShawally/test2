
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}ZoneLocationSpecificationList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zoneLocationSpecificationList"
})
@XmlRootElement(name = "FindZoneLocationsSpecification")
public class FindZoneLocationsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ZoneLocationSpecificationList", required = true)
    protected ZoneLocationSpecificationListType zoneLocationSpecificationList;

    /**
     * Gets the value of the zoneLocationSpecificationList property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneLocationSpecificationListType }
     *     
     */
    public ZoneLocationSpecificationListType getZoneLocationSpecificationList() {
        return zoneLocationSpecificationList;
    }

    /**
     * Sets the value of the zoneLocationSpecificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneLocationSpecificationListType }
     *     
     */
    public void setZoneLocationSpecificationList(ZoneLocationSpecificationListType value) {
        this.zoneLocationSpecificationList = value;
    }

    public boolean isSetZoneLocationSpecificationList() {
        return (this.zoneLocationSpecificationList!= null);
    }

}
