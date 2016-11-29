
package se.linkon.petra.gtssales.edittransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.BookingClassType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentCodeType;
import se.linkon.petra.commonelements.data.v4_6.CompartmentSizeType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.PlacementCharacteristicsType;
import se.linkon.petra.commonelements.data.v4_6.PlacementDirectionCodeType;
import se.linkon.petra.commonelements.data.v4_6.PlacementOrientationType;
import se.linkon.petra.commonelements.data.v4_6.SmokingDepartmentCodeType;
import se.linkon.petra.gtssales.shared.data.v1_17.EditActionType;


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
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentType"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ComponentNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}BookingClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CompartmentSize" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CarriageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementNumber" minOccurs="0"/&gt;
 *         &lt;element name="NeigbourPlacement" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SmokingDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementCharacteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementOrientation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PlacementDirection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ReferenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="PlacementNotes" type="{http://petra.linkon.se/gtssales/edittransport/data/v1_17}PlacementNotesType" minOccurs="0"/&gt;
 *         &lt;element name="ComponentEditAction" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}EditActionType"/&gt;
 *         &lt;element name="ComponentDeleteReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "componentType",
    "componentNumber",
    "bookingClass",
    "compartmentCode",
    "compartmentSize",
    "carriageId",
    "placementNumber",
    "neigbourPlacement",
    "smokingDepartment",
    "placementCharacteristics",
    "placementOrientation",
    "placementDirection",
    "referenceNumber",
    "placementNotes",
    "componentEditAction",
    "componentDeleteReasonCode"
})
public class PlacementSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ComponentType", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String componentType;
    @XmlElement(name = "ComponentNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int componentNumber;
    @XmlElement(name = "BookingClass", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected BookingClassType bookingClass;
    @XmlElement(name = "CompartmentCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentCodeType compartmentCode;
    @XmlElement(name = "CompartmentSize", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected CompartmentSizeType compartmentSize;
    @XmlElement(name = "CarriageId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String carriageId;
    @XmlElement(name = "PlacementNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String placementNumber;
    @XmlElement(name = "NeigbourPlacement")
    protected EmptyType neigbourPlacement;
    @XmlElement(name = "SmokingDepartment", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected SmokingDepartmentCodeType smokingDepartment;
    @XmlElement(name = "PlacementCharacteristics", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementCharacteristicsType placementCharacteristics;
    @XmlElement(name = "PlacementOrientation", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementOrientationType placementOrientation;
    @XmlElement(name = "PlacementDirection", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected PlacementDirectionCodeType placementDirection;
    @XmlElement(name = "ReferenceNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String referenceNumber;
    @XmlElement(name = "PlacementNotes")
    protected PlacementNotesType placementNotes;
    @XmlElement(name = "ComponentEditAction", required = true)
    @XmlSchemaType(name = "string")
    protected EditActionType componentEditAction;
    @XmlElement(name = "ComponentDeleteReasonCode")
    protected String componentDeleteReasonCode;

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    public boolean isSetComponentType() {
        return (this.componentType!= null);
    }

    /**
     * Gets the value of the componentNumber property.
     * 
     */
    public int getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     */
    public void setComponentNumber(int value) {
        this.componentNumber = value;
    }

    public boolean isSetComponentNumber() {
        return true;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassType }
     *     
     */
    public BookingClassType getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassType }
     *     
     */
    public void setBookingClass(BookingClassType value) {
        this.bookingClass = value;
    }

    public boolean isSetBookingClass() {
        return (this.bookingClass!= null);
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
     * Gets the value of the neigbourPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNeigbourPlacement() {
        return neigbourPlacement;
    }

    /**
     * Sets the value of the neigbourPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNeigbourPlacement(EmptyType value) {
        this.neigbourPlacement = value;
    }

    public boolean isSetNeigbourPlacement() {
        return (this.neigbourPlacement!= null);
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
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    public boolean isSetReferenceNumber() {
        return (this.referenceNumber!= null);
    }

    /**
     * Gets the value of the placementNotes property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementNotesType }
     *     
     */
    public PlacementNotesType getPlacementNotes() {
        return placementNotes;
    }

    /**
     * Sets the value of the placementNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementNotesType }
     *     
     */
    public void setPlacementNotes(PlacementNotesType value) {
        this.placementNotes = value;
    }

    public boolean isSetPlacementNotes() {
        return (this.placementNotes!= null);
    }

    /**
     * Gets the value of the componentEditAction property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionType }
     *     
     */
    public EditActionType getComponentEditAction() {
        return componentEditAction;
    }

    /**
     * Sets the value of the componentEditAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionType }
     *     
     */
    public void setComponentEditAction(EditActionType value) {
        this.componentEditAction = value;
    }

    public boolean isSetComponentEditAction() {
        return (this.componentEditAction!= null);
    }

    /**
     * Gets the value of the componentDeleteReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDeleteReasonCode() {
        return componentDeleteReasonCode;
    }

    /**
     * Sets the value of the componentDeleteReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDeleteReasonCode(String value) {
        this.componentDeleteReasonCode = value;
    }

    public boolean isSetComponentDeleteReasonCode() {
        return (this.componentDeleteReasonCode!= null);
    }

}
