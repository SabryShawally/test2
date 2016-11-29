
package se.linkon.petra.order.orderstorage.openorder.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for OpenOrderDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockTimeout"/&gt;
 *         &lt;element name="ForcedOpen" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderDescription", propOrder = {
    "orderLockId",
    "orderLockTimeout",
    "forcedOpen"
})
public class OpenOrderDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "OrderLockTimeout", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderLockTimeout;
    @XmlElement(name = "ForcedOpen")
    protected EmptyType forcedOpen;

    /**
     * Use this in all following operations with this order.
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
     * Gets the value of the orderLockTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderLockTimeout() {
        return orderLockTimeout;
    }

    /**
     * Sets the value of the orderLockTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderLockTimeout(XMLGregorianCalendar value) {
        this.orderLockTimeout = value;
    }

    public boolean isSetOrderLockTimeout() {
        return (this.orderLockTimeout!= null);
    }

    /**
     * Gets the value of the forcedOpen property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getForcedOpen() {
        return forcedOpen;
    }

    /**
     * Sets the value of the forcedOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setForcedOpen(EmptyType value) {
        this.forcedOpen = value;
    }

    public boolean isSetForcedOpen() {
        return (this.forcedOpen!= null);
    }

}
