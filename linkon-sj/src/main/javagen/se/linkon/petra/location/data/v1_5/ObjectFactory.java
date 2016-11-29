
package se.linkon.petra.location.data.v1_5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.location.data.v1_5 package. 
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

    private final static QName _LocationQuery_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "LocationQuery");
    private final static QName _Location_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "Location");
    private final static QName _LocationZone_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "LocationZone");
    private final static QName _ZoneLocationSpecificationList_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "ZoneLocationSpecificationList");
    private final static QName _ZoneLocationSpecification_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "ZoneLocationSpecification");
    private final static QName _ZoneLocationResultList_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "ZoneLocationResultList");
    private final static QName _ZoneLocationResult_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "ZoneLocationResult");
    private final static QName _ZoneLocation_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "ZoneLocation");
    private final static QName _LocationList_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "LocationList");
    private final static QName _GetLocationsURL_QNAME = new QName("http://petra.linkon.se/location/data/v1_5", "GetLocationsURL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.location.data.v1_5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAddressesQuery }
     * 
     */
    public FindAddressesQuery createFindAddressesQuery() {
        return new FindAddressesQuery();
    }

    /**
     * Create an instance of {@link FindAddressesResponse }
     * 
     */
    public FindAddressesResponse createFindAddressesResponse() {
        return new FindAddressesResponse();
    }

    /**
     * Create an instance of {@link FindLocationsQuery }
     * 
     */
    public FindLocationsQuery createFindLocationsQuery() {
        return new FindLocationsQuery();
    }

    /**
     * Create an instance of {@link FindLocationsResponse }
     * 
     */
    public FindLocationsResponse createFindLocationsResponse() {
        return new FindLocationsResponse();
    }

    /**
     * Create an instance of {@link GetFrequentLocationsResponse }
     * 
     */
    public GetFrequentLocationsResponse createGetFrequentLocationsResponse() {
        return new GetFrequentLocationsResponse();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link FindAddressesResponse.FindAddressResponse }
     * 
     */
    public FindAddressesResponse.FindAddressResponse createFindAddressesResponseFindAddressResponse() {
        return new FindAddressesResponse.FindAddressResponse();
    }

    /**
     * Create an instance of {@link FindAddressesQuery.FindAddressesQueries }
     * 
     */
    public FindAddressesQuery.FindAddressesQueries createFindAddressesQueryFindAddressesQueries() {
        return new FindAddressesQuery.FindAddressesQueries();
    }

    /**
     * Create an instance of {@link FindLocationsQuery.LocationQueries }
     * 
     */
    public FindLocationsQuery.LocationQueries createFindLocationsQueryLocationQueries() {
        return new FindLocationsQuery.LocationQueries();
    }

    /**
     * Create an instance of {@link LocationQueryType }
     * 
     */
    public LocationQueryType createLocationQueryType() {
        return new LocationQueryType();
    }

    /**
     * Create an instance of {@link FindLocationsResponse.Locations }
     * 
     */
    public FindLocationsResponse.Locations createFindLocationsResponseLocations() {
        return new FindLocationsResponse.Locations();
    }

    /**
     * Create an instance of {@link LocationZoneType }
     * 
     */
    public LocationZoneType createLocationZoneType() {
        return new LocationZoneType();
    }

    /**
     * Create an instance of {@link FindZoneLocationsSpecification }
     * 
     */
    public FindZoneLocationsSpecification createFindZoneLocationsSpecification() {
        return new FindZoneLocationsSpecification();
    }

    /**
     * Create an instance of {@link ZoneLocationSpecificationListType }
     * 
     */
    public ZoneLocationSpecificationListType createZoneLocationSpecificationListType() {
        return new ZoneLocationSpecificationListType();
    }

    /**
     * Create an instance of {@link ZoneLocationType }
     * 
     */
    public ZoneLocationType createZoneLocationType() {
        return new ZoneLocationType();
    }

    /**
     * Create an instance of {@link FindZoneLocationsResult }
     * 
     */
    public FindZoneLocationsResult createFindZoneLocationsResult() {
        return new FindZoneLocationsResult();
    }

    /**
     * Create an instance of {@link ZoneLocationResultListType }
     * 
     */
    public ZoneLocationResultListType createZoneLocationResultListType() {
        return new ZoneLocationResultListType();
    }

    /**
     * Create an instance of {@link ZoneLocationResultType }
     * 
     */
    public ZoneLocationResultType createZoneLocationResultType() {
        return new ZoneLocationResultType();
    }

    /**
     * Create an instance of {@link LocationListType }
     * 
     */
    public LocationListType createLocationListType() {
        return new LocationListType();
    }

    /**
     * Create an instance of {@link GetFrequentLocationsQuery }
     * 
     */
    public GetFrequentLocationsQuery createGetFrequentLocationsQuery() {
        return new GetFrequentLocationsQuery();
    }

    /**
     * Create an instance of {@link GetFrequentLocationsResponse.Locations }
     * 
     */
    public GetFrequentLocationsResponse.Locations createGetFrequentLocationsResponseLocations() {
        return new GetFrequentLocationsResponse.Locations();
    }

    /**
     * Create an instance of {@link LocationsURL }
     * 
     */
    public LocationsURL createLocationsURL() {
        return new LocationsURL();
    }

    /**
     * Create an instance of {@link LocationExceptionData }
     * 
     */
    public LocationExceptionData createLocationExceptionData() {
        return new LocationExceptionData();
    }

    /**
     * Create an instance of {@link OnlySpecificExternalSystemsType }
     * 
     */
    public OnlySpecificExternalSystemsType createOnlySpecificExternalSystemsType() {
        return new OnlySpecificExternalSystemsType();
    }

    /**
     * Create an instance of {@link PositionCoordinatesType }
     * 
     */
    public PositionCoordinatesType createPositionCoordinatesType() {
        return new PositionCoordinatesType();
    }

    /**
     * Create an instance of {@link WGS84CoordinateType }
     * 
     */
    public WGS84CoordinateType createWGS84CoordinateType() {
        return new WGS84CoordinateType();
    }

    /**
     * Create an instance of {@link RT90CoordinatesType }
     * 
     */
    public RT90CoordinatesType createRT90CoordinatesType() {
        return new RT90CoordinatesType();
    }

    /**
     * Create an instance of {@link LocationType.LocationZones }
     * 
     */
    public LocationType.LocationZones createLocationTypeLocationZones() {
        return new LocationType.LocationZones();
    }

    /**
     * Create an instance of {@link FindAddressesResponse.FindAddressResponse.Address }
     * 
     */
    public FindAddressesResponse.FindAddressResponse.Address createFindAddressesResponseFindAddressResponseAddress() {
        return new FindAddressesResponse.FindAddressResponse.Address();
    }

    /**
     * Create an instance of {@link FindAddressesQuery.FindAddressesQueries.FindAddressQuery }
     * 
     */
    public FindAddressesQuery.FindAddressesQueries.FindAddressQuery createFindAddressesQueryFindAddressesQueriesFindAddressQuery() {
        return new FindAddressesQuery.FindAddressesQueries.FindAddressQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "LocationQuery")
    public JAXBElement<LocationQueryType> createLocationQuery(LocationQueryType value) {
        return new JAXBElement<LocationQueryType>(_LocationQuery_QNAME, LocationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "LocationZone")
    public JAXBElement<LocationZoneType> createLocationZone(LocationZoneType value) {
        return new JAXBElement<LocationZoneType>(_LocationZone_QNAME, LocationZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneLocationSpecificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "ZoneLocationSpecificationList")
    public JAXBElement<ZoneLocationSpecificationListType> createZoneLocationSpecificationList(ZoneLocationSpecificationListType value) {
        return new JAXBElement<ZoneLocationSpecificationListType>(_ZoneLocationSpecificationList_QNAME, ZoneLocationSpecificationListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "ZoneLocationSpecification")
    public JAXBElement<ZoneLocationType> createZoneLocationSpecification(ZoneLocationType value) {
        return new JAXBElement<ZoneLocationType>(_ZoneLocationSpecification_QNAME, ZoneLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneLocationResultListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "ZoneLocationResultList")
    public JAXBElement<ZoneLocationResultListType> createZoneLocationResultList(ZoneLocationResultListType value) {
        return new JAXBElement<ZoneLocationResultListType>(_ZoneLocationResultList_QNAME, ZoneLocationResultListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneLocationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "ZoneLocationResult")
    public JAXBElement<ZoneLocationResultType> createZoneLocationResult(ZoneLocationResultType value) {
        return new JAXBElement<ZoneLocationResultType>(_ZoneLocationResult_QNAME, ZoneLocationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "ZoneLocation")
    public JAXBElement<ZoneLocationType> createZoneLocation(ZoneLocationType value) {
        return new JAXBElement<ZoneLocationType>(_ZoneLocation_QNAME, ZoneLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "LocationList")
    public JAXBElement<LocationListType> createLocationList(LocationListType value) {
        return new JAXBElement<LocationListType>(_LocationList_QNAME, LocationListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/location/data/v1_5", name = "GetLocationsURL")
    public JAXBElement<EmptyType> createGetLocationsURL(EmptyType value) {
        return new JAXBElement<EmptyType>(_GetLocationsURL_QNAME, EmptyType.class, null, value);
    }

}
