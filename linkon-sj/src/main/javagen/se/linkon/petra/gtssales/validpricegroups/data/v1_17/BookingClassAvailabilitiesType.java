
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingClassAvailabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingClassAvailabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingClassAvailability" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}BookingClassAvailabilityType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingClassAvailabilitiesType", propOrder = {
    "bookingClassAvailability"
})
public class BookingClassAvailabilitiesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "BookingClassAvailability", required = true)
    protected List<BookingClassAvailabilityType> bookingClassAvailability;

    /**
     * Gets the value of the bookingClassAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingClassAvailabilityType }
     * 
     * 
     */
    public List<BookingClassAvailabilityType> getBookingClassAvailability() {
        if (bookingClassAvailability == null) {
            bookingClassAvailability = new ArrayList<BookingClassAvailabilityType>();
        }
        return this.bookingClassAvailability;
    }

    public boolean isSetBookingClassAvailability() {
        return ((this.bookingClassAvailability!= null)&&(!this.bookingClassAvailability.isEmpty()));
    }

    public void unsetBookingClassAvailability() {
        this.bookingClassAvailability = null;
    }

}
