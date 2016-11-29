
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="MaximunNumberOfJourneyAdvicesReached" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfJourneyAdvicesForPriceQuotes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/timetable/data/v2_7}JourneyAdvice" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "maximunNumberOfJourneyAdvicesReached",
    "maximumNumberOfJourneyAdvicesForPriceQuotes",
    "journeyAdvice"
})
@XmlRootElement(name = "Timetable")
public class Timetable
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "MaximunNumberOfJourneyAdvicesReached")
    protected EmptyType maximunNumberOfJourneyAdvicesReached;
    @XmlElement(name = "MaximumNumberOfJourneyAdvicesForPriceQuotes")
    protected int maximumNumberOfJourneyAdvicesForPriceQuotes;
    @XmlElement(name = "JourneyAdvice")
    protected List<JourneyAdvice> journeyAdvice;

    /**
     * Gets the value of the maximunNumberOfJourneyAdvicesReached property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMaximunNumberOfJourneyAdvicesReached() {
        return maximunNumberOfJourneyAdvicesReached;
    }

    /**
     * Sets the value of the maximunNumberOfJourneyAdvicesReached property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMaximunNumberOfJourneyAdvicesReached(EmptyType value) {
        this.maximunNumberOfJourneyAdvicesReached = value;
    }

    public boolean isSetMaximunNumberOfJourneyAdvicesReached() {
        return (this.maximunNumberOfJourneyAdvicesReached!= null);
    }

    /**
     * Gets the value of the maximumNumberOfJourneyAdvicesForPriceQuotes property.
     * 
     */
    public int getMaximumNumberOfJourneyAdvicesForPriceQuotes() {
        return maximumNumberOfJourneyAdvicesForPriceQuotes;
    }

    /**
     * Sets the value of the maximumNumberOfJourneyAdvicesForPriceQuotes property.
     * 
     */
    public void setMaximumNumberOfJourneyAdvicesForPriceQuotes(int value) {
        this.maximumNumberOfJourneyAdvicesForPriceQuotes = value;
    }

    public boolean isSetMaximumNumberOfJourneyAdvicesForPriceQuotes() {
        return true;
    }

    /**
     * Gets the value of the journeyAdvice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyAdvice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyAdvice }
     * 
     * 
     */
    public List<JourneyAdvice> getJourneyAdvice() {
        if (journeyAdvice == null) {
            journeyAdvice = new ArrayList<JourneyAdvice>();
        }
        return this.journeyAdvice;
    }

    public boolean isSetJourneyAdvice() {
        return ((this.journeyAdvice!= null)&&(!this.journeyAdvice.isEmpty()));
    }

    public void unsetJourneyAdvice() {
        this.journeyAdvice = null;
    }

}
