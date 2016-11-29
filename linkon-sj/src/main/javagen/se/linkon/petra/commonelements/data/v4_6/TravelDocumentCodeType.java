
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDocumentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelDocumentCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelDocumentCodeType")
@XmlEnum
public enum TravelDocumentCodeType {


    /**
     * 
     * 						Fare + reservation, the system decides the partitioning.
     * 					
     * 
     */
    B,

    /**
     * 
     * 						Fare only.
     * 					
     * 
     */
    F,

    /**
     * 
     * 						Joint Document (fare + reservation).
     * 					
     * 
     */
    G,

    /**
     * 
     * 						Reservation only.
     * 					
     * 
     */
    P,

    /**
     * 
     * 						Separate document (fare + reservation).
     * 					
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static TravelDocumentCodeType fromValue(String v) {
        return valueOf(v);
    }

}
