
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A card system is used to allow different payment methods within a particular salespoint category.
 *                         
 *                         Possible values:
 *                         Blank: The salesunit has normal payment methods and rules for the particular salespoint category.
 *                         **   : The salespoint selection code is not important. 
 *                         XX   : The salespoint selection code (according to table TMSST.KKORTSYS)
 *                         
 *                         Example of XX:
 *                         ES,AR,AW,EL,ES,RF,ES,EX,EB,EF,ES,ES,ES,EX
 * 
 *                 Corresponding PETRA-term: KKORTSYS.
 *             
 * 
 * <p>Java class for CardSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSystemType"&gt;
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
@XmlType(name = "CardSystemType")
public class CardSystemType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
