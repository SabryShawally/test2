
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes, for a given segment, the options and placement choices/prices.
 * 
 * <p>Java class for SegmentOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;element name="PlacementDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}PlacementDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OptionDescriptions" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}OptionDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentOptionDescriptionType", propOrder = {
    "segmentReference",
    "placementDescription",
    "optionDescriptions"
})
public class SegmentOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "PlacementDescription")
    protected PlacementDescriptionType placementDescription;
    @XmlElement(name = "OptionDescriptions")
    protected OptionDescriptionsType optionDescriptions;

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
     * Gets the value of the placementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementDescriptionType }
     *     
     */
    public PlacementDescriptionType getPlacementDescription() {
        return placementDescription;
    }

    /**
     * Sets the value of the placementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementDescriptionType }
     *     
     */
    public void setPlacementDescription(PlacementDescriptionType value) {
        this.placementDescription = value;
    }

    public boolean isSetPlacementDescription() {
        return (this.placementDescription!= null);
    }

    /**
     * Gets the value of the optionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public OptionDescriptionsType getOptionDescriptions() {
        return optionDescriptions;
    }

    /**
     * Sets the value of the optionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDescriptionsType }
     *     
     */
    public void setOptionDescriptions(OptionDescriptionsType value) {
        this.optionDescriptions = value;
    }

    public boolean isSetOptionDescriptions() {
        return (this.optionDescriptions!= null);
    }

}
