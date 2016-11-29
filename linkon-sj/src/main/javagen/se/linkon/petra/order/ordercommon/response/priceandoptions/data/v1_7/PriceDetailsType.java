
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * <p>Java class for PriceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceBasePrice" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *         &lt;element name="PlacementPriceDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}PlacementPriceDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="BookingFee" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="OptionPriceDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}OptionPriceDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDetailsType", propOrder = {
    "serviceBasePrice",
    "placementPriceDescriptions",
    "bookingFee",
    "optionPriceDescriptions"
})
public class PriceDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ServiceBasePrice", required = true)
    protected PriceVatType serviceBasePrice;
    @XmlElement(name = "PlacementPriceDescriptions")
    protected PlacementPriceDescriptionsType placementPriceDescriptions;
    @XmlElement(name = "BookingFee")
    protected PriceVatType bookingFee;
    @XmlElement(name = "OptionPriceDescriptions")
    protected OptionPriceDescriptionsType optionPriceDescriptions;

    /**
     * Gets the value of the serviceBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getServiceBasePrice() {
        return serviceBasePrice;
    }

    /**
     * Sets the value of the serviceBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setServiceBasePrice(PriceVatType value) {
        this.serviceBasePrice = value;
    }

    public boolean isSetServiceBasePrice() {
        return (this.serviceBasePrice!= null);
    }

    /**
     * Gets the value of the placementPriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementPriceDescriptionsType }
     *     
     */
    public PlacementPriceDescriptionsType getPlacementPriceDescriptions() {
        return placementPriceDescriptions;
    }

    /**
     * Sets the value of the placementPriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementPriceDescriptionsType }
     *     
     */
    public void setPlacementPriceDescriptions(PlacementPriceDescriptionsType value) {
        this.placementPriceDescriptions = value;
    }

    public boolean isSetPlacementPriceDescriptions() {
        return (this.placementPriceDescriptions!= null);
    }

    /**
     * Gets the value of the bookingFee property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getBookingFee() {
        return bookingFee;
    }

    /**
     * Sets the value of the bookingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setBookingFee(PriceVatType value) {
        this.bookingFee = value;
    }

    public boolean isSetBookingFee() {
        return (this.bookingFee!= null);
    }

    /**
     * Gets the value of the optionPriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionPriceDescriptionsType }
     *     
     */
    public OptionPriceDescriptionsType getOptionPriceDescriptions() {
        return optionPriceDescriptions;
    }

    /**
     * Sets the value of the optionPriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionPriceDescriptionsType }
     *     
     */
    public void setOptionPriceDescriptions(OptionPriceDescriptionsType value) {
        this.optionPriceDescriptions = value;
    }

    public boolean isSetOptionPriceDescriptions() {
        return (this.optionPriceDescriptions!= null);
    }

}
