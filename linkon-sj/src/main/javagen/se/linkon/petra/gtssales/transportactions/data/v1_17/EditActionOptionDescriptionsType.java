
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionOptionDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionOptionDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditActionOptionDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionOptionDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionOptionDescriptionsType", propOrder = {
    "editActionOptionDescription"
})
public class EditActionOptionDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionOptionDescription", required = true)
    protected List<EditActionOptionDescriptionType> editActionOptionDescription;

    /**
     * Gets the value of the editActionOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editActionOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditActionOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditActionOptionDescriptionType }
     * 
     * 
     */
    public List<EditActionOptionDescriptionType> getEditActionOptionDescription() {
        if (editActionOptionDescription == null) {
            editActionOptionDescription = new ArrayList<EditActionOptionDescriptionType>();
        }
        return this.editActionOptionDescription;
    }

    public boolean isSetEditActionOptionDescription() {
        return ((this.editActionOptionDescription!= null)&&(!this.editActionOptionDescription.isEmpty()));
    }

    public void unsetEditActionOptionDescription() {
        this.editActionOptionDescription = null;
    }

}
