
package se.linkon.petra.location.validcodes.data.v1_5;

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
 *         &lt;element name="ValidCodeDescriptions" type="{http://petra.linkon.se/location/validcodes/data/v1_5}ValidCodeDescriptionsType" minOccurs="0"/&gt;
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
    "validCodeDescriptions"
})
@XmlRootElement(name = "GetValidCodesResponse")
public class GetValidCodesResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ValidCodeDescriptions")
    protected ValidCodeDescriptionsType validCodeDescriptions;

    /**
     * Gets the value of the validCodeDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidCodeDescriptionsType }
     *     
     */
    public ValidCodeDescriptionsType getValidCodeDescriptions() {
        return validCodeDescriptions;
    }

    /**
     * Sets the value of the validCodeDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidCodeDescriptionsType }
     *     
     */
    public void setValidCodeDescriptions(ValidCodeDescriptionsType value) {
        this.validCodeDescriptions = value;
    }

    public boolean isSetValidCodeDescriptions() {
        return (this.validCodeDescriptions!= null);
    }

}
