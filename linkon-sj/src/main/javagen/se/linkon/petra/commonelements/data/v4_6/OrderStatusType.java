
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FV"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="UH"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusType")
@XmlEnum
public enum OrderStatusType {


    /**
     * 
     * 						Paid
     * 					
     * 
     */
    B,

    /**
     * 
     * 						Born
     * 					
     * 
     */
    FO,

    /**
     * 
     * 						Forfeit
     * 					
     * 
     */
    FV,

    /**
     * 
     * 						Ready
     * 					
     * 
     */
    KL,

    /**
     * 
     * 						Collected (by customer)
     * 					
     * 
     */
    UH,

    /**
     * 
     *                         Partially paid
     *                     
     * 
     */
    DE;

    public String value() {
        return name();
    }

    public static OrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
