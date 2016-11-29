
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PlacementCharacteristicsType;
import se.linkon.petra.commonelements.data.v4_6.PlacementOrientationType;


/**
 * <p>Java class for PlacementDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CarriageId"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementCharacteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementOrientation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDescriptionType", propOrder = {
    "carriageId",
    "placementNumber",
    "placementCharacteristics",
    "placementOrientation"
})
public class PlacementDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CarriageId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String carriageId;
    @XmlElement(name = "PlacementNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String placementNumber;
    @XmlElement(name = "PlacementCharacteristics", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementCharacteristicsType placementCharacteristics;
    @XmlElement(name = "PlacementOrientation", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementOrientationType placementOrientation;

    /**
     * Gets the value of the carriageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriageId() {
        return carriageId;
    }

    /**
     * Sets the value of the carriageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriageId(String value) {
        this.carriageId = value;
    }

    public boolean isSetCarriageId() {
        return (this.carriageId!= null);
    }

    /**
     * Gets the value of the placementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementNumber() {
        return placementNumber;
    }

    /**
     * Sets the value of the placementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementNumber(String value) {
        this.placementNumber = value;
    }

    public boolean isSetPlacementNumber() {
        return (this.placementNumber!= null);
    }

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

}
