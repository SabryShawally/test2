
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderItemStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="AV"/&gt;
 *     &lt;enumeration value="BK"/&gt;
 *     &lt;enumeration value="EK"/&gt;
 *     &lt;enumeration value="FL"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderItemStatusType")
@XmlEnum
public enum OrderItemStatusType {


    /**
     * 
     * 						Cancelled (system-initiated, order not paid)
     * 					
     * 
     */
    AN,

    /**
     * 
     * 						Refunded (Special cases)
     * 					
     * 
     */
    AS,

    /**
     * 
     * 						Refunded
     * 					
     * 
     */
    AT,

    /**
     * 
     * 						Cancelled (customer-initiated, paid order)
     * 					
     * 
     */
    AV,

    /**
     * 
     * 						Accounted
     * 					
     * 
     */
    BK,

    /**
     * 
     * 						Not completed
     * 					
     * 
     */
    EK,

    /**
     * 
     * 						Moved
     * 					
     * 
     */
    FL,

    /**
     * 
     * 						Born (New)
     * 					
     * 
     */
    FO,

    /**
     * 
     * 						Ready
     * 					
     * 
     */
    KL;

    public String value() {
        return name();
    }

    public static OrderItemStatusType fromValue(String v) {
        return valueOf(v);
    }

}
