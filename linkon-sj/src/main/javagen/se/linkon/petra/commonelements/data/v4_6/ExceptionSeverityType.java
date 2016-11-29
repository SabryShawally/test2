
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionSeverityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionSeverityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFORMATION"/&gt;
 *     &lt;enumeration value="INFORMATION_NO_UPDATE"/&gt;
 *     &lt;enumeration value="WARNING"/&gt;
 *     &lt;enumeration value="WARNING_NO_UPDATE"/&gt;
 *     &lt;enumeration value="SEVERE_ERROR"/&gt;
 *     &lt;enumeration value="SEVERE_ERROR_NO_UPDATE"/&gt;
 *     &lt;enumeration value="FATAL_ERROR"/&gt;
 *     &lt;enumeration value="FATAL_ERROR_NO_UPDATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionSeverityType")
@XmlEnum
public enum ExceptionSeverityType {

    INFORMATION,
    INFORMATION_NO_UPDATE,
    WARNING,
    WARNING_NO_UPDATE,
    SEVERE_ERROR,
    SEVERE_ERROR_NO_UPDATE,
    FATAL_ERROR,
    FATAL_ERROR_NO_UPDATE;

    public String value() {
        return name();
    }

    public static ExceptionSeverityType fromValue(String v) {
        return valueOf(v);
    }

}
