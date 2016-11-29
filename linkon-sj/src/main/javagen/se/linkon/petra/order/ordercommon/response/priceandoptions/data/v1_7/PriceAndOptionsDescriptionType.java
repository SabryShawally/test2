
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * 
 * 				The total price and option view of the actual order. 
 * 			
 * 
 * <p>Java class for PriceAndOptionsDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndOptionsDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}Points" minOccurs="0"/&gt;
 *         &lt;element name="PriceDetails" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}PriceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmountDue" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="CreditedAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmountDueRecalculationWarning" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCategories" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}DiscountCategoriesType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProducerAmountDescription" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}ServiceProducerAmountDescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndOptionsDescriptionType", propOrder = {
    "price",
    "points",
    "priceDetails",
    "creditAmountDue",
    "creditedAmount",
    "creditAmountDueRecalculationWarning",
    "promotionCode",
    "discountCategories",
    "serviceProducerAmountDescription"
})
public class PriceAndOptionsDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Price", required = true)
    protected PriceVatType price;
    @XmlElement(name = "Points", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer points;
    @XmlElement(name = "PriceDetails")
    protected PriceDetailsType priceDetails;
    @XmlElement(name = "CreditAmountDue")
    protected PriceVatType creditAmountDue;
    @XmlElement(name = "CreditedAmount")
    protected PriceVatType creditedAmount;
    @XmlElement(name = "CreditAmountDueRecalculationWarning")
    protected EmptyType creditAmountDueRecalculationWarning;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "DiscountCategories")
    protected DiscountCategoriesType discountCategories;
    @XmlElement(name = "ServiceProducerAmountDescription")
    protected ServiceProducerAmountDescriptionType serviceProducerAmountDescription;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setPrice(PriceVatType value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return (this.points!= null);
    }

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetailsType }
     *     
     */
    public PriceDetailsType getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetailsType }
     *     
     */
    public void setPriceDetails(PriceDetailsType value) {
        this.priceDetails = value;
    }

    public boolean isSetPriceDetails() {
        return (this.priceDetails!= null);
    }

    /**
     * Gets the value of the creditAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getCreditAmountDue() {
        return creditAmountDue;
    }

    /**
     * Sets the value of the creditAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setCreditAmountDue(PriceVatType value) {
        this.creditAmountDue = value;
    }

    public boolean isSetCreditAmountDue() {
        return (this.creditAmountDue!= null);
    }

    /**
     * Gets the value of the creditedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getCreditedAmount() {
        return creditedAmount;
    }

    /**
     * Sets the value of the creditedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setCreditedAmount(PriceVatType value) {
        this.creditedAmount = value;
    }

    public boolean isSetCreditedAmount() {
        return (this.creditedAmount!= null);
    }

    /**
     * Gets the value of the creditAmountDueRecalculationWarning property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCreditAmountDueRecalculationWarning() {
        return creditAmountDueRecalculationWarning;
    }

    /**
     * Sets the value of the creditAmountDueRecalculationWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCreditAmountDueRecalculationWarning(EmptyType value) {
        this.creditAmountDueRecalculationWarning = value;
    }

    public boolean isSetCreditAmountDueRecalculationWarning() {
        return (this.creditAmountDueRecalculationWarning!= null);
    }

    /**
     * Gets the value of the promotionCode property.
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
     * Gets the value of the discountCategories property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCategoriesType }
     *     
     */
    public DiscountCategoriesType getDiscountCategories() {
        return discountCategories;
    }

    /**
     * Sets the value of the discountCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCategoriesType }
     *     
     */
    public void setDiscountCategories(DiscountCategoriesType value) {
        this.discountCategories = value;
    }

    public boolean isSetDiscountCategories() {
        return (this.discountCategories!= null);
    }

    /**
     * Gets the value of the serviceProducerAmountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProducerAmountDescriptionType }
     *     
     */
    public ServiceProducerAmountDescriptionType getServiceProducerAmountDescription() {
        return serviceProducerAmountDescription;
    }

    /**
     * Sets the value of the serviceProducerAmountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProducerAmountDescriptionType }
     *     
     */
    public void setServiceProducerAmountDescription(ServiceProducerAmountDescriptionType value) {
        this.serviceProducerAmountDescription = value;
    }

    public boolean isSetServiceProducerAmountDescription() {
        return (this.serviceProducerAmountDescription!= null);
    }

}
