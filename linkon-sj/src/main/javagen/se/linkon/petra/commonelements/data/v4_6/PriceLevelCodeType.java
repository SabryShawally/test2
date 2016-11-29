
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Price level code.
 * 					A price level describes different salable variants of a certain
 * 					booking class. In a sense it describes not only the comfortability
 * 					but also what you get out, in terms of quality, of a service.
 * 					One example are the two price levels 1 class food onboard and 1 class
 * 					are both of the same booking class; FK.
 * 
 * 					Corresponding PETRA-term: PRSNV
 * 				
 * 
 * <p>Java class for PriceLevelCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceLevelCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;StringCodeType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceLevelCodeType")
public class PriceLevelCodeType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
