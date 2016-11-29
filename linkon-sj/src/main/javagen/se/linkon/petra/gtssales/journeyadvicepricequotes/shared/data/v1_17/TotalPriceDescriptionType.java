
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;


/**
 * Describes the total price.
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
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money" minOccurs="0"/&gt;
 *         &lt;element name="SeparateTotalPriceDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SeparateTotalPriceDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Points" minOccurs="0"/&gt;
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
    "price",
    "separateTotalPriceDescriptions",
    "points"
})
public class TotalPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Price")
    protected Money price;
    @XmlElement(name = "SeparateTotalPriceDescriptions")
    protected SeparateTotalPriceDescriptionsType separateTotalPriceDescriptions;
    @XmlElement(name = "Points", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer points;

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
     * Gets the value of the separateTotalPriceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SeparateTotalPriceDescriptionsType }
     *     
     */
    public SeparateTotalPriceDescriptionsType getSeparateTotalPriceDescriptions() {
        return separateTotalPriceDescriptions;
    }

    /**
     * Sets the value of the separateTotalPriceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparateTotalPriceDescriptionsType }
     *     
     */
    public void setSeparateTotalPriceDescriptions(SeparateTotalPriceDescriptionsType value) {
        this.separateTotalPriceDescriptions = value;
    }

    public boolean isSetSeparateTotalPriceDescriptions() {
        return (this.separateTotalPriceDescriptions!= null);
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return (this.points!= null);
    }

}
