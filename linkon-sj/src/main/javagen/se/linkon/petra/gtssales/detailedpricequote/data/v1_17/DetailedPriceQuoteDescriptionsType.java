
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedPriceQuoteDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPriceQuoteDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailedPriceQuoteDescription" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}DetailedPriceQuoteDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPriceQuoteDescriptionsType", propOrder = {
    "detailedPriceQuoteDescription"
})
public class DetailedPriceQuoteDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DetailedPriceQuoteDescription", required = true)
    protected List<DetailedPriceQuoteDescriptionType> detailedPriceQuoteDescription;

    /**
     * Gets the value of the detailedPriceQuoteDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedPriceQuoteDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedPriceQuoteDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedPriceQuoteDescriptionType }
     * 
     * 
     */
    public List<DetailedPriceQuoteDescriptionType> getDetailedPriceQuoteDescription() {
        if (detailedPriceQuoteDescription == null) {
            detailedPriceQuoteDescription = new ArrayList<DetailedPriceQuoteDescriptionType>();
        }
        return this.detailedPriceQuoteDescription;
    }

    public boolean isSetDetailedPriceQuoteDescription() {
        return ((this.detailedPriceQuoteDescription!= null)&&(!this.detailedPriceQuoteDescription.isEmpty()));
    }

    public void unsetDetailedPriceQuoteDescription() {
        this.detailedPriceQuoteDescription = null;
    }

}
