
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;


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
 *         &lt;element name="LocationProducerRelation" type="{http://petra.linkon.se/gtssales/pricegroups/data/v1_17}LocationProducerRelationType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDate"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *         &lt;element name="SegmentProducerCode" type="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCodeType" minOccurs="0"/&gt;
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
    "locationProducerRelation",
    "departureDate",
    "productCode",
    "segmentProducerCode"
})
@XmlRootElement(name = "GetPriceGroupsSpecification")
public class GetPriceGroupsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "LocationProducerRelation", required = true)
    protected LocationProducerRelationType locationProducerRelation;
    @XmlElement(name = "DepartureDate", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlElement(name = "SegmentProducerCode")
    protected Integer segmentProducerCode;

    /**
     * Gets the value of the locationProducerRelation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationProducerRelationType }
     *     
     */
    public LocationProducerRelationType getLocationProducerRelation() {
        return locationProducerRelation;
    }

    /**
     * Sets the value of the locationProducerRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationProducerRelationType }
     *     
     */
    public void setLocationProducerRelation(LocationProducerRelationType value) {
        this.locationProducerRelation = value;
    }

    public boolean isSetLocationProducerRelation() {
        return (this.locationProducerRelation!= null);
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    public boolean isSetDepartureDate() {
        return (this.departureDate!= null);
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType }
     *     
     */
    public ProductCodeType getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType }
     *     
     */
    public void setProductCode(ProductCodeType value) {
        this.productCode = value;
    }

    public boolean isSetProductCode() {
        return (this.productCode!= null);
    }

    /**
     * Gets the value of the segmentProducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentProducerCode() {
        return segmentProducerCode;
    }

    /**
     * Sets the value of the segmentProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentProducerCode(Integer value) {
        this.segmentProducerCode = value;
    }

    public boolean isSetSegmentProducerCode() {
        return (this.segmentProducerCode!= null);
    }

}
