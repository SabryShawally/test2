
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holder for any special fare availabilities. If no
 * 				special fare availabilities exist, then this tag will not be
 * 				present.
 * 
 * <p>Java class for SpecialFareAvailabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialFareAvailabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareAvailability" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}FareAvailabilityType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialFareAvailabilities", propOrder = {
    "fareAvailability"
})
public class SpecialFareAvailabilities
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FareAvailability", required = true)
    protected List<FareAvailabilityType> fareAvailability;

    /**
     * Gets the value of the fareAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareAvailabilityType }
     * 
     * 
     */
    public List<FareAvailabilityType> getFareAvailability() {
        if (fareAvailability == null) {
            fareAvailability = new ArrayList<FareAvailabilityType>();
        }
        return this.fareAvailability;
    }

    public boolean isSetFareAvailability() {
        return ((this.fareAvailability!= null)&&(!this.fareAvailability.isEmpty()));
    }

    public void unsetFareAvailability() {
        this.fareAvailability = null;
    }

}
