
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the price group choices available for each part of the journey advice.
 * 
 * <p>Java class for PriceGroupChoicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupChoicesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyAdviceParts" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}JourneyAdvicePartsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupChoicesType", propOrder = {
    "journeyAdviceParts"
})
public class PriceGroupChoicesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyAdviceParts", required = true)
    protected JourneyAdvicePartsType journeyAdviceParts;

    /**
     * Gets the value of the journeyAdviceParts property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdvicePartsType }
     *     
     */
    public JourneyAdvicePartsType getJourneyAdviceParts() {
        return journeyAdviceParts;
    }

    /**
     * Sets the value of the journeyAdviceParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdvicePartsType }
     *     
     */
    public void setJourneyAdviceParts(JourneyAdvicePartsType value) {
        this.journeyAdviceParts = value;
    }

    public boolean isSetJourneyAdviceParts() {
        return (this.journeyAdviceParts!= null);
    }

}
