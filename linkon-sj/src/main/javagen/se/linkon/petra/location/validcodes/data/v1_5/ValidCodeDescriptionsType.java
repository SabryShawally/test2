
package se.linkon.petra.location.validcodes.data.v1_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidCodeDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidCodeDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidCodeDescription" type="{http://petra.linkon.se/location/validcodes/data/v1_5}ValidCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidCodeDescriptionsType", propOrder = {
    "validCodeDescription"
})
public class ValidCodeDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidCodeDescription")
    protected List<ValidCodeDescriptionType> validCodeDescription;

    /**
     * Gets the value of the validCodeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validCodeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidCodeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidCodeDescriptionType }
     * 
     * 
     */
    public List<ValidCodeDescriptionType> getValidCodeDescription() {
        if (validCodeDescription == null) {
            validCodeDescription = new ArrayList<ValidCodeDescriptionType>();
        }
        return this.validCodeDescription;
    }

    public boolean isSetValidCodeDescription() {
        return ((this.validCodeDescription!= null)&&(!this.validCodeDescription.isEmpty()));
    }

    public void unsetValidCodeDescription() {
        this.validCodeDescription = null;
    }

}
