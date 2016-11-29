
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Describes the separate price of a certain component
 * 				variant (such as a station fee, Arlanda) included in the consumer
 * 				price.
 * 			
 * 
 * <p>Java class for SeparatePriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparatePriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="OptionDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}OptionDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparatePriceDescriptionType", propOrder = {
    "itineraryReference",
    "optionDescription"
})
public class SeparatePriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "OptionDescription", required = true)
    protected OptionDescriptionType optionDescription;

    /**
     * Gets the value of the itineraryReference property.
     * 
     */
    public int getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     */
    public void setItineraryReference(int value) {
        this.itineraryReference = value;
    }

    public boolean isSetItineraryReference() {
        return true;
    }

    /**
     * Gets the value of the optionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionType }
     *     
     */
    public OptionDescriptionType getOptionDescription() {
        return optionDescription;
    }

    /**
     * Sets the value of the optionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionType }
     *     
     */
    public void setOptionDescription(OptionDescriptionType value) {
        this.optionDescription = value;
    }

    public boolean isSetOptionDescription() {
        return (this.optionDescription!= null);
    }

}
