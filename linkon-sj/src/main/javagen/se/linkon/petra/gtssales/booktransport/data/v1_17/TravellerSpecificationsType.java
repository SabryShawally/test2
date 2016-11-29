
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * Contains travellers being created/updated and
 * 				connected to the order items specified in this request.
 * 			
 * 
 * <p>Java class for TravellerSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoNumbering" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="TravellerSpecification" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}TravellerSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerSpecificationsType", propOrder = {
    "autoNumbering",
    "travellerSpecification"
})
public class TravellerSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AutoNumbering")
    protected EmptyType autoNumbering;
    @XmlElement(name = "TravellerSpecification", required = true)
    protected List<TravellerSpecificationType> travellerSpecification;

    /**
     * Gets the value of the autoNumbering property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAutoNumbering() {
        return autoNumbering;
    }

    /**
     * Sets the value of the autoNumbering property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAutoNumbering(EmptyType value) {
        this.autoNumbering = value;
    }

    public boolean isSetAutoNumbering() {
        return (this.autoNumbering!= null);
    }

    /**
     * Gets the value of the travellerSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerSpecificationType }
     * 
     * 
     */
    public List<TravellerSpecificationType> getTravellerSpecification() {
        if (travellerSpecification == null) {
            travellerSpecification = new ArrayList<TravellerSpecificationType>();
        }
        return this.travellerSpecification;
    }

    public boolean isSetTravellerSpecification() {
        return ((this.travellerSpecification!= null)&&(!this.travellerSpecification.isEmpty()));
    }

    public void unsetTravellerSpecification() {
        this.travellerSpecification = null;
    }

}
