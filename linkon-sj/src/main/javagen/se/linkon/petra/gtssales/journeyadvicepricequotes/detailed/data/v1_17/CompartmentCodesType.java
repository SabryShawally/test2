
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;


/**
 * <p>Java class for CompartmentCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompartmentCode" type="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCodeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentCodesType", propOrder = {
    "compartmentCode"
})
public class CompartmentCodesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CompartmentCode", required = true)
    protected List<CompartmentCodeType> compartmentCode;

    /**
     * Gets the value of the compartmentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentCodeType }
     * 
     * 
     */
    public List<CompartmentCodeType> getCompartmentCode() {
        if (compartmentCode == null) {
            compartmentCode = new ArrayList<CompartmentCodeType>();
        }
        return this.compartmentCode;
    }

    public boolean isSetCompartmentCode() {
        return ((this.compartmentCode!= null)&&(!this.compartmentCode.isEmpty()));
    }

    public void unsetCompartmentCode() {
        this.compartmentCode = null;
    }

}
