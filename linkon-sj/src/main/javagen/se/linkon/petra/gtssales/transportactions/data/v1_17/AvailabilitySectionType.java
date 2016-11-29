
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AvailabilitySectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/gtssales/shared/data/v1_17}LatestBookingTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySectionType", propOrder = {
    "availabilityIndicator",
    "latestBookingTime"
})
public class AvailabilitySectionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AvailabilityIndicator")
    protected int availabilityIndicator;
    @XmlElement(name = "LatestBookingTime", namespace = "http://petra.linkon.se/gtssales/shared/data/v1_17", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestBookingTime;

    /**
     * Gets the value of the availabilityIndicator property.
     * 
     */
    public int getAvailabilityIndicator() {
        return availabilityIndicator;
    }

    /**
     * Sets the value of the availabilityIndicator property.
     * 
     */
    public void setAvailabilityIndicator(int value) {
        this.availabilityIndicator = value;
    }

    public boolean isSetAvailabilityIndicator() {
        return true;
    }

    /**
     * Gets the value of the latestBookingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestBookingTime() {
        return latestBookingTime;
    }

    /**
     * Sets the value of the latestBookingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestBookingTime(XMLGregorianCalendar value) {
        this.latestBookingTime = value;
    }

    public boolean isSetLatestBookingTime() {
        return (this.latestBookingTime!= null);
    }

}
