
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemSpecificationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemSpecificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemSpecification" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}OrderItemSpecificationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemSpecificationsType", propOrder = {
    "orderItemSpecification"
})
public class OrderItemSpecificationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemSpecification", required = true)
    protected List<OrderItemSpecificationType> orderItemSpecification;

    /**
     * Gets the value of the orderItemSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemSpecificationType }
     * 
     * 
     */
    public List<OrderItemSpecificationType> getOrderItemSpecification() {
        if (orderItemSpecification == null) {
            orderItemSpecification = new ArrayList<OrderItemSpecificationType>();
        }
        return this.orderItemSpecification;
    }

    public boolean isSetOrderItemSpecification() {
        return ((this.orderItemSpecification!= null)&&(!this.orderItemSpecification.isEmpty()));
    }

    public void unsetOrderItemSpecification() {
        this.orderItemSpecification = null;
    }

}
