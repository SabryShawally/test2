
package se.linkon.petra.gtssales.validcodes.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidCodeSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidCodeSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidCodeSpecification" type="{http://petra.linkon.se/gtssales/validcodes/data/v1_17}ValidCodeSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidCodeSpecificationsType", propOrder = {
    "validCodeSpecification"
})
public class ValidCodeSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidCodeSpecification", required = true)
    protected List<ValidCodeSpecificationType> validCodeSpecification;

    /**
     * Gets the value of the validCodeSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validCodeSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidCodeSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidCodeSpecificationType }
     * 
     * 
     */
    public List<ValidCodeSpecificationType> getValidCodeSpecification() {
        if (validCodeSpecification == null) {
            validCodeSpecification = new ArrayList<ValidCodeSpecificationType>();
        }
        return this.validCodeSpecification;
    }

    public boolean isSetValidCodeSpecification() {
        return ((this.validCodeSpecification!= null)&&(!this.validCodeSpecification.isEmpty()));
    }

    public void unsetValidCodeSpecification() {
        this.validCodeSpecification = null;
    }

}
