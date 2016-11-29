
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A non frequent traveller number contains either an
 * 				anonymous or a frequent traveller number.
 * 			
 * 
 * <p>Java class for NonFrequentTravellerNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonFrequentTravellerNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AnonymousTravellerNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumberType"/&gt;
 *           &lt;element name="TemporaryTravellerNumber" type="{http://petra.linkon.se/commonelements/data/v4_6}TravellerNumberType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFrequentTravellerNumberType", propOrder = {
    "anonymousTravellerNumber",
    "temporaryTravellerNumber"
})
public class NonFrequentTravellerNumberType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AnonymousTravellerNumber")
    @XmlSchemaType(name = "integer")
    protected Integer anonymousTravellerNumber;
    @XmlElement(name = "TemporaryTravellerNumber")
    @XmlSchemaType(name = "integer")
    protected Integer temporaryTravellerNumber;

    /**
     * Gets the value of the anonymousTravellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnonymousTravellerNumber() {
        return anonymousTravellerNumber;
    }

    /**
     * Sets the value of the anonymousTravellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnonymousTravellerNumber(Integer value) {
        this.anonymousTravellerNumber = value;
    }

    public boolean isSetAnonymousTravellerNumber() {
        return (this.anonymousTravellerNumber!= null);
    }

    /**
     * Gets the value of the temporaryTravellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemporaryTravellerNumber() {
        return temporaryTravellerNumber;
    }

    /**
     * Sets the value of the temporaryTravellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemporaryTravellerNumber(Integer value) {
        this.temporaryTravellerNumber = value;
    }

    public boolean isSetTemporaryTravellerNumber() {
        return (this.temporaryTravellerNumber!= null);
    }

}
