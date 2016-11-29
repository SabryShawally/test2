
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * Describes the price of an entire compartment,
 * 				possibly containing multiple passengers of various passenger
 * 				categories.
 * 			
 * 
 * <p>Java class for CompartmentPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerCategoryDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}PassengerCategoryDescriptionsType"/&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentPriceDescriptionType", propOrder = {
    "passengerCategoryDescriptions",
    "price"
})
public class CompartmentPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategoryDescriptions", required = true)
    protected PassengerCategoryDescriptionsType passengerCategoryDescriptions;
    @XmlElement(name = "Price", required = true)
    protected PriceVatType price;

    /**
     * Gets the value of the passengerCategoryDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoryDescriptionsType }
     *     
     */
    public PassengerCategoryDescriptionsType getPassengerCategoryDescriptions() {
        return passengerCategoryDescriptions;
    }

    /**
     * Sets the value of the passengerCategoryDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoryDescriptionsType }
     *     
     */
    public void setPassengerCategoryDescriptions(PassengerCategoryDescriptionsType value) {
        this.passengerCategoryDescriptions = value;
    }

    public boolean isSetPassengerCategoryDescriptions() {
        return (this.passengerCategoryDescriptions!= null);
    }

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

}
