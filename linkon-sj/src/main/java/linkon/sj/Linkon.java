package linkon.sj;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import se.linkon.petra.commoncomplexelements.data.v4_6.ClientInformation;
import se.linkon.petra.commonelements.data.v4_6.LanguageCodeType;
import se.linkon.petra.commonelements.data.v4_6.PassengerCategoryType;
import se.linkon.petra.commonelements.data.v4_6.TransportSegmentsOriginType;
import se.linkon.petra.gtssales.booktransport.data.v1_17.*;
import se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17.GetJourneyAdviceOverviewPriceQuotesDescription;
import se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17.GetJourneyAdviceOverviewPriceQuotesSpecification;
import se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17.JourneyAdviceDescriptionType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.ConsumerSpecificationType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.*;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.ItinerarySpecificationType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.ItinerarySpecificationsType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.SegmentSpecificationType;
import se.linkon.petra.gtssales.journeyadvicepricequotes.shared.data.v1_17.SegmentSpecificationsType;
import se.linkon.petra.gtssales.shared.data.v1_17.LocationType;
import se.linkon.petra.gtssales.shared.data.v1_17.TransportInformationsType;
import se.linkon.petra.order.orderstorage.createorder.data.v1_10.CreateOrderRequest;
import se.linkon.petra.order.orderstorage.createorder.data.v1_10.CreateOrderResponse;
import se.linkon.petra.timetable.data.v2_7.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

//@Log4j2
public class Linkon {

    private final LinkonWebService webService = new LinkonWebService();

    public static void main(String[] args) throws Exception {
        Linkon linkon = new Linkon();
        JourneyAdvice journeyAdvice = linkon.getJourneyAdvice();

        GetJourneyAdviceOverviewPriceQuotesDescription priceQuotesDescription = linkon.getPricedItem(journeyAdvice);

        JourneyAdviceDescriptionType journey
                = priceQuotesDescription.getJourneyAdviceDescriptions().getJourneyAdviceDescription().get(0);

        linkon.createOrder(journey);
    }

    private void createOrder(JourneyAdviceDescriptionType journey) throws Exception {
        CreateOrderRequest request = new CreateOrderRequest();
        CreateOrderResponse response
                = webService.getOrderStorageService().createOrder(request, getClientInformation());

        System.out.println("Order created with order lock id = " + response.getOrderLockId());

        BookItinerarySpecification bookRequest = new BookItinerarySpecification();
        bookRequest.setOrderLockId(response.getOrderLockId());
        bookRequest.setSalesOrderId(response.getSalesOrderId());

        ExternalReferenceType externalReferenceType = new ExternalReferenceType();
        externalReferenceType.setExternalReferenceId("GoEuroTest");
        externalReferenceType.setExternalSystem("GoEuro");
        bookRequest.setExternalReference(externalReferenceType);

        ItineraryServiceSpecificationsType mappedItinerariesList = new ItineraryServiceSpecificationsType();
        ItineraryServiceSpecificationType mappedItinerary = new ItineraryServiceSpecificationType();
        mappedItinerary.setJourneyConnectionReference(journey.getJourneyConnectionReference());

        se.linkon.petra.gtssales.booktransport.data.v1_17.ConsumerSpecificationType consumerSpecificationType
                = new se.linkon.petra.gtssales.booktransport.data.v1_17.ConsumerSpecificationType();
        PassengerCategoryType categoryType = new PassengerCategoryType();
        categoryType.setValue("VU");
        categoryType.setPlaintext("Adult");
        consumerSpecificationType.setPassengerCategory(categoryType);

        mappedItinerary.setConsumerSpecification(consumerSpecificationType);

        se.linkon.petra.gtssales.booktransport.data.v1_17.ItinerarySpecificationsType itinerarySpecificationsList
                = new se.linkon.petra.gtssales.booktransport.data.v1_17.ItinerarySpecificationsType();

        se.linkon.petra.gtssales.booktransport.data.v1_17.ItinerarySpecificationType itinerarySpecification
                = new se.linkon.petra.gtssales.booktransport.data.v1_17.ItinerarySpecificationType();
        itinerarySpecification.setItineraryReference(journey.getJourneyConnectionReference());

        se.linkon.petra.gtssales.booktransport.data.v1_17.SegmentSpecificationsType segmentsList
                = new se.linkon.petra.gtssales.booktransport.data.v1_17.SegmentSpecificationsType();

        se.linkon.petra.gtssales.booktransport.data.v1_17.SegmentSpecificationType mappedSegment
                = new se.linkon.petra.gtssales.booktransport.data.v1_17.SegmentSpecificationType();

        segmentsList.getSegmentSpecification().add(mappedSegment);

        itinerarySpecification.setSegmentSpecifications(new se.linkon.petra.gtssales.booktransport.data.v1_17.SegmentSpecificationsType());

        itinerarySpecificationsList.getItinerarySpecification().add(itinerarySpecification);

//        itinerarySpecification.setItineraryServiceSpecifications(new ItineraryServiceSpecificationsType());
        mappedItinerary.setItinerarySpecifications(itinerarySpecificationsList);

        mappedItinerariesList.getItineraryServiceSpecification().add(mappedItinerary);
        bookRequest.setItineraryServiceSpecifications(mappedItinerariesList);

        BookItineraryDescription description
                = webService.getGtsSalesService().bookItinerary(bookRequest, getClientInformation());
    }

