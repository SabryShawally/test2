
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * 
 *           The ticket distribution code.
 * 
 *           Corresponding PETRA-term: BJTDISTKOD
 *         
 * 
 * <p>Java class for TicketDistributionCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDistributionCodeType"&gt;
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
@XmlType(name = "TicketDistributionCodeType")
public class TicketDistributionCodeType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
