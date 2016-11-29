
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeparateTotalPriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparateTotalPriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeparateTotalPriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SeparateTotalPriceDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparateTotalPriceDescriptionsType", propOrder = {
    "separateTotalPriceDescription"
})
public class SeparateTotalPriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SeparateTotalPriceDescription", required = true)
    protected List<SeparateTotalPriceDescriptionType> separateTotalPriceDescription;

    /**
     * Gets the value of the separateTotalPriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separateTotalPriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparateTotalPriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeparateTotalPriceDescriptionType }
     * 
     * 
     */
    public List<SeparateTotalPriceDescriptionType> getSeparateTotalPriceDescription() {
        if (separateTotalPriceDescription == null) {
            separateTotalPriceDescription = new ArrayList<SeparateTotalPriceDescriptionType>();
        }
        return this.separateTotalPriceDescription;
    }

    public boolean isSetSeparateTotalPriceDescription() {
        return ((this.separateTotalPriceDescription!= null)&&(!this.separateTotalPriceDescription.isEmpty()));
    }

    public void unsetSeparateTotalPriceDescription() {
        this.separateTotalPriceDescription = null;
    }

}
