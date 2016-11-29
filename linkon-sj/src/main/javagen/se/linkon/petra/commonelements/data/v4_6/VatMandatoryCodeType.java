
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatMandatoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VatMandatoryCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="L1"/&gt;
 *     &lt;enumeration value="L2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VatMandatoryCodeType")
@XmlEnum
public enum VatMandatoryCodeType {


    /**
     * 
     * 						Not subject to VAT.
     * 					
     * 
     */
    EM("EM"),

    /**
     * 
     * 						Add tax rate 1.
     * 					
     * 
     */
    @XmlEnumValue("L1")
    L_1("L1"),

    /**
     * 
     * 						Add tax rate 2.
     * 					
     * 
     */
    @XmlEnumValue("L2")
    L_2("L2");
    private final String value;

    VatMandatoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VatMandatoryCodeType fromValue(String v) {
        for (VatMandatoryCodeType c: VatMandatoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
