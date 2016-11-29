
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformationDescription" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}InformationDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationDescriptionsType", propOrder = {
    "informationDescription"
})
public class InformationDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "InformationDescription", required = true)
    protected List<InformationDescriptionType> informationDescription;

    /**
     * Gets the value of the informationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationDescriptionType }
     * 
     * 
     */
    public List<InformationDescriptionType> getInformationDescription() {
        if (informationDescription == null) {
            informationDescription = new ArrayList<InformationDescriptionType>();
        }
        return this.informationDescription;
    }

    public boolean isSetInformationDescription() {
        return ((this.informationDescription!= null)&&(!this.informationDescription.isEmpty()));
    }

    public void unsetInformationDescription() {
        this.informationDescription = null;
    }

}
