
package se.linkon.petra.order.orderstorage.validateforclose.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateOrderForCloseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateOrderForCloseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrderId" type="{http://petra.linkon.se/commonelements/data/v4_6}OrderIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateOrderForCloseRequestType", propOrder = {
    "salesOrderId"
})
public class ValidateOrderForCloseRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", required = true)
    protected String salesOrderId;

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

}
