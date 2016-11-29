
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidForChangeDepartureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidForChangeDepartureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LatestChangeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FirstValidDepartureDateTime" type="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTimeType"/&gt;
 *         &lt;element name="LastValidDepartureDateTime" type="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTimeType"/&gt;
 *         &lt;element name="ChangeDepartureDescriptions" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}ChangeDepartureDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidForChangeDepartureType", propOrder = {
    "latestChangeDateTime",
    "firstValidDepartureDateTime",
    "lastValidDepartureDateTime",
    "changeDepartureDescriptions"
})
public class ValidForChangeDepartureType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "LatestChangeDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestChangeDateTime;
    @XmlElement(name = "FirstValidDepartureDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstValidDepartureDateTime;
    @XmlElement(name = "LastValidDepartureDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastValidDepartureDateTime;
    @XmlElement(name = "ChangeDepartureDescriptions", required = true)
    protected ChangeDepartureDescriptionsType changeDepartureDescriptions;

    /**
     * Gets the value of the latestChangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestChangeDateTime() {
        return latestChangeDateTime;
    }

    /**
     * Sets the value of the latestChangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestChangeDateTime(XMLGregorianCalendar value) {
        this.latestChangeDateTime = value;
    }

    public boolean isSetLatestChangeDateTime() {
        return (this.latestChangeDateTime!= null);
    }

    /**
     * Gets the value of the firstValidDepartureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstValidDepartureDateTime() {
        return firstValidDepartureDateTime;
    }

    /**
     * Sets the value of the firstValidDepartureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstValidDepartureDateTime(XMLGregorianCalendar value) {
        this.firstValidDepartureDateTime = value;
    }

    public boolean isSetFirstValidDepartureDateTime() {
        return (this.firstValidDepartureDateTime!= null);
    }

    /**
     * Gets the value of the lastValidDepartureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastValidDepartureDateTime() {
        return lastValidDepartureDateTime;
    }

    /**
     * Sets the value of the lastValidDepartureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastValidDepartureDateTime(XMLGregorianCalendar value) {
        this.lastValidDepartureDateTime = value;
    }

    public boolean isSetLastValidDepartureDateTime() {
        return (this.lastValidDepartureDateTime!= null);
    }

    /**
     * Gets the value of the changeDepartureDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDepartureDescriptionsType }
     *     
     */
    public ChangeDepartureDescriptionsType getChangeDepartureDescriptions() {
        return changeDepartureDescriptions;
    }

    /**
     * Sets the value of the changeDepartureDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDepartureDescriptionsType }
     *     
     */
    public void setChangeDepartureDescriptions(ChangeDepartureDescriptionsType value) {
        this.changeDepartureDescriptions = value;
    }

    public boolean isSetChangeDepartureDescriptions() {
        return (this.changeDepartureDescriptions!= null);
    }

}
