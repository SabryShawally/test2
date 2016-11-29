
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


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
 *         &lt;element name="ReturnLocationZones" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
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
    "returnLocationZones"
})
@XmlRootElement(name = "GetFrequentLocationsQuery")
public class GetFrequentLocationsQuery
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ReturnLocationZones")
    protected EmptyType returnLocationZones;

    /**
     * Gets the value of the returnLocationZones property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getReturnLocationZones() {
        return returnLocationZones;
    }

    /**
     * Sets the value of the returnLocationZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setReturnLocationZones(EmptyType value) {
        this.returnLocationZones = value;
    }

    public boolean isSetReturnLocationZones() {
        return (this.returnLocationZones!= null);
    }

}
