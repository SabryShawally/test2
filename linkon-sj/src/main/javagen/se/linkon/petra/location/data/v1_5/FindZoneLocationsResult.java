
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
 *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}ZoneLocationResultList"/&gt;
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
    "zoneLocationResultList"
})
@XmlRootElement(name = "FindZoneLocationsResult")
public class FindZoneLocationsResult
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ZoneLocationResultList", required = true)
    protected ZoneLocationResultListType zoneLocationResultList;

    /**
     * Gets the value of the zoneLocationResultList property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneLocationResultListType }
     *     
     */
    public ZoneLocationResultListType getZoneLocationResultList() {
        return zoneLocationResultList;
    }

    /**
     * Sets the value of the zoneLocationResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneLocationResultListType }
     *     
     */
    public void setZoneLocationResultList(ZoneLocationResultListType value) {
        this.zoneLocationResultList = value;
    }

    public boolean isSetZoneLocationResultList() {
        return (this.zoneLocationResultList!= null);
    }

}
