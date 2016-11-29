
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusType")
@XmlEnum
public enum AccountStatusType {


    /**
     * 
     * 						Klar
     * 					
     * 
     */
    KL,

    /**
     * 
     *         				Spaerrad
     *         			
     * 
     */
    SP;

    public String value() {
        return name();
    }

    public static AccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
