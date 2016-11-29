
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceGroupDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceGroupDescription" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}PriceGroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupDescriptionsType", propOrder = {
    "priceGroupDescription"
})
public class PriceGroupDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroupDescription")
    protected List<PriceGroupDescriptionType> priceGroupDescription;

    /**
     * Gets the value of the priceGroupDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceGroupDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceGroupDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceGroupDescriptionType }
     * 
     * 
     */
    public List<PriceGroupDescriptionType> getPriceGroupDescription() {
        if (priceGroupDescription == null) {
            priceGroupDescription = new ArrayList<PriceGroupDescriptionType>();
        }
        return this.priceGroupDescription;
    }

    public boolean isSetPriceGroupDescription() {
        return ((this.priceGroupDescription!= null)&&(!this.priceGroupDescription.isEmpty()));
    }

    public void unsetPriceGroupDescription() {
        this.priceGroupDescription = null;
    }

}
