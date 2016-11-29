
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryCharacteristicsSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryCharacteristicsSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentCharacteristicsSpecifications" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}SegmentCharacteristicsSpecificationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryCharacteristicsSpecificationType", propOrder = {
    "segmentCharacteristicsSpecifications"
})
public class ItineraryCharacteristicsSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentCharacteristicsSpecifications", required = true)
    protected SegmentCharacteristicsSpecificationsType segmentCharacteristicsSpecifications;

    /**
     * Gets the value of the segmentCharacteristicsSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentCharacteristicsSpecificationsType }
     *     
     */
    public SegmentCharacteristicsSpecificationsType getSegmentCharacteristicsSpecifications() {
        return segmentCharacteristicsSpecifications;
    }

    /**
     * Sets the value of the segmentCharacteristicsSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentCharacteristicsSpecificationsType }
     *     
     */
    public void setSegmentCharacteristicsSpecifications(SegmentCharacteristicsSpecificationsType value) {
        this.segmentCharacteristicsSpecifications = value;
    }

    public boolean isSetSegmentCharacteristicsSpecifications() {
        return (this.segmentCharacteristicsSpecifications!= null);
    }

}
