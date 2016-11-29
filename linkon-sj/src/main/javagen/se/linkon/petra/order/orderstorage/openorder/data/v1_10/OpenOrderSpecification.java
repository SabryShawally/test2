
package se.linkon.petra.order.orderstorage.openorder.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenOrderSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element name="ValidateOrderAccess" type="{http://petra.linkon.se/order/orderstorage/openorder/data/v1_10}ValidateOrderAccessType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderSpecification", propOrder = {
    "salesOrderId",
    "validateOrderAccess"
})
public class OpenOrderSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "ValidateOrderAccess")
    protected ValidateOrderAccessType validateOrderAccess;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderId(String value) {
        this.salesOrderId = value;
    }

    public boolean isSetSalesOrderId() {
        return (this.salesOrderId!= null);
    }

    /**
     * Gets the value of the validateOrderAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateOrderAccessType }
     *     
     */
    public ValidateOrderAccessType getValidateOrderAccess() {
        return validateOrderAccess;
    }

    /**
     * Sets the value of the validateOrderAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateOrderAccessType }
     *     
     */
    public void setValidateOrderAccess(ValidateOrderAccessType value) {
        this.validateOrderAccess = value;
    }

    public boolean isSetValidateOrderAccess() {
        return (this.validateOrderAccess!= null);
    }

}
