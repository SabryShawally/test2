
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountCategoryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountCategoryTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiscountCategoryTypeType")
@XmlEnum
public enum DiscountCategoryTypeType {


    /**
     * A standard discount.
     * 
     */
    STANDARD,

    /**
     * The discount is related to a customer.
     * 
     */
    CUSTOMER;

    public String value() {
        return name();
    }

    public static DiscountCategoryTypeType fromValue(String v) {
        return valueOf(v);
    }

}
