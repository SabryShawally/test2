
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionComponentVariantsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionComponentVariantsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditActionComponentVariant" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionComponentVariantType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionComponentVariantsType", propOrder = {
    "editActionComponentVariant"
})
public class EditActionComponentVariantsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionComponentVariant", required = true)
    protected List<EditActionComponentVariantType> editActionComponentVariant;

    /**
     * Gets the value of the editActionComponentVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editActionComponentVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditActionComponentVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditActionComponentVariantType }
     * 
     * 
     */
    public List<EditActionComponentVariantType> getEditActionComponentVariant() {
        if (editActionComponentVariant == null) {
            editActionComponentVariant = new ArrayList<EditActionComponentVariantType>();
        }
        return this.editActionComponentVariant;
    }

    public boolean isSetEditActionComponentVariant() {
        return ((this.editActionComponentVariant!= null)&&(!this.editActionComponentVariant.isEmpty()));
    }

    public void unsetEditActionComponentVariant() {
        this.editActionComponentVariant = null;
    }

}
