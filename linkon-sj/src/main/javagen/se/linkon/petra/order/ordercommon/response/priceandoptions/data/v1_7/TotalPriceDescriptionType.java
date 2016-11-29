
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * 
 * 				Total price for the requested salesOrderId. 
 * 			
 * 
 * <p>Java class for TotalPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPrice" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *         &lt;element name="TotalBookingFee" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *         &lt;element name="TotalPoints" type="{http://petra.linkon.se/commonelements/data/v4_6}PointsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPriceDescriptionType", propOrder = {
    "totalPrice",
    "totalBookingFee",
    "totalPoints"
})
public class TotalPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TotalPrice", required = true)
    protected PriceVatType totalPrice;
    @XmlElement(name = "TotalBookingFee", required = true)
    protected PriceVatType totalBookingFee;
    @XmlElement(name = "TotalPoints")
    protected Integer totalPoints;

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setTotalPrice(PriceVatType value) {
        this.totalPrice = value;
    }

    public boolean isSetTotalPrice() {
        return (this.totalPrice!= null);
    }

    /**
     * Gets the value of the totalBookingFee property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getTotalBookingFee() {
        return totalBookingFee;
    }

    /**
     * Sets the value of the totalBookingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setTotalBookingFee(PriceVatType value) {
        this.totalBookingFee = value;
    }

    public boolean isSetTotalBookingFee() {
        return (this.totalBookingFee!= null);
    }

    /**
     * Gets the value of the totalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPoints() {
        return totalPoints;
    }

    /**
     * Sets the value of the totalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPoints(Integer value) {
        this.totalPoints = value;
    }

    public boolean isSetTotalPoints() {
        return (this.totalPoints!= null);
    }

}
