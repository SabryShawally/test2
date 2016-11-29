
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotValidForChangeDepartureTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotValidForChangeDepartureTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotValidForChangeDepartureType" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}NotValidForChangeDepartureType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotValidForChangeDepartureTypes", propOrder = {
    "notValidForChangeDepartureType"
})
public class NotValidForChangeDepartureTypes
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "NotValidForChangeDepartureType", required = true)
    protected List<NotValidForChangeDepartureType> notValidForChangeDepartureType;

    /**
     * Gets the value of the notValidForChangeDepartureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notValidForChangeDepartureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotValidForChangeDepartureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotValidForChangeDepartureType }
     * 
     * 
     */
    public List<NotValidForChangeDepartureType> getNotValidForChangeDepartureType() {
        if (notValidForChangeDepartureType == null) {
            notValidForChangeDepartureType = new ArrayList<NotValidForChangeDepartureType>();
        }
        return this.notValidForChangeDepartureType;
    }

    public boolean isSetNotValidForChangeDepartureType() {
        return ((this.notValidForChangeDepartureType!= null)&&(!this.notValidForChangeDepartureType.isEmpty()));
    }

    public void unsetNotValidForChangeDepartureType() {
        this.notValidForChangeDepartureType = null;
    }

}
