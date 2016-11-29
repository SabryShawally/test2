
package se.linkon.petra.location.validcodes.data.v1_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeListNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LocationProducer_DefaultTravelRoute"/&gt;
 *     &lt;enumeration value="LocationProducer_International"/&gt;
 *     &lt;enumeration value="LocationProducer_InternationalTransport"/&gt;
 *     &lt;enumeration value="LocationProducer_Itinerary"/&gt;
 *     &lt;enumeration value="LocationProducer_LocationConnectedServiceWithConsumer"/&gt;
 *     &lt;enumeration value="LocationProducer_LocationConnectedServiceWithGroup"/&gt;
 *     &lt;enumeration value="LocationProducer_LocationConnectedServiceWithTime"/&gt;
 *     &lt;enumeration value="LocationProducer_LocationConnectedServiceWithTimeAndPrice"/&gt;
 *     &lt;enumeration value="LocationProducer_Transport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeListNameType")
@XmlEnum
public enum CodeListNameType {


    /**
     * 
     *             Default travel route.
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_DefaultTravelRoute")
    LOCATION_PRODUCER_DEFAULT_TRAVEL_ROUTE("LocationProducer_DefaultTravelRoute"),

    /**
     * 
     *             Countries valid as location producers for International bookings
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_International")
    LOCATION_PRODUCER_INTERNATIONAL("LocationProducer_International"),

    /**
     * 
     *             Countries valid as location producers for International transports
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_InternationalTransport")
    LOCATION_PRODUCER_INTERNATIONAL_TRANSPORT("LocationProducer_InternationalTransport"),

    /**
     * 
     *             Location producer itinerary
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_Itinerary")
    LOCATION_PRODUCER_ITINERARY("LocationProducer_Itinerary"),

    /**
     * 
     *             Location Producer LocationConnectedServiceWithConsumer
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_LocationConnectedServiceWithConsumer")
    LOCATION_PRODUCER_LOCATION_CONNECTED_SERVICE_WITH_CONSUMER("LocationProducer_LocationConnectedServiceWithConsumer"),

    /**
     * 
     *             Location Producer LocationConnectedServiceWithGroup
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_LocationConnectedServiceWithGroup")
    LOCATION_PRODUCER_LOCATION_CONNECTED_SERVICE_WITH_GROUP("LocationProducer_LocationConnectedServiceWithGroup"),

    /**
     * 
     * 			Location Producer LocationConnectedServiceWithTime
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_LocationConnectedServiceWithTime")
    LOCATION_PRODUCER_LOCATION_CONNECTED_SERVICE_WITH_TIME("LocationProducer_LocationConnectedServiceWithTime"),

    /**
     * 
     * 			Location Producer LocationConnectedServiceWithTimeAndPrice 
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_LocationConnectedServiceWithTimeAndPrice")
    LOCATION_PRODUCER_LOCATION_CONNECTED_SERVICE_WITH_TIME_AND_PRICE("LocationProducer_LocationConnectedServiceWithTimeAndPrice"),

    /**
     * 
     * 			LocationProducer Transport 
     *           
     * 
     */
    @XmlEnumValue("LocationProducer_Transport")
    LOCATION_PRODUCER_TRANSPORT("LocationProducer_Transport");
    private final String value;

    CodeListNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeListNameType fromValue(String v) {
        for (CodeListNameType c: CodeListNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
