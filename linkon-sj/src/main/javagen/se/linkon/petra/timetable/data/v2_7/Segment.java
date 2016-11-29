
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
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.BookingRuleType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;
import se.linkon.petra.commonelements.data.v4_6.SegmentProducerCodeType;
import se.linkon.petra.commonelements.data.v4_6.TravelMethodCodeType;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="SegmentDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId"/&gt;
 *         &lt;element name="TransportInformations" type="{http://petra.linkon.se/timetable/data/v2_7}TransportInformationsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelMethodCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentProducerCode"/&gt;
 *         &lt;element name="Bookable" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingRule" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ServiceBrandName" minOccurs="0"/&gt;
 *         &lt;element name="ViaLocations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://petra.linkon.se/timetable/data/v2_7}Location" maxOccurs="unbounded"/&gt;
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
    "segmentReference",
    "segmentDuration",
    "departureLocation",
    "departureDateTime",
    "arrivalLocation",
    "arrivalDateTime",
    "productCode",
    "bookingClass",
    "transportId",
    "transportInformations",
    "travelMethodCode",
    "segmentProducerCode",
    "bookable",
    "bookingRule",
    "serviceBrandName",
    "viaLocations"
})
@XmlRootElement(name = "Segment")
public class Segment
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "SegmentDuration", required = true)
    protected Duration segmentDuration;
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
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlElement(name = "BookingClass", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected BookingClassType bookingClass;
    @XmlElement(name = "TransportId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String transportId;
    @XmlElement(name = "TransportInformations")
    protected TransportInformationsType transportInformations;
    @XmlElement(name = "TravelMethodCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelMethodCodeType travelMethodCode;
    @XmlElement(name = "SegmentProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SegmentProducerCodeType segmentProducerCode;
    @XmlElement(name = "Bookable")
    protected EmptyType bookable;
    @XmlElement(name = "BookingRule", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "string")
    protected BookingRuleType bookingRule;
    @XmlElement(name = "ServiceBrandName", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String serviceBrandName;
    @XmlElement(name = "ViaLocations")
    protected Segment.ViaLocations viaLocations;

    /**
     * Identifier for the Segment.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    public boolean isSetSegmentReference() {
        return true;
    }

    /**
     * Gets the value of the segmentDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSegmentDuration() {
        return segmentDuration;
    }

    /**
     * Sets the value of the segmentDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSegmentDuration(Duration value) {
        this.segmentDuration = value;
    }

    public boolean isSetSegmentDuration() {
        return (this.segmentDuration!= null);
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
     * Identifies the category of the train, bus etc..
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType }
     *     
     */
    public ProductCodeType getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType }
     *     
     */
    public void setProductCode(ProductCodeType value) {
        this.productCode = value;
    }

    public boolean isSetProductCode() {
        return (this.productCode!= null);
    }

    /**
     * Classification of the booking.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassType }
     *     
     */
    public BookingClassType getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassType }
     *     
     */
    public void setBookingClass(BookingClassType value) {
        this.bookingClass = value;
    }

    public boolean isSetBookingClass() {
        return (this.bookingClass!= null);
    }

    /**
     * Transport identification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportId() {
        return transportId;
    }

    /**
     * Sets the value of the transportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportId(String value) {
        this.transportId = value;
    }

    public boolean isSetTransportId() {
        return (this.transportId!= null);
    }

    /**
     * Gets the value of the transportInformations property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInformationsType }
     *     
     */
    public TransportInformationsType getTransportInformations() {
        return transportInformations;
    }

    /**
     * Sets the value of the transportInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInformationsType }
     *     
     */
    public void setTransportInformations(TransportInformationsType value) {
        this.transportInformations = value;
    }

    public boolean isSetTransportInformations() {
        return (this.transportInformations!= null);
    }

    /**
     * The mode of transportation, for instance J=Train, B=Bus, F=Ferry etc.
     * 
     * @return
     *     possible object is
     *     {@link TravelMethodCodeType }
     *     
     */
    public TravelMethodCodeType getTravelMethodCode() {
        return travelMethodCode;
    }

    /**
     * Sets the value of the travelMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelMethodCodeType }
     *     
     */
    public void setTravelMethodCode(TravelMethodCodeType value) {
        this.travelMethodCode = value;
    }

    public boolean isSetTravelMethodCode() {
        return (this.travelMethodCode!= null);
    }

    /**
     * The producer for this segment.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodeType }
     *     
     */
    public SegmentProducerCodeType getSegmentProducerCode() {
        return segmentProducerCode;
    }

    /**
     * Sets the value of the segmentProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodeType }
     *     
     */
    public void setSegmentProducerCode(SegmentProducerCodeType value) {
        this.segmentProducerCode = value;
    }

    public boolean isSetSegmentProducerCode() {
        return (this.segmentProducerCode!= null);
    }

    /**
     * Gets the value of the bookable property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getBookable() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setBookable(EmptyType value) {
        this.bookable = value;
    }

    public boolean isSetBookable() {
        return (this.bookable!= null);
    }

    /**
     * Describes the reservation rules for the service.
     * OBLI = Mandatory reservation
     * EJBO = Not possible to make a reservation
     * ODEF = Reservation is optional
     * REKO = Reservation is recommended.
     * 
     * @return
     *     possible object is
     *     {@link BookingRuleType }
     *     
     */
    public BookingRuleType getBookingRule() {
        return bookingRule;
    }

    /**
     * Sets the value of the bookingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRuleType }
     *     
     */
    public void setBookingRule(BookingRuleType value) {
        this.bookingRule = value;
    }

    public boolean isSetBookingRule() {
        return (this.bookingRule!= null);
    }

    /**
     * Structure defining the transport service brand name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBrandName() {
        return serviceBrandName;
    }

    /**
     * Sets the value of the serviceBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBrandName(String value) {
        this.serviceBrandName = value;
    }

    public boolean isSetServiceBrandName() {
        return (this.serviceBrandName!= null);
    }

    /**
     * Gets the value of the viaLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Segment.ViaLocations }
     *     
     */
    public Segment.ViaLocations getViaLocations() {
        return viaLocations;
    }

    /**
     * Sets the value of the viaLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Segment.ViaLocations }
     *     
     */
    public void setViaLocations(Segment.ViaLocations value) {
        this.viaLocations = value;
    }

    public boolean isSetViaLocations() {
        return (this.viaLocations!= null);
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
     *         &lt;element ref="{http://petra.linkon.se/timetable/data/v2_7}Location" maxOccurs="unbounded"/&gt;
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
        "location"
    })
    public static class ViaLocations
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "Location", required = true)
        protected List<LocationType> location;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationType }
         * 
         * 
         */
        public List<LocationType> getLocation() {
            if (location == null) {
                location = new ArrayList<LocationType>();
            }
            return this.location;
        }

        public boolean isSetLocation() {
            return ((this.location!= null)&&(!this.location.isEmpty()));
        }

        public void unsetLocation() {
            this.location = null;
        }

    }

}
