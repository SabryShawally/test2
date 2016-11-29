
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PriceLevelCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;


/**
 * Describes a segment of a journey and its departure- and arrival locations, date/time and more.
 * 
 * <p>Java class for EditActionSegmentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionSegmentDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceLevelCode" minOccurs="0"/&gt;
 *         &lt;element name="Existing" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerEditActionOptionDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}ConsumerEditActionOptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="EditActionPlacementDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionPlacementDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionSegmentDescriptionType", propOrder = {
    "priceLevelCode",
    "existing",
    "consumerEditActionOptionDescriptions",
    "editActionPlacementDescriptions",
    "departureLocation",
    "arrivalLocation",
    "departureDateTime",
    "arrivalDateTime",
    "transportId"
})
public class EditActionSegmentDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceLevelCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PriceLevelCodeType priceLevelCode;
    @XmlElement(name = "Existing")
    protected EmptyType existing;
    @XmlElement(name = "ConsumerEditActionOptionDescriptions")
    protected ConsumerEditActionOptionDescriptionsType consumerEditActionOptionDescriptions;
    @XmlElement(name = "EditActionPlacementDescriptions")
    protected EditActionPlacementDescriptionsType editActionPlacementDescriptions;
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
    @XmlElement(name = "TransportId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String transportId;

    /**
     * Gets the value of the priceLevelCode property.
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
     * Gets the value of the existing property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getExisting() {
        return existing;
    }

    /**
     * Sets the value of the existing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setExisting(EmptyType value) {
        this.existing = value;
    }

    public boolean isSetExisting() {
        return (this.existing!= null);
    }

    /**
     * Gets the value of the consumerEditActionOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerEditActionOptionDescriptionsType }
     *     
     */
    public ConsumerEditActionOptionDescriptionsType getConsumerEditActionOptionDescriptions() {
        return consumerEditActionOptionDescriptions;
    }

    /**
     * Sets the value of the consumerEditActionOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerEditActionOptionDescriptionsType }
     *     
     */
    public void setConsumerEditActionOptionDescriptions(ConsumerEditActionOptionDescriptionsType value) {
        this.consumerEditActionOptionDescriptions = value;
    }

    public boolean isSetConsumerEditActionOptionDescriptions() {
        return (this.consumerEditActionOptionDescriptions!= null);
    }

    /**
     * Gets the value of the editActionPlacementDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionPlacementDescriptionsType }
     *     
     */
    public EditActionPlacementDescriptionsType getEditActionPlacementDescriptions() {
        return editActionPlacementDescriptions;
    }

    /**
     * Sets the value of the editActionPlacementDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionPlacementDescriptionsType }
     *     
     */
    public void setEditActionPlacementDescriptions(EditActionPlacementDescriptionsType value) {
        this.editActionPlacementDescriptions = value;
    }

    public boolean isSetEditActionPlacementDescriptions() {
        return (this.editActionPlacementDescriptions!= null);
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
     * Gets the value of the transportId property.
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

}
