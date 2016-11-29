
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PriceGroupCodeType;
import se.linkon.petra.commonelements.data.v4_6.TravelTypeType;
import se.linkon.petra.gtssales.shared.data.v1_17.ConsumerSpecificationType;
import se.linkon.petra.gtssales.shared.data.v1_17.GroupSpecificationType;


/**
 * <p>Java class for SegmentServiceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentServiceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}ConsumerSpecificationType"/&gt;
 *         &lt;element name="GroupSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}GroupSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PriceGroupCode"/&gt;
 *         &lt;element name="PriceQuoteState" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PriceQuoteStateType" minOccurs="0"/&gt;
 *         &lt;element name="VatFree" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}KpsBurnCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://petra.linkon.se/commonelements/data/v4_6}ServiceIdType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSpecification" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}SimpleSegmentSpecificationType"/&gt;
 *         &lt;element name="OptionSpecifications" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}OptionSpecificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentServiceSpecificationType", propOrder = {
    "consumerSpecification",
    "groupSpecification",
    "priceGroupCode",
    "priceQuoteState",
    "vatFree",
    "kpsBurnCode",
    "promotionCode",
    "offer",
    "travelType",
    "itineraryReference",
    "segmentSpecification",
    "optionSpecifications"
})
public class SegmentServiceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ConsumerSpecification", required = true)
    protected ConsumerSpecificationType consumerSpecification;
    @XmlElement(name = "GroupSpecification")
    protected GroupSpecificationType groupSpecification;
    @XmlElement(name = "PriceGroupCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PriceGroupCodeType priceGroupCode;
    @XmlElement(name = "PriceQuoteState")
    protected String priceQuoteState;
    @XmlElement(name = "VatFree")
    protected EmptyType vatFree;
    @XmlElement(name = "KpsBurnCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String kpsBurnCode;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "Offer")
    protected Long offer;
    @XmlElement(name = "TravelType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelTypeType travelType;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected Integer itineraryReference;
    @XmlElement(name = "SegmentSpecification", required = true)
    protected SimpleSegmentSpecificationType segmentSpecification;
    @XmlElement(name = "OptionSpecifications")
    protected OptionSpecificationsType optionSpecifications;

    /**
     * Gets the value of the consumerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSpecificationType }
     *     
     */
    public ConsumerSpecificationType getConsumerSpecification() {
        return consumerSpecification;
    }

    /**
     * Sets the value of the consumerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSpecificationType }
     *     
     */
    public void setConsumerSpecification(ConsumerSpecificationType value) {
        this.consumerSpecification = value;
    }

    public boolean isSetConsumerSpecification() {
        return (this.consumerSpecification!= null);
    }

    /**
     * Gets the value of the groupSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link GroupSpecificationType }
     *     
     */
    public GroupSpecificationType getGroupSpecification() {
        return groupSpecification;
    }

    /**
     * Sets the value of the groupSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSpecificationType }
     *     
     */
    public void setGroupSpecification(GroupSpecificationType value) {
        this.groupSpecification = value;
    }

    public boolean isSetGroupSpecification() {
        return (this.groupSpecification!= null);
    }

    /**
     * Available price groups previously received from
     * 						operation getValidPriceGroups.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public PriceGroupCodeType getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Sets the value of the priceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupCodeType }
     *     
     */
    public void setPriceGroupCode(PriceGroupCodeType value) {
        this.priceGroupCode = value;
    }

    public boolean isSetPriceGroupCode() {
        return (this.priceGroupCode!= null);
    }

    /**
     * Gets the value of the priceQuoteState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteState() {
        return priceQuoteState;
    }

    /**
     * Sets the value of the priceQuoteState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteState(String value) {
        this.priceQuoteState = value;
    }

    public boolean isSetPriceQuoteState() {
        return (this.priceQuoteState!= null);
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
     * Gets the value of the kpsBurnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpsBurnCode() {
        return kpsBurnCode;
    }

    /**
     * Sets the value of the kpsBurnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpsBurnCode(String value) {
        this.kpsBurnCode = value;
    }

    public boolean isSetKpsBurnCode() {
        return (this.kpsBurnCode!= null);
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
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffer(Long value) {
        this.offer = value;
    }

    public boolean isSetOffer() {
        return (this.offer!= null);
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTypeType }
     *     
     */
    public TravelTypeType getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTypeType }
     *     
     */
    public void setTravelType(TravelTypeType value) {
        this.travelType = value;
    }

    public boolean isSetTravelType() {
        return (this.travelType!= null);
    }

    /**
     * Gets the value of the itineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItineraryReference(Integer value) {
        this.itineraryReference = value;
    }

    public boolean isSetItineraryReference() {
        return (this.itineraryReference!= null);
    }

    /**
     * Gets the value of the segmentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleSegmentSpecificationType }
     *     
     */
    public SimpleSegmentSpecificationType getSegmentSpecification() {
        return segmentSpecification;
    }

    /**
     * Sets the value of the segmentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleSegmentSpecificationType }
     *     
     */
    public void setSegmentSpecification(SimpleSegmentSpecificationType value) {
        this.segmentSpecification = value;
    }

    public boolean isSetSegmentSpecification() {
        return (this.segmentSpecification!= null);
    }

    /**
     * Gets the value of the optionSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public OptionSpecificationsType getOptionSpecifications() {
        return optionSpecifications;
    }

    /**
     * Sets the value of the optionSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public void setOptionSpecifications(OptionSpecificationsType value) {
        this.optionSpecifications = value;
    }

    public boolean isSetOptionSpecifications() {
        return (this.optionSpecifications!= null);
    }

}
