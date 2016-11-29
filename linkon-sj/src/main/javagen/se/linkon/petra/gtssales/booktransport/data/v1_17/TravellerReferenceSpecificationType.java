
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies order item traveller connections.
 * 			
 * 
 * <p>Java class for TravellerReferenceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerReferenceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FrequentTravellerNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumberType"/&gt;
 *           &lt;element name="NonFrequentTravellerNumber" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}NonFrequentTravellerNumberType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerReferenceSpecificationType", propOrder = {
    "frequentTravellerNumber",
    "nonFrequentTravellerNumber"
})
public class TravellerReferenceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FrequentTravellerNumber")
    @XmlSchemaType(name = "integer")
    protected Integer frequentTravellerNumber;
    @XmlElement(name = "NonFrequentTravellerNumber")
    protected NonFrequentTravellerNumberType nonFrequentTravellerNumber;

    /**
     * Gets the value of the frequentTravellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequentTravellerNumber() {
        return frequentTravellerNumber;
    }

    /**
     * Sets the value of the frequentTravellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequentTravellerNumber(Integer value) {
        this.frequentTravellerNumber = value;
    }

    public boolean isSetFrequentTravellerNumber() {
        return (this.frequentTravellerNumber!= null);
    }

    /**
     * Gets the value of the nonFrequentTravellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonFrequentTravellerNumberType }
     *     
     */
    public NonFrequentTravellerNumberType getNonFrequentTravellerNumber() {
        return nonFrequentTravellerNumber;
    }

    /**
     * Sets the value of the nonFrequentTravellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFrequentTravellerNumberType }
     *     
     */
    public void setNonFrequentTravellerNumber(NonFrequentTravellerNumberType value) {
        this.nonFrequentTravellerNumber = value;
    }

    public boolean isSetNonFrequentTravellerNumber() {
        return (this.nonFrequentTravellerNumber!= null);
    }

}
