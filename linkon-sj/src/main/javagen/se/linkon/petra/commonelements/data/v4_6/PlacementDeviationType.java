
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementDeviationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacementDeviationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlacementDeviationType")
@XmlEnum
public enum PlacementDeviationType {


    /**
     * 
     * 						Deviation within carriage in booking.
     * 						Corresponds to constant VTERM.V_P_CHA_AVVIKELSE_1VAGN
     * 					
     * 
     */
    @XmlEnumValue("1")
    AVVIKELSE_1VAGN("1"),

    /**
     * 
     * 						Carriage deviation in booking.
     * 						Corresponds to constant VTERM.V_P_CHA_AVVIKELSE_2VAGN
     * 					
     * 
     */
    @XmlEnumValue("2")
    AVVIKELSE_2VAGN("2");
    private final String value;

    PlacementDeviationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementDeviationType fromValue(String v) {
        for (PlacementDeviationType c: PlacementDeviationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
