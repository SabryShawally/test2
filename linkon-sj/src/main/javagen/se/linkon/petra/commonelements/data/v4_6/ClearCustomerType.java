
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearCustomerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearCustomerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value=""/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearCustomerType")
@XmlEnum
public enum ClearCustomerType {

    J("J"),
    N("N"),
    @XmlEnumValue("")
    BLANK("");
    private final String value;

    ClearCustomerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClearCustomerType fromValue(String v) {
        for (ClearCustomerType c: ClearCustomerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
