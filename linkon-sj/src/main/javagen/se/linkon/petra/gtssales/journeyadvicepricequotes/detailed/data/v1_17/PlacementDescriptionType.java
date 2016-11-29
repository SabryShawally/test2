
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * Describes the placement price and type of placement for a segment.
 * 
 * <p>Java class for PlacementDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementType" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentCodes" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}CompartmentCodesType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPriceIncludesPlacementPrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
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
    "price",
    "placementType",
    "compartmentCodes",
    "totalPriceIncludesPlacementPrice",
    "seatMapBookingClass"
})
public class PlacementDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Price")
    protected Money price;
    @XmlElement(name = "PlacementType", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String placementType;
    @XmlElement(name = "CompartmentCodes")
    protected CompartmentCodesType compartmentCodes;
    @XmlElement(name = "TotalPriceIncludesPlacementPrice")
    protected EmptyType totalPriceIncludesPlacementPrice;
    @XmlElement(name = "SeatMapBookingClass")
    protected BookingClassType seatMapBookingClass;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
    }

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
     * Gets the value of the compartmentCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentCodesType }
     *     
     */
    public CompartmentCodesType getCompartmentCodes() {
        return compartmentCodes;
    }

    /**
     * Sets the value of the compartmentCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentCodesType }
     *     
     */
    public void setCompartmentCodes(CompartmentCodesType value) {
        this.compartmentCodes = value;
    }

    public boolean isSetCompartmentCodes() {
        return (this.compartmentCodes!= null);
    }

    /**
     * Gets the value of the totalPriceIncludesPlacementPrice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getTotalPriceIncludesPlacementPrice() {
        return totalPriceIncludesPlacementPrice;
    }

    /**
     * Sets the value of the totalPriceIncludesPlacementPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setTotalPriceIncludesPlacementPrice(EmptyType value) {
        this.totalPriceIncludesPlacementPrice = value;
    }

    public boolean isSetTotalPriceIncludesPlacementPrice() {
        return (this.totalPriceIncludesPlacementPrice!= null);
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
