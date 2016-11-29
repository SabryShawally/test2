
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionDescription" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}OptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDescriptionsType", propOrder = {
    "optionDescription"
})
public class OptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OptionDescription", required = true)
    protected List<OptionDescriptionType> optionDescription;

    /**
     * Gets the value of the optionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionDescriptionType }
     * 
     * 
     */
    public List<OptionDescriptionType> getOptionDescription() {
        if (optionDescription == null) {
            optionDescription = new ArrayList<OptionDescriptionType>();
        }
        return this.optionDescription;
    }

    public boolean isSetOptionDescription() {
        return ((this.optionDescription!= null)&&(!this.optionDescription.isEmpty()));
    }

    public void unsetOptionDescription() {
        this.optionDescription = null;
    }

}
