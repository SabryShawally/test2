
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import se.linkon.petra.commoncomplexelements.data.v4_6.TicketDistributionCodeType;


/**
 * 
 * 				Code/clear-text base type. The value is the code (of string type)
 * 				and the plaintext attribute is the clear-text (of string type).
 * 			
 * 
 * <p>Java class for StringCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="plaintext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringCodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AdditionalPaymentCode2Type.class,
    AlternativeCreditCodeType.class,
    BookingClassType.class,
    CardSystemType.class,
    CardTypeType.class,
    CompartmentCodeType.class,
    CompartmentSizeType.class,
    PassengerCategoryType.class,
    CountryCodeType.class,
    CreditReasonType.class,
    CreditRuleCodeType.class,
    DelayCompensationCodeType.class,
    DiscountCodeType.class,
    DistributionCodeType.class,
    FareTypeType.class,
    CardMeasureType.class,
    PaymentCodeType.class,
    PlacementCharacteristicsType.class,
    PlacementOrientationType.class,
    PriceGroupCodeType.class,
    PriceLevelCodeType.class,
    ProductCodeType.class,
    SeatAvailabilityGroupDetailType.class,
    SeatAvailabilityGroupSummaryType.class,
    SalesCategoryBookingClassCodeType.class,
    SalesCategoryFlexibilityCodeType.class,
    SalesStatusType.class,
    SpacePropertyCodeType.class,
    TicketTypeType.class,
    TransportInformationType.class,
    TravelMethodCodeType.class,
    TravelTypeType.class,
    CurrencyCodeType.class,
    TicketDistributionCodeType.class
})
public class StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "plaintext")
    protected String plaintext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the plaintext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaintext() {
        return plaintext;
    }

    /**
     * Sets the value of the plaintext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaintext(String value) {
        this.plaintext = value;
    }

    public boolean isSetPlaintext() {
        return (this.plaintext!= null);
    }

}
