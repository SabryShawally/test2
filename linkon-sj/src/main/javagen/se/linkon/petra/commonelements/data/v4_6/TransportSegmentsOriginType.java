
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportSegmentsOriginType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportSegmentsOriginType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportSegmentsOriginType")
@XmlEnum
public enum TransportSegmentsOriginType {


    /**
     * 
     * 						Segment originates from timetable search.
     * 					
     * 
     */
    T,

    /**
     * Segment originates from timetable search with via search.
     * 
     */
    V,

    /**
     * Segment does not originate from timetable search.
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static TransportSegmentsOriginType fromValue(String v) {
        return valueOf(v);
    }

}
