
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * Describes the price of a service with respect to
 * 				the total price and the booking fee.
 * 			
 * 
 * <p>Java class for PriceSectionTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSectionTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *         &lt;element name="BookingFee" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSectionTotalType", propOrder = {
    "price",
    "bookingFee"
})
public class PriceSectionTotalType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Price", required = true)
    protected PriceVatType price;
    @XmlElement(name = "BookingFee")
    protected Money bookingFee;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setPrice(PriceVatType value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
    }

    /**
     * Gets the value of the bookingFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBookingFee() {
        return bookingFee;
    }

    /**
     * Sets the value of the bookingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBookingFee(Money value) {
        this.bookingFee = value;
    }

    public boolean isSetBookingFee() {
        return (this.bookingFee!= null);
    }

}
