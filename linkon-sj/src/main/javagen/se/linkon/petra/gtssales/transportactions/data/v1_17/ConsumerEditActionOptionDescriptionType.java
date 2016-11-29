
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerEditActionOptionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerEditActionOptionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditActionOptionDescriptions" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionOptionDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerEditActionOptionDescriptionType", propOrder = {
    "editActionOptionDescriptions"
})
public class ConsumerEditActionOptionDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionOptionDescriptions")
    protected EditActionOptionDescriptionsType editActionOptionDescriptions;

    /**
     * Gets the value of the editActionOptionDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EditActionOptionDescriptionsType }
     *     
     */
    public EditActionOptionDescriptionsType getEditActionOptionDescriptions() {
        return editActionOptionDescriptions;
    }

    /**
     * Sets the value of the editActionOptionDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditActionOptionDescriptionsType }
     *     
     */
    public void setEditActionOptionDescriptions(EditActionOptionDescriptionsType value) {
        this.editActionOptionDescriptions = value;
    }

    public boolean isSetEditActionOptionDescriptions() {
        return (this.editActionOptionDescriptions!= null);
    }

}