    private JourneyAdvice getJourneyAdvice() throws Exception {

        TimetableQuery timetableQuery = new TimetableQuery();

        timetableQuery.setDepartureLocation(getLocationSpecification(1));
        timetableQuery.setArrivalLocation(getLocationSpecification(2));
        timetableQuery.setDepartureDateTime(getGregorianCalendar());

        Timetable timetable
                = webService.getTimetableService().getTimetable(timetableQuery, getClientInformation());
        return timetable.getJourneyAdvice().get(0);
    }

    private GetJourneyAdviceOverviewPriceQuotesDescription getPricedItem(JourneyAdvice journeyAdvice) throws Exception {
        JourneyAdviceSpecificationType mappedJourneyAdvice = new JourneyAdviceSpecificationType();

        ItinerarySpecificationsType mappedItinerariesList = new ItinerarySpecificationsType();
        mappedJourneyAdvice.setItinerarySpecifications(mappedItinerariesList);
        mappedJourneyAdvice.setJourneyConnectionReference(journeyAdvice.getJourneyConnectionReference());

        List<Itinerary> itineraries = journeyAdvice.getItineraries().getItinerary();

        for (Itinerary itinerary : itineraries) {
            ItinerarySpecificationType mappedItinerary = new ItinerarySpecificationType();
            mappedItinerary.setItineraryReference(itinerary.getItineraryReference());

            List<Segment> segments = itinerary.getSegments().getSegment();

            SegmentSpecificationsType mappedSegments = mapSegments(segments);
            mappedItinerary.setSegmentSpecifications(mappedSegments);

            mappedItinerariesList.getItinerarySpecification().add(mappedItinerary);
        }

        GetJourneyAdviceOverviewPriceQuotesSpecification gtsRequest = createBaseGtsRequest();
        gtsRequest.getJourneyAdviceSpecifications().getJourneyAdviceSpecification().add(mappedJourneyAdvice);

        return webService.getGtsSalesService().getJourneyAdviceOverviewPriceQuotes(gtsRequest, getClientInformation());
    }

    private ConsumerSpecificationsType getPassengers() {
        ConsumerSpecificationsType type = new ConsumerSpecificationsType();
        ConsumerSpecificationType singleType = new ConsumerSpecificationType();
//        singleType.setPassengerAge(27);

        PassengerCategoryType categoryType = new PassengerCategoryType();
        categoryType.setValue("VU");
        categoryType.setPlaintext("Adult");

        singleType.setPassengerCategory(categoryType);

        type.getConsumerSpecification().add(singleType);

        return type;
    }

