
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

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
 *         &lt;element name="JourneyAdviceDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}JourneyAdviceDescriptionsType"/&gt;
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
    "journeyAdviceDescriptions"
})
@XmlRootElement(name = "GetJourneyAdviceOverviewPriceQuotesDescription")
public class GetJourneyAdviceOverviewPriceQuotesDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "JourneyAdviceDescriptions", required = true)
    protected JourneyAdviceDescriptionsType journeyAdviceDescriptions;

    /**
     * Gets the value of the journeyAdviceDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdviceDescriptionsType }
     *     
     */
    public JourneyAdviceDescriptionsType getJourneyAdviceDescriptions() {
        return journeyAdviceDescriptions;
    }

    /**
     * Sets the value of the journeyAdviceDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdviceDescriptionsType }
     *     
     */
    public void setJourneyAdviceDescriptions(JourneyAdviceDescriptionsType value) {
        this.journeyAdviceDescriptions = value;
    }

    public boolean isSetJourneyAdviceDescriptions() {
        return (this.journeyAdviceDescriptions!= null);
    }

}
