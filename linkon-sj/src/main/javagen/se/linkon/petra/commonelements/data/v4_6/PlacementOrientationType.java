
package se.linkon.petra.commonelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies the relative orientation of the placement.
 * 				Range of values include:
 * 				OD: undefined (non-specific)
 * 				F : windows
 * 				G : aisle
 * 				ML: between
 * 				OV: above
 * 				UN: under
 * 
 * 				Corresponding PETRA-term: PLSPLAC
 * 			
 * 
 * <p>Java class for PlacementOrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementOrientationType"&gt;
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
@XmlType(name = "PlacementOrientationType")
public class PlacementOrientationType
    extends StringCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;

}
