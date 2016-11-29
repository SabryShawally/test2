
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacementDirectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value=" "/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlacementDirectionType")
@XmlEnum
public enum PlacementDirectionType {


    /**
     * 
     * 						undefined
     * 					
     * 
     */
    @XmlEnumValue(" ")
    BLANK(" "),

    /**
     * 
     * 						Backward placement
     * 					
     * 
     */
    B("B"),

    /**
     * 
     * 						Forward placement
     * 					
     * 
     */
    F("F");
    private final String value;

    PlacementDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementDirectionType fromValue(String v) {
        for (PlacementDirectionType c: PlacementDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
