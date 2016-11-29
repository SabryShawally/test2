
package se.linkon.petra.gtssales.optionavailability.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="ComponentAvailabilityDescriptions" type="{http://petra.linkon.se/gtssales/optionavailability/data/v1_17}ComponentAvailabilityDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDescriptionType", propOrder = {
    "segmentReference",
    "componentAvailabilityDescriptions"
})
public class SegmentDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "ComponentAvailabilityDescriptions")
    protected ComponentAvailabilityDescriptionsType componentAvailabilityDescriptions;

    /**
     * Gets the value of the segmentReference property.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    public boolean isSetSegmentReference() {
        return true;
    }

    /**
     * Gets the value of the componentAvailabilityDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentAvailabilityDescriptionsType }
     *     
     */
    public ComponentAvailabilityDescriptionsType getComponentAvailabilityDescriptions() {
        return componentAvailabilityDescriptions;
    }

    /**
     * Sets the value of the componentAvailabilityDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentAvailabilityDescriptionsType }
     *     
     */
    public void setComponentAvailabilityDescriptions(ComponentAvailabilityDescriptionsType value) {
        this.componentAvailabilityDescriptions = value;
    }

    public boolean isSetComponentAvailabilityDescriptions() {
        return (this.componentAvailabilityDescriptions!= null);
    }

}
