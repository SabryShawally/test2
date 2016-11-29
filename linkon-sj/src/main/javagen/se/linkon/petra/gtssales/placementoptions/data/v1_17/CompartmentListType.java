
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The list of compartments descriptions.
 * 			
 * 
 * <p>Java class for CompartmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Compartment" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}CompartmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentListType", propOrder = {
    "compartment"
})
public class CompartmentListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Compartment")
    protected List<CompartmentType> compartment;

    /**
     * Gets the value of the compartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentType }
     * 
     * 
     */
    public List<CompartmentType> getCompartment() {
        if (compartment == null) {
            compartment = new ArrayList<CompartmentType>();
        }
        return this.compartment;
    }

    public boolean isSetCompartment() {
        return ((this.compartment!= null)&&(!this.compartment.isEmpty()));
    }

    public void unsetCompartment() {
        this.compartment = null;
    }

}
