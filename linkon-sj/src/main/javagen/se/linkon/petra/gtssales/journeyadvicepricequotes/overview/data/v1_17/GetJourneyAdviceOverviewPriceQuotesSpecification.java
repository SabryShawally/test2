
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.TransportSegmentsOriginType;
import se.linkon.petra.commonelements.data.v4_6.TravelTypeType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.ConsumerSpecificationsType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.JourneyAdviceSpecificationsType;
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
 *         &lt;element name="PayerCustomerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PayerCustomerSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelType" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerSpecifications" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}ConsumerSpecificationsType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportSegmentsOrigin"/&gt;
 *         &lt;element name="JourneyAdviceSpecifications" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/shared/data/v1_17}JourneyAdviceSpecificationsType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}KpsBurnCode" minOccurs="0"/&gt;
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
    "payerCustomerSpecification",
    "travelType",
    "consumerSpecifications",
    "promotionCode",
    "transportSegmentsOrigin",
    "journeyAdviceSpecifications",
    "kpsBurnCode"
})
@XmlRootElement(name = "GetJourneyAdviceOverviewPriceQuotesSpecification")
public class GetJourneyAdviceOverviewPriceQuotesSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PayerCustomerSpecification")
    protected PayerCustomerSpecificationType payerCustomerSpecification;
    @XmlElement(name = "TravelType", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected TravelTypeType travelType;
    @XmlElement(name = "ConsumerSpecifications", required = true)
    protected ConsumerSpecificationsType consumerSpecifications;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "TransportSegmentsOrigin", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "string")
    protected TransportSegmentsOriginType transportSegmentsOrigin;
    @XmlElement(name = "JourneyAdviceSpecifications", required = true)
    protected JourneyAdviceSpecificationsType journeyAdviceSpecifications;
    @XmlElement(name = "KpsBurnCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String kpsBurnCode;

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
     * Optional parameter. If omitted, then the default is set to VTERM.V_P_CHA_RSTK_ENKEL (E).
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
     * Gets the value of the consumerSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public ConsumerSpecificationsType getConsumerSpecifications() {
        return consumerSpecifications;
    }

    /**
     * Sets the value of the consumerSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSpecificationsType }
     *     
     */
    public void setConsumerSpecifications(ConsumerSpecificationsType value) {
        this.consumerSpecifications = value;
    }

    public boolean isSetConsumerSpecifications() {
        return (this.consumerSpecifications!= null);
    }

    /**
     * Optionally a promotion code can be provided in which case the system will take this into consideration when establishing the sales category prices.
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
     * Gets the value of the transportSegmentsOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TransportSegmentsOriginType }
     *     
     */
    public TransportSegmentsOriginType getTransportSegmentsOrigin() {
        return transportSegmentsOrigin;
    }

    /**
     * Sets the value of the transportSegmentsOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSegmentsOriginType }
     *     
     */
    public void setTransportSegmentsOrigin(TransportSegmentsOriginType value) {
        this.transportSegmentsOrigin = value;
    }

    public boolean isSetTransportSegmentsOrigin() {
        return (this.transportSegmentsOrigin!= null);
    }

    /**
     * Gets the value of the journeyAdviceSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAdviceSpecificationsType }
     *     
     */
    public JourneyAdviceSpecificationsType getJourneyAdviceSpecifications() {
        return journeyAdviceSpecifications;
    }

    /**
     * Sets the value of the journeyAdviceSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAdviceSpecificationsType }
     *     
     */
    public void setJourneyAdviceSpecifications(JourneyAdviceSpecificationsType value) {
        this.journeyAdviceSpecifications = value;
    }

    public boolean isSetJourneyAdviceSpecifications() {
        return (this.journeyAdviceSpecifications!= null);
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

}
