
package se.linkon.petra.order.orderstorage.settravellerinformation.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains frequent traveller (PETRA-customer)
 * 				information. A frequent traveller is known by its traveller customer
 * 				id (RENKNDNR) in combination with the traveller number (RENNR).
 * 			
 * 
 * <p>Java class for FrequentTravellerSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TravellerCustomerId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerSpecificationType", propOrder = {
    "travellerCustomerId"
})
public class FrequentTravellerSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravellerCustomerId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String travellerCustomerId;

    /**
     * Gets the value of the travellerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerCustomerId() {
        return travellerCustomerId;
    }

    /**
     * Sets the value of the travellerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerCustomerId(String value) {
        this.travellerCustomerId = value;
    }

    public boolean isSetTravellerCustomerId() {
        return (this.travellerCustomerId!= null);
    }

}
