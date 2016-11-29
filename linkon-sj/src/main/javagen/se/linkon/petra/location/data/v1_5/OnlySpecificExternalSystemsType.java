
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlySpecificExternalSystemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlySpecificExternalSystemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlySpecificExternalSystemsType", propOrder = {
    "externalSystem"
})
public class OnlySpecificExternalSystemsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ExternalSystem", required = true)
    protected List<String> externalSystem;

    /**
     * Gets the value of the externalSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalSystem() {
        if (externalSystem == null) {
            externalSystem = new ArrayList<String>();
        }
        return this.externalSystem;
    }

    public boolean isSetExternalSystem() {
        return ((this.externalSystem!= null)&&(!this.externalSystem.isEmpty()));
    }

    public void unsetExternalSystem() {
        this.externalSystem = null;
    }

}
