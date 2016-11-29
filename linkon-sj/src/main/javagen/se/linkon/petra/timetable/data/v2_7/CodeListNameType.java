
package se.linkon.petra.timetable.data.v2_7;

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
 *     &lt;enumeration value="PriceGroup_GeneralPrice"/&gt;
 *     &lt;enumeration value="PriceLevel"/&gt;
 *     &lt;enumeration value="SectionProducer_ExcludableItinerarySearch"/&gt;
 *     &lt;enumeration value="SectionProducers_PreferredProducers"/&gt;
 *     &lt;enumeration value="SectionProducers_RequiredItinerarySearch"/&gt;
 *     &lt;enumeration value="MaximumNoOfChanges"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeListNameType")
@XmlEnum
public enum CodeListNameType {


    /**
     * PriceGroup GeneralPrice
     * 
     */
    @XmlEnumValue("PriceGroup_GeneralPrice")
    PRICE_GROUP_GENERAL_PRICE("PriceGroup_GeneralPrice"),

    /**
     * Price level
     * 
     */
    @XmlEnumValue("PriceLevel")
    PRICE_LEVEL("PriceLevel"),

    /**
     * Section Producers excludable from tinerarySearch. Should be sent in ExcludedSegmentProducerCodes in the operation getTimetable.
     * 
     */
    @XmlEnumValue("SectionProducer_ExcludableItinerarySearch")
    SECTION_PRODUCER_EXCLUDABLE_ITINERARY_SEARCH("SectionProducer_ExcludableItinerarySearch"),

    /**
     * Section Producers preferred producers. Should be sent in PreferredSegmentProducerCodes in the operation getTimetable.
     * 
     */
    @XmlEnumValue("SectionProducers_PreferredProducers")
    SECTION_PRODUCERS_PREFERRED_PRODUCERS("SectionProducers_PreferredProducers"),

    /**
     * Section producers required for itinerary search. Should be sent in RequiredSegmentProducerCodes in the operation getTimetable.
     * 
     */
    @XmlEnumValue("SectionProducers_RequiredItinerarySearch")
    SECTION_PRODUCERS_REQUIRED_ITINERARY_SEARCH("SectionProducers_RequiredItinerarySearch"),

    /**
     * Maximum No Of Changes.Should be sent in MaximumNumberOfChanges in the operation getTimetable.
     * 
     */
    @XmlEnumValue("MaximumNoOfChanges")
    MAXIMUM_NO_OF_CHANGES("MaximumNoOfChanges");
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
