
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

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
 *         &lt;element name="PassengerCategoriesInformation" type="{http://petra.linkon.se/gtssales/passengercategories/data/v1_17}PassengerCategoriesInformationType" minOccurs="0"/&gt;
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
    "passengerCategoriesInformation"
})
@XmlRootElement(name = "GetPassengerCategoriesResponse")
public class GetPassengerCategoriesResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategoriesInformation")
    protected PassengerCategoriesInformationType passengerCategoriesInformation;

    /**
     * Gets the value of the passengerCategoriesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCategoriesInformationType }
     *     
     */
    public PassengerCategoriesInformationType getPassengerCategoriesInformation() {
        return passengerCategoriesInformation;
    }

    /**
     * Sets the value of the passengerCategoriesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCategoriesInformationType }
     *     
     */
    public void setPassengerCategoriesInformation(PassengerCategoriesInformationType value) {
        this.passengerCategoriesInformation = value;
    }

    public boolean isSetPassengerCategoriesInformation() {
        return (this.passengerCategoriesInformation!= null);
    }

}
