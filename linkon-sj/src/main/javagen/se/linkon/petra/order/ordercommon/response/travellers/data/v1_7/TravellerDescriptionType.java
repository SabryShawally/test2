
package se.linkon.petra.order.ordercommon.response.travellers.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * 
 * 				Describes a traveller (RENNR). The traveller has
 * 				either temporary, frequent traveller or anonymous information
 * 				specified.
 * 			
 * 
 * <p>Java class for TravellerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumber"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FrequentTravellerDescription" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}FrequentTravellerDescriptionType"/&gt;
 *           &lt;element name="TemporaryTravellerDescription" type="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}TemporaryTravellerDescriptionType"/&gt;
 *           &lt;element name="AnonymousTravellerDescription" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
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
@XmlType(name = "TravellerDescriptionType", propOrder = {
    "travellerNumber",
    "frequentTravellerDescription",
    "temporaryTravellerDescription",
    "anonymousTravellerDescription"
})
public class TravellerDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected int travellerNumber;
    @XmlElement(name = "FrequentTravellerDescription")
    protected FrequentTravellerDescriptionType frequentTravellerDescription;
    @XmlElement(name = "TemporaryTravellerDescription")
    protected TemporaryTravellerDescriptionType temporaryTravellerDescription;
    @XmlElement(name = "AnonymousTravellerDescription")
    protected EmptyType anonymousTravellerDescription;

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
     * Gets the value of the frequentTravellerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerDescriptionType }
     *     
     */
    public FrequentTravellerDescriptionType getFrequentTravellerDescription() {
        return frequentTravellerDescription;
    }

    /**
     * Sets the value of the frequentTravellerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerDescriptionType }
     *     
     */
    public void setFrequentTravellerDescription(FrequentTravellerDescriptionType value) {
        this.frequentTravellerDescription = value;
    }

    public boolean isSetFrequentTravellerDescription() {
        return (this.frequentTravellerDescription!= null);
    }

    /**
     * Gets the value of the temporaryTravellerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryTravellerDescriptionType }
     *     
     */
    public TemporaryTravellerDescriptionType getTemporaryTravellerDescription() {
        return temporaryTravellerDescription;
    }

    /**
     * Sets the value of the temporaryTravellerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryTravellerDescriptionType }
     *     
     */
    public void setTemporaryTravellerDescription(TemporaryTravellerDescriptionType value) {
        this.temporaryTravellerDescription = value;
    }

    public boolean isSetTemporaryTravellerDescription() {
        return (this.temporaryTravellerDescription!= null);
    }

    /**
     * Gets the value of the anonymousTravellerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAnonymousTravellerDescription() {
        return anonymousTravellerDescription;
    }

    /**
     * Sets the value of the anonymousTravellerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAnonymousTravellerDescription(EmptyType value) {
        this.anonymousTravellerDescription = value;
    }

    public boolean isSetAnonymousTravellerDescription() {
        return (this.anonymousTravellerDescription!= null);
    }

}
