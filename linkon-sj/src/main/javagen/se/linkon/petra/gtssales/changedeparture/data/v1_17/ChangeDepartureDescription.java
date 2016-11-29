
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDescription" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}OrderDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderDescription"
})
@XmlRootElement(name = "ChangeDepartureDescription")
public class ChangeDepartureDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderDescription", required = true)
    protected OrderDescriptionType orderDescription;

    /**
     * Gets the value of the orderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDescriptionType }
     *     
     */
    public OrderDescriptionType getOrderDescription() {
        return orderDescription;
    }

    /**
     * Sets the value of the orderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDescriptionType }
     *     
     */
    public void setOrderDescription(OrderDescriptionType value) {
        this.orderDescription = value;
    }

    public boolean isSetOrderDescription() {
        return (this.orderDescription!= null);
    }

}
