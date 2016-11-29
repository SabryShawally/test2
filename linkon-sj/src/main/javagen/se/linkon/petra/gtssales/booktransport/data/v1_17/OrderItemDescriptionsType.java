
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemDescription" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}OrderItemDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDescriptionsType", propOrder = {
    "orderItemDescription"
})
public class OrderItemDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemDescription", required = true)
    protected List<OrderItemDescriptionType> orderItemDescription;

    /**
     * Gets the value of the orderItemDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDescriptionType }
     * 
     * 
     */
    public List<OrderItemDescriptionType> getOrderItemDescription() {
        if (orderItemDescription == null) {
            orderItemDescription = new ArrayList<OrderItemDescriptionType>();
        }
        return this.orderItemDescription;
    }

    public boolean isSetOrderItemDescription() {
        return ((this.orderItemDescription!= null)&&(!this.orderItemDescription.isEmpty()));
    }

    public void unsetOrderItemDescription() {
        this.orderItemDescription = null;
    }

}
