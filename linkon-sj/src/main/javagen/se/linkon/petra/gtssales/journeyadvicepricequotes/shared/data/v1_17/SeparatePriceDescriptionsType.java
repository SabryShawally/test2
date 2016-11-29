
package se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeparatePriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparatePriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeparatePriceDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}SeparatePriceDescriptionType" maxOccurs="unbounded"/&gt;
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
    "separatePriceDescription"
})
public class SeparatePriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SeparatePriceDescription", required = true)
    protected List<SeparatePriceDescriptionType> separatePriceDescription;

    /**
     * Gets the value of the separatePriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separatePriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparatePriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeparatePriceDescriptionType }
     * 
     * 
     */
    public List<SeparatePriceDescriptionType> getSeparatePriceDescription() {
        if (separatePriceDescription == null) {
            separatePriceDescription = new ArrayList<SeparatePriceDescriptionType>();
        }
        return this.separatePriceDescription;
    }

    public boolean isSetSeparatePriceDescription() {
        return ((this.separatePriceDescription!= null)&&(!this.separatePriceDescription.isEmpty()));
    }

    public void unsetSeparatePriceDescription() {
        this.separatePriceDescription = null;
    }

}
