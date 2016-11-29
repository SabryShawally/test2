
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceGroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGroupsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceGroup" type="{http://petra.linkon.se/gtssales/pricegroups/data/v1_17}PriceGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGroupsType", propOrder = {
    "priceGroup"
})
public class PriceGroupsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroup", required = true)
    protected List<PriceGroupType> priceGroup;

    /**
     * Gets the value of the priceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceGroupType }
     * 
     * 
     */
    public List<PriceGroupType> getPriceGroup() {
        if (priceGroup == null) {
            priceGroup = new ArrayList<PriceGroupType>();
        }
        return this.priceGroup;
    }

    public boolean isSetPriceGroup() {
        return ((this.priceGroup!= null)&&(!this.priceGroup.isEmpty()));
    }

    public void unsetPriceGroup() {
        this.priceGroup = null;
    }

}
