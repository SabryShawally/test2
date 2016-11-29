
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionSegmentDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionSegmentDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditActionSegmentDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionSegmentDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionSegmentDescriptionsType", propOrder = {
    "editActionSegmentDescription"
})
public class EditActionSegmentDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionSegmentDescription", required = true)
    protected List<EditActionSegmentDescriptionType> editActionSegmentDescription;

    /**
     * Gets the value of the editActionSegmentDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editActionSegmentDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditActionSegmentDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditActionSegmentDescriptionType }
     * 
     * 
     */
    public List<EditActionSegmentDescriptionType> getEditActionSegmentDescription() {
        if (editActionSegmentDescription == null) {
            editActionSegmentDescription = new ArrayList<EditActionSegmentDescriptionType>();
        }
        return this.editActionSegmentDescription;
    }

    public boolean isSetEditActionSegmentDescription() {
        return ((this.editActionSegmentDescription!= null)&&(!this.editActionSegmentDescription.isEmpty()));
    }

    public void unsetEditActionSegmentDescription() {
        this.editActionSegmentDescription = null;
    }

}
