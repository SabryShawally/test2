
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ItineraryReference"/&gt;
 *         &lt;element name="SegmentDescriptions" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}SegmentDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryDescriptionType", propOrder = {
    "itineraryReference",
    "segmentDescriptions"
})
public class ItineraryDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int itineraryReference;
    @XmlElement(name = "SegmentDescriptions", required = true)
    protected SegmentDescriptionsType segmentDescriptions;

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
     * Gets the value of the segmentDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDescriptionsType }
     *     
     */
    public SegmentDescriptionsType getSegmentDescriptions() {
        return segmentDescriptions;
    }

    /**
     * Sets the value of the segmentDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDescriptionsType }
     *     
     */
    public void setSegmentDescriptions(SegmentDescriptionsType value) {
        this.segmentDescriptions = value;
    }

    public boolean isSetSegmentDescriptions() {
        return (this.segmentDescriptions!= null);
    }

}
