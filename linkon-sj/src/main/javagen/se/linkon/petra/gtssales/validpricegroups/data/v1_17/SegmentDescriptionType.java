
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.PriceLevelCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;
import se.linkon.petra.gtssales.shared.data.v1_17.OptionDescriptionsType;


/**
 * Describes a segment of a journey and its departure-
 * 				and arrival locations, date/time and more.
 * 
 * <p>Java class for SegmentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceLevelCode" minOccurs="0"/&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="PlacementDescription" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}PlacementDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportId"/&gt;
 *         &lt;element name="hasSeatmap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDescriptionType", propOrder = {
    "priceLevelCode",
    "optionDescriptions",
    "placementDescription",
    "departureLocation",
    "arrivalLocation",
    "departureDateTime",
    "arrivalDateTime",
    "transportId",
    "hasSeatmap"
})
public class SegmentDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceLevelCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PriceLevelCodeType priceLevelCode;
    @XmlElement(name = "OptionDescriptions")
    protected OptionDescriptionsType optionDescriptions;
    @XmlElement(name = "PlacementDescription")
    protected PlacementDescriptionType placementDescription;
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
    @XmlElement(defaultValue = "false")
    protected boolean hasSeatmap;

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
     * Gets the value of the optionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public OptionDescriptionsType getOptionDescriptions() {
        return optionDescriptions;
    }

    /**
     * Sets the value of the optionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public void setOptionDescriptions(OptionDescriptionsType value) {
        this.optionDescriptions = value;
    }

    public boolean isSetOptionDescriptions() {
        return (this.optionDescriptions!= null);
    }

    /**
     * Gets the value of the placementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementDescriptionType }
     *     
     */
    public PlacementDescriptionType getPlacementDescription() {
        return placementDescription;
    }

    /**
     * Sets the value of the placementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementDescriptionType }
     *     
     */
    public void setPlacementDescription(PlacementDescriptionType value) {
        this.placementDescription = value;
    }

    public boolean isSetPlacementDescription() {
        return (this.placementDescription!= null);
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

    /**
     * Gets the value of the hasSeatmap property.
     * 
     */
    public boolean isHasSeatmap() {
        return hasSeatmap;
    }

    /**
     * Sets the value of the hasSeatmap property.
     * 
     */
    public void setHasSeatmap(boolean value) {
        this.hasSeatmap = value;
    }

    public boolean isSetHasSeatmap() {
        return true;
    }

}
