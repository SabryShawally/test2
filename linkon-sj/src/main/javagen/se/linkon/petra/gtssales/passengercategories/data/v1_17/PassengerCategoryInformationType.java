
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;


/**
 * Describes a PassengerCategory.
 * 
 * <p>Java class for PassengerCategoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerCategoryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}PassengerCategory"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/gtssales/passengercategories/data/v1_17}PassengerAgeRequiredCode"/&gt;
 *         &lt;element name="PassengerAgeRange" type="{http://petra.linkon.se/gtssales/passengercategories/data/v1_17}PassengerAgeRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCategoryInformationType", propOrder = {
    "passengerCategory",
    "passengerAgeRequiredCode",
    "passengerAgeRange"
})
public class PassengerCategoryInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategory", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected PassengerCategoryType passengerCategory;
    @XmlElement(name = "PassengerAgeRequiredCode", required = true)
    @XmlSchemaType(name = "string")
    protected PassengerAgeRequiredCodeType passengerAgeRequiredCode;
    @XmlElement(name = "PassengerAgeRange")
    protected PassengerAgeRangeType passengerAgeRange;

    /**
     * Gets the value of the passengerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoryType }
     *     
     */
    public PassengerCategoryType getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Sets the value of the passengerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoryType }
     *     
     */
    public void setPassengerCategory(PassengerCategoryType value) {
        this.passengerCategory = value;
    }

    public boolean isSetPassengerCategory() {
        return (this.passengerCategory!= null);
    }

    /**
     * Gets the value of the passengerAgeRequiredCode property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerAgeRequiredCodeType }
     *     
     */
    public PassengerAgeRequiredCodeType getPassengerAgeRequiredCode() {
        return passengerAgeRequiredCode;
    }

    /**
     * Sets the value of the passengerAgeRequiredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerAgeRequiredCodeType }
     *     
     */
    public void setPassengerAgeRequiredCode(PassengerAgeRequiredCodeType value) {
        this.passengerAgeRequiredCode = value;
    }

    public boolean isSetPassengerAgeRequiredCode() {
        return (this.passengerAgeRequiredCode!= null);
    }

    /**
     * Gets the value of the passengerAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerAgeRangeType }
     *     
     */
    public PassengerAgeRangeType getPassengerAgeRange() {
        return passengerAgeRange;
    }

    /**
     * Sets the value of the passengerAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerAgeRangeType }
     *     
     */
    public void setPassengerAgeRange(PassengerAgeRangeType value) {
        this.passengerAgeRange = value;
    }

    public boolean isSetPassengerAgeRange() {
        return (this.passengerAgeRange!= null);
    }

}
