
package se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderNotesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderNotesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SalesOrderId"/&gt;
 *         &lt;element name="OrderNote" type="{http://petra.linkon.se/order/ordercommon/response/ordernotes/data/v1_7}OrderNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderNotesType", propOrder = {
    "salesOrderId",
    "orderNote"
})
public class OrderNotesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesOrderId", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String salesOrderId;
    @XmlElement(name = "OrderNote")
    protected List<OrderNoteType> orderNote;

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
     * Gets the value of the orderNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderNoteType }
     * 
     * 
     */
    public List<OrderNoteType> getOrderNote() {
        if (orderNote == null) {
            orderNote = new ArrayList<OrderNoteType>();
        }
        return this.orderNote;
    }

    public boolean isSetOrderNote() {
        return ((this.orderNote!= null)&&(!this.orderNote.isEmpty()));
    }

    public void unsetOrderNote() {
        this.orderNote = null;
    }

}
