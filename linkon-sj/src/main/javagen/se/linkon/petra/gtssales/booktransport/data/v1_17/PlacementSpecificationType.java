
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentSizeType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PlacementCharacteristicsType;
import se.linkon.petra.commonelements.data.v4_6.PlacementDirectionCodeType;
import se.linkon.petra.commonelements.data.v4_6.PlacementOrientationType;
import se.linkon.petra.commonelements.data.v4_6.SmokingDepartmentCodeType;


/**
 * <p>Java class for PlacementSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CarriageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SpaceProperty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SmokingDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementNumber" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourPlacement" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementOrientation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementCharacteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementDirection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentSize" minOccurs="0"/&gt;
 *         &lt;element name="SeatmapSoftReservationToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementSpecificationType", propOrder = {
    "placementType",
    "carriageId",
    "spaceProperty",
    "smokingDepartment",
    "compartmentCode",
    "placementNumber",
    "neighbourPlacement",
    "placementOrientation",
    "placementCharacteristics",
    "compartmentNumber",
    "placementDirection",
    "compartmentSize",
    "seatmapSoftReservationToken"
})
public class PlacementSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementType", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String placementType;
    @XmlElement(name = "CarriageId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String carriageId;
    @XmlElement(name = "SpaceProperty", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String spaceProperty;
    @XmlElement(name = "SmokingDepartment", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected SmokingDepartmentCodeType smokingDepartment;
    @XmlElement(name = "CompartmentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentCodeType compartmentCode;
    @XmlElement(name = "PlacementNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String placementNumber;
    @XmlElement(name = "NeighbourPlacement")
    protected EmptyType neighbourPlacement;
    @XmlElement(name = "PlacementOrientation", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementOrientationType placementOrientation;
    @XmlElement(name = "PlacementCharacteristics", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementCharacteristicsType placementCharacteristics;
    @XmlElement(name = "CompartmentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String compartmentNumber;
    @XmlElement(name = "PlacementDirection", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementDirectionCodeType placementDirection;
    @XmlElement(name = "CompartmentSize", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentSizeType compartmentSize;
    @XmlElement(name = "SeatmapSoftReservationToken")
    protected String seatmapSoftReservationToken;

    /**
     * Gets the value of the placementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementType() {
        return placementType;
    }

    /**
     * Sets the value of the placementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementType(String value) {
        this.placementType = value;
    }

    public boolean isSetPlacementType() {
        return (this.placementType!= null);
    }

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
     * Gets the value of the spaceProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceProperty() {
        return spaceProperty;
    }

    /**
     * Sets the value of the spaceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceProperty(String value) {
        this.spaceProperty = value;
    }

    public boolean isSetSpaceProperty() {
        return (this.spaceProperty!= null);
    }

    /**
     * Gets the value of the smokingDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link SmokingDepartmentCodeType }
     *     
     */
    public SmokingDepartmentCodeType getSmokingDepartment() {
        return smokingDepartment;
    }

    /**
     * Sets the value of the smokingDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingDepartmentCodeType }
     *     
     */
    public void setSmokingDepartment(SmokingDepartmentCodeType value) {
        this.smokingDepartment = value;
    }

    public boolean isSetSmokingDepartment() {
        return (this.smokingDepartment!= null);
    }

    /**
     * Gets the value of the compartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentCodeType }
     *     
     */
    public CompartmentCodeType getCompartmentCode() {
        return compartmentCode;
    }

    /**
     * Sets the value of the compartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentCodeType }
     *     
     */
    public void setCompartmentCode(CompartmentCodeType value) {
        this.compartmentCode = value;
    }

    public boolean isSetCompartmentCode() {
        return (this.compartmentCode!= null);
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
     * Gets the value of the neighbourPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNeighbourPlacement() {
        return neighbourPlacement;
    }

    /**
     * Sets the value of the neighbourPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNeighbourPlacement(EmptyType value) {
        this.neighbourPlacement = value;
    }

    public boolean isSetNeighbourPlacement() {
        return (this.neighbourPlacement!= null);
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
     * Gets the value of the compartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentNumber() {
        return compartmentNumber;
    }

    /**
     * Sets the value of the compartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentNumber(String value) {
        this.compartmentNumber = value;
    }

    public boolean isSetCompartmentNumber() {
        return (this.compartmentNumber!= null);
    }

    /**
     * Gets the value of the placementDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementDirectionCodeType }
     *     
     */
    public PlacementDirectionCodeType getPlacementDirection() {
        return placementDirection;
    }

    /**
     * Sets the value of the placementDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementDirectionCodeType }
     *     
     */
    public void setPlacementDirection(PlacementDirectionCodeType value) {
        this.placementDirection = value;
    }

    public boolean isSetPlacementDirection() {
        return (this.placementDirection!= null);
    }

    /**
     * Gets the value of the compartmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentSizeType }
     *     
     */
    public CompartmentSizeType getCompartmentSize() {
        return compartmentSize;
    }

    /**
     * Sets the value of the compartmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentSizeType }
     *     
     */
    public void setCompartmentSize(CompartmentSizeType value) {
        this.compartmentSize = value;
    }

    public boolean isSetCompartmentSize() {
        return (this.compartmentSize!= null);
    }

    /**
     * Gets the value of the seatmapSoftReservationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatmapSoftReservationToken() {
        return seatmapSoftReservationToken;
    }

    /**
     * Sets the value of the seatmapSoftReservationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatmapSoftReservationToken(String value) {
        this.seatmapSoftReservationToken = value;
    }

    public boolean isSetSeatmapSoftReservationToken() {
        return (this.seatmapSoftReservationToken!= null);
    }

}