    private ClientInformation getClientInformation() {
        ClientInformation clientInformation = new ClientInformation();
        clientInformation.setSalesUnitKey("GEQ25287");
        clientInformation.setApplicationName("GoEuro");
        clientInformation.setLanguageCode(LanguageCodeType.EN);

        return clientInformation;
    }

    private LocationSpecification getLocationSpecification(int locationId) {

        LocationSpecification locationSpecification = new LocationSpecification();
        locationSpecification.setProducerCode(74);
        locationSpecification.setLocationId(locationId);

        return locationSpecification;
    }

    private XMLGregorianCalendar getGregorianCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 10);

        final GregorianCalendar calendar = new GregorianCalendar(cal.getTimeZone());
        calendar.setTimeInMillis(cal.getTimeInMillis());
        return new XMLGregorianCalendarImpl(calendar);
    }

    private static SegmentSpecificationsType mapSegments(List<Segment> segments) {

        SegmentSpecificationsType segmentSpecificationsType = new SegmentSpecificationsType();

        for (Segment segment : segments) {

            SegmentSpecificationType mappedSegment = new SegmentSpecificationType();

            mappedSegment.setArrivalDateTime(segment.getArrivalDateTime());
            mappedSegment.setArrivalLocation(mapLocationType(segment.getArrivalLocation()));
            mappedSegment.setBookingClass(segment.getBookingClass());
            mappedSegment.setBookingRule(segment.getBookingRule());
            mappedSegment.setDepartureDateTime(segment.getDepartureDateTime());
            mappedSegment.setDepartureLocation(mapLocationType(segment.getDepartureLocation()));
            mappedSegment.setProductCode(segment.getProductCode());
            mappedSegment.setSegmentProducerCode(segment.getSegmentProducerCode());
            mappedSegment.setSegmentReference(segment.getSegmentReference());
            mappedSegment.setTransportId(segment.getTransportId());
            mappedSegment.setTransportInformations(mapTransportInformation(segment.getTransportInformations()));
            mappedSegment.setTravelMethodCode(segment.getTravelMethodCode());

            segmentSpecificationsType.getSegmentSpecification().add(mappedSegment);
        }

        return segmentSpecificationsType;
    }

    private static LocationType mapLocationType(se.linkon.petra.timetable.data.v2_7.LocationType locationType) {
        LocationType mappedLocationType = new LocationType();
        mappedLocationType.setProducerCode(locationType.getProducerCode());
        mappedLocationType.setLocationId(locationType.getLocationId());
        return mappedLocationType;
    }

    private static TransportInformationsType mapTransportInformation(
            se.linkon.petra.timetable.data.v2_7.TransportInformationsType transportInformation) {

        TransportInformationsType mappedTransportInformationType = new TransportInformationsType();
        if (transportInformation == null) {
            return mappedTransportInformationType;
        }

        mappedTransportInformationType.getTransportInformation().addAll(transportInformation.getTransportInformation());

        return mappedTransportInformationType;
    }

    private static GetJourneyAdviceOverviewPriceQuotesSpecification createBaseGtsRequest() {
        GetJourneyAdviceOverviewPriceQuotesSpecification gtsRequest = new GetJourneyAdviceOverviewPriceQuotesSpecification();

        ConsumerSpecificationsType consumerSpecificationsType = new ConsumerSpecificationsType();
        ConsumerSpecificationType type = new ConsumerSpecificationType();
        PassengerCategoryType categoryType = new PassengerCategoryType();
        categoryType.setPlaintext("Adult");
        categoryType.setValue("VU");
        type.setPassengerCategory(categoryType);
        consumerSpecificationsType.getConsumerSpecification().add(type);

        gtsRequest.setConsumerSpecifications(consumerSpecificationsType);

        gtsRequest.setTransportSegmentsOrigin(TransportSegmentsOriginType.T);

        JourneyAdviceSpecificationsType journeyAdviceSpecificationsType = new JourneyAdviceSpecificationsType();
        gtsRequest.setJourneyAdviceSpecifications(journeyAdviceSpecificationsType);

        return gtsRequest;
    }
}
