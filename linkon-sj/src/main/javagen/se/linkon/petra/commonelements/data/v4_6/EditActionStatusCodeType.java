
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EditActionStatusCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EditActionStatusCodeType")
@XmlEnum
public enum EditActionStatusCodeType {


    /**
     * 
     * 	          Cancelled (system-initiated, order not paid)
     * 	        
     * 
     */
    AN,

    /**
     * 
     * 	          Born
     * 	        
     * 
     */
    FO,

    /**
     * 
     * 	          Ready
     * 	        
     * 
     */
    KL;

    public String value() {
        return name();
    }

    public static EditActionStatusCodeType fromValue(String v) {
        return valueOf(v);
    }

}
