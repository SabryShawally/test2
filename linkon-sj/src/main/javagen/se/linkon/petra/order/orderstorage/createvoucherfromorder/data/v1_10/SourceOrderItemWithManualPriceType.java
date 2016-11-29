
package se.linkon.petra.order.orderstorage.createvoucherfromorder.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.Money;


/**
 * <p>Java class for SourceOrderItemWithManualPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceOrderItemWithManualPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="VoucherAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}Money"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}RegistrationNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceOrderItemWithManualPriceType", propOrder = {
    "orderItemId",
    "voucherAmount",
    "registrationNumber"
})
public class SourceOrderItemWithManualPriceType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "VoucherAmount", required = true)
    protected Money voucherAmount;
    @XmlElement(name = "RegistrationNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected String registrationNumber;

    /**
     * Gets the value of the orderItemId property.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return true;
    }

    /**
     * Gets the value of the voucherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getVoucherAmount() {
        return voucherAmount;
    }

    /**
     * Sets the value of the voucherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setVoucherAmount(Money value) {
        this.voucherAmount = value;
    }

    public boolean isSetVoucherAmount() {
        return (this.voucherAmount!= null);
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    public boolean isSetRegistrationNumber() {
        return (this.registrationNumber!= null);
    }

}
