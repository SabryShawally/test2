
package se.linkon.petra.commonelements.data.v4_6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceGroupStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceGroupStatusCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceGroupStatusCodeType")
@XmlEnum
public enum PriceGroupStatusCodeType {


    /**
     * 
     * 						Prisfraaga okay
     * 					
     * 
     */
    OK,

    /**
     * 
     *         				Prisfraaga ej okay
     *         			
     * 
     */
    NOK;

    public String value() {
        return name();
    }

    public static PriceGroupStatusCodeType fromValue(String v) {
        return valueOf(v);
    }

}
