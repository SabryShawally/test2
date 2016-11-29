
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompartmentTypeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentTypeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompartmentTypeDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}CompartmentTypeDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentTypeDetail", propOrder = {
    "compartmentTypeDetailType"
})
public class CompartmentTypeDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CompartmentTypeDetailType", required = true)
    protected List<CompartmentTypeDetailType> compartmentTypeDetailType;

    /**
     * Gets the value of the compartmentTypeDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentTypeDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentTypeDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentTypeDetailType }
     * 
     * 
     */
    public List<CompartmentTypeDetailType> getCompartmentTypeDetailType() {
        if (compartmentTypeDetailType == null) {
            compartmentTypeDetailType = new ArrayList<CompartmentTypeDetailType>();
        }
        return this.compartmentTypeDetailType;
    }

    public boolean isSetCompartmentTypeDetailType() {
        return ((this.compartmentTypeDetailType!= null)&&(!this.compartmentTypeDetailType.isEmpty()));
    }

    public void unsetCompartmentTypeDetailType() {
        this.compartmentTypeDetailType = null;
    }

}
