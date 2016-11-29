
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerAgeRequiredCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerAgeRequiredCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQUIRED"/&gt;
 *     &lt;enumeration value="NOT_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerAgeRequiredCodeType")
@XmlEnum
public enum PassengerAgeRequiredCodeType {


    /**
     * Age is required.
     * 
     */
    REQUIRED,

    /**
     * Age is not required.
     * 
     */
    NOT_REQUIRED;

    public String value() {
        return name();
    }

    public static PassengerAgeRequiredCodeType fromValue(String v) {
        return valueOf(v);
    }

}
