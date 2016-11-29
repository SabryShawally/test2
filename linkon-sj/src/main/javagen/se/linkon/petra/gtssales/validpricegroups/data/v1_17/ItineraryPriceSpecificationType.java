
package se.linkon.petra.gtssales.validpricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.TransportSegmentsOriginType;
import se.linkon.petra.commonelements.data.v4_6.TravelTypeType;


/**
 * Specifies the journey information along with any
 * 				discounts/offers etc. that are to be applied.
 * 
 * <p>Java class for ItineraryPriceSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryPriceSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportSegmentsOrigin"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}KpsBurnCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PromotionCode" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://petra.linkon.se/commonelements/data/v4_6}ServiceIdType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}JourneyConnectionReference"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="SegmentSpecifications" type="{http://petra.linkon.se/gtssales/validpricegroups/data/v1_17}SegmentSpecificationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryPriceSpecificationType", propOrder = {
    "transportSegmentsOrigin",
    "kpsBurnCode",
    "promotionCode",
    "offer",
    "travelType",
    "journeyConnectionReference",
    "itineraryReference",
    "segmentSpecifications"
})
public class ItineraryPriceSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TransportSegmentsOrigin", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "string")
    protected TransportSegmentsOriginType transportSegmentsOrigin;
    @XmlElement(name = "KpsBurnCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String kpsBurnCode;
    @XmlElement(name = "PromotionCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String promotionCode;
    @XmlElement(name = "Offer")
    protected Long offer;
    @XmlElement(name = "TravelType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected TravelTypeType travelType;
    @XmlElement(name = "JourneyConnectionReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int journeyConnectionReference;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "SegmentSpecifications", required = true)
    protected SegmentSpecificationsType segmentSpecifications;

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
     * Gets the value of the journeyConnectionReference property.
     * 
     */
    public int getJourneyConnectionReference() {
        return journeyConnectionReference;
    }

    /**
     * Sets the value of the journeyConnectionReference property.
     * 
     */
    public void setJourneyConnectionReference(int value) {
        this.journeyConnectionReference = value;
    }

    public boolean isSetJourneyConnectionReference() {
        return true;
    }

    /**
     * Gets the value of the itineraryReference property.
     * 
     */
    public int getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     */
    public void setItineraryReference(int value) {
        this.itineraryReference = value;
    }

    public boolean isSetItineraryReference() {
        return true;
    }

    /**
     * Gets the value of the segmentSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public SegmentSpecificationsType getSegmentSpecifications() {
        return segmentSpecifications;
    }

    /**
     * Sets the value of the segmentSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public void setSegmentSpecifications(SegmentSpecificationsType value) {
        this.segmentSpecifications = value;
    }

    public boolean isSetSegmentSpecifications() {
        return (this.segmentSpecifications!= null);
    }

}
