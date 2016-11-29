
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Group code for detailed seat availability.
 * 
 * 					Examples of detailed seat availability groups are:
 * 					1 kl, 2 kl, Sov wc 1-2, etc.
 * 				
 * 
 * <p>Java class for SeatAvailabilityGroupDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAvailabilityGroupDetailType"&gt;
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
@XmlType(name = "SeatAvailabilityGroupDetailType")
public class SeatAvailabilityGroupDetailType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
