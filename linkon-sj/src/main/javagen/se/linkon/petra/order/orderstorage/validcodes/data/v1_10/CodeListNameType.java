
package se.linkon.petra.order.orderstorage.validcodes.data.v1_10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeListNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CardType"/&gt;
 *     &lt;enumeration value="ReasonCode_Cancellation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeListNameType")
@XmlEnum
public enum CodeListNameType {


    /**
     * 
     *                     Kontokort. Korttyp.
     *                     
     *                     Corresponding PETRA-term: KORTTYP
     * 					
     * 
     */
    @XmlEnumValue("CardType")
    CARD_TYPE("CardType"),

    /**
     * 
     *                     AVBORSAK
     *                     
     *                     Corresponding PETRA-term: KORTTYP
     *                     
     * 
     */
    @XmlEnumValue("ReasonCode_Cancellation")
    REASON_CODE_CANCELLATION("ReasonCode_Cancellation");
    private final String value;

    CodeListNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeListNameType fromValue(String v) {
        for (CodeListNameType c: CodeListNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
