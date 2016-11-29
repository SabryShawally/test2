
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ComponentAvailabilityDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentAvailabilityDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/gtssales/shared/data/v1_17}LatestBookingTime"/&gt;
 *         &lt;element name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}VariantDescription"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentAvailabilityDescriptionType", propOrder = {
    "componentNumber",
    "variantNumber",
    "latestBookingTime",
    "availabilityIndicator",
    "variantDescription"
})
public class ComponentAvailabilityDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "VariantNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int variantNumber;
    @XmlElement(name = "LatestBookingTime", namespace = "http://petra.linkon.se/gtssales/shared/data/v1_17", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestBookingTime;
    @XmlElement(name = "AvailabilityIndicator")
    protected int availabilityIndicator;
    @XmlElement(name = "VariantDescription", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String variantDescription;

    /**
     * Gets the value of the componentNumber property.
     * 
     */
    public int getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     */
    public void setComponentNumber(int value) {
        this.componentNumber = value;
    }

    public boolean isSetComponentNumber() {
        return true;
    }

    /**
     * Gets the value of the variantNumber property.
     * 
     */
    public int getVariantNumber() {
        return variantNumber;
    }

    /**
     * Sets the value of the variantNumber property.
     * 
     */
    public void setVariantNumber(int value) {
        this.variantNumber = value;
    }

    public boolean isSetVariantNumber() {
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
     * Gets the value of the variantDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantDescription() {
        return variantDescription;
    }

    /**
     * Sets the value of the variantDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantDescription(String value) {
        this.variantDescription = value;
    }

    public boolean isSetVariantDescription() {
        return (this.variantDescription!= null);
    }

}
