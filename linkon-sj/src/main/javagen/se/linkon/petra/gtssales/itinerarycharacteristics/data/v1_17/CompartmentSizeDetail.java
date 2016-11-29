
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompartmentSizeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentSizeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompartmentSizeDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}CompartmentSizeDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentSizeDetail", propOrder = {
    "compartmentSizeDetailType"
})
public class CompartmentSizeDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CompartmentSizeDetailType", required = true)
    protected List<CompartmentSizeDetailType> compartmentSizeDetailType;

    /**
     * Gets the value of the compartmentSizeDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentSizeDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentSizeDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentSizeDetailType }
     * 
     * 
     */
    public List<CompartmentSizeDetailType> getCompartmentSizeDetailType() {
        if (compartmentSizeDetailType == null) {
            compartmentSizeDetailType = new ArrayList<CompartmentSizeDetailType>();
        }
        return this.compartmentSizeDetailType;
    }

    public boolean isSetCompartmentSizeDetailType() {
        return ((this.compartmentSizeDetailType!= null)&&(!this.compartmentSizeDetailType.isEmpty()));
    }

    public void unsetCompartmentSizeDetailType() {
        this.compartmentSizeDetailType = null;
    }

}
