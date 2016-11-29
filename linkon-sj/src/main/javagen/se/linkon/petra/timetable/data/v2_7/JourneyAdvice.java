
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="VatFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element name="Itineraries"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://petra.linkon.se/timetable/data/v2_7}Itinerary" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "journeyConnectionReference",
    "journeyDuration",
    "vatFree",
    "departureLocation",
    "departureDateTime",
    "arrivalLocation",
    "arrivalDateTime",
    "itineraries"
})
@XmlRootElement(name = "JourneyAdvice")
public class JourneyAdvice
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer journeyConnectionReference;
    @XmlElement(name = "JourneyDuration", required = true)
    protected Duration journeyDuration;
    @XmlElement(name = "VatFree")
    protected String vatFree;
    @XmlElement(name = "DepartureLocation", required = true)
    protected LocationType departureLocation;
    @XmlElement(name = "DepartureDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalLocation", required = true)
    protected LocationType arrivalLocation;
    @XmlElement(name = "ArrivalDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "Itineraries", required = true)
    protected JourneyAdvice.Itineraries itineraries;

    /**
     * Identifier for the JourneyAdvice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJourneyConnectionReference() {
        return journeyConnectionReference;
    }

    /**
     * Sets the value of the journeyConnectionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJourneyConnectionReference(Integer value) {
        this.journeyConnectionReference = value;
    }

    public boolean isSetJourneyConnectionReference() {
        return (this.journeyConnectionReference!= null);
    }

    /**
     * Gets the value of the journeyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Sets the value of the journeyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyDuration(Duration value) {
        this.journeyDuration = value;
    }

    public boolean isSetJourneyDuration() {
        return (this.journeyDuration!= null);
    }

    /**
     * Gets the value of the vatFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatFree() {
        return vatFree;
    }

    /**
     * Sets the value of the vatFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatFree(String value) {
        this.vatFree = value;
    }

    public boolean isSetVatFree() {
        return (this.vatFree!= null);
    }

    /**
     * Gets the value of the departureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureLocation() {
        return departureLocation;
    }

    /**
     * Sets the value of the departureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureLocation(LocationType value) {
        this.departureLocation = value;
    }

    public boolean isSetDepartureLocation() {
        return (this.departureLocation!= null);
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    public boolean isSetDepartureDateTime() {
        return (this.departureDateTime!= null);
    }

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    public boolean isSetArrivalLocation() {
        return (this.arrivalLocation!= null);
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    public boolean isSetArrivalDateTime() {
        return (this.arrivalDateTime!= null);
    }

    /**
     * Gets the value of the itineraries property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdvice.Itineraries }
     *     
     */
    public JourneyAdvice.Itineraries getItineraries() {
        return itineraries;
    }

    /**
     * Sets the value of the itineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdvice.Itineraries }
     *     
     */
    public void setItineraries(JourneyAdvice.Itineraries value) {
        this.itineraries = value;
    }

    public boolean isSetItineraries() {
        return (this.itineraries!= null);
    }


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
     *         &lt;element ref="{http://petra.linkon.se/timetable/data/v2_7}Itinerary" maxOccurs="unbounded"/&gt;
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
        "itinerary"
    })
    public static class Itineraries
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "Itinerary", required = true)
        protected List<Itinerary> itinerary;

        /**
         * Gets the value of the itinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Itinerary }
         * 
         * 
         */
        public List<Itinerary> getItinerary() {
            if (itinerary == null) {
                itinerary = new ArrayList<Itinerary>();
            }
            return this.itinerary;
        }

        public boolean isSetItinerary() {
            return ((this.itinerary!= null)&&(!this.itinerary.isEmpty()));
        }

        public void unsetItinerary() {
            this.itinerary = null;
        }

    }

}
