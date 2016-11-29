
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies traveller connections. Traveller
 * 				connections can be of three types,
 * 				frequent, temporary and/or
 * 				anonymous. There can be only one frequent traveller number specified
 * 				but multiple temporary and/or anonymous numbers.
 * 			
 * 
 * <p>Java class for TravellerConnectionsSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerConnectionsSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FrequentTravellerNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumberType"/&gt;
 *           &lt;element name="NonFrequentTravellerNumbers" type="{http://petra.linkon.se/order/orderstorage/settravellers/data/v1_10}NonFrequentTravellerNumbersType"/&gt;
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
@XmlType(name = "TravellerConnectionsSpecificationType", propOrder = {
    "frequentTravellerNumber",
    "nonFrequentTravellerNumbers"
})
public class TravellerConnectionsSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FrequentTravellerNumber")
    @XmlSchemaType(name = "integer")
    protected Integer frequentTravellerNumber;
    @XmlElement(name = "NonFrequentTravellerNumbers")
    protected NonFrequentTravellerNumbersType nonFrequentTravellerNumbers;

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
     * Gets the value of the nonFrequentTravellerNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link NonFrequentTravellerNumbersType }
     *     
     */
    public NonFrequentTravellerNumbersType getNonFrequentTravellerNumbers() {
        return nonFrequentTravellerNumbers;
    }

    /**
     * Sets the value of the nonFrequentTravellerNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFrequentTravellerNumbersType }
     *     
     */
    public void setNonFrequentTravellerNumbers(NonFrequentTravellerNumbersType value) {
        this.nonFrequentTravellerNumbers = value;
    }

    public boolean isSetNonFrequentTravellerNumbers() {
        return (this.nonFrequentTravellerNumbers!= null);
    }

}
