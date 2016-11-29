
package se.linkon.petra.gtssales.validcodes.data.v1_17;

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
 *     &lt;enumeration value="ConsumerCategory_Itinerary"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="PlacementType"/&gt;
 *     &lt;enumeration value="CompartmentType_Rest"/&gt;
 *     &lt;enumeration value="CompartmentType_Sleep"/&gt;
 *     &lt;enumeration value="CompartmentSize_Rest"/&gt;
 *     &lt;enumeration value="CompartmentSize_Sleep"/&gt;
 *     &lt;enumeration value="SmokingDepartment"/&gt;
 *     &lt;enumeration value="PlacementOrientation_Rest"/&gt;
 *     &lt;enumeration value="PlacementOrientation_Seat"/&gt;
 *     &lt;enumeration value="PlacementOrientation_Sleep"/&gt;
 *     &lt;enumeration value="TravelMethodCCT"/&gt;
 *     &lt;enumeration value="ProductCode_Transport"/&gt;
 *     &lt;enumeration value="PriceGroup_PricePresentation"/&gt;
 *     &lt;enumeration value="ConsumerCategory_International"/&gt;
 *     &lt;enumeration value="ConsumerCategory_Transport"/&gt;
 *     &lt;enumeration value="Discount_International"/&gt;
 *     &lt;enumeration value="Discount_Transport"/&gt;
 *     &lt;enumeration value="ProductCode_Transport"/&gt;
 *     &lt;enumeration value="TravelType"/&gt;
 *     &lt;enumeration value="TravelType_International"/&gt;
 *     &lt;enumeration value="TravelType_InternationalTransport"/&gt;
 *     &lt;enumeration value="TravelType_RelationConnectedServiceWithConsumer"/&gt;
 *     &lt;enumeration value="TravelDocument"/&gt;
 *     &lt;enumeration value="TravelDocument_International"/&gt;
 *     &lt;enumeration value="PriceGroup"/&gt;
 *     &lt;enumeration value="SegmentProducer"/&gt;
 *     &lt;enumeration value="SegmentProducer_Transport"/&gt;
 *     &lt;enumeration value="VariousClientText"/&gt;
 *     &lt;enumeration value="ConsumerCategory_MultiRide"/&gt;
 *     &lt;enumeration value="PriceGroup_MultiRide"/&gt;
 *     &lt;enumeration value="ProductCode_MultiRide"/&gt;
 *     &lt;enumeration value="SegmentProducer_MultiRide"/&gt;
 *     &lt;enumeration value="TravelType_MultiRide"/&gt;
 *     &lt;enumeration value="ComponentEditActions"/&gt;
 *     &lt;enumeration value="PlaceSpecification_Seat"/&gt;
 *     &lt;enumeration value="Discount_Itinerary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeListNameType")
@XmlEnum
public enum CodeListNameType {


    /**
     * All categories of consumers or passengers (e.g. Adult, Child) available in the system.
     * 
     */
    @XmlEnumValue("ConsumerCategory_Itinerary")
    CONSUMER_CATEGORY_ITINERARY("ConsumerCategory_Itinerary"),

