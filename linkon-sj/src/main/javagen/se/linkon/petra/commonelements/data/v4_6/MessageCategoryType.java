
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="2"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="EK"/&gt;
 *     &lt;enumeration value="LO"/&gt;
 *     &lt;enumeration value="MB"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="OD"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageCategoryType")
@XmlEnum
public enum MessageCategoryType {


    /**
     * Confirmation message
     * 
     */
    BE,

    /**
     * Deviation message
     * 
     */
    DM,

    /**
     * Electronical receipt
     * 
     */
    EK,

    /**
     * Order service alarm message
     * 
     */
    LO,

    /**
     * Mobile ticket
     * 
     */
    MB,

    /**
     * Customer message
     * 
     */
    MK,

    /**
     * Undefined
     * 
     */
    OD,

    /**
     * Passenger list
     * 
     */
    PL,

    /**
     * Notification when timetable is changed.
     * 
     */
    TF;

    public String value() {
        return name();
    }

    public static MessageCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
