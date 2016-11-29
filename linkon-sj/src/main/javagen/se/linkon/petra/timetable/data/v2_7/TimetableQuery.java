
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationSpecification"/&gt;
 *         &lt;element name="ViaLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationSpecification" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalLocation" type="{http://petra.linkon.se/timetable/data/v2_7}LocationSpecification"/&gt;
 *         &lt;element name="NoZoneLocationSearch" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTime"/&gt;
 *           &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTime"/&gt;
 *           &lt;element name="LatestDepartureDateTime" type="{http://petra.linkon.se/commonelements/data/v4_6}DepartureDateTimeType"/&gt;
 *           &lt;element name="EarliestArrivalDateTime" type="{http://petra.linkon.se/commonelements/data/v4_6}ArrivalDateTimeType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="MinimumChangeDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfChanges" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfJourneyAdvices" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *               &lt;maxInclusive value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExcludedTravelMethodProductCombinations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TravelMethodProductCombination" type="{http://petra.linkon.se/timetable/data/v2_7}TravelMethodProductCombination" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequiredSegmentProducerCodes" type="{http://petra.linkon.se/timetable/data/v2_7}SegmentProducerCodesType" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedSegmentProducerCodes" type="{http://petra.linkon.se/timetable/data/v2_7}SegmentProducerCodesType" minOccurs="0"/&gt;
 *         &lt;element name="RequiredProductCodes" type="{http://petra.linkon.se/timetable/data/v2_7}ProductCodesType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeViaLocations" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PreferredSegmentProducerCodes" type="{http://petra.linkon.se/timetable/data/v2_7}SegmentProducerCodesType" minOccurs="0"/&gt;
 *         &lt;element name="NotPreferredSegmentProducerCodes" type="{http://petra.linkon.se/timetable/data/v2_7}SegmentProducerCodesType" minOccurs="0"/&gt;
 *         &lt;element name="PreferredTravelMethodProductCodes" type="{http://petra.linkon.se/timetable/data/v2_7}PreferredTravelMethodProductCodesType" minOccurs="0"/&gt;
 *         &lt;element name="NotPreferredTravelMethodProductCodes" type="{http://petra.linkon.se/timetable/data/v2_7}NotPreferredTravelMethodProductCodesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "departureLocation",
    "viaLocation",
    "arrivalLocation",
    "noZoneLocationSearch",
    "departureDateTime",
    "arrivalDateTime",
    "latestDepartureDateTime",
    "earliestArrivalDateTime",
    "minimumChangeDuration",
    "maximumNumberOfChanges",
    "maximumNumberOfJourneyAdvices",
    "excludedTravelMethodProductCombinations",
    "requiredSegmentProducerCodes",
    "excludedSegmentProducerCodes",
    "requiredProductCodes",
    "includeViaLocations",
    "preferredSegmentProducerCodes",
    "notPreferredSegmentProducerCodes",
    "preferredTravelMethodProductCodes",
    "notPreferredTravelMethodProductCodes"
})
@XmlRootElement(name = "TimetableQuery")
public class TimetableQuery
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DepartureLocation", required = true)
    protected LocationSpecification departureLocation;
    @XmlElement(name = "ViaLocation")
    protected LocationSpecification viaLocation;
    @XmlElement(name = "ArrivalLocation", required = true)
    protected LocationSpecification arrivalLocation;
    @XmlElement(name = "NoZoneLocationSearch")
    protected EmptyType noZoneLocationSearch;
    @XmlElement(name = "DepartureDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "LatestDepartureDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDepartureDateTime;
    @XmlElement(name = "EarliestArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestArrivalDateTime;
    @XmlElement(name = "MinimumChangeDuration")
    protected Duration minimumChangeDuration;
    @XmlElement(name = "MaximumNumberOfChanges")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer maximumNumberOfChanges;
    @XmlElement(name = "MaximumNumberOfJourneyAdvices")
    protected Integer maximumNumberOfJourneyAdvices;
    @XmlElement(name = "ExcludedTravelMethodProductCombinations")
    protected TimetableQuery.ExcludedTravelMethodProductCombinations excludedTravelMethodProductCombinations;
    @XmlElement(name = "RequiredSegmentProducerCodes")
    protected SegmentProducerCodesType requiredSegmentProducerCodes;
    @XmlElement(name = "ExcludedSegmentProducerCodes")
    protected SegmentProducerCodesType excludedSegmentProducerCodes;
    @XmlElement(name = "RequiredProductCodes")
    protected ProductCodesType requiredProductCodes;
    @XmlElement(name = "IncludeViaLocations")
    protected EmptyType includeViaLocations;
    @XmlElement(name = "PreferredSegmentProducerCodes")
    protected SegmentProducerCodesType preferredSegmentProducerCodes;
    @XmlElement(name = "NotPreferredSegmentProducerCodes")
    protected SegmentProducerCodesType notPreferredSegmentProducerCodes;
    @XmlElement(name = "PreferredTravelMethodProductCodes")
    protected PreferredTravelMethodProductCodesType preferredTravelMethodProductCodes;
    @XmlElement(name = "NotPreferredTravelMethodProductCodes")
    protected NotPreferredTravelMethodProductCodesType notPreferredTravelMethodProductCodes;

    /**
     * Gets the value of the departureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSpecification }
     *     
     */
    public LocationSpecification getDepartureLocation() {
        return departureLocation;
    }

    /**
     * Sets the value of the departureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSpecification }
     *     
     */
    public void setDepartureLocation(LocationSpecification value) {
        this.departureLocation = value;
    }

    public boolean isSetDepartureLocation() {
        return (this.departureLocation!= null);
    }

    /**
     * Gets the value of the viaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSpecification }
     *     
     */
    public LocationSpecification getViaLocation() {
        return viaLocation;
    }

    /**
     * Sets the value of the viaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSpecification }
     *     
     */
    public void setViaLocation(LocationSpecification value) {
        this.viaLocation = value;
    }

    public boolean isSetViaLocation() {
        return (this.viaLocation!= null);
    }

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSpecification }
     *     
     */
    public LocationSpecification getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSpecification }
     *     
     */
    public void setArrivalLocation(LocationSpecification value) {
        this.arrivalLocation = value;
    }

    public boolean isSetArrivalLocation() {
        return (this.arrivalLocation!= null);
    }

    /**
     * Gets the value of the noZoneLocationSearch property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoZoneLocationSearch() {
        return noZoneLocationSearch;
    }

    /**
     * Sets the value of the noZoneLocationSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoZoneLocationSearch(EmptyType value) {
        this.noZoneLocationSearch = value;
    }

    public boolean isSetNoZoneLocationSearch() {
        return (this.noZoneLocationSearch!= null);
    }

    /**
     * Specify this if the response should match the departure time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    public boolean isSetDepartureDateTime() {
        return (this.departureDateTime!= null);
    }

    /**
     * Specify this if the response should match the preferred arrival time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    public boolean isSetArrivalDateTime() {
        return (this.arrivalDateTime!= null);
    }

    /**
     * Gets the value of the latestDepartureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDepartureDateTime() {
        return latestDepartureDateTime;
    }

    /**
     * Sets the value of the latestDepartureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDepartureDateTime(XMLGregorianCalendar value) {
        this.latestDepartureDateTime = value;
    }

    public boolean isSetLatestDepartureDateTime() {
        return (this.latestDepartureDateTime!= null);
    }

    /**
     * Gets the value of the earliestArrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestArrivalDateTime() {
        return earliestArrivalDateTime;
    }

    /**
     * Sets the value of the earliestArrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestArrivalDateTime(XMLGregorianCalendar value) {
        this.earliestArrivalDateTime = value;
    }

    public boolean isSetEarliestArrivalDateTime() {
        return (this.earliestArrivalDateTime!= null);
    }

    /**
     * Gets the value of the minimumChangeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumChangeDuration() {
        return minimumChangeDuration;
    }

    /**
     * Sets the value of the minimumChangeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumChangeDuration(Duration value) {
        this.minimumChangeDuration = value;
    }

    public boolean isSetMinimumChangeDuration() {
        return (this.minimumChangeDuration!= null);
    }

    /**
     * Gets the value of the maximumNumberOfChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumNumberOfChanges() {
        return maximumNumberOfChanges;
    }

    /**
     * Sets the value of the maximumNumberOfChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumNumberOfChanges(Integer value) {
        this.maximumNumberOfChanges = value;
    }

    public boolean isSetMaximumNumberOfChanges() {
        return (this.maximumNumberOfChanges!= null);
    }

    /**
     * Gets the value of the maximumNumberOfJourneyAdvices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumNumberOfJourneyAdvices() {
        return maximumNumberOfJourneyAdvices;
    }

    /**
     * Sets the value of the maximumNumberOfJourneyAdvices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumNumberOfJourneyAdvices(Integer value) {
        this.maximumNumberOfJourneyAdvices = value;
    }

    public boolean isSetMaximumNumberOfJourneyAdvices() {
        return (this.maximumNumberOfJourneyAdvices!= null);
    }

    /**
     * Gets the value of the excludedTravelMethodProductCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link TimetableQuery.ExcludedTravelMethodProductCombinations }
     *     
     */
    public TimetableQuery.ExcludedTravelMethodProductCombinations getExcludedTravelMethodProductCombinations() {
        return excludedTravelMethodProductCombinations;
    }

    /**
     * Sets the value of the excludedTravelMethodProductCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetableQuery.ExcludedTravelMethodProductCombinations }
     *     
     */
    public void setExcludedTravelMethodProductCombinations(TimetableQuery.ExcludedTravelMethodProductCombinations value) {
        this.excludedTravelMethodProductCombinations = value;
    }

    public boolean isSetExcludedTravelMethodProductCombinations() {
        return (this.excludedTravelMethodProductCombinations!= null);
    }

    /**
     * Gets the value of the requiredSegmentProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public SegmentProducerCodesType getRequiredSegmentProducerCodes() {
        return requiredSegmentProducerCodes;
    }

    /**
     * Sets the value of the requiredSegmentProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public void setRequiredSegmentProducerCodes(SegmentProducerCodesType value) {
        this.requiredSegmentProducerCodes = value;
    }

    public boolean isSetRequiredSegmentProducerCodes() {
        return (this.requiredSegmentProducerCodes!= null);
    }

    /**
     * Gets the value of the excludedSegmentProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public SegmentProducerCodesType getExcludedSegmentProducerCodes() {
        return excludedSegmentProducerCodes;
    }

    /**
     * Sets the value of the excludedSegmentProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public void setExcludedSegmentProducerCodes(SegmentProducerCodesType value) {
        this.excludedSegmentProducerCodes = value;
    }

    public boolean isSetExcludedSegmentProducerCodes() {
        return (this.excludedSegmentProducerCodes!= null);
    }

    /**
     * Gets the value of the requiredProductCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodesType }
     *     
     */
    public ProductCodesType getRequiredProductCodes() {
        return requiredProductCodes;
    }

    /**
     * Sets the value of the requiredProductCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodesType }
     *     
     */
    public void setRequiredProductCodes(ProductCodesType value) {
        this.requiredProductCodes = value;
    }

    public boolean isSetRequiredProductCodes() {
        return (this.requiredProductCodes!= null);
    }

    /**
     * Gets the value of the includeViaLocations property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludeViaLocations() {
        return includeViaLocations;
    }

    /**
     * Sets the value of the includeViaLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludeViaLocations(EmptyType value) {
        this.includeViaLocations = value;
    }

    public boolean isSetIncludeViaLocations() {
        return (this.includeViaLocations!= null);
    }

    /**
     * Gets the value of the preferredSegmentProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public SegmentProducerCodesType getPreferredSegmentProducerCodes() {
        return preferredSegmentProducerCodes;
    }

    /**
     * Sets the value of the preferredSegmentProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public void setPreferredSegmentProducerCodes(SegmentProducerCodesType value) {
        this.preferredSegmentProducerCodes = value;
    }

    public boolean isSetPreferredSegmentProducerCodes() {
        return (this.preferredSegmentProducerCodes!= null);
    }

    /**
     * Gets the value of the notPreferredSegmentProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public SegmentProducerCodesType getNotPreferredSegmentProducerCodes() {
        return notPreferredSegmentProducerCodes;
    }

    /**
     * Sets the value of the notPreferredSegmentProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentProducerCodesType }
     *     
     */
    public void setNotPreferredSegmentProducerCodes(SegmentProducerCodesType value) {
        this.notPreferredSegmentProducerCodes = value;
    }

    public boolean isSetNotPreferredSegmentProducerCodes() {
        return (this.notPreferredSegmentProducerCodes!= null);
    }

    /**
     * Gets the value of the preferredTravelMethodProductCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredTravelMethodProductCodesType }
     *     
     */
    public PreferredTravelMethodProductCodesType getPreferredTravelMethodProductCodes() {
        return preferredTravelMethodProductCodes;
    }

    /**
     * Sets the value of the preferredTravelMethodProductCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredTravelMethodProductCodesType }
     *     
     */
    public void setPreferredTravelMethodProductCodes(PreferredTravelMethodProductCodesType value) {
        this.preferredTravelMethodProductCodes = value;
    }

    public boolean isSetPreferredTravelMethodProductCodes() {
        return (this.preferredTravelMethodProductCodes!= null);
    }

    /**
     * Gets the value of the notPreferredTravelMethodProductCodes property.
     * 
     * @return
     *     possible object is
     *     {@link NotPreferredTravelMethodProductCodesType }
     *     
     */
    public NotPreferredTravelMethodProductCodesType getNotPreferredTravelMethodProductCodes() {
        return notPreferredTravelMethodProductCodes;
    }

    /**
     * Sets the value of the notPreferredTravelMethodProductCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotPreferredTravelMethodProductCodesType }
     *     
     */
    public void setNotPreferredTravelMethodProductCodes(NotPreferredTravelMethodProductCodesType value) {
        this.notPreferredTravelMethodProductCodes = value;
    }

    public boolean isSetNotPreferredTravelMethodProductCodes() {
        return (this.notPreferredTravelMethodProductCodes!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TravelMethodProductCombination" type="{http://petra.linkon.se/timetable/data/v2_7}TravelMethodProductCombination" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travelMethodProductCombination"
    })
    public static class ExcludedTravelMethodProductCombinations
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "TravelMethodProductCombination", required = true)
        protected List<TravelMethodProductCombination> travelMethodProductCombination;

        /**
         * Gets the value of the travelMethodProductCombination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelMethodProductCombination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelMethodProductCombination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelMethodProductCombination }
         * 
         * 
         */
        public List<TravelMethodProductCombination> getTravelMethodProductCombination() {
            if (travelMethodProductCombination == null) {
                travelMethodProductCombination = new ArrayList<TravelMethodProductCombination>();
            }
            return this.travelMethodProductCombination;
        }

        public boolean isSetTravelMethodProductCombination() {
            return ((this.travelMethodProductCombination!= null)&&(!this.travelMethodProductCombination.isEmpty()));
        }

        public void unsetTravelMethodProductCombination() {
            this.travelMethodProductCombination = null;
        }

    }

}
