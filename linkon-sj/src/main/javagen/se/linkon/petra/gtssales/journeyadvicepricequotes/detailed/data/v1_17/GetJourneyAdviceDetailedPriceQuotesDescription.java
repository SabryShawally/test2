
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="JourneyAdviceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}JourneyAdviceDescriptionType"/&gt;
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
    "journeyAdviceDescription"
})
@XmlRootElement(name = "GetJourneyAdviceDetailedPriceQuotesDescription")
public class GetJourneyAdviceDetailedPriceQuotesDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyAdviceDescription", required = true)
    protected JourneyAdviceDescriptionType journeyAdviceDescription;

    /**
     * Gets the value of the journeyAdviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdviceDescriptionType }
     *     
     */
    public JourneyAdviceDescriptionType getJourneyAdviceDescription() {
        return journeyAdviceDescription;
    }

    /**
     * Sets the value of the journeyAdviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdviceDescriptionType }
     *     
     */
    public void setJourneyAdviceDescription(JourneyAdviceDescriptionType value) {
        this.journeyAdviceDescription = value;
    }

    public boolean isSetJourneyAdviceDescription() {
        return (this.journeyAdviceDescription!= null);
    }

}
