
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes separate prices within the base price
 * 				that are "forced" mandatory,
 * 				such as "Stationsavgift Arlanda".
 * 			
 * 
 * <p>Java class for SeparatePriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparatePriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OptionDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparatePriceDescriptionsType", propOrder = {
    "optionDescriptions"
})
public class SeparatePriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OptionDescriptions", required = true)
    protected OptionDescriptionsType optionDescriptions;

    /**
     * Gets the value of the optionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public OptionDescriptionsType getOptionDescriptions() {
        return optionDescriptions;
    }

    /**
     * Sets the value of the optionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public void setOptionDescriptions(OptionDescriptionsType value) {
        this.optionDescriptions = value;
    }

    public boolean isSetOptionDescriptions() {
        return (this.optionDescriptions!= null);
    }

}
