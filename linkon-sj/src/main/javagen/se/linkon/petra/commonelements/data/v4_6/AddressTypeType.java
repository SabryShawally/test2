
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeType")
@XmlEnum
public enum AddressTypeType {


    /**
     * 
     * 						Official address (Officiell adress).
     * 					
     * 
     */
    O,

    /**
     * 
     * 						Delivery address (Leveransadress).
     * 					
     * 
     */
    L,

    /**
     * 
     * 						Communication address (Kommunikationsadress).
     * 					
     * 
     */
    C,

    /**
     * 
     * 						Temporary address (Tillfalligadress).
     * 					
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static AddressTypeType fromValue(String v) {
        return valueOf(v);
    }

}
