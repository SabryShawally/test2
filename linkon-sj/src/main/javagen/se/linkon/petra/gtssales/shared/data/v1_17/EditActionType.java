
package se.linkon.petra.gtssales.shared.data.v1_17;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EditActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EditActionType")
@XmlEnum
public enum EditActionType {


    /**
     * Add action.
     * 
     */
    @XmlEnumValue("A")
    ADD("A"),

    /**
     * Change-from-something action.
     * 
     */
    @XmlEnumValue("CF")
    CHANGE_FROM("CF"),

    /**
     * Change-to-something action.
     * 
     */
    @XmlEnumValue("CT")
    CHANGE_TO("CT"),

    /**
     * Delete action.
     * 
     */
    @XmlEnumValue("D")
    DELETE("D"),

    /**
     * Locked, cannot be edited.
     * 
     */
    @XmlEnumValue("L")
    LOCKED("L");
    private final String value;

    EditActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EditActionType fromValue(String v) {
        for (EditActionType c: EditActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
