
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.PriceLevelCodeType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;
import se.linkon.petra.commonelements.data.v4_6.SegmentProducerCodeType;
import se.linkon.petra.commonelements.data.v4_6.TravelMethodCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;
import se.linkon.petra.gtssales.shared.data.v1_17.TravelRouteSpecificationType;


/**
 * <p>Java class for SimpleSegmentSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleSegmentSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDate"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingClass" minOccurs="0"/&gt;
 *         &lt;element name="TravelRouteSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}TravelRouteSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="PlacementSpecification" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}PlacementSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="OptionSpecifications" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}OptionSpecificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleSegmentSpecificationType", propOrder = {
    "departureLocation",
    "arrivalLocation",
    "departureDate",
    "bookingClass",
    "travelRouteSpecification",
    "travelMethodCode",
    "transportId",
    "productCode",
    "priceLevelCode",
    "segmentProducerCode",
    "placementSpecification",
    "optionSpecifications"
})
public class SimpleSegmentSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DepartureLocation", required = true)
    protected LocationType departureLocation;
    @XmlElement(name = "ArrivalLocation", required = true)
    protected LocationType arrivalLocation;
    @XmlElement(name = "DepartureDate", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "BookingClass", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected BookingClassType bookingClass;
    @XmlElement(name = "TravelRouteSpecification")
    protected TravelRouteSpecificationType travelRouteSpecification;
    @XmlElement(name = "TravelMethodCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected TravelMethodCodeType travelMethodCode;
    @XmlElement(name = "TransportId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String transportId;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlElement(name = "PriceLevelCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PriceLevelCodeType priceLevelCode;
    @XmlElement(name = "SegmentProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected SegmentProducerCodeType segmentProducerCode;
    @XmlElement(name = "PlacementSpecification")
    protected PlacementSpecificationType placementSpecification;
    @XmlElement(name = "OptionSpecifications")
    protected OptionSpecificationsType optionSpecifications;

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
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    public boolean isSetDepartureDate() {
        return (this.departureDate!= null);
    }

    /**
     * Comfort for the segment. Use the value returned in the method getTimetable.
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
     * Gets the value of the travelRouteSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TravelRouteSpecificationType }
     *     
     */
    public TravelRouteSpecificationType getTravelRouteSpecification() {
        return travelRouteSpecification;
    }

    /**
     * Sets the value of the travelRouteSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelRouteSpecificationType }
     *     
     */
    public void setTravelRouteSpecification(TravelRouteSpecificationType value) {
        this.travelRouteSpecification = value;
    }

    public boolean isSetTravelRouteSpecification() {
        return (this.travelRouteSpecification!= null);
    }

    /**
     * The mode of transportation, for instance J=Train,
     *             B=Bus, F=Ferry etc.
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
     * Transportation service identification. Use the value returned in the method getTimetable.
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
     * Product code for the transportation service. Use the code returned in the method getTimetable.
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
     * Price level for the segment. Use the value returned from the method getValidPriceGroups.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelCodeType }
     *     
     */
    public PriceLevelCodeType getPriceLevelCode() {
        return priceLevelCode;
    }

    /**
     * Sets the value of the priceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelCodeType }
     *     
     */
    public void setPriceLevelCode(PriceLevelCodeType value) {
        this.priceLevelCode = value;
    }

    public boolean isSetPriceLevelCode() {
        return (this.priceLevelCode!= null);
    }

    /**
     * Producer for this segment. Use the code returned in the method getTimetable.
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
     * Gets the value of the placementSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementSpecificationType }
     *     
     */
    public PlacementSpecificationType getPlacementSpecification() {
        return placementSpecification;
    }

    /**
     * Sets the value of the placementSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementSpecificationType }
     *     
     */
    public void setPlacementSpecification(PlacementSpecificationType value) {
        this.placementSpecification = value;
    }

    public boolean isSetPlacementSpecification() {
        return (this.placementSpecification!= null);
    }

    /**
     * Gets the value of the optionSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public OptionSpecificationsType getOptionSpecifications() {
        return optionSpecifications;
    }

    /**
     * Sets the value of the optionSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public void setOptionSpecifications(OptionSpecificationsType value) {
        this.optionSpecifications = value;
    }

    public boolean isSetOptionSpecifications() {
        return (this.optionSpecifications!= null);
    }

}
