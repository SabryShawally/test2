
package se.linkon.petra.timetable.data.v2_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.timetable.data.v2_7 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Location_QNAME = new QName("http://petra.linkon.se/timetable/data/v2_7", "Location");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.timetable.data.v2_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimetableQuery }
     * 
     */
    public TimetableQuery createTimetableQuery() {
        return new TimetableQuery();
    }

    /**
     * Create an instance of {@link JourneyAdvice }
     * 
     */
    public JourneyAdvice createJourneyAdvice() {
        return new JourneyAdvice();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link LocationSpecification }
     * 
     */
    public LocationSpecification createLocationSpecification() {
        return new LocationSpecification();
    }

    /**
     * Create an instance of {@link TimetableQuery.ExcludedTravelMethodProductCombinations }
     * 
     */
    public TimetableQuery.ExcludedTravelMethodProductCombinations createTimetableQueryExcludedTravelMethodProductCombinations() {
        return new TimetableQuery.ExcludedTravelMethodProductCombinations();
    }

    /**
     * Create an instance of {@link SegmentProducerCodesType }
     * 
     */
    public SegmentProducerCodesType createSegmentProducerCodesType() {
        return new SegmentProducerCodesType();
    }

    /**
     * Create an instance of {@link ProductCodesType }
     * 
     */
    public ProductCodesType createProductCodesType() {
        return new ProductCodesType();
    }

    /**
     * Create an instance of {@link PreferredTravelMethodProductCodesType }
     * 
     */
    public PreferredTravelMethodProductCodesType createPreferredTravelMethodProductCodesType() {
        return new PreferredTravelMethodProductCodesType();
    }

    /**
     * Create an instance of {@link NotPreferredTravelMethodProductCodesType }
     * 
     */
    public NotPreferredTravelMethodProductCodesType createNotPreferredTravelMethodProductCodesType() {
        return new NotPreferredTravelMethodProductCodesType();
    }

    /**
     * Create an instance of {@link Timetable }
     * 
     */
    public Timetable createTimetable() {
        return new Timetable();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link JourneyAdvice.Itineraries }
     * 
     */
    public JourneyAdvice.Itineraries createJourneyAdviceItineraries() {
        return new JourneyAdvice.Itineraries();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link Segments }
     * 
     */
    public Segments createSegments() {
        return new Segments();
    }

    /**
     * Create an instance of {@link TransportInformationsType }
     * 
     */
    public TransportInformationsType createTransportInformationsType() {
        return new TransportInformationsType();
    }

    /**
     * Create an instance of {@link Segment.ViaLocations }
     * 
     */
    public Segment.ViaLocations createSegmentViaLocations() {
        return new Segment.ViaLocations();
    }

    /**
     * Create an instance of {@link AcceptableTravelMethodsQuery }
     * 
     */
    public AcceptableTravelMethodsQuery createAcceptableTravelMethodsQuery() {
        return new AcceptableTravelMethodsQuery();
    }

    /**
     * Create an instance of {@link AcceptableTravelMethods }
     * 
     */
    public AcceptableTravelMethods createAcceptableTravelMethods() {
        return new AcceptableTravelMethods();
    }

    /**
     * Create an instance of {@link TravelMethodProductCombination }
     * 
     */
    public TravelMethodProductCombination createTravelMethodProductCombination() {
        return new TravelMethodProductCombination();
    }

    /**
     * Create an instance of {@link TimetableExceptionData }
     * 
     */
    public TimetableExceptionData createTimetableExceptionData() {
        return new TimetableExceptionData();
    }

    /**
     * Create an instance of {@link GetValidCodesRequest }
     * 
     */
    public GetValidCodesRequest createGetValidCodesRequest() {
        return new GetValidCodesRequest();
    }

    /**
     * Create an instance of {@link ValidCodeSpecificationsType }
     * 
     */
    public ValidCodeSpecificationsType createValidCodeSpecificationsType() {
        return new ValidCodeSpecificationsType();
    }

    /**
     * Create an instance of {@link GetValidCodesResponse }
     * 
     */
    public GetValidCodesResponse createGetValidCodesResponse() {
        return new GetValidCodesResponse();
    }

    /**
     * Create an instance of {@link ValidCodeDescriptionsType }
     * 
     */
    public ValidCodeDescriptionsType createValidCodeDescriptionsType() {
        return new ValidCodeDescriptionsType();
    }

    /**
     * Create an instance of {@link ValidCodeSpecificationType }
     * 
     */
    public ValidCodeSpecificationType createValidCodeSpecificationType() {
        return new ValidCodeSpecificationType();
    }

    /**
     * Create an instance of {@link ValidCodeDescriptionType }
     * 
     */
    public ValidCodeDescriptionType createValidCodeDescriptionType() {
        return new ValidCodeDescriptionType();
    }

    /**
     * Create an instance of {@link CodesType }
     * 
     */
    public CodesType createCodesType() {
        return new CodesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/timetable/data/v2_7", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

}
