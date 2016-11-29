
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a listing of non-frequent traveller
 * 				numbers (anonymous and/or
 * 				temporary)
 * 			
 * 
 * <p>Java class for NonFrequentTravellerNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonFrequentTravellerNumbersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonFrequentTravellerNumber" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}NonFrequentTravellerNumberType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFrequentTravellerNumbersType", propOrder = {
    "nonFrequentTravellerNumber"
})
public class NonFrequentTravellerNumbersType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "NonFrequentTravellerNumber", required = true)
    protected List<NonFrequentTravellerNumberType> nonFrequentTravellerNumber;

    /**
     * Gets the value of the nonFrequentTravellerNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonFrequentTravellerNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonFrequentTravellerNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonFrequentTravellerNumberType }
     * 
     * 
     */
    public List<NonFrequentTravellerNumberType> getNonFrequentTravellerNumber() {
        if (nonFrequentTravellerNumber == null) {
            nonFrequentTravellerNumber = new ArrayList<NonFrequentTravellerNumberType>();
        }
        return this.nonFrequentTravellerNumber;
    }

    public boolean isSetNonFrequentTravellerNumber() {
        return ((this.nonFrequentTravellerNumber!= null)&&(!this.nonFrequentTravellerNumber.isEmpty()));
    }

    public void unsetNonFrequentTravellerNumber() {
        this.nonFrequentTravellerNumber = null;
    }

}
