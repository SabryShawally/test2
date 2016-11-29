
package se.linkon.petra.order.ordercommon.response.shared.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformationDescription" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}InformationDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationDescriptionsType", propOrder = {
    "informationDescription"
})
public class InformationDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "InformationDescription", required = true)
    protected InformationDescriptionType informationDescription;

    /**
     * Gets the value of the informationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link InformationDescriptionType }
     *     
     */
    public InformationDescriptionType getInformationDescription() {
        return informationDescription;
    }

    /**
     * Sets the value of the informationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationDescriptionType }
     *     
     */
    public void setInformationDescription(InformationDescriptionType value) {
        this.informationDescription = value;
    }

    public boolean isSetInformationDescription() {
        return (this.informationDescription!= null);
    }

}
