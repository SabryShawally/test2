
package se.linkon.petra.order.orderstorage.travellers.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * All travellers that should be removed.
 * 
 * <p>Java class for TravellerNumbersSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerNumbersSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerNumbersSpecification", propOrder = {
    "travellerNumber"
})
public class TravellerNumbersSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6", type = Integer.class)
    @XmlSchemaType(name = "integer")
    protected List<Integer> travellerNumber;

    /**
     * Gets the value of the travellerNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getTravellerNumber() {
        if (travellerNumber == null) {
            travellerNumber = new ArrayList<Integer>();
        }
        return this.travellerNumber;
    }

    public boolean isSetTravellerNumber() {
        return ((this.travellerNumber!= null)&&(!this.travellerNumber.isEmpty()));
    }

    public void unsetTravellerNumber() {
        this.travellerNumber = null;
    }

}
