
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PlacementCharacteristicsType;


/**
 * A placement characteristics,
 * 				together with a marker element present only if
 * 				the characteristics is considered the default one .
 * 			
 * 
 * <p>Java class for CharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementCharacteristics"/&gt;
 *         &lt;element name="IsDefaultChoice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicsType", propOrder = {
    "placementCharacteristics",
    "isDefaultChoice"
})
public class CharacteristicsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementCharacteristics", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PlacementCharacteristicsType placementCharacteristics;
    @XmlElement(name = "IsDefaultChoice")
    protected EmptyType isDefaultChoice;

    /**
     * Gets the value of the placementCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementCharacteristicsType }
     *     
     */
    public PlacementCharacteristicsType getPlacementCharacteristics() {
        return placementCharacteristics;
    }

    /**
     * Sets the value of the placementCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementCharacteristicsType }
     *     
     */
    public void setPlacementCharacteristics(PlacementCharacteristicsType value) {
        this.placementCharacteristics = value;
    }

    public boolean isSetPlacementCharacteristics() {
        return (this.placementCharacteristics!= null);
    }

    /**
     * Gets the value of the isDefaultChoice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIsDefaultChoice() {
        return isDefaultChoice;
    }

    /**
     * Sets the value of the isDefaultChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIsDefaultChoice(EmptyType value) {
        this.isDefaultChoice = value;
    }

    public boolean isSetIsDefaultChoice() {
        return (this.isDefaultChoice!= null);
    }

}
