
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentVariantsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentVariantsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentVariant" type="{http://petra.linkon.se/gtssales/pricegroups/data/v1_17}ComponentVariantType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentVariantsType", propOrder = {
    "componentVariant"
})
public class ComponentVariantsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentVariant", required = true)
    protected List<ComponentVariantType> componentVariant;

    /**
     * Gets the value of the componentVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentVariantType }
     * 
     * 
     */
    public List<ComponentVariantType> getComponentVariant() {
        if (componentVariant == null) {
            componentVariant = new ArrayList<ComponentVariantType>();
        }
        return this.componentVariant;
    }

    public boolean isSetComponentVariant() {
        return ((this.componentVariant!= null)&&(!this.componentVariant.isEmpty()));
    }

    public void unsetComponentVariant() {
        this.componentVariant = null;
    }

}
