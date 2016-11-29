
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.TravelDocumentCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.PayerCustomerSpecificationType;


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
 *         &lt;element name="IncludePriceQuote" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeFareAvailability" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSpecialFareAvailability" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSeatAvailability" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="VatFree" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PayerCustomerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PayerCustomerSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelDocumentCode" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryServiceSpecifications" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}ItineraryServiceSpecificationsType"/&gt;
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
    "includePriceQuote",
    "includeFareAvailability",
    "includeSpecialFareAvailability",
    "includeSeatAvailability",
    "vatFree",
    "payerCustomerSpecification",
    "travelDocumentCode",
    "itineraryServiceSpecifications"
})
@XmlRootElement(name = "GetValidPriceGroupsSpecification")
public class GetValidPriceGroupsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "IncludePriceQuote")
    protected EmptyType includePriceQuote;
    @XmlElement(name = "IncludeFareAvailability")
    protected EmptyType includeFareAvailability;
    @XmlElement(name = "IncludeSpecialFareAvailability")
    protected EmptyType includeSpecialFareAvailability;
    @XmlElement(name = "IncludeSeatAvailability")
    protected EmptyType includeSeatAvailability;
    @XmlElement(name = "VatFree")
    protected EmptyType vatFree;
    @XmlElement(name = "PayerCustomerSpecification")
    protected PayerCustomerSpecificationType payerCustomerSpecification;
    @XmlElement(name = "TravelDocumentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "string")
    protected TravelDocumentCodeType travelDocumentCode;
    @XmlElement(name = "ItineraryServiceSpecifications", required = true)
    protected ItineraryServiceSpecificationsType itineraryServiceSpecifications;

    /**
     * Gets the value of the includePriceQuote property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludePriceQuote() {
        return includePriceQuote;
    }

    /**
     * Sets the value of the includePriceQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludePriceQuote(EmptyType value) {
        this.includePriceQuote = value;
    }

    public boolean isSetIncludePriceQuote() {
        return (this.includePriceQuote!= null);
    }

    /**
     * Gets the value of the includeFareAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludeFareAvailability() {
        return includeFareAvailability;
    }

    /**
     * Sets the value of the includeFareAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludeFareAvailability(EmptyType value) {
        this.includeFareAvailability = value;
    }

    public boolean isSetIncludeFareAvailability() {
        return (this.includeFareAvailability!= null);
    }

    /**
     * Gets the value of the includeSpecialFareAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludeSpecialFareAvailability() {
        return includeSpecialFareAvailability;
    }

    /**
     * Sets the value of the includeSpecialFareAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludeSpecialFareAvailability(EmptyType value) {
        this.includeSpecialFareAvailability = value;
    }

    public boolean isSetIncludeSpecialFareAvailability() {
        return (this.includeSpecialFareAvailability!= null);
    }

    /**
     * Gets the value of the includeSeatAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludeSeatAvailability() {
        return includeSeatAvailability;
    }

    /**
     * Sets the value of the includeSeatAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludeSeatAvailability(EmptyType value) {
        this.includeSeatAvailability = value;
    }

    public boolean isSetIncludeSeatAvailability() {
        return (this.includeSeatAvailability!= null);
    }

    /**
     * Gets the value of the vatFree property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getVatFree() {
        return vatFree;
    }

    /**
     * Sets the value of the vatFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setVatFree(EmptyType value) {
        this.vatFree = value;
    }

    public boolean isSetVatFree() {
        return (this.vatFree!= null);
    }

    /**
     * Gets the value of the payerCustomerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link PayerCustomerSpecificationType }
     *     
     */
    public PayerCustomerSpecificationType getPayerCustomerSpecification() {
        return payerCustomerSpecification;
    }

    /**
     * Sets the value of the payerCustomerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerCustomerSpecificationType }
     *     
     */
    public void setPayerCustomerSpecification(PayerCustomerSpecificationType value) {
        this.payerCustomerSpecification = value;
    }

    public boolean isSetPayerCustomerSpecification() {
        return (this.payerCustomerSpecification!= null);
    }

    /**
     * Determines if and how fares and reservations are booked and stored in the order book. Typically not necessary to set.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentCodeType }
     *     
     */
    public TravelDocumentCodeType getTravelDocumentCode() {
        return travelDocumentCode;
    }

    /**
     * Sets the value of the travelDocumentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentCodeType }
     *     
     */
    public void setTravelDocumentCode(TravelDocumentCodeType value) {
        this.travelDocumentCode = value;
    }

    public boolean isSetTravelDocumentCode() {
        return (this.travelDocumentCode!= null);
    }

    /**
     * Gets the value of the itineraryServiceSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryServiceSpecificationsType }
     *     
     */
    public ItineraryServiceSpecificationsType getItineraryServiceSpecifications() {
        return itineraryServiceSpecifications;
    }

    /**
     * Sets the value of the itineraryServiceSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryServiceSpecificationsType }
     *     
     */
    public void setItineraryServiceSpecifications(ItineraryServiceSpecificationsType value) {
        this.itineraryServiceSpecifications = value;
    }

    public boolean isSetItineraryServiceSpecifications() {
        return (this.itineraryServiceSpecifications!= null);
    }

}
