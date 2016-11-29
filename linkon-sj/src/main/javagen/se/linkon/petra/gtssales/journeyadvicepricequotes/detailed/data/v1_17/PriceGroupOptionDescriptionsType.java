
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceGroupOptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupOptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceGroupOptionDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}PriceGroupOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupOptionDescriptionsType", propOrder = {
    "priceGroupOptionDescription"
})
public class PriceGroupOptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroupOptionDescription", required = true)
    protected List<PriceGroupOptionDescriptionType> priceGroupOptionDescription;

    /**
     * Gets the value of the priceGroupOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceGroupOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceGroupOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceGroupOptionDescriptionType }
     * 
     * 
     */
    public List<PriceGroupOptionDescriptionType> getPriceGroupOptionDescription() {
        if (priceGroupOptionDescription == null) {
            priceGroupOptionDescription = new ArrayList<PriceGroupOptionDescriptionType>();
        }
        return this.priceGroupOptionDescription;
    }

    public boolean isSetPriceGroupOptionDescription() {
        return ((this.priceGroupOptionDescription!= null)&&(!this.priceGroupOptionDescription.isEmpty()));
    }

    public void unsetPriceGroupOptionDescription() {
        this.priceGroupOptionDescription = null;
    }

}
