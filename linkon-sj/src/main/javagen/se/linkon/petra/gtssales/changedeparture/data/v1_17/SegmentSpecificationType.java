
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.BookingRuleType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;
import se.linkon.petra.commonelements.data.v4_6.SegmentProducerCodeType;
import se.linkon.petra.commonelements.data.v4_6.TravelMethodCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;
import se.linkon.petra.gtssales.shared.data.v1_17.TransportInformationsType;


/**
 * Specifies a segment of the journey with its
 * 				departure- and arrival locations, date/time and more.
 * 			
 * 
 * <p>Java class for SegmentSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelMethodCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentProducerCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingRule"/&gt;
 *         &lt;element name="TransportInformations" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}TransportInformationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentSpecificationType", propOrder = {
    "segmentReference",
    "departureLocation",
    "arrivalLocation",
    "departureDateTime",
    "arrivalDateTime",
    "travelMethodCode",
    "transportId",
    "productCode",
    "segmentProducerCode",
    "bookingClass",
    "bookingRule",
    "transportInformations"
})
public class SegmentSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "DepartureLocation", required = true)
    protected LocationType departureLocation;
    @XmlElement(name = "ArrivalLocation", required = true)
    protected LocationType arrivalLocation;
    @XmlElement(name = "DepartureDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "TravelMethodCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelMethodCodeType travelMethodCode;
    @XmlElement(name = "TransportId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String transportId;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlElement(name = "SegmentProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SegmentProducerCodeType segmentProducerCode;
    @XmlElement(name = "BookingClass", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected BookingClassType bookingClass;
    @XmlElement(name = "BookingRule", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "string")
    protected BookingRuleType bookingRule;
    @XmlElement(name = "TransportInformations")
    protected TransportInformationsType transportInformations;

    /**
     * Gets the value of the segmentReference property.
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
     * Should always be supplied if returned in the
     * 						timetable response.
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
     * The mode of transportation, for instance J=Train,
     * 						B=Bus, F=Ferry etc. Use the code returned in the method
     * 						getTimetable.
     * 					
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
     * Transportation service identification. Use the
     * 						value returned in the method getTimetable.
     * 					
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
     * Product code for the transportation service. Use
     * 						the code returned in the method getTimetable.
     * 					
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
     * Producer for this segment. Use the code returned
     * 						in the method getTimetable.
     * 					
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
     * Comfort for the segment. Use the value returned
     * 						in the method getTimetable.
     * 					
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
     * Specifies the reservation rules for the service.
     * 						Use the code returned in the method getTimetable.
     * 					
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

}
