
package se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17;

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
 *         &lt;element name="AlternativeRelationsDescriptions" type="{http://petra.linkon.se/gtssales/multiridealternativerelations/data/v1_17}AlternativeRelationsDescriptionsType" minOccurs="0"/&gt;
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
    "alternativeRelationsDescriptions"
})
@XmlRootElement(name = "MultiRideAlternativeRelationsDescription")
public class MultiRideAlternativeRelationsDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AlternativeRelationsDescriptions")
    protected AlternativeRelationsDescriptionsType alternativeRelationsDescriptions;

    /**
     * Gets the value of the alternativeRelationsDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeRelationsDescriptionsType }
     *     
     */
    public AlternativeRelationsDescriptionsType getAlternativeRelationsDescriptions() {
        return alternativeRelationsDescriptions;
    }

    /**
     * Sets the value of the alternativeRelationsDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeRelationsDescriptionsType }
     *     
     */
    public void setAlternativeRelationsDescriptions(AlternativeRelationsDescriptionsType value) {
        this.alternativeRelationsDescriptions = value;
    }

    public boolean isSetAlternativeRelationsDescriptions() {
        return (this.alternativeRelationsDescriptions!= null);
    }

}
