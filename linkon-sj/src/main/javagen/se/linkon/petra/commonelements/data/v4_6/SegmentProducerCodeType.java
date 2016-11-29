
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Identification of the owner of the transport segment.
 * 
 * 				Corresponding PETRA-term: STRPRCNR
 * 			
 * 
 * <p>Java class for SegmentProducerCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentProducerCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://petra.linkon.se/commonelements/data/v4_6&gt;NonNegativeIntCodeType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentProducerCodeType")
public class SegmentProducerCodeType
    extends NonNegativeIntCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
