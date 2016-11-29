
package se.linkon.petra.gtssales.edittransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;


/**
 * <p>Java class for SegmentSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId"/&gt;
 *         &lt;element name="PlacementSpecification" type="{http://petra.linkon.se/gtssales/edittransport/data/v1_17}PlacementSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="OptionSpecifications" type="{http://petra.linkon.se/gtssales/edittransport/data/v1_17}OptionSpecificationsType" minOccurs="0"/&gt;
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
    "departureLocation",
    "departureDateTime",
    "arrivalLocation",
    "arrivalDateTime",
    "transportId",
    "placementSpecification",
    "optionSpecifications"
})
public class SegmentSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
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
    @XmlElement(name = "TransportId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String transportId;
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
     * Transportation service identification. Use the value returned in previous calls.
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
