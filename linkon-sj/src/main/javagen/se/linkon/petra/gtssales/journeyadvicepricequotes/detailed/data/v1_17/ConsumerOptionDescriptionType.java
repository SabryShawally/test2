
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.DiscountCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Describes, for a given passenger, the options and placement choices/prices.
 * 
 * <p>Java class for ConsumerOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerCategory"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DiscountCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}OptionDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentOptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}SegmentOptionDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerOptionDescriptionType", propOrder = {
    "passengerCategory",
    "discountCode",
    "promotionCode",
    "optionDescriptions",
    "segmentOptionDescriptions"
})
public class ConsumerOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "DiscountCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected DiscountCodeType discountCode;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "OptionDescriptions")
    protected OptionDescriptionsType optionDescriptions;
    @XmlElement(name = "SegmentOptionDescriptions")
    protected SegmentOptionDescriptionsType segmentOptionDescriptions;

    /**
     * Gets the value of the passengerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoryType }
     *     
     */
    public PassengerCategoryType getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Sets the value of the passengerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoryType }
     *     
     */
    public void setPassengerCategory(PassengerCategoryType value) {
        this.passengerCategory = value;
    }

    public boolean isSetPassengerCategory() {
        return (this.passengerCategory!= null);
    }

    /**
     * When present, indicates that this consumer option description applies only to itinerary choices priced with the discount code in question.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCodeType }
     *     
     */
    public DiscountCodeType getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCodeType }
     *     
     */
    public void setDiscountCode(DiscountCodeType value) {
        this.discountCode = value;
    }

    public boolean isSetDiscountCode() {
        return (this.discountCode!= null);
    }

    /**
     * When present, indicates that this consumer option description applies only to itinerary choices priced with the promotion code in question.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    public boolean isSetPromotionCode() {
        return (this.promotionCode!= null);
    }

    /**
     * Gets the value of the optionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public OptionDescriptionsType getOptionDescriptions() {
        return optionDescriptions;
    }

    /**
     * Sets the value of the optionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public void setOptionDescriptions(OptionDescriptionsType value) {
        this.optionDescriptions = value;
    }

    public boolean isSetOptionDescriptions() {
        return (this.optionDescriptions!= null);
    }

    /**
     * Gets the value of the segmentOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentOptionDescriptionsType }
     *     
     */
    public SegmentOptionDescriptionsType getSegmentOptionDescriptions() {
        return segmentOptionDescriptions;
    }

    /**
     * Sets the value of the segmentOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentOptionDescriptionsType }
     *     
     */
    public void setSegmentOptionDescriptions(SegmentOptionDescriptionsType value) {
        this.segmentOptionDescriptions = value;
    }

    public boolean isSetSegmentOptionDescriptions() {
        return (this.segmentOptionDescriptions!= null);
    }

}
