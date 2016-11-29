
package se.linkon.petra.order.orderstorage.orderreferences.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.orderreferences.data.v1_7.PayerType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.InformationDescriptionsType;


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
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/orderreferences/data/v1_7}Payer" minOccurs="0"/&gt;
 *         &lt;element name="InformationDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}InformationDescriptionsType" minOccurs="0"/&gt;
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
    "payer",
    "informationDescriptions"
})
@XmlRootElement(name = "SetOrderReferencesResponse")
public class SetOrderReferencesResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Payer", namespace = "http://petra.linkon.se/order/ordercommon/response/orderreferences/data/v1_7")
    protected PayerType payer;
    @XmlElement(name = "InformationDescriptions")
    protected InformationDescriptionsType informationDescriptions;

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link PayerType }
     *     
     */
    public PayerType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerType }
     *     
     */
    public void setPayer(PayerType value) {
        this.payer = value;
    }

    public boolean isSetPayer() {
        return (this.payer!= null);
    }

    /**
     * Gets the value of the informationDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link InformationDescriptionsType }
     *     
     */
    public InformationDescriptionsType getInformationDescriptions() {
        return informationDescriptions;
    }

    /**
     * Sets the value of the informationDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationDescriptionsType }
     *     
     */
    public void setInformationDescriptions(InformationDescriptionsType value) {
        this.informationDescriptions = value;
    }

    public boolean isSetInformationDescriptions() {
        return (this.informationDescriptions!= null);
    }

}
