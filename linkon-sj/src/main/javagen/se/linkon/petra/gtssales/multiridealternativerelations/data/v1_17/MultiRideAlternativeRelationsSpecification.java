
package se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SegmentProducerCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;


/**
 * <p>Java class for MultiRideAlternativeRelationsSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRideAlternativeRelationsSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentProducerCode"/&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}LocationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRideAlternativeRelationsSpecification", propOrder = {
    "segmentProducerCode",
    "departureLocation",
    "arrivalLocation"
})
public class MultiRideAlternativeRelationsSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SegmentProducerCodeType segmentProducerCode;
    @XmlElement(name = "DepartureLocation", required = true)
    protected LocationType departureLocation;
    @XmlElement(name = "ArrivalLocation", required = true)
    protected LocationType arrivalLocation;

    /**
     * Gets the value of the segmentProducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodeType }
     *     
     */
    public SegmentProducerCodeType getSegmentProducerCode() {
        return segmentProducerCode;
    }

    /**
     * Sets the value of the segmentProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodeType }
     *     
     */
    public void setSegmentProducerCode(SegmentProducerCodeType value) {
        this.segmentProducerCode = value;
    }

    public boolean isSetSegmentProducerCode() {
        return (this.segmentProducerCode!= null);
    }

    /**
     * Gets the value of the departureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureLocation() {
        return departureLocation;
    }

    /**
     * Sets the value of the departureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureLocation(LocationType value) {
        this.departureLocation = value;
    }

    public boolean isSetDepartureLocation() {
        return (this.departureLocation!= null);
    }

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    public boolean isSetArrivalLocation() {
        return (this.arrivalLocation!= null);
    }

}
