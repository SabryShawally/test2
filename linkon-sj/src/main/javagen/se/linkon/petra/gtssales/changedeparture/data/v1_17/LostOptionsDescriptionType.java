
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes lost options such as food, breakfast, etc. no longer existing on this order item.
 * 
 * <p>Java class for LostOptionsDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LostOptionsDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LostOptionDescription" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}LostOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LostOptionsDescriptionType", propOrder = {
    "lostOptionDescription"
})
public class LostOptionsDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "LostOptionDescription", required = true)
    protected List<LostOptionDescriptionType> lostOptionDescription;

    /**
     * Gets the value of the lostOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lostOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLostOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LostOptionDescriptionType }
     * 
     * 
     */
    public List<LostOptionDescriptionType> getLostOptionDescription() {
        if (lostOptionDescription == null) {
            lostOptionDescription = new ArrayList<LostOptionDescriptionType>();
        }
        return this.lostOptionDescription;
    }

    public boolean isSetLostOptionDescription() {
        return ((this.lostOptionDescription!= null)&&(!this.lostOptionDescription.isEmpty()));
    }

    public void unsetLostOptionDescription() {
        this.lostOptionDescription = null;
    }

}
