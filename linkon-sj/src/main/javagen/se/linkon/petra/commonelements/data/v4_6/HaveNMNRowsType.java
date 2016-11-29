
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HaveNMNRowsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HaveNMNRowsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HaveNMNRowsType")
@XmlEnum
public enum HaveNMNRowsType {


    /**
     * 
     * 						Yes.
     * 					
     * 
     */
    J,

    /**
     * 
     * 						No.
     * 					
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static HaveNMNRowsType fromValue(String v) {
        return valueOf(v);
    }

}
