
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingRuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EJBO"/&gt;
 *     &lt;enumeration value="OBLI"/&gt;
 *     &lt;enumeration value="ODEF"/&gt;
 *     &lt;enumeration value="REKO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingRuleType")
@XmlEnum
public enum BookingRuleType {


    /**
     * No seat reservation
     * 
     */
    EJBO,

    /**
     * Seat reservation mandatory
     * 
     */
    OBLI,

    /**
     * Seat reservation undefined
     * 
     */
    ODEF,

    /**
     * Seat reservation recommended
     * 
     */
    REKO;

    public String value() {
        return name();
    }

    public static BookingRuleType fromValue(String v) {
        return valueOf(v);
    }

}
