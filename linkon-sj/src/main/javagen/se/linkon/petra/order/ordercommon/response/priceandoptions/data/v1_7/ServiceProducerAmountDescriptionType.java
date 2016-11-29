
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;


/**
 * 
 * 				Principal producer for the order item. 
 * 			
 * 
 * <p>Java class for ServiceProducerAmountDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProducerAmountDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceProducerCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceProducerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceProducerAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProducerAmountDescriptionType", propOrder = {
    "serviceProducerCode",
    "serviceProducerName",
    "serviceProducerAmount"
})
public class ServiceProducerAmountDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ServiceProducerCode")
    protected int serviceProducerCode;
    @XmlElement(name = "ServiceProducerName", required = true)
    protected String serviceProducerName;
    @XmlElement(name = "ServiceProducerAmount", required = true)
    protected Money serviceProducerAmount;

    /**
     * Gets the value of the serviceProducerCode property.
     * 
     */
    public int getServiceProducerCode() {
        return serviceProducerCode;
    }

    /**
     * Sets the value of the serviceProducerCode property.
     * 
     */
    public void setServiceProducerCode(int value) {
        this.serviceProducerCode = value;
    }

    public boolean isSetServiceProducerCode() {
        return true;
    }

    /**
     * Gets the value of the serviceProducerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProducerName() {
        return serviceProducerName;
    }

    /**
     * Sets the value of the serviceProducerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProducerName(String value) {
        this.serviceProducerName = value;
    }

    public boolean isSetServiceProducerName() {
        return (this.serviceProducerName!= null);
    }

    /**
     * Gets the value of the serviceProducerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getServiceProducerAmount() {
        return serviceProducerAmount;
    }

    /**
     * Sets the value of the serviceProducerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setServiceProducerAmount(Money value) {
        this.serviceProducerAmount = value;
    }

    public boolean isSetServiceProducerAmount() {
        return (this.serviceProducerAmount!= null);
    }

}
