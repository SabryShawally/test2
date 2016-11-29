
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value=" "/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SexType")
@XmlEnum
public enum SexType {


    /**
     * 
     * 						Male.
     * 					
     * 
     */
    M("M"),

    /**
     * 
     * 						Female.
     * 					
     * 
     */
    F("F"),

    /**
     * 
     * 						Unspecified/Unknown.
     * 					
     * 
     */
    U("U"),

    /**
     * 
     * 						Unspecified/Unknown.
     * 					
     * 
     */
    @XmlEnumValue(" ")
    BLANK(" ");
    private final String value;

    SexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SexType fromValue(String v) {
        for (SexType c: SexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
