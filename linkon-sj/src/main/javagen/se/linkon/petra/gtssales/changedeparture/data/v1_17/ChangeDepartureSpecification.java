
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
 *         &lt;element name="OrderSpecification" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}OrderSpecificationType"/&gt;
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
    "orderSpecification"
})
@XmlRootElement(name = "ChangeDepartureSpecification")
public class ChangeDepartureSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderSpecification", required = true)
    protected OrderSpecificationType orderSpecification;

    /**
     * Gets the value of the orderSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSpecificationType }
     *     
     */
    public OrderSpecificationType getOrderSpecification() {
        return orderSpecification;
    }

    /**
     * Sets the value of the orderSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSpecificationType }
     *     
     */
    public void setOrderSpecification(OrderSpecificationType value) {
        this.orderSpecification = value;
    }

    public boolean isSetOrderSpecification() {
        return (this.orderSpecification!= null);
    }

}
