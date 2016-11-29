
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmokingDepartmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmokingDepartmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value=""/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmokingDepartmentType")
@XmlEnum
public enum SmokingDepartmentType {


    /**
     * 
     * 						Implicit no smoking allowed.
     * 					
     * 
     */
    @XmlEnumValue("")
    BLANK(""),

    /**
     * 
     * 						No smoking allowed.
     * 					
     * 
     */
    IR("IR"),

    /**
     * 
     * 						Smoking allowed.
     * 					
     * 
     */
    R("R");
    private final String value;

    SmokingDepartmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmokingDepartmentType fromValue(String v) {
        for (SmokingDepartmentType c: SmokingDepartmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
