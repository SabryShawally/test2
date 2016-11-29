
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingDeviationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingDeviationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingDeviationType")
@XmlEnum
public enum BookingDeviationType {


    /**
     * 
     * 						Placement property deviation in booking.
     * 						Corresponds to constant VTERM.V_P_CHA_AVVIKELSE_PLSEGS
     * 					
     * 
     */
    @XmlEnumValue("P")
    AVVIKELSE_PLEGS("P"),

    /**
     * 
     * 						Smoking compartment deviation in booking.
     * 						Corresponds to constant VTERM.V_P_CHA_AVVIKELSE_ROK
     * 					
     * 
     */
    @XmlEnumValue("R")
    AVVIKELSE_ROK("R"),

    /**
     * 
     * 						Train deviation in booking.
     * 						Corresponds to constant VTERM.V_P_CHA_AVVIKELSE_TAG
     * 					
     * 
     */
    @XmlEnumValue("T")
    AVVIKELSE_TAG("T");
    private final String value;

    BookingDeviationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingDeviationType fromValue(String v) {
        for (BookingDeviationType c: BookingDeviationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
