
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PlacementOrientationType;


/**
 * A placement orientation,
 * 				together with a marker element present only if
 * 				the orientation is considered the default one .
 * 			
 * 
 * <p>Java class for OrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrientationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementOrientation"/&gt;
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
@XmlType(name = "OrientationType", propOrder = {
    "placementOrientation",
    "isDefaultChoice"
})
public class OrientationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementOrientation", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PlacementOrientationType placementOrientation;
    @XmlElement(name = "IsDefaultChoice")
    protected EmptyType isDefaultChoice;

    /**
     * Gets the value of the placementOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOrientationType }
     *     
     */
    public PlacementOrientationType getPlacementOrientation() {
        return placementOrientation;
    }

    /**
     * Sets the value of the placementOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOrientationType }
     *     
     */
    public void setPlacementOrientation(PlacementOrientationType value) {
        this.placementOrientation = value;
    }

    public boolean isSetPlacementOrientation() {
        return (this.placementOrientation!= null);
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
