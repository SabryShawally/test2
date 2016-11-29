
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeDepartureDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDepartureDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeDepartureDescription" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}ChangeDepartureDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDepartureDescriptionsType", propOrder = {
    "changeDepartureDescription"
})
public class ChangeDepartureDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ChangeDepartureDescription", required = true)
    protected List<ChangeDepartureDescriptionType> changeDepartureDescription;

    /**
     * Gets the value of the changeDepartureDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeDepartureDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeDepartureDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeDepartureDescriptionType }
     * 
     * 
     */
    public List<ChangeDepartureDescriptionType> getChangeDepartureDescription() {
        if (changeDepartureDescription == null) {
            changeDepartureDescription = new ArrayList<ChangeDepartureDescriptionType>();
        }
        return this.changeDepartureDescription;
    }

    public boolean isSetChangeDepartureDescription() {
        return ((this.changeDepartureDescription!= null)&&(!this.changeDepartureDescription.isEmpty()));
    }

    public void unsetChangeDepartureDescription() {
        this.changeDepartureDescription = null;
    }

}
