
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * Document rule which shows fares and reservations are ordered and stored in the order database.
 * Both for the Itinerary and the sections.
 * 
 * <p>Java class for SectionTravelDocumentCodeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionTravelDocumentCodeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryTravelDocumentCode" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType"/&gt;
 *         &lt;element name="SectionTravelDocumentCodeList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}TravelDocumentCodes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionTravelDocumentCodeData", propOrder = {
    "itineraryTravelDocumentCode",
    "sectionTravelDocumentCodeList"
})
public class SectionTravelDocumentCodeData
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ItineraryTravelDocumentCode", required = true)
    protected StringCodeType itineraryTravelDocumentCode;
    @XmlElement(name = "SectionTravelDocumentCodeList", required = true)
    protected TravelDocumentCodes sectionTravelDocumentCodeList;

    /**
     * Gets the value of the itineraryTravelDocumentCode property.
     * 
     * @return
     *     possible object is
     *     {@link StringCodeType }
     *     
     */
    public StringCodeType getItineraryTravelDocumentCode() {
        return itineraryTravelDocumentCode;
    }

    /**
     * Sets the value of the itineraryTravelDocumentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringCodeType }
     *     
     */
    public void setItineraryTravelDocumentCode(StringCodeType value) {
        this.itineraryTravelDocumentCode = value;
    }

    public boolean isSetItineraryTravelDocumentCode() {
        return (this.itineraryTravelDocumentCode!= null);
    }

    /**
     * Gets the value of the sectionTravelDocumentCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentCodes }
     *     
     */
    public TravelDocumentCodes getSectionTravelDocumentCodeList() {
        return sectionTravelDocumentCodeList;
    }

    /**
     * Sets the value of the sectionTravelDocumentCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentCodes }
     *     
     */
    public void setSectionTravelDocumentCodeList(TravelDocumentCodes value) {
        this.sectionTravelDocumentCodeList = value;
    }

    public boolean isSetSectionTravelDocumentCodeList() {
        return (this.sectionTravelDocumentCodeList!= null);
    }

}
