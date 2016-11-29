
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionSpecification" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}OptionSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSpecificationsType", propOrder = {
    "optionSpecification"
})
public class OptionSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OptionSpecification", required = true)
    protected List<OptionSpecificationType> optionSpecification;

    /**
     * Gets the value of the optionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionSpecificationType }
     * 
     * 
     */
    public List<OptionSpecificationType> getOptionSpecification() {
        if (optionSpecification == null) {
            optionSpecification = new ArrayList<OptionSpecificationType>();
        }
        return this.optionSpecification;
    }

    public boolean isSetOptionSpecification() {
        return ((this.optionSpecification!= null)&&(!this.optionSpecification.isEmpty()));
    }

    public void unsetOptionSpecification() {
        this.optionSpecification = null;
    }

}
