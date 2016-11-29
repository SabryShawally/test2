
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product designation of a mean of conveyance that describes
 * its look, comfort and service in a general way.
 * 
 * ProductCode should be sent in as it is returned from the method getTimetable.  
 * 
 * Please note that a blank value ('') is also a valid code and should be sent. The meaning of the blank code is "Other".
 * 
 * Corresponding PETRA-term: PRDKOD
 * 				
 * 
 * <p>Java class for ProductCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCodeType"&gt;
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
@XmlType(name = "ProductCodeType")
public class ProductCodeType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
