
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.gtssales.shared.data.v1_17.PriceSectionType;


/**
 * <p>Java class for PlacementDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementType"/&gt;
 *         &lt;element name="BookingClassAvailabilities" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}BookingClassAvailabilitiesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCode" minOccurs="0"/&gt;
 *         &lt;element name="PriceSection" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceSectionType" minOccurs="0"/&gt;
 *         &lt;element name="Mandatory" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultReservation" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="SeatMapBookingClass" type="{http://petra.linkon.se/commonelements/data/v4_6}BookingClassType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDescriptionType", propOrder = {
    "placementType",
    "bookingClassAvailabilities",
    "compartmentCode",
    "priceSection",
    "mandatory",
    "defaultReservation",
    "seatMapBookingClass"
})
public class PlacementDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String placementType;
    @XmlElement(name = "BookingClassAvailabilities")
    protected BookingClassAvailabilitiesType bookingClassAvailabilities;
    @XmlElement(name = "CompartmentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentCodeType compartmentCode;
    @XmlElement(name = "PriceSection")
    protected PriceSectionType priceSection;
    @XmlElement(name = "Mandatory")
    protected EmptyType mandatory;
    @XmlElement(name = "DefaultReservation")
    protected EmptyType defaultReservation;
    @XmlElement(name = "SeatMapBookingClass")
    protected BookingClassType seatMapBookingClass;

    /**
     * Gets the value of the placementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementType() {
        return placementType;
    }

    /**
     * Sets the value of the placementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementType(String value) {
        this.placementType = value;
    }

    public boolean isSetPlacementType() {
        return (this.placementType!= null);
    }

    /**
     * Gets the value of the bookingClassAvailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassAvailabilitiesType }
     *     
     */
    public BookingClassAvailabilitiesType getBookingClassAvailabilities() {
        return bookingClassAvailabilities;
    }

    /**
     * Sets the value of the bookingClassAvailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassAvailabilitiesType }
     *     
     */
    public void setBookingClassAvailabilities(BookingClassAvailabilitiesType value) {
        this.bookingClassAvailabilities = value;
    }

    public boolean isSetBookingClassAvailabilities() {
        return (this.bookingClassAvailabilities!= null);
    }

    /**
     * Gets the value of the compartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentCodeType }
     *     
     */
    public CompartmentCodeType getCompartmentCode() {
        return compartmentCode;
    }

    /**
     * Sets the value of the compartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentCodeType }
     *     
     */
    public void setCompartmentCode(CompartmentCodeType value) {
        this.compartmentCode = value;
    }

    public boolean isSetCompartmentCode() {
        return (this.compartmentCode!= null);
    }

    /**
     * Gets the value of the priceSection property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSectionType }
     *     
     */
    public PriceSectionType getPriceSection() {
        return priceSection;
    }

    /**
     * Sets the value of the priceSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSectionType }
     *     
     */
    public void setPriceSection(PriceSectionType value) {
        this.priceSection = value;
    }

    public boolean isSetPriceSection() {
        return (this.priceSection!= null);
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMandatory(EmptyType value) {
        this.mandatory = value;
    }

    public boolean isSetMandatory() {
        return (this.mandatory!= null);
    }

    /**
     * Gets the value of the defaultReservation property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDefaultReservation() {
        return defaultReservation;
    }

    /**
     * Sets the value of the defaultReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDefaultReservation(EmptyType value) {
        this.defaultReservation = value;
    }

    public boolean isSetDefaultReservation() {
        return (this.defaultReservation!= null);
    }

    /**
     * Gets the value of the seatMapBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassType }
     *     
     */
    public BookingClassType getSeatMapBookingClass() {
        return seatMapBookingClass;
    }

    /**
     * Sets the value of the seatMapBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassType }
     *     
     */
    public void setSeatMapBookingClass(BookingClassType value) {
        this.seatMapBookingClass = value;
    }

    public boolean isSetSeatMapBookingClass() {
        return (this.seatMapBookingClass!= null);
    }

}
