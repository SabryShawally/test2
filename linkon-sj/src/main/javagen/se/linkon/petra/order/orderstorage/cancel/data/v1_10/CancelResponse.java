
package se.linkon.petra.order.orderstorage.cancel.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


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
 *         &lt;element name="CancellationReference" type="{http://petra.linkon.se/commonelements/data/v4_6}ReferenceNumberType" minOccurs="0"/&gt;
 *         &lt;element name="MandatoryRecalculationWarning" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmount" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType" minOccurs="0"/&gt;
 *         &lt;element name="CreditPoints" type="{http://petra.linkon.se/commonelements/data/v4_6}CreditPointsType"/&gt;
 *         &lt;element name="CancelItemList" type="{http://petra.linkon.se/order/orderstorage/cancel/data/v1_10}CancelItemListType"/&gt;
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
    "cancellationReference",
    "mandatoryRecalculationWarning",
    "creditAmount",
    "creditPoints",
    "cancelItemList"
})
@XmlRootElement(name = "CancelResponse")
public class CancelResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CancellationReference")
    protected String cancellationReference;
    @XmlElement(name = "MandatoryRecalculationWarning")
    protected EmptyType mandatoryRecalculationWarning;
    @XmlElement(name = "CreditAmount")
    protected PriceVatType creditAmount;
    @XmlElement(name = "CreditPoints")
    protected int creditPoints;
    @XmlElement(name = "CancelItemList", required = true)
    protected CancelItemListType cancelItemList;

    /**
     * Gets the value of the cancellationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReference() {
        return cancellationReference;
    }

    /**
     * Sets the value of the cancellationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReference(String value) {
        this.cancellationReference = value;
    }

    public boolean isSetCancellationReference() {
        return (this.cancellationReference!= null);
    }

    /**
     * Gets the value of the mandatoryRecalculationWarning property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMandatoryRecalculationWarning() {
        return mandatoryRecalculationWarning;
    }

    /**
     * Sets the value of the mandatoryRecalculationWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMandatoryRecalculationWarning(EmptyType value) {
        this.mandatoryRecalculationWarning = value;
    }

    public boolean isSetMandatoryRecalculationWarning() {
        return (this.mandatoryRecalculationWarning!= null);
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setCreditAmount(PriceVatType value) {
        this.creditAmount = value;
    }

    public boolean isSetCreditAmount() {
        return (this.creditAmount!= null);
    }

    /**
     * Gets the value of the creditPoints property.
     * 
     */
    public int getCreditPoints() {
        return creditPoints;
    }

    /**
     * Sets the value of the creditPoints property.
     * 
     */
    public void setCreditPoints(int value) {
        this.creditPoints = value;
    }

    public boolean isSetCreditPoints() {
        return true;
    }

    /**
     * Gets the value of the cancelItemList property.
     * 
     * @return
     *     possible object is
     *     {@link CancelItemListType }
     *     
     */
    public CancelItemListType getCancelItemList() {
        return cancelItemList;
    }

    /**
     * Sets the value of the cancelItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelItemListType }
     *     
     */
    public void setCancelItemList(CancelItemListType value) {
        this.cancelItemList = value;
    }

    public boolean isSetCancelItemList() {
        return (this.cancelItemList!= null);
    }

}
