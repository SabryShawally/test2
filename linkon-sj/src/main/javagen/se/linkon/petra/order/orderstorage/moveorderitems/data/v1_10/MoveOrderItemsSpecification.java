
package se.linkon.petra.order.orderstorage.moveorderitems.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockId"/&gt;
 *         &lt;element name="SourceOrderSpecification" type="{http://petra.linkon.se/order/orderstorage/moveorderitems/data/v1_10}SourceOrderSpecificationType"/&gt;
 *         &lt;element name="DestinationOrderSpecification" type="{http://petra.linkon.se/order/orderstorage/moveorderitems/data/v1_10}DestinationOrderSpecificationType"/&gt;
 *         &lt;element name="CopyPayerCustomerId" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="CopyOrderReference" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
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
    "orderLockId",
    "sourceOrderSpecification",
    "destinationOrderSpecification",
    "copyPayerCustomerId",
    "copyOrderReference"
})
@XmlRootElement(name = "MoveOrderItemsSpecification")
public class MoveOrderItemsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "SourceOrderSpecification", required = true)
    protected SourceOrderSpecificationType sourceOrderSpecification;
    @XmlElement(name = "DestinationOrderSpecification", required = true)
    protected DestinationOrderSpecificationType destinationOrderSpecification;
    @XmlElement(name = "CopyPayerCustomerId")
    protected EmptyType copyPayerCustomerId;
    @XmlElement(name = "CopyOrderReference")
    protected EmptyType copyOrderReference;

    /**
     * Gets the value of the orderLockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLockId() {
        return orderLockId;
    }

    /**
     * Sets the value of the orderLockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLockId(String value) {
        this.orderLockId = value;
    }

    public boolean isSetOrderLockId() {
        return (this.orderLockId!= null);
    }

    /**
     * Gets the value of the sourceOrderSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOrderSpecificationType }
     *     
     */
    public SourceOrderSpecificationType getSourceOrderSpecification() {
        return sourceOrderSpecification;
    }

    /**
     * Sets the value of the sourceOrderSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOrderSpecificationType }
     *     
     */
    public void setSourceOrderSpecification(SourceOrderSpecificationType value) {
        this.sourceOrderSpecification = value;
    }

    public boolean isSetSourceOrderSpecification() {
        return (this.sourceOrderSpecification!= null);
    }

    /**
     * Gets the value of the destinationOrderSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationOrderSpecificationType }
     *     
     */
    public DestinationOrderSpecificationType getDestinationOrderSpecification() {
        return destinationOrderSpecification;
    }

    /**
     * Sets the value of the destinationOrderSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationOrderSpecificationType }
     *     
     */
    public void setDestinationOrderSpecification(DestinationOrderSpecificationType value) {
        this.destinationOrderSpecification = value;
    }

    public boolean isSetDestinationOrderSpecification() {
        return (this.destinationOrderSpecification!= null);
    }

    /**
     * Gets the value of the copyPayerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCopyPayerCustomerId() {
        return copyPayerCustomerId;
    }

    /**
     * Sets the value of the copyPayerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCopyPayerCustomerId(EmptyType value) {
        this.copyPayerCustomerId = value;
    }

    public boolean isSetCopyPayerCustomerId() {
        return (this.copyPayerCustomerId!= null);
    }

    /**
     * Gets the value of the copyOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCopyOrderReference() {
        return copyOrderReference;
    }

    /**
     * Sets the value of the copyOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCopyOrderReference(EmptyType value) {
        this.copyOrderReference = value;
    }

    public boolean isSetCopyOrderReference() {
        return (this.copyOrderReference!= null);
    }

}
