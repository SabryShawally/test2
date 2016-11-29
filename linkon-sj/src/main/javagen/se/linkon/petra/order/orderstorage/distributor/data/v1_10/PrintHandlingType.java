
package se.linkon.petra.order.orderstorage.distributor.data.v1_10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintHandlingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrintHandlingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRINTABLE"/&gt;
 *     &lt;enumeration value="NOTPRINTABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrintHandlingType")
@XmlEnum
public enum PrintHandlingType {


    /**
     * Not locked
     * 
     */
    PRINTABLE,

    /**
     * Locked
     * 
     */
    NOTPRINTABLE;

    public String value() {
        return name();
    }

    public static PrintHandlingType fromValue(String v) {
        return valueOf(v);
    }

}
