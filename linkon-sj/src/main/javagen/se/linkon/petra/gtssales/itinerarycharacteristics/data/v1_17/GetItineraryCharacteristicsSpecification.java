
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="ItineraryCharacteristicsSpecification" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}ItineraryCharacteristicsSpecificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceGroupCode",
    "itineraryCharacteristicsSpecification"
})
@XmlRootElement(name = "GetItineraryCharacteristicsSpecification")
public class GetItineraryCharacteristicsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "ItineraryCharacteristicsSpecification", required = true)
    protected ItineraryCharacteristicsSpecificationType itineraryCharacteristicsSpecification;

    /**
     * Gets the value of the priceGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public PriceGroupCodeType getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Sets the value of the priceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public void setPriceGroupCode(PriceGroupCodeType value) {
        this.priceGroupCode = value;
    }

    public boolean isSetPriceGroupCode() {
        return (this.priceGroupCode!= null);
    }

    /**
     * Gets the value of the itineraryCharacteristicsSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryCharacteristicsSpecificationType }
     *     
     */
    public ItineraryCharacteristicsSpecificationType getItineraryCharacteristicsSpecification() {
        return itineraryCharacteristicsSpecification;
    }

    /**
     * Sets the value of the itineraryCharacteristicsSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryCharacteristicsSpecificationType }
     *     
     */
    public void setItineraryCharacteristicsSpecification(ItineraryCharacteristicsSpecificationType value) {
        this.itineraryCharacteristicsSpecification = value;
    }

    public boolean isSetItineraryCharacteristicsSpecification() {
        return (this.itineraryCharacteristicsSpecification!= null);
    }

}
