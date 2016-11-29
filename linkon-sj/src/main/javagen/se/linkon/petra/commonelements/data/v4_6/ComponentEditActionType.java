
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentEditActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponentEditActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComponentEditActionType")
@XmlEnum
public enum ComponentEditActionType {


    /**
     * 
     * 						Add
     * 					
     * 
     */
    A,

    /**
     * 
     * 						Change from
     * 					
     * 
     */
    CF,

    /**
     * 
     * 						Change to
     * 					
     * 
     */
    CT,

    /**
     * 
     *                  Delete
     *               
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static ComponentEditActionType fromValue(String v) {
        return valueOf(v);
    }

}
