
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidCodeSpecifications" type="{http://petra.linkon.se/timetable/data/v2_7}ValidCodeSpecificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validCodeSpecifications"
})
@XmlRootElement(name = "GetValidCodesRequest")
public class GetValidCodesRequest
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidCodeSpecifications")
    protected ValidCodeSpecificationsType validCodeSpecifications;

    /**
     * Gets the value of the validCodeSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link ValidCodeSpecificationsType }
     *     
     */
    public ValidCodeSpecificationsType getValidCodeSpecifications() {
        return validCodeSpecifications;
    }

    /**
     * Sets the value of the validCodeSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidCodeSpecificationsType }
     *     
     */
    public void setValidCodeSpecifications(ValidCodeSpecificationsType value) {
        this.validCodeSpecifications = value;
    }

    public boolean isSetValidCodeSpecifications() {
        return (this.validCodeSpecifications!= null);
    }

}
