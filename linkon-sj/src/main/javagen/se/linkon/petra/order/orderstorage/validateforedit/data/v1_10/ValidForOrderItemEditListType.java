
package se.linkon.petra.order.orderstorage.validateforedit.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidForOrderItemEditListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidForOrderItemEditListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidForOrderItemEdit" type="{http://petra.linkon.se/order/orderstorage/validateforedit/data/v1_10}ValidForOrderItemEditType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidForOrderItemEditListType", propOrder = {
    "validForOrderItemEdit"
})
public class ValidForOrderItemEditListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidForOrderItemEdit", required = true)
    protected List<ValidForOrderItemEditType> validForOrderItemEdit;

    /**
     * Gets the value of the validForOrderItemEdit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validForOrderItemEdit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidForOrderItemEdit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidForOrderItemEditType }
     * 
     * 
     */
    public List<ValidForOrderItemEditType> getValidForOrderItemEdit() {
        if (validForOrderItemEdit == null) {
            validForOrderItemEdit = new ArrayList<ValidForOrderItemEditType>();
        }
        return this.validForOrderItemEdit;
    }

    public boolean isSetValidForOrderItemEdit() {
        return ((this.validForOrderItemEdit!= null)&&(!this.validForOrderItemEdit.isEmpty()));
    }

    public void unsetValidForOrderItemEdit() {
        this.validForOrderItemEdit = null;
    }

}
