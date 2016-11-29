
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element name="OrderItemDescriptions" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}OrderItemDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDescriptionType", propOrder = {
    "salesOrderId",
    "orderItemDescriptions"
})
public class OrderDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderItemDescriptions", required = true)
    protected OrderItemDescriptionsType orderItemDescriptions;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderId(String value) {
        this.salesOrderId = value;
    }

    public boolean isSetSalesOrderId() {
        return (this.salesOrderId!= null);
    }

    /**
     * Gets the value of the orderItemDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDescriptionsType }
     *     
     */
    public OrderItemDescriptionsType getOrderItemDescriptions() {
        return orderItemDescriptions;
    }

    /**
     * Sets the value of the orderItemDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDescriptionsType }
     *     
     */
    public void setOrderItemDescriptions(OrderItemDescriptionsType value) {
        this.orderItemDescriptions = value;
    }

    public boolean isSetOrderItemDescriptions() {
        return (this.orderItemDescriptions!= null);
    }

}