    /**
     * All discounts available in the system.
     * 
     */
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),

    /**
     * All available PlacementTypes.
     * 
     */
    @XmlEnumValue("PlacementType")
    PLACEMENT_TYPE("PlacementType"),

    /**
     * All types of rest compartments.
     * 
     */
    @XmlEnumValue("CompartmentType_Rest")
    COMPARTMENT_TYPE_REST("CompartmentType_Rest"),

    /**
     * All types of sleep compartments.
     * 
     */
    @XmlEnumValue("CompartmentType_Sleep")
    COMPARTMENT_TYPE_SLEEP("CompartmentType_Sleep"),

    /**
     * All sizes of rest compartments.
     * 
     */
    @XmlEnumValue("CompartmentSize_Rest")
    COMPARTMENT_SIZE_REST("CompartmentSize_Rest"),

    /**
     * All sizes of sleep compartments.
     * 
     */
    @XmlEnumValue("CompartmentSize_Sleep")
    COMPARTMENT_SIZE_SLEEP("CompartmentSize_Sleep"),

    /**
     * E.g. Non Smoking, Smoking.
     * 
     */
    @XmlEnumValue("SmokingDepartment")
    SMOKING_DEPARTMENT("SmokingDepartment"),

    /**
     * All types of orientations in a rest compartment.
     * 
     */
    @XmlEnumValue("PlacementOrientation_Rest")
    PLACEMENT_ORIENTATION_REST("PlacementOrientation_Rest"),

    /**
     * All types of orientations when sitting.
     * 
     */
    @XmlEnumValue("PlacementOrientation_Seat")
    PLACEMENT_ORIENTATION_SEAT("PlacementOrientation_Seat"),

    /**
     * All types of orientations in a sleep compartment.
     * 
     */
    @XmlEnumValue("PlacementOrientation_Sleep")
    PLACEMENT_ORIENTATION_SLEEP("PlacementOrientation_Sleep"),

    /**
     * All available transport modes (e.g. Train, Bus).
     * 
     */
    @XmlEnumValue("TravelMethodCCT")
    TRAVEL_METHOD_CCT("TravelMethodCCT"),

    /**
     * All available product codes (e.g. IC, RE, X2).
     * 
     */
    @XmlEnumValue("ProductCode_Transport")
    PRODUCT_CODE_TRANSPORT("ProductCode_Transport"),

    /**
     * Price group names.
     * 
     */
    @XmlEnumValue("PriceGroup_PricePresentation")
    PRICE_GROUP_PRICE_PRESENTATION("PriceGroup_PricePresentation"),

    /**
     * Consumer Categories for International travels
     * 
     */
    @XmlEnumValue("ConsumerCategory_International")
    CONSUMER_CATEGORY_INTERNATIONAL("ConsumerCategory_International"),

    /**
     * Consumer Category Transport names.
     * 
     */
    @XmlEnumValue("ConsumerCategory_Transport")
    CONSUMER_CATEGORY_TRANSPORT("ConsumerCategory_Transport"),

    /**
     * Discount categories for International travels.
     * 
     */
    @XmlEnumValue("Discount_International")
    DISCOUNT_INTERNATIONAL("Discount_International"),

    /**
     * Discount categories for transport.
     * 
     */
    @XmlEnumValue("Discount_Transport")
    DISCOUNT_TRANSPORT("Discount_Transport"),

    /**
     * Travel types, e.g. onw-way.
     * 
     */
    @XmlEnumValue("TravelType")
    TRAVEL_TYPE("TravelType"),

    /**
     * Travel type international, e.g. return.
     * 
     */
    @XmlEnumValue("TravelType_International")
    TRAVEL_TYPE_INTERNATIONAL("TravelType_International"),

    /**
     * Travel type international transport, e.g. return.
     * 
     */
    @XmlEnumValue("TravelType_InternationalTransport")
    TRAVEL_TYPE_INTERNATIONAL_TRANSPORT("TravelType_InternationalTransport"),

    /**
     * Travel type relation transport, e.g. return.
     * 
     */
    @XmlEnumValue("TravelType_RelationConnectedServiceWithConsumer")
    TRAVEL_TYPE_RELATION_CONNECTED_SERVICE_WITH_CONSUMER("TravelType_RelationConnectedServiceWithConsumer"),

    /**
     * Travel documents e.g. Ticket Only.
     * 
     */
    @XmlEnumValue("TravelDocument")
    TRAVEL_DOCUMENT("TravelDocument"),

    /**
     * Travel documents for international, e.g. Ticket Only.
     * 
     */
    @XmlEnumValue("TravelDocument_International")
    TRAVEL_DOCUMENT_INTERNATIONAL("TravelDocument_International"),

    /**
     * All price groups.
     * 
     */
    @XmlEnumValue("PriceGroup")
    PRICE_GROUP("PriceGroup"),

    /**
     * Segment producers global.
     * 
     */
    @XmlEnumValue("SegmentProducer")
    SEGMENT_PRODUCER("SegmentProducer"),

    /**
     * Segment producers mostly from Sweden.
     * 
     */
    @XmlEnumValue("SegmentProducer_Transport")
    SEGMENT_PRODUCER_TRANSPORT("SegmentProducer_Transport"),

    /**
     * Texts to be used by the client
     * 
     */
    @XmlEnumValue("VariousClientText")
    VARIOUS_CLIENT_TEXT("VariousClientText"),

    /**
     * Consumer categories for multiride ticket sales.
     * 
     */
    @XmlEnumValue("ConsumerCategory_MultiRide")
    CONSUMER_CATEGORY_MULTI_RIDE("ConsumerCategory_MultiRide"),

    /**
     * Price group codes for multiride ticket sales.
     * 
     */
    @XmlEnumValue("PriceGroup_MultiRide")
    PRICE_GROUP_MULTI_RIDE("PriceGroup_MultiRide"),

    /**
     * Product codes for multiride ticket sales.
     * 
     */
    @XmlEnumValue("ProductCode_MultiRide")
    PRODUCT_CODE_MULTI_RIDE("ProductCode_MultiRide"),

    /**
     * Segment producers (mostly from Sweden) for multiride ticket sales.
     * 
     */
    @XmlEnumValue("SegmentProducer_MultiRide")
    SEGMENT_PRODUCER_MULTI_RIDE("SegmentProducer_MultiRide"),

    /**
     * Travel types, e.g. one-way, for multiride ticket sales
     * 
     */
    @XmlEnumValue("TravelType_MultiRide")
    TRAVEL_TYPE_MULTI_RIDE("TravelType_MultiRide"),

    /**
     * Add, Change, Delete
     * 
     */
    @XmlEnumValue("ComponentEditActions")
    COMPONENT_EDIT_ACTIONS("ComponentEditActions"),

    /**
     * Possible seats
     * 
     */
    @XmlEnumValue("PlaceSpecification_Seat")
    PLACE_SPECIFICATION_SEAT("PlaceSpecification_Seat"),

    /**
     * All categories of consumers or passengers (e.g. Adult, Child) available in the system.
     * 
     */
    @XmlEnumValue("Discount_Itinerary")
    DISCOUNT_ITINERARY("Discount_Itinerary");
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
