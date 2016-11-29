
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         ATKPKOD
 *                         Indicates possible limitations for refunds.
 *                         
 *                         Possible values 
 *                         blankt  Not possible
 *                         EJ  Not allowed
 *                         TI  Allowed 
 *                         IK  Allowed within the same firm group 
 *                         DB  Allowed, particular control is mandatory. 
 *                         TK  Allowed, credit card coupling is mandatory. 
 *                         TS  Allowed if the customer is not blocked
 *                         TN  Refund allowed if net value is >=  0
 *                     
 * 
 * <p>Java class for CreditRuleCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRuleCodeType"&gt;
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
@XmlType(name = "CreditRuleCodeType")
public class CreditRuleCodeType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
