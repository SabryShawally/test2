
package se.linkon.petra.gtssales.booktransport.data.v1_17;

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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderLockId"/&gt;
 *         &lt;element name="ExternalReference" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}ExternalReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreator" type="{http://petra.linkon.se/commonelements/data/v4_6}CustomerIdType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/gtssales/shared/data/v1_17}OrderingProducerCode" minOccurs="0"/&gt;
 *         &lt;element name="PayerCustomerSpecification" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}PayerCustomerSpecificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravelDocumentCode" minOccurs="0"/&gt;
 *         &lt;element name="SegmentServiceSpecifications" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}SegmentServiceSpecificationsType"/&gt;
 *         &lt;element name="TravellerSpecifications" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}TravellerSpecificationsType" minOccurs="0"/&gt;
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
    "salesOrderId",
    "orderLockId",
    "externalReference",
    "orderCreator",
    "orderingProducerCode",
    "payerCustomerSpecification",
    "travelDocumentCode",
    "segmentServiceSpecifications",
    "travellerSpecifications"
})
@XmlRootElement(name = "BookSegmentSpecification")
public class BookSegmentSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderLockId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String orderLockId;
    @XmlElement(name = "ExternalReference")
    protected ExternalReferenceType externalReference;
    @XmlElement(name = "OrderCreator")
    protected String orderCreator;
    @XmlElement(name = "OrderingProducerCode", namespace = "http://petra.linkon.se/gtssales/shared/data/v1_17")
    protected Integer orderingProducerCode;
    @XmlElement(name = "PayerCustomerSpecification")
    protected PayerCustomerSpecificationType payerCustomerSpecification;
    @XmlElement(name = "TravelDocumentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "string")
    protected TravelDocumentCodeType travelDocumentCode;
    @XmlElement(name = "SegmentServiceSpecifications", required = true)
    protected SegmentServiceSpecificationsType segmentServiceSpecifications;
    @XmlElement(name = "TravellerSpecifications")
    protected TravellerSpecificationsType travellerSpecifications;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderId(String value) {
        this.salesOrderId = value;
    }

    public boolean isSetSalesOrderId() {
        return (this.salesOrderId!= null);
    }

    /**
     * Gets the value of the orderLockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLockId() {
        return orderLockId;
    }

    /**
     * Sets the value of the orderLockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLockId(String value) {
        this.orderLockId = value;
    }

    public boolean isSetOrderLockId() {
        return (this.orderLockId!= null);
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReferenceType }
     *     
     */
    public ExternalReferenceType getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReferenceType }
     *     
     */
    public void setExternalReference(ExternalReferenceType value) {
        this.externalReference = value;
    }

    public boolean isSetExternalReference() {
        return (this.externalReference!= null);
    }

    /**
     * Gets the value of the orderCreator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCreator() {
        return orderCreator;
    }

    /**
     * Sets the value of the orderCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCreator(String value) {
        this.orderCreator = value;
    }

    public boolean isSetOrderCreator() {
        return (this.orderCreator!= null);
    }

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
     * 
     * 							TravelDocumentCode represents the choice of
     * 							booking a journey and/or a seat reservation.
     * 							Default is "G"
     * 							(journey and a seat reservation).
     * 
     * 							It is normally only necessary to
     * 							specify
     * 							TravelDocumentCode when booking itineraries
     * 							outside Sweden.
     * 
     * 							TravelDocumentCode values;
     * 
     * 							G - Journey and a seat reservation.
     * 							Common
     * 							documents. S - Journey and a seat reservation.
     * 							Separate
     * 							documents. B - Journey and a seat
     * 							reservation. System decides
     * 							whether common or
     * 							separate documents. F - Only journey. P - Only
     * 							seat reservation.
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

    /**
     * Gets the value of the travellerSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSpecificationsType }
     *     
     */
    public TravellerSpecificationsType getTravellerSpecifications() {
        return travellerSpecifications;
    }

    /**
     * Sets the value of the travellerSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSpecificationsType }
     *     
     */
    public void setTravellerSpecifications(TravellerSpecificationsType value) {
        this.travellerSpecifications = value;
    }

    public boolean isSetTravellerSpecifications() {
        return (this.travellerSpecifications!= null);
    }

}
