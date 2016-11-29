
package se.linkon.petra.order.orderstorage.settravellerinformation.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * Specifies a traveller (RENNR). The traveller MUST
 * 				have either temporary, frequent or anonymous traveller information
 * 				specified.
 * 			
 * 
 * <p>Java class for TravellerSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FrequentTravellerSpecification" type="{http://petra.linkon.se/order/orderstorage/settravellerinformation/data/v1_10}FrequentTravellerSpecificationType"/&gt;
 *           &lt;element name="TemporaryTravellerSpecification" type="{http://petra.linkon.se/order/orderstorage/settravellerinformation/data/v1_10}TemporaryTravellerSpecificationType"/&gt;
 *           &lt;element name="AnonymousTravellerSpecification" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
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
@XmlType(name = "TravellerSpecificationType", propOrder = {
    "travellerNumber",
    "frequentTravellerSpecification",
    "temporaryTravellerSpecification",
    "anonymousTravellerSpecification"
})
public class TravellerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected int travellerNumber;
    @XmlElement(name = "FrequentTravellerSpecification")
    protected FrequentTravellerSpecificationType frequentTravellerSpecification;
    @XmlElement(name = "TemporaryTravellerSpecification")
    protected TemporaryTravellerSpecificationType temporaryTravellerSpecification;
    @XmlElement(name = "AnonymousTravellerSpecification")
    protected EmptyType anonymousTravellerSpecification;

    /**
     * Gets the value of the travellerNumber property.
     * 
     */
    public int getTravellerNumber() {
        return travellerNumber;
    }

    /**
     * Sets the value of the travellerNumber property.
     * 
     */
    public void setTravellerNumber(int value) {
        this.travellerNumber = value;
    }

    public boolean isSetTravellerNumber() {
        return true;
    }

    /**
     * Gets the value of the frequentTravellerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerSpecificationType }
     *     
     */
    public FrequentTravellerSpecificationType getFrequentTravellerSpecification() {
        return frequentTravellerSpecification;
    }

    /**
     * Sets the value of the frequentTravellerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerSpecificationType }
     *     
     */
    public void setFrequentTravellerSpecification(FrequentTravellerSpecificationType value) {
        this.frequentTravellerSpecification = value;
    }

    public boolean isSetFrequentTravellerSpecification() {
        return (this.frequentTravellerSpecification!= null);
    }

    /**
     * Gets the value of the temporaryTravellerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryTravellerSpecificationType }
     *     
     */
    public TemporaryTravellerSpecificationType getTemporaryTravellerSpecification() {
        return temporaryTravellerSpecification;
    }

    /**
     * Sets the value of the temporaryTravellerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryTravellerSpecificationType }
     *     
     */
    public void setTemporaryTravellerSpecification(TemporaryTravellerSpecificationType value) {
        this.temporaryTravellerSpecification = value;
    }

    public boolean isSetTemporaryTravellerSpecification() {
        return (this.temporaryTravellerSpecification!= null);
    }

    /**
     * Gets the value of the anonymousTravellerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAnonymousTravellerSpecification() {
        return anonymousTravellerSpecification;
    }

    /**
     * Sets the value of the anonymousTravellerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAnonymousTravellerSpecification(EmptyType value) {
        this.anonymousTravellerSpecification = value;
    }

    public boolean isSetAnonymousTravellerSpecification() {
        return (this.anonymousTravellerSpecification!= null);
    }

}
