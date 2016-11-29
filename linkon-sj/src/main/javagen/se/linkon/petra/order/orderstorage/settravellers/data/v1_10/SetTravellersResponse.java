
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.shared.data.v1_7.InformationDescriptionsType;
import se.linkon.petra.order.ordercommon.response.travellers.data.v1_7.TravellersResponseType;


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
 *         &lt;element name="InformationDescriptions" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}InformationDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7}TravellersResponse" minOccurs="0"/&gt;
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
    "informationDescriptions",
    "travellersResponse"
})
@XmlRootElement(name = "SetTravellersResponse")
public class SetTravellersResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "InformationDescriptions")
    protected InformationDescriptionsType informationDescriptions;
    @XmlElement(name = "TravellersResponse", namespace = "http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7")
    protected TravellersResponseType travellersResponse;

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

    /**
     * 
     * 							Only present when traveller updates have
     * 							occurred.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link TravellersResponseType }
     *     
     */
    public TravellersResponseType getTravellersResponse() {
        return travellersResponse;
    }

    /**
     * Sets the value of the travellersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellersResponseType }
     *     
     */
    public void setTravellersResponse(TravellersResponseType value) {
        this.travellersResponse = value;
    }

    public boolean isSetTravellersResponse() {
        return (this.travellersResponse!= null);
    }

}
