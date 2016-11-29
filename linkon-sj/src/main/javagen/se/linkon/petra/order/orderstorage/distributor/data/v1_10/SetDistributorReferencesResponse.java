
package se.linkon.petra.order.orderstorage.distributor.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7.TravelAgentInformationType;


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
 *         &lt;element ref="{http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7}TravelAgentInformation" minOccurs="0"/&gt;
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
    "travelAgentInformation"
})
@XmlRootElement(name = "SetDistributorReferencesResponse")
public class SetDistributorReferencesResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelAgentInformation", namespace = "http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7")
    protected TravelAgentInformationType travelAgentInformation;

    /**
     * Gets the value of the travelAgentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentInformationType }
     *     
     */
    public TravelAgentInformationType getTravelAgentInformation() {
        return travelAgentInformation;
    }

    /**
     * Sets the value of the travelAgentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentInformationType }
     *     
     */
    public void setTravelAgentInformation(TravelAgentInformationType value) {
        this.travelAgentInformation = value;
    }

    public boolean isSetTravelAgentInformation() {
        return (this.travelAgentInformation!= null);
    }

}
