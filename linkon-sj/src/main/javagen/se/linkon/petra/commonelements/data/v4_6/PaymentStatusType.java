
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value=""/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusType")
@XmlEnum
public enum PaymentStatusType {


    /**
     * 
     * 						Paid (Betald)
     * 					
     * 
     */
    B("B"),

    /**
     * 
     * 						Partially paid (Delbetald)
     * 					
     * 
     */
    D("D"),

    /**
     * 
     * 						Forfeit (Foerverkad)
     * 					
     * 
     */
    F("F"),

    /**
     * 
     * 						Credited (Krediterad)
     * 					
     * 
     */
    K("K"),

    /**
     * 
     * 						Cancelled (Makulerad)
     * 					
     * 
     */
    M("M"),

    /**
     * 
     * 						Unpaid (Obetald)
     * 					
     * 
     */
    O("O"),

    /**
     * 
     * 						Unpaid (Obetald)
     * 					
     * 
     */
    @XmlEnumValue("")
    BLANK(""),

    /**
     * 
     * 						Exchanged (Byte/ombokning)
     * 					
     * 
     */
    X("X"),

    /**
     * 
     * 						Voucher (Vaerdebevis)
     * 					
     * 
     */
    V("V");
    private final String value;

    PaymentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusType fromValue(String v) {
        for (PaymentStatusType c: PaymentStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
