
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="ItineraryServiceSpecification" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}ItineraryServiceSpecificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemSpecificationType", propOrder = {
    "orderItemId",
    "itineraryServiceSpecification"
})
public class OrderItemSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "ItineraryServiceSpecification", required = true)
    protected ItineraryServiceSpecificationType itineraryServiceSpecification;

    /**
     * Gets the value of the orderItemId property.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return true;
    }

    /**
     * Gets the value of the itineraryServiceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryServiceSpecificationType }
     *     
     */
    public ItineraryServiceSpecificationType getItineraryServiceSpecification() {
        return itineraryServiceSpecification;
    }

    /**
     * Sets the value of the itineraryServiceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryServiceSpecificationType }
     *     
     */
    public void setItineraryServiceSpecification(ItineraryServiceSpecificationType value) {
        this.itineraryServiceSpecification = value;
    }

    public boolean isSetItineraryServiceSpecification() {
        return (this.itineraryServiceSpecification!= null);
    }

}
