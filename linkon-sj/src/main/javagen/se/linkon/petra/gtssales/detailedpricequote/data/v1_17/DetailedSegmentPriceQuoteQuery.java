
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://petra.linkon.se/gtssales/shared/data/v1_17}OrderingProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="PayerCustomerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PayerCustomerSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelDocumentCode" minOccurs="0"/&gt;
 *         &lt;element name="SegmentServiceSpecifications" type="{http://petra.linkon.se/gtssales/detailedpricequote/data/v1_17}SegmentServiceSpecificationsType"/&gt;
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
    "orderingProducerCode",
    "payerCustomerSpecification",
    "travelDocumentCode",
    "segmentServiceSpecifications"
})
@XmlRootElement(name = "DetailedSegmentPriceQuoteQuery")
public class DetailedSegmentPriceQuoteQuery
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderingProducerCode", namespace = "http://petra.linkon.se/gtssales/shared/data/v1_17")
    protected Integer orderingProducerCode;
    @XmlElement(name = "PayerCustomerSpecification")
    protected PayerCustomerSpecificationType payerCustomerSpecification;
    @XmlElement(name = "TravelDocumentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "string")
    protected TravelDocumentCodeType travelDocumentCode;
    @XmlElement(name = "SegmentServiceSpecifications", required = true)
    protected SegmentServiceSpecificationsType segmentServiceSpecifications;

    /**
     * Gets the value of the orderingProducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderingProducerCode() {
        return orderingProducerCode;
    }

    /**
     * Sets the value of the orderingProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderingProducerCode(Integer value) {
        this.orderingProducerCode = value;
    }

    public boolean isSetOrderingProducerCode() {
        return (this.orderingProducerCode!= null);
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
     * It is normally only necessary to specify
     * 							TravelDocumentCode for priceQuotes outside Sweden.
     * 						
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
     * Gets the value of the segmentServiceSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentServiceSpecificationsType }
     *     
     */
    public SegmentServiceSpecificationsType getSegmentServiceSpecifications() {
        return segmentServiceSpecifications;
    }

    /**
     * Sets the value of the segmentServiceSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentServiceSpecificationsType }
     *     
     */
    public void setSegmentServiceSpecifications(SegmentServiceSpecificationsType value) {
        this.segmentServiceSpecifications = value;
    }

    public boolean isSetSegmentServiceSpecifications() {
        return (this.segmentServiceSpecifications!= null);
    }

}
