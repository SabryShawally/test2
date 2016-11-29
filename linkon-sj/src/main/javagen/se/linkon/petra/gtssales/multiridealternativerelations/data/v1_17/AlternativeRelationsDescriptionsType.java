
package se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativeRelationsDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeRelationsDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativeRelationsDescriptionType" type="{http://petra.linkon.se/gtssales/multiridealternativerelations/data/v1_17}AlternativeRelationsDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeRelationsDescriptionsType", propOrder = {
    "alternativeRelationsDescriptionType"
})
public class AlternativeRelationsDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AlternativeRelationsDescriptionType", required = true)
    protected List<AlternativeRelationsDescriptionType> alternativeRelationsDescriptionType;

    /**
     * Gets the value of the alternativeRelationsDescriptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeRelationsDescriptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeRelationsDescriptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeRelationsDescriptionType }
     * 
     * 
     */
    public List<AlternativeRelationsDescriptionType> getAlternativeRelationsDescriptionType() {
        if (alternativeRelationsDescriptionType == null) {
            alternativeRelationsDescriptionType = new ArrayList<AlternativeRelationsDescriptionType>();
        }
        return this.alternativeRelationsDescriptionType;
    }

    public boolean isSetAlternativeRelationsDescriptionType() {
        return ((this.alternativeRelationsDescriptionType!= null)&&(!this.alternativeRelationsDescriptionType.isEmpty()));
    }

    public void unsetAlternativeRelationsDescriptionType() {
        this.alternativeRelationsDescriptionType = null;
    }

}
