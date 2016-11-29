
package se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAdressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAdressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerStreet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerZip" minOccurs="0"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}CustomerCity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAdressType", propOrder = {
    "customerStreet",
    "customerZip",
    "customerCity"
})
public class CustomerAdressType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CustomerStreet", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerStreet;
    @XmlElement(name = "CustomerZip", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerZip;
    @XmlElement(name = "CustomerCity", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String customerCity;

    /**
     * Gets the value of the customerStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStreet() {
        return customerStreet;
    }

    /**
     * Sets the value of the customerStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStreet(String value) {
        this.customerStreet = value;
    }

    public boolean isSetCustomerStreet() {
        return (this.customerStreet!= null);
    }

    /**
     * Gets the value of the customerZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerZip() {
        return customerZip;
    }

    /**
     * Sets the value of the customerZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerZip(String value) {
        this.customerZip = value;
    }

    public boolean isSetCustomerZip() {
        return (this.customerZip!= null);
    }

    /**
     * Gets the value of the customerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    public boolean isSetCustomerCity() {
        return (this.customerCity!= null);
    }

}
