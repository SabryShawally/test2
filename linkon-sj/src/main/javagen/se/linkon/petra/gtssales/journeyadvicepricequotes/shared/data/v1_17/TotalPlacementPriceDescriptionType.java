
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * Describes the total placement price (included in
 * 				the total price).
 * 			
 * 
 * <p>Java class for TotalPlacementPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPlacementPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalPriceIncludesPlacementPrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPlacementPriceDescriptionType", propOrder = {
    "price",
    "totalPriceIncludesPlacementPrice"
})
public class TotalPlacementPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Price")
    protected Money price;
    @XmlElement(name = "TotalPriceIncludesPlacementPrice")
    protected EmptyType totalPriceIncludesPlacementPrice;

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

}
