
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryPriceGroupChoicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPriceGroupChoicesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryPriceGroupChoice" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}ItineraryPriceGroupChoiceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPriceGroupChoicesType", propOrder = {
    "itineraryPriceGroupChoice"
})
public class ItineraryPriceGroupChoicesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryPriceGroupChoice", required = true)
    protected List<ItineraryPriceGroupChoiceType> itineraryPriceGroupChoice;

    /**
     * Gets the value of the itineraryPriceGroupChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPriceGroupChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPriceGroupChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryPriceGroupChoiceType }
     * 
     * 
     */
    public List<ItineraryPriceGroupChoiceType> getItineraryPriceGroupChoice() {
        if (itineraryPriceGroupChoice == null) {
            itineraryPriceGroupChoice = new ArrayList<ItineraryPriceGroupChoiceType>();
        }
        return this.itineraryPriceGroupChoice;
    }

    public boolean isSetItineraryPriceGroupChoice() {
        return ((this.itineraryPriceGroupChoice!= null)&&(!this.itineraryPriceGroupChoice.isEmpty()));
    }

    public void unsetItineraryPriceGroupChoice() {
        this.itineraryPriceGroupChoice = null;
    }

}
